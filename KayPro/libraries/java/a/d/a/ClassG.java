package a.d.a;

final class ClassG extends Abstractaq {

    private final Abstractt f524a;

    private final byte f525b;

    private final Abstractt f526c;

    public ClassG(Abstractt abstractC0225t, byte b, Abstractt abstractC0225t2) {
        this.f524a = abstractC0225t;
        this.f525b = b;
        this.f526c = abstractC0225t2;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f524a.equals(((ClassG) obj).f524a) && this.f525b == ((ClassG) obj).f525b && this.f526c.equals(((ClassG) obj).f526c));
    }

    @Override
    public int hashCode() {
        return (super.hashCode() ^ this.f524a.hashCode()) ^ this.f526c.hashCode();
    }

    public String toString() {
        return "(" + this.f524a + ((char) this.f525b) + this.f526c + ")";
    }
}
