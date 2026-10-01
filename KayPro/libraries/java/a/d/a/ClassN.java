package a.d.a;

final class ClassN extends Abstractar {

    private final Abstractbd f539a;

    public ClassN(Abstractbd abstractC0206bd) {
        this.f539a = abstractC0206bd;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f539a.equals(((ClassN) obj).f539a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f539a.hashCode();
    }

    public String toString() {
        return "(float)(" + this.f539a + ")";
    }
}
