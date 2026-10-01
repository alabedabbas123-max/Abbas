package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.EncodedValueCodec;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;
import com.almlkaide.kaypro.android.dx.rop.annotation.NameValuePair;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstAnnotation;
import com.almlkaide.kaypro.android.dx.rop.cst.CstArray;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBoolean;
import com.almlkaide.kaypro.android.dx.rop.cst.CstByte;
import com.almlkaide.kaypro.android.dx.rop.cst.CstChar;
import com.almlkaide.kaypro.android.dx.rop.cst.CstDouble;
import com.almlkaide.kaypro.android.dx.rop.cst.CstEnumRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFloat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstKnownNull;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteralBits;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLong;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstShort;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.Collection;

public final class ValueEncoder {
    private static final int VALUE_ANNOTATION = 29;
    private static final int VALUE_ARRAY = 28;
    private static final int VALUE_BOOLEAN = 31;
    private static final int VALUE_BYTE = 0;
    private static final int VALUE_CHAR = 3;
    private static final int VALUE_DOUBLE = 17;
    private static final int VALUE_ENUM = 27;
    private static final int VALUE_FIELD = 25;
    private static final int VALUE_FLOAT = 16;
    private static final int VALUE_INT = 4;
    private static final int VALUE_LONG = 6;
    private static final int VALUE_METHOD = 26;
    private static final int VALUE_METHOD_HANDLE = 22;
    private static final int VALUE_METHOD_TYPE = 21;
    private static final int VALUE_NULL = 30;
    private static final int VALUE_SHORT = 2;
    private static final int VALUE_STRING = 23;
    private static final int VALUE_TYPE = 24;
    private final DexFile file;

    private final AnnotatedOutput f5031out;

    public ValueEncoder(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (dexFile == null) {
            throw new NullPointerException("file == null");
        }
        if (annotatedOutput == null) {
            throw new NullPointerException("out == null");
        }
        this.file = dexFile;
        this.f5031out = annotatedOutput;
    }

