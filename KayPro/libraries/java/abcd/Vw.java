package abcd;

class Vw implements org.apache.http.HttpResponseInterceptor {
    final abcd.Ww j6;

    Vw(abcd.Ww r1) {
        this.j6 = r1;
    }

    @Override
    public void process(org.apache.http.HttpResponse r5, org.apache.http.protocol.HttpContext r6) {
        org.apache.http.HttpEntity r7 = null;
        org.apache.http.Header r8 = null;
        org.apache.http.HeaderElement[] r9 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7 = r5.getEntity();
                    if (r7 == null) { $pc0 = 13; continue $sw0; }
                    r8 = r7.getContentEncoding();
                    if (r8 == null) { $pc0 = 16; continue $sw0; }
                    r9 = r8.getElements();
                    r0 = r9.length;
                    r1 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 >= r0) { $pc0 = 17; continue $sw0; }
                    if (r9[r1].getName().equalsIgnoreCase("gzip") == true) { $pc0 = 10; continue $sw0; }
                    r1 = r1 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 10: {
                    r5.setEntity(new abcd.Ww.d(r5.getEntity()));
                    return;
                }
                case 17: {
                    return;
                }
                case 16: {
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
