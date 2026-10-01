package a.g;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.b.a.f;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassU;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassB;
import a.b.d.ClassE;
import a.b.d.ClassK;
import a.b.f.ClassI;
import a.b.f.ClassQ;

public class ClassX extends w implements i, l, f, d {

    private final d f1196a;

    private final ClassU f1197b;

    private final ClassZ f1198c;

    private final a.b.a.d.w f1199d;

    private Interfacej f1200e;

    private boolean f1201f;

    public ClassX() {
        this(null);
    }

    public ClassX(d dVar) {
        this.f1197b = new ClassU();
        this.f1198c = new ClassZ(this);
        this.f1199d = new a.b.a.d.w();
        this.f1196a = dVar;
    }

    private void m2906a(c cVar, Interfacej interfaceC0162j) {
        byte b;
        String strB = interfaceC0162j.mo949b(cVar);
        boolean z = (interfaceC0162j.mo945a() & 8) != 0;
        int iM798u = ClassI.m798u(strB);
        int i = z ? 0 : 1;
        String[] strArr = new String[iM798u];
        ClassQ c0086q = new ClassQ(strB);
        int i2 = 0;
        while (i2 < iM798u) {
            String strM899e = c0086q.m899e();
            strArr[i2] = strM899e;
            if (ClassI.m799v(strM899e) == 2) {
                i2++;
            }
            i2++;
        }
        this.f1197b.m235a(iM798u + 1);
        for (int i3 = iM798u - 1; i3 >= 0; i3--) {
            String str = strArr[i3];
            if (str != null) {
                switch (str.charAt(0)) {
                    case 'B':
                    case 'C':
                    case 'I':
                    case 'S':
                    case 'Z':
                        b = 54;
                        break;
                    case 'D':
                        b = 57;
                        break;
                    case 'F':
                        b = 56;
                        break;
                    case 'J':
                        b = 55;
                        break;
                    default:
                        b = 58;
                        break;
                }
                this.f1197b.m236a((iM798u - i3) - 1, new ClassK(b, i + i3));
            }
        }
        if (!z) {
            this.f1197b.m236a(iM798u, new ClassK((byte) 58, 0));
        }
        this.f1197b.m259b();
    }

    public void m2907a(c cVar, a aVar) {
    }

    public void m2908a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        int iA = interfaceC0162j.mo945a();
        if ((iA & 26) == 0 || (iA & 1312) != 0) {
            return;
        }
        this.f1200e = interfaceC0162j;
        this.f1201f = false;
        this.f1197b.m234a();
        this.f1197b.m235a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        if (this.f1201f) {
            this.f1197b.m260b(dVar.e);
            dVar.a(cVar, interfaceC0162j, this);
            this.f1197b.m259b();
            this.f1197b.m239a(cVar, interfaceC0162j, dVar);
        }
    }

    public void m2909a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.f147c) {
            case -74:
            case -73:
            case -72:
                cVar.a(c0047b.f139a, this.f1198c);
                if (this.f1198c.m2914a()) {
                    int iMo322a = c0047b.mo322a(i) + i;
                    switch (ClassE.m387a(dVar.f, iMo322a).f147c) {
                        case -84:
                        case -83:
                        case -82:
                        case -81:
                        case -80:
                        case -79:
                            dVar.a(cVar, interfaceC0162j, i, this.f1198c);
                            if (this.f1198c.m2914a()) {
                                this.f1199d.a(cVar, interfaceC0162j, dVar);
                                if (this.f1199d.c(iMo322a) == 0) {
                                    this.f1197b.m260b(i);
                                    m2906a(cVar, interfaceC0162j);
                                    int i2 = i + 1;
                                    this.f1197b.m236a(i2, new ClassA((byte) -89, -i2));
                                    this.f1201f = true;
                                    if (this.f1196a != null) {
                                        this.f1196a.a(cVar, interfaceC0162j, dVar, i, c0047b);
                                        return;
                                    }
                                    return;
                                }
                            }
                    }
                }
                break;
        }
        this.f1197b.m236a(i, c0047b);
    }

    public void m2910a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        this.f1197b.m236a(i, abstractC0048c);
    }

    public void m2911a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        this.f1197b.m237a(new h(hVar.a, hVar.b, hVar.c, hVar.d));
    }
}
