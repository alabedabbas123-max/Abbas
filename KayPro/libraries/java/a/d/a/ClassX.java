package a.d.a;

final class ClassX extends Abstractar {

    private final Interfacebe f548a;

    private final int f549b;

    public ClassX(Interfacebe interfaceC0207be, int i) {
        this.f548a = interfaceC0207be;
        this.f549b = i;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f548a.equals(((ClassX) obj).f548a) && this.f549b == ((ClassX) obj).f549b);
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f548a.hashCode()) ^ this.f549b;
    }

    public String toString() {
        return "f" + this.f549b;
    }
}
