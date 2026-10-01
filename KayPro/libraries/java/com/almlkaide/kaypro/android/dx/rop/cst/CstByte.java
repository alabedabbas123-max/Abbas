package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstByte extends CstLiteral32 {
    public static final CstByte VALUE_0 = make((byte) 0);

    public static CstByte make(byte b) {
        return new CstByte(b);
    }

    public static CstByte make(int i) {
        byte b = (byte) i;
        if (b != i) {
            throw new IllegalArgumentException(new StringBuffer().append("bogus byte value: ").append(i).toString());
        }
        return make(b);
    }

    CstByte(byte b) {
        super(b);
    }

    public String toString() {
        int intBits = getIntBits();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("byte{0x").append(Hex.m7224u1(intBits)).toString()).append(" / ").toString()).append(intBits).toString()).append('}').toString();
    }

    @Override
    public Type getType() {
        return Type.BYTE;
    }

    @Override
    public String typeName() {
        return "byte";
    }

    @Override
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public byte getValue() {
        return (byte) getIntBits();
    }
}
