/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-13")
public class TrustedInfo implements org.apache.thrift.TBase<TrustedInfo, TrustedInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TrustedInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TrustedInfo");

  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIMES_WRITER_FIELD_DESC = new org.apache.thrift.protocol.TField("timesWriter", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TIMES_TRUSTED_FIELD_DESC = new org.apache.thrift.protocol.TField("timesTrusted", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField FEE_COLLECTED_FIELD_DESC = new org.apache.thrift.protocol.TField("feeCollected", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TrustedInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TrustedInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer address; // required
  public int timesWriter; // required
  public int timesTrusted; // required
  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount feeCollected; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADDRESS((short)1, "address"),
    TIMES_WRITER((short)2, "timesWriter"),
    TIMES_TRUSTED((short)3, "timesTrusted"),
    FEE_COLLECTED((short)4, "feeCollected");

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
        case 1: // ADDRESS
          return ADDRESS;
        case 2: // TIMES_WRITER
          return TIMES_WRITER;
        case 3: // TIMES_TRUSTED
          return TIMES_TRUSTED;
        case 4: // FEE_COLLECTED
          return FEE_COLLECTED;
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
  private static final int __TIMESWRITER_ISSET_ID = 0;
  private static final int __TIMESTRUSTED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.TIMES_WRITER, new org.apache.thrift.meta_data.FieldMetaData("timesWriter", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIMES_TRUSTED, new org.apache.thrift.meta_data.FieldMetaData("timesTrusted", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FEE_COLLECTED, new org.apache.thrift.meta_data.FieldMetaData("feeCollected", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Amount.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TrustedInfo.class, metaDataMap);
  }

  public TrustedInfo() {
  }

  public TrustedInfo(
    java.nio.ByteBuffer address,
    int timesWriter,
    int timesTrusted,
    com.credits.general.thrift.generated.Amount feeCollected)
  {
    this();
    this.address = org.apache.thrift.TBaseHelper.copyBinary(address);
    this.timesWriter = timesWriter;
    setTimesWriterIsSet(true);
    this.timesTrusted = timesTrusted;
    setTimesTrustedIsSet(true);
    this.feeCollected = feeCollected;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TrustedInfo(TrustedInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAddress()) {
      this.address = org.apache.thrift.TBaseHelper.copyBinary(other.address);
    }
    this.timesWriter = other.timesWriter;
    this.timesTrusted = other.timesTrusted;
    if (other.isSetFeeCollected()) {
      this.feeCollected = new com.credits.general.thrift.generated.Amount(other.feeCollected);
    }
  }

  public TrustedInfo deepCopy() {
    return new TrustedInfo(this);
  }

  @Override
  public void clear() {
    this.address = null;
    setTimesWriterIsSet(false);
    this.timesWriter = 0;
    setTimesTrustedIsSet(false);
    this.timesTrusted = 0;
    this.feeCollected = null;
  }

  public byte[] getAddress() {
    setAddress(org.apache.thrift.TBaseHelper.rightSize(address));
    return address == null ? null : address.array();
  }

  public java.nio.ByteBuffer bufferForAddress() {
    return org.apache.thrift.TBaseHelper.copyBinary(address);
  }

  public TrustedInfo setAddress(byte[] address) {
    this.address = address == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(address.clone());
    return this;
  }

  public TrustedInfo setAddress(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer address) {
    this.address = org.apache.thrift.TBaseHelper.copyBinary(address);
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public int getTimesWriter() {
    return this.timesWriter;
  }

  public TrustedInfo setTimesWriter(int timesWriter) {
    this.timesWriter = timesWriter;
    setTimesWriterIsSet(true);
    return this;
  }

  public void unsetTimesWriter() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMESWRITER_ISSET_ID);
  }

  /** Returns true if field timesWriter is set (has been assigned a value) and false otherwise */
  public boolean isSetTimesWriter() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMESWRITER_ISSET_ID);
  }

  public void setTimesWriterIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMESWRITER_ISSET_ID, value);
  }

  public int getTimesTrusted() {
    return this.timesTrusted;
  }

  public TrustedInfo setTimesTrusted(int timesTrusted) {
    this.timesTrusted = timesTrusted;
    setTimesTrustedIsSet(true);
    return this;
  }

  public void unsetTimesTrusted() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMESTRUSTED_ISSET_ID);
  }

  /** Returns true if field timesTrusted is set (has been assigned a value) and false otherwise */
  public boolean isSetTimesTrusted() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMESTRUSTED_ISSET_ID);
  }

  public void setTimesTrustedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMESTRUSTED_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.Amount getFeeCollected() {
    return this.feeCollected;
  }

  public TrustedInfo setFeeCollected(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount feeCollected) {
    this.feeCollected = feeCollected;
    return this;
  }

  public void unsetFeeCollected() {
    this.feeCollected = null;
  }

  /** Returns true if field feeCollected is set (has been assigned a value) and false otherwise */
  public boolean isSetFeeCollected() {
    return this.feeCollected != null;
  }

  public void setFeeCollectedIsSet(boolean value) {
    if (!value) {
      this.feeCollected = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        if (value instanceof byte[]) {
          setAddress((byte[])value);
        } else {
          setAddress((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TIMES_WRITER:
      if (value == null) {
        unsetTimesWriter();
      } else {
        setTimesWriter((java.lang.Integer)value);
      }
      break;

    case TIMES_TRUSTED:
      if (value == null) {
        unsetTimesTrusted();
      } else {
        setTimesTrusted((java.lang.Integer)value);
      }
      break;

    case FEE_COLLECTED:
      if (value == null) {
        unsetFeeCollected();
      } else {
        setFeeCollected((com.credits.general.thrift.generated.Amount)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ADDRESS:
      return getAddress();

    case TIMES_WRITER:
      return getTimesWriter();

    case TIMES_TRUSTED:
      return getTimesTrusted();

    case FEE_COLLECTED:
      return getFeeCollected();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ADDRESS:
      return isSetAddress();
    case TIMES_WRITER:
      return isSetTimesWriter();
    case TIMES_TRUSTED:
      return isSetTimesTrusted();
    case FEE_COLLECTED:
      return isSetFeeCollected();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TrustedInfo)
      return this.equals((TrustedInfo)that);
    return false;
  }

  public boolean equals(TrustedInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_timesWriter = true;
    boolean that_present_timesWriter = true;
    if (this_present_timesWriter || that_present_timesWriter) {
      if (!(this_present_timesWriter && that_present_timesWriter))
        return false;
      if (this.timesWriter != that.timesWriter)
        return false;
    }

    boolean this_present_timesTrusted = true;
    boolean that_present_timesTrusted = true;
    if (this_present_timesTrusted || that_present_timesTrusted) {
      if (!(this_present_timesTrusted && that_present_timesTrusted))
        return false;
      if (this.timesTrusted != that.timesTrusted)
        return false;
    }

    boolean this_present_feeCollected = true && this.isSetFeeCollected();
    boolean that_present_feeCollected = true && that.isSetFeeCollected();
    if (this_present_feeCollected || that_present_feeCollected) {
      if (!(this_present_feeCollected && that_present_feeCollected))
        return false;
      if (!this.feeCollected.equals(that.feeCollected))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAddress()) ? 131071 : 524287);
    if (isSetAddress())
      hashCode = hashCode * 8191 + address.hashCode();

    hashCode = hashCode * 8191 + timesWriter;

    hashCode = hashCode * 8191 + timesTrusted;

    hashCode = hashCode * 8191 + ((isSetFeeCollected()) ? 131071 : 524287);
    if (isSetFeeCollected())
      hashCode = hashCode * 8191 + feeCollected.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TrustedInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimesWriter()).compareTo(other.isSetTimesWriter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimesWriter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timesWriter, other.timesWriter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimesTrusted()).compareTo(other.isSetTimesTrusted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimesTrusted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timesTrusted, other.timesTrusted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFeeCollected()).compareTo(other.isSetFeeCollected());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFeeCollected()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.feeCollected, other.feeCollected);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TrustedInfo(");
    boolean first = true;

    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.address, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timesWriter:");
    sb.append(this.timesWriter);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timesTrusted:");
    sb.append(this.timesTrusted);
    first = false;
    if (!first) sb.append(", ");
    sb.append("feeCollected:");
    if (this.feeCollected == null) {
      sb.append("null");
    } else {
      sb.append(this.feeCollected);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (feeCollected != null) {
      feeCollected.validate();
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

  private static class TrustedInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TrustedInfoStandardScheme getScheme() {
      return new TrustedInfoStandardScheme();
    }
  }

  private static class TrustedInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TrustedInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TrustedInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.address = iprot.readBinary();
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIMES_WRITER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timesWriter = iprot.readI32();
              struct.setTimesWriterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMES_TRUSTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timesTrusted = iprot.readI32();
              struct.setTimesTrustedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FEE_COLLECTED
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.feeCollected = new com.credits.general.thrift.generated.Amount();
              struct.feeCollected.read(iprot);
              struct.setFeeCollectedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TrustedInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        oprot.writeBinary(struct.address);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMES_WRITER_FIELD_DESC);
      oprot.writeI32(struct.timesWriter);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIMES_TRUSTED_FIELD_DESC);
      oprot.writeI32(struct.timesTrusted);
      oprot.writeFieldEnd();
      if (struct.feeCollected != null) {
        oprot.writeFieldBegin(FEE_COLLECTED_FIELD_DESC);
        struct.feeCollected.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TrustedInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TrustedInfoTupleScheme getScheme() {
      return new TrustedInfoTupleScheme();
    }
  }

  private static class TrustedInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TrustedInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TrustedInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAddress()) {
        optionals.set(0);
      }
      if (struct.isSetTimesWriter()) {
        optionals.set(1);
      }
      if (struct.isSetTimesTrusted()) {
        optionals.set(2);
      }
      if (struct.isSetFeeCollected()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAddress()) {
        oprot.writeBinary(struct.address);
      }
      if (struct.isSetTimesWriter()) {
        oprot.writeI32(struct.timesWriter);
      }
      if (struct.isSetTimesTrusted()) {
        oprot.writeI32(struct.timesTrusted);
      }
      if (struct.isSetFeeCollected()) {
        struct.feeCollected.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TrustedInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.address = iprot.readBinary();
        struct.setAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timesWriter = iprot.readI32();
        struct.setTimesWriterIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timesTrusted = iprot.readI32();
        struct.setTimesTrustedIsSet(true);
      }
      if (incoming.get(3)) {
        struct.feeCollected = new com.credits.general.thrift.generated.Amount();
        struct.feeCollected.read(iprot);
        struct.setFeeCollectedIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

