package com.a.b.c.a;

import com.baidu.mobstat.Config;
import com.a.a.a.ClassB;
import com.a.b.a.b.ab;
import com.a.b.a.b.al;
import com.a.b.a.b.ClassE;
import com.a.b.a.b.ClassO;
import com.a.b.a.d.ClassB;
import com.a.b.a.d.ClassE;
import com.a.b.a.d.ClassJ;
import com.a.b.a.e.Interfaced;
import com.a.b.a.e.Interfacee;
import com.a.b.a.e.Interfaceg;
import com.a.b.a.e.Interfaceh;
import com.a.b.b.a.ClassA;
import com.a.b.c.ClassA;
import com.a.b.c.b.af;
import com.a.b.c.b.ClassJ;
import com.a.b.c.c.ab;
import com.a.b.c.c.an;
import com.a.b.c.c.ap;
import com.a.b.c.c.ClassH;
import com.a.b.c.c.ClassL;
import com.a.b.c.c.ClassT;
import com.a.b.c.c.ClassW;
import com.a.b.c.c.ClassY;
import com.a.b.e.a.ClassC;
import com.a.b.e.a.ClassD;
import com.a.b.e.b.ClassA;
import com.a.b.e.b.ab;
import com.a.b.e.b.ClassG;
import com.a.b.e.b.ClassP;
import com.a.b.e.b.ClassQ;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractag;
import com.a.b.e.c.Abstractf;
import com.a.b.e.c.ac;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassG;
import com.a.b.e.c.ClassH;
import com.a.b.e.c.ClassI;
import com.a.b.e.c.ClassJ;
import com.a.b.e.c.ClassK;
import com.a.b.e.c.ClassM;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassQ;
import com.a.b.e.c.ClassR;
import com.a.b.e.c.ClassY;
import com.a.b.e.c.ClassZ;
import com.a.b.e.c.Interfaceb;
import com.a.b.e.d.ClassC;
import com.a.b.f.aa;
import java.util.Iterator;

public class ClassC {
    public static ClassL m4215a(ClassA c0982a, ClassE c0960e, byte[] bArr, ClassB c0986b, ClassA c0984a, ClassT c1113t) {
        try {
            return m4221b(c0982a, c0960e, bArr, c0986b, c0984a, c1113t);
        } catch (RuntimeException e) {
            throw ClassB.m3756a(e, "...while processing " + c0960e.m4128a());
        }
    }

    public static ClassL m4216a(String str, byte[] bArr, ClassB c0986b, ClassA c0984a, ClassT c1113t) {
        ClassE c0960e = new ClassE(bArr, str, c0986b.f1967c);
        c0960e.m4129a((ClassB) ClassJ.f1947a);
        c0960e.m4131c();
        try {
            return m4215a(ClassA.f1953a, c0960e, bArr, c0986b, c0984a, c1113t);
        } catch (al e) {
            throw new al(String.valueOf(e.getMessage()) + Config.TRACE_TODAY_VISIT_SPLIT + str);
        }
    }

    private static Abstractag m4217a(Abstractag abstractC1207ag, ClassC c1236c) {
        if (abstractC1207ag.mo3825a().equals(c1236c)) {
            return abstractC1207ag;
        }
        switch (c1236c.mo3827c()) {
            case 1:
                return ClassG.m4987a(((ClassP) abstractC1207ag).m5002i_());
            case 2:
                return ClassH.m4990a(((ClassP) abstractC1207ag).m5002i_());
            case 3:
                return ClassK.m4996a(((ClassP) abstractC1207ag).m5002i_());
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                throw new UnsupportedOperationException("can't coerce " + abstractC1207ag + " to " + c1236c);
            case 8:
                return ac.m4951a(((ClassP) abstractC1207ag).m5002i_());
        }
    }

