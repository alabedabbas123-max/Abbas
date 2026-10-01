package abcd;

public class xJ extends abcd.AbstractsI implements abcd.SJ, abcd.BI {
    private static final java.lang.String Mr = null;
    static final abcd.DJ U2 = null;
    static final abcd.DJ a8 = null;
    private static final gE.b<abcd.xJ.b> lg = null;
    private boolean BT;
    private final java.net.URL er;
    private final java.net.ProxySelector gW;
    private final java.net.URL rN;
    private abcd.AbstractrI vy;
    private final abcd.xJ.b yS;

    private static class a implements javax.net.ssl.X509TrustManager {
        private a() {
        }

        a(abcd.xJ.a r1) {
            this();
        }

        @Override
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
        }

        @Override
        public void checkServerTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
        }

        @Override
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    private static class b {
        final boolean DW;
        final int j6;

        b(abcd.gE r4) {
            this.j6 = r4.j6("http", "postbuffer", 1048576);
            this.DW = r4.j6("http", "sslVerify", true);
        }
    }

    class c extends abcd.RJ {
        final abcd.xJ DW;
        private final java.net.URL j6;

        c(abcd.xJ r1, java.net.URL r2) {
            this.DW = r1;
            this.j6 = r2;
        }

        private abcd.nD gn(java.lang.String r5) {
            return new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().duplicateAdvertisementsOf, new java.lang.Object[]{r5}));
        }

        private abcd.nD tp(java.lang.String r5) {
            return new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().advertisementOfCameBefore, new java.lang.Object[]{r5, r5}));
        }

        private abcd.nD u7(java.lang.String r5) {
            return new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidAdvertisementOf, new java.lang.Object[]{r5}));
        }

        @Override
        java.util.Collection<abcd.RJ> DW() {
            return VH("info/http-alternates");
        L4:
            return VH("info/alternates");
        L6:
            return null;
        }

        @Override
        java.util.Collection<java.lang.String> FH() {
            java.util.ArrayList r0 = new java.util.ArrayList();
            java.io.BufferedReader r1 = Zo("info/packs");     // Catch: java.io.FileNotFoundException -> L21
        L23:
            java.lang.String r2 = r1.readLine();     // Catch: java.lang.Throwable -> L18
            if (r2 == null) goto L16;
            if (r2.length() == 0) goto L16;
            if (r2.startsWith("P pack-") == false) goto L15;
            if (r2.endsWith(".pack") == false) goto L15;
            r0.add(r2.substring(2));     // Catch: java.lang.Throwable -> L18
        L15:
            throw u7(r2);     // Catch: java.lang.Throwable -> L18
        L16:
            r1.close();     // Catch: java.io.FileNotFoundException -> L21
            return r0;
        L18:
            th = move-exception;
            r1.close();     // Catch: java.io.FileNotFoundException -> L21
            throw th;     // Catch: java.io.FileNotFoundException -> L21
        L21:
            return r0;
        }

        @Override
        abcd.HJ Hw() {
            return new abcd.HJ(this.j6);
        }

        @Override
        abcd.RJ.a Hw(java.lang.String r5) {
            java.net.URL r1 = new java.net.URL(this.j6, r5);
            java.net.HttpURLConnection r6 = this.DW.j6(r1);
            int r0 = abcd.AK.j6(r6);
            if (r0 == 200) goto L11;
            if (r0 == 404) goto L9;
            throw new java.io.IOException(java.lang.String.valueOf(r1.toString()) + ": " + abcd.AK.j6(r6) + " " + r6.getResponseMessage());
        L9:
            throw new java.io.FileNotFoundException(r1.toString());
        L11:
            return new abcd.RJ.a(this.DW.j6(r6), r6.getContentLength());
        }

        java.util.Map<java.lang.String, abcd.ME> j6(java.io.BufferedReader r7) {
            java.util.TreeMap r0 = new java.util.TreeMap();
        L3:
            java.lang.String r1 = r7.readLine();
            if (r1 == null) goto L5;
            int r2 = r1.indexOf(9);
            if (r2 < 0) goto L25;
            java.lang.String r3 = r1.substring(r2 + 1);
            abcd.yE r4 = abcd.yE.j6(r1.substring(0, r2));
            if (r3.endsWith("^{}") == true) goto L10;
            if (((abcd.ME) r0.put(r3, new abcd.BE.a(abcd.ME.a.v5, r3, r4))) == null) goto L3;
            throw gn(r3);
        L10:
            java.lang.String r5 = r3.substring(0, r3.length() - 3);
            abcd.ME r6 = (abcd.ME) r0.get(r5);
            if (r6 == null) goto L18;
            if (r6.FH() != null) goto L16;
            r0.put(r5, new abcd.BE.b(abcd.ME.a.v5, r5, r6.DW(), r4));
            goto L3
        L16:
            throw gn(java.lang.String.valueOf(r5) + "^{}");
        L18:
            throw tp(r5);
        L25:
            throw u7(r1);
        L5:
            return r0;
        }

        @Override
        void j6() {
        }

        @Override
        abcd.RJ v5(java.lang.String r5) {
            return new abcd.xJ.c(this.DW, new java.net.URL(this.j6, r5));
        }
    }

    class d {
        private final java.lang.String DW;
        private final java.lang.String FH;
        private final abcd.xJ.d.a Hw;
        java.net.HttpURLConnection VH;
        final abcd.xJ.d.b Zo;
        final abcd.xJ gn;
        private final java.lang.String j6;
        final abcd.cL v5;

        class a extends java.io.InputStream {
            final abcd.xJ.d j6;

            a(abcd.xJ.d r1) {
                this.j6 = r1;
            }

            @Override
            public int read() {
                this.j6.j6();
                return -1;
            }

            @Override
            public int read(byte[] r1, int r2, int r3) {
                this.j6.j6();
                return -1;
            }

            @Override
            public long skip(long r1) {
                this.j6.j6();
                return 0;
            }
        }

        class b extends abcd.RK {
            final abcd.xJ.d Hw;

            b(abcd.xJ.d r1) {
                this.Hw = r1;
                super(abcd.xJ.j6(abcd.xJ.d.j6(r1)).j6);
            }

            @Override
            protected java.io.OutputStream Hw() {
                this.Hw.DW();
                this.Hw.VH.setChunkedStreamingMode(0);
                return this.Hw.VH.getOutputStream();
            }
        }

        d(abcd.xJ r3, java.lang.String r4) {
            this.gn = r3;
            this.j6 = r4;
            this.DW = "application/x-" + r4 + "-request";
            this.FH = "application/x-" + r4 + "-result";
            this.Hw = new abcd.xJ.d.a(this);
            this.v5 = new abcd.cL(new java.io.InputStream[]{this.Hw});
            this.Zo = new abcd.xJ.d.b(this);
        }

        static abcd.xJ j6(abcd.xJ.d r0) {
            return r0.gn;
        }

        void DW() {
            abcd.xJ r0 = this.gn;
            this.VH = r0.j6("POST", new java.net.URL(abcd.xJ.DW(r0), this.j6));
            this.VH.setInstanceFollowRedirects(false);
            this.VH.setDoOutput(true);
            this.VH.setRequestProperty("Content-Type", this.DW);
            this.VH.setRequestProperty("Accept", this.FH);
        }

        void j6() {
            this.Zo.close();
            if (this.VH == null) goto L5;
        L23:
            this.Zo.v5();
            int r0 = abcd.AK.j6(this.VH);
            if (r0 != 200) goto L32;
            java.lang.String r1 = this.VH.getContentType();
            if (this.FH.equals(r1) == false) goto L29;
            this.v5.j6(this.gn.j6(this.VH));
            this.v5.j6(this.Hw);
            this.VH = null;
            return;
        L29:
            this.VH.getInputStream().close();
            throw this.gn.j6(this.FH, r1);
        L32:
            throw new abcd.yD(this.gn.Zo, java.lang.String.valueOf(r0) + " " + this.VH.getResponseMessage());
        L5:
            if (this.Zo.DW() == 0) goto L22;
            abcd.RK r2 = new abcd.RK.c(abcd.xJ.j6(this.gn).j6);
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream(r2);     // Catch: java.io.IOException -> L11
            this.Zo.j6(r3, null);     // Catch: java.io.IOException -> L11
            r3.close();     // Catch: java.io.IOException -> L11
            if (this.Zo.DW() >= r2.DW()) goto L12;
            r2 = this.Zo;     // Catch: java.io.IOException -> L11
        L12:
            DW();
            if (r2 == this.Zo) goto L15;
            this.VH.setRequestProperty("Content-Encoding", "gzip");
        L15:
            this.VH.setFixedLengthStreamingMode((int) r2.DW());
            java.io.OutputStream r4 = this.VH.getOutputStream();
            r2.j6(r4, null);     // Catch: java.lang.Throwable -> L18
            r4.close();
        L18:
            th = move-exception;
            r4.close();
            throw th;
        L11:
            r2 = this.Zo;
            goto L12
        L22:
            throw new abcd.yD(this.gn.Zo, org.eclipse.jgit.JGitText.j6().startingReadStageWithoutWrittenRequestDataPendingIsNotSupported);
        }
    }

    class e extends abcd.AbstracteI {
        final abcd.xJ ro;

        e(abcd.xJ r1, java.io.InputStream r2) {
            this.ro = r1;
            super(r1);
            this.Ws = true;
            j6(r2, abcd.TK.j6);
            this.J8 = false;
            EQ();
        }

        @Override
        protected void DW(abcd.LE r4, java.util.Collection<abcd.ME> r5, java.util.Set<abcd.yE> r6) {
            abcd.xJ.d r0 = new abcd.xJ.d(this.ro, "git-upload-pack");
            j6(r0.v5, r0.Zo);
            super.DW(r4, r5, r6);
        }
    }

    class f extends abcd.AbstractC0772gI {
        final abcd.xJ yS;

        f(abcd.xJ r1, java.io.InputStream r2) {
            this.yS = r1;
            super(r1);
            this.Ws = true;
            j6(r2, abcd.TK.j6);
            this.J8 = false;
            EQ();
        }

        @Override
        protected void DW(abcd.LE r4, java.util.Map<java.lang.String, abcd.YI> r5) {
            abcd.xJ.d r0 = new abcd.xJ.d(this.yS, "git-receive-pack");
            j6(r0.v5, r0.Zo);
            super.DW(r4, r5);
        }
    }

    static {
        Mr = aM();
        U2 = new abcd.C1374uJ();
        a8 = new abcd.C1417vJ();
        lg = new abcd.wJ();
    }

    xJ(abcd.UE r5, abcd.HJ r6) {
        super(r5, r6);
        this.BT = true;
        this.vy = abcd.AbstractrI.j6;
        java.lang.String r2 = r6.toString();     // Catch: java.net.MalformedURLException -> L9
        if (r2.endsWith("/") == true) goto L6;
        r2 = java.lang.String.valueOf(r2) + "/";     // Catch: java.net.MalformedURLException -> L9
    L6:
        this.rN = new java.net.URL(r2);     // Catch: java.net.MalformedURLException -> L9
        this.er = new java.net.URL(this.rN, "objects/");     // Catch: java.net.MalformedURLException -> L9
        this.yS = (abcd.xJ.b) r5.Zo().j6(lg);
        this.gW = java.net.ProxySelector.getDefault();
        return;
    L9:
        e = move-exception;
        throw new abcd.jD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidURL, new java.lang.Object[]{r6}), e);
    }

    private java.io.BufferedReader DW(java.io.InputStream r4) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(r4, abcd.hE.Zo));
    }

    static java.net.URL DW(abcd.xJ r0) {
        return r0.rN;
    }

    private java.net.HttpURLConnection FH(java.lang.String r9) {
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();     // Catch: java.net.MalformedURLException -> L52
        r2.append(this.rN);     // Catch: java.net.MalformedURLException -> L52
        if (r2.charAt(r2.length() - 1) == '/') goto L6;
        r2.append('/');     // Catch: java.net.MalformedURLException -> L52
    L6:
        r2.append("info/refs");     // Catch: java.net.MalformedURLException -> L52
        if (this.BT == true) goto L9;
    L13:
        java.net.URL r3 = new java.net.URL(r2.toString());     // Catch: java.net.MalformedURLException -> L52
        int r4 = 1;
    L58:
        java.net.HttpURLConnection r5 = j6(r3);     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
        if (this.BT == false) goto L19;
        java.lang.StringBuilder r7 = new java.lang.StringBuilder(java.lang.String.valueOf("application/x-" + r9 + "-advertisement"));     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
        r7.append(", */*");     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
        r5.setRequestProperty("Accept", r7.toString());     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L20:
        int r6 = abcd.AK.j6(r5);     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
        if (r6 == 200) goto L44;
        if (r6 != 401) goto L25;
        this.vy = abcd.AbstractrI.DW(r5);     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
        if (this.vy == abcd.AbstractrI.j6) goto L43;
        if (1 < r4) goto L41;
        if (this.vy.j6(this.Zo, FH()) == false) goto L41;
        r4 = r4 + 1;     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L41:
        throw new abcd.yD(this.Zo, org.eclipse.jgit.JGitText.j6().notAuthorized);     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L43:
        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().authenticationNotSupported, new java.lang.Object[]{this.Zo}));     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L25:
        if (r6 == 403) goto L33;
        if (r6 == 404) goto L31;
        throw new abcd.yD(this.Zo, java.lang.String.valueOf(r6) + " " + r5.getResponseMessage());     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L31:
        throw new abcd.hD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().uriNotFound, new java.lang.Object[]{r3}));     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L33:
        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().serviceNotPermitted, new java.lang.Object[]{r9}));     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L44:
        return r5;
    L19:
        r5.setRequestProperty("Accept", "*/*");     // Catch: java.io.IOException -> L45 abcd.yD -> L48 abcd.jD -> L50
    L50:
        e = move-exception;
        throw e;
    L48:
        e = move-exception;
        throw e;
    L45:
        e = move-exception;
        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotOpenService, new java.lang.Object[]{r9}), e);
    L9:
        if (r2.indexOf("?") >= 0) goto L11;
        char r8 = '?';
    L12:
        r2.append(r8);     // Catch: java.net.MalformedURLException -> L52
        r2.append("service=");     // Catch: java.net.MalformedURLException -> L52
        r2.append(r9);     // Catch: java.net.MalformedURLException -> L52
        goto L13
    L11:
        r8 = '&';
    L52:
        e = move-exception;
        throw new abcd.jD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidURL, new java.lang.Object[]{this.Zo}), e);
    }

    private static java.lang.String aM() {
        java.lang.Package r0 = abcd.xJ.class.getPackage();
        if (r0 != null) goto L5;
    L7:
        java.lang.String r1 = "unknown";
    L9:
        return "JGit/" + r1;
    L5:
        if (r0.getImplementationVersion() == null) goto L7;
        r1 = r0.getImplementationVersion();
        goto L9
    }

    private abcd.InterfacenI j6(java.io.InputStream r8) {
        abcd.xJ.c r0 = new abcd.xJ.c(this, this.er);
        java.io.BufferedReader r9 = DW(r8);
        java.util.Map<java.lang.String, abcd.ME> r1 = r0.j6(r9);     // Catch: java.lang.Throwable -> L32
        r9.close();
        if (r1.containsKey("HEAD") == true) goto L30;
        java.net.HttpURLConnection r2 = j6(new java.net.URL(this.rN, "HEAD"));
        int r3 = abcd.AK.j6(r2);
        if (r3 != 200) goto L9;
        java.io.BufferedReader r4 = DW(j6(r2));
        java.lang.String r5 = r4.readLine();     // Catch: java.lang.Throwable -> L27
        if (r5 != null) goto L17;
    L22:
        if (r5 != null) goto L24;
    L26:
        r4.close();
        goto L30
    L24:
        if (abcd.yE.DW(r5) == false) goto L26;
        abcd.BE.c r6 = new abcd.BE.c(abcd.ME.a.v5, "HEAD", abcd.yE.j6(r5));     // Catch: java.lang.Throwable -> L27
        r1.put(r6.getName(), r6);     // Catch: java.lang.Throwable -> L27
        goto L26
    L17:
        if (r5.startsWith("ref: ") == false) goto L22;
        java.lang.String r7 = r5.substring(5);     // Catch: java.lang.Throwable -> L27
        abcd.ME r10 = r1.get(r7);     // Catch: java.lang.Throwable -> L27
        if (r10 != null) goto L21;
        r10 = new abcd.BE.c(abcd.ME.a.j6, r7, null);     // Catch: java.lang.Throwable -> L27
    L21:
        abcd.kF r11 = new abcd.kF("HEAD", r10);     // Catch: java.lang.Throwable -> L27
        r1.put(r11.getName(), r11);     // Catch: java.lang.Throwable -> L27
    L27:
        th = move-exception;
        r4.close();
        throw th;
    L9:
        if (r3 == 404) goto L30;
        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotReadHEAD, new java.lang.Object[]{java.lang.Integer.valueOf(r3), r2.getResponseMessage()}));
    L30:
        abcd.OJ r12 = new abcd.OJ(this, r0);
        r12.j6(r1);
        return r12;
    L32:
        th = move-exception;
        r9.close();
        throw th;
    }

    static abcd.xJ.b j6(abcd.xJ r0) {
        return r0.yS;
    }

    private void j6(java.io.InputStream r9, java.lang.String r10) {
        byte[] r0 = new byte[5];
        abcd.BK.j6(r9, r0, 0, r0.length);
        if (r0[4] != 35) goto L12;
        abcd.DI r1 = new abcd.DI(new abcd.cL(new java.io.InputStream[]{new java.io.ByteArrayInputStream(r0), r9}));
        java.lang.String r11 = "# service=" + r10;
        java.lang.String r12 = r1.DW();
        if (r11.equals(r12) == false) goto L10;
    L7:
        if (r1.DW() != abcd.DI.j6) goto L7;
        return;
    L10:
        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedGot, new java.lang.Object[]{r11, r12}));
    L12:
        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedPktLineWithService, new java.lang.Object[]{abcd.IK.j6(r0)}));
    }

    private void j6(java.net.URLConnection r5) {
        javax.net.ssl.TrustManager[] r0 = {new abcd.xJ.a(null)};
        javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance("SSL");     // Catch: java.security.NoSuchAlgorithmException -> L5 java.security.KeyManagementException -> L8
        r1.init(null, r0, null);     // Catch: java.security.NoSuchAlgorithmException -> L5 java.security.KeyManagementException -> L8
        ((javax.net.ssl.HttpsURLConnection) r5).setSSLSocketFactory(r1.getSocketFactory());     // Catch: java.security.NoSuchAlgorithmException -> L5 java.security.KeyManagementException -> L8
        return;
    L8:
        e = move-exception;
        throw new java.io.IOException(e.getMessage());
    L5:
        e = move-exception;
        throw new java.io.IOException(e.getMessage());
    }

    private boolean j6(java.net.HttpURLConnection r3, java.lang.String r4) {
        return ("application/x-" + r4 + "-advertisement").equals(r3.getContentType());
    }

    @Override
    public void DW() {
    }

    @Override
    public abcd.InterfacenI QX() {
        java.net.HttpURLConnection r1 = FH("git-upload-pack");     // Catch: java.io.IOException -> L15 abcd.yD -> L17 abcd.jD -> L19
        java.io.InputStream r2 = j6(r1);     // Catch: java.io.IOException -> L15 abcd.yD -> L17 abcd.jD -> L19
    L12:
        th = move-exception;
        r2.close();     // Catch: java.io.IOException -> L15 abcd.yD -> L17 abcd.jD -> L19
        throw th;     // Catch: java.io.IOException -> L15 abcd.yD -> L17 abcd.jD -> L19
    L5:
        if (j6(r1, "git-upload-pack") == false) goto L9;
        j6(r2, "git-upload-pack");     // Catch: java.lang.Throwable -> L12
        abcd.xJ.e r0 = new abcd.xJ.e(this, r2);     // Catch: java.lang.Throwable -> L12
        r2.close();     // Catch: java.io.IOException -> L15 abcd.yD -> L17 abcd.jD -> L19
        return r0;
    L9:
        abcd.InterfacenI r3 = j6(r2);     // Catch: java.lang.Throwable -> L12
        r2.close();     // Catch: java.io.IOException -> L15 abcd.yD -> L17 abcd.jD -> L19
        return r3;
    L19:
        e = move-exception;
        throw e;
    L17:
        e = move-exception;
        throw e;
    L15:
        e = move-exception;
        throw new abcd.yD(this.Zo, org.eclipse.jgit.JGitText.j6().errorReadingInfoRefs, e);
    }

    @Override
    public abcd.LI XL() {
        java.net.HttpURLConnection r1 = FH("git-receive-pack");     // Catch: java.io.IOException -> L18 abcd.yD -> L20 abcd.jD -> L22
        java.io.InputStream r2 = j6(r1);     // Catch: java.io.IOException -> L18 abcd.yD -> L20 abcd.jD -> L22
    L15:
        th = move-exception;
        r2.close();     // Catch: java.io.IOException -> L18 abcd.yD -> L20 abcd.jD -> L22
        throw th;     // Catch: java.io.IOException -> L18 abcd.yD -> L20 abcd.jD -> L22
    L5:
        if (j6(r1, "git-receive-pack") == false) goto L10;
        j6(r2, "git-receive-pack");     // Catch: java.lang.Throwable -> L15
        abcd.xJ.f r0 = new abcd.xJ.f(this, r2);     // Catch: java.lang.Throwable -> L15
        r2.close();     // Catch: java.io.IOException -> L18 abcd.yD -> L20 abcd.jD -> L22
        return r0;
    L10:
        if (this.BT == true) goto L14;
        throw new abcd.jD(org.eclipse.jgit.JGitText.j6().smartHTTPPushDisabled);     // Catch: java.lang.Throwable -> L15
    L14:
        throw new abcd.jD(org.eclipse.jgit.JGitText.j6().remoteDoesNotSupportSmartHTTPPush);     // Catch: java.lang.Throwable -> L15
    L22:
        e = move-exception;
        throw e;
    L20:
        e = move-exception;
        throw e;
    L18:
        e = move-exception;
        throw new abcd.yD(this.Zo, org.eclipse.jgit.JGitText.j6().errorReadingInfoRefs, e);
    }

    java.io.IOException j6(java.lang.String r4, java.lang.String r5) {
        return new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedReceivedContentType, new java.lang.Object[]{r4, r5}));
    }

    final java.io.InputStream j6(java.net.HttpURLConnection r3) {
        java.io.InputStream r0 = r3.getInputStream();
        if ("gzip".equals(r3.getHeaderField("Content-Encoding")) == false) goto L6;
        return new java.util.zip.GZIPInputStream(r0);
    L6:
        return r0;
    }

    final java.net.HttpURLConnection j6(java.lang.String r3, java.net.URL r4) {
        java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r4.openConnection(abcd.AK.j6(this.gW, r4));
        if (this.yS.DW == false) goto L5;
    L7:
        r0.setRequestMethod(r3);
        r0.setUseCaches(false);
        r0.setRequestProperty("Accept-Encoding", "gzip");
        r0.setRequestProperty("Pragma", "no-cache");
        r0.setRequestProperty("User-Agent", Mr);
        r0.setConnectTimeout(gn() * 1000);
        r0.setReadTimeout(gn() * 1000);
        this.vy.j6(r0);
        return r0;
    L5:
        if ("https".equals(r4.getProtocol()) == false) goto L7;
        j6(r0);
        goto L7
    }

    final java.net.HttpURLConnection j6(java.net.URL r2) {
        return j6("GET", r2);
    }
}
