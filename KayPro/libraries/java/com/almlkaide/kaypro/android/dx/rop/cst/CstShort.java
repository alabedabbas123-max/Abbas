package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstShort extends CstLiteral32 {
    public static final CstShort VALUE_0 = make((short) 0);

    public static CstShort make(short s) {
        return new CstShort(s);
    }

    public static CstShort make(int i) {
        short s = (short) i;
        if (s != i) {
            throw new IllegalArgumentException(new StringBuffer().append("bogus short value: ").append(i).toString());
        }
        return make(s);
    }

    CstShort(short s) {
        super(s);
    }

    public String toString() {
        int intBits = getIntBits();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("short{0x").append(Hex.m7225u2(intBits)).toString()).append(" / ").toString()).append(intBits).toString()).append('}').toString();
    }

    @Override
    public Type getType() {
        return Type.SHORT;
    }

    @Override
    public String typeName() {
        return "short";
    }

    @Override
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public short getValue() {
        return (short) getIntBits();
    }
}
