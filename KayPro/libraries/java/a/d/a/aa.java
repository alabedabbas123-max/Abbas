package a.d.a;

import a.b.c;

final class aa extends aw {

    private final Interfacebe f471a;

    private final int f472f;

    public aa(String str, c cVar, boolean z, boolean z2, Interfacebe interfaceC0207be, int i) {
        super(str, cVar, z, z2);
        this.f471a = interfaceC0207be;
        this.f472f = i;
    }

    @Override
    public int mo1308a(aa c0176aa) {
        if (equals(c0176aa)) {
            return 1;
        }
        return mo1545b((aw) c0176aa);
    }

    @Override
    public Abstractap mo1305a(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1549b(this);
    }

    @Override
    public int mo1307b(Abstractap abstractC0191ap) {
        return abstractC0191ap.mo1308a(this);
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
        aa c0176aa = (aa) obj;
        return this.f471a.equals(c0176aa.f471a) && this.f472f == c0176aa.f472f;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f471a.hashCode()) ^ this.f472f;
    }

    @Override
    public String toString() {
        return super.toString() + '#' + this.f472f;
    }
}
