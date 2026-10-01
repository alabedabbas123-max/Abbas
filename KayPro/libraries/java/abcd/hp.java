package abcd;

public final class hp {
    private final abcd.co DW;
    private abcd.Lt EQ;
    private final abcd.Qt FH;
    private final abcd.jp Hw;
    private java.lang.String J0;
    private boolean J8;
    private final abcd.Os VH;
    private final abcd.co.b[] Ws;
    private final int Zo;
    private final boolean gn;
    private final abcd.io j6;
    private int tp;
    private int u7;
    private final int v5;
    private java.io.PrintWriter we;

    public hp(abcd.io r2, abcd.co r3, abcd.jp r4, int r5, int r6, boolean r7, abcd.Gs r8) {
        this.u7 = 0;
        this.tp = 1;
        this.j6 = r2;
        this.DW = r3;
        this.Hw = r4;
        this.VH = r8.J8();
        this.gn = r7;
        this.v5 = r5;
        this.Zo = r6;
        this.FH = new abcd.Qt();
        this.Ws = new abcd.co.b[r6];
    }

    private java.util.ArrayList<abcd.io.a> DW() {
        abcd.io r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.util.ArrayList<abcd.io.a> r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6;
                    r1 = 0;
                    if (r0 != null) { $pc0 = 5; continue $sw0; }
                    r2 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r3 = new java.util.ArrayList(r2);
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 >= r2) { $pc0 = 9; continue $sw0; }
                    r3.add(this.j6.get(r1));
                    r1 = r1 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 9: {
                    java.util.Collections.sort(r3, new abcd.fp(this));
                    return r3;
                }
                case 5: {
                    r2 = r0.size();
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(int r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH.v5();
                    this.FH.writeByte(1);
                    this.FH.DW(r4);
                    this.u7 += r4;
                    if (this.EQ == null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    j6(this.FH.v5() - r0, java.lang.String.format("%04x: advance pc", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7)}));
                    return;
                }
                case 5: {
                    if (this.we != null) { $pc1 = 6; continue $sw1; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.co.b r5) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH.v5();
                    this.FH.writeByte(6);
                    Hw(r5.we());
                    if (this.EQ == null) { $pc2 = 5; continue $sw2; }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    j6(this.FH.v5() - r0, java.lang.String.format("%04x: +local restart %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
                    return;
                }
                case 5: {
                    if (this.we != null) { $pc2 = 6; continue $sw2; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int FH(int r6) {
        int r0 = 0;
        int r2 = 0;
        abcd.co.b r7 = null;
        int r1 = 0;
        abcd.co.b[] r3 = null;
        abcd.co.b r4 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW.size();
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r6 >= r0) { $pc3 = 24; continue $sw3; }
                    if (this.DW.get(r6).Hw() != this.u7) { $pc3 = 24; continue $sw3; }
                    r2 = r6 + 1;
                    r7 = this.DW.get(r6);
                    r1 = r7.we();
                    r3 = this.Ws;
                    r4 = r3[r1];
                    if (r7 == r4) { $pc3 = 23; continue $sw3; }
                    r3[r1] = r7;
                    if (r7.j3() == false) { $pc3 = 21; continue $sw3; }
                    if (r4 != null) { $pc3 = 13; continue $sw3; }
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    FH(r7);
                    { $pc3 = 23; continue $sw3; }
                }
                case 13: {
                    if (r7.DW(r4) == false) { $pc3 = 19; continue $sw3; }
                    if (r4.j3() == true) { $pc3 = 18; continue $sw3; }
                    DW(r7);
                    { $pc3 = 23; continue $sw3; }
                }
                case 18: {
                    throw new java.lang.RuntimeException("shouldn't happen");
                }
                case 21: {
                    if (r7.Zo() == abcd.co.a.FH) { $pc3 = 23; continue $sw3; }
                    j6(r7);
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    r6 = r2;
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.co.b r5) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r5.Ws() == null) { $pc4 = 6; continue $sw4; }
                    Hw(r5);
                    return;
                }
                case 6: {
                    r0 = this.FH.v5();
                    this.FH.writeByte(3);
                    Hw(r5.we());
                    j6(r5.VH());
                    j6(r5.aM());
                    if (this.EQ == null) { $pc4 = 9; continue $sw4; }
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    j6(this.FH.v5() - r0, java.lang.String.format("%04x: +local %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
                    return;
                }
                case 9: {
                    if (this.we != null) { $pc4 = 10; continue $sw4; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] FH() {
        java.util.ArrayList<abcd.io.a> r0 = null;
        int r2 = 0;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = DW();
                    j6(r0, v5());
                    this.FH.writeByte(7);
                    r2 = 0;
                    if (this.EQ == null) { $pc5 = 5; continue $sw5; }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    j6(1, java.lang.String.format("%04x: prologue end", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7)}));
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    r1 = r0.size();
                    r3 = this.DW.size();
                    r4 = 0;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    r2 = FH(r2);
                    r4 = j6(r4, r0);
                    if (r2 >= r3) { $pc5 = 11; continue $sw5; }
                    r6 = this.DW.get(r2).Hw();
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    if (r4 >= r1) { $pc5 = 14; continue $sw5; }
                    r7 = r0.get(r4).j6();
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r8 = java.lang.Math.min(r7, r6);
                    if (r8 == Integer.MAX_VALUE) { $pc5 = 22; continue $sw5; }
                    if (r8 != this.v5) { $pc5 = 24; continue $sw5; }
                    if (r6 != Integer.MAX_VALUE) { $pc5 = 24; continue $sw5; }
                    if (r7 == Integer.MAX_VALUE) { $pc5 = 22; continue $sw5; }
                    $pc5 = 24; continue $sw5;
                }
                case 24: {
                    if (r8 == r7) { $pc5 = 25; continue $sw5; }
                    DW(r8 - this.u7);
                    { $pc5 = 8; continue $sw5; }
                }
                case 25: {
                    j6(r0.get(r4));
                    r4 = r4 + 1;
                    $pc5 = 22; continue $sw5;
                }
                case 22: {
                    Hw();
                    return this.FH.gn();
                }
                case 14: {
                    r7 = Integer.MAX_VALUE;
                    { $pc5 = 15; continue $sw5; }
                }
                case 11: {
                    r6 = Integer.MAX_VALUE;
                    { $pc5 = 12; continue $sw5; }
                }
                case 5: {
                    if (this.we == null) { $pc5 = 7; continue $sw5; }
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    this.FH.writeByte(0);
                    if (this.EQ == null) { $pc6 = 5; continue $sw6; }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    j6(1, "end sequence");
                    return;
                }
                case 5: {
                    if (this.we != null) { $pc6 = 6; continue $sw6; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw(int r4) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r4 < 0) { $pc7 = 6; continue $sw7; }
                    this.FH.DW(r4);
                    return;
                }
                case 6: {
                    throw new java.lang.RuntimeException("Signed value where unsigned required: " + r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw(abcd.co.b r5) {
        int r0 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.FH.v5();
                    this.FH.writeByte(4);
                    Hw(r5.we());
                    j6(r5.VH());
                    j6(r5.aM());
                    j6(r5.Ws());
                    if (this.EQ == null) { $pc8 = 5; continue $sw8; }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    j6(this.FH.v5() - r0, java.lang.String.format("%04x: +localx %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
                    return;
                }
                case 5: {
                    if (this.we != null) { $pc8 = 6; continue $sw8; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int Zo() {
        return (this.Zo - this.VH.VH().rN()) - (!this.gn ? 1 : 0);
    }

    private static int j6(int r2, int r3) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r2 < (-4)) { $pc9 = 9; continue $sw9; }
                    if (r2 > 10) { $pc9 = 9; continue $sw9; }
                    return ((r2 - (-4)) + (r3 * 15)) + 10;
                }
                case 9: {
                    throw new java.lang.RuntimeException("Parameter out of range");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(int r4, java.util.ArrayList<abcd.io.a> r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = r5.size();
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r4 >= r0) { $pc10 = 7; continue $sw10; }
                    if (r5.get(r4).j6() != this.u7) { $pc10 = 7; continue $sw10; }
                    r1 = r4 + 1;
                    j6(r5.get(r4));
                    r4 = r1;
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r4) {
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.FH.v5();
                    this.FH.writeByte(2);
                    this.FH.v5(r4);
                    this.tp += r4;
                    if (this.EQ == null) { $pc11 = 5; continue $sw11; }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    j6(this.FH.v5() - r0, java.lang.String.format("line = %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.tp)}));
                    return;
                }
                case 5: {
                    if (this.we != null) { $pc11 = 6; continue $sw11; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r3, java.lang.String r4) {
        abcd.Lt r0 = null;
        java.io.PrintWriter r5 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.J0 == null) { $pc12 = 5; continue $sw12; }
                    r4 = this.J0 + r4;
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    r0 = this.EQ;
                    if (r0 != null) { $pc12 = 8; continue $sw12; }
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    r5 = this.we;
                    if (r5 == null) { $pc12 = 16; continue $sw12; }
                    r5.println(r4);
                    return;
                }
                case 16: {
                    return;
                }
                case 8: {
                    if (this.J8 == true) { $pc12 = 11; continue $sw12; }
                    r3 = 0;
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    r0.j6(r3, r4);
                    { $pc12 = 12; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Js r3) {
        abcd.jp r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r3 == null) { $pc13 = 7; continue $sw13; }
                    r0 = this.Hw;
                    if (r0 == null) { $pc13 = 7; continue $sw13; }
                    this.FH.DW(r0.J8().j6(r3) + 1);
                    return;
                }
                case 7: {
                    this.FH.DW(0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Ks r3) {
        abcd.jp r0 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (r3 == null) { $pc14 = 7; continue $sw14; }
                    r0 = this.Hw;
                    if (r0 == null) { $pc14 = 7; continue $sw14; }
                    this.FH.DW(r0.Ws().j6(r3) + 1);
                    return;
                }
                case 7: {
                    this.FH.DW(0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.co.b r5) {
        int r0 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.FH.v5();
                    this.FH.writeByte(5);
                    this.FH.DW(r5.we());
                    if (this.EQ == null) { $pc15 = 5; continue $sw15; }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    j6(this.FH.v5() - r0, java.lang.String.format("%04x: -local %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), v5(r5)}));
                    return;
                }
                case 5: {
                    if (this.we != null) { $pc15 = 6; continue $sw15; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.io.a r5) {
        int r0 = 0;
        int r6 = 0;
        int r1 = 0;
        int r7 = 0;
        int r2 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = r5.DW().j6();
                    r6 = r5.j6();
                    r1 = r0 - this.tp;
                    r7 = r6 - this.u7;
                    if (r7 < 0) { $pc16 = 22; continue $sw16; }
                    if (r1 >= (-4)) { $pc16 = 7; continue $sw16; }
                    $pc16 = 8; continue $sw16;
                }
                case 8: {
                    j6(r1);
                    r1 = 0;
                    $pc16 = 9; continue $sw16;
                }
                case 9: {
                    r2 = j6(r1, r7);
                    if ((r2 & (-256)) <= 0) { $pc16 = 15; continue $sw16; }
                    DW(r7);
                    r2 = j6(r1, 0);
                    if ((r2 & (-256)) <= 0) { $pc16 = 14; continue $sw16; }
                    j6(r1);
                    r2 = j6(0, 0);
                    r7 = 0;
                    r1 = 0;
                    { $pc16 = 15; continue $sw16; }
                }
                case 14: {
                    r7 = 0;
                    $pc16 = 15; continue $sw16;
                }
                case 15: {
                    this.FH.writeByte(r2);
                    this.tp += r1;
                    this.u7 += r7;
                    if (this.EQ == null) { $pc16 = 18; continue $sw16; }
                    $pc16 = 19; continue $sw16;
                }
                case 19: {
                    j6(1, java.lang.String.format("%04x: line %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.u7), java.lang.Integer.valueOf(this.tp)}));
                    return;
                }
                case 18: {
                    if (this.we != null) { $pc16 = 19; continue $sw16; }
                    return;
                }
                case 7: {
                    if (r1 <= 10) { $pc16 = 9; continue $sw16; }
                    $pc16 = 22; continue $sw16;
                }
                case 22: {
                    throw new java.lang.RuntimeException("Position entries must be in ascending address order");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.ArrayList<abcd.io.a> r12, java.util.ArrayList<abcd.co.b> r13) {
        int r1 = 0;
        boolean r0 = false;
        int r3 = 0;
        int r14 = 0;
        abcd.Ps r4 = null;
        int r5 = 0;
        java.util.Iterator<abcd.co.b> r6 = null;
        abcd.co.b r7 = null;
        int r8 = 0;
        int r2 = 0;
        int r15 = 0;
        abcd.Qs r9 = null;
        int r10 = 0;
        java.util.Iterator<abcd.co.b> r11 = null;
        abcd.co.b r16 = null;
        java.lang.String r17 = null;
        abcd.co.b[] r18 = null;
        int r19 = 0;
        abcd.co.b r20 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r1 = 0;
                    if (this.EQ == null) { $pc17 = 5; continue $sw17; }
                    $pc17 = 8; continue $sw17;
                }
                case 8: {
                    r0 = true;
                    $pc17 = 9; continue $sw17;
                }
                case 9: {
                    r3 = this.FH.v5();
                    if (r12.size() <= 0) { $pc17 = 12; continue $sw17; }
                    this.tp = r12.get(0).DW().j6();
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    this.FH.DW(this.tp);
                    if (r0 == false) { $pc17 = 15; continue $sw17; }
                    j6(this.FH.v5() - r3, "line_start: " + this.tp);
                    $pc17 = 15; continue $sw17;
                }
                case 15: {
                    r14 = Zo();
                    r4 = this.VH.VH();
                    r5 = r4.size();
                    if (this.gn == true) { $pc17 = 24; continue $sw17; }
                    r6 = r13.iterator();
                    $pc17 = 19; continue $sw17;
                }
                case 19: {
                    if (r6.hasNext() == false) { $pc17 = 23; continue $sw17; }
                    r7 = r6.next();
                    if (r14 != r7.we()) { $pc17 = 19; continue $sw17; }
                    this.Ws[r14] = r7;
                    $pc17 = 23; continue $sw17;
                }
                case 23: {
                    r14 = r14 + 1;
                    $pc17 = 24; continue $sw17;
                }
                case 24: {
                    r8 = this.FH.v5();
                    this.FH.DW(r5);
                    if (r0 == false) { $pc17 = 27; continue $sw17; }
                    j6(this.FH.v5() - r8, java.lang.String.format("parameters_size: %04x", new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
                    $pc17 = 27; continue $sw17;
                }
                case 27: {
                    r2 = r14;
                    r15 = 0;
                    $pc17 = 28; continue $sw17;
                }
                case 28: {
                    if (r15 >= r5) { $pc17 = 51; continue $sw17; }
                    r9 = r4.get(r15);
                    r10 = this.FH.v5();
                    r11 = r13.iterator();
                    $pc17 = 31; continue $sw17;
                }
                case 31: {
                    if (r11.hasNext() == false) { $pc17 = 39; continue $sw17; }
                    r16 = r11.next();
                    if (r2 != r16.we()) { $pc17 = 31; continue $sw17; }
                    if (r16.Ws() == null) { $pc17 = 37; continue $sw17; }
                    j6(null);
                    $pc17 = 38; continue $sw17;
                }
                case 38: {
                    this.Ws[r2] = r16;
                    $pc17 = 40; continue $sw17;
                }
                case 40: {
                    if (r16 != null) { $pc17 = 42; continue $sw17; }
                    j6(null);
                    $pc17 = 42; continue $sw17;
                }
                case 42: {
                    if (r0 == false) { $pc17 = 50; continue $sw17; }
                    if (r16 != null) { $pc17 = 45; continue $sw17; }
                    $pc17 = 48; continue $sw17;
                }
                case 48: {
                    r17 = "<unnamed>";
                    $pc17 = 49; continue $sw17;
                }
                case 49: {
                    j6(this.FH.v5() - r10, "parameter " + r17 + " v" + r2);
                    { $pc17 = 50; continue $sw17; }
                }
                case 45: {
                    if (r16.Ws() != null) { $pc17 = 48; continue $sw17; }
                    r17 = r16.VH().aM();
                    $pc17 = 50; continue $sw17;
                }
                case 50: {
                    r2 = r2 + r9.Zo();
                    r15 = r15 + 1;
                    { $pc17 = 28; continue $sw17; }
                }
                case 37: {
                    j6(r16.VH());
                    { $pc17 = 38; continue $sw17; }
                }
                case 39: {
                    r16 = null;
                    { $pc17 = 40; continue $sw17; }
                }
                case 51: {
                    r18 = this.Ws;
                    r19 = r18.length;
                    $pc17 = 52; continue $sw17;
                }
                case 52: {
                    if (r1 >= r19) { $pc17 = 60; continue $sw17; }
                    r20 = r18[r1];
                    if (r20 == null) { $pc17 = 59; continue $sw17; }
                    if (r20.Ws() == null) { $pc17 = 59; continue $sw17; }
                    Hw(r20);
                    $pc17 = 59; continue $sw17;
                }
                case 59: {
                    r1 = r1 + 1;
                    { $pc17 = 52; continue $sw17; }
                }
                case 60: {
                    return;
                }
                case 5: {
                    if (this.we != null) { $pc17 = 8; continue $sw17; }
                    r0 = false;
                    { $pc17 = 9; continue $sw17; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String v5(abcd.co.b r5) {
        java.lang.StringBuilder r0 = null;
        abcd.Js r2 = null;
        abcd.Ks r3 = null;
        abcd.Js r6 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("v");
                    r0.append(r5.we());
                    r0.append(' ');
                    r2 = r5.VH();
                    if (r2 != null) { $pc18 = 5; continue $sw18; }
                    r0.append("null");
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    r0.append(' ');
                    r3 = r5.aM();
                    if (r3 != null) { $pc18 = 9; continue $sw18; }
                    r0.append("null");
                    $pc18 = 10; continue $sw18;
                }
                case 10: {
                    r6 = r5.Ws();
                    if (r6 == null) { $pc18 = 14; continue $sw18; }
                    r0.append(' ');
                    r0.append(r6.aM());
                    $pc18 = 14; continue $sw18;
                }
                case 14: {
                    return r0.toString();
                }
                case 9: {
                    r0.append(r3.aM());
                    { $pc18 = 10; continue $sw18; }
                }
                case 5: {
                    r0.append(r2.aM());
                    { $pc18 = 6; continue $sw18; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.ArrayList<abcd.co.b> v5() {
        java.util.ArrayList<abcd.co.b> r0 = null;
        int r1 = 0;
        java.util.BitSet r2 = null;
        int r3 = 0;
        int r4 = 0;
        abcd.co.b r5 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = new java.util.ArrayList(this.VH.VH().size());
                    r1 = Zo();
                    r2 = new java.util.BitSet(this.Zo - r1);
                    r3 = this.DW.size();
                    r4 = 0;
                    $pc19 = 3; continue $sw19;
                }
                case 3: {
                    if (r4 >= r3) { $pc19 = 12; continue $sw19; }
                    r5 = this.DW.get(r4);
                    r6 = r5.we();
                    if (r6 < r1) { $pc19 = 11; continue $sw19; }
                    r7 = r6 - r1;
                    if (r2.get(r7) == true) { $pc19 = 11; continue $sw19; }
                    r2.set(r7);
                    r0.add(r5);
                    $pc19 = 11; continue $sw19;
                }
                case 11: {
                    r4 = r4 + 1;
                    { $pc19 = 3; continue $sw19; }
                }
                case 12: {
                    java.util.Collections.sort(r0, new abcd.gp(this));
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    return FH();
                }
                case 4: {
                    e = $ex20;
                    throw abcd.Vt.j6(e, "...while encoding debug info");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] j6(java.lang.String r1, java.io.PrintWriter r2, abcd.Lt r3, boolean r4) {
        this.J0 = r1;
        this.we = r2;
        this.EQ = r3;
        this.J8 = r4;
        return j6();
    }
}
