package abcd;

public class Pw extends abcd.Jw {
    public int DW;
    public java.lang.String FH;
    public java.lang.String Hw;
    public java.util.Map<java.lang.String, java.lang.Object> Zo;
    public abcd.Pw.a j6;
    public java.lang.String v5;

    public static class a {
        public java.lang.String DW;
        public java.util.Map<java.lang.String, java.lang.Object> FH;
        public java.lang.String j6;

        public a(java.util.Map<java.lang.String, java.lang.Object> r4) {
            java.lang.Object r0 = null;
            java.lang.Object r5 = null;
            java.util.Iterator r1 = null;
            java.lang.Object r2 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.FH = r4;
                        r0 = r4.get("error");
                        if ((r0 instanceof java.lang.String) == false) { $pc0 = 6; continue $sw0; }
                        this.j6 = (java.lang.String) r0;
                        $pc0 = 13; continue $sw0;
                    }
                    case 13: {
                        r5 = r4.get("user_error");
                        if ((r5 instanceof java.lang.String) == false) { $pc0 = 22; continue $sw0; }
                        this.DW = (java.lang.String) r5;
                        return;
                    }
                    case 22: {
                        return;
                    }
                    case 6: {
                        if ((r0 instanceof java.util.Map) == false) { $pc0 = 13; continue $sw0; }
                        r1 = ((java.util.Map) r0).values().iterator();
                        $pc0 = 9; continue $sw0;
                    }
                    case 9: {
                        if (r1.hasNext() == false) { $pc0 = 13; continue $sw0; }
                        r2 = r1.next();
                        if ((r2 instanceof java.lang.String) == false) { $pc0 = 9; continue $sw0; }
                        this.j6 = (java.lang.String) r2;
                        { $pc0 = 9; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public Pw(org.apache.http.HttpResponse r3) {
        fillInStackTrace();
        org.apache.http.StatusLine r0 = r3.getStatusLine();
        this.DW = r0.getStatusCode();
        this.FH = r0.getReasonPhrase();
        this.Hw = j6(r3, "server");
        this.v5 = j6(r3, "location");
    }

    public Pw(org.apache.http.HttpResponse r1, java.lang.Object r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this(r1);
                    if (r2 != null) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    if ((r2 instanceof java.util.Map) == false) { $pc1 = 9; continue $sw1; }
                    this.Zo = (java.util.Map) r2;
                    this.j6 = new abcd.Pw.a(this.Zo);
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(org.apache.http.HttpResponse r0, java.lang.String r1) {
        org.apache.http.Header r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r2 = r0.getFirstHeader(r1);
                    if (r2 != null) { $pc2 = 7; continue $sw2; }
                    return null;
                }
                case 7: {
                    return r2.getValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(org.apache.http.HttpResponse r4) {
        int r0 = 0;
        java.lang.String r5 = null;
        int r1 = 0;
        java.lang.String r6 = null;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r4.getStatusLine().getStatusCode();
                    if (r0 != 302) { $pc3 = 14; continue $sw3; }
                    r5 = j6(r4, "location");
                    if (r5 == null) { $pc3 = 16; continue $sw3; }
                    r1 = r5.indexOf("://");
                    if (r1 <= (-1)) { $pc3 = 16; continue $sw3; }
                    r6 = r5.substring(r1 + 3);
                    r2 = r6.indexOf("/");
                    if (r2 <= (-1)) { $pc3 = 16; continue $sw3; }
                    if (r6.substring(0, r2).toLowerCase().contains("dropbox.com") == false) { $pc3 = 16; continue $sw3; }
                    return true;
                }
                case 16: {
                    return false;
                }
                case 14: {
                    if (r0 != 304) { $pc3 = 16; continue $sw3; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        return "DropboxServerException (" + this.Hw + "): " + this.DW + " " + this.FH + " (" + this.j6.j6 + ")";
    }
}
