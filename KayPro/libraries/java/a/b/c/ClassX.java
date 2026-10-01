package a.b.c;

import a.b.a.d;
import a.b.a.h;
import a.b.c;
import a.b.c.am;
import a.b.Interfacej;
import a.b.d.Abstractc;

class ClassX extends ClassZ {

    private final int f126b;

    private final int f127d;

    private final int f128e;

    public ClassX(int i, int i2, int i3, int i4) {
        super(i);
        this.f126b = i2;
        this.f127d = i3;
        this.f128e = i4;
    }

    @Override
    public int mo322a(int i) {
        return super.mo322a(i);
    }

    @Override
    public Abstractc mo323a() {
        return this;
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, d dVar, int i, a.b.d.a.d dVar2) {
        if (dVar2.getClass() != ClassV.class) {
            throw new UnsupportedOperationException("Unexpected visitor [" + dVar2 + "]");
        }
        new am(dVar).a(new h(this.f126b, this.f127d, m329j_(), this.f128e));
    }

    @Override
    public void mo325a(byte[] bArr, int i) {
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        throw new UnsupportedOperationException("Can't read catch instruction");
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        throw new UnsupportedOperationException("Can't write catch instruction");
    }

    @Override
    public String toString() {
        return "catch " + (ClassV.m274j(this.f126b) ? "label_" : "") + this.f126b + ", " + (ClassV.m274j(this.f127d) ? "label_" : "") + this.f127d + ", #" + this.f128e;
    }
}
