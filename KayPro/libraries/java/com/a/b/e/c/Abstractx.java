package com.a.b.e.c;

import org.apache.commons.io.FilenameUtils;

public abstract class Abstractx extends Abstractag {

    private final ae f3190a;

    private final aa f3191b;

    Abstractx(ae c1205ae, aa c1201aa) {
        if (c1205ae == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c1201aa == null) {
            throw new NullPointerException("nat == null");
        }
        this.f3190a = c1205ae;
        this.f3191b = c1201aa;
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        Abstractx abstractC1231x = (Abstractx) abstractC1200a;
        int iA = this.f3190a.compareTo((Abstracta) abstractC1231x.f3190a);
        return iA != 0 ? iA : this.f3191b.m4944a().compareTo(abstractC1231x.f3191b.m4944a());
    }

    @Override
    public final String mo3828d() {
        return String.valueOf(this.f3190a.mo3828d()) + FilenameUtils.EXTENSION_SEPARATOR + this.f3191b.mo3828d();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Abstractx abstractC1231x = (Abstractx) obj;
        return this.f3190a.equals(abstractC1231x.f3190a) && this.f3191b.equals(abstractC1231x.f3191b);
    }

    @Override
    public final boolean mo4942g() {
        return false;
    }

    public final int hashCode() {
        return (this.f3190a.hashCode() * 31) ^ this.f3191b.hashCode();
    }

    public final ae m5022n() {
        return this.f3190a;
    }

    public final aa m5023o() {
        return this.f3191b;
    }

    public final String toString() {
        return String.valueOf(mo4943h()) + '{' + mo3828d() + '}';
    }
}
