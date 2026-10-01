package a.d.a;

final class ClassM extends Abstractaq {

    private final Abstractbd f538a;

    public ClassM(Abstractbd abstractC0206bd) {
        this.f538a = abstractC0206bd;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f538a.equals(((ClassM) obj).f538a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f538a.hashCode();
    }

    public String toString() {
        return "(double)(" + this.f538a + ")";
    }
}
