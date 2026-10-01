package org.c.a.a.c.a.a.d;

import java.util.List;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.d.ClassD;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.c.a.a.a.a.ClassF;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.Interfacee;
import org.c.a.a.c.a.a.c.ac;
import org.c.a.a.c.a.a.c.ag;
import org.c.a.a.c.a.a.c.ClassG;
import org.c.a.a.c.a.a.c.ClassH;
import org.c.a.a.c.a.a.c.ClassI;
import org.c.a.a.c.a.a.c.ClassK;
import org.c.a.a.c.a.a.c.ClassM;
import org.c.a.a.c.a.a.c.ClassN;
import org.c.a.a.c.a.a.c.ClassO;
import org.c.a.a.c.a.a.c.ClassW;

public class ClassC extends Abstracta {

    static final boolean f6196c;

    protected ClassW f6197a;

    protected ac f6198b;

    static {
        f6196c = !ClassC.class.desiredAssertionStatus();
    }

    public ClassC(ClassW c2168w, ac c2133ac) {
        this.f6197a = c2168w;
        this.f6198b = c2133ac;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void mo7764a(ac c1918ac) {
        Interfacee interfaceC2097e = (Interfacee) c1918ac;
        m8650a(interfaceC2097e, new ClassO(this.f6197a, this.f6198b, interfaceC2097e, false, interfaceC2097e.mo8295s_(), interfaceC2097e.mo8293o_()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void mo7766a(ah c1923ah) {
        Interfacee interfaceC2097e = (Interfacee) c1923ah;
        m8650a(interfaceC2097e, new ClassO(this.f6197a, this.f6198b, interfaceC2097e, false, null, null));
    }

    @Override
    public void mo7768a(ClassB c1926b) {
        m7773a((Interfacel) c1926b.m7897b());
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        List<Interfacee> listM8280f = ((ClassB) c1933i).m8280f();
        if (listM8280f != null) {
            for (Interfacee interfaceC2097e : listM8280f) {
                if ((interfaceC2097e.mo8296a() & 4160) != 0) {
                    interfaceC2097e.mo7869a(this);
                } else if ((interfaceC2097e.mo8296a() & 72) == 8) {
                    if (interfaceC2097e.mo8294r_().m7685b().startsWith("access$")) {
                        interfaceC2097e.mo8287a(interfaceC2097e.mo8296a() | 64);
                        interfaceC2097e.mo7869a(this);
                    }
                } else if (interfaceC2097e.mo8295s_() != null) {
                    for (Interfacel interfaceC2052l : interfaceC2097e.mo8295s_()) {
                        if (interfaceC2052l.mo8154l() && ((ClassI) interfaceC2052l).m8152j() == null) {
                            interfaceC2097e.mo8287a(interfaceC2097e.mo8296a() | 4096);
                            interfaceC2097e.mo7869a(this);
                            break;
                        }
                    }
                }
            }
            for (Interfacee interfaceC2097e2 : listM8280f) {
                if ((interfaceC2097e2.mo8296a() & 4160) == 0) {
                    interfaceC2097e2.mo7869a(this);
                }
            }
        }
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        m7773a((Interfacel) c1934j.m7941e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void mo7772a(ClassK c1935k) {
        Interfacee interfaceC2097e = (Interfacee) c1935k;
        m8650a(interfaceC2097e, new ClassO(this.f6197a, this.f6198b, interfaceC2097e, true, interfaceC2097e.mo8295s_(), null));
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        m7773a((Interfacel) c1938n.m7913c());
    }

    @Override
    public void mo7777a(ClassQ c1941q) {
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        m7773a((Interfacel) c1946v.m7941e());
    }

    protected void m8650a(Interfacee interfaceC2097e, ClassO c2160o) {
        ClassA c1821aMo8292k = interfaceC2097e.mo8292k();
        ClassB c2094bMo8291j = interfaceC2097e.mo8291j();
        ClassD c1877dMo8294r_ = interfaceC2097e.mo8294r_();
        ag c2137ag = new ag(this.f6197a, this.f6198b, c2160o, c1821aMo8292k, c2094bMo8291j, interfaceC2097e.mo8293o_());
        try {
            ClassF c2090fM8549a = ClassK.m8549a(c1877dMo8294r_);
            if (c2090fM8549a != null) {
                ClassH.m8530a(c2090fM8549a);
                ClassI.m8545b(c2090fM8549a);
                if (ClassM.m8565a(c2090fM8549a)) {
                    interfaceC2097e.mo8289a(c2137ag.m8436a(c2090fM8549a));
                } else {
                    interfaceC2097e.mo8289a(new ClassD(ClassG.m8523a("// ", c1877dMo8294r_)));
                }
            }
        } catch (Exception e) {
            if (!f6196c && !ClassN.m8588a(e)) {
                throw new AssertionError();
            }
            interfaceC2097e.mo8289a(new ClassD(ClassG.m8523a("// ", c1877dMo8294r_)));
        }
        if ((c1821aMo8292k.m7585c() & 512) != 0) {
            interfaceC2097e.mo8287a(interfaceC2097e.mo8296a() & (-1026));
        }
        c2160o.m8593a();
        interfaceC2097e.mo8288a(c2160o.m8601b());
    }
}
