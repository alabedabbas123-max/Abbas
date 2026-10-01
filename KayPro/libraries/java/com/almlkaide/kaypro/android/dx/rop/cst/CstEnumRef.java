package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;

public final class CstEnumRef extends CstMemberRef {
    private CstFieldRef fieldRef;

    public CstEnumRef(CstNat cstNat) {
        super(new CstType(cstNat.getFieldType()), cstNat);
        this.fieldRef = (CstFieldRef) null;
    }

    @Override
    public String typeName() {
        return "enum";
    }

    @Override
    public Type getType() {
        return getDefiningClass().getClassType();
    }

    public CstFieldRef getFieldRef() {
        if (this.fieldRef == null) {
            this.fieldRef = new CstFieldRef(getDefiningClass(), getNat());
        }
        return this.fieldRef;
    }
}
