package a.d.a;

final class ClassF extends Abstractas {

    private final Abstractbd f522a;

    private final Abstractbd f523b;

    public ClassF(Abstractbd abstractC0206bd, Abstractbd abstractC0206bd2) {
        this.f522a = abstractC0206bd;
        this.f523b = abstractC0206bd2;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f522a.equals(((ClassF) obj).f522a) && this.f523b.equals(((ClassF) obj).f523b));
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f522a.hashCode()) ^ this.f523b.hashCode();
    }

    public String toString() {
        return "(" + this.f522a + "~" + this.f523b + ")";
    }
}
