package abcd;

public class Hz {
    private static abcd.Hz.b DW;
    private static final java.lang.String[] j6 = null;
    private java.lang.String EQ;
    private java.net.HttpURLConnection FH;
    public final java.net.URL Hw;
    private boolean VH;
    private abcd.Hz.e Zo;
    private boolean gn;
    private int tp;
    private boolean u7;
    private final java.lang.String v5;
    private int we;

    protected static abstract class a<V> extends Hz.d<V> {
        private final boolean DW;
        private final java.io.Closeable j6;

        protected a(java.io.Closeable r1, boolean r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        protected void j6() {
            java.io.Closeable r0 = this.j6;
            if ((r0 instanceof java.io.Flushable) == false) goto L6;
            ((java.io.Flushable) r0).flush();
        L6:
            if (this.DW == true) goto L12;
            this.j6.close();
            return;
        L12:
            this.j6.close();     // Catch: java.io.IOException -> L11
            return;
        }
    }

    public interface b {
        public static final abcd.Hz.b j6 = null;

        static {
            j6 = new abcd.Iz();
        }

        java.net.HttpURLConnection j6(java.net.URL r1);

        java.net.HttpURLConnection j6(java.net.URL r1, java.net.Proxy r2);
    }

    public static class c extends java.lang.RuntimeException {
        protected c(java.io.IOException r1) {
            super(r1);
        }

        @Override
        public java.io.IOException getCause() {
            return (java.io.IOException) super.getCause();
        }

        @Override
        public java.lang.Throwable getCause() {
            return getCause();
        }
    }

    protected static abstract class d<V> implements java.util.concurrent.Callable<V> {
        protected d() {
        }

        protected abstract V DW();

        @Override
        public V call() {
            boolean r0 = true;
            V r1 = DW();     // Catch: java.lang.Throwable -> L9 java.io.IOException -> L11 abcd.Hz.c -> L14
            j6();     // Catch: java.io.IOException -> L6
            return r1;
        L6:
            e = move-exception;
            throw new abcd.Hz.c(e);
        L16:
            java.lang.Throwable th = th;
        L26:
            j6();     // Catch: java.io.IOException -> L19
        L23:
            throw th;
        L19:
            e = move-exception;
            if (r0 == true) goto L23;
            throw new abcd.Hz.c(e);
        L14:
            e = move-exception;
            throw e;     // Catch: java.lang.Throwable -> L16
        L11:
            e = move-exception;
            throw new abcd.Hz.c(e);     // Catch: java.lang.Throwable -> L16
        L9:
            th = move-exception;
            th = th;
            r0 = false;
            goto L26
        }

        protected abstract void j6();
    }

    public static class e extends java.io.BufferedOutputStream {
        private final java.nio.charset.CharsetEncoder j6;

        public e(java.io.OutputStream r1, java.lang.String r2, int r3) {
            super(r1, r3);
            this.j6 = java.nio.charset.Charset.forName(abcd.Hz.j6(r2)).newEncoder();
        }

        public abcd.Hz.e j6(java.lang.String r3) {
            java.nio.ByteBuffer r4 = this.j6.encode(java.nio.CharBuffer.wrap(r3));
            super.write(r4.array(), 0, r4.limit());
            return this;
        }
    }

    static {
        j6 = new java.lang.String[0];
        DW = abcd.Hz.b.j6;
    }

    public Hz(java.lang.CharSequence r2, java.lang.String r3) {
        this.FH = null;
        this.gn = true;
        this.u7 = false;
        this.tp = 8192;
        this.Hw = new java.net.URL(r2.toString());     // Catch: java.net.MalformedURLException -> L6
        this.v5 = r3;
        return;
    L6:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    public static abcd.Hz DW(java.lang.CharSequence r0, java.util.Map<?, ?> r1, boolean r2) {
        java.lang.String r3 = j6(r0, r1);
        if (r2 == false) goto L6;
        r3 = DW(r3);
    L6:
        return Hw(r3);
    }

    public static java.lang.String DW(java.lang.CharSequence r7) {
        java.net.URL r0 = new java.net.URL(r7.toString());     // Catch: java.io.IOException -> L16
        java.lang.String r8 = r0.getHost();
        int r1 = r0.getPort();
        if (r1 == (-1)) goto L19;
        r8 = r8 + ':' + java.lang.Integer.toString(r1);
    L19:
        java.lang.String r9 = new java.net.URI(r0.getProtocol(), r8, r0.getPath(), r0.getQuery(), r0.getRef()).toASCIIString();     // Catch: java.net.URISyntaxException -> L13
        int r2 = r9.indexOf(63);     // Catch: java.net.URISyntaxException -> L13
        if (r2 <= 0) goto L23;
        int r3 = r2 + 1;     // Catch: java.net.URISyntaxException -> L13
        if (r3 >= r9.length()) goto L24;
        return r9.substring(0, r3) + r9.substring(r3).replace("+", "%2B").replace("#", "%23");
    L24:
        return r9;
    L23:
        return r9;
    L13:
        e = move-exception;
        java.io.IOException r4 = new java.io.IOException("Parsing URI failed");
        r4.initCause(e);
        throw new abcd.Hz.c(r4);
    L16:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    private static java.lang.StringBuilder DW(java.lang.String r2, java.lang.StringBuilder r3) {
        if ((r2.indexOf(58) + 2) != r2.lastIndexOf(47)) goto L5;
        r3.append('/');
    L5:
        return r3;
    }

    public static abcd.Hz FH(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "GET");
    }

    public static abcd.Hz Hw(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "POST");
    }

