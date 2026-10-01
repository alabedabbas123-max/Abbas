package org.c.a.a.c.a.a.d;

import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.d.b.ClassH;
import org.c.a.a.b.d.d.Abstractw;
import org.c.a.a.b.d.d.ClassA;
import org.c.a.a.b.d.d.aa;
import org.c.a.a.b.d.d.ab;
import org.c.a.a.b.d.d.ac;
import org.c.a.a.b.d.d.ad;
import org.c.a.a.b.d.d.ae;
import org.c.a.a.b.d.d.af;
import org.c.a.a.b.d.d.ag;
import org.c.a.a.b.d.d.ah;
import org.c.a.a.b.d.d.ai;
import org.c.a.a.b.d.d.ClassC;
import org.c.a.a.b.d.d.ClassD;
import org.c.a.a.b.d.d.ClassE;
import org.c.a.a.b.d.d.ClassF;
import org.c.a.a.b.d.d.ClassG;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassI;
import org.c.a.a.b.d.d.ClassJ;
import org.c.a.a.b.d.d.ClassK;
import org.c.a.a.b.d.d.ClassL;
import org.c.a.a.b.d.d.ClassM;
import org.c.a.a.b.d.d.ClassN;
import org.c.a.a.b.d.d.ClassO;
import org.c.a.a.b.d.d.ClassP;
import org.c.a.a.b.d.d.ClassQ;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.ClassV;
import org.c.a.a.b.d.d.ClassX;
import org.c.a.a.b.d.d.ClassY;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.d.Interfacet;
import org.c.a.a.c.a.a.a.b.c.ClassF;
import org.c.a.a.c.a.a.c.ClassO;

public class ClassW implements Interfacet {

    protected static final ClassF f6249a;

    static final boolean f6250e;

    protected ClassO f6251b;

    protected int f6252c;

    protected int f6253d;

    static {
        f6250e = !ClassW.class.desiredAssertionStatus();
        f6249a = new ClassF();
    }

    public ClassW(ClassO c2160o) {
        this.f6251b = c2160o;
    }

    private static ai m8670a(Interfacer interfaceC2032r) {
        Interfacer interfaceC2032rM8113d = interfaceC2032r.getClass() == ClassM.class ? ((ClassM) interfaceC2032r).m8113d() : interfaceC2032r;
        if (interfaceC2032rM8113d == null || interfaceC2032rM8113d.getClass() != ai.class) {
            return null;
        }
        ai c2015ai = (ai) interfaceC2032rM8113d;
        if (c2015ai.m8083b().getClass() == ClassH.class && !((ClassH) c2015ai.m8083b()).m8005g()) {
            return c2015ai;
        }
        return null;
    }

    public void m8671a() {
        this.f6252c = 0;
        this.f6253d = 0;
    }

