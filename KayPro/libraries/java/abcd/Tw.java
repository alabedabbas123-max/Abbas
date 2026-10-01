package abcd;

class Tw extends org.apache.http.impl.client.DefaultHttpClient {
    final abcd.Ww j6;

    Tw(abcd.Ww r1, org.apache.http.conn.ClientConnectionManager r2, org.apache.http.params.HttpParams r3) {
        this.j6 = r1;
        super(r2, r3);
    }

    @Override
    protected org.apache.http.conn.ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new abcd.Ww.c(null);
    }

    @Override
    protected org.apache.http.ConnectionReuseStrategy createConnectionReuseStrategy() {
        return new abcd.Ww.b(null);
    }
}
