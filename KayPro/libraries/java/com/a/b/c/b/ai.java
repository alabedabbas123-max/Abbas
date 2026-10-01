package com.a.b.c.b;

import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ad;
import com.a.b.e.b.ae;
import com.a.b.e.b.af;
import com.a.b.e.b.ag;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassI;
import com.a.b.e.b.ClassN;
import com.a.b.e.b.ClassR;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.b.Interfacel;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ClassP;
import com.a.b.g.ClassN;
import java.util.ArrayList;

class ai implements Interfacel {

    private final aa f2045a;

    final af f2046b;

    private ClassB f2047c;

    private ClassH f2048d;

    public ai(af c1024af, aa c1019aa) {
        this.f2046b = c1024af;
        this.f2045a = c1019aa;
    }

    private ClassU m4306a() {
        int iM4815d = this.f2047c.m4815d();
        if (iM4815d < 0) {
            return null;
        }
        Abstractj abstractC1183jM4847a = this.f2046b.f2030b.m4746a().m4825b(iM4815d).m4813b().m4847a(0);
        if (abstractC1183jM4847a.m4840f().m4737a() == 56) {
            return abstractC1183jM4847a.m4842h();
        }
        return null;
    }

    protected void m4307a(Abstractl abstractC1044l) {
        this.f2045a.m4248a(abstractC1044l);
    }

    @Override
    public void mo4301a(ae c1171ae) {
        ad c1170adG = c1171ae.m4841g();
        ClassN c1316nM4808c = c1171ae.m4808c();
        ClassN c1316nM4814c = this.f2047c.m4814c();
        int iM5496b = c1316nM4808c.m5496b();
        int iM5496b2 = c1316nM4814c.m5496b();
        int iM4815d = this.f2047c.m4815d();
        if (iM5496b != iM5496b2 - 1 || iM4815d != c1316nM4814c.m5497b(iM5496b)) {
            throw new RuntimeException("shouldn't happen");
        }
        ClassH[] c1040hArr = new ClassH[iM5496b];
        for (int i = 0; i < iM5496b; i++) {
            c1040hArr[i] = this.f2046b.f2033e.m4331a(c1316nM4814c.m5497b(i));
        }
        ClassH c1040h = new ClassH(c1170adG);
        ClassH c1040h2 = new ClassH(this.f2048d.m4380k(), true);
        al c1030al = new al(c1170adG, c1040h2, c1316nM4808c, c1040hArr);
        Abstractl c1031am = new am(c1030al.m4323c() ? ClassO.f2106S : ClassO.f2107T, c1170adG, af.m4292b(c1171ae), c1040h);
        m4307a(c1040h2);
        m4307a(c1031am);
        m4311b(new ClassZ(c1170adG));
        m4311b(c1040h);
        m4311b(c1030al);
    }

