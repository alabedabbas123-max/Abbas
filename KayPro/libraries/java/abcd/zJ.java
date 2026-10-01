package abcd;

class zJ extends abcd.AbstractjJ implements abcd.BI {
    static final abcd.DJ Mr = null;
    private final java.io.File U2;

    class a extends abcd.AbstracteI {
        private java.lang.Thread cn;
        private java.lang.Process ro;
        final abcd.zJ sh;

        a(abcd.zJ r3) {
            this.sh = r3;
            super(r3);
            abcd.WK r0 = new abcd.WK();
            j6(r0);
            this.ro = r3.FH(r3.v5());
            this.cn = new abcd.YK(this.ro.getErrorStream(), r0.j6());
            this.cn.start();
            java.io.InputStream r4 = this.ro.getInputStream();
            java.io.OutputStream r1 = this.ro.getOutputStream();
            j6(new java.io.BufferedInputStream(r4), new abcd.XK(r1));
            EQ();
        }

        @Override
        public void close() {
            super.close();
            java.lang.Process r0 = this.ro;
            if (r0 != null) goto L21;
        L10:
            java.lang.Thread r1 = this.cn;
            if (r1 == null) goto L25;
            r1.join();     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L19
        L14:
            th = move-exception;
            this.cn = null;
            throw th;
        L17:
            this.cn = null;
            return;
        L25:
            return;
        L21:
            r0.waitFor();     // Catch: java.lang.Throwable -> L6 java.lang.InterruptedException -> L20
        L6:
            th = move-exception;
            this.ro = null;
            throw th;
        L9:
            this.ro = null;
            goto L10
        }
    }

    class b extends abcd.AbstractC0772gI {
        final abcd.zJ BT;
        private java.lang.Thread gW;
        private java.lang.Process yS;

        b(abcd.zJ r3) {
            this.BT = r3;
            super(r3);
            abcd.WK r0 = new abcd.WK();
            j6(r0);
            this.yS = r3.FH(r3.Hw());
            this.gW = new abcd.YK(this.yS.getErrorStream(), r0.j6());
            this.gW.start();
            java.io.InputStream r4 = this.yS.getInputStream();
            java.io.OutputStream r1 = this.yS.getOutputStream();
            j6(new java.io.BufferedInputStream(r4), new abcd.XK(r1));
            EQ();
        }

        @Override
        public void close() {
            super.close();
            java.lang.Process r0 = this.yS;
            if (r0 != null) goto L21;
        L10:
            java.lang.Thread r1 = this.gW;
            if (r1 == null) goto L25;
            r1.join();     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L19
        L14:
            th = move-exception;
            this.gW = null;
            throw th;
        L17:
            this.gW = null;
            return;
        L25:
            return;
        L21:
            r0.waitFor();     // Catch: java.lang.Throwable -> L6 java.lang.InterruptedException -> L20
        L6:
            th = move-exception;
            this.yS = null;
            throw th;
        L9:
            this.yS = null;
            goto L10
        }
    }

    class c extends abcd.AbstracteI {
        final abcd.zJ cn;
        private java.lang.Thread ro;

