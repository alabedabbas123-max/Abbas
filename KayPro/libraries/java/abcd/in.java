package abcd;

public class in implements abcd.Lm.c {
    private final abcd.Interfacexn DW;
    private final abcd.Pt j6;

    public in(abcd.Pt r1, abcd.Interfacexn r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    this.j6 = r1;
                    this.DW = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("observer == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("bytes == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String DW(int r4) {
        int r0 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6.v5(r4);
                    r1 = abcd.Km.DW(r0);
                    if (r0 != 196) { $pc1 = 6; continue $sw1; }
                    r1 = r1 + " " + abcd.Km.DW(this.j6.v5(r4 + 1));
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return abcd.Yt.v5(r4) + ": " + r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(int r5, int r6, int r7, int r8) {
        java.lang.String r9 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r7 == 1) { $pc2 = 5; continue $sw2; }
                    r9 = " #" + abcd.Yt.gn(r8);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    this.DW.j6(this.j6, r6, r7, DW(r6) + r9 + " // " + java.lang.Float.intBitsToFloat(r8));
                    return;
                }
                case 5: {
                    r9 = "";
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(int r4, int r5, int r6, long r7) {
        java.lang.String r0 = null;
        java.lang.String r8 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r6 != 1) { $pc3 = 5; continue $sw3; }
                    r0 = " // ";
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r6 != 1) { $pc3 = 8; continue $sw3; }
                    r8 = abcd.Yt.j6((int) r7);
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    this.DW.j6(this.j6, r5, r6, DW(r5) + r0 + r8);
                    return;
                }
                case 8: {
                    r8 = abcd.Yt.j6(r7);
                    { $pc3 = 9; continue $sw3; }
                }
                case 5: {
                    r0 = " #";
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(int r5, int r6, int r7, int r8) {
        java.lang.String r0 = null;
        int r1 = 0;
        java.lang.String r9 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r7 != 1) { $pc4 = 5; continue $sw4; }
                    r0 = " // ";
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r1 = this.j6.v5(r6);
                    if (r7 != 1) { $pc4 = 9; continue $sw4; }
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    r9 = "#" + abcd.Yt.j6(r8);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    this.DW.j6(this.j6, r6, r7, DW(r6) + r0 + r9);
                    return;
                }
                case 9: {
                    if (r1 == 16) { $pc4 = 15; continue $sw4; }
                    if (r1 != 17) { $pc4 = 14; continue $sw4; }
                    r9 = "#" + abcd.Yt.DW(r8);
                    { $pc4 = 16; continue $sw4; }
                }
                case 14: {
                    r9 = "#" + abcd.Yt.FH(r8);
                    { $pc4 = 16; continue $sw4; }
                }
                case 5: {
                    r0 = " ";
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r5, int r6, int r7, long r8) {
        java.lang.String r9 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r7 == 1) { $pc5 = 5; continue $sw5; }
                    r9 = " #" + abcd.Yt.DW(r8);
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    this.DW.j6(this.j6, r6, r7, DW(r6) + r9 + " // " + java.lang.Double.longBitsToDouble(r8));
                    return;
                }
                case 5: {
                    r9 = "";
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6() {
        return -1;
    }

    @Override
    public void j6(int r1) {
    }

    @Override
    public void j6(int r3, int r4, int r5) {
        this.DW.j6(this.j6, r4, r5, DW(r4));
    }

    @Override
    public void j6(int r4, int r5, int r6, int r7) {
        java.lang.String r8 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r6 > 3) { $pc6 = 5; continue $sw6; }
                    r8 = abcd.Yt.v5(r7);
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    this.DW.j6(this.j6, r5, r6, DW(r5) + " " + r8);
                    return;
                }
                case 5: {
                    r8 = abcd.Yt.gn(r7);
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r5, int r6, int r7, int r8, abcd.Qs r9, int r10) {
        java.lang.String r11 = null;
        boolean r1 = false;
        java.lang.String r3 = null;
        java.lang.StringBuilder r12 = null;
        java.lang.String r13 = null;
        java.lang.String r14 = null;
        java.lang.StringBuilder r15 = null;
        java.lang.String r16 = null;
        abcd.Interfacexn r17 = null;
        abcd.Pt r18 = null;
        java.lang.StringBuilder r0 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r7 > 3) { $pc7 = 5; continue $sw7; }
                    r11 = abcd.Yt.Hw(r8);
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    r1 = true;
                    if (r7 == 1) { $pc7 = 10; continue $sw7; }
                    r1 = false;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    r3 = "";
                    if (r5 != 132) { $pc7 = 17; continue $sw7; }
                    r12 = new java.lang.StringBuilder();
                    r12.append(", #");
                    if (r7 > 3) { $pc7 = 15; continue $sw7; }
                    r13 = abcd.Yt.j6(r10);
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    r12.append(r13);
                    r14 = r12.toString();
                    $pc7 = 19; continue $sw7;
                }
                case 19: {
                    if (r9.yS() == false) { $pc7 = 25; continue $sw7; }
                    r15 = new java.lang.StringBuilder();
                    if (r1 == false) { $pc7 = 23; continue $sw7; }
                    r16 = ",";
                    $pc7 = 24; continue $sw7;
                }
                case 24: {
                    r15.append(r16);
                    r15.append(" category-2");
                    r3 = r15.toString();
                    { $pc7 = 25; continue $sw7; }
                }
                case 23: {
                    r16 = " //";
                    $pc7 = 25; continue $sw7;
                }
                case 25: {
                    r17 = this.DW;
                    r18 = this.j6;
                    r0 = new java.lang.StringBuilder();
                    r0.append(DW(r6));
                    if (r1 == false) { $pc7 = 28; continue $sw7; }
                    r2 = " // ";
                    $pc7 = 29; continue $sw7;
                }
                case 29: {
                    r0.append(r2);
                    r0.append(r11);
                    r0.append(r14);
                    r0.append(r3);
                    r17.j6(r18, r6, r7, r0.toString());
                    return;
                }
                case 28: {
                    r2 = " ";
                    { $pc7 = 29; continue $sw7; }
                }
                case 15: {
                    r13 = abcd.Yt.DW(r10);
                    { $pc7 = 16; continue $sw7; }
                }
                case 17: {
                    r14 = "";
                    { $pc7 = 19; continue $sw7; }
                }
                case 5: {
                    r11 = abcd.Yt.v5(r8);
                    { $pc7 = 6; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r2, int r3, int r4, abcd.Qs r5) {
        this.DW.j6(this.j6, r3, r4, DW(r3));
    }

    @Override
    public void j6(int r4, int r5, int r6, abcd.cn r7, int r8) {
        int r9 = 0;
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r9 = r7.size();
                    r0 = new java.lang.StringBuffer((r9 * 20) + 100);
                    r0.append(DW(r5));
                    if (r8 == 0) { $pc8 = 5; continue $sw8; }
                    r0.append(" // padding: " + abcd.Yt.gn(r8));
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    r0.append('\n');
                    r1 = 0;
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (r1 >= r9) { $pc8 = 8; continue $sw8; }
                    r0.append("  ");
                    r0.append(abcd.Yt.FH(r7.FH(r1)));
                    r0.append(": ");
                    r0.append(abcd.Yt.v5(r7.DW(r1)));
                    r0.append('\n');
                    r1 = r1 + 1;
                    { $pc8 = 6; continue $sw8; }
                }
                case 8: {
                    r0.append("  default: ");
                    r0.append(abcd.Yt.v5(r7.lg()));
                    this.DW.j6(this.j6, r5, r6, r0.toString());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r7, int r8, int r9, abcd.Abstractms r10, int r11) {
        java.lang.String r12 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if ((r10 instanceof abcd.As) == false) { $pc9 = 7; continue $sw9; }
                    j6(r7, r8, r9, null);
                    return;
                }
                case 7: {
                    if ((r10 instanceof abcd.ys) == false) { $pc9 = 11; continue $sw9; }
                    FH(r7, r8, r9, r11);
                    return;
                }
                case 11: {
                    if ((r10 instanceof abcd.Es) == false) { $pc9 = 15; continue $sw9; }
                    DW(r7, r8, r9, ((abcd.Es) r10).rN());
                    return;
                }
                case 15: {
                    if ((r10 instanceof abcd.xs) == false) { $pc9 = 19; continue $sw9; }
                    DW(r7, r8, r9, ((abcd.xs) r10).Ws());
                    return;
                }
                case 19: {
                    if ((r10 instanceof abcd.us) == false) { $pc9 = 22; continue $sw9; }
                    j6(r7, r8, r9, ((abcd.us) r10).lg());
                    return;
                }
                case 22: {
                    if (r11 != 0) { $pc9 = 24; continue $sw9; }
                    r12 = "";
                    $pc9 = 28; continue $sw9;
                }
                case 28: {
                    this.DW.j6(this.j6, r8, r9, DW(r8) + " " + r10 + r12);
                    return;
                }
                case 24: {
                    if (r7 != 197) { $pc9 = 26; continue $sw9; }
                    r12 = ", " + abcd.Yt.Hw(r11);
                    { $pc9 = 28; continue $sw9; }
                }
                case 26: {
                    r12 = ", " + abcd.Yt.v5(r11);
                    { $pc9 = 28; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r5, int r6, abcd.Ks r7, java.util.ArrayList<abcd.Abstractms> r8) {
        java.lang.String r9 = null;
        java.lang.String r10 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r6 != 1) { $pc10 = 5; continue $sw10; }
                    r9 = " // ";
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    r10 = r7.VH().we().aM();
                    this.DW.j6(this.j6, r5, r6, DW(r5) + r9 + r10);
                    return;
                }
                case 5: {
                    r9 = " ";
                    { $pc10 = 6; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
