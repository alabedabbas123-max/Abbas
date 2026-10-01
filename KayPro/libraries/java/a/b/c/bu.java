package a.b.c;

import a.b.a.a.a.a.a;
import a.b.a.a.a.a.b;
import a.b.a.a.a.e;
import a.b.a.a.b.h;
import a.b.a.d.i;
import a.b.a.d.q;
import a.b.a.d.r;
import a.b.a.o;
import a.b.a.p;
import a.b.a.s;
import a.b.a.t;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassK;

public class bu extends w implements a, b, h, i, q, r, d {

    private final ClassV f38a = new ClassV();

    private int[] f39b;

    private int m80a(int i) {
        return this.f39b[i];
    }

    public void m81a(c cVar, a.b.a.a.q qVar) {
        qVar.a(cVar, this);
    }

    public void m82a(c cVar, a.b.a.a.q qVar, a.b.a.a.a.h hVar) {
    }

    public void m83a(c cVar, a.b.a.a.r rVar) {
        rVar.a(cVar, this);
    }

    public void m84a(c cVar, a.b.a.a aVar) {
    }

    public void m85a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
        this.f38a.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f38a.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m86a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m87a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassK c0056k) {
        int i2 = c0056k.f156b;
        int iM80a = m80a(i2);
        if (iM80a != i2) {
            this.f38a.m311b(i, new ClassK(c0056k.f147c, iM80a, c0056k.f157d));
        }
    }

    public void m88a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, e eVar) {
        eVar.a(cVar, interfaceC0162j, dVar, qVar, this);
    }

    public void m89a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.a.q qVar, e eVar, a.b.a.a.a.d dVar2) {
        dVar2.c = m80a(dVar2.c);
    }

    public void m90a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, o oVar) {
        oVar.e = m80a(oVar.e);
    }

    public void m91a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, p pVar) {
        pVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m92a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.q qVar) {
        qVar.e = m80a(qVar.e);
    }

    public void m93a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, a.b.a.r rVar) {
        rVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m94a(c cVar, Interfacej interfaceC0162j, s sVar) {
        t[] tVarArr = sVar.d;
        t[] tVarArr2 = new t[sVar.c];
        for (int i = 0; i < sVar.c; i++) {
            tVarArr2[m80a(i)] = tVarArr[i];
        }
        sVar.d = tVarArr2;
    }

    public void m95a(int[] iArr) {
        this.f39b = iArr;
    }
}
