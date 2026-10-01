package a.d.a;

final class ClassP extends Abstractat {

    private final Abstractbd f541a;

    public ClassP(Abstractbd abstractC0206bd) {
        this.f541a = abstractC0206bd;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f541a.equals(((ClassP) obj).f541a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f541a.hashCode();
    }

    public String toString() {
        return "(long)(" + this.f541a + ")";
    }
}
