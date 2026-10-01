package a.d.a;

final class ClassH extends Abstractar {

    private final Abstractu f527a;

    private final byte f528b;

    private final Abstractu f529c;

    public ClassH(Abstractu abstractC0226u, byte b, Abstractu abstractC0226u2) {
        this.f527a = abstractC0226u;
        this.f528b = b;
        this.f529c = abstractC0226u2;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f527a.equals(((ClassH) obj).f527a) && this.f528b == ((ClassH) obj).f528b && this.f529c.equals(((ClassH) obj).f529c));
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f527a.hashCode()) ^ this.f529c.hashCode();
    }

    public String toString() {
        return "(" + this.f527a + ((char) this.f528b) + this.f529c + ")";
    }
}
