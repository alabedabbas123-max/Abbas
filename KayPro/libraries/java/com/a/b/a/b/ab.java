package com.a.b.a.b;

import com.a.b.a.e.Interfaceh;
import com.a.b.c.ClassA;
import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ab;
import com.a.b.e.b.ac;
import com.a.b.e.b.ad;
import com.a.b.e.b.af;
import com.a.b.e.b.ag;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassD;
import com.a.b.e.b.ClassM;
import com.a.b.e.b.ClassR;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.b.Interfaceah;
import com.a.b.e.b.Interfacec;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassP;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassD;
import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

public final class ab {

    private final ClassO f1780a;

    private final ClassG f1781b;

    private final int f1782c;

    private final int f1783d;

    private final ak f1784e;

    private final am f1785f;

    private final ClassQ[] f1786g;

    private final ArrayList f1787h;

    private final ArrayList f1788i;

    private final ae[] f1789j;

    private boolean f1790k;

    private final ai[] f1791l;

    private boolean f1792m;

    private final ag f1793n;

    private ab(ClassO c0943o, Interfaceah interfaceC1174ah, Interfaceh interfaceC0973h, ClassA c0984a) {
        if (c0943o == null) {
            throw new NullPointerException("method == null");
        }
        if (interfaceC1174ah == null) {
            throw new NullPointerException("advice == null");
        }
        this.f1780a = c0943o;
        this.f1781b = ClassB.m3948a(c0943o);
        this.f1783d = this.f1781b.m5515j();
        this.f1782c = c0943o.m4007l();
        this.f1784e = new ak(this, c0943o, interfaceC1174ah, interfaceC0973h);
        this.f1785f = new am(this.f1784e, c0943o, c0984a);
        this.f1786g = new ClassQ[this.f1783d];
        this.f1791l = new ai[this.f1783d];
        this.f1787h = new ArrayList((this.f1781b.m5476d_() * 2) + 10);
        this.f1788i = new ArrayList((this.f1781b.m5476d_() * 2) + 10);
        this.f1789j = new ae[this.f1783d];
        this.f1790k = false;
        this.f1786g[0] = new ClassQ(this.f1782c, c0943o.m4006k());
        this.f1793n = new ag(this);
    }

    private int m3832a(int i) {
        return this.f1783d + this.f1780a.m4009n().m5476d_() + (i ^ (-1));
    }

    public static ab m3834a(ClassO c0943o, Interfaceah interfaceC1174ah, Interfaceh interfaceC0973h, ClassA c0984a) {
        try {
            ab c0915ab = new ab(c0943o, interfaceC1174ah, interfaceC0973h, c0984a);
            c0915ab.m3865i();
            return c0915ab.m3864h();
        } catch (al e) {
            e.m3757a("...while working on method " + c0943o.mo3999d().mo3828d());
            throw e;
        }
    }

    public ClassM m3837a(ClassM c1186m) {
        int i;
        int i2 = 0;
        int iD_ = c1186m.m5476d_();
        int i3 = 0;
        for (int i4 = 0; i4 < iD_; i4++) {
            if (c1186m.m4847a(i4).m4840f() != ac.f3029g) {
                i3++;
            }
        }
        if (i3 == iD_) {
            return c1186m;
        }
        ClassM c1186m2 = new ClassM(i3);
        int i5 = 0;
        while (i5 < iD_) {
            Abstractj abstractC1183jM4847a = c1186m.m4847a(i5);
            if (abstractC1183jM4847a.m4840f() != ac.f3029g) {
                i = i2 + 1;
                c1186m2.m4848a(i2, abstractC1183jM4847a);
            } else {
                i = i2;
            }
            i5++;
            i2 = i;
        }
        c1186m2.mo3944c_();
        return c1186m2;
    }

    public void m3838a(int i, int i2, ai c0922ai, ClassQ c0945q, int[] iArr) {
        ClassQ c0945q2 = this.f1786g[i];
        if (c0945q2 == null) {
            if (c0922ai != null) {
                this.f1786g[i] = c0945q.m4036b(i, i2);
            } else {
                this.f1786g[i] = c0945q;
            }
            ClassD.m5424b(iArr, i);
            return;
        }
        ClassQ c0945qM4031a = c0922ai != null ? c0945q2.m4031a(c0945q, c0922ai.m3882a(), i2) : c0945q2.m4030a(c0945q);
        if (c0945qM4031a != c0945q2) {
            this.f1786g[i] = c0945qM4031a;
            ClassD.m5424b(iArr, i);
        }
    }

