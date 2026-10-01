package com.a.b.f.a;

import com.a.b.e.b.ac;
import com.a.b.e.b.ad;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.f.Abstractag;
import com.a.b.f.Abstractan;
import com.a.b.f.aj;
import com.a.b.f.ap;
import com.a.b.g.Interfacem;
import java.util.ArrayList;

public abstract class Abstractl {

    protected final ap f3321a;

    protected final ClassI f3322b;

    public Abstractl(ap c1270ap, ClassI c1248i) {
        this.f3321a = c1270ap;
        this.f3322b = c1248i;
    }

    protected final ClassU m5142a(Abstractan abstractC1268an, ClassU c1194u) {
        aj c1264ajM5262p = abstractC1268an.m5262p();
        ArrayList arrayListM5222c = c1264ajM5262p.m5222c();
        int iIndexOf = arrayListM5222c.indexOf(abstractC1268an);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (iIndexOf != arrayListM5222c.size() - 1) {
            throw new IllegalArgumentException("Adding move here not supported:" + abstractC1268an.mo3828d());
        }
        ClassU c1194uM4876a = ClassU.m4876a(this.f3321a.m5301n(), c1194u.m4895h());
        arrayListM5222c.add(iIndexOf, Abstractan.m5252a(new ClassS(ac.m4751a(c1194uM4876a.mo3825a()), ad.f3049a, c1194uM4876a, ClassX.m4909a(c1194u)), c1264ajM5262p));
        int iM4894g = c1194uM4876a.m4894g();
        Interfacem interfaceC1315mMo5413b = c1264ajM5262p.m5239q().mo5413b();
        while (interfaceC1315mMo5413b.mo5415a()) {
            this.f3322b.m5131a(iM4894g, interfaceC1315mMo5413b.mo5416b());
        }
        ClassX c1197xMo5171b = abstractC1268an.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        for (int i = 0; i < iD_; i++) {
            this.f3322b.m5131a(iM4894g, c1197xMo5171b.m4916b(i).m4894g());
        }
        this.f3321a.m5299l();
        return c1194uM4876a;
    }

    public abstract boolean mo5116a();

    protected final ClassU m5143b(int i) {
        Abstractan abstractC1268anM5288c = this.f3321a.m5288c(i);
        if (abstractC1268anM5288c == null) {
            return null;
        }
        return abstractC1268anM5288c.m5261o();
    }

    public abstract Abstractag mo5117b();
}
