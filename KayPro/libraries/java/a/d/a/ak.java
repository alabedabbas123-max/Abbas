package a.d.a;

final class ak extends Abstractaq {

    private final double f486a;

    public ak(double d) {
        this.f486a = d;
    }

    @Override
    public Abstractt mo1480a(ak c0186ak) {
        return Double.doubleToRawLongBits(this.f486a) == Double.doubleToRawLongBits(c0186ak.f486a) ? this : ClassC.f520d;
    }

    @Override
    public Abstractt mo1481a(Abstractt abstractC0225t) {
        return abstractC0225t.mo1480a(this);
    }

    @Override
    public Abstractt mo1482b(ak c0186ak) {
        return new ak(this.f486a + c0186ak.f486a);
    }

    @Override
    public Abstractt mo1483b(Abstractt abstractC0225t) {
        return abstractC0225t.mo1482b(this);
    }

    @Override
    public Abstractt mo1484c(ak c0186ak) {
        return new ak(this.f486a - c0186ak.f486a);
    }

    @Override
    public Abstractt mo1485c(Abstractt abstractC0225t) {
        return abstractC0225t.mo1486d(this);
    }

    @Override
    public boolean mo1321c() {
        return true;
    }

    @Override
    public Abstractt mo1486d(ak c0186ak) {
        return new ak(c0186ak.f486a - this.f486a);
    }

    @Override
    public Abstractt mo1487d(Abstractt abstractC0225t) {
        return abstractC0225t.mo1484c(this);
    }

    @Override
    public Abstractt mo1478e() {
        return new ak(-this.f486a);
    }

    @Override
    public Abstractt mo1488e(ak c0186ak) {
        return new ak(this.f486a * c0186ak.f486a);
    }

    @Override
    public Abstractt mo1489e(Abstractt abstractC0225t) {
        return abstractC0225t.mo1488e(this);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && Double.doubleToLongBits(this.f486a) == Double.doubleToLongBits(((ak) obj).f486a);
    }

    @Override
    public Abstractae mo1490f() {
        return new am((int) this.f486a);
    }

    @Override
    public Abstractt mo1491f(ak c0186ak) {
        return new ak(this.f486a / c0186ak.f486a);
    }

    @Override
    public Abstractt mo1492f(Abstractt abstractC0225t) {
        return abstractC0225t.mo1494g(this);
    }

    @Override
    public Abstractaf mo1493g() {
        return new an((long) this.f486a);
    }

    @Override
    public Abstractt mo1494g(ak c0186ak) {
        return new ak(c0186ak.f486a / this.f486a);
    }

    @Override
    public Abstractt mo1495g(Abstractt abstractC0225t) {
        return abstractC0225t.mo1491f(this);
    }

    @Override
    public Abstractt mo1496h(ak c0186ak) {
        return new ak(this.f486a % c0186ak.f486a);
    }

    @Override
    public Abstractt mo1497h(Abstractt abstractC0225t) {
        return abstractC0225t.mo1499i(this);
    }

    @Override
    public Abstractu mo1498h() {
        return new al((float) this.f486a);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ ((int) Double.doubleToLongBits(this.f486a));
    }

    @Override
    public Abstractt mo1499i(ak c0186ak) {
        return new ak(c0186ak.f486a % this.f486a);
    }

    @Override
    public Abstractt mo1500i(Abstractt abstractC0225t) {
        return abstractC0225t.mo1496h(this);
    }

    @Override
    public Abstractae mo1501j(ak c0186ak) {
        if (this.f486a < c0186ak.f486a) {
            return ao.f492k;
        }
        return this.f486a == c0186ak.f486a ? ao.f493l : ao.f494m;
    }

    @Override
    public Abstractae mo1502j(Abstractt abstractC0225t) {
        return abstractC0225t.m1593k(this);
    }

    @Override
    public double mo1503m_() {
        return this.f486a;
    }

    public String toString() {
        return this.f486a + "d";
    }
}