    private void m3839a(int i, Interfacec interfaceC1176c) {
        m3843a(m3856c(i), interfaceC1176c, new BitSet(this.f1783d));
    }

    private void m3842a(ClassF c0934f, ClassQ c0945q, int[] iArr) {
        int iM5496b;
        ClassN c1316n;
        int i;
        ClassN c1316nM5493a;
        int iM5497b;
        ClassN c1316n2;
        ClassN c1316nM5493a2;
        ClassH c0936hM3965e = c0934f.m3965e();
        this.f1784e.m3896a(c0936hM3965e.m3974a_());
        ClassQ c0945qM4028a = c0945q.m4028a();
        this.f1785f.m3926a(c0934f, c0945qM4028a);
        c0945qM4028a.m4037b();
        int iM3903s = this.f1784e.m3903s();
        ArrayList arrayListM3897m = this.f1784e.m3897m();
        int size = arrayListM3897m.size();
        int iD_ = c0936hM3965e.m5476d_();
        ClassN c1316nM3964d = c0934f.m3964d();
        ai c0922ai = null;
        if (this.f1784e.m3905u()) {
            iM5496b = 1;
            int iM5497b2 = c1316nM3964d.m5497b(1);
            if (this.f1791l[iM5497b2] == null) {
                this.f1791l[iM5497b2] = new ai(this, iM5497b2);
            }
            this.f1791l[iM5497b2].m3886b(c0934f.mo3961a());
            c0922ai = this.f1791l[iM5497b2];
            c1316n = c1316nM3964d;
        } else if (this.f1784e.m3906v()) {
            int iM3831g = this.f1784e.m3907w().m3831g();
            if (this.f1791l[iM3831g] == null) {
                this.f1791l[iM3831g] = new ai(this, iM3831g, c0934f.mo3961a());
            } else {
                this.f1791l[iM3831g].m3883a(c0934f.mo3961a());
            }
            ClassN c1316nM3885b = this.f1791l[iM3831g].m3885b();
            this.f1791l[iM3831g].m3884a(c0945qM4028a, iArr);
            iM5496b = c1316nM3885b.m5496b();
            c1316n = c1316nM3885b;
        } else if (this.f1784e.m3900p()) {
            iM5496b = iD_;
            c1316n = c1316nM3964d;
        } else {
            iM5496b = 0;
            c1316n = c1316nM3964d;
        }
        int iM5496b2 = c1316n.m5496b();
        for (int i2 = iM5496b; i2 < iM5496b2; i2++) {
            int iM5497b3 = c1316n.m5497b(i2);
            try {
                m3838a(iM5497b3, c0934f.mo3961a(), c0922ai, c0945qM4028a, iArr);
            } catch (al e) {
                e.m3757a("...while merging to block " + ClassK.m5485c(iM5497b3));
                throw e;
            }
        }
        if (iM5496b2 == 0 && this.f1784e.m3901q()) {
            i = 1;
            c1316nM5493a = ClassN.m5493a(m3832a(-2));
        } else {
            i = iM5496b2;
            c1316nM5493a = c1316n;
        }
        if (i == 0) {
            iM5497b = -1;
        } else {
            int iM3902r = this.f1784e.m3902r();
            iM5497b = iM3902r >= 0 ? c1316nM5493a.m5497b(iM3902r) : iM3902r;
        }
        boolean z = m3859d() && this.f1784e.m3904t();
        if (z || iD_ != 0) {
            ClassN c1316n3 = new ClassN(i);
            boolean z2 = false;
            int i3 = 0;
            while (i3 < iD_) {
                ClassI c0937iM3971a = c0936hM3965e.m3971a(i3);
                ae c1205aeM3981d = c0937iM3971a.m3981d();
                int iM3980c = c0937iM3971a.m3980c();
                boolean z3 = z2 | (c1205aeM3981d == ae.f3130a);
                try {
                    m3838a(iM3980c, c0934f.mo3961a(), null, c0945qM4028a.m4032a(c1205aeM3981d), iArr);
                    ae c0918ae = this.f1789j[iM3980c];
                    if (c0918ae == null) {
                        c0918ae = new ae(this, null);
                        this.f1789j[iM3980c] = c0918ae;
                    }
                    c1316n3.m5499c(c0918ae.m3875a(c1205aeM3981d.m4966i()).m3878b());
                    i3++;
                    z2 = z3;
                } catch (al e2) {
                    e2.m3757a("...while merging exception to block " + ClassK.m5485c(iM3980c));
                    throw e2;
                }
            }
            if (z && !z2) {
                c1316n3.m5499c(m3832a(-6));
                this.f1790k = true;
                for (int i4 = (size - iM3903s) - 1; i4 < size; i4++) {
                    Abstractj abstractC1183j = (Abstractj) arrayListM3897m.get(i4);
                    if (abstractC1183j.m4845k()) {
                        arrayListM3897m.set(i4, abstractC1183j.mo4803a(ClassC.f3267r));
                    }
                }
            }
            if (iM5497b >= 0) {
                c1316n3.m5499c(iM5497b);
            }
            c1316n3.mo3944c_();
            c1316n2 = c1316n3;
        } else {
            c1316n2 = c1316nM5493a;
        }
        int iM5505f = c1316n2.m5505f(iM5497b);
        int i5 = iM5497b;
        ClassN c1316nM5506f = c1316n2;
        int i6 = iM3903s;
        int i7 = size;
        while (i6 > 0) {
            int i8 = i7 - 1;
            Abstractj abstractC1183j2 = (Abstractj) arrayListM3897m.get(i8);
            boolean z4 = abstractC1183j2.m4840f().m4740d() == 1;
            ClassM c1186m = new ClassM(z4 ? 2 : 1);
            c1186m.m4848a(0, abstractC1183j2);
            if (z4) {
                c1186m.m4848a(1, (Abstractj) new ClassS(ac.f3041s, abstractC1183j2.m4841g(), (ClassU) null, ClassX.f3113a));
                c1316nM5493a2 = ClassN.m5493a(i5);
            } else {
                c1316nM5493a2 = c1316nM5506f;
            }
            c1186m.mo3944c_();
            int iM3854c = m3854c();
            m3844a(new ClassB(iM3854c, c1186m, c1316nM5493a2, i5), c0945qM4028a.m4040e());
            c1316nM5506f = c1316nM5506f.m5506f();
            c1316nM5506f.m5498b(iM5505f, iM3854c);
            c1316nM5506f.mo3944c_();
            i5 = iM3854c;
            i6--;
            i7 = i8;
        }
        Abstractj abstractC1183j3 = i7 == 0 ? null : (Abstractj) arrayListM3897m.get(i7 - 1);
        if (abstractC1183j3 == null || abstractC1183j3.m4840f().m4740d() == 1) {
            arrayListM3897m.add(new ClassS(ac.f3041s, abstractC1183j3 == null ? ad.f3049a : abstractC1183j3.m4841g(), (ClassU) null, ClassX.f3113a));
            i7++;
        }
        ClassM c1186m2 = new ClassM(i7);
        for (int i9 = 0; i9 < i7; i9++) {
            c1186m2.m4848a(i9, (Abstractj) arrayListM3897m.get(i9));
        }
        c1186m2.mo3944c_();
        m3853b(new ClassB(c0934f.mo3961a(), c1186m2, c1316nM5506f, i5), c0945qM4028a.m4040e());
    }

