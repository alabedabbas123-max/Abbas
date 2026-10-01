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
            java.lang.Process r0 = null;
            java.lang.Thread r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        super.close();
                        r0 = this.ro;
                        if (r0 != null) { $pc0 = 21; continue $sw0; }
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        r1 = this.cn;
                        if (r1 == null) { $pc0 = 25; continue $sw0; }
                        try {
                            r1.join();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 19; continue $sw0; }
                            $pc0 = 14; continue $sw0;
                        }
                        $pc0 = 14; continue $sw0;
                    }
                    case 14: {
                        th = $ex0;
                        this.cn = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 17: {
                        this.cn = null;
                        return;
                    }
                    case 25: {
                        return;
                    }
                    case 21: {
                        try {
                            r0.waitFor();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 20; continue $sw0; }
                            $pc0 = 6; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        th = $ex0;
                        this.ro = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 9: {
                        this.ro = null;
                        { $pc0 = 10; continue $sw0; }
                    }
                    case 19: {
                        $pc0 = 20; continue $sw0;
                    }
                    case 20: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Process r0 = null;
            java.lang.Thread r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        super.close();
                        r0 = this.yS;
                        if (r0 != null) { $pc1 = 21; continue $sw1; }
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        r1 = this.gW;
                        if (r1 == null) { $pc1 = 25; continue $sw1; }
                        try {
                            r1.join();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc1 = 19; continue $sw1; }
                            $pc1 = 14; continue $sw1;
                        }
                        $pc1 = 14; continue $sw1;
                    }
                    case 14: {
                        th = $ex1;
                        this.gW = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 17: {
                        this.gW = null;
                        return;
                    }
                    case 25: {
                        return;
                    }
                    case 21: {
                        try {
                            r0.waitFor();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc1 = 20; continue $sw1; }
                            $pc1 = 6; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        th = $ex1;
                        this.yS = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 9: {
                        this.yS = null;
                        { $pc1 = 10; continue $sw1; }
                    }
                    case 19: {
                        $pc1 = 20; continue $sw1;
                    }
                    case 20: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    class c extends abcd.AbstracteI {
        final abcd.zJ cn;
        private java.lang.Thread ro;

        c(abcd.zJ r9) {
            abcd.IG r5 = null;
            java.io.PipedInputStream r10 = null;
            java.io.PipedOutputStream r4 = null;
            abcd.AJ r3 = null;
            java.io.OutputStream r6 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        this.cn = r9;
                        super(r9);
                        try {
                            r5 = new abcd.IG(abcd.zJ.j6(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.io.IOException) { $pc2 = 10; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            r10 = new java.io.PipedInputStream();
                            r4 = new java.io.PipedOutputStream(r10);
                            r3 = new abcd.AJ(this);
                            r6 = new java.io.PipedOutputStream(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.io.IOException) { $pc2 = 7; continue $sw2; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        this.ro = new abcd.BJ(this, "JGit-Upload-Pack", r3, r4, r5);
                        this.ro.start();
                        j6(r10, r6);
                        EQ();
                        return;
                    }
                    case 7: {
                        e = $ex2;
                        r5.j6();
                        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotConnectPipes, e);
                    }
                    case 11: {
                        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().notAGitDirectory);
                    }
                    case 10: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static abcd.zJ j6(abcd.zJ.c r0) {
            return r0.cn;
        }

        @Override
        public void close() {
            java.lang.Thread r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        super.close();
                        r0 = this.ro;
                        if (r0 != null) { $pc3 = 13; continue $sw3; }
                        return;
                    }
                    case 13: {
                        try {
                            r0.join();
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc3 = 12; continue $sw3; }
                            $pc3 = 7; continue $sw3;
                        }
                        $pc3 = 7; continue $sw3;
                    }
                    case 7: {
                        th = $ex3;
                        this.ro = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 10: {
                        this.ro = null;
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    class d extends abcd.AbstractC0772gI {
        final abcd.zJ gW;
        private java.lang.Thread yS;

        d(abcd.zJ r9) {
            abcd.IG r5 = null;
            java.io.PipedInputStream r10 = null;
            java.io.PipedOutputStream r4 = null;
            java.io.PipedInputStream r3 = null;
            java.io.OutputStream r6 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        this.gW = r9;
                        super(r9);
                        try {
                            r5 = new abcd.IG(abcd.zJ.j6(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            if ($t instanceof java.io.IOException) { $pc4 = 10; continue $sw4; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            r10 = new java.io.PipedInputStream();
                            r4 = new java.io.PipedOutputStream(r10);
                            r3 = new java.io.PipedInputStream();
                            r6 = new java.io.PipedOutputStream(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            if ($t instanceof java.io.IOException) { $pc4 = 7; continue $sw4; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        this.yS = new abcd.CJ(this, "JGit-Receive-Pack", r3, r4, r5);
                        this.yS.start();
                        j6(r10, r6);
                        EQ();
                        return;
                    }
                    case 7: {
                        e = $ex4;
                        r5.j6();
                        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().cannotConnectPipes, e);
                    }
                    case 11: {
                        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().notAGitDirectory);
                    }
                    case 10: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static abcd.zJ j6(abcd.zJ.d r0) {
            return r0.gW;
        }

        @Override
        public void close() {
            java.lang.Thread r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        super.close();
                        r0 = this.yS;
                        if (r0 != null) { $pc5 = 13; continue $sw5; }
                        return;
                    }
                    case 13: {
                        try {
                            r0.join();
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc5 = 12; continue $sw5; }
                            $pc5 = 7; continue $sw5;
                        }
                        $pc5 = 7; continue $sw5;
                    }
                    case 7: {
                        th = $ex5;
                        this.yS = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 10: {
                        this.yS = null;
                        $pc5 = 12; continue $sw5;
                    }
                    case 12: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.ProcessBuilder r5 = null;
        java.util.Map<java.lang.String, java.lang.String> r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    try {
                        r5 = this.v5.gn().j6(r4, new java.lang.String[]{"."});
                        r5.directory(this.U2);
                        r0 = r5.environment();
                        r0.remove("GIT_ALTERNATE_OBJECT_DIRECTORIES");
                        r0.remove("GIT_CONFIG");
                        r0.remove("GIT_CONFIG_PARAMETERS");
                        r0.remove("GIT_DIR");
                        r0.remove("GIT_WORK_TREE");
                        r0.remove("GIT_GRAFT_FILE");
                        r0.remove("GIT_INDEX_FILE");
                        r0.remove("GIT_NO_REPLACE_OBJECTS");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 5; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r5.start();
                }
                case 5: {
                    e = $ex6;
                    throw new abcd.yD(this.Zo, e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.InterfacenI QX() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = v5();
                    if ("git-upload-pack".equals(r0) == true) { $pc7 = 10; continue $sw7; }
                    if ("git upload-pack".equals(r0) == true) { $pc7 = 10; continue $sw7; }
                    return new abcd.zJ.a(this);
                }
                case 10: {
                    return new abcd.zJ.c(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.LI XL() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = Hw();
                    if ("git-receive-pack".equals(r0) == true) { $pc8 = 10; continue $sw8; }
                    if ("git receive-pack".equals(r0) == true) { $pc8 = 10; continue $sw8; }
                    return new abcd.zJ.b(this);
                }
                case 10: {
                    return new abcd.zJ.d(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.SI j6(abcd.UE r2) {
        return new abcd.SI(r2);
    }
}
