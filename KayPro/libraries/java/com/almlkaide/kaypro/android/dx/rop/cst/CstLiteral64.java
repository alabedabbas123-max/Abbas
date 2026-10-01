package com.almlkaide.kaypro.android.dx.rop.cst;

public abstract class CstLiteral64 extends CstLiteralBits {
    private final long bits;

    CstLiteral64(long j) {
        this.bits = j;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.bits == ((CstLiteral64) obj).bits;
    }

    public final int hashCode() {
        return ((int) this.bits) ^ ((int) (this.bits >> 32));
    }

    @Override
    protected int compareTo0(Constant constant) {
        long j = ((CstLiteral64) constant).bits;
        if (this.bits < j) {
            return -1;
        }
        if (this.bits > j) {
            return 1;
        }
        return 0;
    }

    @Override
    public final boolean isCategory2() {
        return true;
    }

    @Override
    public final boolean fitsInInt() {
        return ((long) ((int) this.bits)) == this.bits;
    }

    @Override
    public final int getIntBits() {
        return (int) this.bits;
    }

    @Override
    public final long getLongBits() {
        return this.bits;
    }
}
