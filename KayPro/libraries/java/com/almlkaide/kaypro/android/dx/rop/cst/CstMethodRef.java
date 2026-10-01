package com.almlkaide.kaypro.android.dx.rop.cst;

public final class CstMethodRef extends CstBaseMethodRef {
    public CstMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
    }

    @Override
    public String typeName() {
        return "method";
    }
}
