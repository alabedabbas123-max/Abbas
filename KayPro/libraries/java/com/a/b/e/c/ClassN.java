package com.a.b.e.c;

import com.a.b.e.d.ClassC;

public final class ClassN extends Abstractx {
    public ClassN(ae c1205ae, aa c1201aa) {
        super(c1205ae, c1201aa);
    }

    public static ClassN m4999a(ClassC c1236c) {
        return new ClassN(ae.m4962a(c1236c), aa.f3122a);
    }

    @Override
    public ClassC mo3825a() {
        return m5023o().m4946c();
    }

    @Override
    protected int mo4941b(Abstracta abstractC1200a) {
        int iMo4941b = super.mo4941b(abstractC1200a);
        return iMo4941b != 0 ? iMo4941b : m5023o().m4945b().compareTo(((ClassN) abstractC1200a).m5023o().m4945b());
    }

    @Override
    public String mo4943h() {
        return "field";
    }
}
