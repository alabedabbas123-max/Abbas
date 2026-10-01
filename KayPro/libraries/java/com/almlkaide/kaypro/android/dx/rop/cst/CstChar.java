package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstChar extends CstLiteral32 {
    public static final CstChar VALUE_0 = make((char) 0);

    public static CstChar make(char c) {
        return new CstChar(c);
    }

    public static CstChar make(int i) {
        char c = (char) i;
        if (c != i) {
            throw new IllegalArgumentException(new StringBuffer().append("bogus char value: ").append(i).toString());
        }
        return make(c);
    }

    CstChar(char c) {
        super(c);
    }

    public String toString() {
        int intBits = getIntBits();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("char{0x").append(Hex.m7225u2(intBits)).toString()).append(" / ").toString()).append(intBits).toString()).append('}').toString();
    }

    @Override
    public Type getType() {
        return Type.CHAR;
    }

    @Override
    public String typeName() {
        return "char";
    }

    @Override
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public char getValue() {
        return (char) getIntBits();
    }
}
