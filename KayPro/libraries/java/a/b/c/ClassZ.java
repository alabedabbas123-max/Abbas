package a.b.c;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;
import a.b.d.Abstractc;

public class ClassZ extends Abstractc {

    protected final int f131a;

    private int f132b;

    public ClassZ(int i) {
        this.f131a = i;
    }

    @Override
    public int mo322a(int i) {
        this.f132b = i;
        return 0;
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

    public int m329j_() {
        return 536870912 | this.f131a;
    }

    public String toString() {
        return "label_" + m329j_();
    }
}