    private java.net.HttpURLConnection QX() {
    L8:
        e = move-exception;
        throw new abcd.Hz.c(e);
    L3:
        if (this.EQ == null) goto L5;
        java.net.HttpURLConnection r0 = DW.j6(this.Hw, XL());     // Catch: java.io.IOException -> L8
    L6:
        r0.setRequestMethod(this.v5);     // Catch: java.io.IOException -> L8
        return r0;
    L5:
        r0 = DW.j6(this.Hw);     // Catch: java.io.IOException -> L8
        goto L6
    }

    private java.net.Proxy XL() {
        return new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(this.EQ, this.we));
    }

    private static java.lang.String Zo(java.lang.String r1) {
        if (r1 != null) goto L4;
        return "UTF-8";
    L4:
        if (r1.length() <= 0) goto L8;
        return r1;
    L8:
        return "UTF-8";
    }

    static int j6(abcd.Hz r0) {
        return r0.tp;
    }

    public static abcd.Hz j6(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "DELETE");
    }

    public static abcd.Hz j6(java.lang.CharSequence r0, java.util.Map<?, ?> r1, boolean r2) {
        java.lang.String r3 = j6(r0, r1);
        if (r2 == false) goto L6;
        r3 = DW(r3);
    L6:
        return FH(r3);
    }

    public static java.lang.String j6(java.lang.CharSequence r3, java.util.Map<?, ?> r4) {
        java.lang.String r5 = r3.toString();
        if (r4 != null) goto L5;
        return r5;
    L5:
        if (r4.isEmpty() == true) goto L24;
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r5);
        DW(r5, r0);
        j6(r5, r0);
        java.util.Iterator<java.util.Map.Entry<?, ?>> r6 = r4.entrySet().iterator();
        java.util.Map.Entry<?, ?> r7 = r6.next();
        r0.append(r7.getKey().toString());
        r0.append('=');
        java.lang.Object r8 = r7.getValue();
        if (r8 == null) goto L11;
        r0.append(r8);
    L11:
        if (r6.hasNext() == false) goto L16;
        r0.append('&');
        java.util.Map.Entry<?, ?> r9 = r6.next();
        r0.append(r9.getKey().toString());
        r0.append('=');
        java.lang.Object r10 = r9.getValue();
        if (r10 == null) goto L11;
        r0.append(r10);
        goto L11
    L16:
        return r0.toString();
    L24:
        return r5;
    }

    static java.lang.String j6(java.lang.String r0) {
        return Zo(r0);
    }

    private static java.lang.StringBuilder j6(java.lang.String r4, java.lang.StringBuilder r5) {
        int r1 = r4.indexOf(63);
        int r2 = r5.length() - 1;
        if (r1 != (-1)) goto L5;
        r5.append('?');
    L9:
        return r5;
    L5:
        if (r1 >= r2) goto L9;
        if (r4.charAt(r2) == '&') goto L9;
        r5.append('&');
        goto L9
    }

    public static abcd.Hz v5(java.lang.CharSequence r2) {
        return new abcd.Hz(r2, "PUT");
    }

    protected abcd.Hz DW(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("form-data; name=\"");
        r0.append(r3);
        if (r4 == null) goto L5;
        r0.append("\"; filename=\"");
        r0.append(r4);
    L5:
        r0.append('\"');
        Zo("Content-Disposition", r0.toString());
        if (r5 == null) goto L8;
        Zo("Content-Type", r5);
    L8:
        Zo("\r\n");
        return this;
    }

    public java.io.BufferedInputStream DW() {
        return new java.io.BufferedInputStream(J8(), this.tp);
    }

    public java.lang.String DW(java.lang.String r3) {
        java.io.ByteArrayOutputStream r0 = FH();
        j6(DW(), r0);     // Catch: java.io.IOException -> L5
        return r0.toString(Zo(r3));
    L5:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    protected java.lang.String DW(java.lang.String r9, java.lang.String r10) {
        if (r9 != null) goto L5;
    L34:
        return null;
    L5:
        if (r9.length() == 0) goto L34;
        int r1 = r9.length();
        int r3 = r9.indexOf(59) + 1;
        if (r3 == 0) goto L34;
        if (r3 == r1) goto L34;
        int r5 = r9.indexOf(59, r3);
        if (r5 != (-1)) goto L14;
        r5 = r1;
    L14:
        if (r3 >= r5) goto L34;
        int r7 = r9.indexOf(61, r3);
        if (r7 == (-1)) goto L31;
        if (r7 >= r5) goto L31;
        if (r10.equals(r9.substring(r3, r7).trim()) == false) goto L31;
        java.lang.String r4 = r9.substring(r7 + 1, r5).trim();
        int r8 = r4.length();
        if (r8 == 0) goto L31;
        if (r8 > 2) goto L25;
    L30:
        return r4;
    L25:
        if ('\"' != r4.charAt(0)) goto L30;
        int r11 = r8 - 1;
        if ('\"' != r4.charAt(r11)) goto L30;
        return r4.substring(1, r11);
    L31:
        r3 = r5 + 1;
        r5 = r9.indexOf(59, r3);
        if (r5 != (-1)) goto L14;
        r5 = r1;
        goto L14
    }

    public java.lang.String EQ() {
        return tp().getRequestMethod();
    }

    public abcd.Hz FH(java.lang.String r2) {
        j6(r2, null);
        return this;
    }

    public abcd.Hz FH(java.lang.String r2, java.lang.String r3) {
        tp().setRequestProperty(r2, r3);
        return this;
    }

    protected java.io.ByteArrayOutputStream FH() {
        int r0 = u7();
        if (r0 <= 0) goto L7;
        return new java.io.ByteArrayOutputStream(r0);
    L7:
        return new java.io.ByteArrayOutputStream();
    }

    public java.lang.String Hw() {
        return Hw("Content-Type", "charset");
    }

    public java.lang.String Hw(java.lang.String r2) {
        Zo();
        return tp().getHeaderField(r2);
    }

    public java.lang.String Hw(java.lang.String r1, java.lang.String r2) {
        return DW(Hw(r1), r2);
    }

    protected abcd.Hz J0() {
        if (this.VH == true) goto L5;
        this.VH = true;
        FH("multipart/form-data; boundary=00content0boundary00");
        we();
        this.Zo.j6("--00content0boundary00\r\n");
    L6:
        return this;
    L5:
        this.Zo.j6("\r\n--00content0boundary00\r\n");
        goto L6
    }

    public java.io.InputStream J8() {
        if (VH() < 400) goto L29;
        java.io.InputStream r0 = tp().getErrorStream();
        if (r0 != null) goto L17;
        r0 = tp().getInputStream();     // Catch: java.io.IOException -> L13
    L13:
        e = move-exception;
        throw new abcd.Hz.c(e);
    L17:
        if (this.u7 == true) goto L19;
    L26:
        return r0;
    L19:
        if ("gzip".equals(gn()) == false) goto L26;
        return new java.util.zip.GZIPInputStream(r0);
    L23:
        e = move-exception;
        throw new abcd.Hz.c(e);
    L29:
        r0 = tp().getInputStream();     // Catch: java.io.IOException -> L6
    L6:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    public int VH() {
        v5();     // Catch: java.io.IOException -> L4
        return tp().getResponseCode();
    L4:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    public java.net.URL Ws() {
        return tp().getURL();
    }

    protected abcd.Hz Zo() {
        v5();     // Catch: java.io.IOException -> L4
        return this;
    L4:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    public abcd.Hz Zo(java.lang.CharSequence r2) {
        we();     // Catch: java.io.IOException -> L4
        this.Zo.j6(r2.toString());     // Catch: java.io.IOException -> L4
        return this;
    L4:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    public abcd.Hz Zo(java.lang.String r1, java.lang.String r2) {
        Zo(r1);
        Zo(": ");
        Zo(r2);
        Zo("\r\n");
        return this;
    }

    public java.lang.String gn() {
        return Hw("Content-Encoding");
    }

    public int j6(java.lang.String r2, int r3) {
        Zo();
        return tp().getHeaderFieldInt(r2, r3);
    }

    public abcd.Hz j6(int r2) {
        tp().setConnectTimeout(r2);
        return this;
    }

    protected abcd.Hz j6(java.io.InputStream r8, java.io.OutputStream r9) {
        return (abcd.Hz) new abcd.Gz(this, r8, this.gn, r8, r9).call();
    }

    public abcd.Hz j6(java.lang.String r2, java.lang.Number r3) {
        j6(r2, null, r3);
        return this;
    }

    public abcd.Hz j6(java.lang.String r3, java.lang.String r4) {
        if (r4 != null) goto L5;
    L8:
        FH("Content-Type", r3);
        return this;
    L5:
        if (r4.length() <= 0) goto L8;
        FH("Content-Type", r3 + "; charset=" + r4);
        return this;
    }

    public abcd.Hz j6(java.lang.String r1, java.lang.String r2, java.lang.Number r3) {
        if (r3 == null) goto L4;
        java.lang.String r4 = r3.toString();
    L5:
        j6(r1, r2, r4);
        return this;
    L4:
        r4 = null;
        goto L5
    }

    public abcd.Hz j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        j6(r2, r3, null, r4);
        return this;
    }

    public abcd.Hz j6(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        java.io.BufferedInputStream r0 = null;
        java.io.BufferedInputStream r1 = new java.io.BufferedInputStream(new java.io.FileInputStream(r7));     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13
        j6(r4, r5, r6, r1);     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L9
        r1.close();     // Catch: java.io.IOException -> L19
    L6:
        return this;
    L9:
        e = e;
        r0 = r1;
    L15:
        throw new abcd.Hz.c(e);     // Catch: java.lang.Throwable -> L11
    L7:
        th = th;
        r0 = r1;
    L16:
        if (r0 != null) goto L23;
    L18:
        throw th;
    L23:
        r0.close();     // Catch: java.io.IOException -> L20
    L13:
        e = e;
    L11:
        th = th;
        goto L16
    }

    public abcd.Hz j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.io.InputStream r4) {
        J0();     // Catch: java.io.IOException -> L4
        DW(r1, r2, r3);     // Catch: java.io.IOException -> L4
        j6(r4, this.Zo);     // Catch: java.io.IOException -> L4
        return this;
    L4:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    public abcd.Hz j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        J0();     // Catch: java.io.IOException -> L4
        DW(r1, r2, r3);     // Catch: java.io.IOException -> L4
        this.Zo.j6(r4);     // Catch: java.io.IOException -> L4
        return this;
    L4:
        e = move-exception;
        throw new abcd.Hz.c(e);
    }

    public abcd.Hz j6(java.util.Map.Entry<java.lang.String, java.lang.String> r2) {
        FH(r2.getKey(), r2.getValue());
        return this;
    }

    public abcd.Hz j6(boolean r2) {
        tp().setUseCaches(r2);
        return this;
    }

    public java.lang.String j6() {
        return DW(Hw());
    }

    public java.lang.String toString() {
        return EQ() + ' ' + Ws();
    }

    public java.net.HttpURLConnection tp() {
        if (this.FH != null) goto L6;
        this.FH = QX();
    L6:
        return this.FH;
    }

    public int u7() {
        return v5("Content-Length");
    }

    public int v5(java.lang.String r2) {
        return j6(r2, -1);
    }

    protected abcd.Hz v5() {
        abcd.Hz.e r0 = this.Zo;
        if (r0 != null) goto L6;
        return this;
    L6:
        if (this.VH == false) goto L9;
        r0.j6("\r\n--00content0boundary00--\r\n");
    L9:
        if (this.gn == true) goto L16;
        this.Zo.close();
    L13:
        this.Zo = null;
        return this;
    L16:
        this.Zo.close();     // Catch: java.io.IOException -> L15
        goto L13
    }

    public abcd.Hz v5(java.lang.String r2, java.lang.String r3) {
        j6(r2, null, r3);
        return this;
    }

    protected abcd.Hz we() {
        if (this.Zo == null) goto L5;
        return this;
    L5:
        tp().setDoOutput(true);
        java.lang.String r0 = DW(tp().getRequestProperty("Content-Type"), "charset");
        this.Zo = new abcd.Hz.e(tp().getOutputStream(), r0, this.tp);
        return this;
    }
}