        c(abcd.zJ r9) {
            this.cn = r9;
            super(r9);
            abcd.IG r5 = new abcd.IG(abcd.zJ.j6(r9));     // Catch: java.io.IOException -> L10
            java.io.PipedInputStream r10 = new java.io.PipedInputStream();     // Catch: java.io.IOException -> L7
            java.io.PipedOutputStream r4 = new java.io.PipedOutputStream(r10);     // Catch: java.io.IOException -> L7
            abcd.AJ r3 = new abcd.AJ(this);     // Catch: java.io.IOException -> L7
            java.io.OutputStream r6 = new java.io.PipedOutputStream(r3);     // Catch: java.io.IOException -> L7
            this.ro = new abcd.BJ(this, "JGit-Upload-Pack", r3, r4, r5);
            this.ro.start();
            j6(r10, r6);
            EQ();
            return;
        L7:
            e = move-exception;
            r5.j6();
            throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotConnectPipes, e);
        L11:
            throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().notAGitDirectory);
        }

        static abcd.zJ j6(abcd.zJ.c r0) {
            return r0.cn;
        }

        @Override
        public void close() {
            super.close();
            java.lang.Thread r0 = this.ro;
            if (r0 != null) goto L13;
            return;
        L13:
            r0.join();     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L12
        L7:
            th = move-exception;
            this.ro = null;
            throw th;
        L10:
            this.ro = null;
        }
    }

    class d extends abcd.AbstractC0772gI {
        final abcd.zJ gW;
        private java.lang.Thread yS;

        d(abcd.zJ r9) {
            this.gW = r9;
            super(r9);
            abcd.IG r5 = new abcd.IG(abcd.zJ.j6(r9));     // Catch: java.io.IOException -> L10
            java.io.PipedInputStream r10 = new java.io.PipedInputStream();     // Catch: java.io.IOException -> L7
            java.io.PipedOutputStream r4 = new java.io.PipedOutputStream(r10);     // Catch: java.io.IOException -> L7
            java.io.PipedInputStream r3 = new java.io.PipedInputStream();     // Catch: java.io.IOException -> L7
            java.io.OutputStream r6 = new java.io.PipedOutputStream(r3);     // Catch: java.io.IOException -> L7
            this.yS = new abcd.CJ(this, "JGit-Receive-Pack", r3, r4, r5);
            this.yS.start();
            j6(r10, r6);
            EQ();
            return;
        L7:
            e = move-exception;
            r5.j6();
            throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotConnectPipes, e);
        L11:
            throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().notAGitDirectory);
        }

        static abcd.zJ j6(abcd.zJ.d r0) {
            return r0.gW;
        }

        @Override
        public void close() {
            super.close();
            java.lang.Thread r0 = this.yS;
            if (r0 != null) goto L13;
            return;
        L13:
            r0.join();     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L12
        L7:
            th = move-exception;
            this.yS = null;
            throw th;
        L10:
            this.yS = null;
        }
    }

    static {
        Mr = new abcd.C1545yJ();
    }

    zJ(abcd.UE r1, abcd.HJ r2, java.io.File r3) {
        super(r1, r2);
        this.U2 = r3;
    }

    static java.io.File j6(abcd.zJ r0) {
        return r0.U2;
    }

    abcd.IJ DW(abcd.UE r2) {
        return new abcd.IJ(r2);
    }

    @Override
    public void DW() {
    }

    protected java.lang.Process FH(java.lang.String r4) {
        java.lang.ProcessBuilder r5 = this.v5.gn().j6(r4, new java.lang.String[]{"."});     // Catch: java.io.IOException -> L5
        r5.directory(this.U2);     // Catch: java.io.IOException -> L5
        java.util.Map<java.lang.String, java.lang.String> r0 = r5.environment();     // Catch: java.io.IOException -> L5
        r0.remove("GIT_ALTERNATE_OBJECT_DIRECTORIES");     // Catch: java.io.IOException -> L5
        r0.remove("GIT_CONFIG");     // Catch: java.io.IOException -> L5
        r0.remove("GIT_CONFIG_PARAMETERS");     // Catch: java.io.IOException -> L5
        r0.remove("GIT_DIR");     // Catch: java.io.IOException -> L5
        r0.remove("GIT_WORK_TREE");     // Catch: java.io.IOException -> L5
        r0.remove("GIT_GRAFT_FILE");     // Catch: java.io.IOException -> L5
        r0.remove("GIT_INDEX_FILE");     // Catch: java.io.IOException -> L5
        r0.remove("GIT_NO_REPLACE_OBJECTS");     // Catch: java.io.IOException -> L5
        return r5.start();
    L5:
        e = move-exception;
        throw new abcd.yD(this.Zo, e.getMessage(), e);
    }

    @Override
    public abcd.InterfacenI QX() {
        java.lang.String r0 = v5();
        if ("git-upload-pack".equals(r0) == true) goto L10;
        if ("git upload-pack".equals(r0) == true) goto L10;
        return new abcd.zJ.a(this);
    L10:
        return new abcd.zJ.c(this);
    }

    @Override
    public abcd.LI XL() {
        java.lang.String r0 = Hw();
        if ("git-receive-pack".equals(r0) == true) goto L10;
        if ("git receive-pack".equals(r0) == true) goto L10;
        return new abcd.zJ.b(this);
    L10:
        return new abcd.zJ.d(this);
    }

    abcd.SI j6(abcd.UE r2) {
        return new abcd.SI(r2);
    }
}
