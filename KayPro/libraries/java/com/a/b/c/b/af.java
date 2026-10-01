package com.a.b.c.b;

import com.a.b.c.ClassA;
import com.a.b.e.b.Abstractj;
import com.a.b.e.b.ab;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassD;
import com.a.b.e.b.ClassQ;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.g.ClassD;
import com.a.b.g.ClassN;

public final class af {

    private final ClassA f2029a;

    private final ab f2030b;

    private final int f2031c;

    private final ClassQ f2032d;

    private final ClassB f2033e;

    private final aa f2034f;

    private final ai f2035g;

    private final int f2036h;

    private int[] f2037i = null;

    private final int f2038j;

    private final boolean f2039k;

    private af(ab c1168ab, int i, ClassQ c1190q, int i2, ClassA c0984a) {
        this.f2029a = c0984a;
        this.f2030b = c1168ab;
        this.f2031c = i;
        this.f2032d = c1190q;
        this.f2033e = new ClassB(c1168ab);
        this.f2038j = i2;
        this.f2039k = m4291a(c1168ab, i2);
        ClassD c1177dM4746a = c1168ab.m4746a();
        int iD_ = c1177dM4746a.m5476d_();
        int iM4827f = (iD_ * 3) + c1177dM4746a.m4827f();
        iM4827f = c1190q != null ? iM4827f + c1190q.m4871b() + iD_ : iM4827f;
        this.f2036h = (this.f2039k ? 0 : this.f2038j) + c1177dM4746a.m4826e();
        this.f2034f = new aa(c0984a, iM4827f, iD_ * 3, this.f2036h, i2);
        if (c1190q != null) {
            this.f2035g = new ah(this, this.f2034f, c1190q);
        } else {
            this.f2035g = new ai(this, this.f2034f);
        }
    }

    private ClassJ m4286a() {
        m4297c();
        m4294b();
        return new ClassJ(this.f2031c, this.f2034f.m4246a(), new ak(this.f2030b, this.f2037i, this.f2033e));
    }

    public static ClassJ m4287a(ab c1168ab, int i, ClassQ c1190q, int i2, ClassA c0984a) {
        return new af(c1168ab, i, c1190q, i2, c0984a).m4286a();
    }

    private void m4290a(ClassB c1175b, int i) {
        ClassH c1040hM4332a = this.f2033e.m4332a(c1175b);
        this.f2034f.m4248a(c1040hM4332a);
        if (this.f2032d != null) {
            this.f2034f.m4248a(new ClassW(c1040hM4332a.m4380k(), this.f2032d.m4868a(c1175b)));
        }
        this.f2035g.m4308a(c1175b, this.f2033e.m4333b(c1175b));
        c1175b.m4813b().m4849a(this.f2035g);
        this.f2034f.m4248a(this.f2033e.m4334c(c1175b));
        int iM4815d = c1175b.m4815d();
        Abstractj abstractC1183jM4818g = c1175b.m4818g();
        if (iM4815d < 0 || iM4815d == i) {
            return;
        }
        if (abstractC1183jM4818g.m4840f().m4740d() == 4 && c1175b.m4816e() == i) {
            this.f2034f.m4247a(1, this.f2033e.m4331a(iM4815d));
        } else {
            this.f2034f.m4248a(new am(ClassO.f2103P, abstractC1183jM4818g.m4841g(), ClassX.f3113a, this.f2033e.m4331a(iM4815d)));
        }
    }

    private static boolean m4291a(ab c1168ab, int i) {
        boolean[] zArr = {true};
        c1168ab.m4746a().m4824a(new ag(zArr, c1168ab.m4746a().m4826e(), i));
        return zArr[0];
    }

    public static ClassX m4292b(Abstractj abstractC1183j) {
        return m4293b(abstractC1183j, abstractC1183j.m4842h());
    }

    public static ClassX m4293b(Abstractj abstractC1183j, ClassU c1194u) {
        ClassX c1197xM4844j = abstractC1183j.m4844j();
        if (abstractC1183j.m4840f().m4742f() && c1197xM4844j.m5476d_() == 2 && c1194u.m4894g() == c1197xM4844j.m4916b(1).m4894g()) {
            c1197xM4844j = ClassX.m4910a(c1197xM4844j.m4916b(1), c1197xM4844j.m4916b(0));
        }
        return c1194u == null ? c1197xM4844j : c1197xM4844j.m4917b(c1194u);
    }

    private void m4294b() {
        ClassD c1177dM4746a = this.f2030b.m4746a();
        int[] iArr = this.f2037i;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i + 1;
            m4290a(c1177dM4746a.m4825b(iArr[i]), i2 == iArr.length ? -1 : iArr[i2]);
        }
    }

    private void m4297c() {
        int iM5497b;
        ClassD c1177dM4746a = this.f2030b.m4746a();
        int iD_ = c1177dM4746a.m5476d_();
        int iJ = c1177dM4746a.m5515j();
        int[] iArrM5423a = ClassD.m5423a(iJ);
        int[] iArrM5423a2 = ClassD.m5423a(iJ);
        for (int i = 0; i < iD_; i++) {
            ClassD.m5424b(iArrM5423a, c1177dM4746a.m4821a(i).mo3961a());
        }
        int[] iArr = new int[iD_];
        int iM4748b = this.f2030b.m4748b();
        int i2 = 0;
        while (iM4748b != -1) {
            while (true) {
                ClassN c1316nM4747a = this.f2030b.m4747a(iM4748b);
                int iM5496b = c1316nM4747a.m5496b();
                int i3 = 0;
                while (true) {
                    if (i3 >= iM5496b) {
                        break;
                    }
                    iM5497b = c1316nM4747a.m5497b(i3);
                    if (ClassD.m5421a(iArrM5423a2, iM5497b)) {
                        break;
                    }
                    if (ClassD.m5421a(iArrM5423a, iM5497b) && c1177dM4746a.m4825b(iM5497b).m4815d() == iM4748b) {
                        break;
                    } else {
                        i3++;
                    }
                }
                ClassD.m5424b(iArrM5423a2, iM5497b);
                iM4748b = iM5497b;
            }
            while (iM4748b != -1) {
                ClassD.m5427c(iArrM5423a, iM4748b);
                ClassD.m5427c(iArrM5423a2, iM4748b);
                iArr[i2] = iM4748b;
                i2++;
                ClassB c1175bM4825b = c1177dM4746a.m4825b(iM4748b);
                ClassB c1175bM4822a = c1177dM4746a.m4822a(c1175bM4825b);
                if (c1175bM4822a == null) {
                    break;
                }
                iM4748b = c1175bM4822a.mo3961a();
                int iM4815d = c1175bM4825b.m4815d();
                if (!ClassD.m5421a(iArrM5423a, iM4748b)) {
                    if (iM4815d == iM4748b || iM4815d < 0 || !ClassD.m5421a(iArrM5423a, iM4815d)) {
                        ClassN c1316nM4814c = c1175bM4825b.m4814c();
                        int iM5496b2 = c1316nM4814c.m5496b();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= iM5496b2) {
                                iM4748b = -1;
                                break;
                            }
                            iM4748b = c1316nM4814c.m5497b(i4);
                            if (ClassD.m5421a(iArrM5423a, iM4748b)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    } else {
                        iM4748b = iM4815d;
                    }
                }
            }
            i2 = i2;
            iM4748b = ClassD.m5428d(iArrM5423a, 0);
        }
        if (i2 != iD_) {
            throw new RuntimeException("shouldn't happen");
        }
        this.f2037i = iArr;
    }
}
