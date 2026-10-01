package abcd;

public class Gw {
    private static final java.text.DateFormat j6 = null;

    public static final enum a extends java.lang.Enum<abcd.Gw.a> {
        public static final abcd.Gw.a DW = null;
        private static final abcd.Gw.a[] FH = null;
        public static final abcd.Gw.a j6 = null;

        static {
            j6 = new abcd.Gw.a("GET", 0);
            DW = new abcd.Gw.a("POST", 1);
            FH = new abcd.Gw.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.Gw.a valueOf(java.lang.String r1) {
            return (abcd.Gw.a) java.lang.Enum.valueOf(abcd.Gw.a.class, r1);
        }

        public static abcd.Gw.a[] values() {
            return (abcd.Gw.a[]) FH.clone();
        }
    }

    static {
        j6 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy kk:mm:ss ZZZZZ", java.util.Locale.US);
    }

    public static abcd.Dw.f DW(abcd.Gw.a r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String[] r6, abcd.Zw r7) {
        if (r2 != abcd.Gw.a.j6) goto L5;
        org.apache.http.client.methods.HttpUriRequest r8 = new org.apache.http.client.methods.HttpGet(j6(r3, r5, r4, r6));
    L25:
        r7.j6(r8);
        return new abcd.Dw.f(r8, j6(r7, r8));
    L5:
        org.apache.http.client.methods.HttpPost r9 = new org.apache.http.client.methods.HttpPost(j6(r3, r5, r4, null));
        r8 = r9;
        if (r6 == null) goto L25;
        r8 = r9;
        if (r6.length < 2) goto L25;
        if ((r6.length % 2) != 0) goto L24;
        java.util.ArrayList r10 = new java.util.ArrayList();
        int r11 = 0;
    L13:
        if (r11 >= r6.length) goto L27;
        int r12 = r11 + 1;
        if (r6[r12] == null) goto L17;
        r10.add(new org.apache.http.message.BasicNameValuePair(r6[r11], r6[r12]));
    L17:
        r11 = r11 + 2;
        goto L13
    L27:
        r9.setEntity(new org.apache.http.client.entity.UrlEncodedFormEntity(r10, "UTF-8"));     // Catch: java.io.UnsupportedEncodingException -> L20
        r8 = r9;
    L20:
        e = move-exception;
        throw new abcd.Jw(e);
    L24:
        throw new java.lang.IllegalArgumentException("Params must have an even number of elements.");
    }

    public static java.lang.Object j6(abcd.Gw.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.String[] r4, abcd.Zw r5) {
        return j6(DW(r0, r1, r2, r3, r4, r5).DW);
    }

    public static java.lang.Object j6(org.apache.http.HttpResponse r5) {
        java.io.BufferedReader r0 = null;
        org.apache.http.HttpEntity r1 = r5.getEntity();     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L31 abcd.kL -> L47 java.io.IOException -> L40
        if (r1 == null) goto L15;
        java.io.BufferedReader r2 = new java.io.BufferedReader(new java.io.InputStreamReader(r1.getContent()), 16384);     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L31 abcd.kL -> L47 java.io.IOException -> L40
        goto L35
    L54:
        r2.mark(16384);     // Catch: java.lang.Throwable -> L8 java.lang.OutOfMemoryError -> L10 abcd.kL -> L12 java.io.IOException -> L13
        java.lang.Object r3 = new abcd.jL().j6(r2);     // Catch: java.lang.Throwable -> L8 java.lang.OutOfMemoryError -> L10 abcd.kL -> L12 java.io.IOException -> L13
        r0 = r2;
    L16:
        if (r0 != null) goto L48;
    L20:
        int r4 = r5.getStatusLine().getStatusCode();
        if (r4 != 200) goto L23;
        return r3;
    L23:
        if (r4 != 401) goto L27;
        throw new abcd.Qw();
    L27:
        throw new abcd.Pw(r5, r3);
    L48:
        r0.close();     // Catch: java.io.IOException -> L19
        goto L20
    L12:
        r0 = r2;
    L13:
        e = e;
    L42:
        throw new abcd.Kw(e);     // Catch: java.lang.Throwable -> L29
    L10:
        e = e;
    L33:
        throw new abcd.Jw(e);     // Catch: java.lang.Throwable -> L29
    L8:
        th = th;
        r0 = r2;
    L43:
        if (r0 != null) goto L51;
    L45:
        throw th;
    L51:
        r0.close();     // Catch: java.io.IOException -> L46
        goto L45
    L15:
        r3 = null;
    L29:
        th = th;
    L40:
        e = e;
    L31:
        e = e;
    L35:
        if (abcd.Pw.j6(r5) == false) goto L39;
        throw new abcd.Pw(r5);     // Catch: java.lang.Throwable -> L29
    L39:
        throw new abcd.Lw(r0);     // Catch: java.lang.Throwable -> L29
    }

    public static java.lang.String j6(java.lang.String r2, int r3, java.lang.String r4, java.lang.String[] r5) {
        if (r4.startsWith("/") == true) goto L15;
        r4 = "/" + r4;
    L15:
        java.lang.String r6 = java.net.URLEncoder.encode("/" + r3 + r4, "UTF-8").replace("%2F", "/");     // Catch: java.io.UnsupportedEncodingException -> L13
        if (r5 != null) goto L8;
    L10:
        return "https://" + r2 + ":443" + r6.replace("+", "%20").replace("*", "%2A");
    L8:
        if (r5.length <= 0) goto L10;
        r6 = r6 + "?" + j6(r5);     // Catch: java.io.UnsupportedEncodingException -> L13
    L13:
        return null;
    }

