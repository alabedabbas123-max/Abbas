package a.d.a;

final class ClassK extends Abstractas {

    private final Abstractae f536a;

    public ClassK(Abstractae abstractC0180ae) {
        this.f536a = abstractC0180ae;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f536a.equals(((ClassK) obj).f536a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f536a.hashCode();
    }

    public String toString() {
        return "(byte)(" + this.f536a + ")";
    }
}
