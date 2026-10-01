package abcd;

class Uw implements org.apache.http.HttpRequestInterceptor {
    final abcd.Ww j6;

    Uw(abcd.Ww r1) {
        this.j6 = r1;
    }

    @Override
    public void process(org.apache.http.HttpRequest r2, org.apache.http.protocol.HttpContext r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.containsHeader("Accept-Encoding") == true) { $pc0 = 6; continue $sw0; }
                    r2.addHeader("Accept-Encoding", "gzip");
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
