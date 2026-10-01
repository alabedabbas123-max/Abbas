package a.b.g;

import a.b.c;
import a.b.g.s;
import a.b.k;
import a.b.ClassE;

public class ab implements s {

    private final s f321a;

    public ab(s sVar) {
        this.f321a = sVar;
    }

    private boolean m953a(c cVar) {
        if ((cVar.a() & 512) == 0) {
            return false;
        }
        al c0108al = new al();
        al c0108al2 = new al();
        cVar.a(true, false, true, false, new ClassD(new ag(1024, 0, new av(c0108al, new bk(cVar, true, false, true, false, new ag(0, 1024, c0108al2))))));
        return c0108al.m986a() - c0108al2.m986a() == 1;
    }

    public void m954a(ClassE c0057e) {
        if (m953a((c) c0057e)) {
            this.f321a.a(c0057e);
        }
    }

    public void m955a(k kVar) {
        if (m953a((c) kVar)) {
            this.f321a.a(kVar);
        }
    }
}
