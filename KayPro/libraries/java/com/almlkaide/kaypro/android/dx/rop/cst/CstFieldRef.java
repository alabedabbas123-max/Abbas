package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;

public final class CstFieldRef extends CstMemberRef {
    public static CstFieldRef forPrimitiveType(Type type) {
        return new CstFieldRef(CstType.forBoxedPrimitiveType(type), CstNat.PRIMITIVE_TYPE_NAT);
    }

    public CstFieldRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
    }

    @Override
    public String typeName() {
        return "field";
    }

    @Override
    public Type getType() {
        return getNat().getFieldType();
    }

    @Override
    protected int compareTo0(Constant constant) {
        int iCompareTo0 = super.compareTo0(constant);
        return iCompareTo0 != 0 ? iCompareTo0 : getNat().getDescriptor().compareTo2((Constant) ((CstFieldRef) constant).getNat().getDescriptor());
    }
}
