package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dex.Leb128;
import com.almlkaide.kaypro.android.dx.dex.code.DalvCode;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.PrintWriter;

public final class EncodedMethod extends EncodedMember implements Comparable<EncodedMethod> {
    private final CodeItem code;
    private final CstMethodRef method;

    @Override
    public int compareTo(EncodedMethod encodedMethod) {
        return compareTo2(encodedMethod);
    }

    public EncodedMethod(CstMethodRef cstMethodRef, int i, DalvCode dalvCode, TypeList typeList) {
        super(i);
        if (cstMethodRef == null) {
            throw new NullPointerException("method == null");
        }
        this.method = cstMethodRef;
        if (dalvCode == null) {
            this.code = (CodeItem) null;
        } else {
            this.code = new CodeItem(cstMethodRef, dalvCode, (i & 8) != 0, typeList);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof EncodedMethod) && compareTo2((EncodedMethod) obj) == 0;
    }

    public int compareTo2(EncodedMethod encodedMethod) {
        return this.method.compareTo2((Constant) encodedMethod.method);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Hex.m7225u2(getAccessFlags()));
        sb.append(' ');
        sb.append(this.method);
        if (this.code != null) {
            sb.append(' ');
            sb.append(this.code);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        if (this.code != null) {
            wordData.m7168add(this.code);
        }
    }

    @Override
    public final String toHuman() {
        return this.method.toHuman();
    }

    @Override
    public final CstString getName() {
        return this.method.getNat().getName();
    }

    @Override
    public void debugPrint(PrintWriter printWriter, boolean z) {
        if (this.code == null) {
            printWriter.println(new StringBuffer().append(getRef().toHuman()).append(": abstract or native").toString());
        } else {
            this.code.debugPrint(printWriter, "  ", z);
        }
    }

    public final CstMethodRef getRef() {
        return this.method;
    }

    @Override
    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2) {
        int iIndexOf = dexFile.getMethodIds().indexOf(this.method);
        int i3 = iIndexOf - i;
        int accessFlags = getAccessFlags();
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.code);
        boolean z = absoluteOffsetOr0 != 0;
        boolean z2 = (accessFlags & 1280) == 0;
        if (z ? !z2 : z2) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, String.format("  [%x] %s", new Integer(i2), this.method.toHuman()));
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(i3), new StringBuffer().append("    method_idx:   ").append(Hex.m7227u4(iIndexOf)).toString());
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(accessFlags), new StringBuffer().append("    access_flags: ").append(AccessFlags.methodString(accessFlags)).toString());
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(absoluteOffsetOr0), new StringBuffer().append("    code_off:     ").append(Hex.m7227u4(absoluteOffsetOr0)).toString());
        }
        annotatedOutput.writeUleb128(i3);
        annotatedOutput.writeUleb128(accessFlags);
        annotatedOutput.writeUleb128(absoluteOffsetOr0);
        return iIndexOf;
    }
}
