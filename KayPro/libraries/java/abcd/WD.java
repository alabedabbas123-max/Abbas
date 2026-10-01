package abcd;

public final class WD implements java.io.Serializable {
    final int DW;
    final int FH;
    final int Hw;
    final int Zo;
    final int j6;
    final int v5;

    WD(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
    }

    private static final abcd.WD DW(byte[] r8, int r9, int r10) {
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r1 = r10 - r9;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 4; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new abcd.WD(r1, FH(r8, r9, r10), FH(r8, r9 + 8, r10), FH(r8, r9 + 16, r10), FH(r8, r9 + 24, r10), FH(r8, r9 + 32, r10));
                }
                case 5: {
                    throw new abcd.aD(r8, r9, r10 - r9);
                }
                case 4: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final boolean DW(java.lang.String r3) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3.length() >= 2) { $pc1 = 5; continue $sw1; }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    return false;
                }
                case 5: {
                    if (40 < r3.length()) { $pc1 = 14; continue $sw1; }
                    r0 = 0;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r0 >= r3.length()) { $pc1 = 10; continue $sw1; }
                    try {
                        abcd.IK.j6((byte) r3.charAt(r0));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = r0 + 1;
                    { $pc1 = 16; continue $sw1; }
                }
                case 10: {
                    return true;
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static final int FH(byte[] r4, int r5, int r6) {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (8 <= (r6 - r5)) { $pc2 = 5; continue $sw2; }
                    r0 = 0;
                    r2 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r0 >= 8) { $pc2 = 12; continue $sw2; }
                    if (r5 >= r6) { $pc2 = 12; continue $sw2; }
                    r3 = r5 + 1;
                    r2 = (r2 << 4) | abcd.IK.j6(r4[r5]);
                    r0 = r0 + 1;
                    r5 = r3;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    return r2 << ((8 - r0) * 4);
                }
                case 5: {
                    return abcd.IK.gn(r4, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(int r2, int r3) {
        return j6(this.j6, r2, r3);
    }

    static int j6(int r1, int r2, int r3) {
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r4 = (r2 - 1) * 8;
                    if ((r4 + 8) > r1) { $pc3 = 5; continue $sw3; }
                    return r3;
                }
                case 5: {
                    if (r1 > r4) { $pc3 = 8; continue $sw3; }
                    return 0;
                }
                case 8: {
                    r5 = 32 - ((r1 - r4) * 4);
                    return (r3 >>> r5) << r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final abcd.WD j6(abcd.YD r8) {
        return new abcd.WD(40, r8.FH, r8.Hw, r8.v5, r8.Zo, r8.VH);
    }

    public static final abcd.WD j6(java.lang.String r4) {
        byte[] r5 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r4.length() > 40) { $pc4 = 7; continue $sw4; }
                    r5 = abcd.hE.DW(r4);
                    return DW(r5, 0, r5.length);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidId, new java.lang.Object[]{r4}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final abcd.WD j6(byte[] r3, int r4, int r5) {
        int r0 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r5 - r4;
                    if (r0 > 40) { $pc5 = 7; continue $sw5; }
                    return DW(r3, r4, r5);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidIdLength, new java.lang.Object[]{java.lang.Integer.valueOf(r0), 40}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int DW(abcd.YD r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = abcd.FK.j6(this.DW, j6(1, r4.FH));
                    if (r0 == 0) { $pc6 = 5; continue $sw6; }
                    return r0;
                }
                case 5: {
                    r1 = abcd.FK.j6(this.FH, j6(2, r4.Hw));
                    if (r1 == 0) { $pc6 = 8; continue $sw6; }
                    return r1;
                }
                case 8: {
                    r2 = abcd.FK.j6(this.Hw, j6(3, r4.v5));
                    if (r2 == 0) { $pc6 = 11; continue $sw6; }
                    return r2;
                }
                case 11: {
                    r3 = abcd.FK.j6(this.v5, j6(4, r4.Zo));
                    if (r3 == 0) { $pc6 = 15; continue $sw6; }
                    return r3;
                }
                case 15: {
                    return abcd.FK.j6(this.Zo, j6(5, r4.VH));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (FH() != 40) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        return this.j6;
    }

    public final java.lang.String Hw() {
        char[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new char[40];
                    abcd.YD.j6(r0, 0, this.DW);
                    r1 = this.j6;
                    if (r1 <= 8) { $pc8 = 5; continue $sw8; }
                    abcd.YD.j6(r0, 8, this.FH);
                    r2 = this.j6;
                    if (r2 <= 16) { $pc8 = 9; continue $sw8; }
                    abcd.YD.j6(r0, 16, this.Hw);
                    r3 = this.j6;
                    if (r3 <= 24) { $pc8 = 13; continue $sw8; }
                    abcd.YD.j6(r0, 24, this.v5);
                    r4 = this.j6;
                    if (r4 <= 32) { $pc8 = 17; continue $sw8; }
                    abcd.YD.j6(r0, 32, this.Zo);
                    return new java.lang.String(r0, 0, this.j6);
                }
                case 17: {
                    return new java.lang.String(r0, 0, r4);
                }
                case 13: {
                    return new java.lang.String(r0, 0, r3);
                }
                case 9: {
                    return new java.lang.String(r0, 0, r2);
                }
                case 5: {
                    return new java.lang.String(r0, 0, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r4) {
        abcd.WD r5 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if ((r4 instanceof abcd.WD) == false) { $pc9 = 18; continue $sw9; }
                    r5 = (abcd.WD) r4;
                    if (this.j6 != r5.j6) { $pc9 = 18; continue $sw9; }
                    if (this.DW != r5.DW) { $pc9 = 18; continue $sw9; }
                    if (this.FH != r5.FH) { $pc9 = 18; continue $sw9; }
                    if (this.Hw != r5.Hw) { $pc9 = 18; continue $sw9; }
                    if (this.v5 != r5.v5) { $pc9 = 18; continue $sw9; }
                    if (this.Zo != r5.Zo) { $pc9 = 18; continue $sw9; }
                    return true;
                }
                case 18: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.FH;
    }

    public final int j6() {
        return this.DW >>> 24;
    }

    public final int j6(byte[] r4, int r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = abcd.FK.j6(this.DW, j6(1, abcd.FK.j6(r4, r5)));
                    if (r0 == 0) { $pc10 = 5; continue $sw10; }
                    return r0;
                }
                case 5: {
                    r1 = abcd.FK.j6(this.FH, j6(2, abcd.FK.j6(r4, r5 + 4)));
                    if (r1 == 0) { $pc10 = 8; continue $sw10; }
                    return r1;
                }
                case 8: {
                    r2 = abcd.FK.j6(this.Hw, j6(3, abcd.FK.j6(r4, r5 + 8)));
                    if (r2 == 0) { $pc10 = 11; continue $sw10; }
                    return r2;
                }
                case 11: {
                    r3 = abcd.FK.j6(this.v5, j6(4, abcd.FK.j6(r4, r5 + 12)));
                    if (r3 == 0) { $pc10 = 15; continue $sw10; }
                    return r3;
                }
                case 15: {
                    return abcd.FK.j6(this.Zo, j6(5, abcd.FK.j6(r4, r5 + 16)));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int j6(int[] r4, int r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = abcd.FK.j6(this.DW, j6(1, r4[r5]));
                    if (r0 == 0) { $pc11 = 5; continue $sw11; }
                    return r0;
                }
                case 5: {
                    r1 = abcd.FK.j6(this.FH, j6(2, r4[r5 + 1]));
                    if (r1 == 0) { $pc11 = 8; continue $sw11; }
                    return r1;
                }
                case 8: {
                    r2 = abcd.FK.j6(this.Hw, j6(3, r4[r5 + 2]));
                    if (r2 == 0) { $pc11 = 11; continue $sw11; }
                    return r2;
                }
                case 11: {
                    r3 = abcd.FK.j6(this.v5, j6(4, r4[r5 + 3]));
                    if (r3 == 0) { $pc11 = 15; continue $sw11; }
                    return r3;
                }
                case 15: {
                    return abcd.FK.j6(this.Zo, j6(5, r4[r5 + 4]));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "AbbreviatedObjectId[" + Hw() + "]";
    }

    public abcd.yE v5() {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (DW() == true) { $pc12 = 7; continue $sw12; }
                    return null;
                }
                case 7: {
                    return new abcd.yE(this.DW, this.FH, this.Hw, this.v5, this.Zo);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
