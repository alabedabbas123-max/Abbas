package org.c.a.a.c.a.a.d;

import java.util.HashMap;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ae;
import org.c.a.a.b.d.b.af;
import org.c.a.a.b.d.b.ag;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassP;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassY;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassP;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassL;
import org.c.a.a.d.ClassC;

public class ab extends Abstracta {

    protected ac f6170a = new ac(this);

    protected HashMap f6171b = new HashMap();

    @Override
    protected Abstractn mo8639a(Abstractn abstractC1978n) {
        ClassL c2104l;
        Abstractn abstractC1978nM8093b;
        if (abstractC1978n.getClass() != ClassY.class) {
            return abstractC1978n;
        }
        ClassY c1989y = (ClassY) abstractC1978n;
        HashMap map = (HashMap) this.f6171b.get(c1989y.m8038g().mo7963f().mo8146e());
        if (map == null || (c2104l = (ClassL) map.get(String.valueOf(c1989y.m8040j()) + c1989y.m8041l())) == null) {
            return abstractC1978n;
        }
        Interfacer interfaceC2032r = (Interfacer) c2104l.m7874g().mo7865h();
        if (interfaceC2032r.getClass() == ClassP.class) {
            abstractC1978nM8093b = ((ClassP) interfaceC2032r).m8120d();
        } else {
            if (interfaceC2032r.getClass() != ClassH.class) {
                return abstractC1978n;
            }
            abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
        }
        Class<?> cls = abstractC1978nM8093b.getClass();
        int size = c2104l.mo8295s_().size();
        if (cls == ClassQ.class) {
            ClassQ c1981q = (ClassQ) abstractC1978nM8093b;
            return new ClassQ(c1989y.mo7970e(), c1989y.mo7963f(), size == 0 ? c1981q.m8019d() : (Abstractn) c1989y.m8036d().mo7865h(), c1981q.m8020g(), c1981q.m8021i(), c1981q.m8022j());
        }
        if (cls == ClassY.class) {
            ClassY c1989y2 = (ClassY) abstractC1978nM8093b;
            if (c1989y2.m8038g().getClass() == ae.class) {
                return new ClassY(c1989y.mo7970e(), c1989y2.mo7963f(), c1989y2.m8038g(), c1989y2.m8039i(), c1989y2.m8040j(), c1989y2.m8041l(), c1989y.m8036d());
            }
            Interfacef c1980p = null;
            Interfacef interfaceC1970fM8036d = c1989y.m8036d();
            if (interfaceC1970fM8036d != null) {
                switch (interfaceC1970fM8036d.size()) {
                    case 0:
                    case 1:
                        break;
                    case 2:
                        c1980p = (Interfacef) interfaceC1970fM8036d.mo7868l_().get(1);
                        break;
                    default:
                        ClassC c2247cL_ = interfaceC1970fM8036d.mo7868l_();
                        c1980p = new ClassP(c2247cL_.subList(1, c2247cL_.size()));
                        break;
                }
            }
            return new ClassY(c1989y.mo7970e(), c1989y2.mo7963f(), (Abstractn) interfaceC1970fM8036d.mo7865h(), c1989y2.m8039i(), c1989y2.m8040j(), c1989y2.m8041l(), c1980p);
        }
        if (cls == ClassG.class) {
            ClassG c1971g = (ClassG) abstractC1978nM8093b;
            ClassQ c1981q2 = (ClassQ) c1971g.m8000d();
            if (size == 1) {
                return new ClassG(c1989y.mo7970e(), c1989y.mo7963f(), new ClassQ(c1981q2.mo7963f(), c1981q2.m8019d(), c1981q2.m8020g(), c1981q2.m8021i(), c1981q2.m8022j()), c1971g.m8002i(), (Abstractn) c1989y.m8036d().mo7865h(), c1971g.mo7954b());
            }
            if (size != 2) {
                return abstractC1978n;
            }
            ClassC c2247cL_2 = c1989y.m8036d().mo7868l_();
            return new ClassG(c1989y.mo7970e(), c1989y.mo7963f(), new ClassQ(c1981q2.mo7963f(), (Abstractn) c2247cL_2.get(0), c1981q2.m8020g(), c1981q2.m8021i(), c1981q2.m8022j()), c1971g.m8002i(), (Abstractn) c2247cL_2.get(1), c1971g.mo7954b());
        }
        if (cls == af.class) {
            af c1958af = (af) abstractC1978nM8093b;
            ClassQ c1981q3 = (ClassQ) c1958af.m7974g();
            return new af(c1989y.mo7970e(), new ClassQ(c1989y.mo7963f(), size == 0 ? c1981q3.m8019d() : (Abstractn) c1989y.m8036d().mo7865h(), c1981q3.m8020g(), c1981q3.m8021i(), c1981q3.m8022j()), c1958af.m7973d());
        }
        if (cls != ag.class) {
            return cls == ClassT.class ? abstractC1978nM8093b : abstractC1978n;
        }
        ag c1959ag = (ag) abstractC1978nM8093b;
        ClassQ c1981q4 = (ClassQ) c1959ag.m7977g();
        return new ag(c1989y.mo7970e(), c1959ag.m7976d(), new ClassQ(c1989y.mo7963f(), size == 0 ? c1981q4.m8019d() : (Abstractn) c1989y.m8036d().mo7865h(), c1981q4.m8020g(), c1981q4.m8021i(), c1981q4.m8022j()));
    }

    public boolean m8641a(ClassB c2094b) {
        this.f6171b.clear();
        this.f6170a.mo7770a((ClassI) c2094b);
        return !this.f6171b.isEmpty();
    }
}
