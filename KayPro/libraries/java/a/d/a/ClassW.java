package a.d.a;

final class ClassW extends Abstractaq {

    private final Interfacebe f546a;

    private final int f547b;

    public ClassW(Interfacebe interfaceC0207be, int i) {
        this.f546a = interfaceC0207be;
        this.f547b = i;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f546a.equals(((ClassW) obj).f546a) && this.f547b == ((ClassW) obj).f547b);
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f546a.hashCode()) ^ this.f547b;
    }

    public String toString() {
        return "d" + this.f547b;
    }
}
