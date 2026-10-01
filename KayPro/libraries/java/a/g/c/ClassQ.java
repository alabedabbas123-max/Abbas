package a.g.c;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.e;
import a.b.a.d.i;
import a.b.a.d.o;
import a.b.a.d.p;
import a.b.a.j;
import a.b.a.m;
import a.b.a.n;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import java.util.Stack;
import a.b.ClassN;
import a.b.Interfacej;

public class ClassQ extends w implements i, o, aq, s {

    private Stack f1067a = new Stack();

    private m f1068b;

    private int f1069c;

    private int f1070d;

    public void m2765a(c cVar, a aVar) {
    }

    public void m2766a(c cVar, Interfacej interfaceC0162j, d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m2767a(c cVar, Interfacej interfaceC0162j, d dVar, m mVar) {
        int i;
        String strA = mVar.a();
        if (strA != null) {
            j jVar = (j) mVar;
            int i2 = jVar.c;
            if (this.f1068b != null && this.f1068b.a() == strA) {
                mVar.c += this.f1070d;
            } else if (i2 != -1) {
                this.f1067a.push(this.f1068b != null ? new ClassR(this.f1070d, this.f1068b.c, this.f1068b.a()) : new ClassR(0, 0, null));
                int iIndexOf = strA.indexOf(58);
                int iIndexOf2 = strA.indexOf(58, iIndexOf + 1);
                int i3 = Integer.parseInt(strA.substring(iIndexOf + 1, iIndexOf2));
                int i4 = Integer.parseInt(strA.substring(iIndexOf2 + 1));
                if (this.f1069c > 50000) {
                    i = (this.f1069c - i3) + 1;
                } else {
                    i = i3 > this.f1069c ? 0 : (((this.f1069c - i3) + 1000) / 1000) * 1000;
                }
                this.f1070d = i;
                this.f1069c = this.f1070d + i4;
                mVar.c += this.f1070d;
            } else if (!this.f1067a.isEmpty()) {
                ClassR c0435r = (ClassR) this.f1067a.pop();
                jVar.c = c0435r.f1072b;
                jVar.a = c0435r.f1073c;
                this.f1070d = c0435r.f1071a;
            }
        }
        this.f1068b = mVar;
    }

    public void m2768a(c cVar, Interfacej interfaceC0162j, d dVar, n nVar) {
        this.f1067a.clear();
        this.f1068b = null;
        nVar.a(cVar, interfaceC0162j, dVar, this);
    }

    public void m2769a(k kVar) {
        p pVar = new p();
        kVar.b(new a.b.a.d.a(true, new e(pVar)));
        if (pVar.b()) {
            this.f1069c = pVar.a();
            kVar.b(this);
        }
    }

    public void m2770a(k kVar, ClassN c0165n) {
        c0165n.mo1267a(kVar, (i) this);
    }
}
