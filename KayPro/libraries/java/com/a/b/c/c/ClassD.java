package com.a.b.c.c;

import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;

public final class ClassD extends Abstractat {

    private ClassC f2430a;

    public ClassD(ClassC c1096c) {
        super(4, 4);
        if (c1096c == null) {
            throw new NullPointerException("annotations == null");
        }
        this.f2430a = c1096c;
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        this.f2430a = (ClassC) c1113t.m4674d().m4514b(this.f2430a);
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        int iE = this.f2430a.m4523e();
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(4, "  annotations_off: " + ClassK.m5480a(iE));
        }
        interfaceC1303a.mo5457d(iE);
    }

    @Override
    public String mo4474b() {
        return this.f2430a.mo4474b();
    }
}
