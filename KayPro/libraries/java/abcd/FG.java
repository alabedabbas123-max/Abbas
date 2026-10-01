package abcd;

public class FG extends abcd.AbstractjF {
    private final abcd.AbstractpK VH;
    private final java.io.File Zo;
    private volatile abcd.LG gn;
    private volatile abcd.yE u7;

    public FG(abcd.gE r1, java.io.File r2, abcd.AbstractpK r3) {
        super(r1);
        this.Zo = r2;
        this.VH = r3;
        this.gn = abcd.LG.j6;
        this.u7 = abcd.yE.Ws();
    }

    public FG(java.io.File r2, abcd.AbstractpK r3) {
        this(null, r2, r3);
    }

    private static abcd.yE j6(byte[] r1) {
        return abcd.yE.j6(abcd.hE.j6().digest(r1));
    }

    @Override
    protected boolean FH() {
        return false;
    }

    public boolean VH() {
        return this.gn.j6(Zo());
    }

    public final java.io.File Zo() {
        return this.Zo;
    }

    public void gn() {
        abcd.LG r0 = null;
        abcd.LG r1 = null;
        byte[] r4 = null;
        abcd.yE r5 = null;
        java.io.IOException r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.gn;
                    r1 = abcd.LG.DW(Zo());
                    try {
                        r4 = abcd.BK.j6(Zo());
                        r5 = j6(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 11; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 14; continue $sw0; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.u7.DW(r5) == true) { $pc0 = 6; continue $sw0; }
                    try {
                        j6(abcd.IK.j6(r4));
                        this.gn = r1;
                        this.u7 = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 11; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 14; continue $sw0; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    return;
                }
                case 6: {
                    if (r0.j6(r1) == false) { $pc0 = 8; continue $sw0; }
                    try {
                        r0.DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 11; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 14; continue $sw0; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 19; continue $sw0; }
                }
                case 8: {
                    try {
                        this.gn = r1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 11; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 14; continue $sw0; }
                        if ($t instanceof java.io.FileNotFoundException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    e = $ex0;
                    throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotReadFile, new java.lang.Object[]{Zo()}), e);
                }
                case 17: {
                    j6();
                    this.gn = r1;
                    return;
                }
                case 14: {
                    e = $ex0;
                    r2 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotReadFile, new java.lang.Object[]{Zo()}));
                    r2.initCause(e);
                    throw r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6() {
        this.u7 = j6(new byte[0]);
        super.j6();
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getClass().getSimpleName()) + "[" + Zo().getPath() + "]";
    }

    @Override
    public void v5() {
        byte[] r0 = null;
        abcd.WG r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = abcd.hE.j6(Hw());
                    r1 = new abcd.WG(Zo(), this.VH);
                    if (r1.Hw() == false) { $pc1 = 15; continue $sw1; }
                    try {
                        r1.DW(true);
                        r1.j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    if (r1.j6() == false) { $pc1 = 10; continue $sw1; }
                    r1.v5();
                    this.gn = r1.DW();
                    this.u7 = j6(r0);
                    DW();
                    return;
                }
                case 10: {
                    try {
                        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotCommitWriteTo, new java.lang.Object[]{Zo()}));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                }
                case 11: {
                    th = $ex1;
                    r1.v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 15: {
                    throw new abcd.dD(Zo());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