    @Override
    public void mo4302a(af c1172af) {
        ad c1170adG = c1172af.m4841g();
        ClassN c1046nM4284a = ae.m4284a(c1172af);
        aa c1167aaF = c1172af.m4840f();
        Abstracta abstractC1200aG_ = c1172af.m4833g_();
        if (c1167aaF.m4740d() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c1167aaF.m4740d());
        }
        m4307a(this.f2048d);
        if (c1167aaF.m4741e()) {
            m4307a(new ClassI(c1046nM4284a, c1170adG, c1172af.m4844j(), abstractC1200aG_));
            return;
        }
        ClassU c1194uM4306a = m4306a();
        ClassX c1197xM4293b = af.m4293b(c1172af, c1194uM4306a);
        if ((c1046nM4284a.m4396d() || c1167aaF.m4737a() == 43) != (c1194uM4306a != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c1172af);
        }
        m4307a((c1167aaF.m4737a() != 41 || c1046nM4284a.m4393a() == 35) ? new ClassI(c1046nM4284a, c1170adG, c1197xM4293b, abstractC1200aG_) : new aj(c1046nM4284a, c1170adG, c1197xM4293b));
    }

    @Override
    public void mo4303a(ag c1173ag) {
        ad c1170adG = c1173ag.m4841g();
        ClassN c1046nM4284a = ae.m4284a(c1173ag);
        if (c1173ag.m4840f().m4740d() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        ClassU c1194uM4306a = m4306a();
        if (c1046nM4284a.m4396d() != (c1194uM4306a != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c1173ag);
        }
        m4307a(this.f2048d);
        m4307a(new aj(c1046nM4284a, c1170adG, af.m4293b(c1173ag, c1194uM4306a)));
    }

    public void m4308a(ClassB c1175b, ClassH c1040h) {
        this.f2047c = c1175b;
        this.f2048d = c1040h;
    }

    @Override
    public void mo4309a(ClassI c1182i) {
        ad c1170adG = c1182i.m4841g();
        Abstracta abstractC1200aM4836e = c1182i.m4836e();
        ArrayList arrayListM4835c = c1182i.m4835c();
        if (c1182i.m4840f().m4740d() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        ClassH c1040h = new ClassH(c1170adG);
        Abstractl c0991a = new ClassA(c1170adG, this.f2048d, arrayListM4835c, abstractC1200aM4836e);
        Abstractl c1031am = new am(ClassO.f2101N, c1170adG, af.m4292b(c1182i), c1040h);
        m4307a(this.f2048d);
        m4307a(c1031am);
        m4311b(new ClassZ(c1170adG));
        m4311b(c1040h);
        m4311b(c0991a);
    }

    @Override
    public void mo4310a(ClassN c1187n) {
        ad c1170adG = c1187n.m4841g();
        ClassN c1046nM4284a = ae.m4284a(c1187n);
        aa c1167aaF = c1187n.m4840f();
        if (c1167aaF.m4740d() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c1167aaF.m4740d());
        }
        if (!c1167aaF.m4741e()) {
            throw new RuntimeException("Expected call-like operation");
        }
        m4307a(this.f2048d);
        m4307a(new ClassY(c1046nM4284a, c1170adG, c1187n.m4844j(), new Abstracta[]{c1187n.m4855e(), c1187n.m4856m()}));
    }

    @Override
    public void mo4300a(ClassR c1191r) {
        ad c1170adG = c1191r.m4841g();
        ClassN c1046nM4284a = ae.m4284a(c1191r);
        aa c1167aaF = c1191r.m4840f();
        int iM4737a = c1167aaF.m4737a();
        if (c1167aaF.m4740d() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (iM4737a != 3) {
            m4307a(new ClassI(c1046nM4284a, c1170adG, af.m4292b(c1191r), c1191r.m4833g_()));
        } else {
            if (this.f2046b.f2039k) {
                return;
            }
            ClassU c1194uH = c1191r.m4842h();
            m4307a(new aj(c1046nM4284a, c1170adG, ClassX.m4910a(c1194uH, ClassU.m4876a(((ClassP) c1191r.m4833g_()).m5002i_() + (this.f2046b.f2036h - this.f2046b.f2038j), c1194uH.mo3825a()))));
        }
    }

    @Override
    public void mo4305a(ClassS c1192s) {
        Abstractl c1031am;
        aa c1167aaF = c1192s.m4840f();
        if (c1167aaF.m4737a() == 54 || c1167aaF.m4737a() == 56) {
            return;
        }
        ad c1170adG = c1192s.m4841g();
        ClassN c1046nM4284a = ae.m4284a(c1192s);
        switch (c1167aaF.m4740d()) {
            case 1:
            case 2:
            case 6:
                c1031am = new aj(c1046nM4284a, c1170adG, af.m4292b(c1192s));
                break;
            case 3:
                return;
            case 4:
                c1031am = new am(c1046nM4284a, c1170adG, af.m4292b(c1192s), this.f2046b.f2033e.m4331a(this.f2047c.m4814c().m5497b(1)));
                break;
            case 5:
            default:
                throw new RuntimeException("shouldn't happen");
        }
        m4307a(c1031am);
    }

    protected void m4311b(Abstractl abstractC1044l) {
        this.f2045a.m4249b(abstractC1044l);
    }
}
