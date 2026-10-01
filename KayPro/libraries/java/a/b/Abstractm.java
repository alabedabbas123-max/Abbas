package a.b;

import a.b.a.a;
import a.b.a.d.i;
import a.b.c;
import a.b.g.aq;
import a.b.k;

public abstract class Abstractm implements Interfacei {

    public int f430b;

    public int f431c;

    public int f432d;

    public int f433e;

    public a[] f434f;

    public Object f435g;

    protected Abstractm() {
    }

    protected Abstractm(int i, int i2, int i3, int i4, a[] aVarArr) {
        this.f430b = i;
        this.f431c = i2;
        this.f432d = i3;
        this.f433e = i4;
        this.f434f = aVarArr;
    }

    @Override
    public int mo945a() {
        return this.f430b;
    }

    @Override
    public String mo946a(c cVar) {
        return cVar.c(this.f431c);
    }

    @Override
    public void mo947a(c cVar, aq aqVar) {
        mo1268a((k) cVar, aqVar);
    }

    public abstract void mo1267a(k kVar, i iVar);

    public abstract void mo1268a(k kVar, aq aqVar);

    public void m1269a(Object obj) {
        this.f435g = obj;
    }

    @Override
    public String mo949b(c cVar) {
        return cVar.c(this.f432d);
    }

    public Object m1270f() {
        return this.f435g;
    }
}
