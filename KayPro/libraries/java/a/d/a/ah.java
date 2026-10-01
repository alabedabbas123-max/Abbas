package a.d.a;

final class ah extends Abstractar {

    private final Abstractu f483a;

    public ah(Abstractu abstractC0226u) {
        this.f483a = abstractC0226u;
    }

    @Override
    public Abstractu mo1479e() {
        return this.f483a;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f483a.equals(((ah) obj).f483a));
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f483a.hashCode();
    }

    public String toString() {
        return "-" + this.f483a;
    }
}
