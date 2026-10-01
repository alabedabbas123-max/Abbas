package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstFloat extends CstLiteral32 {
    public static final CstFloat VALUE_0 = make(Float.floatToIntBits(0.0f));
    public static final CstFloat VALUE_1 = make(Float.floatToIntBits(1.0f));
    public static final CstFloat VALUE_2 = make(Float.floatToIntBits(2.0f));

    public static CstFloat make(int i) {
        return new CstFloat(i);
    }

    CstFloat(int i) {
        super(i);
    }

    public String toString() {
        int intBits = getIntBits();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("float{0x").append(Hex.m7227u4(intBits)).toString()).append(" / ").toString()).append(Float.intBitsToFloat(intBits)).toString()).append('}').toString();
    }

    @Override
    public Type getType() {
        return Type.FLOAT;
    }

    @Override
    public String typeName() {
        return "float";
    }

    @Override
    public String toHuman() {
        return Float.toString(Float.intBitsToFloat(getIntBits()));
    }

    public float getValue() {
        return Float.intBitsToFloat(getIntBits());
    }
}
