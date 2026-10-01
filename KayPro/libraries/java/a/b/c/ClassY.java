package a.b.c;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;
import a.b.d.Abstractc;

class ClassY extends Abstractc {

    final ClassV f129a;

    private Abstractc[] f130b;

    private ClassY(ClassV c0036v, Abstractc[] abstractC0048cArr) {
        this.f129a = c0036v;
        this.f130b = abstractC0048cArr;
    }

    @Override
    public int mo322a(int i) {
        int iMo322a = i;
        for (int i2 = 0; i2 < this.f130b.length; i2++) {
            iMo322a += this.f130b[i2].mo322a(iMo322a);
        }
        return iMo322a - i;
    }

    @Override
    public Abstractc mo323a() {
        for (int i = 0; i < this.f130b.length; i++) {
            this.f130b[i] = this.f130b[i].mo323a();
        }
        return this;
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, d dVar, int i, a.b.d.a.d dVar2) {
        if (dVar2 != this.f129a) {
            throw new UnsupportedOperationException("Unexpected visitor [" + dVar2 + "]");
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f130b.length) {
                return;
            }
            this.f130b[i3].mo324a(cVar, interfaceC0162j, dVar, i, this.f129a);
            i2 = i3 + 1;
        }
    }

    @Override
    public void mo325a(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.f130b.length; i2++) {
            Abstractc abstractC0048c = this.f130b[i2];
            abstractC0048c.mo325a(bArr, i);
            i += abstractC0048c.mo322a(i);
        }
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        throw new UnsupportedOperationException("Can't read composite instruction");
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        throw new UnsupportedOperationException("Can't write composite instruction");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f130b.length; i++) {
            stringBuffer.append(this.f130b[i].toString()).append("; ");
        }
        return stringBuffer.toString();
    }
}
