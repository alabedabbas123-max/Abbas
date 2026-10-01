package com.aide.licensing;

@abcd.Interfacexu
public class e {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public long EQ;
    public int FH;
    public long Hw;
    public java.lang.String VH;
    public java.lang.String Zo;
    public long gn;
    public long tp;
    public java.lang.String u7;
    public java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.licensing.e.class, 6752123745821768904L, 6752123745821768904L);
    }

    public e() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -157850396626685949L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-157850396626685949L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.aide.licensing.e j6(java.lang.String r9) {
        int r3 = 0;
        java.lang.String r6 = null;
        java.lang.String r4 = null;
        java.lang.String[] r5 = null;
        com.aide.licensing.e r7 = null;
        java.util.HashMap r8 = null;
        java.util.Iterator<org.apache.http.NameValuePair> r10 = null;
        org.apache.http.NameValuePair r11 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 33: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 38; continue $sw1; }
                    abcd.wu.j6(th, 6086071211103790000L, null, r9);
                    $pc1 = 38; continue $sw1;
                }
                case 38: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(6086071211103790000L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r3 = r9.indexOf(58);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    r6 = "";
                    if ((-1) != r3) { $pc1 = 10; continue $sw1; }
                    r4 = r9;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    try {
                        r5 = android.text.TextUtils.split(r4, java.util.regex.Pattern.quote("|"));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    if (r5.length < 6) { $pc1 = 32; continue $sw1; }
                    try {
                        r7 = new com.aide.licensing.e();
                        r7.u7 = r6;
                        r7.FH = java.lang.Integer.parseInt(r5[0]);
                        r7.Hw = java.lang.Long.parseLong(r5[1]);
                        r7.v5 = r5[2];
                        r7.Zo = r5[3];
                        r7.VH = r5[4];
                        r7.gn = java.lang.Long.parseLong(r5[5]);
                        abcd.ue.j6("timestamp: " + new java.util.Date(r7.gn).toString());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    if (r7.FH != 0) { $pc1 = 19; continue $sw1; }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    try {
                        r8 = new java.util.HashMap();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    try {
                        r10 = org.apache.http.client.utils.URLEncodedUtils.parse(new java.net.URI("?" + r7.u7), "UTF-8").iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc1 = 28; continue $sw1; }
                        $pc1 = 33; continue $sw1;
                    }
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    if (r10.hasNext() == false) { $pc1 = 26; continue $sw1; }
                    try {
                        r11 = r10.next();
                        r8.put(r11.getName(), r11.getValue());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc1 = 28; continue $sw1; }
                        $pc1 = 33; continue $sw1;
                    }
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    try {
                        r7.tp = java.lang.Long.parseLong((java.lang.String) r8.get("VT"));
                        r7.EQ = java.lang.Long.parseLong((java.lang.String) r8.get("GT"));
                        abcd.ue.j6("validity timestamp: " + new java.util.Date(r7.tp).toString());
                        abcd.ue.j6("grace timestamp: " + new java.util.Date(r7.EQ).toString());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    return r7;
                }
                case 28: {
                    e = $ex1;
                    try {
                        throw new java.lang.IllegalArgumentException(e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                }
                case 19: {
                    if (r7.FH != 2) { $pc1 = 27; continue $sw1; }
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    try {
                        throw new java.lang.IllegalArgumentException("Wrong number of fields.");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                }
                case 10: {
                    try {
                        r4 = r9.substring(0, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    if (r3 >= r9.length()) { $pc1 = 14; continue $sw1; }
                    try {
                        r6 = r9.substring(r3 + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 33; continue $sw1;
                    }
                    { $pc1 = 14; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 1705051724595363429L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1705051724595363429L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return android.text.TextUtils.join("|", new java.lang.Object[]{java.lang.Integer.valueOf(this.FH), java.lang.Long.valueOf(this.Hw), this.v5, this.Zo, this.VH, java.lang.Long.valueOf(this.gn)});
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
