package abcd;

public class Dw<SESS_T extends abcd.Zw> {
    public static final java.lang.String j6 = null;
    protected final SESS_T DW;

    public static class a implements java.io.Serializable {
        public final java.lang.String DW;
        public final long FH;
        public final long Hw;
        public final java.lang.String VH;
        public final long Zo;
        public final java.lang.String j6;
        public final long v5;

        protected a(java.util.Map<java.lang.String, java.lang.Object> r3) {
            this.j6 = (java.lang.String) r3.get("country");
            this.DW = (java.lang.String) r3.get("display_name");
            this.Zo = abcd.Dw.DW(r3, "uid");
            this.VH = (java.lang.String) r3.get("referral_link");
            java.util.Map r4 = (java.util.Map) r3.get("quota_info");
            this.FH = abcd.Dw.DW(r4, "quota");
            this.Hw = abcd.Dw.DW(r4, "normal");
            this.v5 = abcd.Dw.DW(r4, "shared");
        }
    }

    protected static final class b implements abcd.Dw.g {
        private final abcd.Zw DW;
        private final org.apache.http.client.methods.HttpUriRequest j6;

        public b(org.apache.http.client.methods.HttpUriRequest r1, abcd.Zw r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        @Override
        public abcd.Dw.e j6() {
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        return new abcd.Dw.e((java.util.Map) abcd.Gw.j6(abcd.Gw.j6(this.DW, this.j6, 180000)));
                    }
                    case 5: {
                        e = $ex0;
                        if (this.j6.isAborted() == true) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 9: {
                        throw new abcd.Mw(-1);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public static final class c {
        private long DW;
        private java.lang.String FH;
        private abcd.Dw.e Hw;
        private java.lang.String j6;

        private c(org.apache.http.HttpResponse r6) {
            abcd.Dw.e r0 = null;
            org.apache.http.Header r7 = null;
            java.lang.String r8 = null;
            java.lang.String[] r9 = null;
            java.lang.String[] r10 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.j6 = null;
                        this.DW = -1;
                        this.FH = null;
                        this.Hw = null;
                        this.Hw = j6(r6);
                        r0 = this.Hw;
                        if (r0 == null) { $pc1 = 22; continue $sw1; }
                        this.DW = j6(r6, r0);
                        if (this.DW == (-1)) { $pc1 = 20; continue $sw1; }
                        r7 = r6.getFirstHeader("Content-Type");
                        if (r7 == null) { $pc1 = 23; continue $sw1; }
                        r8 = r7.getValue();
                        if (r8 == null) { $pc1 = 24; continue $sw1; }
                        r9 = r8.split(";");
                        if (r9.length <= 0) { $pc1 = 14; continue $sw1; }
                        this.j6 = r9[0].trim();
                        $pc1 = 14; continue $sw1;
                    }
                    case 14: {
                        if (r9.length <= 1) { $pc1 = 25; continue $sw1; }
                        r10 = r9[1].split("=");
                        if (r10.length <= 1) { $pc1 = 26; continue $sw1; }
                        this.FH = r10[1].trim();
                        return;
                    }
                    case 26: {
                        return;
                    }
                    case 25: {
                        return;
                    }
                    case 24: {
                        return;
                    }
                    case 23: {
                        return;
                    }
                    case 20: {
                        throw new abcd.Lw("Error determining file size.");
                    }
                    case 22: {
                        throw new abcd.Lw("Error parsing metadata.");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        c(org.apache.http.HttpResponse r1, abcd.Cw r2) {
            this(r1);
        }

        private static long j6(org.apache.http.HttpResponse r4, abcd.Dw.e r5) {
            long r0 = 0L;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = r4.getEntity().getContentLength();
                        if (r0 < 0) { $pc2 = 5; continue $sw2; }
                        return r0;
                    }
                    case 5: {
                        if (r5 != null) { $pc2 = 7; continue $sw2; }
                        return -1;
                    }
                    case 7: {
                        return r5.DW;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static abcd.Dw.e j6(org.apache.http.HttpResponse r2) {
            org.apache.http.Header r3 = null;
            java.lang.Object r4 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (r2 != null) { $pc3 = 5; continue $sw3; }
                        return null;
                    }
                    case 5: {
                        r3 = r2.getFirstHeader("X-Dropbox-Metadata");
                        if (r3 != null) { $pc3 = 8; continue $sw3; }
                        return null;
                    }
                    case 8: {
                        r4 = abcd.hL.DW(r3.getValue());
                        if (r4 != null) { $pc3 = 12; continue $sw3; }
                        return null;
                    }
                    case 12: {
                        return new abcd.Dw.e((java.util.Map) r4);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public static class d extends java.io.FilterInputStream {
        private final abcd.Dw.c DW;
        private final org.apache.http.client.methods.HttpUriRequest j6;

        public d(org.apache.http.client.methods.HttpUriRequest r3, org.apache.http.HttpResponse r4) {
            org.apache.http.HttpEntity r1 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        super(null);
                        r1 = r4.getEntity();
                        if (r1 == null) { $pc4 = 11; continue $sw4; }
                        try {
                            ((java.io.FilterInputStream) this).in = r1.getContent();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            if ($t instanceof java.io.IOException) { $pc4 = 7; continue $sw4; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        this.j6 = r3;
                        this.DW = new abcd.Dw.c(r4, null);
                        return;
                    }
                    case 7: {
                        e = $ex4;
                        throw new abcd.Kw(e);
                    }
                    case 11: {
                        throw new abcd.Jw("Didn't get entity from HttpResponse");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void close() {
            this.j6.abort();
        }
    }

    public static class e {
        public static final Rw<abcd.Dw.e> j6 = null;
        public long DW;
        public java.lang.String EQ;
        public java.lang.String FH;
        public java.lang.String Hw;
        public boolean J0;
        public boolean J8;
        public java.lang.String VH;
        public java.util.List<abcd.Dw.e> Ws;
        public java.lang.String Zo;
        public java.lang.String gn;
        public java.lang.String tp;
        public java.lang.String u7;
        public boolean v5;
        public java.lang.String we;

        static {
            j6 = new abcd.Ew();
        }

        public e() {
        }

        public e(java.util.Map<java.lang.String, java.lang.Object> r4) {
            java.lang.Object r5 = null;
            java.util.Iterator r6 = null;
            java.lang.Object r0 = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        this.DW = abcd.Dw.DW(r4, "bytes");
                        this.FH = (java.lang.String) r4.get("hash");
                        this.Hw = (java.lang.String) r4.get("icon");
                        this.v5 = abcd.Dw.j6(r4, "is_dir");
                        this.Zo = (java.lang.String) r4.get("modified");
                        this.VH = (java.lang.String) r4.get("client_mtime");
                        this.gn = (java.lang.String) r4.get("path");
                        this.u7 = (java.lang.String) r4.get("root");
                        this.tp = (java.lang.String) r4.get("size");
                        this.EQ = (java.lang.String) r4.get("mime_type");
                        this.we = (java.lang.String) r4.get("rev");
                        this.J0 = abcd.Dw.j6(r4, "thumb_exists");
                        this.J8 = abcd.Dw.j6(r4, "is_deleted");
                        r5 = r4.get("contents");
                        if (r5 != null) { $pc5 = 5; continue $sw5; }
                        $pc5 = 12; continue $sw5;
                    }
                    case 12: {
                        this.Ws = null;
                        return;
                    }
                    case 5: {
                        if ((r5 instanceof abcd.dL) == false) { $pc5 = 12; continue $sw5; }
                        this.Ws = new java.util.ArrayList();
                        r6 = ((abcd.dL) r5).iterator();
                        $pc5 = 8; continue $sw5;
                    }
                    case 8: {
                        if (r6.hasNext() == false) { $pc5 = 19; continue $sw5; }
                        r0 = r6.next();
                        if ((r0 instanceof java.util.Map) == false) { $pc5 = 8; continue $sw5; }
                        this.Ws.add(new abcd.Dw.e((java.util.Map) r0));
                        { $pc5 = 8; continue $sw5; }
                    }
                    case 19: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String j6() {
            int r0 = this.gn.lastIndexOf(47);
            java.lang.String r1 = this.gn;
            return r1.substring(r0 + 1, r1.length());
        }
    }

    public static final class f {
        public final org.apache.http.HttpResponse DW;
        public final org.apache.http.client.methods.HttpUriRequest j6;

        protected f(org.apache.http.client.methods.HttpUriRequest r1, org.apache.http.HttpResponse r2) {
            this.j6 = r1;
            this.DW = r2;
        }
    }

    public interface g {
        abcd.Dw.e j6();
    }

    static {
        j6 = abcd.Hw.j6();
    }

    public Dw(SESS_T r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2 == null) { $pc6 = 7; continue $sw6; }
                    this.DW = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("Session must not be null.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static long DW(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1) {
        java.lang.Object r2 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r2 = r0.get(r1);
                    if (r2 != null) { $pc7 = 5; continue $sw7; }
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    return 0;
                }
                case 5: {
                    if ((r2 instanceof java.lang.Number) == false) { $pc7 = 8; continue $sw7; }
                    return ((java.lang.Number) r2).longValue();
                }
                case 8: {
                    if ((r2 instanceof java.lang.String) == false) { $pc7 = 10; continue $sw7; }
                    return java.lang.Long.parseLong((java.lang.String) r2, 16);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Dw.g j6(java.lang.String r5, java.io.InputStream r6, long r7, boolean r9, java.lang.String r10, abcd.Fw r11) {
        java.lang.String r8 = null;
        org.apache.http.client.methods.HttpPut r12 = null;
        org.apache.http.entity.InputStreamEntity r13 = null;
        org.apache.http.HttpEntity r14 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r5 == null) { $pc8 = 17; continue $sw8; }
                    if (r5.equals("") == true) { $pc8 = 17; continue $sw8; }
                    DW();
                    if (r5.startsWith("/") == true) { $pc8 = 8; continue $sw8; }
                    r5 = "/" + r5;
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    r8 = "/files_put/" + this.DW.FH() + r5;
                    if (r10 != null) { $pc8 = 11; continue $sw8; }
                    r10 = "";
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    r12 = new org.apache.http.client.methods.HttpPut(abcd.Gw.j6(this.DW.Zo(), 1, r8, new java.lang.String[]{"overwrite", java.lang.String.valueOf(r9), "parent_rev", r10, "locale", this.DW.getLocale().toString()}));
                    this.DW.j6(r12);
                    r13 = new org.apache.http.entity.InputStreamEntity(r6, r7);
                    r13.setContentEncoding("application/octet-stream");
                    r13.setChunked(false);
                    r14 = r13;
                    if (r11 == null) { $pc8 = 14; continue $sw8; }
                    r14 = new abcd.Fw.a(r13, r11);
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    r12.setEntity(r14);
                    return new abcd.Dw.b(r12, this.DW);
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException("path is null or empty.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected static boolean j6(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1) {
        java.lang.Object r2 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r2 = r0.get(r1);
                    if (r2 != null) { $pc9 = 5; continue $sw9; }
                    return false;
                }
                case 5: {
                    if ((r2 instanceof java.lang.Boolean) == true) { $pc9 = 7; continue $sw9; }
                    return false;
                }
                case 7: {
                    return ((java.lang.Boolean) r2).booleanValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Dw.g DW(java.lang.String r9, java.io.InputStream r10, long r11, abcd.Fw r13) {
        return j6(r9, r10, r11, true, null, r13);
    }

    public abcd.Dw.g DW(java.lang.String r9, java.io.InputStream r10, long r11, java.lang.String r13, abcd.Fw r14) {
        return j6(r9, r10, r11, false, r13, r14);
    }

    protected void DW() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.DW.DW() == false) { $pc10 = 6; continue $sw10; }
                    return;
                }
                case 6: {
                    throw new abcd.Qw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(java.lang.String r8) {
        DW();
        abcd.Gw.j6(abcd.Gw.a.DW, this.DW.Hw(), "/fileops/delete", 1, new java.lang.String[]{"root", this.DW.FH().toString(), "path", r8, "locale", this.DW.getLocale().toString()}, this.DW);
    }

    public SESS_T FH() {
        return this.DW;
    }

    public abcd.Dw.a j6() {
        DW();
        return new abcd.Dw.a((java.util.Map) abcd.Gw.j6(abcd.Gw.a.j6, this.DW.Hw(), "/account/info", 1, new java.lang.String[]{"locale", this.DW.getLocale().toString()}, this.DW));
    }

    public abcd.Dw.d j6(java.lang.String r4, java.lang.String r5) {
        org.apache.http.client.methods.HttpGet r6 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    DW();
                    if (r4.startsWith("/") == true) { $pc11 = 5; continue $sw11; }
                    r4 = "/" + r4;
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    r6 = new org.apache.http.client.methods.HttpGet(abcd.Gw.j6(this.DW.Zo(), 1, "/files/" + this.DW.FH() + r4, new java.lang.String[]{"rev", r5, "locale", this.DW.getLocale().toString()}));
                    this.DW.j6(r6);
                    return new abcd.Dw.d(r6, abcd.Gw.j6(this.DW, r6));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Dw.e j6(java.lang.String r8) {
        DW();
        return new abcd.Dw.e((java.util.Map) abcd.Gw.j6(abcd.Gw.a.DW, this.DW.Hw(), "/fileops/create_folder", 1, new java.lang.String[]{"root", this.DW.FH().toString(), "path", r8, "locale", this.DW.getLocale().toString()}, this.DW));
    }

    public abcd.Dw.e j6(java.lang.String r8, int r9, java.lang.String r10, boolean r11, java.lang.String r12) {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    DW();
                    if (r9 > 0) { $pc12 = 6; continue $sw12; }
                    r9 = 25000;
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return new abcd.Dw.e((java.util.Map) abcd.Gw.j6(abcd.Gw.a.j6, this.DW.Hw(), "/metadata/" + this.DW.FH() + r8, 1, new java.lang.String[]{"file_limit", java.lang.String.valueOf(r9), "hash", r10, "list", java.lang.String.valueOf(r11), "rev", r12, "locale", this.DW.getLocale().toString()}, this.DW));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Dw.e j6(java.lang.String r1, java.io.InputStream r2, long r3, abcd.Fw r5) {
        return DW(r1, r2, r3, r5).j6();
    }

    public abcd.Dw.e j6(java.lang.String r1, java.io.InputStream r2, long r3, java.lang.String r5, abcd.Fw r6) {
        return DW(r1, r2, r3, r5, r6).j6();
    }
}
