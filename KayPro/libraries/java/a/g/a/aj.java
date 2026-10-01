package a.g.a;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.o;
import a.b.a.p;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.Interfacej;
import a.b.c.bs;
import a.b.c.bu;
import a.b.f.ClassI;

public class aj extends w implements i, q, r {

    private final boolean f776a;

    private final aq f777b;

    private final ClassS f778c = new ClassS();

    private final bu f779d = new bu();

    private bs f780e = new bs();

    private int[] f781f = new int[64];

    public aj(boolean z, aq aqVar) {
        this.f776a = z;
        this.f777b = aqVar;
    }

    private void m2001a(d dVar) {
        int i = dVar.e;
        if (this.f781f.length < i) {
            this.f781f = new int[i];
        }
    }

    private boolean m2002a(int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f778c.m2173a(i4, i) && this.f778c.m2173a(i4, i2)) {
                return false;
            }
            if ((this.f778c.m2175b(i4, i) && this.f778c.m2175b(i4, i2)) || this.f778c.m2177c(i4, i)) {
                return false;
            }
        }
        return true;
    }

    private void m2003b(int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f778c.m2173a(i4, i)) {
                this.f778c.m2165a(i4, i, false);
                this.f778c.m2165a(i4, i2, true);
            }
            if (this.f778c.m2175b(i4, i)) {
                this.f778c.m2174b(i4, i, false);
                this.f778c.m2174b(i4, i2, true);
            }
        }
    }

    private int m2004c(int i, int i2, int i3) {
        for (int i4 = i; i4 < i2; i4++) {
            if (this.f778c.m2172a(i4) && this.f778c.m2173a(i4, i3)) {
                return i4;
            }
        }
        return i2;
    }

    private int m2005d(int i, int i2, int i3) {
        int i4 = i2;
        for (int i5 = i2 - 1; i5 >= i; i5--) {
            if (this.f778c.m2172a(i5)) {
                if (this.f778c.m2173a(i5, i3)) {
                    return i4;
                }
                i4 = i5;
            }
        }
        return i2;
    }

    public void m2006a(c cVar, a aVar) {
    }

    public void m2007a(c cVar, Interfacej interfaceC0162j, d dVar) {
        boolean z = false;
        m2001a(dVar);
        this.f778c.m2167a(cVar, interfaceC0162j, dVar);
        dVar.b(cVar, interfaceC0162j, this);
        int i = ((interfaceC0162j.mo945a() & 8) != 0 || this.f776a) ? 0 : 1;
        int iM762c = ClassI.m762c(interfaceC0162j.mo949b(cVar), interfaceC0162j.mo945a());
        int i2 = dVar.d;
        int i3 = dVar.e;
        for (int i4 = 0; i4 < i2; i4++) {
            this.f781f[i4] = i4;
            if (i4 >= iM762c && i4 < 64) {
                for (int i5 = i; i5 < i4; i5++) {
                    if (m2002a(i4, i5, i3)) {
                        this.f781f[i4] = i5;
                        m2003b(i4, i5, i3);
                        z = true;
                        break;
                    }
                }
            }
        }
        if (!z) {
            this.f780e.m73a(cVar, interfaceC0162j, dVar);
            return;
        }
        this.f779d.m95a(this.f781f);
        this.f779d.m85a(cVar, interfaceC0162j, dVar);
        if (this.f777b != null) {
            interfaceC0162j.mo947a(cVar, this.f777b);
        }
    }

    public void m2008a(c cVar, Interfacej interfaceC0162j, d dVar, o oVar) {
        int i = oVar.e;
        int i2 = oVar.a;
        int i3 = oVar.b + i2;
        int iM2004c = m2004c(i2, i3, i);
        int iM2005d = m2005d(iM2004c, i3, i) - iM2004c;
        if (iM2005d > 0) {
            oVar.a = iM2004c;
        }
        oVar.b = iM2005d;
    }

    public void m2009a(c cVar, Interfacej interfaceC0162j, d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m2010a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.q qVar) {
        int i = qVar.e;
        int i2 = qVar.a;
        int i3 = qVar.b + i2;
        int iM2004c = m2004c(i2, i3, i);
        int iM2005d = m2005d(iM2004c, i3, i) - iM2004c;
        if (iM2005d > 0) {
            qVar.a = iM2004c;
        }
        qVar.b = iM2005d;
    }

    public void m2011a(c cVar, Interfacej interfaceC0162j, d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
    }
}
