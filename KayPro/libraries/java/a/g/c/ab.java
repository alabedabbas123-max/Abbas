package a.g.c;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.d.l;
import a.b.a.h;
import a.b.c;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassE;

public class ab extends w implements i, l {

    private final l f1009a;

    public ab() {
        this(null);
    }

    public ab(l lVar) {
        this.f1009a = lVar;
    }

    private int m2652a(h[] hVarArr, int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            h hVar = hVarArr[i3];
            if (hVar.a < hVar.b) {
                i2 = i4 + 1;
                hVarArr[i4] = hVar;
            } else {
                i2 = i4;
            }
            i3++;
            i4 = i2;
        }
        return i4;
    }

    private boolean m2653a(c cVar, Interfacej interfaceC0162j, d dVar, int i, int i2) {
        byte[] bArr = dVar.f;
        while (i < i2) {
            Abstractc abstractC0048cM387a = ClassE.m387a(bArr, i);
            if (abstractC0048cM387a.m385e()) {
                return true;
            }
            i += abstractC0048cM387a.mo322a(i);
        }
        return false;
    }

    public void m2654a(c cVar, a aVar) {
    }

    public void m2655a(c cVar, Interfacej interfaceC0162j, d dVar) {
        dVar.a(cVar, interfaceC0162j, this);
        dVar.g = m2652a(dVar.h, dVar.g);
    }

    public void m2656a(c cVar, Interfacej interfaceC0162j, d dVar, h hVar) {
        if (m2653a(cVar, interfaceC0162j, dVar, hVar.a, hVar.b)) {
            return;
        }
        hVar.b = hVar.a;
        if (this.f1009a != null) {
            this.f1009a.a(cVar, interfaceC0162j, dVar, hVar);
        }
    }
}
