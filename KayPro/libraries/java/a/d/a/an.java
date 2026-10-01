package a.d.a;

final class an extends Abstractat {

    private final long f489a;

    public an(long j) {
        this.f489a = j;
    }

    @Override
    public Abstractaf mo1424a(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1340a(this);
    }

    @Override
    public Abstractaf mo1425a(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1427a(this);
    }

    @Override
    public Abstractaf mo1426a(am c0188am) {
        return new an(this.f489a << c0188am.mo1357e());
    }

    @Override
    public Abstractaf mo1427a(an c0189an) {
        return mo1428a((Abstractat) c0189an);
    }

    @Override
    public Abstractaf mo1429b(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1346b(this);
    }

    @Override
    public Abstractaf mo1430b(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1432b(this);
    }

    @Override
    public Abstractaf mo1431b(am c0188am) {
        return new an(this.f489a >> c0188am.mo1357e());
    }

    @Override
    public Abstractaf mo1432b(an c0189an) {
        return new an(this.f489a + c0189an.f489a);
    }

    @Override
    public Abstractaf mo1434c(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1352c(this);
    }

    @Override
    public Abstractaf mo1435c(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1440d(this);
    }

    @Override
    public Abstractaf mo1436c(am c0188am) {
        return new an(this.f489a >>> c0188am.mo1357e());
    }

    @Override
    public Abstractaf mo1437c(an c0189an) {
        return new an(this.f489a - c0189an.f489a);
    }

    @Override
    public boolean mo1321c() {
        return true;
    }

    @Override
    public Abstractaf mo1439d(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1437c(this);
    }

    @Override
    public Abstractaf mo1440d(an c0189an) {
        return new an(c0189an.f489a - this.f489a);
    }

    @Override
    public long mo1442e() {
        return this.f489a;
    }

    @Override
    public Abstractaf mo1443e(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1444e(this);
    }

    @Override
    public Abstractaf mo1444e(an c0189an) {
        return new an(this.f489a * c0189an.f489a);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && this.f489a == ((an) obj).f489a;
    }

    @Override
    public Abstractaf mo1446f() {
        return new an(-this.f489a);
    }

    @Override
    public Abstractaf mo1447f(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1451g(this);
    }

    @Override
    public Abstractaf mo1448f(an c0189an) {
        return new an(this.f489a / c0189an.f489a);
    }

    @Override
    public Abstractaf mo1450g(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1448f(this);
    }

    @Override
    public Abstractaf mo1451g(an c0189an) {
        return new an(c0189an.f489a / this.f489a);
    }

    @Override
    public Abstractae mo1453h() {
        return new am((int) this.f489a);
    }

    @Override
    public Abstractaf mo1454h(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1458i(this);
    }

    @Override
    public Abstractaf mo1455h(an c0189an) {
        return new an(this.f489a % c0189an.f489a);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode() ^ ((int) this.f489a);
    }

    @Override
    public Abstractaf mo1457i(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1455h(this);
    }

    @Override
    public Abstractaf mo1458i(an c0189an) {
        return new an(c0189an.f489a % this.f489a);
    }

    @Override
    public Abstractaf mo1460j(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1461j(this);
    }

    @Override
    public Abstractaf mo1461j(an c0189an) {
        return new an(this.f489a & c0189an.f489a);
    }

    @Override
    public Abstractaf mo1463k(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1464k(this);
    }

    @Override
    public Abstractaf mo1464k(an c0189an) {
        return new an(this.f489a | c0189an.f489a);
    }

    @Override
    public Abstractaf mo1467l(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1468l(this);
    }

    @Override
    public Abstractaf mo1468l(an c0189an) {
        return new an(this.f489a ^ c0189an.f489a);
    }

    @Override
    public Abstractae mo1470m(Abstractaf abstractC0181af) {
        return abstractC0181af.m1475n(this);
    }

    @Override
    public Abstractu mo1473m() {
        return new al(this.f489a);
    }

    @Override
    public Abstractt mo1477n() {
        return new ak(this.f489a);
    }

    public String toString() {
        return this.f489a + "L";
    }
}
