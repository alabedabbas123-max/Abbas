package org.a.a.a.a;

import org.a.a.a.c.ClassJ;

public final class az extends Abstractbl {

    public final int f5163a;

    public final int f5164b;

    public az(Abstractn abstractC1738n, int i, int i2) {
        super(abstractC1738n);
        this.f5163a = i;
        this.f5164b = i2;
    }

    @Override
    public int mo7286a() {
        return 2;
    }

    @Override
    public boolean mo7287a(int i, int i2, int i3) {
        return i >= this.f5163a && i <= this.f5164b;
    }

    @Override
    public ClassJ mo7302c() {
        return ClassJ.m7396a(this.f5163a, this.f5164b);
    }

    public String toString() {
        return new StringBuilder("'").appendCodePoint(this.f5163a).append("'..'").appendCodePoint(this.f5164b).append("'").toString();
    }
}