    private static java.lang.String j6(java.lang.String[] r7) {
        if ((r7.length % 2) != 0) goto L18;
        java.lang.String r3 = "";
        int r2 = 0;
        boolean r4 = true;
    L20:
        if (r2 >= r7.length) goto L14;
        int r5 = r2 + 1;     // Catch: java.io.UnsupportedEncodingException -> L15
        if (r7[r5] == null) goto L13;
        if (r4 == false) goto L11;
        r4 = false;
    L12:
        r3 = r3 + java.net.URLEncoder.encode(r7[r2], "UTF-8") + "=" + java.net.URLEncoder.encode(r7[r5], "UTF-8");     // Catch: java.io.UnsupportedEncodingException -> L15
        goto L13
    L11:
        r3 = r3 + "&";     // Catch: java.io.UnsupportedEncodingException -> L15
    L13:
        r2 = r2 + 2;
        goto L20
    L14:
        return r3;
    L15:
        return null;
    L18:
        throw new java.lang.IllegalArgumentException("Params must have an even number of elements.");
    }

    public static org.apache.http.HttpResponse j6(abcd.Zw r1, org.apache.http.client.methods.HttpUriRequest r2) {
        return j6(r1, r2, -1);
    }

    public static org.apache.http.HttpResponse j6(abcd.Zw r4, org.apache.http.client.methods.HttpUriRequest r5, int r6) {
        org.apache.http.client.HttpClient r0 = j6(r4);
        r4.j6(r5);
        if (r6 < 0) goto L5;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r5.getParams(), r6);
    L5:
        boolean r7 = j6(r5);
        org.apache.http.HttpResponse r1 = null;
        int r2 = 0;
    L7:
        if (r2 >= 5) goto L23;
        r1 = r0.execute(r5);     // Catch: java.lang.OutOfMemoryError -> L10 java.io.IOException -> L12 javax.net.ssl.SSLException -> L14 java.lang.NullPointerException -> L39
    L10:
        e = move-exception;
        throw new abcd.Jw(e);
    L14:
        e = move-exception;
        throw new abcd.Ow(e);
    L12:
        e = move-exception;
        throw new abcd.Kw(e);
    L16:
        if (r1 != null) goto L23;
        j6(r0, r4);     // Catch: java.lang.OutOfMemoryError -> L10 java.io.IOException -> L12 javax.net.ssl.SSLException -> L14
        if (r7 == false) goto L22;
        r2 = r2 + 1;     // Catch: java.lang.OutOfMemoryError -> L10 java.io.IOException -> L12 javax.net.ssl.SSLException -> L14
        goto L7
    L22:
        throw new abcd.Nw();     // Catch: java.lang.OutOfMemoryError -> L10 java.io.IOException -> L12 javax.net.ssl.SSLException -> L14
    L23:
        if (r1 == null) goto L31;
        int r8 = r1.getStatusLine().getStatusCode();     // Catch: java.lang.OutOfMemoryError -> L10 java.io.IOException -> L12 javax.net.ssl.SSLException -> L14
        if (r8 != 200) goto L27;
    L29:
        return r1;
    L27:
        if (r8 == 206) goto L29;
        j6(r1);     // Catch: java.lang.OutOfMemoryError -> L10 java.io.IOException -> L12 javax.net.ssl.SSLException -> L14
        goto L29
    L31:
        throw new abcd.Kw("Apache HTTPClient encountered an error. No response, try again.");     // Catch: java.lang.OutOfMemoryError -> L10 java.io.IOException -> L12 javax.net.ssl.SSLException -> L14
    }

    private static synchronized org.apache.http.client.HttpClient j6(abcd.Zw r2) {
        monitor-enter(abcd.Gw.class);
        org.apache.http.client.HttpClient r1 = r2.v5();     // Catch: java.lang.Throwable -> L7
        j6(r1, r2);     // Catch: java.lang.Throwable -> L7
        monitor-exit(abcd.Gw.class);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    private static void j6(org.apache.http.client.HttpClient r3, abcd.Zw r4) {
        abcd.Zw.b r5 = r4.j6();
        if (r5 == null) goto L13;
        java.lang.String r1 = r5.j6;
        if (r1 == null) goto L13;
        if (r1.equals("") == true) goto L13;
        int r2 = r5.DW;
        if (r2 >= 0) goto L11;
        org.apache.http.HttpHost r6 = new org.apache.http.HttpHost(r5.j6);
    L12:
        r3.getParams().setParameter("http.route.default-proxy", r6);
        return;
    L11:
        r6 = new org.apache.http.HttpHost(r5.j6, r2);
    L13:
        r3.getParams().removeParameter("http.route.default-proxy");
    }

    private static boolean j6(org.apache.http.HttpRequest r1) {
        if ((r1 instanceof org.apache.http.HttpEntityEnclosingRequest) == false) goto L10;
        org.apache.http.HttpEntity r2 = ((org.apache.http.HttpEntityEnclosingRequest) r1).getEntity();
        if (r2 != null) goto L7;
        return true;
    L7:
        if (r2.isRepeatable() == true) goto L13;
        return false;
    L13:
        return true;
    L10:
        return true;
    }
}