    protected void m8672a(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Interfacer) it.next()).mo8055a(this);
            }
        }
    }

    @Override
    public void mo7829a(ClassA c2006a) {
    }

    @Override
    public void mo7830a(aa c2007aa) {
        c2007aa.m8125b().mo8055a(this);
    }

    @Override
    public void mo7831a(ab c2008ab) {
        c2008ab.m8125b().mo8055a(this);
    }

    @Override
    public void mo7832a(ac c2009ac) {
        m8673a(c2009ac.m8062d());
    }

    @Override
    public void mo7833a(ad c2010ad) {
    }

    @Override
    public void mo7834a(ae c2011ae) {
        ClassF c2113f = (ClassF) c2011ae;
        ClassU c2035u = (ClassU) c2113f.m8068d();
        ClassU c2035u2 = (ClassU) c2113f.m8070f();
        m8673a((Interfaceb) c2035u2);
        if (c2113f.m8316g() || c2035u2 == null || c2035u2.size() == 0) {
            c2035u.mo8055a(this);
            m8672a(c2011ae.m8069e());
            return;
        }
        if (c2113f.m8317j()) {
            List listM8069e = c2011ae.m8069e();
            int i = this.f6252c;
            int size = c2035u2.size();
            this.f6252c += size;
            m8674b(c2035u);
            this.f6253d = size;
            if (listM8069e != null) {
                Iterator it = listM8069e.iterator();
                while (it.hasNext()) {
                    m8674b((ClassU) ((af) it.next()).m8076g());
                }
            }
            this.f6252c = i;
            if (c2011ae.m8066b() != null) {
                c2113f.m8067b(null);
                return;
            }
            return;
        }
        List listM8069e2 = c2011ae.m8069e();
        int i2 = this.f6252c;
        int i3 = this.f6253d;
        int size2 = c2035u2.size();
        this.f6252c += size2;
        this.f6253d = size2 + this.f6253d;
        m8674b(c2035u);
        if (listM8069e2 != null) {
            Iterator it2 = listM8069e2.iterator();
            while (it2.hasNext()) {
                m8674b((ClassU) ((af) it2.next()).m8076g());
            }
        }
        this.f6252c = i2;
        this.f6253d = i3;
        if (c2011ae.m8066b() != null) {
            c2113f.m8067b(null);
        }
    }

    @Override
    public void mo7835a(af c2012af) {
        m8673a(c2012af.m8076g());
    }

    @Override
    public void mo7836a(ag c2013ag) {
    }

    @Override
    public void mo7837a(ah c2014ah) {
    }

    @Override
    public void mo7838a(ai c2015ai) {
        m8673a(c2015ai.m8084d());
    }

    protected void m8673a(Interfaceb interfaceC2016b) {
        if (interfaceC2016b != null) {
            interfaceC2016b.mo8055a(this);
        }
    }

    @Override
    public void mo7840a(ClassC c2017c) {
    }

    @Override
    public void mo7841a(ClassD c2018d) {
    }

    @Override
    public void mo7842a(ClassE c2019e) {
    }

    @Override
    public void mo7843a(ClassF c2020f) {
    }

    @Override
    public void mo7844a(ClassG c2021g) {
        m8673a(c2021g.m8091d());
    }

    @Override
    public void mo7845a(ClassH c2022h) {
    }

    @Override
    public void mo7846a(ClassI c2023i) {
        m8673a(c2023i.m8098f());
    }

    @Override
    public void mo7847a(ClassJ c2024j) {
        m8673a(c2024j.m8107g());
    }

    @Override
    public void mo7848a(ClassK c2025k) {
        c2025k.m8111e().mo8055a(this);
        c2025k.m8108b().mo8055a(this);
    }

    @Override
    public void mo7849a(ClassL c2026l) {
        m8673a(c2026l.m8111e());
    }

    @Override
    public void mo7850a(ClassM c2027m) {
    }

    @Override
    public void mo7851a(ClassN c2028n) {
    }

    @Override
    public void mo7852a(ClassO c2029o) {
    }

    @Override
    public void mo7853a(ClassP c2030p) {
    }

    @Override
    public void mo7854a(ClassQ c2031q) {
    }

    @Override
    public void mo7855a(ClassU c2035u) {
        int i;
        int size = c2035u.size();
        if (size <= 0) {
            return;
        }
        int i2 = this.f6253d;
        Interfacer interfaceC2032r = (Interfacer) c2035u.m8844d();
        Class<?> cls = interfaceC2032r.getClass();
        if (cls == ClassP.class || cls == ClassQ.class) {
            this.f6253d = this.f6252c;
            i = size - 1;
        } else if (cls == ad.class) {
            this.f6253d = 0;
            i = size - 1;
        } else {
            ai c2015aiM8670a = m8670a(interfaceC2032r);
            if (c2015aiM8670a != null) {
                this.f6253d = 0;
                c2015aiM8670a.m8084d().mo8055a(this);
                i = size - 1;
            } else {
                i = size;
            }
        }
        if (this.f6253d > 0) {
            if (i > this.f6253d) {
                List listSubList = c2035u.subList(i - this.f6253d, i);
                Iterator it = listSubList.iterator();
                while (it.hasNext()) {
                    ((Interfacer) it.next()).mo8055a(f6249a);
                }
                interfaceC2032r.mo8055a(f6249a);
                listSubList.clear();
                i -= this.f6253d;
                this.f6253d = 0;
            } else {
                Iterator<E> it2 = c2035u.iterator();
                while (it2.hasNext()) {
                    ((Interfacer) it2.next()).mo8055a(f6249a);
                }
                c2035u.clear();
                if (i < size) {
                    c2035u.add(interfaceC2032r);
                }
                this.f6253d -= i;
                i = 0;
            }
        }
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                this.f6253d = i2;
                return;
            }
            ((Interfacer) c2035u.get(i3)).mo8055a(this);
            if (this.f6253d > 0 && this.f6253d + i3 < c2035u.size()) {
                c2035u.subList(i3 + 1, i3 + 1 + this.f6253d).clear();
                this.f6253d = 0;
            }
            i = i3;
        }
    }

    @Override
    public void mo7856a(ClassV c2036v) {
        Iterator it = c2036v.m8124d().iterator();
        while (it.hasNext()) {
            ((Abstractw) it.next()).m8125b().mo8055a(this);
        }
    }

    @Override
    public void mo7857a(ClassX c2038x) {
    }

    @Override
    public void mo7858a(ClassY c2039y) {
    }

    public void m8674b(ClassU c2035u) {
        if (c2035u.size() != 1 || c2035u.get(0).getClass() != ClassF.class) {
            c2035u.mo8055a(this);
            return;
        }
        int i = this.f6253d;
        if (!f6250e && c2035u.m8846h().getClass() != ClassF.class) {
            throw new AssertionError();
        }
        this.f6253d = 0;
        c2035u.mo8055a(this);
        this.f6253d = i;
    }
}
