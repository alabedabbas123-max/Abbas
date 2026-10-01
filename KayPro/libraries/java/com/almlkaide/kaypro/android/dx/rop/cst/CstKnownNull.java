package com.almlkaide.kaypro.android.dx.rop.cst;

import com.almlkaide.kaypro.android.dx.rop.type.Type;

public final class CstKnownNull extends CstLiteralBits {
    public static final CstKnownNull THE_ONE = new CstKnownNull();

    CstKnownNull() {
    }

    public boolean equals(Object obj) {
        return obj instanceof CstKnownNull;
    }

    public int hashCode() {
        return 1147565434;
    }

    @Override
    protected int compareTo0(Constant constant) {
        return 0;
    }

    public String toString() {
        return "known-null";
    }

    @Override
    public Type getType() {
        return Type.KNOWN_NULL;
    }

    @Override
    public String typeName() {
        return "known-null";
    }

    @Override
    public boolean isCategory2() {
        return false;
    }

    @Override
    public String toHuman() {
        return "null";
    }

    @Override
    public boolean fitsInInt() {
        return true;
    }

    @Override
    public int getIntBits() {
        return 0;
    }

    @Override
    public long getLongBits() {
        return 0;
    }
}
