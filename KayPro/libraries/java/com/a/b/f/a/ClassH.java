package com.a.b.f.a;

import com.a.b.e.b.ab;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassD;
import com.a.b.g.ClassN;
import java.util.BitSet;

public class ClassH {

    private final ab f3303a;

    private final ClassD f3304b;

    private final ClassD f3305c;

    public ClassH(ab c1168ab) {
        this.f3303a = c1168ab;
        this.f3304b = this.f3303a.m4746a();
        this.f3305c = this.f3304b.m4829h();
    }

    private void m5126a(int i, ClassN c1316n) {
        int iM5496b = c1316n.m5496b();
        for (int i2 = 0; i2 < iM5496b; i2++) {
            int iM5497b = c1316n.m5497b(i2);
            ClassN c1316nM4747a = this.f3303a.m4747a(this.f3304b.m4825b(iM5497b).mo3961a());
            int iM5496b2 = c1316nM4747a.m5496b();
            for (int i3 = 0; i3 < iM5496b2; i3++) {
                m5127a(this.f3305c.m4825b(c1316nM4747a.m5497b(i3)), iM5497b, i);
            }
        }
    }

    private void m5127a(ClassB c1175b, int i, int i2) {
        ClassN c1316nM5506f = c1175b.m4814c().m5506f();
        c1316nM5506f.m5498b(c1316nM5506f.m5505f(i), i2);
        int iM4815d = c1175b.m4815d();
        if (iM4815d != i) {
            i2 = iM4815d;
        }
        c1316nM5506f.mo3944c_();
        this.f3305c.m4823a(this.f3305c.m5514c(c1175b.mo3961a()), new ClassB(c1175b.mo3961a(), c1175b.m4813b(), c1316nM5506f, i2));
    }

    private static boolean m5128a(ClassB c1175b, ClassB c1175b2) {
        return c1175b.m4813b().m4850a(c1175b2.m4813b());
    }

    public ab m5129a() {
        int iD_ = this.f3304b.m5476d_();
        BitSet bitSet = new BitSet(this.f3304b.m5515j());
        for (int i = 0; i < iD_; i++) {
            ClassB c1175bM4821a = this.f3304b.m4821a(i);
            if (!bitSet.get(c1175bM4821a.mo3961a())) {
                ClassN c1316nM4747a = this.f3303a.m4747a(c1175bM4821a.mo3961a());
                int iM5496b = c1316nM4747a.m5496b();
                for (int i2 = 0; i2 < iM5496b; i2++) {
                    int iM5497b = c1316nM4747a.m5497b(i2);
                    ClassB c1175bM4825b = this.f3304b.m4825b(iM5497b);
                    if (!bitSet.get(iM5497b) && c1175bM4825b.m4814c().m5496b() <= 1 && c1175bM4825b.m4817f().m4840f().m4737a() != 55) {
                        ClassN c1316n = new ClassN();
                        for (int i3 = i2 + 1; i3 < iM5496b; i3++) {
                            int iM5497b2 = c1316nM4747a.m5497b(i3);
                            ClassB c1175bM4825b2 = this.f3304b.m4825b(iM5497b2);
                            if (c1175bM4825b2.m4814c().m5496b() == 1 && m5128a(c1175bM4825b, c1175bM4825b2)) {
                                c1316n.m5499c(iM5497b2);
                                bitSet.set(iM5497b2);
                            }
                        }
                        m5126a(iM5497b, c1316n);
                    }
                }
            }
        }
        for (int i4 = iD_ - 1; i4 >= 0; i4--) {
            if (bitSet.get(this.f3305c.m4821a(i4).mo3961a())) {
                this.f3305c.m4823a(i4, (ClassB) null);
            }
        }
        this.f3305c.mo5479i();
        this.f3305c.mo3944c_();
        return new ab(this.f3305c, this.f3303a.m4748b());
    }
}
