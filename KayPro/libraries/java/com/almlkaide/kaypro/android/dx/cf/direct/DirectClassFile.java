package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceFile;
import com.almlkaide.kaypro.android.dx.cf.code.BootstrapMethodsList;
import com.almlkaide.kaypro.android.dx.cf.iface.Attribute;
import com.almlkaide.kaypro.android.dx.cf.iface.AttributeList;
import com.almlkaide.kaypro.android.dx.cf.iface.ClassFile;
import com.almlkaide.kaypro.android.dx.cf.iface.FieldList;
import com.almlkaide.kaypro.android.dx.cf.iface.MethodList;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.cf.iface.StdAttributeList;
import com.almlkaide.kaypro.android.dx.cf.cst.ConstantPoolParser;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.ConstantPool;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.cst.StdConstantPool;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;

public class DirectClassFile implements ClassFile {
    private static final int CLASS_FILE_MAGIC = -889275714;
    private static final int CLASS_FILE_MAX_MAJOR_VERSION = 53;
    private static final int CLASS_FILE_MAX_MINOR_VERSION = 0;
    private static final int CLASS_FILE_MIN_MAJOR_VERSION = 45;
    private int accessFlags;
    private AttributeFactory attributeFactory;
    private StdAttributeList attributes;
    private final ByteArray bytes;
    private FieldList fields;
    private final String filePath;
    private TypeList interfaces;
    private MethodList methods;
    private ParseObserver observer;
    private StdConstantPool pool;
    private final boolean strictParse;
    private CstType superClass;
    private CstType thisClass;

    public static String stringOrNone(Object obj) {
        return obj == null ? "(none)" : obj.toString();
    }

    public DirectClassFile(ByteArray byteArray, String str, boolean z) {
        if (byteArray == null) {
            throw new NullPointerException("bytes == null");
        }
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.filePath = str;
        this.bytes = byteArray;
        this.strictParse = z;
        this.accessFlags = -1;
    }

    public DirectClassFile(byte[] bArr, String str, boolean z) {
        this(new ByteArray(bArr), str, z);
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }

