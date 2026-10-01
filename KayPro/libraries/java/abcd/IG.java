package abcd;

public class IG extends abcd.UE {
    private final abcd.OE EQ;
    private abcd.LG J0;
    private final abcd.FG gn;
    private final abcd.FG tp;
    private final abcd.FG u7;
    private final abcd.XG we;

    public IG(abcd.bE r7) {
        java.lang.String r8 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r7);
                    this.gn = abcd.QK.FH().j6(null, gn());
                    this.u7 = abcd.QK.FH().DW(this.gn, gn());
                    this.tp = new abcd.FG(this.u7, gn().j6(VH(), "config"), gn());
                    er();
                    yS();
                    rN();
                    this.tp.j6(new abcd.HG(this));
                    this.EQ = new abcd.nH(this);
                    this.we = new abcd.XG(this.tp, r7.VH(), r7.DW(), gn());
                    if (this.we.DW() == false) { $pc0 = 10; continue $sw0; }
                    r8 = Zo().j6("core", null, "repositoryformatversion");
                    if ("0".equals(r8) == true) { $pc0 = 10; continue $sw0; }
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownRepositoryFormat2, new java.lang.Object[]{r8}));
                }
                case 10: {
                    if (QX() == true) { $pc0 = 13; continue $sw0; }
                    this.J0 = abcd.LG.DW(tp());
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public IG(java.io.File r2) {
        abcd.JG r0 = new abcd.JG();
        r0.FH(r2);
        abcd.JG r1 = r0;
        r1.XL();
        this(r1);
    }

    private void er() {
        java.io.IOException r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.gn.gn();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.XC) { $pc1 = 4; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex1;
                    r1 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().systemConfigFileInvalid, new java.lang.Object[]{this.gn.Zo().getAbsolutePath(), e}));
                    r1.initCause(e);
                    throw r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void rN() {
        java.io.IOException r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        this.tp.gn();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof abcd.XC) { $pc2 = 4; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex2;
                    r1 = new java.io.IOException(org.eclipse.jgit.JGitText.j6().unknownRepositoryFormat);
                    r1.initCause(e);
                    throw r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void yS() {
        java.io.IOException r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        this.u7.gn();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof abcd.XC) { $pc3 = 4; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex3;
                    r1 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().userConfigFileInvalid, new java.lang.Object[]{this.u7.Zo().getAbsolutePath(), e}));
                    r1.initCause(e);
                    throw r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.XG EQ() {
        return this.we;
    }

    @Override
    public abcd.AbstractxE EQ() {
        return EQ();
    }

    @Override
    public java.util.Set<abcd.yE> Hw() {
        java.util.HashSet r0 = null;
        abcd.GG.a[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        abcd.GG.a r4 = null;
        abcd.IG r5 = null;
        java.util.Iterator<abcd.ME> r6 = null;
        abcd.ME r7 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.util.HashSet();
                    r1 = this.we.tp();
                    r2 = r1.length;
                    r3 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r3 >= r2) { $pc4 = 4; continue $sw4; }
                    r4 = r1[r3];
                    if ((r4 instanceof abcd.GG.b) == false) { $pc4 = 17; continue $sw4; }
                    r5 = ((abcd.GG.b) r4).DW;
                    r6 = r5.v5().values().iterator();
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    if (r6.hasNext() == false) { $pc4 = 10; continue $sw4; }
                    r7 = r6.next();
                    if (r7.DW() == null) { $pc4 = 15; continue $sw4; }
                    r0.add(r7.DW());
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if (r7.FH() == null) { $pc4 = 9; continue $sw4; }
                    r0.add(r7.FH());
                    { $pc4 = 9; continue $sw4; }
                }
                case 10: {
                    r0.addAll(r5.Hw());
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    r3 = r3 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 4: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void Mr() {
        this.J0 = abcd.LG.DW(tp());
        j6(new abcd.ED());
    }

    @Override
    public abcd.FG Zo() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.gn.VH() == false) { $pc5 = 10; continue $sw5; }
                    try {
                        er();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 6; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 10; continue $sw5;
                }
                case 6: {
                    e = $ex5;
                    throw new java.lang.RuntimeException(e);
                }
                case 10: {
                    if (this.u7.VH() == false) { $pc5 = 17; continue $sw5; }
                    try {
                        yS();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 13; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 17; continue $sw5;
                }
                case 13: {
                    e = $ex5;
                    throw new java.lang.RuntimeException(e);
                }
                case 17: {
                    if (this.tp.VH() == false) { $pc5 = 24; continue $sw5; }
                    try {
                        rN();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 20; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 24; continue $sw5;
                }
                case 20: {
                    e = $ex5;
                    throw new java.lang.RuntimeException(e);
                }
                case 24: {
                    return this.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractjF Zo() {
        return Zo();
    }

    @Override
    public void j6(boolean r8) {
        abcd.FG r0 = null;
        abcd.RE r1 = null;
        java.io.File r2 = null;
        boolean r4 = false;
        boolean r5 = false;
        boolean r3 = false;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = Zo();
                    if (r0.Zo().exists() == true) { $pc6 = 17; continue $sw6; }
                    abcd.zK.DW(VH(), true);
                    this.EQ.DW();
                    this.we.J0();
                    abcd.zK.DW(new java.io.File(VH(), "branches"));
                    abcd.zK.DW(new java.io.File(VH(), "hooks"));
                    r1 = v5("HEAD");
                    r1.DW();
                    r1.DW("refs/heads/master");
                    if (gn().v5() == false) { $pc6 = 10; continue $sw6; }
                    r2 = java.io.File.createTempFile("try", "execute", VH());
                    gn().j6(r2, true);
                    r4 = gn().j6(r2);
                    gn().j6(r2, false);
                    r5 = gn().j6(r2);
                    abcd.zK.j6(r2);
                    if (r4 == false) { $pc6 = 10; continue $sw6; }
                    if (r5 == true) { $pc6 = 10; continue $sw6; }
                    r3 = true;
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    r0.DW("core", null, "repositoryformatversion", 0);
                    r0.DW("core", null, "filemode", r3);
                    if (r8 == false) { $pc6 = 14; continue $sw6; }
                    r0.DW("core", null, "bare", true);
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    r0.DW("core", null, "logallrefupdates", !r8);
                    r0.DW("core", null, "autocrlf", false);
                    r0.v5();
                    return;
                }
                case 10: {
                    r3 = false;
                    { $pc6 = 11; continue $sw6; }
                }
                case 17: {
                    throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().repositoryAlreadyExists, new java.lang.Object[]{VH()}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.OE we() {
        return this.EQ;
    }
}
