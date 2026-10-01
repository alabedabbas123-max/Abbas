package a.c;

import a.b.b.b;
import a.b.c;
import a.b.c.ae;
import a.b.d.a.d;
import a.b.k;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.c.ClassV;
import a.b.d.Abstractc;
import a.b.f.ClassI;
import a.g.c.ClassA;
import a.g.c.ClassK;

public class ClassE extends ClassK {
    public ClassE(b[] bVarArr, Abstractc[] abstractC0048cArr, b[] bVarArr2, Abstractc[] abstractC0048cArr2, ClassA c0409a, ClassV c0036v, d dVar) {
        super(bVarArr, abstractC0048cArr, bVarArr2, abstractC0048cArr2, c0409a, c0036v, dVar);
    }

    @Override
    protected int mo1289a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, int i2) {
        switch (i2) {
            case 805306369:
                return dVar.d;
            case 805306370:
                return dVar.d + 1;
            case 805306371:
                return dVar.d + 2;
            default:
                return super.m2745a(cVar, i2);
        }
    }

    @Override
    protected int mo1290a(k kVar, int i) {
        switch (i) {
            case 805306368:
                return new ae(kVar).a(ClassI.m764c(kVar.b()), kVar, (Interfacei) null);
            default:
                return super.mo1290a(kVar, i);
        }
    }
}
