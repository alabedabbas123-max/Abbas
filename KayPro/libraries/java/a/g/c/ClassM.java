package a.g.c;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;
import a.b.d.Abstractc;

class ClassM extends ClassN {

    private final int f1060b;

    private final int f1061d;

    private final int f1062e;

    private ClassM(int i, int i2, int i3, int i4) {
        super(i);
        this.f1060b = i2;
        this.f1061d = i3;
        this.f1062e = i4;
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
        ((ClassO) dVar2).m2762a(cVar, interfaceC0162j, dVar, i, this);
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
        return "catch " + (ClassK.m2743e(this.f1060b) ? "label_" : "") + this.f1060b + ", " + (ClassK.m2743e(this.f1061d) ? "label_" : "") + this.f1061d + ", #" + this.f1062e;
    }
}
