package a.g.c;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;
import a.b.d.Abstractc;

public class ClassN extends Abstractc {

    protected final int f1063a;

    private ClassN(int i) {
        this.f1063a = i;
    }

    @Override
    public int mo322a(int i) {
        return 0;
    }

    @Override
    public Abstractc mo323a() {
        return this;
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, d dVar, int i, a.b.d.a.d dVar2) {
        ((ClassO) dVar2).m2763a(cVar, interfaceC0162j, dVar, i, this);
    }

    @Override
    public void mo325a(byte[] bArr, int i) {
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        throw new UnsupportedOperationException("Can't read label instruction");
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        throw new UnsupportedOperationException("Can't write label instruction");
    }

    public int m2754g() {
        return 536870912 | this.f1063a;
    }

    public String toString() {
        return "label_" + m2754g();
    }
}
