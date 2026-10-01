package a.g.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.q;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.f.ClassI;
import a.d.ClassB;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.av;
import a.d.a.ClassC;
import a.g.a.aa;
import a.g.a.ClassU;
import a.g.a.ClassV;
import a.j.ClassB;

public class ak extends w implements i, f, d {

    private boolean[] f937a;

    private boolean[] f938b;

    private boolean[] f939c;

    private boolean[] f940d;

    private final ClassV f941e;

    private final boolean f942f;

    private Interfacej f943g;

    private int f944h;

    private int f945i;

    public ak() {
        this(new aa(new ClassC()));
    }

    private ak(aa c0319aa) {
        this(new ClassV(c0319aa, new ClassU(new ClassB(c0319aa)), true, c0319aa), true);
    }

    public ak(ClassV c0349v, boolean z) {
        this.f937a = new boolean[8096];
        this.f938b = new boolean[8096];
        this.f939c = new boolean[8096];
        this.f940d = new boolean[8096];
        this.f941e = c0349v;
        this.f942f = z;
    }

    private void m2422a(int i, int i2) {
        Abstractbd abstractC0206bdC = this.f941e.m2206j(i).m1643c(i2);
        if (abstractC0206bdC.mo1331j() == 5) {
            Abstractap abstractC0191apMo1558l_ = abstractC0206bdC.mo1558l_();
            if (abstractC0191apMo1558l_.mo1559m() != 1) {
                m2423a(abstractC0191apMo1558l_);
            }
        }
    }

    private void m2423a(Abstractap abstractC0191ap) {
        ad c0179adMo1335n_ = ((av) abstractC0191ap).m1582s().mo1335n_();
        int iM1324e = c0179adMo1335n_.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            if (!c0179adMo1335n_.m1322c(i)) {
                this.f937a[c0179adMo1335n_.m1317a(i)] = true;
            }
        }
    }

    private void m2424b(int i, int i2) {
        Abstractap abstractC0191apMo1558l_ = this.f941e.m2206j(i).m1643c(i2).mo1558l_();
        if (abstractC0191apMo1558l_.mo1559m() != 1) {
            m2425b(abstractC0191apMo1558l_);
        }
    }

    private void m2425b(Abstractap abstractC0191ap) {
        ad c0179adMo1335n_ = ((av) abstractC0191ap).m1582s().mo1335n_();
        int iM1324e = c0179adMo1335n_.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            if (!c0179adMo1335n_.m1322c(i)) {
                this.f938b[c0179adMo1335n_.m1317a(i)] = true;
            }
        }
    }

    private void m2426c(int i, int i2) {
        Abstractap abstractC0191apMo1558l_ = this.f941e.m2206j(i).m1643c(i2).mo1558l_();
        if (abstractC0191apMo1558l_.mo1559m() != 1) {
            m2427c(abstractC0191apMo1558l_);
        }
    }

    private void m2427c(Abstractap abstractC0191ap) {
        ad c0179adMo1335n_ = ((av) abstractC0191ap).m1582s().mo1335n_();
        int iM1324e = c0179adMo1335n_.m1324e();
        for (int i = 0; i < iM1324e; i++) {
            if (!c0179adMo1335n_.m1322c(i)) {
                this.f939c[c0179adMo1335n_.m1317a(i)] = true;
            }
        }
    }

    private void m2428d(int i) {
        this.f940d[i] = true;
    }

    public void m2429a(c cVar, a aVar) {
    }

    public void m2430a(c cVar, b bVar) {
    }

    public void m2431a(c cVar, a.b.b.d dVar) {
        cVar.a(dVar.a, this);
    }

    public void m2432a(c cVar, q qVar) {
        Interfacej interfaceC0162j = (Interfacej) qVar.e;
        for (int i = 0; i < this.f945i; i++) {
            int i2 = (this.f945i - i) - 1;
            if (this.f941e.m2206j(this.f944h).m1643c(i2).mo1331j() == 5) {
                if (interfaceC0162j == null || ac.m2260a(interfaceC0162j, i)) {
                    m2422a(this.f944h, i2);
                }
                if (interfaceC0162j == null || ac.m2269c(interfaceC0162j, i)) {
                    m2426c(this.f944h, i2);
                }
            }
        }
        String strM796s = ClassI.m796s(qVar.c(cVar));
        if (interfaceC0162j == null || ((ClassI.m784j(strM796s) || ClassI.m773f(strM796s)) && ac.m2271d(interfaceC0162j))) {
            m2428d(this.f944h);
        }
    }

    public void m2433a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        if (this.f942f) {
            this.f941e.m2194a(cVar, interfaceC0162j, dVar);
        }
        int i = dVar.e;
        this.f937a = ClassB.m3140a(this.f937a, i, false);
        this.f938b = ClassB.m3140a(this.f938b, i, false);
        this.f939c = ClassB.m3140a(this.f939c, i, false);
        this.f940d = ClassB.m3140a(this.f940d, i, false);
        dVar.a(cVar, interfaceC0162j, this.f941e.m2191a(this));
    }

    public void m2434a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -78:
            case -76:
                m2428d(i);
                break;
            case -77:
                m2422a(i, 0);
                break;
            case -75:
                m2426c(i, c0047b.mo349a(cVar) - 1);
                m2422a(i, 0);
                break;
            case -74:
            case -73:
            case -72:
            case -71:
                this.f943g = interfaceC0162j;
                this.f944h = i;
                this.f945i = c0047b.mo349a(cVar);
                cVar.a(c0047b.f139a, this);
                break;
        }
    }

    public void m2435a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2436a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -80:
                m2424b(i, 0);
                break;
            case -65:
                m2422a(i, 0);
                break;
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
                m2426c(i, c0053h.mo349a(cVar) - 1);
                break;
            case 83:
                m2426c(i, c0053h.mo349a(cVar) - 1);
                m2422a(i, 0);
                break;
        }
    }

    public boolean m2437a(int i) {
        return this.f937a[i];
    }

    public boolean m2438b(int i) {
        return this.f938b[i];
    }

    public boolean m2439c(int i) {
        return this.f939c[i];
    }
}
