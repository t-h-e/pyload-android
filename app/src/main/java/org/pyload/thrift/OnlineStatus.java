/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package org.pyload.thrift;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class OnlineStatus implements org.apache.thrift.TBase<OnlineStatus, OnlineStatus._Fields>, java.io.Serializable, Cloneable, Comparable<OnlineStatus>, android.os.Parcelable {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OnlineStatus");

    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField PLUGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("plugin", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField PACKAGENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("packagename", org.apache.thrift.protocol.TType.STRING, (short) 3);
    private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short) 4);
    private static final org.apache.thrift.protocol.TField SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("size", org.apache.thrift.protocol.TType.I64, (short) 5);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new OnlineStatusStandardSchemeFactory());
        schemes.put(TupleScheme.class, new OnlineStatusTupleSchemeFactory());
    }

    public String name; // required
    public String plugin; // required
    public String packagename; // required
    /**
     *
     * @see DownloadStatus
     */
    public DownloadStatus status; // required
    public long size; // required

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {
        //primitive bitfield of type: byte
        out.writeByte(__isset_bitfield);

        out.writeString(name);
        out.writeString(plugin);
        out.writeString(packagename);
        out.writeInt(status.getValue());
        out.writeLong(size);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public OnlineStatus(android.os.Parcel in) {
        //primitive bitfield of type: byte
        __isset_bitfield = in.readByte();

        this.name = in.readString();
        this.plugin = in.readString();
        this.packagename = in.readString();
        this.status = DownloadStatus.findByValue(in.readInt());
        this.size = in.readLong();
    }

    public static final android.os.Parcelable.Creator<OnlineStatus> CREATOR = new android.os.Parcelable.Creator<OnlineStatus>() {
        @Override
        public OnlineStatus[] newArray(int size) {
            return new OnlineStatus[size];
        }

        @Override
        public OnlineStatus createFromParcel(android.os.Parcel in) {
            return new OnlineStatus(in);
        }
    };

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        NAME((short) 1, "name"),
        PLUGIN((short) 2, "plugin"),
        PACKAGENAME((short) 3, "packagename"),
        /**
         *
         * @see DownloadStatus
         */
        STATUS((short) 4, "status"),
        SIZE((short) 5, "size");

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
            switch (fieldId) {
                case 1: // NAME
                    return NAME;
                case 2: // PLUGIN
                    return PLUGIN;
                case 3: // PACKAGENAME
                    return PACKAGENAME;
                case 4: // STATUS
                    return STATUS;
                case 5: // SIZE
                    return SIZE;
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
            if (fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
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
    private static final int __SIZE_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PLUGIN, new org.apache.thrift.meta_data.FieldMetaData("plugin", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, "PluginName")));
        tmpMap.put(_Fields.PACKAGENAME, new org.apache.thrift.meta_data.FieldMetaData("packagename", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DownloadStatus.class)));
        tmpMap.put(_Fields.SIZE, new org.apache.thrift.meta_data.FieldMetaData("size", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OnlineStatus.class, metaDataMap);
    }

    public OnlineStatus() {
    }

    public OnlineStatus(
            String name,
            String plugin,
            String packagename,
            DownloadStatus status,
            long size) {
        this();
        this.name = name;
        this.plugin = plugin;
        this.packagename = packagename;
        this.status = status;
        this.size = size;
        setSizeIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public OnlineStatus(OnlineStatus other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetPlugin()) {
            this.plugin = other.plugin;
        }
        if (other.isSetPackagename()) {
            this.packagename = other.packagename;
        }
        if (other.isSetStatus()) {
            this.status = other.status;
        }
        this.size = other.size;
    }

    public OnlineStatus deepCopy() {
        return new OnlineStatus(this);
    }

    @Override
    public void clear() {
        this.name = null;
        this.plugin = null;
        this.packagename = null;
        this.status = null;
        setSizeIsSet(false);
        this.size = 0;
    }

    public String getName() {
        return this.name;
    }

    public OnlineStatus setName(String name) {
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

    public String getPlugin() {
        return this.plugin;
    }

    public OnlineStatus setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }

    public void unsetPlugin() {
        this.plugin = null;
    }

    /** Returns true if field plugin is set (has been assigned a value) and false otherwise */
    public boolean isSetPlugin() {
        return this.plugin != null;
    }

    public void setPluginIsSet(boolean value) {
        if (!value) {
            this.plugin = null;
        }
    }

    public String getPackagename() {
        return this.packagename;
    }

    public OnlineStatus setPackagename(String packagename) {
        this.packagename = packagename;
        return this;
    }

    public void unsetPackagename() {
        this.packagename = null;
    }

    /** Returns true if field packagename is set (has been assigned a value) and false otherwise */
    public boolean isSetPackagename() {
        return this.packagename != null;
    }

    public void setPackagenameIsSet(boolean value) {
        if (!value) {
            this.packagename = null;
        }
    }

    /**
     *
     * @see DownloadStatus
     */
    public DownloadStatus getStatus() {
        return this.status;
    }

    /**
     *
     * @see DownloadStatus
     */
    public OnlineStatus setStatus(DownloadStatus status) {
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

    public long getSize() {
        return this.size;
    }

    public OnlineStatus setSize(long size) {
        this.size = size;
        setSizeIsSet(true);
        return this;
    }

    public void unsetSize() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SIZE_ISSET_ID);
    }

    /** Returns true if field size is set (has been assigned a value) and false otherwise */
    public boolean isSetSize() {
        return EncodingUtils.testBit(__isset_bitfield, __SIZE_ISSET_ID);
    }

    public void setSizeIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SIZE_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case NAME:
                if (value == null) {
                    unsetName();
                } else {
                    setName((String) value);
                }
                break;

            case PLUGIN:
                if (value == null) {
                    unsetPlugin();
                } else {
                    setPlugin((String) value);
                }
                break;

            case PACKAGENAME:
                if (value == null) {
                    unsetPackagename();
                } else {
                    setPackagename((String) value);
                }
                break;

            case STATUS:
                if (value == null) {
                    unsetStatus();
                } else {
                    setStatus((DownloadStatus) value);
                }
                break;

            case SIZE:
                if (value == null) {
                    unsetSize();
                } else {
                    setSize((Long) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case NAME:
                return getName();

            case PLUGIN:
                return getPlugin();

            case PACKAGENAME:
                return getPackagename();

            case STATUS:
                return getStatus();

            case SIZE:
                return getSize();

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case NAME:
                return isSetName();
            case PLUGIN:
                return isSetPlugin();
            case PACKAGENAME:
                return isSetPackagename();
            case STATUS:
                return isSetStatus();
            case SIZE:
                return isSetSize();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof OnlineStatus)
            return this.equals((OnlineStatus) that);
        return false;
    }

    public boolean equals(OnlineStatus that) {
        if (that == null)
            return false;

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name) {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        boolean this_present_plugin = true && this.isSetPlugin();
        boolean that_present_plugin = true && that.isSetPlugin();
        if (this_present_plugin || that_present_plugin) {
            if (!(this_present_plugin && that_present_plugin))
                return false;
            if (!this.plugin.equals(that.plugin))
                return false;
        }

        boolean this_present_packagename = true && this.isSetPackagename();
        boolean that_present_packagename = true && that.isSetPackagename();
        if (this_present_packagename || that_present_packagename) {
            if (!(this_present_packagename && that_present_packagename))
                return false;
            if (!this.packagename.equals(that.packagename))
                return false;
        }

        boolean this_present_status = true && this.isSetStatus();
        boolean that_present_status = true && that.isSetStatus();
        if (this_present_status || that_present_status) {
            if (!(this_present_status && that_present_status))
                return false;
            if (!this.status.equals(that.status))
                return false;
        }

        boolean this_present_size = true;
        boolean that_present_size = true;
        if (this_present_size || that_present_size) {
            if (!(this_present_size && that_present_size))
                return false;
            if (this.size != that.size)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_name = true && (isSetName());
        list.add(present_name);
        if (present_name)
            list.add(name);

        boolean present_plugin = true && (isSetPlugin());
        list.add(present_plugin);
        if (present_plugin)
            list.add(plugin);

        boolean present_packagename = true && (isSetPackagename());
        list.add(present_packagename);
        if (present_packagename)
            list.add(packagename);

        boolean present_status = true && (isSetStatus());
        list.add(present_status);
        if (present_status)
            list.add(status.getValue());

        boolean present_size = true;
        list.add(present_size);
        if (present_size)
            list.add(size);

        return list.hashCode();
    }

    @Override
    public int compareTo(OnlineStatus other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetPlugin()).compareTo(other.isSetPlugin());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPlugin()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plugin, other.plugin);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetPackagename()).compareTo(other.isSetPackagename());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPackagename()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packagename, other.packagename);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetStatus()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSize()).compareTo(other.isSetSize());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSize()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.size, other.size);
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
        StringBuilder sb = new StringBuilder("OnlineStatus(");
        boolean first = true;

        sb.append("name:");
        if (this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("plugin:");
        if (this.plugin == null) {
            sb.append("null");
        } else {
            sb.append(this.plugin);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("packagename:");
        if (this.packagename == null) {
            sb.append("null");
        } else {
            sb.append(this.packagename);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("status:");
        if (this.status == null) {
            sb.append("null");
        } else {
            sb.append(this.status);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("size:");
        sb.append(this.size);
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

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class OnlineStatusStandardSchemeFactory implements SchemeFactory {
        public OnlineStatusStandardScheme getScheme() {
            return new OnlineStatusStandardScheme();
        }
    }

    private static class OnlineStatusStandardScheme extends StandardScheme<OnlineStatus> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, OnlineStatus struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
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
                    case 2: // PLUGIN
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.plugin = iprot.readString();
                            struct.setPluginIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // PACKAGENAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.packagename = iprot.readString();
                            struct.setPackagenameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // STATUS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.status = org.pyload.thrift.DownloadStatus.findByValue(iprot.readI32());
                            struct.setStatusIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // SIZE
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.size = iprot.readI64();
                            struct.setSizeIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, OnlineStatus struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.name != null) {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.plugin != null) {
                oprot.writeFieldBegin(PLUGIN_FIELD_DESC);
                oprot.writeString(struct.plugin);
                oprot.writeFieldEnd();
            }
            if (struct.packagename != null) {
                oprot.writeFieldBegin(PACKAGENAME_FIELD_DESC);
                oprot.writeString(struct.packagename);
                oprot.writeFieldEnd();
            }
            if (struct.status != null) {
                oprot.writeFieldBegin(STATUS_FIELD_DESC);
                oprot.writeI32(struct.status.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SIZE_FIELD_DESC);
            oprot.writeI64(struct.size);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class OnlineStatusTupleSchemeFactory implements SchemeFactory {
        public OnlineStatusTupleScheme getScheme() {
            return new OnlineStatusTupleScheme();
        }
    }

    private static class OnlineStatusTupleScheme extends TupleScheme<OnlineStatus> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, OnlineStatus struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetName()) {
                optionals.set(0);
            }
            if (struct.isSetPlugin()) {
                optionals.set(1);
            }
            if (struct.isSetPackagename()) {
                optionals.set(2);
            }
            if (struct.isSetStatus()) {
                optionals.set(3);
            }
            if (struct.isSetSize()) {
                optionals.set(4);
            }
            oprot.writeBitSet(optionals, 5);
            if (struct.isSetName()) {
                oprot.writeString(struct.name);
            }
            if (struct.isSetPlugin()) {
                oprot.writeString(struct.plugin);
            }
            if (struct.isSetPackagename()) {
                oprot.writeString(struct.packagename);
            }
            if (struct.isSetStatus()) {
                oprot.writeI32(struct.status.getValue());
            }
            if (struct.isSetSize()) {
                oprot.writeI64(struct.size);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, OnlineStatus struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(5);
            if (incoming.get(0)) {
                struct.name = iprot.readString();
                struct.setNameIsSet(true);
            }
            if (incoming.get(1)) {
                struct.plugin = iprot.readString();
                struct.setPluginIsSet(true);
            }
            if (incoming.get(2)) {
                struct.packagename = iprot.readString();
                struct.setPackagenameIsSet(true);
            }
            if (incoming.get(3)) {
                struct.status = org.pyload.thrift.DownloadStatus.findByValue(iprot.readI32());
                struct.setStatusIsSet(true);
            }
            if (incoming.get(4)) {
                struct.size = iprot.readI64();
                struct.setSizeIsSet(true);
            }
        }
    }

}

