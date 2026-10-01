package a.d.a;

final class ClassL extends Abstractas {

    private final Abstractae f537a;

    public ClassL(Abstractae abstractC0180ae) {
        this.f537a = abstractC0180ae;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f537a.equals(((ClassL) obj).f537a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f537a.hashCode();
    }

    public String toString() {
        return "(char)(" + this.f537a + ")";
    }
}
