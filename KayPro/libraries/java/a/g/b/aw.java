package a.g.b;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.f.ClassB;
import a.b.f.ClassI;
import a.b.g.Interfacebg;

public class aw extends w implements i, Interfacebg {

    private final aq f963a;

    private final aq f964b;

    private int f965c;

    private int f966d;

    public aw() {
        this(null);
    }

    public aw(aq aqVar) {
        this.f964b = new ClassB(true, new ax(null, this));
        this.f963a = aqVar;
    }

    public void m2484a(c cVar, a aVar) {
    }

    @Override
    public void mo1032a(c cVar, Interfacei interfaceC0161i, int i, int i2, int i3, int i4, String str, c cVar2) {
        Interfacej interfaceC0162j = (Interfacej) interfaceC0161i;
        ai c0365aiM2350b = ai.m2350b(interfaceC0162j);
        int i5 = this.f966d;
        this.f966d = i5 + 1;
        c0365aiM2350b.m2389i(i - i5);
        this.f965c += ClassI.m799v(str);
        if (this.f963a != null) {
            interfaceC0162j.mo947a(cVar, this.f963a);
        }
    }

    public void m2485a(c cVar, Interfacej interfaceC0162j, d dVar) {
        this.f966d = 0;
        this.f965c = 0;
        interfaceC0162j.mo947a(cVar, this.f964b);
        ai c0365aiM2350b = ai.m2350b(interfaceC0162j);
        c0365aiM2350b.m2385f(c0365aiM2350b.mo2404t() - this.f965c);
        c0365aiM2350b.m2372a(-1L);
    }
}
