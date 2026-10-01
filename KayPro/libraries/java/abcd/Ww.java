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
            org.apache.http.ProtocolVersion r8 = null;
            org.apache.http.Header r0 = null;
            org.apache.http.Header[] r1 = null;
            org.apache.http.HeaderIterator r2 = null;
            org.apache.http.TokenIterator r9 = null;
            boolean r3 = false;
            java.lang.String r4 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r6 == null) { $pc0 = 41; continue $sw0; }
                        if (r7 == null) { $pc0 = 39; continue $sw0; }
                        r8 = r6.getStatusLine().getProtocolVersion();
                        r0 = r6.getFirstHeader("Transfer-Encoding");
                        if (r0 != null) { $pc0 = 7; continue $sw0; }
                        r1 = r6.getHeaders("Content-Length");
                        if (r1 != null) { $pc0 = 12; continue $sw0; }
                        $pc0 = 37; continue $sw0;
                    }
                    case 37: {
                        return false;
                    }
                    case 12: {
                        if (r1.length != 1) { $pc0 = 37; continue $sw0; }
                        if (java.lang.Integer.parseInt(r1[0].getValue()) >= 0) { $pc0 = 18; continue $sw0; }
                        return false;
                    }
                    case 18: {
                        r2 = r6.headerIterator("Connection");
                        if (r2.hasNext() == true) { $pc0 = 22; continue $sw0; }
                        r2 = r6.headerIterator("Proxy-Connection");
                        $pc0 = 22; continue $sw0;
                    }
                    case 22: {
                        if (r2.hasNext() == false) { $pc0 = 36; continue $sw0; }
                        try {
                            r9 = createTokenIterator(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof org.apache.http.ParseException) { $pc0 = 34; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        r3 = false;
                        $pc0 = 25; continue $sw0;
                    }
                    case 25: {
                        if (r9.hasNext() == false) { $pc0 = 32; continue $sw0; }
                        try {
                            r4 = r9.nextToken();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof org.apache.http.ParseException) { $pc0 = 34; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if ("Close".equalsIgnoreCase(r4) == true) { $pc0 = 28; continue $sw0; }
                        if ("Keep-Alive".equalsIgnoreCase(r4) == false) { $pc0 = 25; continue $sw0; }
                        r3 = true;
                        { $pc0 = 25; continue $sw0; }
                    }
                    case 28: {
                        return false;
                    }
                    case 32: {
                        if (r3 == false) { $pc0 = 36; continue $sw0; }
                        return true;
                    }
                    case 34: {
                        return false;
                    }
                    case 36: {
                        return !r8.lessEquals(org.apache.http.HttpVersion.HTTP_1_0);
                    }
                    case 7: {
                        if ("chunked".equalsIgnoreCase(r0.getValue()) == true) { $pc0 = 18; continue $sw0; }
                        return false;
                    }
                    case 39: {
                        throw new java.lang.IllegalArgumentException("HTTP context may not be null.");
                    }
                    case 41: {
                        throw new java.lang.IllegalArgumentException("HTTP response may not be null.");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            org.apache.http.message.BasicHeaderElementIterator r9 = null;
            long r0 = 0L;
            org.apache.http.HeaderElement r10 = null;
            java.lang.String r2 = null;
            java.lang.String r11 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r9 = new org.apache.http.message.BasicHeaderElementIterator(r7.headerIterator("Keep-Alive"));
                        r0 = 20000;
                        $pc1 = 4; continue $sw1;
                    }
                    case 4: {
                        if (r9.hasNext() == false) { $pc1 = 11; continue $sw1; }
                        r10 = r9.nextElement();
                        r2 = r10.getName();
                        r11 = r10.getValue();
                        if (r11 == null) { $pc1 = 4; continue $sw1; }
                        if (r2.equalsIgnoreCase("timeout") == false) { $pc1 = 4; continue $sw1; }
                        try {
                            r0 = java.lang.Math.min(r0, java.lang.Long.parseLong(r11) * 1000);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NumberFormatException) { $pc1 = 12; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        { $pc1 = 4; continue $sw1; }
                    }
                    case 11: {
                        return r0;
                    }
                    case 12: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            synchronized (abcd.Ww.e.class) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = -1;
                $sw2: while (true) {
                    switch ($pc2) {
                        case -1: {
                            $pc2 = 5; continue $sw2;
                        }
                        case 9: {
                            th = $ex2;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 5: {
                            if (j6 != null) { $pc2 = 7; continue $sw2; }
                            try {
                                j6 = new abcd.Ww.e(r2, r3, r4);
                                j6.start();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 9; continue $sw2;
                            }
                            $pc2 = 7; continue $sw2;
                        }
                        case 7: {
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
        
            }
        }

        @Override
        public void run() {
            synchronized (abcd.Ww.e.class) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 9;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 23: {
                            try {
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 21; continue $sw3; }
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                            }
                            try {
                                wait(this.Hw);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 18; continue $sw3;
                            }
                            try {
                                this.DW.closeExpiredConnections();
                                this.DW.closeIdleConnections(this.FH, java.util.concurrent.TimeUnit.SECONDS);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 21; continue $sw3; }
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                            }
                            $pc3 = 9; continue $sw3;
                        }
                        case 15: {
                            th = $ex3;
                            try {
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 21; continue $sw3; }
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                            }
                        }
                        case 9: {
                            if (this.DW.getConnectionsInPool() == 0) { $pc3 = 10; continue $sw3; }
                            try {
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 15; continue $sw3;
                            }
                            { $pc3 = 23; continue $sw3; }
                        }
                        case 10: {
                            try {
                                j6 = null;
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 15; continue $sw3;
                            }
                            return;
                        }
                        case 18: {
                            th = $ex3;
                            try {
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 21; continue $sw3; }
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                            }
                        }
                        case 21: {
                            j6 = null;
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
        
            }
        }
    }

    public Ww(abcd.Yw r2, abcd.Zw.a r3) {
        this(r2, r3, null);
    }

    public Ww(abcd.Yw r2, abcd.Zw.a r3, abcd.Xw r4) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    this.FH = null;
                    this.Hw = null;
                    this.v5 = null;
                    if (r2 == null) { $pc4 = 10; continue $sw4; }
                    if (r3 == null) { $pc4 = 8; continue $sw4; }
                    this.DW = r2;
                    this.j6 = r3;
                    this.FH = r4;
                    return;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("'type' must be non-null");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("'appKeyPair' must be non-null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String DW(java.lang.String r2) {
        java.lang.AssertionError r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    return java.net.URLEncoder.encode(r2, "UTF-8");
                }
                case 4: {
                    e = $ex5;
                    r0 = new java.lang.AssertionError("UTF-8 isn't available");
                    r0.initCause(e);
                    throw r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(abcd.Yw r4, abcd.Xw r5) {
        java.lang.StringBuilder r0 = null;
        java.lang.String r6 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("OAuth oauth_version=\"1.0\"");
                    r0.append(", oauth_signature_method=\"PLAINTEXT\"");
                    r0.append(", oauth_consumer_key=\"");
                    r0.append(DW(r4.j6));
                    r0.append("\"");
                    if (r5 == null) { $pc6 = 5; continue $sw6; }
                    r0.append(", oauth_token=\"");
                    r0.append(DW(r5.j6));
                    r0.append("\"");
                    r6 = DW(r4.DW) + "&" + DW(r5.DW);
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    r0.append(", oauth_signature=\"");
                    r0.append(r6);
                    r0.append("\"");
                    return r0.toString();
                }
                case 5: {
                    r6 = DW(r4.DW) + "&";
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean DW() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.FH == null) { $pc7 = 5; continue $sw7; }
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    return true;
                }
                case 5: {
                    if (this.Hw != null) { $pc7 = 8; continue $sw7; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        synchronized (this) {
            return null;
    
        }
    }

    public void j6(abcd.Xw r2) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r2 == null) { $pc8 = 6; continue $sw8; }
                    this.FH = r2;
                    this.Hw = null;
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException("'oauth1AccessToken' must be non-null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r2 == null) { $pc9 = 6; continue $sw9; }
                    this.Hw = r2;
                    this.FH = null;
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException("'oauth2AccessToken' must be non-null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(org.apache.http.HttpRequest r3) {
        java.lang.String r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.Hw == null) { $pc10 = 5; continue $sw10; }
                    r0 = "Bearer " + this.Hw;
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    r3.addHeader("Authorization", r0);
                    return;
                }
                case 5: {
                    r0 = j6(this.DW, this.FH);
                    { $pc10 = 6; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        synchronized (this) {
            org.apache.http.params.BasicHttpParams r0 = null;
            abcd.Iw r1 = null;
            org.apache.http.conn.scheme.SchemeRegistry r2 = null;
            abcd.Ww.a r3 = null;
            org.apache.http.params.BasicHttpParams r4 = null;
            abcd.Tw r5 = null;
            org.apache.http.client.HttpClient r6 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = -1;
            $sw11: while (true) {
                switch ($pc11) {
                    case -1: {
                        $pc11 = 4; continue $sw11;
                    }
                    case 29: {
                        th = $ex11;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.v5 != null) { $pc11 = 26; continue $sw11; }
                        try {
                            r0 = new org.apache.http.params.BasicHttpParams();
                            org.apache.http.conn.params.ConnManagerParams.setMaxConnectionsPerRoute(r0, new abcd.Sw(this));
                            org.apache.http.conn.params.ConnManagerParams.setMaxTotalConnections(r0, 20);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                        try {
                            r1 = new abcd.Iw();
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            if ($t instanceof java.io.IOException) { $pc11 = 8; continue $sw11; }
                            if ($t instanceof java.security.cert.CertificateException) { $pc11 = 11; continue $sw11; }
                            if ($t instanceof java.security.KeyStoreException) { $pc11 = 14; continue $sw11; }
                            if ($t instanceof java.security.NoSuchAlgorithmException) { $pc11 = 17; continue $sw11; }
                            if ($t instanceof java.security.UnrecoverableKeyException) { $pc11 = 20; continue $sw11; }
                            if ($t instanceof java.security.KeyManagementException) { $pc11 = 23; continue $sw11; }
                            $pc11 = 29; continue $sw11;
                        }
                        try {
                            r2 = new org.apache.http.conn.scheme.SchemeRegistry();
                            r2.register(new org.apache.http.conn.scheme.Scheme("http", org.apache.http.conn.scheme.PlainSocketFactory.getSocketFactory(), 80));
                            r2.register(new org.apache.http.conn.scheme.Scheme("https", r1, 443));
                            r3 = new abcd.Ww.a(r0, r2);
                            r4 = new org.apache.http.params.BasicHttpParams();
                            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r4, 30000);
                            org.apache.http.params.HttpConnectionParams.setSoTimeout(r4, 30000);
                            org.apache.http.params.HttpConnectionParams.setSocketBufferSize(r4, 8192);
                            org.apache.http.params.HttpProtocolParams.setUserAgent(r4, "OfficialDropboxJavaSDK/" + abcd.Dw.j6);
                            r5 = new abcd.Tw(this, r3, r4);
                            r5.addRequestInterceptor(new abcd.Uw(this));
                            r5.addResponseInterceptor(new abcd.Vw(this));
                            this.v5 = r5;
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                        { $pc11 = 26; continue $sw11; }
                    }
                    case 11: {
                        e = $ex11;
                        try {
                            throw new java.lang.RuntimeException(e);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                    }
                    case 17: {
                        e = $ex11;
                        try {
                            throw new java.lang.RuntimeException(e);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                    }
                    case 20: {
                        e = $ex11;
                        try {
                            throw new java.lang.RuntimeException(e);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                    }
                    case 8: {
                        e = $ex11;
                        try {
                            throw new java.lang.RuntimeException(e);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                    }
                    case 23: {
                        e = $ex11;
                        try {
                            throw new java.lang.RuntimeException(e);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                    }
                    case 14: {
                        e = $ex11;
                        try {
                            throw new java.lang.RuntimeException(e);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                    }
                    case 26: {
                        try {
                            r6 = this.v5;
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 29; continue $sw11;
                        }
                        return r6;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
