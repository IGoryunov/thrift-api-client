/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-02-12")
public class TokenDeployTransInfo implements org.apache.thrift.TBase<TokenDeployTransInfo, TokenDeployTransInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TokenDeployTransInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TokenDeployTransInfo");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STANDART_FIELD_DESC = new org.apache.thrift.protocol.TField("standart", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STATE_TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("stateTransaction", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TokenDeployTransInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TokenDeployTransInfoTupleSchemeFactory();

  public java.lang.String name; // required
  public java.lang.String code; // required
  public TokenStandart standart; // required
  /**
   * 
   * @see SmartOperationState
   */
  public SmartOperationState state; // required
  public TransactionId stateTransaction; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    CODE((short)2, "code"),
    STANDART((short)3, "standart"),
    /**
     * 
     * @see SmartOperationState
     */
    STATE((short)4, "state"),
    STATE_TRANSACTION((short)5, "stateTransaction");

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
        case 1: // NAME
          return NAME;
        case 2: // CODE
          return CODE;
        case 3: // STANDART
          return STANDART;
        case 4: // STATE
          return STATE;
        case 5: // STATE_TRANSACTION
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
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TokenCode")));
    tmpMap.put(_Fields.STANDART, new org.apache.thrift.meta_data.FieldMetaData("standart", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "TokenStandart")));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SmartOperationState.class)));
    tmpMap.put(_Fields.STATE_TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("stateTransaction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TokenDeployTransInfo.class, metaDataMap);
  }

  public TokenDeployTransInfo() {
  }

  public TokenDeployTransInfo(
    java.lang.String name,
    java.lang.String code,
    TokenStandart standart,
    SmartOperationState state)
  {
    this();
    this.name = name;
    this.code = code;
    this.standart = standart;
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TokenDeployTransInfo(TokenDeployTransInfo other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetStandart()) {
      this.standart = other.standart;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetStateTransaction()) {
      this.stateTransaction = new TransactionId(other.stateTransaction);
    }
  }

  public TokenDeployTransInfo deepCopy() {
    return new TokenDeployTransInfo(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.code = null;
    this.standart = null;
    this.state = null;
    this.stateTransaction = null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public TokenDeployTransInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public TokenDeployTransInfo setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public TokenStandart getStandart() {
    return this.standart;
  }

  public TokenDeployTransInfo setStandart(TokenStandart standart) {
    this.standart = standart;
    return this;
  }

  public void unsetStandart() {
    this.standart = null;
  }

  /** Returns true if field standart is set (has been assigned a value) and false otherwise */
  public boolean isSetStandart() {
    return this.standart != null;
  }

  public void setStandartIsSet(boolean value) {
    if (!value) {
      this.standart = null;
    }
  }

  /**
   * 
   * @see SmartOperationState
   */
  public SmartOperationState getState() {
    return this.state;
  }

  /**
   * 
   * @see SmartOperationState
   */
  public TokenDeployTransInfo setState(SmartOperationState state) {
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

  public TransactionId getStateTransaction() {
    return this.stateTransaction;
  }

  public TokenDeployTransInfo setStateTransaction(TransactionId stateTransaction) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((java.lang.String)value);
      }
      break;

    case STANDART:
      if (value == null) {
        unsetStandart();
      } else {
        setStandart((TokenStandart)value);
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

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case CODE:
      return getCode();

    case STANDART:
      return getStandart();

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
    case NAME:
      return isSetName();
    case CODE:
      return isSetCode();
    case STANDART:
      return isSetStandart();
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
    if (that instanceof TokenDeployTransInfo)
      return this.equals((TokenDeployTransInfo)that);
    return false;
  }

  public boolean equals(TokenDeployTransInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_standart = true && this.isSetStandart();
    boolean that_present_standart = true && that.isSetStandart();
    if (this_present_standart || that_present_standart) {
      if (!(this_present_standart && that_present_standart))
        return false;
      if (!this.standart.equals(that.standart))
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

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
    if (isSetCode())
      hashCode = hashCode * 8191 + code.hashCode();

    hashCode = hashCode * 8191 + ((isSetStandart()) ? 131071 : 524287);
    if (isSetStandart())
      hashCode = hashCode * 8191 + standart.getValue();

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.getValue();

    hashCode = hashCode * 8191 + ((isSetStateTransaction()) ? 131071 : 524287);
    if (isSetStateTransaction())
      hashCode = hashCode * 8191 + stateTransaction.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TokenDeployTransInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.valueOf(isSetStandart()).compareTo(other.isSetStandart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStandart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.standart, other.standart);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenDeployTransInfo(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("standart:");
    if (this.standart == null) {
      sb.append("null");
    } else {
      sb.append(this.standart);
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

  private static class TokenDeployTransInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenDeployTransInfoStandardScheme getScheme() {
      return new TokenDeployTransInfoStandardScheme();
    }
  }

  private static class TokenDeployTransInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TokenDeployTransInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TokenDeployTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STANDART
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.standart = com.credits.client.node.thrift.generated.TokenStandart.findByValue(iprot.readI32());
              struct.setStandartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATE_TRANSACTION
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TokenDeployTransInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.standart != null) {
        oprot.writeFieldBegin(STANDART_FIELD_DESC);
        oprot.writeI32(struct.standart.getValue());
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

  private static class TokenDeployTransInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenDeployTransInfoTupleScheme getScheme() {
      return new TokenDeployTransInfoTupleScheme();
    }
  }

  private static class TokenDeployTransInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TokenDeployTransInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TokenDeployTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetStandart()) {
        optionals.set(2);
      }
      if (struct.isSetState()) {
        optionals.set(3);
      }
      if (struct.isSetStateTransaction()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetStandart()) {
        oprot.writeI32(struct.standart.getValue());
      }
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
      if (struct.isSetStateTransaction()) {
        struct.stateTransaction.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TokenDeployTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.standart = com.credits.client.node.thrift.generated.TokenStandart.findByValue(iprot.readI32());
        struct.setStandartIsSet(true);
      }
      if (incoming.get(3)) {
        struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
      if (incoming.get(4)) {
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

