package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassX;
import com.a.b.g.Interfacea;

public final class ClassZ extends Abstractan {
    public ClassZ(ad c1170ad) {
        super(c1170ad, ClassX.f3113a);
    }

    @Override
    public int mo4229a() {
        return m4378i() & 1;
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new ClassZ(m4380k());
    }

    @Override
    protected String mo4231a(boolean z) {
        if (mo4229a() == 0) {
            return null;
        }
        return "nop // spacer";
    }

    @Override
    public void mo4232a(Interfacea interfaceC1303a) {
        if (mo4229a() != 0) {
            interfaceC1303a.mo5456c(Abstractr.m4408a(0, 0));
        }
    }

    @Override
    protected String mo4233b() {
        return null;
    }
}
