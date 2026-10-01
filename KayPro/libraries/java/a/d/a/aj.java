package a.d.a;

final class aj extends Abstractat {

    private final Abstractaf f485a;

    public aj(Abstractaf abstractC0181af) {
        this.f485a = abstractC0181af;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f485a.equals(((aj) obj).f485a));
    }

    @Override
    public Abstractaf mo1446f() {
        return this.f485a;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f485a.hashCode();
    }

    public String toString() {
        return "-" + this.f485a;
    }
}
