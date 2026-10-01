package com.a.b.e.c;

public abstract class Abstractu extends Abstractv {

    private final long f3187a;

    Abstractu(long j) {
        this.f3187a = j;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        long j = ((Abstractu) abstractC1200a).f3187a;
        if (this.f3187a < j) {
            return -1;
        }
        return this.f3187a > j ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.f3187a == ((Abstractu) obj).f3187a;
    }

    @Override
    public final boolean mo4942g() {
        return true;
    }

    public final int hashCode() {
        return ((int) this.f3187a) ^ ((int) (this.f3187a >> 32));
    }

    @Override
    public final boolean mo5015i() {
        return ((long) ((int) this.f3187a)) == this.f3187a;
    }

    @Override
    public final int mo5016j() {
        return (int) this.f3187a;
    }

    @Override
    public final long mo5017k() {
        return this.f3187a;
    }
}
