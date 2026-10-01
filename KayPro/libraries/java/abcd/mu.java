package abcd;

public final class mu {
    private final int DW;
    private final java.lang.StringBuffer FH;
    private final java.lang.StringBuffer Hw;
    private final abcd.Zt Zo;
    private final java.io.Writer j6;
    private final abcd.Zt v5;

    public mu(java.io.Writer r4, int r5, int r6, java.lang.String r7) {
        java.io.StringWriter r0 = null;
        java.io.StringWriter r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 == null) { $pc0 = 17; continue $sw0; }
                    if (r5 < 1) { $pc0 = 15; continue $sw0; }
                    if (r6 < 1) { $pc0 = 13; continue $sw0; }
                    if (r7 == null) { $pc0 = 11; continue $sw0; }
                    r0 = new java.io.StringWriter(1000);
                    r2 = new java.io.StringWriter(1000);
                    this.j6 = r4;
                    this.DW = r5;
                    this.FH = r0.getBuffer();
                    this.Hw = r2.getBuffer();
                    this.v5 = new abcd.Zt(r0, r5);
                    this.Zo = new abcd.Zt(r2, r6, r7);
                    return;
                }
                case 11: {
                    throw new java.lang.NullPointerException("spacer == null");
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException("rightWidth < 1");
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("leftWidth < 1");
                }
                case 17: {
                    throw new java.lang.NullPointerException("out == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    j6(this.FH, this.v5);
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (this.FH.length() == 0) { $pc1 = 6; continue $sw1; }
                    this.Zo.write(10);
                    Zo();
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 2;
        $sw2: while (true) {
            switch ($pc2) {
                case 2: {
                    r0 = this.FH.indexOf("\n");
                    if (r0 < 0) { $pc2 = 4; continue $sw2; }
                    r1 = this.Hw.indexOf("\n");
                    if (r1 < 0) { $pc2 = 7; continue $sw2; }
                    if (r0 == 0) { $pc2 = 11; continue $sw2; }
                    this.j6.write(this.FH.substring(0, r0));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    if (r1 == 0) { $pc2 = 13; continue $sw2; }
                    j6(this.j6, this.DW - r0);
                    this.j6.write(this.Hw.substring(0, r1));
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    this.j6.write(10);
                    this.FH.delete(0, r0 + 1);
                    this.Hw.delete(0, r1 + 1);
                    { $pc2 = 2; continue $sw2; }
                }
                case 7: {
                    return;
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, int r7) {
        java.io.StringWriter r2 = null;
        abcd.mu r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r2 = new java.io.StringWriter((r3.length() + r6.length()) * 3);
                    r0 = new abcd.mu(r2, r4, r7, r5);
                    try {
                        r0.DW().write(r3);
                        r0.FH().write(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 6; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0.j6();
                    return r2.toString();
                }
                case 6: {
                    e = $ex3;
                    throw new java.lang.RuntimeException("shouldn't happen", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.io.Writer r1, int r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = 2;
        $sw4: while (true) {
            switch ($pc4) {
                case 2: {
                    if (r2 <= 0) { $pc4 = 4; continue $sw4; }
                    r1.write(32);
                    r2 = r2 - 1;
                    { $pc4 = 2; continue $sw4; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.lang.StringBuffer r1, java.io.Writer r2) {
        int r0 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r1.length();
                    if (r0 != 0) { $pc5 = 5; continue $sw5; }
                    return;
                }
                case 5: {
                    if (r1.charAt(r0 - 1) == '\n') { $pc5 = 9; continue $sw5; }
                    r2.write(10);
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    j6(this.Hw, this.Zo);
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (this.Hw.length() == 0) { $pc6 = 6; continue $sw6; }
                    this.v5.write(10);
                    Zo();
                    { $pc6 = 4; continue $sw6; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.Writer DW() {
        return this.v5;
    }

    public java.io.Writer FH() {
        return this.Zo;
    }

    public void j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    try {
                        j6(this.FH, this.v5);
                        j6(this.Hw, this.Zo);
                        Zo();
                        Hw();
                        v5();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 4; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex7;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
