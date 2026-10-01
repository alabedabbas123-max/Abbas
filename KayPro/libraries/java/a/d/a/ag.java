package a.d.a;

final class ag extends Abstractaq {

    private final Abstractt f482a;

    public ag(Abstractt abstractC0225t) {
        this.f482a = abstractC0225t;
    }

    @Override
    public Abstractt mo1478e() {
        return this.f482a;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f482a.equals(((ag) obj).f482a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f482a.hashCode();
    }

    public String toString() {
        return "-" + this.f482a;
    }
}
