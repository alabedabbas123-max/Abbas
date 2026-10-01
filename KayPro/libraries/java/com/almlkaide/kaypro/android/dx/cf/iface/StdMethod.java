package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;

public final class StdMethod extends StdMember implements Method {
    private final Prototype effectiveDescriptor;

    public StdMethod(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        super(cstType, i, cstNat, attributeList);
        this.effectiveDescriptor = Prototype.intern(getDescriptor().getString(), cstType.getClassType(), AccessFlags.isStatic(i), cstNat.isInstanceInit());
    }

    @Override
    public Prototype getEffectiveDescriptor() {
        return this.effectiveDescriptor;
    }
}
