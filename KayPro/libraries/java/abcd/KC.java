package abcd;

public class KC {
    private static final abcd.QC[] DW = null;
    private static final byte[] FH = null;
    static final java.util.Comparator<abcd.QC> Hw = null;
    private static final byte[] j6 = null;
    private abcd.LG EQ;
    private byte[] J0;
    private abcd.FD J8;
    private int VH;
    private abcd.QC[] Zo;
    private abcd.TC gn;
    private final abcd.AbstractpK tp;
    private abcd.WG u7;
    private final java.io.File v5;
    private byte[] we;

    static {
        j6 = new byte[]{68, 73, 82, 67};
        DW = new abcd.QC[0];
        FH = new byte[0];
        Hw = new abcd.JC();
    }

    public KC(java.io.File r1, abcd.AbstractpK r2) {
        this.v5 = r1;
        this.tp = r2;
        DW();
    }

    public static abcd.KC DW(java.io.File r1, abcd.AbstractpK r2) {
        abcd.KC r0 = new abcd.KC(r1, r2);
        r0.u7();
        return r0;
    }

    private static boolean DW(byte[] r4) {
        int r0 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.length >= j6.length) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r0 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r1 = j6;
                    if (r0 >= r1.length) { $pc0 = 8; continue $sw0; }
                    if (r4[r0] != r1[r0]) { $pc0 = 12; continue $sw0; }
                    r0 = r0 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 12: {
                    return false;
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.KC gn() {
        return new abcd.KC(null, null);
    }

    static int j6(abcd.QC r1, abcd.QC r2) {
        byte[] r3 = r1.Hw;
        return j6(r3, r3.length, r2);
    }

    static int j6(byte[] r1, int r2, abcd.QC r3) {
        byte[] r4 = r3.Hw;
        return j6(r1, r2, r4, r4.length);
    }

    static int j6(byte[] r3, int r4, byte[] r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 >= r4) { $pc1 = 11; continue $sw1; }
                    if (r0 >= r6) { $pc1 = 11; continue $sw1; }
                    r1 = (r3[r0] & 255) - (r5[r0] & 255);
                    if (r1 != 0) { $pc1 = 8; continue $sw1; }
                    r0 = r0 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 8: {
                    return r1;
                }
                case 11: {
                    return r4 - r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.KC j6(java.io.File r1, abcd.AbstractpK r2) {
        abcd.KC r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.KC(r1, r2);
                    if (r0.VH() == false) { $pc2 = 16; continue $sw2; }
                    try {
                        r0.u7();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Error) { $pc2 = 6; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 9; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 12; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 12: {
                    e = $ex2;
                    r0.tp();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 6: {
                    e = $ex2;
                    r0.tp();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 9: {
                    e = $ex2;
                    r0.tp();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 16: {
                    throw new abcd.dD(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.KC j6(java.io.File r0, abcd.AbstractpK r1, abcd.FD r2) {
        abcd.KC r3 = j6(r0, r1);
        r3.j6(r2);
        return r3;
    }

    private static java.lang.String j6(byte[] r6) {
        return "'" + new java.lang.String(r6, 0, 4, "ISO-8859-1") + "'";
    }

    private void j6(abcd.FD r1) {
        this.J8 = r1;
    }

    private void j6(abcd.WG r5) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.v5 == null) { $pc3 = 9; continue $sw3; }
                    if (r5 == null) { $pc3 = 7; continue $sw3; }
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().dirCacheFileIsNotLocked, new java.lang.Object[]{this.v5.getAbsolutePath()}));
                }
                case 9: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().dirCacheIsNotLocked);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.InputStream r15) {
        java.io.BufferedInputStream r6 = null;
        java.security.MessageDigest r16 = null;
        byte[] r8 = null;
        int r0 = 0;
        boolean r1 = false;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        abcd.EK r5 = null;
        int r7 = 0;
        long r9 = 0L;
        byte[] r10 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r6 = new java.io.BufferedInputStream(r15);
                    r16 = abcd.hE.j6();
                    r8 = new byte[20];
                    abcd.BK.j6(r6, r8, 0, 12);
                    r16.update(r8, 0, 12);
                    if (DW(r8) == false) { $pc4 = 42; continue $sw4; }
                    r0 = abcd.FK.j6(r8, 4);
                    if (r0 != 3) { $pc4 = 7; continue $sw4; }
                    r1 = true;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    this.VH = abcd.FK.j6(r8, 8);
                    if (this.VH < 0) { $pc4 = 38; continue $sw4; }
                    r2 = abcd.QC.j6(r1);
                    r3 = this.VH;
                    r4 = new byte[r2 * r3];
                    this.Zo = new abcd.QC[r3];
                    r5 = new abcd.EK();
                    r7 = 0;
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    if (r7 >= this.VH) { $pc4 = 14; continue $sw4; }
                    this.Zo[r7] = new abcd.QC(r4, r5, r6, r16);
                    r7 = r7 + 1;
                    { $pc4 = 13; continue $sw4; }
                }
                case 14: {
                    this.EQ = abcd.LG.DW(this.v5);
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    r6.mark(21);
                    abcd.BK.j6(r6, r8, 0, 20);
                    if (r6.read() < 0) { $pc4 = 17; continue $sw4; }
                    r6.reset();
                    r16.update(r8, 0, 8);
                    abcd.BK.j6(r6, 8);
                    r9 = abcd.FK.FH(r8, 4);
                    if (abcd.FK.j6(r8, 0) != 1414677829) { $pc4 = 25; continue $sw4; }
                    if (2147483647L < r9) { $pc4 = 35; continue $sw4; }
                    r10 = new byte[(int) r9];
                    abcd.BK.j6(r6, r10, 0, r10.length);
                    r16.update(r10, 0, r10.length);
                    this.gn = new abcd.TC(r10, new abcd.EK(), null);
                    { $pc4 = 15; continue $sw4; }
                }
                case 35: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().DIRCExtensionIsTooLargeAt, new java.lang.Object[]{j6(r8), java.lang.Long.valueOf(r9)}));
                }
                case 25: {
                    if (r8[0] < 65) { $pc4 = 30; continue $sw4; }
                    if (r8[0] > 90) { $pc4 = 30; continue $sw4; }
                    j6(r6, r16, r8, r9);
                    $pc4 = 30; continue $sw4;
                }
                case 30: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().DIRCExtensionNotSupportedByThisVersion, new java.lang.Object[]{j6(r8)}));
                }
                case 17: {
                    this.we = r16.digest();
                    if (java.util.Arrays.equals(this.we, r8) == false) { $pc4 = 21; continue $sw4; }
                    return;
                }
                case 21: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().DIRCChecksumMismatch);
                }
                case 38: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().DIRCHasTooManyEntries);
                }
                case 7: {
                    if (r0 != 2) { $pc4 = 40; continue $sw4; }
                    r1 = false;
                    { $pc4 = 9; continue $sw4; }
                }
                case 40: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownDIRCVersion, new java.lang.Object[]{java.lang.Integer.valueOf(r0)}));
                }
                case 42: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().notADIRCFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.InputStream r5, java.security.MessageDigest r6, byte[] r7, long r8) {
        byte[] r0 = null;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new byte[4096];
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (0 >= r8) { $pc5 = 5; continue $sw5; }
                    r2 = r5.read(r0, 0, (int) java.lang.Math.min(r0.length, r8));
                    if (r2 < 0) { $pc5 = 10; continue $sw5; }
                    r6.update(r0, 0, r2);
                    r8 = r8 - ((long) r2);
                    { $pc5 = 4; continue $sw5; }
                }
                case 10: {
                    throw new java.io.EOFException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().shortReadOfOptionalDIRCExtensionExpectedAnotherBytes, new java.lang.Object[]{j6(r7), java.lang.Long.valueOf(r8)}));
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW(int r3) {
        abcd.QC r0 = null;
        int r4 = 0;
        abcd.QC r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.Zo[r3];
                    r4 = r3 + 1;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r4 >= this.VH) { $pc6 = 8; continue $sw6; }
                    r1 = this.Zo[r4];
                    if (j6(r0, r1) != 0) { $pc6 = 8; continue $sw6; }
                    r4 = r4 + 1;
                    r0 = r1;
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.QC DW(java.lang.String r2) {
        int r3 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r3 = j6(r2);
                    if (r3 >= 0) { $pc7 = 6; continue $sw7; }
                    return null;
                }
                case 6: {
                    return this.Zo[r3];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        this.EQ = null;
        this.Zo = DW;
        this.VH = 0;
        this.gn = null;
        this.we = FH;
    }

    public void EQ() {
        abcd.WG r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.u7;
                    j6(r0);
                    try {
                        j6(new abcd.XK(r0.FH()));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Error) { $pc8 = 5; continue $sw8; }
                        if ($t instanceof java.lang.RuntimeException) { $pc8 = 8; continue $sw8; }
                        if ($t instanceof java.io.IOException) { $pc8 = 11; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    e = $ex8;
                    r0.v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 5: {
                    e = $ex8;
                    r0.v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 8: {
                    e = $ex8;
                    r0.v5();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        abcd.WG r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.u7;
                    j6(r0);
                    this.u7 = null;
                    if (r0.j6() == true) { $pc9 = 6; continue $sw9; }
                    return false;
                }
                case 6: {
                    this.EQ = r0.DW();
                    if (this.J8 != null) { $pc9 = 9; continue $sw9; }
                    return true;
                }
                case 9: {
                    if (java.util.Arrays.equals(this.we, this.J0) == true) { $pc9 = 14; continue $sw9; }
                    this.J8.j6(new abcd.ED());
                    return true;
                }
                case 14: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.PC Hw() {
        return new abcd.PC(this, this.VH + 16);
    }

    public boolean VH() {
        java.io.File r0 = null;
        abcd.WG r1 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc10 = 11; continue $sw10; }
                    r1 = new abcd.WG(r0, this.tp);
                    if (r1.Hw() == false) { $pc10 = 8; continue $sw10; }
                    r1.FH(true);
                    this.u7 = r1;
                    return true;
                }
                case 8: {
                    return false;
                }
                case 11: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().dirCacheDoesNotHaveABackingFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Zo() {
        int r1 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r1 = 0;
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r1 >= this.VH) { $pc11 = 5; continue $sw11; }
                    if (this.Zo[r1].VH() > 0) { $pc11 = 8; continue $sw11; }
                    r1 = r1 + 1;
                    { $pc11 = 4; continue $sw11; }
                }
                case 8: {
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(java.lang.String r2) {
        byte[] r3 = abcd.hE.j6(r2);
        return j6(r3, r3.length);
    }

    int j6(byte[] r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.VH;
                    r1 = 0;
                    $pc12 = 3; continue $sw12;
                }
                case 3: {
                    if (r1 >= r0) { $pc12 = 5; continue $sw12; }
                    r2 = (r1 + r0) >>> 1;
                    r3 = j6(r5, r6, this.Zo[r2]);
                    if (r3 < 0) { $pc12 = 8; continue $sw12; }
                    if (r3 == 0) { $pc12 = 10; continue $sw12; }
                    r1 = r2 + 1;
                    $pc12 = 10; continue $sw12;
                }
                case 10: {
                    if (r2 <= 0) { $pc12 = 15; continue $sw12; }
                    if (j6(r5, r6, this.Zo[r2 - 1]) != 0) { $pc12 = 15; continue $sw12; }
                    r2 = r2 - 1;
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    return r2;
                }
                case 8: {
                    r0 = r2;
                    { $pc12 = 3; continue $sw12; }
                }
                case 5: {
                    return -(r1 + 1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.MC j6() {
        return new abcd.MC(this, this.VH + 16);
    }

    public abcd.QC j6(int r2) {
        return this.Zo[r2];
    }

    public abcd.TC j6(boolean r4) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r4 == false) { $pc13 = 8; continue $sw13; }
                    if (this.gn != null) { $pc13 = 6; continue $sw13; }
                    this.gn = new abcd.TC();
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    this.gn.j6(this.Zo, this.VH, 0, 0);
                    $pc13 = 8; continue $sw13;
                }
                case 8: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE j6(abcd.EE r4) {
        return j6(true).j6(this.Zo, 0, 0, r4);
    }

    void j6(int r2, abcd.QC[] r3, int r4, int r5) {
        java.lang.System.arraycopy(this.Zo, r2, r3, r4, r5);
    }

    void j6(java.io.OutputStream r12) {
        java.security.MessageDigest r0 = null;
        java.security.DigestOutputStream r1 = null;
        int r3 = 0;
        boolean r4 = false;
        byte[] r5 = null;
        byte[] r6 = null;
        int r7 = 0;
        abcd.LG r8 = null;
        int r9 = 0;
        abcd.RK.d r10 = null;
        int r11 = 0;
        int r13 = 0;
        int r14 = 0;
        abcd.QC r15 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = abcd.hE.j6();
                    r1 = new java.security.DigestOutputStream(r12, r0);
                    r3 = 0;
                    r4 = false;
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    if (r3 >= this.VH) { $pc14 = 5; continue $sw14; }
                    r4 = r4 | this.Zo[r3].EQ();
                    r3 = r3 + 1;
                    { $pc14 = 4; continue $sw14; }
                }
                case 5: {
                    r5 = new byte[128];
                    r6 = j6;
                    java.lang.System.arraycopy(r6, 0, r5, 0, r6.length);
                    if (r4 == false) { $pc14 = 8; continue $sw14; }
                    r7 = 3;
                    $pc14 = 9; continue $sw14;
                }
                case 9: {
                    abcd.FK.DW(r5, 4, r7);
                    abcd.FK.DW(r5, 8, this.VH);
                    r1.write(r5, 0, 12);
                    r8 = this.EQ;
                    if (r8 != null) { $pc14 = 16; continue $sw14; }
                    r9 = 0;
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    if (r9 >= this.VH) { $pc14 = 20; continue $sw14; }
                    this.Zo[r9].j6(r1);
                    r9 = r9 + 1;
                    $pc14 = 20; continue $sw14;
                }
                case 20: {
                    if (this.gn == null) { $pc14 = 22; continue $sw14; }
                    r10 = new abcd.RK.d();
                    this.gn.j6(r5, r10);
                    r10.close();
                    abcd.FK.DW(r5, 0, 1414677829);
                    abcd.FK.DW(r5, 4, (int) r10.DW());
                    r1.write(r5, 0, 8);
                    r10.j6(r1, null);
                    $pc14 = 22; continue $sw14;
                }
                case 22: {
                    this.J0 = r0.digest();
                    r12.write(this.J0);
                    r12.close();
                    return;
                }
                case 16: {
                    r11 = (int) (r8.j6() / 1000);
                    r13 = ((int) (this.EQ.j6() % 1000)) * 1000000;
                    r14 = 0;
                    $pc14 = 18; continue $sw14;
                }
                case 18: {
                    if (r14 >= this.VH) { $pc14 = 20; continue $sw14; }
                    r15 = this.Zo[r14];
                    if (r15.j6(r11, r13) == false) { $pc14 = 27; continue $sw14; }
                    r15.Ws();
                    $pc14 = 27; continue $sw14;
                }
                case 27: {
                    r15.j6(r1);
                    r14 = r14 + 1;
                    { $pc14 = 18; continue $sw14; }
                }
                case 8: {
                    r7 = 2;
                    { $pc14 = 9; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.QC[] r1, int r2) {
        this.Zo = r1;
        this.VH = r2;
        this.gn = null;
    }

    public void tp() {
        abcd.WG r0 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.u7;
                    if (r0 == null) { $pc15 = 6; continue $sw15; }
                    this.u7 = null;
                    r0.v5();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void u7() {
        java.io.File r0 = null;
        abcd.LG r1 = null;
        java.io.FileInputStream r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc16 = 22; continue $sw16; }
                    if (r0.exists() == true) { $pc16 = 7; continue $sw16; }
                    DW();
                    return;
                }
                case 7: {
                    r1 = this.EQ;
                    if (r1 != null) { $pc16 = 10; continue $sw16; }
                    $pc16 = 25; continue $sw16;
                }
                case 25: {
                    try {
                        r2 = new java.io.FileInputStream(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc16 = 18; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        DW();
                        j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 15; continue $sw16;
                    }
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.IOException) { $pc16 = 23; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc16 = 19; continue $sw16;
                }
                case 19: {
                    this.EQ = abcd.LG.DW(this.v5);
                    return;
                }
                case 15: {
                    th = $ex16;
                    try {
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.IOException) { $pc16 = 24; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc16 = 17; continue $sw16;
                }
                case 17: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc16 = 18; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 18: {
                    DW();
                    { $pc16 = 19; continue $sw16; }
                }
                case 10: {
                    if (r1.j6(this.v5) == true) { $pc16 = 25; continue $sw16; }
                    return;
                }
                case 22: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().dirCacheDoesNotHaveABackingFile);
                }
                case 23: {
                    $pc16 = 24; continue $sw16;
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int v5() {
        return this.VH;
    }
}
