package com.a.b.e.c;

public abstract class Abstractt extends Abstractv {

    private final int f3186a;

    Abstractt(int i) {
        this.f3186a = i;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        int i = ((Abstractt) abstractC1200a).f3186a;
        if (this.f3186a < i) {
            return -1;
        }
        return this.f3186a > i ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.f3186a == ((Abstractt) obj).f3186a;
    }

    @Override
    public final boolean mo4942g() {
        return false;
    }

    public final int hashCode() {
        return this.f3186a;
    }

    @Override
    public final boolean mo5015i() {
        return true;
    }

    @Override
    public final int mo5016j() {
        return this.f3186a;
    }

    @Override
    public final long mo5017k() {
        return this.f3186a;
    }
}