    private void m3843a(ClassB c1175b, Interfacec interfaceC1176c, BitSet bitSet) {
        int iM3849b;
        interfaceC1176c.mo3874a(c1175b);
        bitSet.set(c1175b.mo3961a());
        ClassN c1316nM4814c = c1175b.m4814c();
        int iM5496b = c1316nM4814c.m5496b();
        for (int i = 0; i < iM5496b; i++) {
            int iM5497b = c1316nM4814c.m5497b(i);
            if (!bitSet.get(iM5497b) && ((!m3847a(c1175b) || i <= 0) && (iM3849b = m3849b(iM5497b)) >= 0)) {
                m3843a((ClassB) this.f1787h.get(iM3849b), interfaceC1176c, bitSet);
            }
        }
    }

    public void m3844a(ClassB c1175b, ClassN c1316n) {
        if (c1175b == null) {
            throw new NullPointerException("block == null");
        }
        this.f1787h.add(c1175b);
        c1316n.m5519m();
        this.f1788i.add(c1316n);
    }

    public boolean m3847a(ClassB c1175b) {
        int iM5497b;
        ClassN c1316nM4814c = c1175b.m4814c();
        return c1316nM4814c.m5496b() >= 2 && (iM5497b = c1316nM4814c.m5497b(1)) < this.f1791l.length && this.f1791l[iM5497b] != null;
    }