    public void setAttributeFactory(AttributeFactory attributeFactory) {
        if (attributeFactory == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.attributeFactory = attributeFactory;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public ByteArray getBytes() {
        return this.bytes;
    }

    @Override
    public int getMagic() {
        parseToInterfacesIfNecessary();
        return getMagic0();
    }

    @Override
    public int getMinorVersion() {
        parseToInterfacesIfNecessary();
        return getMinorVersion0();
    }

    @Override
    public int getMajorVersion() {
        parseToInterfacesIfNecessary();
        return getMajorVersion0();
    }

    @Override
    public int getAccessFlags() {
        parseToInterfacesIfNecessary();
        return this.accessFlags;
    }

    @Override
    public CstType getThisClass() {
        parseToInterfacesIfNecessary();
        return this.thisClass;
    }

    @Override
    public CstType getSuperclass() {
        parseToInterfacesIfNecessary();
        return this.superClass;
    }

    @Override
    public ConstantPool getConstantPool() {
        parseToInterfacesIfNecessary();
        return this.pool;
    }

    @Override
    public TypeList getInterfaces() {
        parseToInterfacesIfNecessary();
        return this.interfaces;
    }

    @Override
    public FieldList getFields() {
        parseToEndIfNecessary();
        return this.fields;
    }

    @Override
    public MethodList getMethods() {
        parseToEndIfNecessary();
        return this.methods;
    }

    @Override
    public AttributeList getAttributes() {
        parseToEndIfNecessary();
        return this.attributes;
    }

    @Override
    public BootstrapMethodsList getBootstrapMethods() {
        AttBootstrapMethods attBootstrapMethods = (AttBootstrapMethods) getAttributes().findFirst(AttBootstrapMethods.ATTRIBUTE_NAME);
        return attBootstrapMethods != null ? attBootstrapMethods.getBootstrapMethods() : BootstrapMethodsList.EMPTY;
    }

    @Override
    public CstString getSourceFile() {
        Attribute attributeFindFirst = getAttributes().findFirst(AttSourceFile.ATTRIBUTE_NAME);
        return attributeFindFirst instanceof AttSourceFile ? ((AttSourceFile) attributeFindFirst).getSourceFile() : (CstString) null;
    }

    public TypeList makeTypeList(int i, int i2) {
        if (i2 == 0) {
            return StdTypeList.EMPTY;
        }
        if (this.pool == null) {
            throw new IllegalStateException("pool not yet initialized");
        }
        return new DcfTypeList(this.bytes, i, i2, this.pool, this.observer);
    }

    public int getMagic0() {
        return this.bytes.getInt(0);
    }

    public int getMinorVersion0() {
        return this.bytes.getUnsignedShort(4);
    }

    public int getMajorVersion0() {
        return this.bytes.getUnsignedShort(6);
    }

    private void parseToInterfacesIfNecessary() {
        if (this.accessFlags == -1) {
            parse();
        }
    }

    private void parseToEndIfNecessary() {
        if (this.attributes == null) {
            parse();
        }
    }

    private void parse() {
        try {
            parse0();
        } catch (ParseException e) {
            e.addContext(new StringBuffer().append("...while parsing ").append(this.filePath).toString());
            throw e;
        } catch (RuntimeException e2) {
            ParseException parseException = new ParseException(e2);
            parseException.addContext(new StringBuffer().append("...while parsing ").append(this.filePath).toString());
            throw parseException;
        }
    }

    private boolean isGoodMagic(int i) {
        return i == CLASS_FILE_MAGIC;
    }

    private boolean isGoodVersion(int i, int i2) {
        if (i >= 0) {
            if (i2 == 53) {
                if (i <= 0) {
                    return true;
                }
            } else if (i2 < 53 && i2 >= 45) {
                return true;
            }
        }
        return false;
    }

    private void parse0() {
        if (this.bytes.size() < 10) {
            throw new ParseException("severely truncated class file");
        }
        if (this.observer != null) {
            this.observer.parsed(this.bytes, 0, 0, "begin classfile");
            this.observer.parsed(this.bytes, 0, 4, new StringBuffer().append("magic: ").append(Hex.m7227u4(getMagic0())).toString());
            this.observer.parsed(this.bytes, 4, 2, new StringBuffer().append("minor_version: ").append(Hex.m7225u2(getMinorVersion0())).toString());
            this.observer.parsed(this.bytes, 6, 2, new StringBuffer().append("major_version: ").append(Hex.m7225u2(getMajorVersion0())).toString());
        }
        if (this.strictParse) {
            if (!isGoodMagic(getMagic0())) {
                throw new ParseException(new StringBuffer().append(new StringBuffer().append("bad class file magic (").append(Hex.m7227u4(getMagic0())).toString()).append(")").toString());
            }
            if (!isGoodVersion(getMinorVersion0(), getMajorVersion0())) {
                throw new ParseException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("unsupported class file version ").append(getMajorVersion0()).toString()).append(".").toString()).append(getMinorVersion0()).toString());
            }
        }
        ConstantPoolParser constantPoolParser = new ConstantPoolParser(this.bytes);
        constantPoolParser.setObserver(this.observer);
        this.pool = constantPoolParser.getPool();
        this.pool.setImmutable();
        int endOffset = constantPoolParser.getEndOffset();
        int unsignedShort = this.bytes.getUnsignedShort(endOffset);
        this.thisClass = (CstType) this.pool.mo7193get(this.bytes.getUnsignedShort(endOffset + 2));
        this.superClass = (CstType) this.pool.get0Ok(this.bytes.getUnsignedShort(endOffset + 4));
        int unsignedShort2 = this.bytes.getUnsignedShort(endOffset + 6);
        if (this.observer != null) {
            this.observer.parsed(this.bytes, endOffset, 2, new StringBuffer().append("access_flags: ").append(AccessFlags.classString(unsignedShort)).toString());
            this.observer.parsed(this.bytes, endOffset + 2, 2, new StringBuffer().append("this_class: ").append(this.thisClass).toString());
            this.observer.parsed(this.bytes, endOffset + 4, 2, new StringBuffer().append("super_class: ").append(stringOrNone(this.superClass)).toString());
            this.observer.parsed(this.bytes, endOffset + 6, 2, new StringBuffer().append("interfaces_count: ").append(Hex.m7225u2(unsignedShort2)).toString());
            if (unsignedShort2 != 0) {
                this.observer.parsed(this.bytes, endOffset + 8, 0, "interfaces:");
            }
        }
        int i = endOffset + 8;
        this.interfaces = makeTypeList(i, unsignedShort2);
        int i2 = (unsignedShort2 * 2) + i;
        if (this.strictParse) {
            String className = this.thisClass.getClassType().getClassName();
            if (!this.filePath.endsWith(".class") || !this.filePath.startsWith(className) || this.filePath.length() != className.length() + 6) {
                throw new ParseException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("class name (").append(className).toString()).append(") does not match path (").toString()).append(this.filePath).toString()).append(")").toString());
            }
        }
        this.accessFlags = unsignedShort;
        FieldListParser fieldListParser = new FieldListParser(this, this.thisClass, i2, this.attributeFactory);
        fieldListParser.setObserver(this.observer);
        this.fields = fieldListParser.getList();
        MethodListParser methodListParser = new MethodListParser(this, this.thisClass, fieldListParser.getEndOffset(), this.attributeFactory);
        methodListParser.setObserver(this.observer);
        this.methods = methodListParser.getList();
        AttributeListParser attributeListParser = new AttributeListParser(this, 0, methodListParser.getEndOffset(), this.attributeFactory);
        attributeListParser.setObserver(this.observer);
        this.attributes = attributeListParser.getList();
        this.attributes.setImmutable();
        int endOffset2 = attributeListParser.getEndOffset();
        if (endOffset2 != this.bytes.size()) {
            throw new ParseException(new StringBuffer().append(new StringBuffer().append("extra bytes at end of class file, ").append("at offset ").toString()).append(Hex.m7227u4(endOffset2)).toString());
        }
        if (this.observer != null) {
            this.observer.parsed(this.bytes, endOffset2, 0, "end classfile");
        }
    }

    private static class DcfTypeList implements TypeList {
        private final ByteArray bytes;
        private final StdConstantPool pool;
        private final int size;

        public DcfTypeList(ByteArray byteArray, int i, int i2, StdConstantPool stdConstantPool, ParseObserver parseObserver) {
            if (i2 < 0) {
                throw new IllegalArgumentException("size < 0");
            }
            ByteArray byteArraySlice = byteArray.slice(i, (i2 * 2) + i);
            this.bytes = byteArraySlice;
            this.size = i2;
            this.pool = stdConstantPool;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 2;
                try {
                    CstType cstType = (CstType) stdConstantPool.mo7193get(byteArraySlice.getUnsignedShort(i4));
                    if (parseObserver != null) {
                        parseObserver.parsed(byteArraySlice, i4, 2, new StringBuffer().append("  ").append(cstType).toString());
                    }
                } catch (ClassCastException e) {
                    throw new RuntimeException("bogus class cpi", e);
                }
            }
        }

        @Override
        public boolean isMutable() {
            return false;
        }

        @Override
        public int size() {
            return this.size;
        }

        @Override
        public int getWordCount() {
            return this.size;
        }

        @Override
        public Type getType(int i) {
            return ((CstType) this.pool.mo7193get(this.bytes.getUnsignedShort(i * 2))).getClassType();
        }

        @Override
        public TypeList withAddedType(Type type) {
            throw new UnsupportedOperationException("unsupported");
        }
    }
}
