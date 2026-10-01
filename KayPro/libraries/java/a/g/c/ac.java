package a.g.c;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.Interfacej;
import a.b.c.bt;
import a.b.f.ClassI;
import a.g.b.ay;

public class ac extends w implements i {

    private final aq f1010a;

    private final ay f1011b;

    private final bt f1012c;

    public ac() {
        this(null);
    }

    public ac(aq aqVar) {
        this.f1011b = new ay();
        this.f1012c = new bt();
        this.f1010a = aqVar;
    }

    public void m2657a(c cVar, a aVar) {
    }

    public void m2658a(c cVar, Interfacej interfaceC0162j, d dVar) {
        if ((interfaceC0162j.mo945a() & 1024) == 0) {
            int i = dVar.d;
            this.f1011b.m2487a(cVar, interfaceC0162j, dVar);
            this.f1012c.m76a(i);
            for (int iM762c = ClassI.m762c(interfaceC0162j.mo949b(cVar), interfaceC0162j.mo945a()); iM762c < i; iM762c++) {
                if (!this.f1011b.m2490a(iM762c)) {
                    this.f1012c.m79b(iM762c);
                    if (this.f1010a != null) {
                        interfaceC0162j.mo947a(cVar, this.f1010a);
                    }
                }
            }
            this.f1012c.m78a(cVar, interfaceC0162j, dVar);
        }
    }
}
