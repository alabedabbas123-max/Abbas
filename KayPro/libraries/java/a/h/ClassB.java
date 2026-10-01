package a.h;

import a.b.a.a;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.c.ClassU;
import a.b.d.Abstractc;
import a.b.d.ClassA;
import a.b.d.ClassE;
import a.b.d.ClassK;
import a.b.g.ClassY;
import a.g.c.ClassA;
import a.j.ClassL;

public class ClassB extends w implements i, l, d {

    private final ClassA f1261a = new ClassA();

    private final ClassU f1262b = new ClassU(true, true, true);

    private l f1263c = this;

    private int f1264d = 0;

    private int f1265e = Integer.MAX_VALUE;

    private void m2924a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2) {
        int iM2647n = this.f1261a.m2647n(i2);
        l lVar = this.f1263c;
        int i3 = this.f1264d;
        int i4 = this.f1265e;
        this.f1263c = new ClassY(i, this.f1263c);
        this.f1264d = i2;
        this.f1265e = iM2647n;
        this.f1262b.m235a(dVar.e);
        dVar.a(cVar, interfaceC0162j, i2, iM2647n, this);
        this.f1262b.m260b(iM2647n);
        dVar.a(cVar, interfaceC0162j, i2, iM2647n, this.f1263c);
        this.f1263c = lVar;
        this.f1264d = i3;
        this.f1265e = i4;
        this.f1262b.m259b();
    }

    public void m2925a(c cVar, a aVar) {
    }

    public void m2926a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        try {
            m2931b(cVar, interfaceC0162j, dVar);
        } catch (RuntimeException e) {
            ClassL.m3161a("Unexpected error while inlining subroutines:");
            ClassL.m3161a("  Class       = [" + cVar.b() + "]");
            ClassL.m3161a("  Method      = [" + interfaceC0162j.mo946a(cVar) + interfaceC0162j.mo949b(cVar) + "]");
            ClassL.m3161a("  Exception   = [" + e.getClass().getName() + "] (" + e.getMessage() + ")");
            throw e;
        }
    }

    public void m2927a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        byte b = c0042a.f147c;
        if (b != -88 && b != -55) {
            this.f1262b.m236a(i, c0042a);
            return;
        }
        int i2 = c0042a.f133a;
        int i3 = i + i2;
        if (this.f1261a.m2646m(i3)) {
            this.f1262b.m260b(i);
            m2924a(cVar, interfaceC0162j, dVar, i, i3);
        } else {
            this.f1262b.m236a(i, new ClassA((byte) -89, i2));
        }
    }

    public void m2928a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (this.f1261a.m2644k(i)) {
            this.f1262b.m260b(i);
        } else {
            this.f1262b.m236a(i, abstractC0048c);
        }
    }

    public void m2929a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        if (c0056k.f147c != -87) {
            if (this.f1261a.m2644k(i)) {
                this.f1262b.m260b(i);
                return;
            } else {
                this.f1262b.m236a(i, c0056k);
                return;
            }
        }
        if (this.f1261a.m2647n(i) == c0056k.mo322a(i) + i) {
            this.f1262b.m260b(i);
        } else {
            this.f1262b.m236a(i, new ClassA((byte) -89, this.f1261a.m2647n(i) - i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    public void m2930a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, h hVar) {
        int i;
        int iMax = Math.max(hVar.a, this.f1264d);
        int iMin = Math.min(hVar.b, this.f1265e);
        int i2 = hVar.c;
        int i3 = hVar.d;
        int i4 = iMax;
        int i5 = iMax;
        while (i4 < iMin) {
            if (this.f1261a.m2643j(i4)) {
                Abstractc abstractC0048cM387a = ClassE.m387a(dVar.f, i4);
                int iMo322a = abstractC0048cM387a.mo322a(i4);
                if (hVar.a(((ClassA) abstractC0048cM387a).f133a + i4)) {
                    i = i5;
                } else {
                    this.f1262b.m237a(new h(i5, i4, i2, i3));
                    i = i4 + iMo322a;
                }
            } else {
                i = i5;
            }
            i4++;
            i5 = i;
        }
        this.f1262b.m237a(new h(i5, iMin, i2, i3));
    }

    public void m2931b(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f1261a.m2626a(cVar, interfaceC0162j, dVar);
        if (this.f1261a.m2633a()) {
            this.f1262b.m234a();
            this.f1262b.m235a(dVar.e);
            int i = 0;
            while (i < dVar.e) {
                Abstractc abstractC0048cM387a = ClassE.m387a(dVar.f, i);
                int iMo322a = abstractC0048cM387a.mo322a(i);
                if (this.f1261a.m2645l(i) && this.f1261a.m2646m(i)) {
                    this.f1262b.m260b(i);
                } else {
                    abstractC0048cM387a.mo324a(cVar, interfaceC0162j, dVar, i, this);
                }
                i += iMo322a;
            }
            dVar.a(cVar, interfaceC0162j, this.f1263c);
            this.f1262b.m260b(dVar.e);
            this.f1262b.m259b();
            this.f1262b.m239a(cVar, interfaceC0162j, dVar);
        }
    }
}
