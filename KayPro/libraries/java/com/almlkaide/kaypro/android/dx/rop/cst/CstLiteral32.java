package com.almlkaide.kaypro.android.dx.rop.cst;

public abstract class CstLiteral32 extends CstLiteralBits {
    private final int bits;

    CstLiteral32(int i) {
        this.bits = i;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.bits == ((CstLiteral32) obj).bits;
    }

    public final int hashCode() {
        return this.bits;
    }

    @Override
    protected int compareTo0(Constant constant) {
        int i = ((CstLiteral32) constant).bits;
        if (this.bits < i) {
            return -1;
        }
        if (this.bits > i) {
            return 1;
        }
        return 0;
    }

    @Override
    public final boolean isCategory2() {
        return false;
    }

    @Override
    public final boolean fitsInInt() {
        return true;
    }

    @Override
    public final int getIntBits() {
        return this.bits;
    }

    @Override
    public final long getLongBits() {
        return this.bits;
    }
}
