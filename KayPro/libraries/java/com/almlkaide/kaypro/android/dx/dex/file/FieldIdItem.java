package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;

public final class FieldIdItem extends MemberIdItem {
    public FieldIdItem(CstFieldRef cstFieldRef) {
        super(cstFieldRef);
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_FIELD_ID_ITEM;
    }

    @Override
    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getTypeIds().intern(getFieldRef().getType());
    }

    public CstFieldRef getFieldRef() {
        return (CstFieldRef) getRef();
    }

    @Override
    protected int getTypoidIdx(DexFile dexFile) {
        return dexFile.getTypeIds().indexOf(getFieldRef().getType());
    }

    @Override
    protected String getTypoidName() {
        return "type_idx";
    }
}
