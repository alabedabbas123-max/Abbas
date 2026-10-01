package abcd;

public abstract class Ww implements abcd.Zw {
    private final abcd.Yw DW;
    private abcd.Xw FH;
    private java.lang.String Hw;
    private final abcd.Zw.a j6;
    private org.apache.http.client.HttpClient v5;

    private static class a extends org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager {
        public a(org.apache.http.params.HttpParams r1, org.apache.http.conn.scheme.SchemeRegistry r2) {
            super(r1, r2);
        }

        @Override
        public org.apache.http.conn.ClientConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute r3, java.lang.Object r4) {
            abcd.Ww.e.j6(this, 20, 5);
            return super.requestConnection(r3, r4);
        }
    }

    private static class b extends org.apache.http.impl.DefaultConnectionReuseStrategy {
        private b() {
        }

        b(abcd.Sw r1) {
            this();
        }

        @Override
        public boolean keepAlive(org.apache.http.HttpResponse r6, org.apache.http.protocol.HttpContext r7) {
            if (r6 == null) goto L41;
            if (r7 == null) goto L39;
            org.apache.http.ProtocolVersion r8 = r6.getStatusLine().getProtocolVersion();
            org.apache.http.Header r0 = r6.getFirstHeader("Transfer-Encoding");
            if (r0 != null) goto L7;
            org.apache.http.Header[] r1 = r6.getHeaders("Content-Length");
            if (r1 != null) goto L12;
        L37:
            return false;
        L12:
            if (r1.length != 1) goto L37;
            if (java.lang.Integer.parseInt(r1[0].getValue()) >= 0) goto L18;
            return false;
        L18:
            org.apache.http.HeaderIterator r2 = r6.headerIterator("Connection");
            if (r2.hasNext() == true) goto L22;
            r2 = r6.headerIterator("Proxy-Connection");
        L22:
            if (r2.hasNext() == false) goto L36;
            org.apache.http.TokenIterator r9 = createTokenIterator(r2);     // Catch: org.apache.http.ParseException -> L34
            boolean r3 = false;
        L25:
            if (r9.hasNext() == false) goto L32;
            java.lang.String r4 = r9.nextToken();     // Catch: org.apache.http.ParseException -> L34
            if ("Close".equalsIgnoreCase(r4) == true) goto L28;
            if ("Keep-Alive".equalsIgnoreCase(r4) == false) goto L25;
            r3 = true;
            goto L25
        L28:
            return false;
        L32:
            if (r3 == false) goto L36;
            return true;
        L34:
            return false;
        L36:
            return !r8.lessEquals(org.apache.http.HttpVersion.HTTP_1_0);
        L7:
            if ("chunked".equalsIgnoreCase(r0.getValue()) == true) goto L18;
            return false;
        L39:
            throw new java.lang.IllegalArgumentException("HTTP context may not be null.");
        L41:
            throw new java.lang.IllegalArgumentException("HTTP response may not be null.");
        }
    }

    private static class c implements org.apache.http.conn.ConnectionKeepAliveStrategy {
        private c() {
        }

        c(abcd.Sw r1) {
            this();
        }

        @Override
        public long getKeepAliveDuration(org.apache.http.HttpResponse r7, org.apache.http.protocol.HttpContext r8) {
            org.apache.http.message.BasicHeaderElementIterator r9 = new org.apache.http.message.BasicHeaderElementIterator(r7.headerIterator("Keep-Alive"));
            long r0 = 20000;
        L4:
            if (r9.hasNext() == false) goto L11;
            org.apache.http.HeaderElement r10 = r9.nextElement();
            java.lang.String r2 = r10.getName();
            java.lang.String r11 = r10.getValue();
            if (r11 == null) goto L4;
            if (r2.equalsIgnoreCase("timeout") == false) goto L4;
            r0 = java.lang.Math.min(r0, java.lang.Long.parseLong(r11) * 1000);     // Catch: java.lang.NumberFormatException -> L12
            goto L4
        L11:
            return r0;
        }
    }

    private static class d extends org.apache.http.entity.HttpEntityWrapper {
        public d(org.apache.http.HttpEntity r1) {
            super(r1);
        }

        @Override
        public java.io.InputStream getContent() {
            return new java.util.zip.GZIPInputStream(((org.apache.http.entity.HttpEntityWrapper) this).wrappedEntity.getContent());
        }

        @Override
        public long getContentLength() {
            return -1;
        }
    }

    private static class e extends java.lang.Thread {
        private static abcd.Ww.e j6;
        private final abcd.Ww.a DW;
        private final int FH;
        private final int Hw;

        public e(abcd.Ww.a r1, int r2, int r3) {
            this.DW = r1;
            this.FH = r2;
            this.Hw = r3 * 1000;
        }

        public static synchronized void j6(abcd.Ww.a r2, int r3, int r4) {
            monitor-enter(abcd.Ww.e.class);
        L9:
            th = move-exception;
            throw th;
        L5:
            if (j6 != null) goto L7;
            j6 = new abcd.Ww.e(r2, r3, r4);     // Catch: java.lang.Throwable -> L9
            j6.start();     // Catch: java.lang.Throwable -> L9
        L7:
            monitor-exit(abcd.Ww.e.class);
        }

        @Override
        public void run() {
        L23:
            monitor-enter(this);     // Catch: java.lang.InterruptedException -> L21
            wait(this.Hw);     // Catch: java.lang.Throwable -> L18
            monitor-exit(this);     // Catch: java.lang.Throwable -> L18
            this.DW.closeExpiredConnections();     // Catch: java.lang.InterruptedException -> L21
            this.DW.closeIdleConnections(this.FH, java.util.concurrent.TimeUnit.SECONDS);     // Catch: java.lang.InterruptedException -> L21
            monitor-enter(abcd.Ww.e.class);     // Catch: java.lang.InterruptedException -> L21
        L15:
            th = move-exception;
            throw th;     // Catch: java.lang.InterruptedException -> L21
        L9:
            if (this.DW.getConnectionsInPool() == 0) goto L10;
            monitor-exit(abcd.Ww.e.class);     // Catch: java.lang.Throwable -> L15
            goto L23
        L10:
            j6 = null;     // Catch: java.lang.Throwable -> L15
            monitor-exit(abcd.Ww.e.class);     // Catch: java.lang.Throwable -> L15
            return;
        L18:
            th = move-exception;
            throw th;     // Catch: java.lang.InterruptedException -> L21
        L21:
            j6 = null;
        }
    }

    public Ww(abcd.Yw r2, abcd.Zw.a r3) {
        this(r2, r3, null);
    }

    public Ww(abcd.Yw r2, abcd.Zw.a r3, abcd.Xw r4) {
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
        if (r2 == null) goto L10;
        if (r3 == null) goto L8;
        this.DW = r2;
        this.j6 = r3;
        this.FH = r4;
        return;
    L8:
        throw new java.lang.IllegalArgumentException("'type' must be non-null");
    L10:
        throw new java.lang.IllegalArgumentException("'appKeyPair' must be non-null");
    }

    private static java.lang.String DW(java.lang.String r2) {
        return java.net.URLEncoder.encode(r2, "UTF-8");
    L4:
        e = move-exception;
        java.lang.AssertionError r0 = new java.lang.AssertionError("UTF-8 isn't available");
        r0.initCause(e);
        throw r0;
    }

    private static java.lang.String j6(abcd.Yw r4, abcd.Xw r5) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("OAuth oauth_version=\"1.0\"");
        r0.append(", oauth_signature_method=\"PLAINTEXT\"");
        r0.append(", oauth_consumer_key=\"");
        r0.append(DW(r4.j6));
        r0.append("\"");
        if (r5 == null) goto L5;
        r0.append(", oauth_token=\"");
        r0.append(DW(r5.j6));
        r0.append("\"");
        java.lang.String r6 = DW(r4.DW) + "&" + DW(r5.DW);
    L6:
        r0.append(", oauth_signature=\"");
        r0.append(r6);
        r0.append("\"");
        return r0.toString();
    L5:
        r6 = DW(r4.DW) + "&";
        goto L6
    }

    @Override
    public boolean DW() {
        if (this.FH == null) goto L5;
    L8:
        return true;
    L5:
        if (this.Hw != null) goto L8;
        return false;
    }

    @Override
    public abcd.Zw.a FH() {
        return this.j6;
    }

    @Override
    public java.lang.String Hw() {
        return "api.dropbox.com";
    }

    public abcd.Xw VH() {
        return this.FH;
    }

    @Override
    public java.lang.String Zo() {
        return "api-content.dropbox.com";
    }

    @Override
    public java.util.Locale getLocale() {
        return java.util.Locale.ENGLISH;
    }

    public abcd.Yw gn() {
        return this.DW;
    }

    @Override
    public synchronized abcd.Zw.b j6() {
        monitor-enter(this);
        monitor-exit(this);
        return null;
    }

    public void j6(abcd.Xw r2) {
        if (r2 == null) goto L6;
        this.FH = r2;
        this.Hw = null;
        return;
    L6:
        throw new java.lang.IllegalArgumentException("'oauth1AccessToken' must be non-null");
    }

    public void j6(java.lang.String r2) {
        if (r2 == null) goto L6;
        this.Hw = r2;
        this.FH = null;
        return;
    L6:
        throw new java.lang.IllegalArgumentException("'oauth2AccessToken' must be non-null");
    }

    @Override
    public void j6(org.apache.http.HttpRequest r3) {
        if (this.Hw == null) goto L5;
        java.lang.String r0 = "Bearer " + this.Hw;
    L6:
        r3.addHeader("Authorization", r0);
        return;
    L5:
        r0 = j6(this.DW, this.FH);
        goto L6
    }

    @Override
    public void j6(org.apache.http.client.methods.HttpUriRequest r2) {
        org.apache.http.params.HttpParams r3 = r2.getParams();
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, 30000);
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, 30000);
    }

    public void u7() {
        this.FH = null;
        this.Hw = null;
    }

    @Override
    public synchronized org.apache.http.client.HttpClient v5() {
        monitor-enter(this);
    L29:
        th = move-exception;
        throw th;
    L4:
        if (this.v5 != null) goto L26;
        org.apache.http.params.BasicHttpParams r0 = new org.apache.http.params.BasicHttpParams();     // Catch: java.lang.Throwable -> L29
        org.apache.http.conn.params.ConnManagerParams.setMaxConnectionsPerRoute(r0, new abcd.Sw(this));     // Catch: java.lang.Throwable -> L29
        org.apache.http.conn.params.ConnManagerParams.setMaxTotalConnections(r0, 20);     // Catch: java.lang.Throwable -> L29
        abcd.Iw r1 = new abcd.Iw();     // Catch: java.io.IOException -> L8 java.security.cert.CertificateException -> L11 java.security.KeyStoreException -> L14 java.security.NoSuchAlgorithmException -> L17 java.security.UnrecoverableKeyException -> L20 java.security.KeyManagementException -> L23 java.lang.Throwable -> L29
        org.apache.http.conn.scheme.SchemeRegistry r2 = new org.apache.http.conn.scheme.SchemeRegistry();     // Catch: java.lang.Throwable -> L29
        r2.register(new org.apache.http.conn.scheme.Scheme("http", org.apache.http.conn.scheme.PlainSocketFactory.getSocketFactory(), 80));     // Catch: java.lang.Throwable -> L29
        r2.register(new org.apache.http.conn.scheme.Scheme("https", r1, 443));     // Catch: java.lang.Throwable -> L29
        abcd.Ww.a r3 = new abcd.Ww.a(r0, r2);     // Catch: java.lang.Throwable -> L29
        org.apache.http.params.BasicHttpParams r4 = new org.apache.http.params.BasicHttpParams();     // Catch: java.lang.Throwable -> L29
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r4, 30000);     // Catch: java.lang.Throwable -> L29
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r4, 30000);     // Catch: java.lang.Throwable -> L29
        org.apache.http.params.HttpConnectionParams.setSocketBufferSize(r4, 8192);     // Catch: java.lang.Throwable -> L29
        org.apache.http.params.HttpProtocolParams.setUserAgent(r4, "OfficialDropboxJavaSDK/" + abcd.Dw.j6);     // Catch: java.lang.Throwable -> L29
        abcd.Tw r5 = new abcd.Tw(this, r3, r4);     // Catch: java.lang.Throwable -> L29
        r5.addRequestInterceptor(new abcd.Uw(this));     // Catch: java.lang.Throwable -> L29
        r5.addResponseInterceptor(new abcd.Vw(this));     // Catch: java.lang.Throwable -> L29
        this.v5 = r5;     // Catch: java.lang.Throwable -> L29
        goto L26
    L11:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L29
    L17:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L29
    L20:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L29
    L8:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L29
    L23:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L29
    L14:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L29
    L26:
        org.apache.http.client.HttpClient r6 = this.v5;     // Catch: java.lang.Throwable -> L29
        monitor-exit(this);
        return r6;
    }
}