    private static void m4218a(ClassE c0960e, ClassL c1105l, ClassT c1113t) {
        ae c1205aeM4133e = c0960e.m4133e();
        Interfacee interfaceC0970eM4137i = c0960e.m4137i();
        int iM4191d_ = interfaceC0970eM4137i.m4191d_();
        for (int i = 0; i < iM4191d_; i++) {
            Interfaced interfaceC0969dMo4190a = interfaceC0970eM4137i.mo4190a(i);
            try {
                ClassN c1221n = new ClassN(c1205aeM4133e, interfaceC0969dMo4190a.mo3999d());
                int iG = interfaceC0969dMo4190a.mo4002g();
                if (ClassA.m4732f(iG)) {
                    Abstractag abstractC1207agMo4189a = interfaceC0969dMo4190a.mo4189a();
                    ClassW c1116w = new ClassW(c1221n, iG);
                    if (abstractC1207agMo4189a != null) {
                        abstractC1207agMo4189a = m4217a(abstractC1207agMo4189a, c1221n.mo3825a());
                    }
                    c1105l.m4619a(c1116w, abstractC1207agMo4189a);
                } else {
                    c1105l.m4618a(new ClassW(c1221n, iG));
                }
                ClassC c1163cM4206a = ClassA.m4206a(interfaceC0969dMo4190a.mo4003h());
                if (c1163cM4206a.m4717b() != 0) {
                    c1105l.m4622a(c1221n, c1163cM4206a, c1113t);
                }
                c1113t.m4682l().m4478a(c1221n);
            } catch (RuntimeException e) {
                throw ClassB.m3756a(e, "...while processing " + interfaceC0969dMo4190a.mo4000e().mo3828d() + " " + interfaceC0969dMo4190a.mo4001f().mo3828d());
            }
        }
    }

    private static void m4219a(ClassA c0982a, ClassE c0960e, ClassB c0986b, ClassA c0984a, ClassL c1105l, ClassT c1113t) {
        ClassJ c1042j;
        int i;
        ab c1168abM5156a;
        ae c1205aeM4133e = c0960e.m4133e();
        Interfaceh interfaceC0973hM4138j = c0960e.m4138j();
        int iM4193d_ = interfaceC0973hM4138j.m4193d_();
        for (int i2 = 0; i2 < iM4193d_; i2++) {
            Interfaceg interfaceC0972gMo4192a = interfaceC0973hM4138j.mo4192a(i2);
            try {
                ClassZ c1233z = new ClassZ(c1205aeM4133e, interfaceC0972gMo4192a.mo3999d());
                int iG = interfaceC0972gMo4192a.mo4002g();
                boolean zM4732f = ClassA.m4732f(iG);
                boolean zM4731e = ClassA.m4731e(iG);
                boolean zM4735i = ClassA.m4735i(iG);
                boolean zM4734h = ClassA.m4734h(iG);
                boolean z = c1233z.m4984j() || c1233z.m4985k();
                if (zM4735i || zM4734h) {
                    c1042j = null;
                } else {
                    ClassO c0943o = new ClassO(interfaceC0972gMo4192a, c0960e, c0986b.f1965a != 1, c0986b.f1966b);
                    ClassG c1180g = ClassG.f3063a;
                    ab c1168abM3834a = ab.m3834a(c0943o, c1180g, interfaceC0973hM4138j, c0984a);
                    int iB = c1233z.m4982b(zM4732f);
                    String str = String.valueOf(c1205aeM4133e.m4966i().m5064h()) + "." + interfaceC0972gMo4192a.mo4000e().m4958j();
                    if (c0986b.f1968d && c0982a.f1955c.m4228a(str)) {
                        c1168abM5156a = aa.m5156a(c1168abM3834a, iB, zM4732f, c0986b.f1966b, c1180g);
                        if (c0986b.f1971g) {
                            c0982a.f1954b.m4225a(c1168abM3834a, c1168abM5156a);
                        }
                    } else {
                        c1168abM5156a = c1168abM3834a;
                        c1168abM3834a = null;
                    }
                    ClassQ c1190qM4863a = c0986b.f1966b ? ClassP.m4863a(c1168abM5156a) : null;
                    ClassJ c1042jM4287a = af.m4287a(c1168abM5156a, c0986b.f1965a, c1190qM4863a, iB, c0984a);
                    if (c0986b.f1971g && c1168abM3834a != null) {
                        m4220a(c0982a, c0986b, c0984a, c1168abM5156a, c1168abM3834a, c1190qM4863a, iB, c0943o.m4008m().m3992b());
                    }
                    c1042j = c1042jM4287a;
                }
                if (ClassA.m4733g(iG)) {
                    i = 131072 | iG;
                    if (!zM4735i) {
                        i &= -33;
                    }
                } else {
                    i = iG;
                }
                if (z) {
                    i |= 65536;
                }
                ClassY c1118y = new ClassY(c1233z, i, c1042j, ClassA.m4208a(interfaceC0972gMo4192a));
                if (c1233z.m4984j() || c1233z.m4985k() || zM4732f || zM4731e) {
                    c1105l.m4620a(c1118y);
                } else {
                    c1105l.m4625b(c1118y);
                }
                ClassC c1163cM4210b = ClassA.m4210b(interfaceC0972gMo4192a);
                if (c1163cM4210b.m4717b() != 0) {
                    c1105l.m4623a(c1233z, c1163cM4210b, c1113t);
                }
                ClassD c1164dM4212c = ClassA.m4212c(interfaceC0972gMo4192a);
                if (c1164dM4212c.m5476d_() != 0) {
                    c1105l.m4624a(c1233z, c1164dM4212c, c1113t);
                }
                c1113t.m4683m().m4506a((Abstractf) c1233z);
            } catch (RuntimeException e) {
                throw ClassB.m3756a(e, "...while processing " + interfaceC0972gMo4192a.mo4000e().mo3828d() + " " + interfaceC0972gMo4192a.mo4001f().mo3828d());
            }
        }
    }

