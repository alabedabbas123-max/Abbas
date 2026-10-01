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
            this.FH = r4;
            java.lang.Object r0 = r4.get("error");
            if ((r0 instanceof java.lang.String) == false) goto L6;
            this.j6 = (java.lang.String) r0;
        L13:
            java.lang.Object r5 = r4.get("user_error");
            if ((r5 instanceof java.lang.String) == false) goto L22;
            this.DW = (java.lang.String) r5;
            return;
        L22:
            return;
        L6:
            if ((r0 instanceof java.util.Map) == false) goto L13;
            java.util.Iterator r1 = ((java.util.Map) r0).values().iterator();
        L9:
            if (r1.hasNext() == false) goto L13;
            java.lang.Object r2 = r1.next();
            if ((r2 instanceof java.lang.String) == false) goto L9;
            this.j6 = (java.lang.String) r2;
            goto L9
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
        this(r1);
        if (r2 != null) goto L5;
        return;
    L5:
        if ((r2 instanceof java.util.Map) == false) goto L9;
        this.Zo = (java.util.Map) r2;
        this.j6 = new abcd.Pw.a(this.Zo);
        return;
    }

    private static java.lang.String j6(org.apache.http.HttpResponse r0, java.lang.String r1) {
        org.apache.http.Header r2 = r0.getFirstHeader(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return r2.getValue();
    }

    public static boolean j6(org.apache.http.HttpResponse r4) {
        int r0 = r4.getStatusLine().getStatusCode();
        if (r0 != 302) goto L14;
        java.lang.String r5 = j6(r4, "location");
        if (r5 == null) goto L16;
        int r1 = r5.indexOf("://");
        if (r1 <= (-1)) goto L16;
        java.lang.String r6 = r5.substring(r1 + 3);
        int r2 = r6.indexOf("/");
        if (r2 <= (-1)) goto L16;
        if (r6.substring(0, r2).toLowerCase().contains("dropbox.com") == false) goto L16;
        return true;
    L16:
        return false;
    L14:
        if (r0 != 304) goto L16;
        return true;
    }

    @Override
    public java.lang.String toString() {
        return "DropboxServerException (" + this.Hw + "): " + this.DW + " " + this.FH + " (" + this.j6.j6 + ")";
    }
}
