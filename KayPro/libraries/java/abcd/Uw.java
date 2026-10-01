package abcd;

class Uw implements org.apache.http.HttpRequestInterceptor {
    final abcd.Ww j6;

    Uw(abcd.Ww r1) {
        this.j6 = r1;
    }

    @Override
    public void process(org.apache.http.HttpRequest r2, org.apache.http.protocol.HttpContext r3) {
        if (r2.containsHeader("Accept-Encoding") == true) goto L6;
        r2.addHeader("Accept-Encoding", "gzip");
        return;
    }
}
