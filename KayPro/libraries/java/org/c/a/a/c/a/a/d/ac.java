package org.c.a.a.c.a.a.d;

import java.util.HashMap;
import java.util.List;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ae;
import org.c.a.a.b.d.b.af;
import org.c.a.a.b.d.b.ag;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.ClassT;
import org.c.a.a.b.d.b.ClassY;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassP;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassL;
import org.c.a.a.c.a.a.a.b.b.ClassB;

public class ac extends Abstracta {

    protected HashMap f6172a = null;

    final ab f6173b;

    protected ac(ab c2174ab) {
        this.f6173b = c2174ab;
    }

    private boolean m8642a(Interfacef interfaceC1970f, int i) {
        return interfaceC1970f.getClass() == ClassB.class && ((ClassB) interfaceC1970f).m8306g().m8333d() == i;
    }

    private boolean m8643a(ClassL c2104l) {
        Abstractn abstractC1978nM8093b;
        Interfacer interfaceC2032r = (Interfacer) c2104l.m7874g().mo7865h();
        if (interfaceC2032r.getClass() == ClassP.class) {
            abstractC1978nM8093b = ((ClassP) interfaceC2032r).m8120d();
        } else {
            if (interfaceC2032r.getClass() != ClassH.class) {
                return false;
            }
            abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
        }
        Class<?> cls = abstractC1978nM8093b.getClass();
        int size = c2104l.mo8295s_().size();
        if (cls == ClassQ.class) {
            ClassQ c1981q = (ClassQ) abstractC1978nM8093b;
            if (size == 0) {
                return c1981q.m8019d() != null && c1981q.m8019d().getClass() == ae.class;
            }
            if (size == 1) {
                return c1981q.m8019d() == null || m8642a(c1981q.m8019d(), 0);
            }
        } else if (cls == ClassY.class) {
            ClassY c1989y = (ClassY) abstractC1978nM8093b;
            if (c1989y.m8038g().getClass() == ae.class) {
                Interfacef interfaceC1970fM8036d = c1989y.m8036d();
                if (interfaceC1970fM8036d == null || interfaceC1970fM8036d.size() == 0) {
                    return true;
                }
                if (!interfaceC1970fM8036d.mo7867j_()) {
                    return m8642a(interfaceC1970fM8036d, 0);
                }
                int i = 0;
                for (Abstractn abstractC1978n : interfaceC1970fM8036d.mo7868l_()) {
                    int i2 = i + 1;
                    if (!m8642a(abstractC1978n, i)) {
                        return false;
                    }
                    Interfacel interfaceC2052lMo7963f = abstractC1978n.mo7963f();
                    i = (interfaceC2052lMo7963f.equals(ClassK.f5857g) || interfaceC2052lMo7963f.equals(ClassK.f5854d)) ? i2 + 1 : i2;
                }
                return true;
            }
            if (size > 0 && m8642a(c1989y.m8038g(), 0)) {
                Interfacef interfaceC1970fM8036d2 = c1989y.m8036d();
                if (interfaceC1970fM8036d2 == null || interfaceC1970fM8036d2.size() == 0) {
                    return true;
                }
                if (!interfaceC1970fM8036d2.mo7867j_()) {
                    return m8642a(interfaceC1970fM8036d2, 1);
                }
                int i3 = 1;
                for (Abstractn abstractC1978n2 : interfaceC1970fM8036d2.mo7868l_()) {
                    int i4 = i3 + 1;
                    if (!m8642a(abstractC1978n2, i3)) {
                        return false;
                    }
                    Interfacel interfaceC2052lMo7963f2 = abstractC1978n2.mo7963f();
                    i3 = (interfaceC2052lMo7963f2.equals(ClassK.f5857g) || interfaceC2052lMo7963f2.equals(ClassK.f5854d)) ? i4 + 1 : i4;
                }
                return true;
            }
        } else if (cls == ClassG.class) {
            ClassG c1971g = (ClassG) abstractC1978nM8093b;
            if (size == 1) {
                if (c1971g.m8000d().getClass() == ClassQ.class && m8642a(c1971g.m8003j(), 0)) {
                    return ((ClassQ) c1971g.m8000d()).m8019d().getClass() == ae.class;
                }
            } else if (size == 2 && c1971g.m8000d().getClass() == ClassQ.class && m8642a(c1971g.m8003j(), 1)) {
                return m8642a(((ClassQ) c1971g.m8000d()).m8019d(), 0);
            }
        } else if (cls == af.class) {
            af c1958af = (af) abstractC1978nM8093b;
            if (c1958af.m7974g().getClass() == ClassQ.class) {
                ClassQ c1981q2 = (ClassQ) c1958af.m7974g();
                if (size == 0 && c1981q2.m8019d().getClass() == ae.class) {
                    return true;
                }
                if (size == 1 && c1981q2.m8019d() != null && m8642a(c1981q2.m8019d(), 0)) {
                    return true;
                }
            }
        } else if (size == 1 && cls == ag.class) {
            ag c1959ag = (ag) abstractC1978nM8093b;
            if (c1959ag.m7977g().getClass() == ClassQ.class) {
                ClassQ c1981q3 = (ClassQ) c1959ag.m7977g();
                if (size == 0 && c1981q3.m8019d().getClass() == ae.class) {
                    return true;
                }
                if (size == 1 && c1981q3.m8019d() != null && m8642a(c1981q3.m8019d(), 0)) {
                    return true;
                }
            }
        } else if (size == 0 && cls == ClassT.class) {
            return true;
        }
        return false;
    }

    @Override
    public void mo7764a(ac c1918ac) {
        Interfaceb interfaceC2016bM7874g;
        if ((c1918ac.m7870a() & 8) == 0 || (interfaceC2016bM7874g = c1918ac.m7874g()) == null || interfaceC2016bM7874g.size() != 1) {
            return;
        }
        String strM7872d = c1918ac.m7872d();
        if (strM7872d.startsWith("access$")) {
            ClassL c2104l = (ClassL) c1918ac;
            if (m8643a(c2104l)) {
                this.f6172a.put(String.valueOf(strM7872d) + c1918ac.m7875l(), c2104l);
            }
        }
    }

    @Override
    public void mo7768a(ClassB c1926b) {
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        ClassB c2094b = (ClassB) c1933i;
        List listM8280f = c2094b.m8280f();
        if (listM8280f != null && !listM8280f.isEmpty()) {
            HashMap map = this.f6172a;
            this.f6172a = new HashMap();
            m7762a(listM8280f);
            if (!this.f6172a.isEmpty()) {
                this.f6173b.f6171b.put(String.valueOf('L') + c2094b.m7901a() + ';', this.f6172a);
            }
            this.f6172a = map;
        }
        m7863e(c2094b.m8281g());
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        m7773a((Interfacel) c1934j.m7941e());
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        m7773a((Interfacel) c1938n.m7913c());
    }

    @Override
    public void mo7782a(ClassV c1946v) {
    }
}
