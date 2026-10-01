package a.d.a;

final class ai extends Abstractas {

    private final Abstractae f484a;

    public ai(Abstractae abstractC0180ae) {
        this.f484a = abstractC0180ae;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (super.equals(obj) && this.f484a.equals(((ai) obj).f484a));
    }

    @Override
    public Abstractae mo1361f() {
        return this.f484a;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f484a.hashCode();
    }

    public String toString() {
        return "-" + this.f484a;
    }
}