    private static void m4220a(ClassA c0982a, ClassB c0986b, ClassA c0984a, ab c1168ab, ab c1168ab2, ClassQ c1190q, int i, int i2) {
        ClassJ c1042jM4287a = af.m4287a(c1168ab, c0986b.f1965a, c1190q, i, c0984a);
        ClassJ c1042jM4287a2 = af.m4287a(c1168ab2, c0986b.f1965a, c1190q, i, c0984a);
        ClassD c0988d = new ClassD();
        c1042jM4287a.m4359a(c0988d);
        c1042jM4287a2.m4359a(c0988d);
        c0982a.f1954b.m4224a(c1042jM4287a2, c1042jM4287a);
        c0982a.f1954b.m4223a(i2);
    }

    private static ClassL m4221b(ClassA c0982a, ClassE c0960e, byte[] bArr, ClassB c0986b, ClassA c0984a, ClassT c1113t) {
        c0982a.f1955c.m4227a(c0986b.f1969e, c0986b.f1970f);
        ClassL c1105l = new ClassL(c0960e.m4133e(), c0960e.mo4132d() & (-33), c0960e.m4134f(), c0960e.m4136h(), c0986b.f1965a == 1 ? null : c0960e.mo4141m());
        ClassC c1163cM4205a = ClassA.m4205a(c0960e, c0986b);
        if (c1163cM4205a.m4717b() != 0) {
            c1105l.m4621a(c1163cM4205a, c1113t);
        }
        ab c1061abM4682l = c1113t.m4682l();
        ap c1075apM4683m = c1113t.m4683m();
        an c1073anM4684n = c1113t.m4684n();
        ClassH c1101hM4685o = c1113t.m4685o();
        m4218a(c0960e, c1105l, c1113t);
        m4219a(c0982a, c0960e, c0986b, c0984a, c1105l, c1113t);
        Interfaceb interfaceC1209bM4135g = c0960e.m4135g();
        int iMo4970a = interfaceC1209bM4135g.mo4970a();
        for (int i = 0; i < iMo4970a; i++) {
            Abstracta abstractC1200aMo4974c = interfaceC1209bM4135g.mo4974c(i);
            if (abstractC1200aMo4974c instanceof ClassZ) {
                c1075apM4683m.m4506a((Abstractf) abstractC1200aMo4974c);
            } else if (abstractC1200aMo4974c instanceof ClassQ) {
                c1075apM4683m.m4506a((Abstractf) ((ClassQ) abstractC1200aMo4974c).m5003m());
            } else if (abstractC1200aMo4974c instanceof ClassN) {
                c1061abM4682l.m4478a((ClassN) abstractC1200aMo4974c);
            } else if (abstractC1200aMo4974c instanceof ClassM) {
                c1061abM4682l.m4478a(((ClassM) abstractC1200aMo4974c).m4998i());
            } else if (abstractC1200aMo4974c instanceof ClassY) {
                c1073anM4684n.m4502a((ClassY) abstractC1200aMo4974c);
            } else if (abstractC1200aMo4974c instanceof ClassR) {
                ClassR c1225r = (ClassR) abstractC1200aMo4974c;
                ClassE c0933eM3956a = c0960e.m4140l().m3956a(c1225r.m5009c());
                ClassI c1216iM4991a = ClassI.m4991a(c0933eM3956a.m3959a(), c1225r.m5010e(), c0933eM3956a.m3960b());
                c1225r.m5006a(c0960e.m4133e());
                c1225r.m5007a(c1216iM4991a);
                Iterator it = c1225r.m5008b().iterator();
                while (it.hasNext()) {
                    c1101hM4685o.m4599a((ClassJ) it.next());
                }
            }
        }
        return c1105l;
    }
}
