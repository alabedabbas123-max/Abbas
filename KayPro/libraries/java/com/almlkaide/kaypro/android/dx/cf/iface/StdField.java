package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttConstantValue;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.cst.TypedConstant;

public final class StdField extends StdMember implements Field {
    public StdField(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        super(cstType, i, cstNat, attributeList);
    }

    @Override
    public TypedConstant getConstantValue() {
        AttConstantValue attConstantValue = (AttConstantValue) getAttributes().findFirst(AttConstantValue.ATTRIBUTE_NAME);
        return attConstantValue == null ? (TypedConstant) null : attConstantValue.getConstantValue();
    }
}
