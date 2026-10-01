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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        return VH("info/http-alternates");
                    }
                    case 4: {
                        return VH("info/alternates");
                    }
                    case 6: {
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        java.util.Collection<java.lang.String> FH() {
            java.util.ArrayList r0 = null;
            java.io.BufferedReader r1 = null;
            java.lang.String r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = new java.util.ArrayList();
                        try {
                            r1 = Zo("info/packs");
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.FileNotFoundException) { $pc1 = 21; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 23; continue $sw1;
                    }
                    case 23: {
                        try {
                            r2 = r1.readLine();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 18; continue $sw1;
                        }
                        if (r2 == null) { $pc1 = 16; continue $sw1; }
                        if (r2.length() == 0) { $pc1 = 16; continue $sw1; }
                        if (r2.startsWith("P pack-") == false) { $pc1 = 15; continue $sw1; }
                        if (r2.endsWith(".pack") == false) { $pc1 = 15; continue $sw1; }
                        try {
                            r0.add(r2.substring(2));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 18; continue $sw1;
                        }
                        $pc1 = 15; continue $sw1;
                    }
                    case 15: {
                        try {
                            throw u7(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 18; continue $sw1;
                        }
                    }
                    case 16: {
                        try {
                            r1.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.FileNotFoundException) { $pc1 = 21; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return r0;
                    }
                    case 18: {
                        th = $ex1;
                        try {
                            r1.close();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.FileNotFoundException) { $pc1 = 21; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 21: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        abcd.HJ Hw() {
            return new abcd.HJ(this.j6);
        }

        @Override
        abcd.RJ.a Hw(java.lang.String r5) {
            java.net.URL r1 = null;
            java.net.HttpURLConnection r6 = null;
            int r0 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r1 = new java.net.URL(this.j6, r5);
                        r6 = this.DW.j6(r1);
                        r0 = abcd.AK.j6(r6);
                        if (r0 == 200) { $pc2 = 11; continue $sw2; }
                        if (r0 == 404) { $pc2 = 9; continue $sw2; }
                        throw new java.io.IOException(java.lang.String.valueOf(r1.toString()) + ": " + abcd.AK.j6(r6) + " " + r6.getResponseMessage());
                    }
                    case 9: {
                        throw new java.io.FileNotFoundException(r1.toString());
                    }
                    case 11: {
                        return new abcd.RJ.a(this.DW.j6(r6), r6.getContentLength());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        java.util.Map<java.lang.String, abcd.ME> j6(java.io.BufferedReader r7) {
            java.util.TreeMap r0 = null;
            java.lang.String r1 = null;
            int r2 = 0;
            java.lang.String r3 = null;
            abcd.yE r4 = null;
            java.lang.String r5 = null;
            abcd.ME r6 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = new java.util.TreeMap();
                        $pc3 = 3; continue $sw3;
                    }
                    case 3: {
                        r1 = r7.readLine();
                        if (r1 == null) { $pc3 = 5; continue $sw3; }
                        r2 = r1.indexOf(9);
                        if (r2 < 0) { $pc3 = 25; continue $sw3; }
                        r3 = r1.substring(r2 + 1);
                        r4 = abcd.yE.j6(r1.substring(0, r2));
                        if (r3.endsWith("^{}") == true) { $pc3 = 10; continue $sw3; }
                        if (((abcd.ME) r0.put(r3, new abcd.BE.a(abcd.ME.a.v5, r3, r4))) == null) { $pc3 = 3; continue $sw3; }
                        throw gn(r3);
                    }
                    case 10: {
                        r5 = r3.substring(0, r3.length() - 3);
                        r6 = (abcd.ME) r0.get(r5);
                        if (r6 == null) { $pc3 = 18; continue $sw3; }
                        if (r6.FH() != null) { $pc3 = 16; continue $sw3; }
                        r0.put(r5, new abcd.BE.b(abcd.ME.a.v5, r5, r6.DW(), r4));
                        { $pc3 = 3; continue $sw3; }
                    }
                    case 16: {
                        throw gn(java.lang.String.valueOf(r5) + "^{}");
                    }
                    case 18: {
                        throw tp(r5);
                    }
                    case 25: {
                        throw u7(r1);
                    }
                    case 5: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            int r0 = 0;
            java.lang.String r1 = null;
            abcd.RK r2 = null;
            java.util.zip.GZIPOutputStream r3 = null;
            java.io.OutputStream r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        this.Zo.close();
                        if (this.VH == null) { $pc4 = 5; continue $sw4; }
                        $pc4 = 23; continue $sw4;
                    }
                    case 23: {
                        this.Zo.v5();
                        r0 = abcd.AK.j6(this.VH);
                        if (r0 != 200) { $pc4 = 32; continue $sw4; }
                        r1 = this.VH.getContentType();
                        if (this.FH.equals(r1) == false) { $pc4 = 29; continue $sw4; }
                        this.v5.j6(this.gn.j6(this.VH));
                        this.v5.j6(this.Hw);
                        this.VH = null;
                        return;
                    }
                    case 29: {
                        this.VH.getInputStream().close();
                        throw this.gn.j6(this.FH, r1);
                    }
                    case 32: {
                        throw new abcd.yD(this.gn.Zo, java.lang.String.valueOf(r0) + " " + this.VH.getResponseMessage());
                    }
                    case 5: {
                        if (this.Zo.DW() == 0) { $pc4 = 22; continue $sw4; }
                        r2 = new abcd.RK.c(abcd.xJ.j6(this.gn).j6);
                        try {
                            r3 = new java.util.zip.GZIPOutputStream(r2);
                            this.Zo.j6(r3, null);
                            r3.close();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            if ($t instanceof java.io.IOException) { $pc4 = 11; continue $sw4; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (this.Zo.DW() >= r2.DW()) { $pc4 = 12; continue $sw4; }
                        try {
                            r2 = this.Zo;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            if ($t instanceof java.io.IOException) { $pc4 = 11; continue $sw4; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc4 = 12; continue $sw4;
                    }
                    case 12: {
                        DW();
                        if (r2 == this.Zo) { $pc4 = 15; continue $sw4; }
                        this.VH.setRequestProperty("Content-Encoding", "gzip");
                        $pc4 = 15; continue $sw4;
                    }
                    case 15: {
                        this.VH.setFixedLengthStreamingMode((int) r2.DW());
                        r4 = this.VH.getOutputStream();
                        try {
                            r2.j6(r4, null);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 18; continue $sw4;
                        }
                        r4.close();
                        $pc4 = 22; continue $sw4;
                    }
                    case 18: {
                        th = $ex4;
                        r4.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 11: {
                        r2 = this.Zo;
                        { $pc4 = 12; continue $sw4; }
                    }
                    case 22: {
                        throw new abcd.yD(this.gn.Zo, org.eclipse.jgit.JGitText.j6().startingReadStageWithoutWrittenRequestDataPendingIsNotSupported);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.String r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    super(r5, r6);
                    this.BT = true;
                    this.vy = abcd.AbstractrI.j6;
                    try {
                        r2 = r6.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc5 = 9; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2.endsWith("/") == true) { $pc5 = 6; continue $sw5; }
                    try {
                        r2 = java.lang.String.valueOf(r2) + "/";
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc5 = 9; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        this.rN = new java.net.URL(r2);
                        this.er = new java.net.URL(this.rN, "objects/");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc5 = 9; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.yS = (abcd.xJ.b) r5.Zo().j6(lg);
                    this.gW = java.net.ProxySelector.getDefault();
                    return;
                }
                case 9: {
                    e = $ex5;
                    throw new abcd.jD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidURL, new java.lang.Object[]{r6}), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.io.BufferedReader DW(java.io.InputStream r4) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(r4, abcd.hE.Zo));
    }

    static java.net.URL DW(abcd.xJ r0) {
        return r0.rN;
    }

    private java.net.HttpURLConnection FH(java.lang.String r9) {
        java.lang.StringBuilder r2 = null;
        java.net.URL r3 = null;
        int r4 = 0;
        java.net.HttpURLConnection r5 = null;
        java.lang.StringBuilder r7 = null;
        int r6 = 0;
        char r8 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    try {
                        r2 = new java.lang.StringBuilder();
                        r2.append(this.rN);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc6 = 52; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2.charAt(r2.length() - 1) == '/') { $pc6 = 6; continue $sw6; }
                    try {
                        r2.append('/');
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc6 = 52; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r2.append("info/refs");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc6 = 52; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.BT == true) { $pc6 = 9; continue $sw6; }
                    $pc6 = 13; continue $sw6;
                }
                case 13: {
                    try {
                        r3 = new java.net.URL(r2.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc6 = 52; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = 1;
                    $pc6 = 58; continue $sw6;
                }
                case 58: {
                    try {
                        r5 = j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.BT == false) { $pc6 = 19; continue $sw6; }
                    try {
                        r7 = new java.lang.StringBuilder(java.lang.String.valueOf("application/x-" + r9 + "-advertisement"));
                        r7.append(", */*");
                        r5.setRequestProperty("Accept", r7.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    try {
                        r6 = abcd.AK.j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6 == 200) { $pc6 = 44; continue $sw6; }
                    if (r6 != 401) { $pc6 = 25; continue $sw6; }
                    try {
                        this.vy = abcd.AbstractrI.DW(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.vy == abcd.AbstractrI.j6) { $pc6 = 43; continue $sw6; }
                    if (1 < r4) { $pc6 = 41; continue $sw6; }
                    if (this.vy.j6(this.Zo, FH()) == false) { $pc6 = 41; continue $sw6; }
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 41; continue $sw6;
                }
                case 41: {
                    try {
                        throw new abcd.yD(this.Zo, org.eclipse.jgit.JGitText.j6().notAuthorized);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 43: {
                    try {
                        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().authenticationNotSupported, new java.lang.Object[]{this.Zo}));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 25: {
                    if (r6 == 403) { $pc6 = 33; continue $sw6; }
                    if (r6 == 404) { $pc6 = 31; continue $sw6; }
                    try {
                        throw new abcd.yD(this.Zo, java.lang.String.valueOf(r6) + " " + r5.getResponseMessage());
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 31: {
                    try {
                        throw new abcd.hD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().uriNotFound, new java.lang.Object[]{r3}));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 33: {
                    try {
                        throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().serviceNotPermitted, new java.lang.Object[]{r9}));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 44: {
                    return r5;
                }
                case 19: {
                    try {
                        r5.setRequestProperty("Accept", "*/*");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 45; continue $sw6; }
                        if ($t instanceof abcd.yD) { $pc6 = 48; continue $sw6; }
                        if ($t instanceof abcd.jD) { $pc6 = 50; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 9; continue $sw6;
                }
                case 50: {
                    e = $ex6;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 48: {
                    e = $ex6;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 45: {
                    e = $ex6;
                    throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotOpenService, new java.lang.Object[]{r9}), e);
                }
                case 9: {
                    if (r2.indexOf("?") >= 0) { $pc6 = 11; continue $sw6; }
                    r8 = '?';
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    try {
                        r2.append(r8);
                        r2.append("service=");
                        r2.append(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.net.MalformedURLException) { $pc6 = 52; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc6 = 13; continue $sw6; }
                }
                case 11: {
                    r8 = '&';
                    throw new java.lang.IllegalStateException();
                }
                case 52: {
                    e = $ex6;
                    throw new abcd.jD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidURL, new java.lang.Object[]{this.Zo}), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String aM() {
        java.lang.Package r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = abcd.xJ.class.getPackage();
                    if (r0 != null) { $pc7 = 5; continue $sw7; }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    r1 = "unknown";
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    return "JGit/" + r1;
                }
                case 5: {
                    if (r0.getImplementationVersion() == null) { $pc7 = 7; continue $sw7; }
                    r1 = r0.getImplementationVersion();
                    { $pc7 = 9; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.InterfacenI j6(java.io.InputStream r8) {
        abcd.xJ.c r0 = null;
        java.io.BufferedReader r9 = null;
        java.util.Map<java.lang.String, abcd.ME> r1 = null;
        java.net.HttpURLConnection r2 = null;
        int r3 = 0;
        java.io.BufferedReader r4 = null;
        java.lang.String r5 = null;
        abcd.BE.c r6 = null;
        java.lang.String r7 = null;
        abcd.ME r10 = null;
        abcd.kF r11 = null;
        abcd.OJ r12 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new abcd.xJ.c(this, this.er);
                    r9 = DW(r8);
                    try {
                        r1 = r0.j6(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 32; continue $sw8;
                    }
                    r9.close();
                    if (r1.containsKey("HEAD") == true) { $pc8 = 30; continue $sw8; }
                    r2 = j6(new java.net.URL(this.rN, "HEAD"));
                    r3 = abcd.AK.j6(r2);
                    if (r3 != 200) { $pc8 = 9; continue $sw8; }
                    r4 = DW(j6(r2));
                    try {
                        r5 = r4.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    if (r5 != null) { $pc8 = 17; continue $sw8; }
                    $pc8 = 22; continue $sw8;
                }
                case 22: {
                    if (r5 != null) { $pc8 = 24; continue $sw8; }
                    $pc8 = 26; continue $sw8;
                }
                case 26: {
                    r4.close();
                    { $pc8 = 30; continue $sw8; }
                }
                case 24: {
                    if (abcd.yE.DW(r5) == false) { $pc8 = 26; continue $sw8; }
                    try {
                        r6 = new abcd.BE.c(abcd.ME.a.v5, "HEAD", abcd.yE.j6(r5));
                        r1.put(r6.getName(), r6);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    { $pc8 = 26; continue $sw8; }
                }
                case 17: {
                    if (r5.startsWith("ref: ") == false) { $pc8 = 22; continue $sw8; }
                    try {
                        r7 = r5.substring(5);
                        r10 = r1.get(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    if (r10 != null) { $pc8 = 21; continue $sw8; }
                    try {
                        r10 = new abcd.BE.c(abcd.ME.a.j6, r7, null);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    $pc8 = 21; continue $sw8;
                }
                case 21: {
                    try {
                        r11 = new abcd.kF("HEAD", r10);
                        r1.put(r11.getName(), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 27; continue $sw8;
                    }
                    $pc8 = 9; continue $sw8;
                }
                case 27: {
                    th = $ex8;
                    r4.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 9: {
                    if (r3 == 404) { $pc8 = 30; continue $sw8; }
                    throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotReadHEAD, new java.lang.Object[]{java.lang.Integer.valueOf(r3), r2.getResponseMessage()}));
                }
                case 30: {
                    r12 = new abcd.OJ(this, r0);
                    r12.j6(r1);
                    return r12;
                }
                case 32: {
                    th = $ex8;
                    r9.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.xJ.b j6(abcd.xJ r0) {
        return r0.yS;
    }

    private void j6(java.io.InputStream r9, java.lang.String r10) {
        byte[] r0 = null;
        abcd.DI r1 = null;
        java.lang.String r11 = null;
        java.lang.String r12 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = new byte[5];
                    abcd.BK.j6(r9, r0, 0, r0.length);
                    if (r0[4] != 35) { $pc9 = 12; continue $sw9; }
                    r1 = new abcd.DI(new abcd.cL(new java.io.InputStream[]{new java.io.ByteArrayInputStream(r0), r9}));
                    r11 = "# service=" + r10;
                    r12 = r1.DW();
                    if (r11.equals(r12) == false) { $pc9 = 10; continue $sw9; }
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (r1.DW() != abcd.DI.j6) { $pc9 = 7; continue $sw9; }
                    return;
                }
                case 10: {
                    throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedGot, new java.lang.Object[]{r11, r12}));
                }
                case 12: {
                    throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedPktLineWithService, new java.lang.Object[]{abcd.IK.j6(r0)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.net.URLConnection r5) {
        javax.net.ssl.TrustManager[] r0 = null;
        javax.net.ssl.SSLContext r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = new javax.net.ssl.TrustManager[]{new abcd.xJ.a(null)};
                    try {
                        r1 = javax.net.ssl.SSLContext.getInstance("SSL");
                        r1.init(null, r0, null);
                        ((javax.net.ssl.HttpsURLConnection) r5).setSSLSocketFactory(r1.getSocketFactory());
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc10 = 5; continue $sw10; }
                        if ($t instanceof java.security.KeyManagementException) { $pc10 = 8; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 8: {
                    e = $ex10;
                    throw new java.io.IOException(e.getMessage());
                }
                case 5: {
                    e = $ex10;
                    throw new java.io.IOException(e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(java.net.HttpURLConnection r3, java.lang.String r4) {
        return ("application/x-" + r4 + "-advertisement").equals(r3.getContentType());
    }

    @Override
    public void DW() {
    }

    @Override
    public abcd.InterfacenI QX() {
        java.net.HttpURLConnection r1 = null;
        java.io.InputStream r2 = null;
        abcd.xJ.e r0 = null;
        abcd.InterfacenI r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    try {
                        r1 = FH("git-upload-pack");
                        r2 = j6(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        if ($t instanceof abcd.yD) { $pc11 = 17; continue $sw11; }
                        if ($t instanceof abcd.jD) { $pc11 = 19; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 12: {
                    th = $ex11;
                    try {
                        r2.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        if ($t instanceof abcd.yD) { $pc11 = 17; continue $sw11; }
                        if ($t instanceof abcd.jD) { $pc11 = 19; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 5: {
                    if (j6(r1, "git-upload-pack") == false) { $pc11 = 9; continue $sw11; }
                    try {
                        j6(r2, "git-upload-pack");
                        r0 = new abcd.xJ.e(this, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 12; continue $sw11;
                    }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        if ($t instanceof abcd.yD) { $pc11 = 17; continue $sw11; }
                        if ($t instanceof abcd.jD) { $pc11 = 19; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 9: {
                    try {
                        r3 = j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 12; continue $sw11;
                    }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.io.IOException) { $pc11 = 15; continue $sw11; }
                        if ($t instanceof abcd.yD) { $pc11 = 17; continue $sw11; }
                        if ($t instanceof abcd.jD) { $pc11 = 19; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r3;
                }
                case 19: {
                    e = $ex11;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 17: {
                    e = $ex11;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 15: {
                    e = $ex11;
                    throw new abcd.yD(this.Zo, org.eclipse.jgit.JGitText.j6().errorReadingInfoRefs, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.LI XL() {
        java.net.HttpURLConnection r1 = null;
        java.io.InputStream r2 = null;
        abcd.xJ.f r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    try {
                        r1 = FH("git-receive-pack");
                        r2 = j6(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 18; continue $sw12; }
                        if ($t instanceof abcd.yD) { $pc12 = 20; continue $sw12; }
                        if ($t instanceof abcd.jD) { $pc12 = 22; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc12 = 5; continue $sw12;
                }
                case 15: {
                    th = $ex12;
                    try {
                        r2.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 18; continue $sw12; }
                        if ($t instanceof abcd.yD) { $pc12 = 20; continue $sw12; }
                        if ($t instanceof abcd.jD) { $pc12 = 22; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 5: {
                    if (j6(r1, "git-receive-pack") == false) { $pc12 = 10; continue $sw12; }
                    try {
                        j6(r2, "git-receive-pack");
                        r0 = new abcd.xJ.f(this, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 18; continue $sw12; }
                        if ($t instanceof abcd.yD) { $pc12 = 20; continue $sw12; }
                        if ($t instanceof abcd.jD) { $pc12 = 22; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 10: {
                    if (this.BT == true) { $pc12 = 14; continue $sw12; }
                    try {
                        throw new abcd.jD(org.eclipse.jgit.JGitText.j6().smartHTTPPushDisabled);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                }
                case 14: {
                    try {
                        throw new abcd.jD(org.eclipse.jgit.JGitText.j6().remoteDoesNotSupportSmartHTTPPush);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 15; continue $sw12;
                    }
                }
                case 22: {
                    e = $ex12;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 20: {
                    e = $ex12;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 18: {
                    e = $ex12;
                    throw new abcd.yD(this.Zo, org.eclipse.jgit.JGitText.j6().errorReadingInfoRefs, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.io.IOException j6(java.lang.String r4, java.lang.String r5) {
        return new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedReceivedContentType, new java.lang.Object[]{r4, r5}));
    }

    final java.io.InputStream j6(java.net.HttpURLConnection r3) {
        java.io.InputStream r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = r3.getInputStream();
                    if ("gzip".equals(r3.getHeaderField("Content-Encoding")) == false) { $pc13 = 6; continue $sw13; }
                    return new java.util.zip.GZIPInputStream(r0);
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final java.net.HttpURLConnection j6(java.lang.String r3, java.net.URL r4) {
        java.net.HttpURLConnection r0 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = (java.net.HttpURLConnection) r4.openConnection(abcd.AK.j6(this.gW, r4));
                    if (this.yS.DW == false) { $pc14 = 5; continue $sw14; }
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    r0.setRequestMethod(r3);
                    r0.setUseCaches(false);
                    r0.setRequestProperty("Accept-Encoding", "gzip");
                    r0.setRequestProperty("Pragma", "no-cache");
                    r0.setRequestProperty("User-Agent", Mr);
                    r0.setConnectTimeout(gn() * 1000);
                    r0.setReadTimeout(gn() * 1000);
                    this.vy.j6(r0);
                    return r0;
                }
                case 5: {
                    if ("https".equals(r4.getProtocol()) == false) { $pc14 = 7; continue $sw14; }
                    j6(r0);
                    { $pc14 = 7; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final java.net.HttpURLConnection j6(java.net.URL r2) {
        return j6("GET", r2);
    }
}
