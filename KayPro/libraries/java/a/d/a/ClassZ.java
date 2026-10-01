package a.d.a;

final class ClassZ extends Abstractat {

    private final Interfacebe f552a;

    private final int f553b;

    public ClassZ(Interfacebe interfaceC0207be, int i) {
        this.f552a = interfaceC0207be;
        this.f553b = i;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f552a.equals(((ClassZ) obj).f552a) && this.f553b == ((ClassZ) obj).f553b);
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f552a.hashCode()) ^ this.f553b;
    }

    public String toString() {
        return "l" + this.f553b;
    }
}
