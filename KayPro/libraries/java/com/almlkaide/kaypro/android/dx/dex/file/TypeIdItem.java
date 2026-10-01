package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class TypeIdItem extends IdItem {
    public TypeIdItem(CstType cstType) {
        super(cstType);
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_TYPE_ID_ITEM;
    }

    @Override
    public int writeSize() {
        return 4;
    }

    @Override
    public void addContents(DexFile dexFile) {
        dexFile.getStringIds().intern(getDefiningClass().getDescriptor());
    }

    @Override
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        CstString descriptor = getDefiningClass().getDescriptor();
        int iIndexOf = dexFile.getStringIds().indexOf(descriptor);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(indexString()).append(' ').toString()).append(descriptor.toHuman()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  descriptor_idx: ").append(Hex.m7227u4(iIndexOf)).toString());
        }
        annotatedOutput.writeInt(iIndexOf);
    }
}