    private int m3848b() {
        return this.f1783d + this.f1780a.m4009n().m5476d_() + 7;
    }

    private int m3849b(int i) {
        int size = this.f1787h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ClassB) this.f1787h.get(i2)).mo3961a() == i) {
                return i2;
            }
        }
        return -1;
    }

    private boolean m3853b(ClassB c1175b, ClassN c1316n) {
        boolean z;
        if (c1175b == null) {
            throw new NullPointerException("block == null");
        }
        int iM3849b = m3849b(c1175b.mo3961a());
        if (iM3849b < 0) {
            z = false;
        } else {
            m3858d(iM3849b);
            z = true;
        }
        this.f1787h.add(c1175b);
        c1316n.m5519m();
        this.f1788i.add(c1316n);
        return z;
    }

    private int m3854c() {
        int iM3848b = m3848b();
        Iterator it = this.f1787h.iterator();
        int i = iM3848b;
        while (it.hasNext()) {
            int iMo3961a = ((ClassB) it.next()).mo3961a();
            if (iMo3961a >= i) {
                i = iMo3961a + 1;
            }
        }
        return i;
    }

    public ClassB m3856c(int i) {
        int iM3849b = m3849b(i);
        if (iM3849b < 0) {
            throw new IllegalArgumentException("no such label " + ClassK.m5485c(i));
        }
        return (ClassB) this.f1787h.get(iM3849b);
    }

    public boolean m3857c(ClassB c1175b, ClassN c1316n) {
        boolean z;
        if (c1175b == null) {
            throw new NullPointerException("block == null");
        }
        int iM3849b = m3849b(c1175b.mo3961a());
        if (iM3849b < 0) {
            z = false;
        } else {
            this.f1787h.remove(iM3849b);
            this.f1788i.remove(iM3849b);
            z = true;
        }
        this.f1787h.add(c1175b);
        c1316n.m5519m();
        this.f1788i.add(c1316n);
        return z;
    }

    private void m3858d(int i) {
        int iM3848b = m3848b();
        ClassN c1316nM4814c = ((ClassB) this.f1787h.get(i)).m4814c();
        int iM5496b = c1316nM4814c.m5496b();
        this.f1787h.remove(i);
        this.f1788i.remove(i);
        for (int i2 = 0; i2 < iM5496b; i2++) {
            int iM5497b = c1316nM4814c.m5497b(i2);
            if (iM5497b >= iM3848b) {
                int iM3849b = m3849b(iM5497b);
                if (iM3849b < 0) {
                    throw new RuntimeException("Invalid label " + ClassK.m5485c(iM5497b));
                }
                m3858d(iM3849b);
            }
        }
    }

    private boolean m3859d() {
        return (this.f1780a.mo4002g() & 32) != 0;
    }

    public ai m3860e(int i) {
        for (int length = this.f1791l.length - 1; length >= 0; length--) {
            if (this.f1791l[length] != null) {
                ai c0922ai = this.f1791l[length];
                if (c0922ai.f1807c.get(i)) {
                    return c0922ai;
                }
            }
        }
        return null;
    }

    private boolean m3861e() {
        return (this.f1780a.mo4002g() & 8) != 0;
    }

    private int m3862f() {
        return this.f1782c + this.f1780a.m4006k();
    }

    private ClassU m3863g() {
        int iM3862f = m3862f();
        return ClassU.m4876a(iM3862f >= 1 ? iM3862f : 1, ClassC.f3267r);
    }

    private ab m3864h() {
        int size = this.f1787h.size();
        ClassD c1177d = new ClassD(size);
        for (int i = 0; i < size; i++) {
            c1177d.m4823a(i, (ClassB) this.f1787h.get(i));
        }
        c1177d.mo3944c_();
        return new ab(c1177d, m3832a(-1));
    }

    private void m3865i() {
        int[] iArrM5423a = ClassD.m5423a(this.f1783d);
        ClassD.m5424b(iArrM5423a, 0);
        m3867k();
        m3866j();
        while (true) {
            int iM5428d = ClassD.m5428d(iArrM5423a, 0);
            if (iM5428d < 0) {
                break;
            }
            ClassD.m5427c(iArrM5423a, iM5428d);
            try {
                m3842a(this.f1781b.m3968b(iM5428d), this.f1786g[iM5428d], iArrM5423a);
            } catch (al e) {
                e.m3757a("...while working on block " + ClassK.m5485c(iM5428d));
                throw e;
            }
        }
        m3868l();
        m3869m();
        m3870n();
        if (this.f1792m) {
            m3871o();
        }
    }

    private void m3866j() {
        this.f1786g[0].m4034a(this.f1780a.mo4005j().m5042c());
        this.f1786g[0].m4037b();
    }

    private void m3867k() {
        ClassM c1186m;
        ClassT c0948tM4010o = this.f1780a.m4010o();
        ad c1170adM3995a = this.f1780a.m3995a(0);
        ClassB c1235bM5042c = this.f1780a.mo4005j().m5042c();
        int iD_ = c1235bM5042c.m5476d_();
        ClassM c1186m2 = new ClassM(iD_ + 1);
        int i = 0;
        int iM5066j = 0;
        while (i < iD_) {
            ClassC c1236cM5053b = c1235bM5042c.m5053b(i);
            ClassU c0949uM4051a = c0948tM4010o.m4051a(0, iM5066j);
            c1186m2.m4848a(i, (Abstractj) new ClassR(ac.m4758b(c1236cM5053b), c1170adM3995a, c0949uM4051a == null ? ClassU.m4876a(iM5066j, c1236cM5053b) : ClassU.m4881b(iM5066j, c1236cM5053b, c0949uM4051a.m4058a()), ClassX.f3113a, ClassP.m5001a(iM5066j)));
            i++;
            iM5066j += c1236cM5053b.m5066j();
        }
        c1186m2.m4848a(iD_, (Abstractj) new ClassS(ac.f3041s, c1170adM3995a, (ClassU) null, ClassX.f3113a));
        c1186m2.mo3944c_();
        boolean zM3859d = m3859d();
        int iM3832a = zM3859d ? m3832a(-4) : 0;
        m3844a(new ClassB(m3832a(-1), c1186m2, ClassN.m5493a(iM3832a), iM3832a), ClassN.f3497a);
        if (zM3859d) {
            ClassU c1194uM3863g = m3863g();
            if (m3861e()) {
                af c1172af = new af(ac.f3039q, c1170adM3995a, ClassX.f3113a, ClassB.f3210a, this.f1780a.mo4004i());
                ClassM c1186m3 = new ClassM(1);
                c1186m3.m4848a(0, (Abstractj) c1172af);
                c1186m = c1186m3;
            } else {
                ClassM c1186m4 = new ClassM(2);
                c1186m4.m4848a(0, (Abstractj) new ClassR(ac.f3034l, c1170adM3995a, c1194uM3863g, ClassX.f3113a, ClassP.f3171b));
                c1186m4.m4848a(1, (Abstractj) new ClassS(ac.f3041s, c1170adM3995a, (ClassU) null, ClassX.f3113a));
                c1186m = c1186m4;
            }
            int iM3832a2 = m3832a(-5);
            c1186m.mo3944c_();
            m3844a(new ClassB(iM3832a, c1186m, ClassN.m5493a(iM3832a2), iM3832a2), ClassN.f3497a);
            ClassM c1186m5 = new ClassM(m3861e() ? 2 : 1);
            if (m3861e()) {
                c1186m5.m4848a(0, (Abstractj) new ClassS(ac.m4767e(c1194uM3863g), c1170adM3995a, c1194uM3863g, ClassX.f3113a));
            }
            c1186m5.m4848a(m3861e() ? 1 : 0, (Abstractj) new ag(ac.f2926bE, c1170adM3995a, ClassX.m4909a(c1194uM3863g), ClassB.f3210a));
            c1186m5.mo3944c_();
            m3844a(new ClassB(iM3832a2, c1186m5, ClassN.m5493a(0), 0), ClassN.f3497a);
        }
    }

    private void m3868l() {
        int iM3832a;
        aa c1167aaM3898n = this.f1784e.m3898n();
        if (c1167aaM3898n == null) {
            return;
        }
        ad c1170adM3899o = this.f1784e.m3899o();
        int iM3832a2 = m3832a(-2);
        if (m3859d()) {
            ClassM c1186m = new ClassM(1);
            c1186m.m4848a(0, (Abstractj) new ag(ac.f2927bF, c1170adM3899o, ClassX.m4909a(m3863g()), ClassB.f3210a));
            c1186m.mo3944c_();
            iM3832a = m3832a(-3);
            m3844a(new ClassB(iM3832a2, c1186m, ClassN.m5493a(iM3832a), iM3832a), ClassN.f3497a);
        } else {
            iM3832a = iM3832a2;
        }
        ClassM c1186m2 = new ClassM(1);
        Interfacee interfaceC1238eM4739c = c1167aaM3898n.m4739c();
        c1186m2.m4848a(0, (Abstractj) new ClassS(c1167aaM3898n, c1170adM3899o, (ClassU) null, interfaceC1238eM4739c.mo4148d_() == 0 ? ClassX.f3113a : ClassX.m4909a(ClassU.m4876a(0, interfaceC1238eM4739c.mo4145a(0)))));
        c1186m2.mo3944c_();
        m3844a(new ClassB(iM3832a, c1186m2, ClassN.f3497a, -1), ClassN.f3497a);
    }

    private void m3869m() {
        if (this.f1790k) {
            ad c1170adM3995a = this.f1780a.m3995a(0);
            ClassU c1194uM4876a = ClassU.m4876a(0, ClassC.f3270u);
            ClassM c1186m = new ClassM(2);
            c1186m.m4848a(0, (Abstractj) new ClassS(ac.m4761c(ClassC.f3270u), c1170adM3995a, c1194uM4876a, ClassX.f3113a));
            c1186m.m4848a(1, (Abstractj) new ag(ac.f2927bF, c1170adM3995a, ClassX.m4909a(m3863g()), ClassB.f3210a));
            c1186m.mo3944c_();
            int iM3832a = m3832a(-7);
            m3844a(new ClassB(m3832a(-6), c1186m, ClassN.m5493a(iM3832a), iM3832a), ClassN.f3497a);
            ClassM c1186m2 = new ClassM(1);
            c1186m2.m4848a(0, (Abstractj) new ag(ac.f2925bD, c1170adM3995a, ClassX.m4909a(c1194uM4876a), ClassB.f3210a));
            c1186m2.mo3944c_();
            m3844a(new ClassB(iM3832a, c1186m2, ClassN.f3497a, -1), ClassN.f3497a);
        }
    }

    private void m3870n() {
        int length = this.f1789j.length;
        for (int i = 0; i < length; i++) {
            ae c0918ae = this.f1789j[i];
            if (c0918ae != null) {
                for (af c0919af : c0918ae.m3876a()) {
                    ad c1170adM4841g = m3856c(i).m4817f().m4841g();
                    ClassM c1186m = new ClassM(2);
                    c1186m.m4848a(0, (Abstractj) new ClassS(ac.m4761c(c0919af.m3877a()), c1170adM4841g, ClassU.m4876a(this.f1782c, c0919af.m3877a()), ClassX.f3113a));
                    c1186m.m4848a(1, (Abstractj) new ClassS(ac.f3041s, c1170adM4841g, (ClassU) null, ClassX.f3113a));
                    c1186m.mo3944c_();
                    m3844a(new ClassB(c0919af.m3878b(), c1186m, ClassN.m5493a(i), i), this.f1786g[i].m4040e());
                }
            }
        }
    }

    private void m3871o() {
        ClassN c1316n = new ClassN(4);
        m3839a(0, new ac(this, c1316n));
        int iM3854c = m3854c();
        ArrayList arrayList = new ArrayList(iM3854c);
        for (int i = 0; i < iM3854c; i++) {
            arrayList.add(null);
        }
        for (int i2 = 0; i2 < this.f1787h.size(); i2++) {
            ClassB c1175b = (ClassB) this.f1787h.get(i2);
            if (c1175b != null) {
                arrayList.set(c1175b.mo3961a(), (ClassN) this.f1788i.get(i2));
            }
        }
        int iM5496b = c1316n.m5496b();
        for (int i3 = 0; i3 < iM5496b; i3++) {
            new aj(this, new ah(m3854c()), arrayList).m3890a(m3856c(c1316n.m5497b(i3)));
        }
        m3872p();
    }

    private void m3872p() {
        ClassN c1316n = new ClassN(this.f1787h.size());
        this.f1788i.clear();
        m3839a(m3832a(-1), new ad(this, c1316n));
        c1316n.m5508g();
        for (int size = this.f1787h.size() - 1; size >= 0; size--) {
            if (c1316n.m5505f(((ClassB) this.f1787h.get(size)).mo3961a()) < 0) {
                this.f1787h.remove(size);
            }
        }
    }

    int m3873a() {
        int iM3862f = m3862f();
        return m3859d() ? iM3862f + 1 : iM3862f;
    }
}
