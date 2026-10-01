package abcd;

public class bE<B extends abcd.bE, R extends abcd.UE> {
    private java.io.File DW;
    private java.io.File FH;
    private java.util.List<java.io.File> Hw;
    private java.util.List<java.io.File> VH;
    private java.io.File Zo;
    private boolean gn;
    private abcd.AbstractpK j6;
    private abcd.gE tp;
    private boolean u7;
    private java.io.File v5;

    public bE() {
    }

    private java.io.File U2() {
        abcd.gE r0 = null;
        java.lang.String r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = FH();
                    r3 = r0.j6("core", null, "worktree");
                    if (r3 == null) { $pc0 = 7; continue $sw0; }
                    return J8().j6(v5(), r3);
                }
                case 7: {
                    if (r0.j6("core", null, "bare") == null) { $pc0 = 15; continue $sw0; }
                    if (r0.j6("core", "bare", true) == false) { $pc0 = 13; continue $sw0; }
                    QX();
                    return null;
                }
                case 13: {
                    return v5().getParentFile();
                }
                case 15: {
                    if (v5().getName().equals(".git") == true) { $pc0 = 17; continue $sw0; }
                    QX();
                    return null;
                }
                case 17: {
                    return v5().getParentFile();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(byte[] r5) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5.length >= 9) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    if (r5[0] == 103) { $pc1 = 8; continue $sw1; }
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    return false;
                }
                case 8: {
                    if (r5[1] != 105) { $pc1 = 22; continue $sw1; }
                    if (r5[2] != 116) { $pc1 = 22; continue $sw1; }
                    if (r5[3] != 100) { $pc1 = 22; continue $sw1; }
                    if (r5[4] != 105) { $pc1 = 22; continue $sw1; }
                    if (r5[5] != 114) { $pc1 = 22; continue $sw1; }
                    if (r5[6] != 58) { $pc1 = 22; continue $sw1; }
                    if (r5[7] != 32) { $pc1 = 22; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B DW(java.io.File r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != null) { $pc2 = 4; continue $sw2; }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    Ws();
                    return this;
                }
                case 4: {
                    if (this.VH != null) { $pc2 = 6; continue $sw2; }
                    this.VH = new java.util.LinkedList();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    this.VH.add(r2);
                    { $pc2 = 7; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File[] DW() {
        java.util.List<java.io.File> r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc3 = 7; continue $sw3; }
                    return null;
                }
                case 7: {
                    return (java.io.File[]) r0.toArray(new java.io.File[r0.size()]);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.gE EQ() {
        java.io.File r0 = null;
        abcd.FG r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (v5() == null) { $pc4 = 11; continue $sw4; }
                    r0 = J8().j6(v5(), "config");
                    r1 = new abcd.FG(r0, J8());
                    try {
                        r1.gn();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof abcd.XC) { $pc4 = 7; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r1;
                }
                case 7: {
                    e = $ex4;
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().repositoryConfigFileInvalid, new java.lang.Object[]{r0.getAbsolutePath(), e.getMessage()}));
                }
                case 11: {
                    return new abcd.gE();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B FH(java.io.File r1) {
        this.DW = r1;
        this.tp = null;
        Ws();
        return this;
    }

    protected abcd.gE FH() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.tp != null) { $pc5 = 6; continue $sw5; }
                    this.tp = EQ();
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return this.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B Hw(java.io.File r1) {
        this.v5 = r1;
        Ws();
        return this;
    }

    public abcd.AbstractpK Hw() {
        return this.j6;
    }

    protected void J0() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (v5() == null) { $pc6 = 5; continue $sw6; }
                    return;
                }
                case 5: {
                    if (gn() == null) { $pc6 = 8; continue $sw6; }
                    return;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().eitherGitDirOrWorkTreeRequired);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.AbstractpK J8() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (Hw() == null) { $pc7 = 6; continue $sw7; }
                    return Hw();
                }
                case 6: {
                    return abcd.AbstractpK.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void Mr() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (Hw() != null) { $pc8 = 6; continue $sw8; }
                    j6(abcd.AbstractpK.j6);
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (u7() == true) { $pc8 = 11; continue $sw8; }
                    if (gn() != null) { $pc8 = 11; continue $sw8; }
                    Zo(U2());
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    if (u7() == false) { $pc8 = 13; continue $sw8; }
                    return;
                }
                case 13: {
                    if (v5() != null) { $pc8 = 16; continue $sw8; }
                    FH(gn().getParentFile());
                    $pc8 = 16; continue $sw8;
                }
                case 16: {
                    if (Zo() != null) { $pc8 = 20; continue $sw8; }
                    Hw(new java.io.File(v5(), "index"));
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B QX() {
        Hw(null);
        Zo(null);
        this.gn = true;
        Ws();
        return this;
    }

    public java.io.File VH() {
        return this.FH;
    }

    protected final B Ws() {
        return this;
    }

    public B XL() {
        J0();
        aM();
        Mr();
        j3();
        Ws();
        return this;
    }

    public B Zo(java.io.File r1) {
        this.Zo = r1;
        Ws();
        return this;
    }

    public java.io.File Zo() {
        return this.v5;
    }

    protected void aM() {
        java.io.File r0 = null;
        byte[] r1 = null;
        int r5 = 0;
        java.lang.String r2 = null;
        java.io.File r3 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (v5() == null) { $pc9 = 5; continue $sw9; }
                    return;
                }
                case 5: {
                    if (gn() == null) { $pc9 = 24; continue $sw9; }
                    r0 = new java.io.File(gn(), ".git");
                    if (r0.isFile() == true) { $pc9 = 9; continue $sw9; }
                    FH(r0);
                    return;
                }
                case 9: {
                    r1 = abcd.BK.j6(r0);
                    if (j6(r1) == false) { $pc9 = 22; continue $sw9; }
                    r5 = abcd.IK.Zo(r1, 8);
                    if (r1[r5 - 1] != 10) { $pc9 = 14; continue $sw9; }
                    r5 = r5 - 1;
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    if (r5 == 8) { $pc9 = 20; continue $sw9; }
                    r2 = abcd.IK.j6(r1, 8, r5);
                    r3 = new java.io.File(r2);
                    if (r3.isAbsolute() == false) { $pc9 = 18; continue $sw9; }
                    FH(r3);
                    return;
                }
                case 18: {
                    FH(new java.io.File(gn(), r2).getCanonicalFile());
                    return;
                }
                case 20: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidGitdirRef, new java.lang.Object[]{r0.getAbsolutePath()}));
                }
                case 22: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidGitdirRef, new java.lang.Object[]{r0.getAbsolutePath()}));
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File gn() {
        return this.Zo;
    }

    protected void j3() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (VH() == null) { $pc10 = 5; continue $sw10; }
                    return;
                }
                case 5: {
                    if (v5() == null) { $pc10 = 9; continue $sw10; }
                    v5(J8().j6(v5(), "objects"));
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public R j6() {
        abcd.IG r0 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    XL();
                    r0 = new abcd.IG(this);
                    if (tp() == true) { $pc11 = 5; continue $sw11; }
                    $pc11 = 9; continue $sw11;
                }
                case 9: {
                    return r0;
                }
                case 5: {
                    if (r0.EQ().DW() == true) { $pc11 = 9; continue $sw11; }
                    throw new abcd.pD(v5());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B j6(abcd.QK r7) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        int r2 = 0;
        java.lang.String r3 = null;
        java.lang.String[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.lang.String r8 = null;
        java.lang.String r9 = null;
        java.lang.String r10 = null;
        java.lang.String[] r11 = null;
        int r12 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (v5() != null) { $pc12 = 8; continue $sw12; }
                    r0 = r7.DW("GIT_DIR");
                    if (r0 == null) { $pc12 = 8; continue $sw12; }
                    FH(new java.io.File(r0));
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    if (VH() != null) { $pc12 = 12; continue $sw12; }
                    r1 = r7.DW("GIT_OBJECT_DIRECTORY");
                    if (r1 == null) { $pc12 = 12; continue $sw12; }
                    v5(new java.io.File(r1));
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    r2 = 0;
                    if (DW() != null) { $pc12 = 21; continue $sw12; }
                    r3 = r7.DW("GIT_ALTERNATE_OBJECT_DIRECTORIES");
                    if (r3 == null) { $pc12 = 21; continue $sw12; }
                    r4 = r3.split(java.io.File.pathSeparator);
                    r5 = r4.length;
                    r6 = 0;
                    $pc12 = 17; continue $sw12;
                }
                case 17: {
                    if (r6 >= r5) { $pc12 = 21; continue $sw12; }
                    j6(new java.io.File(r4[r6]));
                    r6 = r6 + 1;
                    $pc12 = 21; continue $sw12;
                }
                case 21: {
                    if (gn() != null) { $pc12 = 26; continue $sw12; }
                    r8 = r7.DW("GIT_WORK_TREE");
                    if (r8 == null) { $pc12 = 26; continue $sw12; }
                    Zo(new java.io.File(r8));
                    $pc12 = 26; continue $sw12;
                }
                case 26: {
                    if (Zo() != null) { $pc12 = 31; continue $sw12; }
                    r9 = r7.DW("GIT_INDEX_FILE");
                    if (r9 == null) { $pc12 = 31; continue $sw12; }
                    Hw(new java.io.File(r9));
                    $pc12 = 31; continue $sw12;
                }
                case 31: {
                    if (this.VH != null) { $pc12 = 38; continue $sw12; }
                    r10 = r7.DW("GIT_CEILING_DIRECTORIES");
                    if (r10 == null) { $pc12 = 38; continue $sw12; }
                    r11 = r10.split(java.io.File.pathSeparator);
                    r12 = r11.length;
                    $pc12 = 35; continue $sw12;
                }
                case 35: {
                    if (r2 >= r12) { $pc12 = 38; continue $sw12; }
                    DW(new java.io.File(r11[r2]));
                    r2 = r2 + 1;
                    $pc12 = 38; continue $sw12;
                }
                case 38: {
                    Ws();
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B j6(abcd.AbstractpK r1) {
        this.j6 = r1;
        Ws();
        return this;
    }

    public B j6(java.io.File r2) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r2 != null) { $pc13 = 4; continue $sw13; }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    Ws();
                    return this;
                }
                case 4: {
                    if (this.Hw != null) { $pc13 = 6; continue $sw13; }
                    this.Hw = new java.util.LinkedList();
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    this.Hw.add(r2);
                    { $pc13 = 7; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public B j6(boolean r1) {
        this.u7 = r1;
        Ws();
        return this;
    }

    public boolean tp() {
        return this.u7;
    }

    public boolean u7() {
        return this.gn;
    }

    public B v5(java.io.File r1) {
        this.FH = r1;
        Ws();
        return this;
    }

    public java.io.File v5() {
        return this.DW;
    }

    public B we() {
        j6(abcd.QK.FH());
        return this;
    }
}
