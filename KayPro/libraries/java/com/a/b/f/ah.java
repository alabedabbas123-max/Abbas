package com.a.b.f;

import com.a.b.e.b.Abstractf;
import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ac;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractag;
import com.a.b.e.c.ClassP;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

public class ah {

    private final ap f3345a;

    private final int f3346b;

    private final int[] f3347c;

    private final Abstracta[] f3348d;

    private final BitSet f3351g;

    private final ArrayList f3349e = new ArrayList();

    private final ArrayList f3350f = new ArrayList();

    private final ArrayList f3352h = new ArrayList();

    private final ArrayList f3353i = new ArrayList();

    private final ArrayList f3354j = new ArrayList();

    private ah(ap c1270ap) {
        this.f3345a = c1270ap;
        this.f3346b = c1270ap.m5294g();
        this.f3347c = new int[this.f3346b];
        this.f3348d = new Abstracta[this.f3346b];
        this.f3351g = new BitSet(c1270ap.m5297j().size());
        for (int i = 0; i < this.f3346b; i++) {
            this.f3347c[i] = 0;
            this.f3348d[i] = null;
        }
    }

    private Abstracta m5186a(Abstractan abstractC1268an, int i) {
        Abstracta abstractC1200aM4833g_;
        boolean z;
        int i2 = 0;
        Abstractj abstractC1183jMo5174f = abstractC1268an.mo5174f();
        int iM4737a = abstractC1268an.mo5173e().m4737a();
        ClassX c1197xMo5171b = abstractC1268an.mo5171b();
        int iM4894g = c1197xMo5171b.m4916b(0).m4894g();
        Abstracta abstractC1200a = this.f3347c[iM4894g] != 1 ? null : this.f3348d[iM4894g];
        if (c1197xMo5171b.m5476d_() == 1) {
            abstractC1200aM4833g_ = ((Abstractf) abstractC1183jMo5174f).m4833g_();
        } else {
            int iM4894g2 = c1197xMo5171b.m4916b(1).m4894g();
            abstractC1200aM4833g_ = this.f3347c[iM4894g2] != 1 ? null : this.f3348d[iM4894g2];
        }
        if (abstractC1200a == null || abstractC1200aM4833g_ == null) {
            return null;
        }
        switch (i) {
            case 6:
                int iM5002i_ = ((ClassP) abstractC1200a).m5002i_();
                int iM5002i_2 = ((ClassP) abstractC1200aM4833g_).m5002i_();
                switch (iM4737a) {
                    case 14:
                        i2 = iM5002i_2 + iM5002i_;
                        z = false;
                        break;
                    case 15:
                        if (c1197xMo5171b.m5476d_() != 1) {
                            i2 = iM5002i_ - iM5002i_2;
                            z = false;
                        } else {
                            i2 = iM5002i_2 - iM5002i_;
                            z = false;
                        }
                        break;
                    case 16:
                        i2 = iM5002i_2 * iM5002i_;
                        z = false;
                        break;
                    case 17:
                        if (iM5002i_2 != 0) {
                            i2 = iM5002i_ / iM5002i_2;
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    case 18:
                        if (iM5002i_2 != 0) {
                            i2 = iM5002i_ % iM5002i_2;
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    case 19:
                    default:
                        throw new RuntimeException("Unexpected op");
                    case 20:
                        i2 = iM5002i_2 & iM5002i_;
                        z = false;
                        break;
                    case 21:
                        i2 = iM5002i_2 | iM5002i_;
                        z = false;
                        break;
                    case 22:
                        i2 = iM5002i_2 ^ iM5002i_;
                        z = false;
                        break;
                    case 23:
                        i2 = iM5002i_ << iM5002i_2;
                        z = false;
                        break;
                    case 24:
                        i2 = iM5002i_ >> iM5002i_2;
                        z = false;
                        break;
                    case 25:
                        i2 = iM5002i_ >>> iM5002i_2;
                        z = false;
                        break;
                }
                if (z) {
                    return null;
                }
                return ClassP.m5001a(i2);
            default:
                return null;
        }
    }

    private void m5187a() {
        m5190a(this.f3345a.m5289d());
        while (true) {
            if (this.f3349e.isEmpty() && this.f3350f.isEmpty() && this.f3352h.isEmpty() && this.f3353i.isEmpty()) {
                m5194b();
                m5197c();
                return;
            }
            while (!this.f3349e.isEmpty()) {
                m5195b((aj) this.f3349e.remove(this.f3349e.size() - 1));
            }
            while (!this.f3350f.isEmpty()) {
                m5198c((aj) this.f3350f.remove(this.f3350f.size() - 1));
            }
            while (!this.f3353i.isEmpty()) {
                Abstractan abstractC1268an = (Abstractan) this.f3353i.remove(this.f3353i.size() - 1);
                if (this.f3351g.get(abstractC1268an.m5262p().m5227e())) {
                    if (abstractC1268an instanceof ac) {
                        m5189a((ac) abstractC1268an);
                    } else {
                        m5196b(abstractC1268an);
                    }
                }
            }
            while (!this.f3352h.isEmpty()) {
                Abstractan abstractC1268an2 = (Abstractan) this.f3352h.remove(this.f3352h.size() - 1);
                if (this.f3351g.get(abstractC1268an2.m5262p().m5227e())) {
                    if (abstractC1268an2 instanceof ac) {
                        m5189a((ac) abstractC1268an2);
                    } else {
                        m5196b(abstractC1268an2);
                    }
                }
            }
        }
    }

    private void m5188a(int i, int i2) {
        if (i2 == 2) {
            Iterator it = this.f3345a.m5290d(i).iterator();
            while (it.hasNext()) {
                this.f3353i.add((Abstractan) it.next());
            }
            return;
        }
        Iterator it2 = this.f3345a.m5290d(i).iterator();
        while (it2.hasNext()) {
            this.f3352h.add((Abstractan) it2.next());
        }
    }

    private void m5189a(ac c1257ac) {
        int iM4894g = c1257ac.m5261o().m4894g();
        if (this.f3347c[iM4894g] == 2) {
            return;
        }
        ClassX c1197xMo5171b = c1257ac.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        int i = 0;
        Abstracta abstractC1200a = null;
        for (int i2 = 0; i2 < iD_; i2++) {
            int iM5161a = c1257ac.m5161a(i2);
            int iM4894g2 = c1197xMo5171b.m4916b(i2).m4894g();
            int i3 = this.f3347c[iM4894g2];
            if (this.f3351g.get(iM5161a)) {
                if (i3 == 1) {
                    if (abstractC1200a != null) {
                        if (!this.f3348d[iM4894g2].equals(abstractC1200a)) {
                            i = 2;
                            break;
                        }
                    } else {
                        abstractC1200a = this.f3348d[iM4894g2];
                        i = 1;
                    }
                } else {
                    i = i3;
                    break;
                }
            }
        }
        if (m5193a(iM4894g, i, abstractC1200a)) {
            m5188a(iM4894g, i);
        }
    }

    private void m5190a(aj c1264aj) {
        if (this.f3351g.get(c1264aj.m5227e())) {
            this.f3350f.add(c1264aj);
        } else {
            this.f3349e.add(c1264aj);
            this.f3351g.set(c1264aj.m5227e());
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:94:0x0152  */
    private void m5191a(Abstractan abstractC1268an) {
        boolean z;
        boolean z2;
        Abstracta abstractC1200a;
        aa c1167aaMo5173e = abstractC1268an.mo5173e();
        ClassX c1197xMo5171b = abstractC1268an.mo5171b();
        if (c1167aaMo5173e.m4740d() == 4) {
            ClassU c1194uM4916b = c1197xMo5171b.m4916b(0);
            int iM4894g = c1194uM4916b.m4894g();
            Abstracta abstractC1200a2 = (this.f3345a.m5283a(c1194uM4916b) || this.f3347c[iM4894g] != 1) ? null : this.f3348d[iM4894g];
            if (c1197xMo5171b.m5476d_() == 2) {
                ClassU c1194uM4916b2 = c1197xMo5171b.m4916b(1);
                int iM4894g2 = c1194uM4916b2.m4894g();
                if (this.f3345a.m5283a(c1194uM4916b2) || this.f3347c[iM4894g2] != 1) {
                    abstractC1200a = null;
                } else {
                    abstractC1200a = this.f3348d[iM4894g2];
                }
            } else {
                abstractC1200a = null;
            }
            if (abstractC1200a2 != null && c1197xMo5171b.m5476d_() == 1) {
                switch (((Abstractag) abstractC1200a2).mo3827c()) {
                    case 6:
                        int iM5002i_ = ((ClassP) abstractC1200a2).m5002i_();
                        switch (c1167aaMo5173e.m4737a()) {
                            case 7:
                                z = iM5002i_ == 0;
                                z2 = true;
                                break;
                            case 8:
                                z = iM5002i_ != 0;
                                z2 = true;
                                break;
                            case 9:
                                z = iM5002i_ < 0;
                                z2 = true;
                                break;
                            case 10:
                                z = iM5002i_ >= 0;
                                z2 = true;
                                break;
                            case 11:
                                z = iM5002i_ <= 0;
                                z2 = true;
                                break;
                            case 12:
                                z = iM5002i_ > 0;
                                z2 = true;
                                break;
                            default:
                                throw new RuntimeException("Unexpected op");
                        }
                        break;
                    default:
                        z = false;
                        z2 = false;
                        break;
                }
            } else if (abstractC1200a2 != null && abstractC1200a != null) {
                switch (((Abstractag) abstractC1200a2).mo3827c()) {
                    case 6:
                        int iM5002i_2 = ((ClassP) abstractC1200a2).m5002i_();
                        int iM5002i_3 = ((ClassP) abstractC1200a).m5002i_();
                        switch (c1167aaMo5173e.m4737a()) {
                            case 7:
                                z = iM5002i_2 == iM5002i_3;
                                z2 = true;
                                break;
                            case 8:
                                z = iM5002i_2 != iM5002i_3;
                                z2 = true;
                                break;
                            case 9:
                                z = iM5002i_2 < iM5002i_3;
                                z2 = true;
                                break;
                            case 10:
                                z = iM5002i_2 >= iM5002i_3;
                                z2 = true;
                                break;
                            case 11:
                                z = iM5002i_2 <= iM5002i_3;
                                z2 = true;
                                break;
                            case 12:
                                z = iM5002i_2 > iM5002i_3;
                                z2 = true;
                                break;
                            default:
                                throw new RuntimeException("Unexpected op");
                        }
                        break;
                    default:
                        z = false;
                        z2 = false;
                        break;
                }
            } else {
                z = false;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        aj c1264ajM5262p = abstractC1268an.m5262p();
        if (z2) {
            m5190a((aj) this.f3345a.m5297j().get(z ? c1264ajM5262p.m5232j().m5497b(1) : c1264ajM5262p.m5232j().m5497b(0)));
            this.f3354j.add(abstractC1268an);
        } else {
            for (int i = 0; i < c1264ajM5262p.m5232j().m5496b(); i++) {
                m5190a((aj) this.f3345a.m5297j().get(c1264ajM5262p.m5232j().m5497b(i)));
            }
        }
    }

    public static void m5192a(ap c1270ap) {
        new ah(c1270ap).m5187a();
    }

    private boolean m5193a(int i, int i2, Abstracta abstractC1200a) {
        if (i2 != 1) {
            if (this.f3347c[i] == i2) {
                return false;
            }
            this.f3347c[i] = i2;
            return true;
        }
        if (this.f3347c[i] == i2 && this.f3348d[i].equals(abstractC1200a)) {
            return false;
        }
        this.f3347c[i] = i2;
        this.f3348d[i] = abstractC1200a;
        return true;
    }

    private void m5194b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f3346b) {
                return;
            }
            if (this.f3347c[i2] == 1 && (this.f3348d[i2] instanceof Abstractag)) {
                Abstractan abstractC1268anM5288c = this.f3345a.m5288c(i2);
                if (!abstractC1268anM5288c.m5261o().m4895h().mo3830f()) {
                    abstractC1268anM5288c.m5254b(abstractC1268anM5288c.m5261o().m4888a((Abstractag) this.f3348d[i2]));
                    for (Abstractan abstractC1268an : this.f3345a.m5290d(i2)) {
                        if (!abstractC1268an.mo5177l()) {
                            ClassZ c1302z = (ClassZ) abstractC1268an;
                            ClassX c1197xMo5171b = abstractC1268an.mo5171b();
                            int iM4918c = c1197xMo5171b.m4918c(i2);
                            c1302z.m5400a(iM4918c, c1197xMo5171b.m4916b(iM4918c).m4888a((Abstractag) this.f3348d[i2]));
                        }
                    }
                }
            }
            i = i2 + 1;
        }
    }

    private void m5195b(aj c1264aj) {
        for (Abstractan abstractC1268an : c1264aj.m5222c()) {
            if (abstractC1268an instanceof ac) {
                m5189a((ac) abstractC1268an);
            } else {
                m5196b(abstractC1268an);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    private void m5196b(Abstractan abstractC1268an) {
        int i;
        Abstracta abstractC1200aM5186a;
        Abstractj abstractC1183jMo5174f = abstractC1268an.mo5174f();
        if (abstractC1183jMo5174f.m4840f().m4740d() != 1 || abstractC1183jMo5174f.m4840f().m4741e()) {
            m5191a(abstractC1268an);
        }
        int iM4737a = abstractC1268an.mo5173e().m4737a();
        ClassU c1194uM5261o = abstractC1268an.m5261o();
        if (c1194uM5261o == null) {
            if (iM4737a != 17 && iM4737a != 18) {
                return;
            } else {
                c1194uM5261o = ((Abstractan) abstractC1268an.m5262p().m5235m().m5222c().get(0)).m5261o();
            }
        }
        int iM4894g = c1194uM5261o.m4894g();
        switch (iM4737a) {
            case 2:
                if (abstractC1268an.mo5171b().m5476d_() != 1) {
                    abstractC1200aM5186a = null;
                    i = 2;
                } else {
                    int iM4894g2 = abstractC1268an.mo5171b().m4916b(0).m4894g();
                    i = this.f3347c[iM4894g2];
                    abstractC1200aM5186a = this.f3348d[iM4894g2];
                }
                break;
            case 5:
                abstractC1200aM5186a = ((Abstractf) abstractC1183jMo5174f).m4833g_();
                i = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                abstractC1200aM5186a = m5186a(abstractC1268an, c1194uM5261o.mo3827c());
                i = abstractC1200aM5186a == null ? 2 : 1;
                break;
            case 56:
                if (this.f3347c[iM4894g] != 1) {
                    abstractC1200aM5186a = null;
                    i = 2;
                } else {
                    i = this.f3347c[iM4894g];
                    abstractC1200aM5186a = this.f3348d[iM4894g];
                }
                break;
            default:
                abstractC1200aM5186a = null;
                i = 2;
                break;
        }
        if (m5193a(iM4894g, i, abstractC1200aM5186a)) {
            m5188a(iM4894g, i);
        }
    }

    private void m5197c() {
        for (Abstractan abstractC1268an : this.f3354j) {
            aj c1264ajM5262p = abstractC1268an.m5262p();
            int iM5496b = c1264ajM5262p.m5232j().m5496b();
            int i = 0;
            int i2 = -1;
            while (i < iM5496b) {
                int iM5497b = c1264ajM5262p.m5232j().m5497b(i);
                if (this.f3351g.get(iM5497b)) {
                    iM5497b = i2;
                }
                i++;
                i2 = iM5497b;
            }
            if (iM5496b == 2 && i2 != -1) {
                c1264ajM5262p.m5220b(new ClassS(ac.f3041s, abstractC1268an.mo5174f().m4841g(), (ClassU) null, ClassX.f3113a));
                c1264ajM5262p.m5219b(i2);
            }
        }
    }

    private void m5198c(aj c1264aj) {
        for (Abstractan abstractC1268an : c1264aj.m5222c()) {
            if (!(abstractC1268an instanceof ac)) {
                return;
            } else {
                m5189a((ac) abstractC1268an);
            }
        }
    }
}
