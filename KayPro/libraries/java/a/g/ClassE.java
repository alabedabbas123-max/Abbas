package a.g;

import a.b.a.a;
import a.b.a.d.i;
import a.b.b.a.f;
import a.b.b.q;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.ClassE;
import a.b.ClassH;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;

public class ClassE extends w implements i, f, d, aq {

    private final d f1118a;

    private final ClassV f1119b;

    private String f1120c;

    private int f1121d;

    public ClassE() {
        this(null);
    }

    public ClassE(d dVar) {
        this.f1119b = new ClassV();
        this.f1118a = dVar;
    }

    public void m2852a(c cVar, a aVar) {
    }

    public void m2853a(c cVar, q qVar) {
        if (qVar.b(cVar).equals("<init>")) {
            this.f1120c = qVar.c(cVar);
            qVar.a(this);
        }
    }

    public void m2854a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar) {
        this.f1119b.m277a(dVar.e);
        dVar.a(cVar, interfaceC0162j, this);
        this.f1119b.m284a(cVar, interfaceC0162j, dVar);
    }

    public void m2855a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        if (c0047b.f147c == -73) {
            this.f1121d = 0;
            cVar.a(c0047b.f139a, this);
            if (this.f1121d > 0) {
                ClassH c0053h = new ClassH(this.f1121d == 1 ? (byte) 3 : (byte) 1);
                this.f1119b.m278a(i, c0053h);
                if (this.f1118a != null) {
                    c0053h.mo324a(null, null, null, i, this.f1118a);
                }
            }
        }
    }

    public void m2856a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
    }

    public void m2857a(ClassE c0057e, ClassH c0160h) {
    }

    public void m2858a(k kVar, ClassN c0165n) {
        this.f1121d = c0165n.mo949b(kVar).length() - this.f1120c.length();
    }
}
