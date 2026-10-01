package a.g.a;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.q;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.f.ClassB;
import a.b.g.Interfacebg;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.av;
import a.g.b.ac;
import a.g.b.am;
import a.g.b.ap;
import a.g.b.aq;
import a.g.b.ClassU;

class ClassM extends w implements f, d, Interfacebg {

    final ClassJ f817a;

    private final aq f818b;

    private int f819c;

    private int f820d;

    private ClassM(ClassJ c0337j) {
        this.f817a = c0337j;
        this.f818b = new ClassB(true, this);
    }

    private void m2132a(int i, int i2) {
        Abstractbd abstractC0206bdC = this.f817a.f800a.m2206j(i).m1643c(i2);
        if (abstractC0206bdC.mo1331j() == 5) {
            Abstractap abstractC0191apMo1558l_ = abstractC0206bdC.mo1558l_();
            if (abstractC0191apMo1558l_.mo1559m() != 1) {
                if (abstractC0191apMo1558l_ instanceof av) {
                    m2133a(i, ((av) abstractC0191apMo1558l_).m1582s().mo1335n_());
                } else {
                    this.f817a.m2110h(i);
                }
            }
        }
    }

    private void m2133a(int i, ad c0179ad) {
        ad c0179ad2 = new ad(i);
        int iM1324e = c0179ad.m1324e();
        for (int i2 = 0; i2 < iM1324e; i2++) {
            if (c0179ad.m1328g(i2)) {
                int iM1317a = c0179ad.m1317a(i2);
                if (iM1317a != i) {
                    ad c0179ad3 = this.f817a.f810k[iM1317a];
                    this.f817a.f810k[iM1317a] = c0179ad3 == null ? c0179ad2 : c0179ad3.m1318a(c0179ad2);
                }
            } else {
                this.f817a.m2110h(i);
            }
        }
    }

    private void m2134a(c cVar, int i, Abstractc abstractC0048c) {
        m2132a(i, abstractC0048c.mo349a(cVar) - 1);
    }

    public void m2135a(c cVar, a aVar) {
        c cVar2 = aVar.b;
        if (cVar2 == null || am.m2441a(cVar, cVar2)) {
            this.f817a.m2110h(this.f819c);
        }
    }

    public void m2136a(c cVar, b bVar) {
    }

    public void m2137a(c cVar, a.b.b.d dVar) {
        cVar.a(dVar.a, this);
    }

    public void m2138a(c cVar, q qVar) {
        Interfacej interfaceC0162j = (Interfacej) qVar.e;
        if (ap.f949a && interfaceC0162j != null && aq.m2462a(interfaceC0162j) && !ClassU.m2585a(interfaceC0162j)) {
            this.f817a.m2110h(this.f819c);
            return;
        }
        if (interfaceC0162j == null || ac.m2254a(interfaceC0162j) != 0 || ac.m2273e(interfaceC0162j) || am.m2442a(cVar, qVar.c, interfaceC0162j)) {
            this.f817a.m2110h(this.f819c);
        } else {
            qVar.a(this.f818b);
        }
    }

    public void m2139a(c cVar, r rVar) {
        c cVar2 = rVar.b;
        if (cVar2 == null || !am.m2441a(cVar, cVar2)) {
            return;
        }
        this.f817a.m2110h(this.f819c);
    }

    @Override
    public void mo1032a(c cVar, Interfacei interfaceC0161i, int i, int i2, int i3, int i4, String str, c cVar2) {
        if (ac.m2269c((Interfacej) interfaceC0161i, i)) {
            m2132a(this.f819c, (i4 - i3) - 1);
        }
    }

    public void m2140a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        if (c0042a.f147c == -89 && c0042a.f133a == 0) {
            this.f817a.m2110h(i);
        } else {
            m2142a(cVar, interfaceC0162j, dVar, i, (Abstractc) c0042a);
        }
    }

    public void m2141a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -78:
            case -69:
            case 18:
            case 19:
                this.f819c = i;
                cVar.a(c0047b.f139a, this);
                break;
            case -75:
                m2134a(cVar, i, c0047b);
                break;
            case -74:
            case -73:
            case -72:
            case -71:
                this.f819c = i;
                this.f820d = c0047b.mo349a(cVar);
                cVar.a(c0047b.f139a, this);
                break;
            case -67:
            case -59:
                this.f819c = i;
                cVar.a(c0047b.f139a, this);
                m2142a(cVar, interfaceC0162j, dVar, i, (Abstractc) c0047b);
                break;
            default:
                m2142a(cVar, interfaceC0162j, dVar, i, (Abstractc) c0047b);
                break;
        }
    }

    public void m2142a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (this.f817a.f803d.m2460b(cVar, interfaceC0162j, dVar, i, abstractC0048c)) {
            this.f817a.m2110h(i);
        }
    }

    public void m2143a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                m2134a(cVar, i, c0053h);
                m2142a(cVar, interfaceC0162j, dVar, i, (Abstractc) c0053h);
                break;
            default:
                m2142a(cVar, interfaceC0162j, dVar, i, (Abstractc) c0053h);
                break;
        }
    }
}
