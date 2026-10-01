package abcd;

public class Gw {
    private static final java.text.DateFormat j6 = null;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
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
            return (abcd.Gw.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Gw.a.values(), r1);
        }

        public static abcd.Gw.a[] values() {
            return (abcd.Gw.a[]) FH.clone();
        }
    }

    static {
        j6 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy kk:mm:ss ZZZZZ", java.util.Locale.US);
    }

    public static abcd.Dw.f DW(abcd.Gw.a r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String[] r6, abcd.Zw r7) {
        org.apache.http.client.methods.HttpUriRequest r8 = null;
        org.apache.http.client.methods.HttpPost r9 = null;
        java.util.ArrayList r10 = null;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != abcd.Gw.a.j6) { $pc0 = 5; continue $sw0; }
                    r8 = new org.apache.http.client.methods.HttpGet(j6(r3, r5, r4, r6));
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    r7.j6(r8);
                    return new abcd.Dw.f(r8, j6(r7, r8));
                }
                case 5: {
                    r9 = new org.apache.http.client.methods.HttpPost(j6(r3, r5, r4, null));
                    r8 = r9;
                    if (r6 == null) { $pc0 = 25; continue $sw0; }
                    r8 = r9;
                    if (r6.length < 2) { $pc0 = 25; continue $sw0; }
                    if ((r6.length % 2) != 0) { $pc0 = 24; continue $sw0; }
                    r10 = new java.util.ArrayList();
                    r11 = 0;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    if (r11 >= r6.length) { $pc0 = 27; continue $sw0; }
                    r12 = r11 + 1;
                    if (r6[r12] == null) { $pc0 = 17; continue $sw0; }
                    r10.add(new org.apache.http.message.BasicNameValuePair(r6[r11], r6[r12]));
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    r11 = r11 + 2;
                    { $pc0 = 13; continue $sw0; }
                }
                case 27: {
                    try {
                        r9.setEntity(new org.apache.http.client.entity.UrlEncodedFormEntity(r10, "UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc0 = 20; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r8 = r9;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    e = $ex0;
                    throw new abcd.Jw(e);
                }
                case 24: {
                    throw new java.lang.IllegalArgumentException("Params must have an even number of elements.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.Object j6(abcd.Gw.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.String[] r4, abcd.Zw r5) {
        return j6(DW(r0, r1, r2, r3, r4, r5).DW);
    }

    public static java.lang.Object j6(org.apache.http.HttpResponse r5) {
        java.io.BufferedReader r0 = null;
        org.apache.http.HttpEntity r1 = null;
        java.io.BufferedReader r2 = null;
        java.lang.Object r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = null;
                    try {
                        r1 = r5.getEntity();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc1 = 31; continue $sw1; }
                        if ($t instanceof abcd.kL) { $pc1 = 47; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 40; continue $sw1; }
                        $pc1 = 29; continue $sw1;
                    }
                    if (r1 == null) { $pc1 = 15; continue $sw1; }
                    try {
                        r2 = new java.io.BufferedReader(new java.io.InputStreamReader(r1.getContent()), 16384);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc1 = 31; continue $sw1; }
                        if ($t instanceof abcd.kL) { $pc1 = 47; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 40; continue $sw1; }
                        $pc1 = 29; continue $sw1;
                    }
                    { $pc1 = 35; continue $sw1; }
                }
                case 54: {
                    try {
                        r2.mark(16384);
                        r3 = new abcd.jL().j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc1 = 10; continue $sw1; }
                        if ($t instanceof abcd.kL) { $pc1 = 12; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 13; continue $sw1; }
                        $pc1 = 8; continue $sw1;
                    }
                    r0 = r2;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r0 != null) { $pc1 = 48; continue $sw1; }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    r4 = r5.getStatusLine().getStatusCode();
                    if (r4 != 200) { $pc1 = 23; continue $sw1; }
                    return r3;
                }
                case 23: {
                    if (r4 != 401) { $pc1 = 27; continue $sw1; }
                    throw new abcd.Qw();
                }
                case 27: {
                    throw new abcd.Pw(r5, r3);
                }
                case 48: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 19; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 20; continue $sw1; }
                }
                case 12: {
                    r0 = r2;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    e = e;
                    $pc1 = 42; continue $sw1;
                }
                case 42: {
                    try {
                        throw new abcd.Kw(e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                }
                case 10: {
                    e = e;
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    try {
                        throw new abcd.Jw(e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                }
                case 8: {
                    th = th;
                    r0 = r2;
                    $pc1 = 43; continue $sw1;
                }
                case 43: {
                    if (r0 != null) { $pc1 = 51; continue $sw1; }
                    $pc1 = 45; continue $sw1;
                }
                case 45: {
                    throw th;
                }
                case 51: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 45; continue $sw1; }
                }
                case 15: {
                    r3 = null;
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    th = th;
                    $pc1 = 40; continue $sw1;
                }
                case 40: {
                    e = e;
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    e = e;
                    $pc1 = 35; continue $sw1;
                }
                case 35: {
                    if (abcd.Pw.j6(r5) == false) { $pc1 = 39; continue $sw1; }
                    try {
                        throw new abcd.Pw(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                }
                case 39: {
                    try {
                        throw new abcd.Lw(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                }
                case 19: {
                    $pc1 = 46; continue $sw1;
                }
                case 46: {
                    $pc1 = 47; continue $sw1;
                }
                case 47: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r2, int r3, java.lang.String r4, java.lang.String[] r5) {
        java.lang.String r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4.startsWith("/") == true) { $pc2 = 15; continue $sw2; }
                    r4 = "/" + r4;
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    try {
                        r6 = java.net.URLEncoder.encode("/" + r3 + r4, "UTF-8").replace("%2F", "/");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc2 = 13; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 != null) { $pc2 = 8; continue $sw2; }
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    return "https://" + r2 + ":443" + r6.replace("+", "%20").replace("*", "%2A");
                }
                case 8: {
                    if (r5.length <= 0) { $pc2 = 10; continue $sw2; }
                    try {
                        r6 = r6 + "?" + j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc2 = 13; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.lang.String[] r7) {
        java.lang.String r3 = null;
        int r2 = 0;
        boolean r4 = false;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r7.length % 2) != 0) { $pc3 = 18; continue $sw3; }
                    r3 = "";
                    r2 = 0;
                    r4 = true;
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    if (r2 >= r7.length) { $pc3 = 14; continue $sw3; }
                    try {
                        r5 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc3 = 15; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7[r5] == null) { $pc3 = 13; continue $sw3; }
                    if (r4 == false) { $pc3 = 11; continue $sw3; }
                    r4 = false;
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    try {
                        r3 = r3 + java.net.URLEncoder.encode(r7[r2], "UTF-8") + "=" + java.net.URLEncoder.encode(r7[r5], "UTF-8");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc3 = 15; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 13; continue $sw3; }
                }
                case 11: {
                    try {
                        r3 = r3 + "&";
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc3 = 15; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    r2 = r2 + 2;
                    { $pc3 = 20; continue $sw3; }
                }
                case 14: {
                    return r3;
                }
                case 15: {
                    return null;
                }
                case 18: {
                    throw new java.lang.IllegalArgumentException("Params must have an even number of elements.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static org.apache.http.HttpResponse j6(abcd.Zw r1, org.apache.http.client.methods.HttpUriRequest r2) {
        return j6(r1, r2, -1);
    }

    public static org.apache.http.HttpResponse j6(abcd.Zw r4, org.apache.http.client.methods.HttpUriRequest r5, int r6) {
        org.apache.http.client.HttpClient r0 = null;
        boolean r7 = false;
        org.apache.http.HttpResponse r1 = null;
        int r2 = 0;
        int r8 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = j6(r4);
                    r4.j6(r5);
                    if (r6 < 0) { $pc4 = 5; continue $sw4; }
                    org.apache.http.params.HttpConnectionParams.setSoTimeout(r5.getParams(), r6);
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r7 = j6(r5);
                    r1 = null;
                    r2 = 0;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r2 >= 5) { $pc4 = 23; continue $sw4; }
                    try {
                        r1 = r0.execute(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc4 = 10; continue $sw4; }
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        if ($t instanceof javax.net.ssl.SSLException) { $pc4 = 14; continue $sw4; }
                        if ($t instanceof java.lang.NullPointerException) { $pc4 = 39; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    e = $ex4;
                    throw new abcd.Jw(e);
                }
                case 14: {
                    e = $ex4;
                    throw new abcd.Ow(e);
                }
                case 12: {
                    e = $ex4;
                    throw new abcd.Kw(e);
                }
                case 16: {
                    if (r1 != null) { $pc4 = 23; continue $sw4; }
                    try {
                        j6(r0, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc4 = 10; continue $sw4; }
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        if ($t instanceof javax.net.ssl.SSLException) { $pc4 = 14; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 == false) { $pc4 = 22; continue $sw4; }
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc4 = 10; continue $sw4; }
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        if ($t instanceof javax.net.ssl.SSLException) { $pc4 = 14; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 7; continue $sw4; }
                }
                case 22: {
                    try {
                        throw new abcd.Nw();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc4 = 10; continue $sw4; }
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        if ($t instanceof javax.net.ssl.SSLException) { $pc4 = 14; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 23: {
                    if (r1 == null) { $pc4 = 31; continue $sw4; }
                    try {
                        r8 = r1.getStatusLine().getStatusCode();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc4 = 10; continue $sw4; }
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        if ($t instanceof javax.net.ssl.SSLException) { $pc4 = 14; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r8 != 200) { $pc4 = 27; continue $sw4; }
                    $pc4 = 29; continue $sw4;
                }
                case 29: {
                    return r1;
                }
                case 27: {
                    if (r8 == 206) { $pc4 = 29; continue $sw4; }
                    try {
                        j6(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc4 = 10; continue $sw4; }
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        if ($t instanceof javax.net.ssl.SSLException) { $pc4 = 14; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc4 = 29; continue $sw4; }
                }
                case 31: {
                    try {
                        throw new abcd.Kw("Apache HTTPClient encountered an error. No response, try again.");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc4 = 10; continue $sw4; }
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        if ($t instanceof javax.net.ssl.SSLException) { $pc4 = 14; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 39: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static synchronized org.apache.http.client.HttpClient j6(abcd.Zw r2) {
        org.apache.http.client.HttpClient r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    monitor-enter(abcd.Gw.class);
                    try {
                        r1 = r2.v5();
                        j6(r1, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    monitor-exit(abcd.Gw.class);
                    return r1;
                }
                case 7: {
                    th = $ex5;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(org.apache.http.client.HttpClient r3, abcd.Zw r4) {
        abcd.Zw.b r5 = null;
        java.lang.String r1 = null;
        int r2 = 0;
        org.apache.http.HttpHost r6 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r5 = r4.j6();
                    if (r5 == null) { $pc6 = 13; continue $sw6; }
                    r1 = r5.j6;
                    if (r1 == null) { $pc6 = 13; continue $sw6; }
                    if (r1.equals("") == true) { $pc6 = 13; continue $sw6; }
                    r2 = r5.DW;
                    if (r2 >= 0) { $pc6 = 11; continue $sw6; }
                    r6 = new org.apache.http.HttpHost(r5.j6);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    r3.getParams().setParameter("http.route.default-proxy", r6);
                    return;
                }
                case 11: {
                    r6 = new org.apache.http.HttpHost(r5.j6, r2);
                    $pc6 = 13; continue $sw6;
                }
                case 13: {
                    r3.getParams().removeParameter("http.route.default-proxy");
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(org.apache.http.HttpRequest r1) {
        org.apache.http.HttpEntity r2 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if ((r1 instanceof org.apache.http.HttpEntityEnclosingRequest) == false) { $pc7 = 10; continue $sw7; }
                    r2 = ((org.apache.http.HttpEntityEnclosingRequest) r1).getEntity();
                    if (r2 != null) { $pc7 = 7; continue $sw7; }
                    return true;
                }
                case 7: {
                    if (r2.isRepeatable() == true) { $pc7 = 13; continue $sw7; }
                    return false;
                }
                case 13: {
                    return true;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
