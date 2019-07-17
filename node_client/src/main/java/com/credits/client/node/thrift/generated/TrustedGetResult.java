/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-16")
public class TrustedGetResult implements org.apache.thrift.TBase<TrustedGetResult, TrustedGetResult._Fields>, java.io.Serializable, Cloneable, Comparable<TrustedGetResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TrustedGetResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("pages", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField WRITERS_FIELD_DESC = new org.apache.thrift.protocol.TField("writers", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TrustedGetResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TrustedGetResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status; // required
  public int pages; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TrustedInfo> writers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    PAGES((short)2, "pages"),
    WRITERS((short)3, "writers");

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
        case 2: // PAGES
          return PAGES;
        case 3: // WRITERS
          return WRITERS;
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
  private static final int __PAGES_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.PAGES, new org.apache.thrift.meta_data.FieldMetaData("pages", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WRITERS, new org.apache.thrift.meta_data.FieldMetaData("writers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TrustedInfo.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TrustedGetResult.class, metaDataMap);
  }

  public TrustedGetResult() {
  }

  public TrustedGetResult(
    com.credits.general.thrift.generated.APIResponse status,
    int pages,
    java.util.List<TrustedInfo> writers)
  {
    this();
    this.status = status;
    this.pages = pages;
    setPagesIsSet(true);
    this.writers = writers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TrustedGetResult(TrustedGetResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    this.pages = other.pages;
    if (other.isSetWriters()) {
      java.util.List<TrustedInfo> __this__writers = new java.util.ArrayList<TrustedInfo>(other.writers.size());
      for (TrustedInfo other_element : other.writers) {
        __this__writers.add(new TrustedInfo(other_element));
      }
      this.writers = __this__writers;
    }
  }

  public TrustedGetResult deepCopy() {
    return new TrustedGetResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setPagesIsSet(false);
    this.pages = 0;
    this.writers = null;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public TrustedGetResult setStatus(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status) {
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

  public int getPages() {
    return this.pages;
  }

  public TrustedGetResult setPages(int pages) {
    this.pages = pages;
    setPagesIsSet(true);
    return this;
  }

  public void unsetPages() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGES_ISSET_ID);
  }

  /** Returns true if field pages is set (has been assigned a value) and false otherwise */
  public boolean isSetPages() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGES_ISSET_ID);
  }

  public void setPagesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGES_ISSET_ID, value);
  }

  public int getWritersSize() {
    return (this.writers == null) ? 0 : this.writers.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TrustedInfo> getWritersIterator() {
    return (this.writers == null) ? null : this.writers.iterator();
  }

  public void addToWriters(TrustedInfo elem) {
    if (this.writers == null) {
      this.writers = new java.util.ArrayList<TrustedInfo>();
    }
    this.writers.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TrustedInfo> getWriters() {
    return this.writers;
  }

  public TrustedGetResult setWriters(@org.apache.thrift.annotation.Nullable java.util.List<TrustedInfo> writers) {
    this.writers = writers;
    return this;
  }

  public void unsetWriters() {
    this.writers = null;
  }

  /** Returns true if field writers is set (has been assigned a value) and false otherwise */
  public boolean isSetWriters() {
    return this.writers != null;
  }

  public void setWritersIsSet(boolean value) {
    if (!value) {
      this.writers = null;
    }
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

    case PAGES:
      if (value == null) {
        unsetPages();
      } else {
        setPages((java.lang.Integer)value);
      }
      break;

    case WRITERS:
      if (value == null) {
        unsetWriters();
      } else {
        setWriters((java.util.List<TrustedInfo>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case PAGES:
      return getPages();

    case WRITERS:
      return getWriters();

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
    case PAGES:
      return isSetPages();
    case WRITERS:
      return isSetWriters();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TrustedGetResult)
      return this.equals((TrustedGetResult)that);
    return false;
  }

  public boolean equals(TrustedGetResult that) {
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

    boolean this_present_pages = true;
    boolean that_present_pages = true;
    if (this_present_pages || that_present_pages) {
      if (!(this_present_pages && that_present_pages))
        return false;
      if (this.pages != that.pages)
        return false;
    }

    boolean this_present_writers = true && this.isSetWriters();
    boolean that_present_writers = true && that.isSetWriters();
    if (this_present_writers || that_present_writers) {
      if (!(this_present_writers && that_present_writers))
        return false;
      if (!this.writers.equals(that.writers))
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

    hashCode = hashCode * 8191 + pages;

    hashCode = hashCode * 8191 + ((isSetWriters()) ? 131071 : 524287);
    if (isSetWriters())
      hashCode = hashCode * 8191 + writers.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TrustedGetResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetPages()).compareTo(other.isSetPages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pages, other.pages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWriters()).compareTo(other.isSetWriters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writers, other.writers);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TrustedGetResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pages:");
    sb.append(this.pages);
    first = false;
    if (!first) sb.append(", ");
    sb.append("writers:");
    if (this.writers == null) {
      sb.append("null");
    } else {
      sb.append(this.writers);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TrustedGetResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TrustedGetResultStandardScheme getScheme() {
      return new TrustedGetResultStandardScheme();
    }
  }

  private static class TrustedGetResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TrustedGetResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TrustedGetResult struct) throws org.apache.thrift.TException {
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
          case 2: // PAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pages = iprot.readI32();
              struct.setPagesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WRITERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list214 = iprot.readListBegin();
                struct.writers = new java.util.ArrayList<TrustedInfo>(_list214.size);
                @org.apache.thrift.annotation.Nullable TrustedInfo _elem215;
                for (int _i216 = 0; _i216 < _list214.size; ++_i216)
                {
                  _elem215 = new TrustedInfo();
                  _elem215.read(iprot);
                  struct.writers.add(_elem215);
                }
                iprot.readListEnd();
              }
              struct.setWritersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TrustedGetResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PAGES_FIELD_DESC);
      oprot.writeI32(struct.pages);
      oprot.writeFieldEnd();
      if (struct.writers != null) {
        oprot.writeFieldBegin(WRITERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.writers.size()));
          for (TrustedInfo _iter217 : struct.writers)
          {
            _iter217.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TrustedGetResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TrustedGetResultTupleScheme getScheme() {
      return new TrustedGetResultTupleScheme();
    }
  }

  private static class TrustedGetResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TrustedGetResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TrustedGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetPages()) {
        optionals.set(1);
      }
      if (struct.isSetWriters()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetPages()) {
        oprot.writeI32(struct.pages);
      }
      if (struct.isSetWriters()) {
        {
          oprot.writeI32(struct.writers.size());
          for (TrustedInfo _iter218 : struct.writers)
          {
            _iter218.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TrustedGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.pages = iprot.readI32();
        struct.setPagesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list219 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.writers = new java.util.ArrayList<TrustedInfo>(_list219.size);
          @org.apache.thrift.annotation.Nullable TrustedInfo _elem220;
          for (int _i221 = 0; _i221 < _list219.size; ++_i221)
          {
            _elem220 = new TrustedInfo();
            _elem220.read(iprot);
            struct.writers.add(_elem220);
          }
        }
        struct.setWritersIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

