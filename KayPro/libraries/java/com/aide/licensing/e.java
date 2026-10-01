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
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -157850396626685949L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-157850396626685949L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static com.aide.licensing.e j6(java.lang.String r9) {
    L33:
        th = move-exception;
        if (DW == false) goto L38;
        abcd.wu.j6(th, 6086071211103790000L, null, r9);
    L38:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6086071211103790000L, null, r9);     // Catch: java.lang.Throwable -> L33
    L6:
        int r3 = r9.indexOf(58);     // Catch: java.lang.Throwable -> L33
        java.lang.String r6 = "";
        if ((-1) != r3) goto L10;
        java.lang.String r4 = r9;
    L14:
        java.lang.String[] r5 = android.text.TextUtils.split(r4, java.util.regex.Pattern.quote("|"));     // Catch: java.lang.Throwable -> L33
        if (r5.length < 6) goto L32;
        com.aide.licensing.e r7 = new com.aide.licensing.e();     // Catch: java.lang.Throwable -> L33
        r7.u7 = r6;     // Catch: java.lang.Throwable -> L33
        r7.FH = java.lang.Integer.parseInt(r5[0]);     // Catch: java.lang.Throwable -> L33
        r7.Hw = java.lang.Long.parseLong(r5[1]);     // Catch: java.lang.Throwable -> L33
        r7.v5 = r5[2];     // Catch: java.lang.Throwable -> L33
        r7.Zo = r5[3];     // Catch: java.lang.Throwable -> L33
        r7.VH = r5[4];     // Catch: java.lang.Throwable -> L33
        r7.gn = java.lang.Long.parseLong(r5[5]);     // Catch: java.lang.Throwable -> L33
        abcd.ue.j6("timestamp: " + new java.util.Date(r7.gn).toString());     // Catch: java.lang.Throwable -> L33
        if (r7.FH != 0) goto L19;
    L20:
        java.util.HashMap r8 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L33
        java.util.Iterator<org.apache.http.NameValuePair> r10 = org.apache.http.client.utils.URLEncodedUtils.parse(new java.net.URI("?" + r7.u7), "UTF-8").iterator();     // Catch: java.net.URISyntaxException -> L28 java.lang.Throwable -> L33
    L23:
        if (r10.hasNext() == false) goto L26;
        org.apache.http.NameValuePair r11 = r10.next();     // Catch: java.net.URISyntaxException -> L28 java.lang.Throwable -> L33
        r8.put(r11.getName(), r11.getValue());     // Catch: java.net.URISyntaxException -> L28 java.lang.Throwable -> L33
    L26:
        r7.tp = java.lang.Long.parseLong((java.lang.String) r8.get("VT"));     // Catch: java.lang.Throwable -> L33
        r7.EQ = java.lang.Long.parseLong((java.lang.String) r8.get("GT"));     // Catch: java.lang.Throwable -> L33
        abcd.ue.j6("validity timestamp: " + new java.util.Date(r7.tp).toString());     // Catch: java.lang.Throwable -> L33
        abcd.ue.j6("grace timestamp: " + new java.util.Date(r7.EQ).toString());     // Catch: java.lang.Throwable -> L33
    L27:
        return r7;
    L28:
        e = move-exception;
        throw new java.lang.IllegalArgumentException(e);     // Catch: java.lang.Throwable -> L33
    L19:
        if (r7.FH != 2) goto L27;
    L32:
        throw new java.lang.IllegalArgumentException("Wrong number of fields.");     // Catch: java.lang.Throwable -> L33
    L10:
        r4 = r9.substring(0, r3);     // Catch: java.lang.Throwable -> L33
        if (r3 >= r9.length()) goto L14;
        r6 = r9.substring(r3 + 1);     // Catch: java.lang.Throwable -> L33
        goto L14
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1705051724595363429L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1705051724595363429L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return android.text.TextUtils.join("|", new java.lang.Object[]{java.lang.Integer.valueOf(this.FH), java.lang.Long.valueOf(this.Hw), this.v5, this.Zo, this.VH, java.lang.Long.valueOf(this.gn)});
    }
}
