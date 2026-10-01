package a.d.a;

import a.b.c;

class ClassA extends aw {

    protected final Abstractae f470a;

    public ClassA(String str, c cVar, boolean z, Abstractae abstractC0180ae) {
        super(str, cVar, z, false);
        this.f470a = abstractC0180ae;
    }

    @Override
    public Abstractae mo1303a(Interfacebe interfaceC0207be) {
        return this.f470a;
    }

    @Override
    public Abstractap mo1304a(ClassA c0175a) {
        if (equals(c0175a)) {
            return this;
        }
        if (this.f510b != null && this.f510b.equals(c0175a.f510b) && this.f511c == c0175a.f511c) {
            return new ClassA(this.f510b, this.f511c, this.f512d || c0175a.f512d, this.f470a.mo1336a(c0175a.f470a));
        }
        return mo1539a((aw) c0175a);
    }

    @Override
    public Abstractap mo1305a(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1304a(this);
    }

    @Override
    public int mo1306b(ClassA c0175a) {
        if (this.f470a.mo1408s(c0175a.f470a) == -1) {
            return -1;
        }
        return mo1545b((aw) c0175a);
    }

    @Override
    public int mo1307b(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1306b(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return this.f470a.equals(((ClassA) obj).f470a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f470a.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + '[' + this.f470a + ']';
    }
}
