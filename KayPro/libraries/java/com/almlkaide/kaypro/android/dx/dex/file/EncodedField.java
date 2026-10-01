package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.Leb128;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.PrintWriter;

public final class EncodedField extends EncodedMember implements Comparable<EncodedField> {
    private final CstFieldRef field;

    @Override
    public int compareTo(EncodedField encodedField) {
        return compareTo2(encodedField);
    }

    public EncodedField(CstFieldRef cstFieldRef, int i) {
        super(i);
        if (cstFieldRef == null) {
            throw new NullPointerException("field == null");
        }
        this.field = cstFieldRef;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof EncodedField) && compareTo2((EncodedField) obj) == 0;
    }

    public int compareTo2(EncodedField encodedField) {
        return this.field.compareTo2((Constant) encodedField.field);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Hex.m7225u2(getAccessFlags()));
        sb.append(' ');
        sb.append(this.field);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void addContents(DexFile dexFile) {
        dexFile.getFieldIds().intern(this.field);
    }

    @Override
    public CstString getName() {
        return this.field.getNat().getName();
    }

    @Override
    public String toHuman() {
        return this.field.toHuman();
    }

    @Override
    public void debugPrint(PrintWriter printWriter, boolean z) {
        printWriter.println(toString());
    }

    public CstFieldRef getRef() {
        return this.field;
    }

    @Override
    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2) {
        int iIndexOf = dexFile.getFieldIds().indexOf(this.field);
        int i3 = iIndexOf - i;
        int accessFlags = getAccessFlags();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, String.format("  [%x] %s", new Integer(i2), this.field.toHuman()));
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(i3), new StringBuffer().append("    field_idx:    ").append(Hex.m7227u4(iIndexOf)).toString());
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(accessFlags), new StringBuffer().append("    access_flags: ").append(AccessFlags.fieldString(accessFlags)).toString());
        }
        annotatedOutput.writeUleb128(i3);
        annotatedOutput.writeUleb128(accessFlags);
        return iIndexOf;
    }
}
