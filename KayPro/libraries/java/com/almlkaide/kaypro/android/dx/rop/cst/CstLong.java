package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstLong extends CstLiteral64 {
    public static final CstLong VALUE_0 = make(0);
    public static final CstLong VALUE_1 = make(1);

    public static CstLong make(long j) {
        return new CstLong(j);
    }

    CstLong(long j) {
        super(j);
    }

    public String toString() {
        long longBits = getLongBits();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("long{0x").append(Hex.m7228u8(longBits)).toString()).append(" / ").toString()).append(longBits).toString()).append('}').toString();
    }

    @Override
    public Type getType() {
        return Type.LONG;
    }

    @Override
    public String typeName() {
        return "long";
    }

    @Override
    public String toHuman() {
        return Long.toString(getLongBits());
    }

    public long getValue() {
        return getLongBits();
    }
}
