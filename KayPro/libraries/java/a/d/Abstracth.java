package a.d;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.d;
import a.b.b.h;
import a.b.b.q;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.k;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.d.ClassB;
import a.b.f.ClassB;
import a.b.f.ClassI;
import a.b.g.Interfacebg;
import a.d.a.Abstractap;
import a.d.a.Abstractbd;

public abstract class Abstracth extends w implements f, Interfacebg, Interfacef {

    private final aq f566a = new ClassB(true, this);

    protected boolean f567b;

    protected boolean f568c;

    protected ClassI f569d;

    private ClassL f570e;

    public abstract Abstractbd mo1599a(c cVar, h hVar, String str);

    public abstract Abstractbd mo1600a(c cVar, q qVar, String str);

    public abstract Abstractbd mo1601a(c cVar, Interfacej interfaceC0162j, int i, String str, c cVar2);

    public void m1632a(c cVar, d dVar) {
        if (!this.f568c) {
            mo1604a(cVar, (q) dVar, this.f569d.mo1642c());
        }
        if (!this.f567b) {
            mo1603a(cVar, (q) dVar, this.f569d.m1648h());
        }
        if (this.f568c) {
            this.f569d.mo1637a(mo1600a(cVar, (q) dVar, dVar.c(cVar)));
        }
    }

    public void m1633a(c cVar, h hVar) {
        String strB = hVar.b(cVar);
        int iM797t = ClassI.m797t(strB);
        if (!this.f567b) {
            iM797t++;
        }
        for (int i = iM797t - 1; i >= 0; i--) {
            this.f569d.mo1642c();
        }
        String strM796s = ClassI.m796s(strB);
        if (strM796s.charAt(0) != 'V') {
            this.f569d.mo1637a(mo1599a(cVar, hVar, strM796s));
        }
    }

    public void m1634a(c cVar, q qVar) {
        String strC = qVar.c(cVar);
        int iM797t = ClassI.m797t(strC);
        if (!this.f567b) {
            iM797t++;
        }
        for (int i = iM797t - 1; i >= 0; i--) {
            mo1602a(cVar, qVar, i, this.f569d.mo1642c());
        }
        String strM796s = ClassI.m796s(strC);
        if (strM796s.charAt(0) != 'V') {
            this.f569d.mo1637a(mo1611b(cVar, qVar, strM796s));
        }
    }

    public abstract void mo1602a(c cVar, q qVar, int i, Abstractbd abstractC0206bd);

    public abstract void mo1603a(c cVar, q qVar, Abstractap abstractC0191ap);

    public abstract void mo1604a(c cVar, q qVar, Abstractbd abstractC0206bd);

    @Override
    public void mo1032a(c cVar, Interfacei interfaceC0161i, int i, int i2, int i3, int i4, String str, c cVar2) {
        this.f570e.mo1673b(i3, mo1601a(cVar, (Interfacej) interfaceC0161i, i, str, cVar2));
    }

    @Override
    public void mo1622a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2, ClassI c0239i) {
        c0239i.mo1637a(mo1610b(cVar, (a) ((k) cVar).l(i2)));
    }

    @Override
    public void mo1623a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b, ClassI c0239i) {
        int i2 = c0047b.f139a;
        switch (c0047b.f147c) {
            case -78:
                this.f567b = true;
                this.f568c = true;
                break;
            case -77:
                this.f567b = true;
                this.f568c = false;
                break;
            case -76:
                this.f567b = false;
                this.f568c = true;
                break;
            case -75:
                this.f567b = false;
                this.f568c = false;
                break;
            case -74:
            case -73:
            case -71:
                this.f567b = false;
                break;
            case -72:
            case -70:
                this.f567b = true;
                break;
        }
        this.f569d = c0239i;
        cVar.a(i2, this);
        this.f569d = null;
    }

    public abstract void mo1605a(c cVar, Interfacej interfaceC0162j, Abstractbd abstractC0206bd);

    @Override
    public void mo1624a(c cVar, Interfacej interfaceC0162j, ClassL c0242l) {
        c0242l.mo1672b(ClassI.m762c(interfaceC0162j.mo949b(cVar), interfaceC0162j.mo945a()));
        this.f570e = c0242l;
        interfaceC0162j.mo947a(cVar, this.f566a);
        this.f570e = null;
    }

    public abstract Abstractbd mo1610b(c cVar, a aVar);

    public abstract Abstractbd mo1611b(c cVar, q qVar, String str);

    @Override
    public void mo1625b(c cVar, Interfacej interfaceC0162j, Abstractbd abstractC0206bd) {
        mo1605a(cVar, interfaceC0162j, abstractC0206bd);
    }
}
