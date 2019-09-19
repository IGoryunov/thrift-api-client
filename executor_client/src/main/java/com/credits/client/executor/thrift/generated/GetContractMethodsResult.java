/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-19")
public class GetContractMethodsResult implements org.apache.thrift.TBase<GetContractMethodsResult, GetContractMethodsResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetContractMethodsResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetContractMethodsResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METHODS_FIELD_DESC = new org.apache.thrift.protocol.TField("methods", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TOKEN_STANDARD_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenStandard", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetContractMethodsResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetContractMethodsResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.MethodDescription> methods; // required
  public long tokenStandard; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    METHODS((short)2, "methods"),
    TOKEN_STANDARD((short)3, "tokenStandard");

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
        case 2: // METHODS
          return METHODS;
        case 3: // TOKEN_STANDARD
          return TOKEN_STANDARD;
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
  private static final int __TOKENSTANDARD_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.METHODS, new org.apache.thrift.meta_data.FieldMetaData("methods", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.MethodDescription.class))));
    tmpMap.put(_Fields.TOKEN_STANDARD, new org.apache.thrift.meta_data.FieldMetaData("tokenStandard", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetContractMethodsResult.class, metaDataMap);
  }

  public GetContractMethodsResult() {
  }

  public GetContractMethodsResult(
    com.credits.general.thrift.generated.APIResponse status,
    java.util.List<com.credits.general.thrift.generated.MethodDescription> methods,
    long tokenStandard)
  {
    this();
    this.status = status;
    this.methods = methods;
    this.tokenStandard = tokenStandard;
    setTokenStandardIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetContractMethodsResult(GetContractMethodsResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    if (other.isSetMethods()) {
      java.util.List<com.credits.general.thrift.generated.MethodDescription> __this__methods = new java.util.ArrayList<com.credits.general.thrift.generated.MethodDescription>(other.methods.size());
      for (com.credits.general.thrift.generated.MethodDescription other_element : other.methods) {
        __this__methods.add(new com.credits.general.thrift.generated.MethodDescription(other_element));
      }
      this.methods = __this__methods;
    }
    this.tokenStandard = other.tokenStandard;
  }

  public GetContractMethodsResult deepCopy() {
    return new GetContractMethodsResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.methods = null;
    setTokenStandardIsSet(false);
    this.tokenStandard = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public GetContractMethodsResult setStatus(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status) {
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

  public GetContractMethodsResult setMethods(@org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.MethodDescription> methods) {
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

  public long getTokenStandard() {
    return this.tokenStandard;
  }

  public GetContractMethodsResult setTokenStandard(long tokenStandard) {
    this.tokenStandard = tokenStandard;
    setTokenStandardIsSet(true);
    return this;
  }

  public void unsetTokenStandard() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOKENSTANDARD_ISSET_ID);
  }

  /** Returns true if field tokenStandard is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenStandard() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOKENSTANDARD_ISSET_ID);
  }

  public void setTokenStandardIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOKENSTANDARD_ISSET_ID, value);
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

    case METHODS:
      if (value == null) {
        unsetMethods();
      } else {
        setMethods((java.util.List<com.credits.general.thrift.generated.MethodDescription>)value);
      }
      break;

    case TOKEN_STANDARD:
      if (value == null) {
        unsetTokenStandard();
      } else {
        setTokenStandard((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case METHODS:
      return getMethods();

    case TOKEN_STANDARD:
      return getTokenStandard();

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
    case METHODS:
      return isSetMethods();
    case TOKEN_STANDARD:
      return isSetTokenStandard();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetContractMethodsResult)
      return this.equals((GetContractMethodsResult)that);
    return false;
  }

  public boolean equals(GetContractMethodsResult that) {
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

    boolean this_present_methods = true && this.isSetMethods();
    boolean that_present_methods = true && that.isSetMethods();
    if (this_present_methods || that_present_methods) {
      if (!(this_present_methods && that_present_methods))
        return false;
      if (!this.methods.equals(that.methods))
        return false;
    }

    boolean this_present_tokenStandard = true;
    boolean that_present_tokenStandard = true;
    if (this_present_tokenStandard || that_present_tokenStandard) {
      if (!(this_present_tokenStandard && that_present_tokenStandard))
        return false;
      if (this.tokenStandard != that.tokenStandard)
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

    hashCode = hashCode * 8191 + ((isSetMethods()) ? 131071 : 524287);
    if (isSetMethods())
      hashCode = hashCode * 8191 + methods.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tokenStandard);

    return hashCode;
  }

  @Override
  public int compareTo(GetContractMethodsResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetTokenStandard()).compareTo(other.isSetTokenStandard());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenStandard()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenStandard, other.tokenStandard);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetContractMethodsResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
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
    if (!first) sb.append(", ");
    sb.append("tokenStandard:");
    sb.append(this.tokenStandard);
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

  private static class GetContractMethodsResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetContractMethodsResultStandardScheme getScheme() {
      return new GetContractMethodsResultStandardScheme();
    }
  }

  private static class GetContractMethodsResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetContractMethodsResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetContractMethodsResult struct) throws org.apache.thrift.TException {
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
          case 2: // METHODS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.methods = new java.util.ArrayList<com.credits.general.thrift.generated.MethodDescription>(_list34.size);
                @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.MethodDescription _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = new com.credits.general.thrift.generated.MethodDescription();
                  _elem35.read(iprot);
                  struct.methods.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setMethodsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOKEN_STANDARD
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tokenStandard = iprot.readI64();
              struct.setTokenStandardIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetContractMethodsResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.methods != null) {
        oprot.writeFieldBegin(METHODS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.methods.size()));
          for (com.credits.general.thrift.generated.MethodDescription _iter37 : struct.methods)
          {
            _iter37.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOKEN_STANDARD_FIELD_DESC);
      oprot.writeI64(struct.tokenStandard);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetContractMethodsResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetContractMethodsResultTupleScheme getScheme() {
      return new GetContractMethodsResultTupleScheme();
    }
  }

  private static class GetContractMethodsResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetContractMethodsResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetContractMethodsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetMethods()) {
        optionals.set(1);
      }
      if (struct.isSetTokenStandard()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetMethods()) {
        {
          oprot.writeI32(struct.methods.size());
          for (com.credits.general.thrift.generated.MethodDescription _iter38 : struct.methods)
          {
            _iter38.write(oprot);
          }
        }
      }
      if (struct.isSetTokenStandard()) {
        oprot.writeI64(struct.tokenStandard);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetContractMethodsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.methods = new java.util.ArrayList<com.credits.general.thrift.generated.MethodDescription>(_list39.size);
          @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.MethodDescription _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = new com.credits.general.thrift.generated.MethodDescription();
            _elem40.read(iprot);
            struct.methods.add(_elem40);
          }
        }
        struct.setMethodsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tokenStandard = iprot.readI64();
        struct.setTokenStandardIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

