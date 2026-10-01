package a.d.a;

final class al extends Abstractar {

    private final float f487a;

    public al(float f) {
        this.f487a = f;
    }

    @Override
    public Abstractu mo1504a(al c0187al) {
        return Float.floatToRawIntBits(this.f487a) == Float.floatToRawIntBits(c0187al.f487a) ? this : ClassC.f519c;
    }

    @Override
    public Abstractu mo1505a(Abstractu abstractC0226u) {
        return abstractC0226u.mo1504a(this);
    }

    @Override
    public Abstractu mo1506b(al c0187al) {
        return new al(this.f487a + c0187al.f487a);
    }

    @Override
    public Abstractu mo1507b(Abstractu abstractC0226u) {
        return abstractC0226u.mo1506b(this);
    }

    @Override
    public Abstractu mo1508c(al c0187al) {
        return new al(this.f487a - c0187al.f487a);
    }

    @Override
    public Abstractu mo1509c(Abstractu abstractC0226u) {
        return abstractC0226u.mo1510d(this);
    }

    @Override
    public boolean mo1321c() {
        return true;
    }

    @Override
    public Abstractu mo1510d(al c0187al) {
        return new al(c0187al.f487a - this.f487a);
    }

    @Override
    public Abstractu mo1511d(Abstractu abstractC0226u) {
        return abstractC0226u.mo1508c(this);
    }

    @Override
    public Abstractu mo1479e() {
        return new al(-this.f487a);
    }

    @Override
    public Abstractu mo1512e(al c0187al) {
        return new al(this.f487a * c0187al.f487a);
    }

    @Override
    public Abstractu mo1513e(Abstractu abstractC0226u) {
        return abstractC0226u.mo1512e(this);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && Float.floatToIntBits(this.f487a) == Float.floatToIntBits(((al) obj).f487a);
    }

    @Override
    public Abstractae mo1514f() {
        return new am((int) this.f487a);
    }

    @Override
    public Abstractu mo1515f(al c0187al) {
        return new al(this.f487a / c0187al.f487a);
    }

    @Override
    public Abstractu mo1516f(Abstractu abstractC0226u) {
        return abstractC0226u.mo1518g(this);
    }

    @Override
    public Abstractaf mo1517g() {
        return new an((long) this.f487a);
    }

    @Override
    public Abstractu mo1518g(al c0187al) {
        return new al(c0187al.f487a / this.f487a);
    }

    @Override
    public Abstractu mo1519g(Abstractu abstractC0226u) {
        return abstractC0226u.mo1515f(this);
    }

    @Override
    public Abstractt mo1520h() {
        return new ak(this.f487a);
    }

    @Override
    public Abstractu mo1521h(al c0187al) {
        return new al(this.f487a % c0187al.f487a);
    }

    @Override
    public Abstractu mo1522h(Abstractu abstractC0226u) {
        return abstractC0226u.mo1523i(this);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.f487a);
    }

    @Override
    public Abstractu mo1523i(al c0187al) {
        return new al(c0187al.f487a % this.f487a);
    }

    @Override
    public Abstractu mo1524i(Abstractu abstractC0226u) {
        return abstractC0226u.mo1521h(this);
    }

    @Override
    public Abstractae mo1525j(al c0187al) {
        if (this.f487a < c0187al.f487a) {
            return ao.f492k;
        }
        return this.f487a == c0187al.f487a ? ao.f493l : ao.f494m;
    }

    @Override
    public Abstractae mo1526j(Abstractu abstractC0226u) {
        return abstractC0226u.m1596k(this);
    }

    @Override
    public float mo1527o_() {
        return this.f487a;
    }

    public String toString() {
        return this.f487a + "f";
    }
}
