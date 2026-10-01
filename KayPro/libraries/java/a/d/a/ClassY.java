package a.d.a;

final class ClassY extends Abstractas {

    private final Interfacebe f550a;

    private final int f551b;

    public ClassY(Interfacebe interfaceC0207be, int i) {
        this.f550a = interfaceC0207be;
        this.f551b = i;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f550a.equals(((ClassY) obj).f550a) && this.f551b == ((ClassY) obj).f551b);
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f550a.hashCode()) ^ this.f551b;
    }

    public String toString() {
        return "i" + this.f551b;
    }
}
