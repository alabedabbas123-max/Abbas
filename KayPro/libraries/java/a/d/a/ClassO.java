package a.d.a;

final class ClassO extends Abstractas {

    private final Abstractbd f540a;

    public ClassO(Abstractbd abstractC0206bd) {
        this.f540a = abstractC0206bd;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f540a.equals(((ClassO) obj).f540a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f540a.hashCode();
    }

    public String toString() {
        return "(int)(" + this.f540a + ")";
    }
}
