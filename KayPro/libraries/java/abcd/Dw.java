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
            return new abcd.Dw.e((java.util.Map) abcd.Gw.j6(abcd.Gw.j6(this.DW, this.j6, 180000)));
        L5:
            e = move-exception;
            if (this.j6.isAborted() == true) goto L9;
            throw e;
        L9:
            throw new abcd.Mw(-1);
        }
    }

    public static final class c {
        private long DW;
        private java.lang.String FH;
        private abcd.Dw.e Hw;
        private java.lang.String j6;

        private c(org.apache.http.HttpResponse r6) {
            this.j6 = null;
            this.DW = -1;
            this.FH = null;
            this.Hw = null;
            this.Hw = j6(r6);
            abcd.Dw.e r0 = this.Hw;
            if (r0 == null) goto L22;
            this.DW = j6(r6, r0);
            if (this.DW == (-1)) goto L20;
            org.apache.http.Header r7 = r6.getFirstHeader("Content-Type");
            if (r7 == null) goto L23;
            java.lang.String r8 = r7.getValue();
            if (r8 == null) goto L24;
            java.lang.String[] r9 = r8.split(";");
            if (r9.length <= 0) goto L14;
            this.j6 = r9[0].trim();
        L14:
            if (r9.length <= 1) goto L25;
            java.lang.String[] r10 = r9[1].split("=");
            if (r10.length <= 1) goto L26;
            this.FH = r10[1].trim();
            return;
        L26:
            return;
        L25:
            return;
        L24:
            return;
        L23:
            return;
        L20:
            throw new abcd.Lw("Error determining file size.");
        L22:
            throw new abcd.Lw("Error parsing metadata.");
        }

        c(org.apache.http.HttpResponse r1, abcd.Cw r2) {
            this(r1);
        }

        private static long j6(org.apache.http.HttpResponse r4, abcd.Dw.e r5) {
            long r0 = r4.getEntity().getContentLength();
            if (r0 < 0) goto L5;
            return r0;
        L5:
            if (r5 != null) goto L7;
            return -1;
        L7:
            return r5.DW;
        }

        private static abcd.Dw.e j6(org.apache.http.HttpResponse r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            org.apache.http.Header r3 = r2.getFirstHeader("X-Dropbox-Metadata");
            if (r3 != null) goto L8;
            return null;
        L8:
            java.lang.Object r4 = abcd.hL.DW(r3.getValue());
            if (r4 != null) goto L12;
            return null;
        L12:
            return new abcd.Dw.e((java.util.Map) r4);
        }
    }

    public static class d extends java.io.FilterInputStream {
        private final abcd.Dw.c DW;
        private final org.apache.http.client.methods.HttpUriRequest j6;

        public d(org.apache.http.client.methods.HttpUriRequest r3, org.apache.http.HttpResponse r4) {
            super(null);
            org.apache.http.HttpEntity r1 = r4.getEntity();
            if (r1 == null) goto L11;
            ((java.io.FilterInputStream) this).in = r1.getContent();     // Catch: java.io.IOException -> L7
            this.j6 = r3;
            this.DW = new abcd.Dw.c(r4, null);
            return;
        L7:
            e = move-exception;
            throw new abcd.Kw(e);
        L11:
            throw new abcd.Jw("Didn't get entity from HttpResponse");
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
            java.lang.Object r5 = r4.get("contents");
            if (r5 != null) goto L5;
        L12:
            this.Ws = null;
            return;
        L5:
            if ((r5 instanceof abcd.dL) == false) goto L12;
            this.Ws = new java.util.ArrayList();
            java.util.Iterator r6 = ((abcd.dL) r5).iterator();
        L8:
            if (r6.hasNext() == false) goto L19;
            java.lang.Object r0 = r6.next();
            if ((r0 instanceof java.util.Map) == false) goto L8;
            this.Ws.add(new abcd.Dw.e((java.util.Map) r0));
            goto L8
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
        if (r2 == null) goto L7;
        this.DW = r2;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("Session must not be null.");
    }

    protected static long DW(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1) {
        java.lang.Object r2 = r0.get(r1);
        if (r2 != null) goto L5;
    L10:
        return 0;
    L5:
        if ((r2 instanceof java.lang.Number) == false) goto L8;
        return ((java.lang.Number) r2).longValue();
    L8:
        if ((r2 instanceof java.lang.String) == false) goto L10;
        return java.lang.Long.parseLong((java.lang.String) r2, 16);
    }

    private abcd.Dw.g j6(java.lang.String r5, java.io.InputStream r6, long r7, boolean r9, java.lang.String r10, abcd.Fw r11) {
        if (r5 == null) goto L17;
        if (r5.equals("") == true) goto L17;
        DW();
        if (r5.startsWith("/") == true) goto L8;
        r5 = "/" + r5;
    L8:
        java.lang.String r8 = "/files_put/" + this.DW.FH() + r5;
        if (r10 != null) goto L11;
        r10 = "";
    L11:
        org.apache.http.client.methods.HttpPut r12 = new org.apache.http.client.methods.HttpPut(abcd.Gw.j6(this.DW.Zo(), 1, r8, new java.lang.String[]{"overwrite", java.lang.String.valueOf(r9), "parent_rev", r10, "locale", this.DW.getLocale().toString()}));
        this.DW.j6(r12);
        org.apache.http.entity.InputStreamEntity r13 = new org.apache.http.entity.InputStreamEntity(r6, r7);
        r13.setContentEncoding("application/octet-stream");
        r13.setChunked(false);
        org.apache.http.HttpEntity r14 = r13;
        if (r11 == null) goto L14;
        r14 = new abcd.Fw.a(r13, r11);
    L14:
        r12.setEntity(r14);
        return new abcd.Dw.b(r12, this.DW);
    L17:
        throw new java.lang.IllegalArgumentException("path is null or empty.");
    }

    protected static boolean j6(java.util.Map<java.lang.String, java.lang.Object> r0, java.lang.String r1) {
        java.lang.Object r2 = r0.get(r1);
        if (r2 != null) goto L5;
        return false;
    L5:
        if ((r2 instanceof java.lang.Boolean) == true) goto L7;
        return false;
    L7:
        return ((java.lang.Boolean) r2).booleanValue();
    }

    public abcd.Dw.g DW(java.lang.String r9, java.io.InputStream r10, long r11, abcd.Fw r13) {
        return j6(r9, r10, r11, true, null, r13);
    }

    public abcd.Dw.g DW(java.lang.String r9, java.io.InputStream r10, long r11, java.lang.String r13, abcd.Fw r14) {
        return j6(r9, r10, r11, false, r13, r14);
    }

    protected void DW() {
        if (this.DW.DW() == false) goto L6;
        return;
    L6:
        throw new abcd.Qw();
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
        DW();
        if (r4.startsWith("/") == true) goto L5;
        r4 = "/" + r4;
    L5:
        org.apache.http.client.methods.HttpGet r6 = new org.apache.http.client.methods.HttpGet(abcd.Gw.j6(this.DW.Zo(), 1, "/files/" + this.DW.FH() + r4, new java.lang.String[]{"rev", r5, "locale", this.DW.getLocale().toString()}));
        this.DW.j6(r6);
        return new abcd.Dw.d(r6, abcd.Gw.j6(this.DW, r6));
    }

    public abcd.Dw.e j6(java.lang.String r8) {
        DW();
        return new abcd.Dw.e((java.util.Map) abcd.Gw.j6(abcd.Gw.a.DW, this.DW.Hw(), "/fileops/create_folder", 1, new java.lang.String[]{"root", this.DW.FH().toString(), "path", r8, "locale", this.DW.getLocale().toString()}, this.DW));
    }

    public abcd.Dw.e j6(java.lang.String r8, int r9, java.lang.String r10, boolean r11, java.lang.String r12) {
        DW();
        if (r9 > 0) goto L6;
        r9 = 25000;
    L6:
        return new abcd.Dw.e((java.util.Map) abcd.Gw.j6(abcd.Gw.a.j6, this.DW.Hw(), "/metadata/" + this.DW.FH() + r8, 1, new java.lang.String[]{"file_limit", java.lang.String.valueOf(r9), "hash", r10, "list", java.lang.String.valueOf(r11), "rev", r12, "locale", this.DW.getLocale().toString()}, this.DW));
    }

    public abcd.Dw.e j6(java.lang.String r1, java.io.InputStream r2, long r3, abcd.Fw r5) {
        return DW(r1, r2, r3, r5).j6();
    }

    public abcd.Dw.e j6(java.lang.String r1, java.io.InputStream r2, long r3, java.lang.String r5, abcd.Fw r6) {
        return DW(r1, r2, r3, r5, r6).j6();
    }
}
