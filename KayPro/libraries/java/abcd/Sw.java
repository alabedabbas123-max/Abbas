package abcd;

class Sw implements org.apache.http.conn.params.ConnPerRoute {
    final abcd.Ww j6;

    Sw(abcd.Ww r1) {
        this.j6 = r1;
    }

    @Override
    public int getMaxForRoute(org.apache.http.conn.routing.HttpRoute r1) {
        return 10;
    }
}
