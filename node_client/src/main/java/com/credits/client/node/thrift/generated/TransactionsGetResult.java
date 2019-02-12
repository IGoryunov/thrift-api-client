/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-02-12")
public class TransactionsGetResult implements org.apache.thrift.TBase<TransactionsGetResult, TransactionsGetResult._Fields>, java.io.Serializable, Cloneable, Comparable<TransactionsGetResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransactionsGetResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_TRXNS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("total_trxns_count", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TRANSACTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("transactions", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TransactionsGetResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TransactionsGetResultTupleSchemeFactory();

  public com.credits.general.thrift.generated.APIResponse status; // required
  public boolean result; // required
  public int total_trxns_count; // required
  public java.util.List<SealedTransaction> transactions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    RESULT((short)2, "result"),
    TOTAL_TRXNS_COUNT((short)3, "total_trxns_count"),
    TRANSACTIONS((short)4, "transactions");

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
        case 1: // STATUS
          return STATUS;
        case 2: // RESULT
          return RESULT;
        case 3: // TOTAL_TRXNS_COUNT
          return TOTAL_TRXNS_COUNT;
        case 4: // TRANSACTIONS
          return TRANSACTIONS;
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
  private static final int __RESULT_ISSET_ID = 0;
  private static final int __TOTAL_TRXNS_COUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TOTAL_TRXNS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("total_trxns_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TRANSACTIONS, new org.apache.thrift.meta_data.FieldMetaData("transactions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SealedTransaction.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransactionsGetResult.class, metaDataMap);
  }

  public TransactionsGetResult() {
  }

  public TransactionsGetResult(
    com.credits.general.thrift.generated.APIResponse status,
    boolean result,
    int total_trxns_count,
    java.util.List<SealedTransaction> transactions)
  {
    this();
    this.status = status;
    this.result = result;
    setResultIsSet(true);
    this.total_trxns_count = total_trxns_count;
    setTotal_trxns_countIsSet(true);
    this.transactions = transactions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransactionsGetResult(TransactionsGetResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    this.result = other.result;
    this.total_trxns_count = other.total_trxns_count;
    if (other.isSetTransactions()) {
      java.util.List<SealedTransaction> __this__transactions = new java.util.ArrayList<SealedTransaction>(other.transactions.size());
      for (SealedTransaction other_element : other.transactions) {
        __this__transactions.add(new SealedTransaction(other_element));
      }
      this.transactions = __this__transactions;
    }
  }

  public TransactionsGetResult deepCopy() {
    return new TransactionsGetResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setResultIsSet(false);
    this.result = false;
    setTotal_trxns_countIsSet(false);
    this.total_trxns_count = 0;
    this.transactions = null;
  }

  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public TransactionsGetResult setStatus(com.credits.general.thrift.generated.APIResponse status) {
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

  public boolean isResult() {
    return this.result;
  }

  public TransactionsGetResult setResult(boolean result) {
    this.result = result;
    setResultIsSet(true);
    return this;
  }

  public void unsetResult() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  public void setResultIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RESULT_ISSET_ID, value);
  }

  public int getTotal_trxns_count() {
    return this.total_trxns_count;
  }

  public TransactionsGetResult setTotal_trxns_count(int total_trxns_count) {
    this.total_trxns_count = total_trxns_count;
    setTotal_trxns_countIsSet(true);
    return this;
  }

  public void unsetTotal_trxns_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTAL_TRXNS_COUNT_ISSET_ID);
  }

  /** Returns true if field total_trxns_count is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal_trxns_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTAL_TRXNS_COUNT_ISSET_ID);
  }

  public void setTotal_trxns_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTAL_TRXNS_COUNT_ISSET_ID, value);
  }

  public int getTransactionsSize() {
    return (this.transactions == null) ? 0 : this.transactions.size();
  }

  public java.util.Iterator<SealedTransaction> getTransactionsIterator() {
    return (this.transactions == null) ? null : this.transactions.iterator();
  }

  public void addToTransactions(SealedTransaction elem) {
    if (this.transactions == null) {
      this.transactions = new java.util.ArrayList<SealedTransaction>();
    }
    this.transactions.add(elem);
  }

  public java.util.List<SealedTransaction> getTransactions() {
    return this.transactions;
  }

  public TransactionsGetResult setTransactions(java.util.List<SealedTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public void unsetTransactions() {
    this.transactions = null;
  }

  /** Returns true if field transactions is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactions() {
    return this.transactions != null;
  }

  public void setTransactionsIsSet(boolean value) {
    if (!value) {
      this.transactions = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.credits.general.thrift.generated.APIResponse)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((java.lang.Boolean)value);
      }
      break;

    case TOTAL_TRXNS_COUNT:
      if (value == null) {
        unsetTotal_trxns_count();
      } else {
        setTotal_trxns_count((java.lang.Integer)value);
      }
      break;

    case TRANSACTIONS:
      if (value == null) {
        unsetTransactions();
      } else {
        setTransactions((java.util.List<SealedTransaction>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case RESULT:
      return isResult();

    case TOTAL_TRXNS_COUNT:
      return getTotal_trxns_count();

    case TRANSACTIONS:
      return getTransactions();

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
    case RESULT:
      return isSetResult();
    case TOTAL_TRXNS_COUNT:
      return isSetTotal_trxns_count();
    case TRANSACTIONS:
      return isSetTransactions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TransactionsGetResult)
      return this.equals((TransactionsGetResult)that);
    return false;
  }

  public boolean equals(TransactionsGetResult that) {
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

    boolean this_present_result = true;
    boolean that_present_result = true;
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (this.result != that.result)
        return false;
    }

    boolean this_present_total_trxns_count = true;
    boolean that_present_total_trxns_count = true;
    if (this_present_total_trxns_count || that_present_total_trxns_count) {
      if (!(this_present_total_trxns_count && that_present_total_trxns_count))
        return false;
      if (this.total_trxns_count != that.total_trxns_count)
        return false;
    }

    boolean this_present_transactions = true && this.isSetTransactions();
    boolean that_present_transactions = true && that.isSetTransactions();
    if (this_present_transactions || that_present_transactions) {
      if (!(this_present_transactions && that_present_transactions))
        return false;
      if (!this.transactions.equals(that.transactions))
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

    hashCode = hashCode * 8191 + ((result) ? 131071 : 524287);

    hashCode = hashCode * 8191 + total_trxns_count;

    hashCode = hashCode * 8191 + ((isSetTransactions()) ? 131071 : 524287);
    if (isSetTransactions())
      hashCode = hashCode * 8191 + transactions.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TransactionsGetResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, other.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTotal_trxns_count()).compareTo(other.isSetTotal_trxns_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal_trxns_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_trxns_count, other.total_trxns_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransactions()).compareTo(other.isSetTransactions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactions, other.transactions);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionsGetResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("result:");
    sb.append(this.result);
    first = false;
    if (!first) sb.append(", ");
    sb.append("total_trxns_count:");
    sb.append(this.total_trxns_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("transactions:");
    if (this.transactions == null) {
      sb.append("null");
    } else {
      sb.append(this.transactions);
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

  private static class TransactionsGetResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionsGetResultStandardScheme getScheme() {
      return new TransactionsGetResultStandardScheme();
    }
  }

  private static class TransactionsGetResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TransactionsGetResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TransactionsGetResult struct) throws org.apache.thrift.TException {
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
          case 2: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.result = iprot.readBool();
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_TRXNS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total_trxns_count = iprot.readI32();
              struct.setTotal_trxns_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRANSACTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.transactions = new java.util.ArrayList<SealedTransaction>(_list34.size);
                SealedTransaction _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = new SealedTransaction();
                  _elem35.read(iprot);
                  struct.transactions.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setTransactionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TransactionsGetResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeBool(struct.result);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_TRXNS_COUNT_FIELD_DESC);
      oprot.writeI32(struct.total_trxns_count);
      oprot.writeFieldEnd();
      if (struct.transactions != null) {
        oprot.writeFieldBegin(TRANSACTIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.transactions.size()));
          for (SealedTransaction _iter37 : struct.transactions)
          {
            _iter37.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransactionsGetResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionsGetResultTupleScheme getScheme() {
      return new TransactionsGetResultTupleScheme();
    }
  }

  private static class TransactionsGetResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TransactionsGetResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TransactionsGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetResult()) {
        optionals.set(1);
      }
      if (struct.isSetTotal_trxns_count()) {
        optionals.set(2);
      }
      if (struct.isSetTransactions()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetResult()) {
        oprot.writeBool(struct.result);
      }
      if (struct.isSetTotal_trxns_count()) {
        oprot.writeI32(struct.total_trxns_count);
      }
      if (struct.isSetTransactions()) {
        {
          oprot.writeI32(struct.transactions.size());
          for (SealedTransaction _iter38 : struct.transactions)
          {
            _iter38.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TransactionsGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.result = iprot.readBool();
        struct.setResultIsSet(true);
      }
      if (incoming.get(2)) {
        struct.total_trxns_count = iprot.readI32();
        struct.setTotal_trxns_countIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.transactions = new java.util.ArrayList<SealedTransaction>(_list39.size);
          SealedTransaction _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = new SealedTransaction();
            _elem40.read(iprot);
            struct.transactions.add(_elem40);
          }
        }
        struct.setTransactionsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

