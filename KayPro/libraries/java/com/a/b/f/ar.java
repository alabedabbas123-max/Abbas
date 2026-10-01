package com.a.b.f;

import com.a.b.e.b.ClassX;

class ar implements Interfaceao {

    final ap f3385a;

    ar(ap c1270ap) {
        this.f3385a = c1270ap;
    }

    private void m5303a(Abstractan abstractC1268an) {
        ClassX c1197xMo5171b = abstractC1268an.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        for (int i = 0; i < iD_; i++) {
            this.f3385a.f3381k[c1197xMo5171b.m4916b(i).m4894g()].add(abstractC1268an);
        }
    }

    @Override
    public void mo5119a(ac c1257ac) {
        m5303a((Abstractan) c1257ac);
    }

    @Override
    public void mo5120a(ClassZ c1302z) {
        m5303a((Abstractan) c1302z);
    }

    @Override
    public void mo5121b(ClassZ c1302z) {
        m5303a((Abstractan) c1302z);
    }
}
