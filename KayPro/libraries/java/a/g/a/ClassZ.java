package a.g.a;

import a.b.a.d;
import a.b.b.a;
import a.b.b.h;
import a.b.b.q;
import a.b.c;
import a.b.Interfacej;
import a.b.d.ClassB;
import a.d.Abstracth;
import a.d.ClassI;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;
import a.d.a.ad;
import a.d.a.av;

public class ClassZ extends Abstracth {

    private final Abstracth f867a;

    private int f868e;

    public ClassZ(Abstracth abstractC0238h) {
        this.f867a = abstractC0238h;
    }

    private Abstractbd m2220a(Abstractbd abstractC0206bd) {
        return abstractC0206bd instanceof av ? ((av) abstractC0206bd).m1581q() : abstractC0206bd;
    }

    @Override
    public Abstractbd mo1599a(c cVar, h hVar, String str) {
        return m2221a(this.f867a.mo1599a(cVar, hVar, str), this.f868e | 33554432);
    }

    @Override
    public Abstractbd mo1600a(c cVar, q qVar, String str) {
        return m2221a(this.f867a.mo1600a(cVar, qVar, str), this.f868e | 67108864);
    }

    @Override
    public Abstractbd mo1601a(c cVar, Interfacej interfaceC0162j, int i, String str, c cVar2) {
        return m2221a(this.f867a.mo1601a(cVar, interfaceC0162j, i, str, cVar2), 16777216 | i);
    }

    protected Abstractbd m2221a(Abstractbd abstractC0206bd, int i) {
        return abstractC0206bd.mo1331j() != 5 ? abstractC0206bd : m2222a(abstractC0206bd, new ad(i));
    }

    protected Abstractbd m2222a(Abstractbd abstractC0206bd, ad c0179ad) {
        return new av(m2220a(abstractC0206bd).mo1558l_(), c0179ad);
    }

    @Override
    public void mo1602a(c cVar, q qVar, int i, Abstractbd abstractC0206bd) {
        this.f867a.mo1602a(cVar, qVar, i, abstractC0206bd);
    }

    @Override
    public void mo1603a(c cVar, q qVar, Abstractap abstractC0191ap) {
        this.f867a.mo1603a(cVar, qVar, abstractC0191ap);
    }

    @Override
    public void mo1604a(c cVar, q qVar, Abstractbd abstractC0206bd) {
        this.f867a.mo1604a(cVar, qVar, abstractC0206bd);
    }

    @Override
    public void mo1622a(c cVar, Interfacej interfaceC0162j, d dVar, int i, int i2, ClassI c0239i) {
        this.f868e = i;
        super.mo1622a(cVar, interfaceC0162j, dVar, i, i2, c0239i);
    }

    @Override
    public void mo1623a(c cVar, Interfacej interfaceC0162j, d dVar, int i, ClassB c0047b, ClassI c0239i) {
        this.f868e = i;
        super.mo1623a(cVar, interfaceC0162j, dVar, i, c0047b, c0239i);
    }

    @Override
    public void mo1605a(c cVar, Interfacej interfaceC0162j, Abstractbd abstractC0206bd) {
        this.f867a.mo1605a(cVar, interfaceC0162j, abstractC0206bd);
    }

    @Override
    public Abstractbd mo1610b(c cVar, a aVar) {
        return m2221a(this.f867a.mo1610b(cVar, aVar), this.f868e | 536870912);
    }

    @Override
    public Abstractbd mo1611b(c cVar, q qVar, String str) {
        return m2221a(this.f867a.mo1611b(cVar, qVar, str), this.f868e | 33554432);
    }
}
