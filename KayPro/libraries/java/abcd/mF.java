package abcd;

public class mF {
    private int DW;
    private abcd.RK.c FH;
    private byte[] j6;

    public mF(int r1) {
        this.j6 = new byte[r1];
    }

    private void DW(byte[] r5, int r6, int r7, abcd.AbstractrE r8) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == null) { $pc0 = 5; continue $sw0; }
                    this.FH = new abcd.RK.c(Integer.MAX_VALUE);
                    this.FH.write(this.j6, 0, this.DW);
                    this.j6 = null;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r8.j6(this.FH);
                    this.FH.write(32);
                    this.FH.write(r5, r6, r7);
                    this.FH.write(0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(abcd.AbstractrE r0, int r1) {
        return ((r0.j6() + r1) + 20) + 2;
    }

    private boolean j6(byte[] r5, int r6, int r7, abcd.AbstractrE r8) {
        byte[] r0 = null;
        byte[] r9 = null;
        int r1 = 0;
        byte[] r10 = null;
        int r11 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6;
                    if (r0 != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    return false;
                }
                case 5: {
                    if (r0.length < (this.DW + j6(r8, r7))) { $pc1 = 9; continue $sw1; }
                    r8.j6(this.j6, this.DW);
                    this.DW += r8.j6();
                    r9 = this.j6;
                    r1 = this.DW;
                    this.DW = r1 + 1;
                    r9[r1] = 32;
                    java.lang.System.arraycopy(r5, r6, r9, this.DW, r7);
                    this.DW += r7;
                    r10 = this.j6;
                    r11 = this.DW;
                    this.DW = r11 + 1;
                    r10[r11] = 0;
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE j6(abcd.EE r5) {
        byte[] r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6;
                    if (r0 == null) { $pc2 = 7; continue $sw2; }
                    return r5.DW(2, r0, 0, this.DW);
                }
                case 7: {
                    return r5.j6(2, this.FH.DW(), this.FH.FH());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r2, int r3, int r4, abcd.AbstractrE r5, abcd.YD r6) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (j6(r2, r3, r4, r5) == false) { $pc3 = 10; continue $sw3; }
                    r6.DW(this.j6, this.DW);
                    this.DW += 20;
                    return;
                }
                case 10: {
                    try {
                        DW(r2, r3, r4, r5);
                        r6.j6(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 7; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 7: {
                    e = $ex3;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r3, int r4, int r5, abcd.AbstractrE r6, byte[] r7, int r8) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (j6(r3, r4, r5, r6) == false) { $pc4 = 10; continue $sw4; }
                    java.lang.System.arraycopy(r7, r8, this.j6, this.DW, 20);
                    this.DW += 20;
                    return;
                }
                case 10: {
                    try {
                        DW(r3, r4, r5, r6);
                        this.FH.write(r7, r8, 20);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 7; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 7: {
                    e = $ex4;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r7, abcd.AbstractrE r8, abcd.YD r9) {
        j6(r7, 0, r7.length, r8, r9);
    }

    public byte[] j6() {
        byte[] r0 = null;
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.j6;
                    if (r0 == null) { $pc5 = 11; continue $sw5; }
                    r1 = this.DW;
                    r2 = new byte[r1];
                    java.lang.System.arraycopy(r0, 0, r2, 0, r1);
                    return r2;
                }
                case 11: {
                    return this.FH.Zo();
                }
                case 8: {
                    e = $ex5;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        byte[] r0 = null;
        abcd.UJ r1 = null;
        java.lang.StringBuilder r2 = null;
        abcd.AbstractrE r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = j6();
                    r1 = new abcd.UJ();
                    r1.j6(r0);
                    r2 = new java.lang.StringBuilder();
                    r2.append("Tree={");
                    if (r1.DW() == true) { $pc6 = 10; continue $sw6; }
                    r2.append('\n');
                    try {
                        new abcd.wE().Hw(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof abcd.YC) { $pc6 = 7; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 10; continue $sw6;
                }
                case 7: {
                    e = $ex6;
                    r2.append("*** ERROR: ");
                    r2.append(e.getMessage());
                    r2.append("\n");
                    r2.append('\n');
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    if (r1.DW() == true) { $pc6 = 11; continue $sw6; }
                    r3 = r1.Hw();
                    r2.append(r3);
                    r2.append(' ');
                    r2.append(abcd.hE.DW(r3.FH()));
                    r2.append(' ');
                    r2.append(r1.v5().we());
                    r2.append(' ');
                    r2.append(r1.Zo());
                    r2.append('\n');
                    r1.J8();
                    { $pc6 = 10; continue $sw6; }
                }
                case 11: {
                    r2.append("}");
                    return r2.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
