package org.c.a.a.b.c;

import org.c.a.a.b.f.Abstracta;
import org.c.a.a.b.f.ClassH;

public class aa extends Abstracta {

    static final boolean f5580b;

    public int f5581a = 0;

    static {
        f5580b = !ClassZ.class.desiredAssertionStatus();
    }

    protected aa() {
    }

    @Override
    public void mo7711a(ClassH c2074h) {
        this.f5581a++;
        if (!f5580b && c2074h.m8195a() != 0) {
            throw new AssertionError("LineNumberToken cannot have a known line number. Uses 'LineNumberTokensFragment' instead");
        }
    }
}
