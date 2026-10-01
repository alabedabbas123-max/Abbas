package org.c.a.a.c.f.a;

import java.util.List;
import org.c.a.a.a.b.Interfacea;
import org.c.a.a.b.f.ClassB;
import org.c.a.a.b.f.ClassC;
import org.c.a.a.b.f.ClassD;
import org.c.a.a.b.f.ClassE;
import org.c.a.a.b.f.ClassF;
import org.c.a.a.b.f.ClassG;
import org.c.a.a.b.f.ClassH;
import org.c.a.a.b.f.ClassI;
import org.c.a.a.b.f.ClassJ;
import org.c.a.a.b.f.ClassK;
import org.c.a.a.b.f.ClassL;
import org.c.a.a.b.f.ClassM;
import org.c.a.a.b.f.ClassN;
import org.c.a.a.b.f.ClassO;
import org.c.a.a.b.f.Interfacep;
import org.c.a.a.b.f.Interfaceq;

public class ClassA implements Interfaceq {

    public static int f6413a = 0;

    protected ClassB f6414b = new ClassB();

    protected Interfacea f6415c;

    protected List f6416d;

    protected int f6417e;

    protected int f6418f;

    public void m8836a() {
        this.f6415c.mo7575d();
    }

    public void m8837a(Interfacea interfaceC1819a, List list) {
        this.f6415c = interfaceC1819a;
        this.f6416d = list;
        this.f6417e = 0;
        this.f6418f = 0;
        interfaceC1819a.mo7563a(m8839c());
    }

    @Override
    public void mo8172a(ClassB c2068b) {
        m8838b();
        this.f6415c.mo7574c(c2068b.m8185a() ? "true" : "false");
        this.f6417e++;
    }

    @Override
    public void mo8173a(ClassC c2069c) {
        m8838b();
        this.f6415c.mo7568a(String.valueOf('\'') + c2069c.m8186a() + '\'', c2069c.m8187b());
        this.f6417e++;
    }

    @Override
    public void mo8174a(ClassD c2070d) {
        m8838b();
        this.f6415c.mo7565a(c2070d.m8188a(), c2070d.m8189b(), c2070d.mo8190c(), c2070d.m8191d());
        this.f6417e++;
    }

    @Override
    public void mo8175a(ClassE c2071e) {
        this.f6415c.mo7572c();
        if (c2071e == ClassE.f5894e) {
            this.f6415c.mo7572c();
        }
        m8838b();
        this.f6415c.mo7567a(c2071e.m8192a());
        this.f6417e++;
    }

    @Override
    public void mo8176a(ClassF c2072f) {
        m8838b();
        this.f6415c.mo7576d(c2072f.m8193a());
        this.f6417e++;
    }

    @Override
    public void mo8177a(ClassG c2073g) {
        m8838b();
        this.f6415c.mo7574c(c2073g.m8194a());
        this.f6417e++;
    }

    @Override
    public void mo7711a(ClassH c2074h) {
        this.f6417e++;
    }

    @Override
    public void mo7750a(ClassI c2075i) {
        this.f6418f += c2075i.m8196a();
        this.f6417e++;
    }

    @Override
    public void mo8178a(ClassJ c2076j) {
        m8838b();
        this.f6415c.mo7571b(c2076j.m8197a());
        this.f6417e++;
    }

    @Override
    public void mo8179a(ClassK c2077k) {
        m8838b();
        this.f6415c.mo7566a(c2077k.m8188a(), c2077k.m8189b(), c2077k.mo8190c(), c2077k.m8191d(), c2077k.m8198e());
        this.f6417e++;
    }

    @Override
    public void mo8180a(ClassL c2078l) {
        m8838b();
        this.f6415c.mo7567a(c2078l.m8199a());
        this.f6415c.mo7569b();
        if (c2078l == ClassL.f5914e) {
            this.f6415c.mo7569b();
        }
        this.f6417e++;
    }

    @Override
    public void mo8181a(ClassM c2079m) {
        m8838b();
        this.f6415c.mo7573c(c2079m.m8200a());
        this.f6417e++;
    }

    @Override
    public void mo8182a(ClassN c2080n) {
        m8838b();
        this.f6415c.mo7568a(String.valueOf('\"') + c2080n.m8201a() + '\"', c2080n.m8202b());
        this.f6417e++;
    }

    @Override
    public void mo8183a(ClassO c2081o) {
        m8838b();
        this.f6415c.mo7567a(c2081o.m8203a());
        this.f6417e++;
    }

    protected void m8838b() {
        if (this.f6418f > 0) {
            this.f6415c.mo7575d();
            if (this.f6418f > 2) {
                this.f6415c.mo7570b(this.f6418f - 2);
                this.f6418f = 2;
            }
            if (this.f6418f > 1) {
                this.f6415c.mo7563a(f6413a);
                this.f6415c.mo7575d();
            }
            this.f6415c.mo7563a(m8839c());
            this.f6418f = 0;
        }
    }

    protected int m8839c() {
        this.f6414b.m8840a();
        for (int i = this.f6417e; i >= 0; i--) {
            ((Interfacep) this.f6416d.get(i)).mo8184a(this.f6414b);
            if (this.f6414b.f6419a != f6413a) {
                return this.f6414b.f6419a;
            }
            if (this.f6414b.f6420b > 0) {
                break;
            }
        }
        this.f6414b.m8840a();
        int size = this.f6416d.size();
        for (int i2 = this.f6417e; i2 < size; i2++) {
            ((Interfacep) this.f6416d.get(i2)).mo8184a(this.f6414b);
            if (this.f6414b.f6419a != f6413a) {
                return this.f6414b.f6419a;
            }
            if (this.f6414b.f6420b > 0) {
                break;
            }
        }
        return f6413a;
    }
}
