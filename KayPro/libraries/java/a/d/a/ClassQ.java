package a.d.a;

final class ClassQ extends Abstractas {

    private final Abstractae f542a;

    public ClassQ(Abstractae abstractC0180ae) {
        this.f542a = abstractC0180ae;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f542a.equals(((ClassQ) obj).f542a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f542a.hashCode();
    }

    public String toString() {
        return "(short)(" + this.f542a + ")";
    }
}
