/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-19")
public class SmartContractInvocation implements org.apache.thrift.TBase<SmartContractInvocation, SmartContractInvocation._Fields>, java.io.Serializable, Cloneable, Comparable<SmartContractInvocation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartContractInvocation");

  private static final org.apache.thrift.protocol.TField METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("method", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField USED_CONTRACTS_FIELD_DESC = new org.apache.thrift.protocol.TField("usedContracts", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField FORGET_NEW_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("forgetNewState", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField SMART_CONTRACT_DEPLOY_FIELD_DESC = new org.apache.thrift.protocol.TField("smartContractDeploy", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I16, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SmartContractInvocationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SmartContractInvocationTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String method; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.Variant> params; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.nio.ByteBuffer> usedContracts; // required
  public boolean forgetNewState; // required
  public @org.apache.thrift.annotation.Nullable SmartContractDeploy smartContractDeploy; // optional
  public short version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METHOD((short)1, "method"),
    PARAMS((short)2, "params"),
    USED_CONTRACTS((short)3, "usedContracts"),
    FORGET_NEW_STATE((short)4, "forgetNewState"),
    SMART_CONTRACT_DEPLOY((short)5, "smartContractDeploy"),
    VERSION((short)6, "version");

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
        case 1: // METHOD
          return METHOD;
        case 2: // PARAMS
          return PARAMS;
        case 3: // USED_CONTRACTS
          return USED_CONTRACTS;
        case 4: // FORGET_NEW_STATE
          return FORGET_NEW_STATE;
        case 5: // SMART_CONTRACT_DEPLOY
          return SMART_CONTRACT_DEPLOY;
        case 6: // VERSION
          return VERSION;
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
  private static final int __FORGETNEWSTATE_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SMART_CONTRACT_DEPLOY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METHOD, new org.apache.thrift.meta_data.FieldMetaData("method", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Variant.class))));
    tmpMap.put(_Fields.USED_CONTRACTS, new org.apache.thrift.meta_data.FieldMetaData("usedContracts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "Address"))));
    tmpMap.put(_Fields.FORGET_NEW_STATE, new org.apache.thrift.meta_data.FieldMetaData("forgetNewState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SMART_CONTRACT_DEPLOY, new org.apache.thrift.meta_data.FieldMetaData("smartContractDeploy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SmartContractDeploy.class)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartContractInvocation.class, metaDataMap);
  }

  public SmartContractInvocation() {
    this.version = (short)1;

  }

  public SmartContractInvocation(
    java.lang.String method,
    java.util.List<com.credits.general.thrift.generated.Variant> params,
    java.util.List<java.nio.ByteBuffer> usedContracts,
    boolean forgetNewState,
    short version)
  {
    this();
    this.method = method;
    this.params = params;
    this.usedContracts = usedContracts;
    this.forgetNewState = forgetNewState;
    setForgetNewStateIsSet(true);
    this.version = version;
    setVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SmartContractInvocation(SmartContractInvocation other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMethod()) {
      this.method = other.method;
    }
    if (other.isSetParams()) {
      java.util.List<com.credits.general.thrift.generated.Variant> __this__params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>(other.params.size());
      for (com.credits.general.thrift.generated.Variant other_element : other.params) {
        __this__params.add(new com.credits.general.thrift.generated.Variant(other_element));
      }
      this.params = __this__params;
    }
    if (other.isSetUsedContracts()) {
      java.util.List<java.nio.ByteBuffer> __this__usedContracts = new java.util.ArrayList<java.nio.ByteBuffer>(other.usedContracts.size());
      for (java.nio.ByteBuffer other_element : other.usedContracts) {
        __this__usedContracts.add(org.apache.thrift.TBaseHelper.copyBinary(other_element));
      }
      this.usedContracts = __this__usedContracts;
    }
    this.forgetNewState = other.forgetNewState;
    if (other.isSetSmartContractDeploy()) {
      this.smartContractDeploy = new SmartContractDeploy(other.smartContractDeploy);
    }
    this.version = other.version;
  }

  public SmartContractInvocation deepCopy() {
    return new SmartContractInvocation(this);
  }

  @Override
  public void clear() {
    this.method = null;
    this.params = null;
    this.usedContracts = null;
    setForgetNewStateIsSet(false);
    this.forgetNewState = false;
    this.smartContractDeploy = null;
    this.version = (short)1;

  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMethod() {
    return this.method;
  }

  public SmartContractInvocation setMethod(@org.apache.thrift.annotation.Nullable java.lang.String method) {
    this.method = method;
    return this;
  }

  public void unsetMethod() {
    this.method = null;
  }

  /** Returns true if field method is set (has been assigned a value) and false otherwise */
  public boolean isSetMethod() {
    return this.method != null;
  }

  public void setMethodIsSet(boolean value) {
    if (!value) {
      this.method = null;
    }
  }

  public int getParamsSize() {
    return (this.params == null) ? 0 : this.params.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<com.credits.general.thrift.generated.Variant> getParamsIterator() {
    return (this.params == null) ? null : this.params.iterator();
  }

  public void addToParams(com.credits.general.thrift.generated.Variant elem) {
    if (this.params == null) {
      this.params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>();
    }
    this.params.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<com.credits.general.thrift.generated.Variant> getParams() {
    return this.params;
  }

  public SmartContractInvocation setParams(@org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.Variant> params) {
    this.params = params;
    return this;
  }

  public void unsetParams() {
    this.params = null;
  }

  /** Returns true if field params is set (has been assigned a value) and false otherwise */
  public boolean isSetParams() {
    return this.params != null;
  }

  public void setParamsIsSet(boolean value) {
    if (!value) {
      this.params = null;
    }
  }

  public int getUsedContractsSize() {
    return (this.usedContracts == null) ? 0 : this.usedContracts.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.nio.ByteBuffer> getUsedContractsIterator() {
    return (this.usedContracts == null) ? null : this.usedContracts.iterator();
  }

  public void addToUsedContracts(java.nio.ByteBuffer elem) {
    if (this.usedContracts == null) {
      this.usedContracts = new java.util.ArrayList<java.nio.ByteBuffer>();
    }
    this.usedContracts.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.nio.ByteBuffer> getUsedContracts() {
    return this.usedContracts;
  }

  public SmartContractInvocation setUsedContracts(@org.apache.thrift.annotation.Nullable java.util.List<java.nio.ByteBuffer> usedContracts) {
    this.usedContracts = usedContracts;
    return this;
  }

  public void unsetUsedContracts() {
    this.usedContracts = null;
  }

  /** Returns true if field usedContracts is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedContracts() {
    return this.usedContracts != null;
  }

  public void setUsedContractsIsSet(boolean value) {
    if (!value) {
      this.usedContracts = null;
    }
  }

  public boolean isForgetNewState() {
    return this.forgetNewState;
  }

  public SmartContractInvocation setForgetNewState(boolean forgetNewState) {
    this.forgetNewState = forgetNewState;
    setForgetNewStateIsSet(true);
    return this;
  }

  public void unsetForgetNewState() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FORGETNEWSTATE_ISSET_ID);
  }

  /** Returns true if field forgetNewState is set (has been assigned a value) and false otherwise */
  public boolean isSetForgetNewState() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FORGETNEWSTATE_ISSET_ID);
  }

  public void setForgetNewStateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FORGETNEWSTATE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public SmartContractDeploy getSmartContractDeploy() {
    return this.smartContractDeploy;
  }

  public SmartContractInvocation setSmartContractDeploy(@org.apache.thrift.annotation.Nullable SmartContractDeploy smartContractDeploy) {
    this.smartContractDeploy = smartContractDeploy;
    return this;
  }

  public void unsetSmartContractDeploy() {
    this.smartContractDeploy = null;
  }

  /** Returns true if field smartContractDeploy is set (has been assigned a value) and false otherwise */
  public boolean isSetSmartContractDeploy() {
    return this.smartContractDeploy != null;
  }

  public void setSmartContractDeployIsSet(boolean value) {
    if (!value) {
      this.smartContractDeploy = null;
    }
  }

  public short getVersion() {
    return this.version;
  }

  public SmartContractInvocation setVersion(short version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case METHOD:
      if (value == null) {
        unsetMethod();
      } else {
        setMethod((java.lang.String)value);
      }
      break;

    case PARAMS:
      if (value == null) {
        unsetParams();
      } else {
        setParams((java.util.List<com.credits.general.thrift.generated.Variant>)value);
      }
      break;

    case USED_CONTRACTS:
      if (value == null) {
        unsetUsedContracts();
      } else {
        setUsedContracts((java.util.List<java.nio.ByteBuffer>)value);
      }
      break;

    case FORGET_NEW_STATE:
      if (value == null) {
        unsetForgetNewState();
      } else {
        setForgetNewState((java.lang.Boolean)value);
      }
      break;

    case SMART_CONTRACT_DEPLOY:
      if (value == null) {
        unsetSmartContractDeploy();
      } else {
        setSmartContractDeploy((SmartContractDeploy)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.Short)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METHOD:
      return getMethod();

    case PARAMS:
      return getParams();

    case USED_CONTRACTS:
      return getUsedContracts();

    case FORGET_NEW_STATE:
      return isForgetNewState();

    case SMART_CONTRACT_DEPLOY:
      return getSmartContractDeploy();

    case VERSION:
      return getVersion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case METHOD:
      return isSetMethod();
    case PARAMS:
      return isSetParams();
    case USED_CONTRACTS:
      return isSetUsedContracts();
    case FORGET_NEW_STATE:
      return isSetForgetNewState();
    case SMART_CONTRACT_DEPLOY:
      return isSetSmartContractDeploy();
    case VERSION:
      return isSetVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SmartContractInvocation)
      return this.equals((SmartContractInvocation)that);
    return false;
  }

  public boolean equals(SmartContractInvocation that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_method = true && this.isSetMethod();
    boolean that_present_method = true && that.isSetMethod();
    if (this_present_method || that_present_method) {
      if (!(this_present_method && that_present_method))
        return false;
      if (!this.method.equals(that.method))
        return false;
    }

    boolean this_present_params = true && this.isSetParams();
    boolean that_present_params = true && that.isSetParams();
    if (this_present_params || that_present_params) {
      if (!(this_present_params && that_present_params))
        return false;
      if (!this.params.equals(that.params))
        return false;
    }

    boolean this_present_usedContracts = true && this.isSetUsedContracts();
    boolean that_present_usedContracts = true && that.isSetUsedContracts();
    if (this_present_usedContracts || that_present_usedContracts) {
      if (!(this_present_usedContracts && that_present_usedContracts))
        return false;
      if (!this.usedContracts.equals(that.usedContracts))
        return false;
    }

    boolean this_present_forgetNewState = true;
    boolean that_present_forgetNewState = true;
    if (this_present_forgetNewState || that_present_forgetNewState) {
      if (!(this_present_forgetNewState && that_present_forgetNewState))
        return false;
      if (this.forgetNewState != that.forgetNewState)
        return false;
    }

    boolean this_present_smartContractDeploy = true && this.isSetSmartContractDeploy();
    boolean that_present_smartContractDeploy = true && that.isSetSmartContractDeploy();
    if (this_present_smartContractDeploy || that_present_smartContractDeploy) {
      if (!(this_present_smartContractDeploy && that_present_smartContractDeploy))
        return false;
      if (!this.smartContractDeploy.equals(that.smartContractDeploy))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMethod()) ? 131071 : 524287);
    if (isSetMethod())
      hashCode = hashCode * 8191 + method.hashCode();

    hashCode = hashCode * 8191 + ((isSetParams()) ? 131071 : 524287);
    if (isSetParams())
      hashCode = hashCode * 8191 + params.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedContracts()) ? 131071 : 524287);
    if (isSetUsedContracts())
      hashCode = hashCode * 8191 + usedContracts.hashCode();

    hashCode = hashCode * 8191 + ((forgetNewState) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetSmartContractDeploy()) ? 131071 : 524287);
    if (isSetSmartContractDeploy())
      hashCode = hashCode * 8191 + smartContractDeploy.hashCode();

    hashCode = hashCode * 8191 + version;

    return hashCode;
  }

  @Override
  public int compareTo(SmartContractInvocation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMethod()).compareTo(other.isSetMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.method, other.method);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetParams()).compareTo(other.isSetParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedContracts()).compareTo(other.isSetUsedContracts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedContracts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usedContracts, other.usedContracts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetForgetNewState()).compareTo(other.isSetForgetNewState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForgetNewState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.forgetNewState, other.forgetNewState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSmartContractDeploy()).compareTo(other.isSetSmartContractDeploy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSmartContractDeploy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.smartContractDeploy, other.smartContractDeploy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartContractInvocation(");
    boolean first = true;

    sb.append("method:");
    if (this.method == null) {
      sb.append("null");
    } else {
      sb.append(this.method);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("params:");
    if (this.params == null) {
      sb.append("null");
    } else {
      sb.append(this.params);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("usedContracts:");
    if (this.usedContracts == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.usedContracts, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("forgetNewState:");
    sb.append(this.forgetNewState);
    first = false;
    if (isSetSmartContractDeploy()) {
      if (!first) sb.append(", ");
      sb.append("smartContractDeploy:");
      if (this.smartContractDeploy == null) {
        sb.append("null");
      } else {
        sb.append(this.smartContractDeploy);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (smartContractDeploy != null) {
      smartContractDeploy.validate();
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

  private static class SmartContractInvocationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractInvocationStandardScheme getScheme() {
      return new SmartContractInvocationStandardScheme();
    }
  }

  private static class SmartContractInvocationStandardScheme extends org.apache.thrift.scheme.StandardScheme<SmartContractInvocation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SmartContractInvocation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.method = iprot.readString();
              struct.setMethodIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>(_list8.size);
                @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new com.credits.general.thrift.generated.Variant();
                  _elem9.read(iprot);
                  struct.params.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USED_CONTRACTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.usedContracts = new java.util.ArrayList<java.nio.ByteBuffer>(_list11.size);
                @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readBinary();
                  struct.usedContracts.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setUsedContractsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FORGET_NEW_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.forgetNewState = iprot.readBool();
              struct.setForgetNewStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SMART_CONTRACT_DEPLOY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.smartContractDeploy = new SmartContractDeploy();
              struct.smartContractDeploy.read(iprot);
              struct.setSmartContractDeployIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.version = iprot.readI16();
              struct.setVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SmartContractInvocation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.method != null) {
        oprot.writeFieldBegin(METHOD_FIELD_DESC);
        oprot.writeString(struct.method);
        oprot.writeFieldEnd();
      }
      if (struct.params != null) {
        oprot.writeFieldBegin(PARAMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.params.size()));
          for (com.credits.general.thrift.generated.Variant _iter14 : struct.params)
          {
            _iter14.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.usedContracts != null) {
        oprot.writeFieldBegin(USED_CONTRACTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.usedContracts.size()));
          for (java.nio.ByteBuffer _iter15 : struct.usedContracts)
          {
            oprot.writeBinary(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FORGET_NEW_STATE_FIELD_DESC);
      oprot.writeBool(struct.forgetNewState);
      oprot.writeFieldEnd();
      if (struct.smartContractDeploy != null) {
        if (struct.isSetSmartContractDeploy()) {
          oprot.writeFieldBegin(SMART_CONTRACT_DEPLOY_FIELD_DESC);
          struct.smartContractDeploy.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI16(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SmartContractInvocationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractInvocationTupleScheme getScheme() {
      return new SmartContractInvocationTupleScheme();
    }
  }

  private static class SmartContractInvocationTupleScheme extends org.apache.thrift.scheme.TupleScheme<SmartContractInvocation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SmartContractInvocation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMethod()) {
        optionals.set(0);
      }
      if (struct.isSetParams()) {
        optionals.set(1);
      }
      if (struct.isSetUsedContracts()) {
        optionals.set(2);
      }
      if (struct.isSetForgetNewState()) {
        optionals.set(3);
      }
      if (struct.isSetSmartContractDeploy()) {
        optionals.set(4);
      }
      if (struct.isSetVersion()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetMethod()) {
        oprot.writeString(struct.method);
      }
      if (struct.isSetParams()) {
        {
          oprot.writeI32(struct.params.size());
          for (com.credits.general.thrift.generated.Variant _iter16 : struct.params)
          {
            _iter16.write(oprot);
          }
        }
      }
      if (struct.isSetUsedContracts()) {
        {
          oprot.writeI32(struct.usedContracts.size());
          for (java.nio.ByteBuffer _iter17 : struct.usedContracts)
          {
            oprot.writeBinary(_iter17);
          }
        }
      }
      if (struct.isSetForgetNewState()) {
        oprot.writeBool(struct.forgetNewState);
      }
      if (struct.isSetSmartContractDeploy()) {
        struct.smartContractDeploy.write(oprot);
      }
      if (struct.isSetVersion()) {
        oprot.writeI16(struct.version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SmartContractInvocation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.method = iprot.readString();
        struct.setMethodIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>(_list18.size);
          @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = new com.credits.general.thrift.generated.Variant();
            _elem19.read(iprot);
            struct.params.add(_elem19);
          }
        }
        struct.setParamsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.usedContracts = new java.util.ArrayList<java.nio.ByteBuffer>(_list21.size);
          @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readBinary();
            struct.usedContracts.add(_elem22);
          }
        }
        struct.setUsedContractsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.forgetNewState = iprot.readBool();
        struct.setForgetNewStateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.smartContractDeploy = new SmartContractDeploy();
        struct.smartContractDeploy.read(iprot);
        struct.setSmartContractDeployIsSet(true);
      }
      if (incoming.get(5)) {
        struct.version = iprot.readI16();
        struct.setVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

