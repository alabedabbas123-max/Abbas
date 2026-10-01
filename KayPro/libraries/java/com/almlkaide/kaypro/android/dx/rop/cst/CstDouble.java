package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstDouble extends CstLiteral64 {
    public static final CstDouble VALUE_0 = new CstDouble(Double.doubleToLongBits(0.0d));
    public static final CstDouble VALUE_1 = new CstDouble(Double.doubleToLongBits(1.0d));

    public static CstDouble make(long j) {
        return new CstDouble(j);
    }

    CstDouble(long j) {
        super(j);
    }

    public String toString() {
        long longBits = getLongBits();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("double{0x").append(Hex.m7228u8(longBits)).toString()).append(" / ").toString()).append(Double.longBitsToDouble(longBits)).toString()).append('}').toString();
    }

    @Override
    public Type getType() {
        return Type.DOUBLE;
    }

    @Override
    public String typeName() {
        return "double";
    }

    @Override
    public String toHuman() {
        return Double.toString(Double.longBitsToDouble(getLongBits()));
    }

    public double getValue() {
        return Double.longBitsToDouble(getLongBits());
    }
}
