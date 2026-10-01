package com.a.b.f.a;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.f.ac;
import com.a.b.f.aj;
import com.a.b.f.Interfaceae;
import java.util.ArrayList;

class ClassO implements Interfaceae {

    private final ArrayList f3328a;

    public ClassO(ArrayList arrayList) {
        this.f3328a = arrayList;
    }

    @Override
    public void mo5154a(ac c1257ac) {
        ClassX c1197xMo5171b = c1257ac.mo5171b();
        ClassU c1194uO = c1257ac.m5261o();
        int iD_ = c1197xMo5171b.m5476d_();
        for (int i = 0; i < iD_; i++) {
            ((aj) this.f3328a.get(c1257ac.m5161a(i))).m5213a(c1194uO, c1197xMo5171b.m4916b(i));
        }
    }
}
