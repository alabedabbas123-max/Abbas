package a.d.a;

final class ClassJ extends Abstractat {

    private final Abstractaf f533a;

    private final byte f534b;

    private final Abstractbd f535c;

    public ClassJ(Abstractaf abstractC0181af, byte b, Abstractbd abstractC0206bd) {
        this.f533a = abstractC0181af;
        this.f534b = b;
        this.f535c = abstractC0206bd;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f533a.equals(((ClassJ) obj).f533a) && this.f534b == ((ClassJ) obj).f534b && this.f535c.equals(((ClassJ) obj).f535c));
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f533a.hashCode()) ^ this.f535c.hashCode();
    }

    public String toString() {
        return "(" + this.f533a + ((char) this.f534b) + this.f535c + ")";
    }
}
