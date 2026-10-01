package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.rop.cst.CstDouble;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFloat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLong;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.TypedConstant;

public final class AttConstantValue extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "ConstantValue";
    private final TypedConstant constantValue;

    public AttConstantValue(TypedConstant typedConstant) {
        super(ATTRIBUTE_NAME);
        if (!(typedConstant instanceof CstString) && !(typedConstant instanceof CstInteger) && !(typedConstant instanceof CstLong) && !(typedConstant instanceof CstFloat) && !(typedConstant instanceof CstDouble)) {
            if (typedConstant == null) {
                throw new NullPointerException("constantValue == null");
            }
            throw new IllegalArgumentException("bad type for constantValue");
        }
        this.constantValue = typedConstant;
    }

    @Override
    public int byteLength() {
        return 8;
    }

    public TypedConstant getConstantValue() {
        return this.constantValue;
    }
}
