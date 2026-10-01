package a.d.a;

final class ClassI extends Abstractas {

    private final Abstractae f530a;

    private final byte f531b;

    private final Abstractae f532c;

    public ClassI(Abstractae abstractC0180ae, byte b, Abstractae abstractC0180ae2) {
        this.f530a = abstractC0180ae;
        this.f531b = b;
        this.f532c = abstractC0180ae2;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f530a.equals(((ClassI) obj).f530a) && this.f531b == ((ClassI) obj).f531b && this.f532c.equals(((ClassI) obj).f532c));
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f530a.hashCode()) ^ this.f532c.hashCode();
    }

    public String toString() {
        return "(" + this.f530a + ((char) this.f531b) + this.f532c + ")";
    }
}
