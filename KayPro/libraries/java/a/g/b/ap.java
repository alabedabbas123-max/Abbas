package a.g.b;

import a.b.b.a.f;
import a.b.b.h;
import a.b.b.q;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassF;
import a.b.ClassH;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassH;
import a.b.d.ClassK;

public class ap extends w implements f, d, aq {

    public static final boolean f949a;

    private final boolean f950b;

    private final boolean f951c;

    private boolean f952d;

    private c f953e;

    private boolean f954f;

    static {
        f949a = System.getProperty("optimize.conservatively") != null;
    }

    public ap(boolean z, boolean z2) {
        this.f950b = z;
        this.f951c = z2;
    }

    public void m2448a(c cVar, a.b.b.d dVar) {
        this.f953e = cVar;
        this.f954f = true;
        dVar.a(this);
    }

    public void m2449a(c cVar, h hVar) {
        this.f954f = true;
    }

    public void m2450a(c cVar, q qVar) {
        this.f953e = cVar;
        this.f954f = true;
        qVar.a(this);
    }

    public void m2451a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        switch (c0042a.f147c) {
            case -88:
            case -55:
                this.f954f = this.f950b;
                break;
        }
    }

    public void m2452a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -78:
                this.f952d = false;
                cVar.a(c0047b.f139a, this);
                break;
            case -77:
                this.f952d = true;
                cVar.a(c0047b.f139a, this);
                break;
            case -76:
                if (!f949a) {
                    this.f952d = false;
                    cVar.a(c0047b.f139a, this);
                } else {
                    this.f954f = true;
                }
                break;
            case -75:
                if (!f949a) {
                    this.f952d = true;
                    cVar.a(c0047b.f139a, this);
                } else {
                    this.f954f = true;
                }
                break;
            case -74:
            case -71:
            case -70:
                if (!f949a) {
                    cVar.a(c0047b.f139a, this);
                } else {
                    this.f954f = true;
                }
                break;
            case -73:
            case -72:
                cVar.a(c0047b.f139a, this);
                break;
            case -67:
            case -64:
            case -59:
                this.f954f = f949a;
                break;
        }
    }

    public void m2453a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2454a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (c0053h.f147c) {
            case -84:
            case -83:
            case -82:
            case -81:
            case -80:
            case -79:
                this.f954f = this.f950b;
                break;
            case -68:
            case -66:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
                this.f954f = f949a;
                break;
            case -65:
            case -62:
            case -61:
                this.f954f = true;
                break;
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                this.f954f = this.f951c;
                break;
        }
    }

    public void m2455a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        switch (c0056k.f147c) {
            case -87:
                this.f954f = this.f950b;
                break;
        }
    }

    public void m2456a(ClassE c0057e, ClassF c0069f) {
        this.f954f = true;
    }

    public void m2457a(ClassE c0057e, ClassH c0160h) {
        this.f954f = !ClassW.m2593a(c0160h);
    }

    public void m2458a(k kVar, ClassL c0163l) {
        this.f954f = (this.f952d && aj.m2411a(c0163l)) || (c0163l.mo945a() & 64) != 0 || am.m2442a(this.f953e, kVar, c0163l);
    }

    public void m2459a(k kVar, ClassN c0165n) {
        this.f954f = aq.m2462a(c0165n) || am.m2442a(this.f953e, kVar, c0165n);
    }

    public boolean m2460b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        this.f954f = false;
        abstractC0048c.mo324a(cVar, interfaceC0162j, dVar, i, this);
        return this.f954f;
    }
}
