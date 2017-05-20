/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wfs.protocol;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 命令
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-18")
public class WfsCmd implements org.apache.thrift.TBase<WfsCmd, WfsCmd._Fields>, java.io.Serializable, Cloneable, Comparable<WfsCmd> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WfsCmd");

  private static final org.apache.thrift.protocol.TField CMD_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("cmdKey", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CMD_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("cmdValue", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WfsCmdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WfsCmdTupleSchemeFactory());
  }

  /**
   * 名称
   */
  public String cmdKey; // optional
  /**
   * 对象
   */
  public String cmdValue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 名称
     */
    CMD_KEY((short)1, "cmdKey"),
    /**
     * 对象
     */
    CMD_VALUE((short)2, "cmdValue");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CMD_KEY
          return CMD_KEY;
        case 2: // CMD_VALUE
          return CMD_VALUE;
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
  private static final _Fields optionals[] = {_Fields.CMD_KEY,_Fields.CMD_VALUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CMD_KEY, new org.apache.thrift.meta_data.FieldMetaData("cmdKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CMD_VALUE, new org.apache.thrift.meta_data.FieldMetaData("cmdValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WfsCmd.class, metaDataMap);
  }

  public WfsCmd() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WfsCmd(WfsCmd other) {
    if (other.isSetCmdKey()) {
      this.cmdKey = other.cmdKey;
    }
    if (other.isSetCmdValue()) {
      this.cmdValue = other.cmdValue;
    }
  }

  public WfsCmd deepCopy() {
    return new WfsCmd(this);
  }

  @Override
  public void clear() {
    this.cmdKey = null;
    this.cmdValue = null;
  }

  /**
   * 名称
   */
  public String getCmdKey() {
    return this.cmdKey;
  }

  /**
   * 名称
   */
  public WfsCmd setCmdKey(String cmdKey) {
    this.cmdKey = cmdKey;
    return this;
  }

  public void unsetCmdKey() {
    this.cmdKey = null;
  }

  /** Returns true if field cmdKey is set (has been assigned a value) and false otherwise */
  public boolean isSetCmdKey() {
    return this.cmdKey != null;
  }

  public void setCmdKeyIsSet(boolean value) {
    if (!value) {
      this.cmdKey = null;
    }
  }

  /**
   * 对象
   */
  public String getCmdValue() {
    return this.cmdValue;
  }

  /**
   * 对象
   */
  public WfsCmd setCmdValue(String cmdValue) {
    this.cmdValue = cmdValue;
    return this;
  }

  public void unsetCmdValue() {
    this.cmdValue = null;
  }

  /** Returns true if field cmdValue is set (has been assigned a value) and false otherwise */
  public boolean isSetCmdValue() {
    return this.cmdValue != null;
  }

  public void setCmdValueIsSet(boolean value) {
    if (!value) {
      this.cmdValue = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CMD_KEY:
      if (value == null) {
        unsetCmdKey();
      } else {
        setCmdKey((String)value);
      }
      break;

    case CMD_VALUE:
      if (value == null) {
        unsetCmdValue();
      } else {
        setCmdValue((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CMD_KEY:
      return getCmdKey();

    case CMD_VALUE:
      return getCmdValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CMD_KEY:
      return isSetCmdKey();
    case CMD_VALUE:
      return isSetCmdValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WfsCmd)
      return this.equals((WfsCmd)that);
    return false;
  }

  public boolean equals(WfsCmd that) {
    if (that == null)
      return false;

    boolean this_present_cmdKey = true && this.isSetCmdKey();
    boolean that_present_cmdKey = true && that.isSetCmdKey();
    if (this_present_cmdKey || that_present_cmdKey) {
      if (!(this_present_cmdKey && that_present_cmdKey))
        return false;
      if (!this.cmdKey.equals(that.cmdKey))
        return false;
    }

    boolean this_present_cmdValue = true && this.isSetCmdValue();
    boolean that_present_cmdValue = true && that.isSetCmdValue();
    if (this_present_cmdValue || that_present_cmdValue) {
      if (!(this_present_cmdValue && that_present_cmdValue))
        return false;
      if (!this.cmdValue.equals(that.cmdValue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cmdKey = true && (isSetCmdKey());
    list.add(present_cmdKey);
    if (present_cmdKey)
      list.add(cmdKey);

    boolean present_cmdValue = true && (isSetCmdValue());
    list.add(present_cmdValue);
    if (present_cmdValue)
      list.add(cmdValue);

    return list.hashCode();
  }

  @Override
  public int compareTo(WfsCmd other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCmdKey()).compareTo(other.isSetCmdKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCmdKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cmdKey, other.cmdKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCmdValue()).compareTo(other.isSetCmdValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCmdValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cmdValue, other.cmdValue);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WfsCmd(");
    boolean first = true;

    if (isSetCmdKey()) {
      sb.append("cmdKey:");
      if (this.cmdKey == null) {
        sb.append("null");
      } else {
        sb.append(this.cmdKey);
      }
      first = false;
    }
    if (isSetCmdValue()) {
      if (!first) sb.append(", ");
      sb.append("cmdValue:");
      if (this.cmdValue == null) {
        sb.append("null");
      } else {
        sb.append(this.cmdValue);
      }
      first = false;
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WfsCmdStandardSchemeFactory implements SchemeFactory {
    public WfsCmdStandardScheme getScheme() {
      return new WfsCmdStandardScheme();
    }
  }

  private static class WfsCmdStandardScheme extends StandardScheme<WfsCmd> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WfsCmd struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CMD_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cmdKey = iprot.readString();
              struct.setCmdKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CMD_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cmdValue = iprot.readString();
              struct.setCmdValueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WfsCmd struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cmdKey != null) {
        if (struct.isSetCmdKey()) {
          oprot.writeFieldBegin(CMD_KEY_FIELD_DESC);
          oprot.writeString(struct.cmdKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cmdValue != null) {
        if (struct.isSetCmdValue()) {
          oprot.writeFieldBegin(CMD_VALUE_FIELD_DESC);
          oprot.writeString(struct.cmdValue);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WfsCmdTupleSchemeFactory implements SchemeFactory {
    public WfsCmdTupleScheme getScheme() {
      return new WfsCmdTupleScheme();
    }
  }

  private static class WfsCmdTupleScheme extends TupleScheme<WfsCmd> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WfsCmd struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCmdKey()) {
        optionals.set(0);
      }
      if (struct.isSetCmdValue()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCmdKey()) {
        oprot.writeString(struct.cmdKey);
      }
      if (struct.isSetCmdValue()) {
        oprot.writeString(struct.cmdValue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WfsCmd struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.cmdKey = iprot.readString();
        struct.setCmdKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cmdValue = iprot.readString();
        struct.setCmdValueIsSet(true);
      }
    }
  }

}

