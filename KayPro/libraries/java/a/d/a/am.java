package a.d.a;

final class am extends Abstractas {

    private final int f488a;

    public am(int i) {
        this.f488a = i;
    }

    @Override
    public Abstractae mo1336a(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1337a(this);
    }

    @Override
    public Abstractae mo1337a(am c0188am) {
        return mo1338a((Abstractas) c0188am);
    }

    @Override
    public Abstractaf mo1339a(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1426a(this);
    }

    @Override
    public Abstractaf mo1340a(an c0189an) {
        return new an(c0189an.mo1442e() << this.f488a);
    }

    @Override
    public Abstractae mo1342b(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1343b(this);
    }

    @Override
    public Abstractae mo1343b(am c0188am) {
        return new am(this.f488a + c0188am.f488a);
    }

    @Override
    public Abstractaf mo1345b(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1431b(this);
    }

    @Override
    public Abstractaf mo1346b(an c0189an) {
        return new an(c0189an.mo1442e() >> this.f488a);
    }

    @Override
    public Abstractae mo1348c(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1355d(this);
    }

    @Override
    public Abstractae mo1349c(am c0188am) {
        return new am(this.f488a - c0188am.f488a);
    }

    @Override
    public Abstractaf mo1351c(Abstractaf abstractC0181af) {
        return abstractC0181af.mo1436c(this);
    }

    @Override
    public Abstractaf mo1352c(an c0189an) {
        return new an(c0189an.mo1442e() >>> this.f488a);
    }

    @Override
    public boolean mo1321c() {
        return true;
    }

    @Override
    public Abstractae mo1354d(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1349c(this);
    }

    @Override
    public Abstractae mo1355d(am c0188am) {
        return new am(c0188am.f488a - this.f488a);
    }

    @Override
    public int mo1357e() {
        return this.f488a;
    }

    @Override
    public Abstractae mo1358e(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1359e(this);
    }

    @Override
    public Abstractae mo1359e(am c0188am) {
        return new am(this.f488a * c0188am.f488a);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && this.f488a == ((am) obj).f488a;
    }

    @Override
    public Abstractae mo1361f() {
        return new am(-this.f488a);
    }

    @Override
    public Abstractae mo1362f(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1366g(this);
    }

    @Override
    public Abstractae mo1363f(am c0188am) {
        return new am(this.f488a / c0188am.f488a);
    }

    @Override
    public Abstractae mo1365g(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1363f(this);
    }

    @Override
    public Abstractae mo1366g(am c0188am) {
        return new am(c0188am.f488a / this.f488a);
    }

    @Override
    public Abstractae mo1368h() {
        byte b = (byte) this.f488a;
        return b == this.f488a ? this : new am(b);
    }

    @Override
    public Abstractae mo1369h(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1373i(this);
    }

    @Override
    public Abstractae mo1370h(am c0188am) {
        return new am(this.f488a % c0188am.f488a);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode() ^ this.f488a;
    }

    @Override
    public Abstractae mo1372i(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1370h(this);
    }

    @Override
    public Abstractae mo1373i(am c0188am) {
        return new am(c0188am.f488a % this.f488a);
    }

    @Override
    public Abstractae mo1375j(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1386m(this);
    }

    @Override
    public Abstractae mo1376j(am c0188am) {
        return new am(this.f488a << c0188am.f488a);
    }

    @Override
    public Abstractae mo1378k(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1390n(this);
    }

    @Override
    public Abstractae mo1379k(am c0188am) {
        return new am(this.f488a >> c0188am.f488a);
    }

    @Override
    public Abstractae mo1381l(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1393o(this);
    }

    @Override
    public Abstractae mo1382l(am c0188am) {
        return new am(this.f488a >>> c0188am.f488a);
    }

    @Override
    public Abstractae mo1384m() {
        char c = (char) this.f488a;
        return c == this.f488a ? this : new am(c);
    }

    @Override
    public Abstractae mo1385m(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1376j(this);
    }

    @Override
    public Abstractae mo1386m(am c0188am) {
        return new am(c0188am.f488a << this.f488a);
    }

    @Override
    public Abstractae mo1388n() {
        short s = (short) this.f488a;
        return s == this.f488a ? this : new am(s);
    }

    @Override
    public Abstractae mo1389n(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1379k(this);
    }

    @Override
    public Abstractae mo1390n(am c0188am) {
        return new am(c0188am.f488a >> this.f488a);
    }

    @Override
    public Abstractae mo1392o(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1382l(this);
    }

    @Override
    public Abstractae mo1393o(am c0188am) {
        return new am(c0188am.f488a >>> this.f488a);
    }

    @Override
    public Abstractaf mo1395o() {
        return new an(this.f488a);
    }

    @Override
    public Abstractae mo1396p(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1397p(this);
    }

    @Override
    public Abstractae mo1397p(am c0188am) {
        return new am(this.f488a & c0188am.f488a);
    }

    @Override
    public Abstractu mo1399p() {
        return new al(this.f488a);
    }

    @Override
    public Abstractae mo1400q(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1401q(this);
    }

    @Override
    public Abstractae mo1401q(am c0188am) {
        return new am(this.f488a | c0188am.f488a);
    }

    @Override
    public Abstractt mo1403q() {
        return new ak(this.f488a);
    }

    @Override
    public Abstractae mo1405r(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1406r(this);
    }

    @Override
    public Abstractae mo1406r(am c0188am) {
        return new am(this.f488a ^ c0188am.f488a);
    }

    @Override
    public int mo1408s(Abstractae abstractC0180ae) {
        return abstractC0180ae.mo1409s(this);
    }

    @Override
    public int mo1409s(am c0188am) {
        return this.f488a == c0188am.f488a ? 1 : -1;
    }

    @Override
    public int mo1411t(Abstractae abstractC0180ae) {
        return abstractC0180ae.m1418v(this);
    }

    @Override
    public int mo1412t(am c0188am) {
        return this.f488a < c0188am.f488a ? 1 : -1;
    }

    public String toString() {
        return Integer.toString(this.f488a);
    }

    @Override
    public int mo1414u(Abstractae abstractC0180ae) {
        return abstractC0180ae.m1421w(this);
    }

    @Override
    public int mo1415u(am c0188am) {
        return this.f488a <= c0188am.f488a ? 1 : -1;
    }
}
