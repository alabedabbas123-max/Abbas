package com.a.b.f.a;

import com.a.b.e.b.aa;
import com.a.b.e.b.ab;
import com.a.b.e.b.ac;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassD;
import com.a.b.e.b.ClassM;
import com.a.b.f.Abstractag;
import com.a.b.f.Abstractan;
import com.a.b.f.ClassA;
import com.a.b.f.aj;
import com.a.b.f.ap;
import com.a.b.f.Interfaceal;
import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

public class ClassM {

    private final ap f3323a;

    private final boolean f3324b;

    private final ClassI f3325c;

    private ClassM(ap c1270ap, boolean z) {
        this.f3324b = z;
        this.f3323a = c1270ap;
        this.f3325c = ClassJ.m5133a(c1270ap);
    }

    private ab m5144a() {
        ClassA c1240a = new ClassA(this.f3323a, this.f3325c, this.f3324b);
        Abstractag abstractC1261agMo5117b = c1240a.mo5117b();
        this.f3323a.m5302o();
        this.f3323a.m5274a(abstractC1261agMo5117b);
        m5150c();
        if (c1240a.mo5116a()) {
            m5151d();
        }
        m5149b();
        return new ClassH(new ab(m5152e(), this.f3323a.m5272a(this.f3323a.m5287c()))).m5129a();
    }

    public static ab m5145a(ap c1270ap, boolean z) {
        return new ClassM(c1270ap, z).m5144a();
    }

    private ClassM m5146a(ArrayList arrayList) {
        int size = arrayList.size();
        ClassM c1186m = new ClassM(size);
        for (int i = 0; i < size; i++) {
            c1186m.m4848a(i, ((Abstractan) arrayList.get(i)).mo5172c());
        }
        c1186m.mo3944c_();
        return c1186m;
    }

    private void m5147a(aj c1264aj) {
        ArrayList arrayListM5222c = c1264aj.m5222c();
        aa c1167aaMo5173e = ((Abstractan) arrayListM5222c.get(arrayListM5222c.size() - 1)).mo5173e();
        if (c1167aaMo5173e.m4740d() != 2 && c1167aaMo5173e != ac.f2925bD) {
            throw new RuntimeException("Exit predecessor must end in valid exit statement.");
        }
    }

    private ClassB m5148b(aj c1264aj) {
        ClassN c1316n;
        int i = -1;
        ClassN c1316nM5236n = c1264aj.m5236n();
        int iM5234l = c1264aj.m5234l();
        aj c1264ajM5293f = this.f3323a.m5293f();
        if (!c1316nM5236n.m5509h(c1264ajM5293f == null ? -1 : c1264ajM5293f.m5228f())) {
            i = iM5234l;
            c1316n = c1316nM5236n;
        } else {
            if (c1316nM5236n.m5496b() > 1) {
                throw new RuntimeException("Exit predecessor must have no other successors" + ClassK.m5485c(c1264aj.m5228f()));
            }
            c1316n = ClassN.f3497a;
            m5147a(c1264aj);
        }
        c1316n.mo3944c_();
        return new ClassB(c1264aj.m5228f(), m5146a(c1264aj.m5222c()), c1316n, i);
    }

    private void m5149b() {
        this.f3323a.m5282a(false, (Interfaceal) new ClassN(this, this.f3323a.m5297j()));
    }

    private void m5150c() {
        ArrayList<aj> arrayListM5297j = this.f3323a.m5297j();
        for (aj c1264aj : arrayListM5297j) {
            c1264aj.m5214a(new ClassO(arrayListM5297j));
            c1264aj.m5218b();
        }
        Iterator it = arrayListM5297j.iterator();
        while (it.hasNext()) {
            ((aj) it.next()).m5241s();
        }
    }

    private void m5151d() {
        int iM5295h = this.f3323a.m5295h();
        ClassA c1239a = new ClassA(this.f3323a.m5294g());
        int iM5294g = this.f3323a.m5294g();
        for (int i = 0; i < iM5294g; i++) {
            if (i < iM5295h) {
                c1239a.mo5081a(i, (iM5294g - iM5295h) + i, 1);
            } else {
                c1239a.mo5081a(i, i - iM5295h, 1);
            }
        }
        this.f3323a.m5274a(c1239a);
    }

    private ClassD m5152e() {
        ArrayList<aj> arrayListM5297j = this.f3323a.m5297j();
        aj c1264ajM5293f = this.f3323a.m5293f();
        BitSet bitSetM5298k = this.f3323a.m5298k();
        int iCardinality = bitSetM5298k.cardinality();
        if (c1264ajM5293f != null && bitSetM5298k.get(c1264ajM5293f.m5227e())) {
            iCardinality--;
        }
        ClassD c1177d = new ClassD(iCardinality);
        int i = 0;
        for (aj c1264aj : arrayListM5297j) {
            if (bitSetM5298k.get(c1264aj.m5227e()) && c1264aj != c1264ajM5293f) {
                c1177d.m4823a(i, m5148b(c1264aj));
                i++;
            }
        }
        if (c1264ajM5293f == null || c1264ajM5293f.m5222c().isEmpty()) {
            return c1177d;
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }
}
