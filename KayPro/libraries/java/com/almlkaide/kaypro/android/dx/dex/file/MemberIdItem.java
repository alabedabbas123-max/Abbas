package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.CstMemberRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public abstract class MemberIdItem extends IdItem {

    private final CstMemberRef f5030cst;

    protected abstract int getTypoidIdx(DexFile dexFile);

    protected abstract String getTypoidName();

    public MemberIdItem(CstMemberRef cstMemberRef) {
        super(cstMemberRef.getDefiningClass());
        this.f5030cst = cstMemberRef;
    }

    @Override
    public int writeSize() {
        return 8;
    }

    @Override
    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getStringIds().intern(getRef().getNat().getName());
    }

    @Override
    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        StringIdsSection stringIds = dexFile.getStringIds();
        CstNat nat = this.f5030cst.getNat();
        int iIndexOf = typeIds.indexOf(getDefiningClass());
        int iIndexOf2 = stringIds.indexOf(nat.getName());
        int typoidIdx = getTypoidIdx(dexFile);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(indexString()).append(' ').toString()).append(this.f5030cst.toHuman()).toString());
            annotatedOutput.annotate(2, new StringBuffer().append("  class_idx: ").append(Hex.m7225u2(iIndexOf)).toString());
            annotatedOutput.annotate(2, String.format("  %-10s %s", new StringBuffer().append(getTypoidName()).append(':').toString(), Hex.m7225u2(typoidIdx)));
            annotatedOutput.annotate(4, new StringBuffer().append("  name_idx:  ").append(Hex.m7227u4(iIndexOf2)).toString());
        }
        annotatedOutput.writeShort(iIndexOf);
        annotatedOutput.writeShort(typoidIdx);
        annotatedOutput.writeInt(iIndexOf2);
    }

    public final CstMemberRef getRef() {
        return this.f5030cst;
    }
}