    public void writeConstant(Constant constant) {
        int iConstantToValueType = constantToValueType(constant);
        switch (iConstantToValueType) {
            case 0:
            case 2:
            case 4:
            case 6:
                EncodedValueCodec.writeSignedIntegralValue(this.f5031out, iConstantToValueType, ((CstLiteralBits) constant).getLongBits());
                return;
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            default:
                throw new RuntimeException("Shouldn't happen");
            case 3:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, ((CstLiteralBits) constant).getLongBits());
                return;
            case 16:
                EncodedValueCodec.writeRightZeroExtendedValue(this.f5031out, iConstantToValueType, ((CstFloat) constant).getLongBits() << 32);
                return;
            case 17:
                EncodedValueCodec.writeRightZeroExtendedValue(this.f5031out, iConstantToValueType, ((CstDouble) constant).getLongBits());
                return;
            case 21:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, this.file.getProtoIds().indexOf(((CstProtoRef) constant).getPrototype()));
                return;
            case 22:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, this.file.getMethodHandles().indexOf((CstMethodHandle) constant));
                return;
            case 23:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, this.file.getStringIds().indexOf((CstString) constant));
                return;
            case 24:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, this.file.getTypeIds().indexOf((CstType) constant));
                return;
            case 25:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, this.file.getFieldIds().indexOf((CstFieldRef) constant));
                return;
            case 26:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, this.file.getMethodIds().indexOf((CstMethodRef) constant));
                return;
            case 27:
                EncodedValueCodec.writeUnsignedIntegralValue(this.f5031out, iConstantToValueType, this.file.getFieldIds().indexOf(((CstEnumRef) constant).getFieldRef()));
                return;
            case 28:
                this.f5031out.writeByte(iConstantToValueType);
                writeArray((CstArray) constant, false);
                return;
            case 29:
                this.f5031out.writeByte(iConstantToValueType);
                writeAnnotation(((CstAnnotation) constant).getAnnotation(), false);
                return;
            case 30:
                this.f5031out.writeByte(iConstantToValueType);
                return;
            case 31:
                this.f5031out.writeByte(iConstantToValueType | (((CstBoolean) constant).getIntBits() << 5));
                return;
        }
    }

    private static int constantToValueType(Constant constant) {
        if (constant instanceof CstByte) {
            return 0;
        }
        if (constant instanceof CstShort) {
            return 2;
        }
        if (constant instanceof CstChar) {
            return 3;
        }
        if (constant instanceof CstInteger) {
            return 4;
        }
        if (constant instanceof CstLong) {
            return 6;
        }
        if (constant instanceof CstFloat) {
            return 16;
        }
        if (constant instanceof CstDouble) {
            return 17;
        }
        if (constant instanceof CstProtoRef) {
            return 21;
        }
        if (constant instanceof CstMethodHandle) {
            return 22;
        }
        if (constant instanceof CstString) {
            return 23;
        }
        if (constant instanceof CstType) {
            return 24;
        }
        if (constant instanceof CstFieldRef) {
            return 25;
        }
        if (constant instanceof CstMethodRef) {
            return 26;
        }
        if (constant instanceof CstEnumRef) {
            return 27;
        }
        if (constant instanceof CstArray) {
            return 28;
        }
        if (constant instanceof CstAnnotation) {
            return 29;
        }
        if (constant instanceof CstKnownNull) {
            return 30;
        }
        if (constant instanceof CstBoolean) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    public void writeArray(CstArray cstArray, boolean z) {
        boolean z2 = z && this.f5031out.annotates();
        CstArray.List list = cstArray.getList();
        int size = list.size();
        if (z2) {
            this.f5031out.annotate(new StringBuffer().append("  size: ").append(Hex.m7227u4(size)).toString());
        }
        this.f5031out.writeUleb128(size);
        for (int i = 0; i < size; i++) {
            Constant constantM7194get = list.m7194get(i);
            if (z2) {
                this.f5031out.annotate(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  [").append(Integer.toHexString(i)).toString()).append("] ").toString()).append(constantToHuman(constantM7194get)).toString());
            }
            writeConstant(constantM7194get);
        }
        if (z2) {
            this.f5031out.endAnnotation();
        }
    }

    public void writeAnnotation(Annotation annotation, boolean z) {
        int i;
        boolean z2 = z && this.f5031out.annotates();
        StringIdsSection stringIds = this.file.getStringIds();
        TypeIdsSection typeIds = this.file.getTypeIds();
        CstType type = annotation.getType();
        int iIndexOf = typeIds.indexOf(type);
        if (z2) {
            this.f5031out.annotate(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  type_idx: ").append(Hex.m7227u4(iIndexOf)).toString()).append(" // ").toString()).append(type.toHuman()).toString());
        }
        this.f5031out.writeUleb128(typeIds.indexOf(annotation.getType()));
        Collection<NameValuePair> nameValuePairs = annotation.getNameValuePairs();
        int size = nameValuePairs.size();
        if (z2) {
            this.f5031out.annotate(new StringBuffer().append("  size: ").append(Hex.m7227u4(size)).toString());
        }
        this.f5031out.writeUleb128(size);
        int i2 = 0;
        for (NameValuePair nameValuePair : nameValuePairs) {
            CstString name = nameValuePair.getName();
            int iIndexOf2 = stringIds.indexOf(name);
            Constant value = nameValuePair.getValue();
            if (z2) {
                this.f5031out.annotate(0, new StringBuffer().append(new StringBuffer().append("  elements[").append(i2).toString()).append("]:").toString());
                i = i2 + 1;
                this.f5031out.annotate(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    name_idx: ").append(Hex.m7227u4(iIndexOf2)).toString()).append(" // ").toString()).append(name.toHuman()).toString());
            } else {
                i = i2;
            }
            this.f5031out.writeUleb128(iIndexOf2);
            if (z2) {
                this.f5031out.annotate(new StringBuffer().append("    value: ").append(constantToHuman(value)).toString());
            }
            writeConstant(value);
            i2 = i;
        }
        if (z2) {
            this.f5031out.endAnnotation();
        }
    }

    public static String constantToHuman(Constant constant) {
        if (constantToValueType(constant) == 30) {
            return "null";
        }
        return constant.typeName() + ' ' + constant.toHuman();
    }

    public static void addContents(DexFile dexFile, Annotation annotation) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        StringIdsSection stringIds = dexFile.getStringIds();
        typeIds.intern(annotation.getType());
        for (NameValuePair nameValuePair : annotation.getNameValuePairs()) {
            stringIds.intern(nameValuePair.getName());
            addContents(dexFile, nameValuePair.getValue());
        }
    }

    public static void addContents(DexFile dexFile, Constant constant) {
        if (constant instanceof CstAnnotation) {
            addContents(dexFile, ((CstAnnotation) constant).getAnnotation());
            return;
        }
        if (constant instanceof CstArray) {
            CstArray.List list = ((CstArray) constant).getList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                addContents(dexFile, list.m7194get(i));
            }
            return;
        }
        dexFile.internIfAppropriate(constant);
    }
}
