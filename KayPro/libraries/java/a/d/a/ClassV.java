package a.d.a;

import a.b.c;

class ClassV extends ClassA {

    private final Interfacebe f544f;

    private final int f545g;

    public ClassV(String str, c cVar, boolean z, Abstractae abstractC0180ae, Interfacebe interfaceC0207be, int i) {
        super(str, cVar, z, abstractC0180ae);
        this.f544f = interfaceC0207be;
        this.f545g = i;
    }

    @Override
    public int mo1535a(ClassV c0227v) {
        if (equals(c0227v)) {
            return 1;
        }
        return mo1545b((aw) c0227v);
    }

    @Override
    public Abstractap mo1305a(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1550b(this);
    }

    @Override
    public int mo1307b(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1535a(this);
    }

    @Override
    public boolean mo1309d() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        ClassV c0227v = (ClassV) obj;
        return this.f544f.equals(c0227v.f544f) && this.f545g == c0227v.f545g;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f544f.hashCode()) ^ this.f545g;
    }

    @Override
    public String toString() {
        return super.toString() + '#' + this.f545g;
    }
}
