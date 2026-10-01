package abcd;

public class tJ extends abcd.AbstractC0642dJ implements abcd.BI {
    static final abcd.DJ a8 = null;

    private class a implements abcd.ZI {
        final abcd.tJ j6;

        private a(abcd.tJ r1) {
            this.j6 = r1;
        }

        a(abcd.tJ r1, abcd.tJ.a r2) {
            this(r1);
        }

        @Override
        public void disconnect() {
        }

        @Override
        public java.lang.Process j6(java.lang.String r4, int r5) {
            java.lang.String r6 = null;
            boolean r0 = false;
            java.util.ArrayList r1 = null;
            java.lang.String r7 = null;
            java.lang.ProcessBuilder r8 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r6 = abcd.QK.FH().DW("GIT_SSH");
                        r0 = r6.toLowerCase().contains("plink");
                        r1 = new java.util.ArrayList();
                        r1.add(r6);
                        if (r0 == false) { $pc0 = 8; continue $sw0; }
                        if (r6.toLowerCase().contains("tortoiseplink") == true) { $pc0 = 8; continue $sw0; }
                        r1.add("-batch");
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        if (this.j6.tp().v5() <= 0) { $pc0 = 14; continue $sw0; }
                        if (r0 == false) { $pc0 = 11; continue $sw0; }
                        r7 = "-P";
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        r1.add(r7);
                        r1.add(java.lang.String.valueOf(this.j6.tp().v5()));
                        { $pc0 = 14; continue $sw0; }
                    }
                    case 11: {
                        r7 = "-p";
                        $pc0 = 14; continue $sw0;
                    }
                    case 14: {
                        if (this.j6.tp().gn() == null) { $pc0 = 16; continue $sw0; }
                        r1.add(java.lang.String.valueOf(this.j6.tp().gn()) + "@" + this.j6.tp().j6());
                        $pc0 = 17; continue $sw0;
                    }
                    case 17: {
                        r1.add(r4);
                        r8 = new java.lang.ProcessBuilder(new java.lang.String[0]);
                        r8.command(r1);
                        if (this.j6.v5.VH() == null) { $pc0 = 25; continue $sw0; }
                        r8.environment().put("GIT_DIR", this.j6.v5.VH().getPath());
                        $pc0 = 25; continue $sw0;
                    }
                    case 25: {
                        return r8.start();
                    }
                    case 22: {
                        e = $ex0;
                        throw new abcd.yD(e.getMessage(), e);
                    }
                    case 16: {
                        r1.add(this.j6.tp().j6());
                        { $pc0 = 17; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    class b extends abcd.AbstracteI {
        private abcd.YK cn;
        private final java.lang.Process ro;
        final abcd.tJ sh;

        b(abcd.tJ r5) {
            abcd.WK r0 = null;
            java.lang.String r1 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.sh = r5;
                        super(r5);
                        try {
                            this.ro = r5.aM().j6(r5.FH(r5.v5()), r5.gn());
                            r0 = new abcd.WK();
                            j6(r0);
                            this.cn = new abcd.YK(this.ro.getErrorStream(), r0.j6());
                            this.cn.start();
                            j6(this.ro.getInputStream(), this.ro.getOutputStream());
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 9; continue $sw1; }
                            if ($t instanceof abcd.yD) { $pc1 = 12; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            EQ();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof abcd.hD) { $pc1 = 6; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 6: {
                        e = $ex1;
                        r1 = j6();
                        r5.j6(this.ro.exitValue(), r5.v5(), r1);
                        throw r5.j6(e, r1);
                    }
                    case 12: {
                        e = $ex1;
                        close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 9: {
                        e = $ex1;
                        close();
                        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().remoteHungUpUnexpectedly, e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void close() {
            abcd.YK r0 = null;
            java.lang.Process r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        u7();
                        r0 = this.cn;
                        if (r0 != null) { $pc2 = 16; continue $sw2; }
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        super.close();
                        r1 = this.ro;
                        if (r1 == null) { $pc2 = 18; continue $sw2; }
                        r1.destroy();
                        return;
                    }
                    case 18: {
                        return;
                    }
                    case 16: {
                        try {
                            r0.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc2 = 15; continue $sw2; }
                            $pc2 = 7; continue $sw2;
                        }
                        $pc2 = 7; continue $sw2;
                    }
                    case 7: {
                        th = $ex2;
                        this.cn = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 10: {
                        this.cn = null;
                        { $pc2 = 11; continue $sw2; }
                    }
                    case 15: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    class c extends abcd.AbstractC0772gI {
        final abcd.tJ BT;
        private abcd.YK gW;
        private final java.lang.Process yS;

        c(abcd.tJ r5) {
            abcd.WK r0 = null;
            java.lang.String r1 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        this.BT = r5;
                        super(r5);
                        try {
                            this.yS = r5.aM().j6(r5.FH(r5.Hw()), r5.gn());
                            r0 = new abcd.WK();
                            j6(r0);
                            this.gW = new abcd.YK(this.yS.getErrorStream(), r0.j6());
                            this.gW.start();
                            j6(this.yS.getInputStream(), this.yS.getOutputStream());
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof java.io.IOException) { $pc3 = 9; continue $sw3; }
                            if ($t instanceof abcd.yD) { $pc3 = 12; continue $sw3; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            EQ();
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            if ($t instanceof abcd.hD) { $pc3 = 6; continue $sw3; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return;
                    }
                    case 6: {
                        e = $ex3;
                        r1 = j6();
                        r5.j6(this.yS.exitValue(), r5.Hw(), r1);
                        throw r5.j6(e, r1);
                    }
                    case 12: {
                        e = $ex3;
                        close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 9: {
                        e = $ex3;
                        close();
                        throw new abcd.yD(this.v5, org.eclipse.jgit.JGitText.j6().remoteHungUpUnexpectedly, e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void close() {
            abcd.YK r0 = null;
            java.lang.Process r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        u7();
                        r0 = this.gW;
                        if (r0 != null) { $pc4 = 16; continue $sw4; }
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        super.close();
                        r1 = this.yS;
                        if (r1 == null) { $pc4 = 18; continue $sw4; }
                        r1.destroy();
                        return;
                    }
                    case 18: {
                        return;
                    }
                    case 16: {
                        try {
                            r0.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc4 = 15; continue $sw4; }
                            $pc4 = 7; continue $sw4;
                        }
                        $pc4 = 7; continue $sw4;
                    }
                    case 7: {
                        th = $ex4;
                        this.gW = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 10: {
                        this.gW = null;
                        { $pc4 = 11; continue $sw4; }
                    }
                    case 15: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        a8 = new abcd.C1246rJ();
    }

    tJ(abcd.UE r1, abcd.HJ r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    super(r1, r2);
                    if (j3() == false) { $pc5 = 6; continue $sw5; }
                    j6(new abcd.sJ(this));
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j3() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (abcd.QK.FH().DW("GIT_SSH") == null) { $pc6 = 6; continue $sw6; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.lang.String FH(java.lang.String r4) {
        java.lang.String r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.Zo.Hw();
                    if (this.Zo.VH() == null) { $pc7 = 8; continue $sw7; }
                    if (this.Zo.Hw().startsWith("/~") == false) { $pc7 = 8; continue $sw7; }
                    r0 = this.Zo.Hw().substring(1);
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    return r4 + ' ' + abcd.GK.DW.j6(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.InterfacenI QX() {
        return new abcd.tJ.b(this);
    }

    @Override
    public abcd.LI XL() {
        return new abcd.tJ.c(this);
    }

    abcd.hD j6(abcd.hD r3, java.lang.String r4) {
        java.lang.String r5 = null;
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r4 != null) { $pc8 = 4; continue $sw8; }
                    return r3;
                }
                case 4: {
                    if (r4.length() == 0) { $pc8 = 17; continue $sw8; }
                    r5 = this.Zo.Hw();
                    if (this.Zo.VH() != null) { $pc8 = 9; continue $sw8; }
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("fatal: ");
                    r0.append(abcd.GK.DW.j6(r5));
                    r0.append(": ");
                    if (r4.startsWith(r0.toString()) == false) { $pc8 = 15; continue $sw8; }
                    r4 = r4.substring(r0.length());
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    return new abcd.hD(this.Zo, r4);
                }
                case 9: {
                    if (this.Zo.Hw().startsWith("/~") == false) { $pc8 = 11; continue $sw8; }
                    r5 = this.Zo.Hw().substring(1);
                    { $pc8 = 11; continue $sw8; }
                }
                case 17: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(int r5, java.lang.String r6, java.lang.String r7) {
        java.io.IOException r8 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r5 != 127) { $pc9 = 11; continue $sw9; }
                    r8 = null;
                    if (r7 == null) { $pc9 = 10; continue $sw9; }
                    if (r7.length() <= 0) { $pc9 = 10; continue $sw9; }
                    r8 = new java.io.IOException(r7);
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    throw new abcd.yD(this.Zo, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotExecute, new java.lang.Object[]{FH(r6)}), r8);
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
