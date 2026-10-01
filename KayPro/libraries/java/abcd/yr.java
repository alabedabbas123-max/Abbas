package abcd;

public final class yr {
    private final short[] DW;
    private final abcd.Dr EQ;
    private final short[] FH;
    private final short[] Hw;
    private final abcd.Dr VH;
    private final abcd.Dr Zo;
    private final abcd.Dr gn;
    private final int[] j6;
    private final abcd.Dr tp;
    private final abcd.Dr u7;
    private final short[] v5;

    private final class a extends abcd.kq {
        private final abcd.Tt DW;
        final abcd.yr FH;

        public a(abcd.yr r1, abcd.jq r2, abcd.Tt r3) {
            this.FH = r1;
            super(r2);
            this.DW = r3;
        }

        private void Zo(int r4, int r5) {
            int r0 = 0;
            int r6 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (abcd.nu.j6(r5, 255) > 0) { $pc0 = 6; continue $sw0; }
                        r0 = 1;
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        this.DW.writeByte(r4 | ((r0 - 1) << 5));
                        r6 = 0;
                        $pc0 = 13; continue $sw0;
                    }
                    case 13: {
                        if (r6 >= r0) { $pc0 = 15; continue $sw0; }
                        this.DW.writeByte(r5 & 255);
                        r5 = r5 >>> 8;
                        r6 = r6 + 1;
                        { $pc0 = 13; continue $sw0; }
                    }
                    case 15: {
                        return;
                    }
                    case 6: {
                        if (abcd.nu.j6(r5, 65535) > 0) { $pc0 = 9; continue $sw0; }
                        r0 = 2;
                        { $pc0 = 12; continue $sw0; }
                    }
                    case 9: {
                        if (abcd.nu.j6(r5, 16777215) > 0) { $pc0 = 11; continue $sw0; }
                        r0 = 3;
                        { $pc0 = 12; continue $sw0; }
                    }
                    case 11: {
                        r0 = 4;
                        { $pc0 = 12; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void j6(abcd.St r3, abcd.Tt r4, int r5) {
            int r0 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = 0;
                        $pc1 = 3; continue $sw1;
                    }
                    case 3: {
                        if (r0 >= r5) { $pc1 = 5; continue $sw1; }
                        r4.writeByte(r3.readByte());
                        r0 = r0 + 1;
                        { $pc1 = 3; continue $sw1; }
                    }
                    case 5: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        protected void DW(int r2) {
            this.DW.writeByte(r2);
        }

        @Override
        protected void DW(int r2, int r3) {
            Zo(r2, this.FH.Zo(r3));
        }

        @Override
        protected void FH(int r2) {
            abcd.eu.DW(this.DW, r2);
        }

        @Override
        protected void FH(int r2, int r3) {
            Zo(r2, this.FH.VH(r3));
        }

        @Override
        protected void Hw(int r2) {
            this.DW.writeByte(r2);
        }

        @Override
        protected void Hw(int r2, int r3) {
            Zo(r2, this.FH.u7(r3));
        }

        @Override
        protected void Zo(int r2) {
            this.DW.writeByte(r2);
        }

        @Override
        protected void j6(int r3) {
            abcd.eu.DW(this.DW, this.FH.u7(r3));
        }

        @Override
        protected void j6(int r3, int r4) {
            abcd.eu.DW(this.DW, this.FH.tp(r3));
            abcd.eu.DW(this.DW, r4);
        }

        @Override
        protected void j6(int r1, int r2, int r3, int r4) {
            this.DW.writeByte(r1);
            j6(this.j6, this.DW, r4);
        }

        @Override
        protected void v5(int r2) {
            this.DW.writeByte(r2);
        }

        @Override
        protected void v5(int r2, int r3) {
            Zo(r2, this.FH.tp(r3));
        }
    }

    public yr(int r1, int r2, int r3, int r4, int r5) {
        this.j6 = new int[r1];
        this.DW = new short[r2];
        this.FH = new short[r3];
        this.Hw = new short[r4];
        this.v5 = new short[r5];
        this.Zo = new abcd.Dr();
        this.VH = new abcd.Dr();
        this.gn = new abcd.Dr();
        this.u7 = new abcd.Dr();
        this.tp = new abcd.Dr();
        this.EQ = new abcd.Dr();
        this.Zo.DW(0, 0);
        this.gn.DW(0, 0);
        this.tp.DW(0, 0);
        this.EQ.DW(0, 0);
    }

    private abcd._p.a j6(abcd._p.a r3) {
        return new abcd._p.a(Zo(r3.DW()), r3.j6());
    }

    private abcd._p.b j6(abcd._p.b r4) {
        return new abcd._p.b(VH(r4.FH()), r4.j6(), r4.DW());
    }

    private abcd._p.a[] j6(abcd._p.a[] r4) {
        abcd._p.a[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd._p.a[r4.length];
                    r1 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1 >= r4.length) { $pc2 = 6; continue $sw2; }
                    r0[r1] = j6(r4[r1]);
                    r1 = r1 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd._p.b[] j6(abcd._p.b[] r4) {
        abcd._p.b[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new abcd._p.b[r4.length];
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r1 >= r4.length) { $pc3 = 6; continue $sw3; }
                    r0[r1] = j6(r4[r1]);
                    r1 = r1 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW(int r2) {
        return this.tp.j6(r2);
    }

    public abcd.jq DW(abcd.jq r3) {
        abcd.Qt r0 = new abcd.Qt(32);
        new abcd.yr.a(this, r3, r0).FH();
        return new abcd.jq(r0.gn());
    }

    public void DW(int r2, int r3) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r2 <= 0) { $pc4 = 7; continue $sw4; }
                    if (r3 <= 0) { $pc4 = 7; continue $sw4; }
                    this.VH.DW(r2, r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int EQ(int r2) {
        return this.Zo.j6(r2);
    }

    public void EQ(int r2, int r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2 <= 0) { $pc5 = 7; continue $sw5; }
                    if (r3 <= 0) { $pc5 = 7; continue $sw5; }
                    this.Zo.DW(r2, r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH(int r2) {
        return this.gn.j6(r2);
    }

    public void FH(int r2, int r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2 <= 0) { $pc6 = 7; continue $sw6; }
                    if (r3 <= 0) { $pc6 = 7; continue $sw6; }
                    this.gn.DW(r2, r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw(int r2) {
        return this.u7.j6(r2);
    }

    public void Hw(int r2, int r3) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 <= 0) { $pc7 = 7; continue $sw7; }
                    if (r3 <= 0) { $pc7 = 7; continue $sw7; }
                    this.u7.DW(r2, r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int VH(int r2) {
        return this.v5[r2] & 65535;
    }

    public void VH(int r2, int r3) {
        this.v5[r2] = (short) r3;
    }

    public int Zo(int r2) {
        return this.Hw[r2] & 65535;
    }

    void Zo(int r2, int r3) {
        this.Hw[r2] = (short) r3;
    }

    public int gn(int r2) {
        return this.FH[r2] & 65535;
    }

    public void gn(int r2, int r3) {
        this.FH[r2] = (short) r3;
    }

    public int j6(int r2) {
        return this.VH.j6(r2);
    }

    public abcd.Vp j6(abcd.Vp r8) {
        int[] r5 = null;
        abcd.jq[] r6 = null;
        int r0 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r5 = (int[]) r8.Hw().clone();
                    r6 = (abcd.jq[]) r8.VH().clone();
                    r0 = 0;
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r0 >= r5.length) { $pc8 = 7; continue $sw8; }
                    r5[r0] = u7(r5[r0]);
                    r6[r0] = DW(r6[r0]);
                    r0 = r0 + 1;
                    { $pc8 = 4; continue $sw8; }
                }
                case 7: {
                    return new abcd.Vp(null, r8.we(), tp(r8.Zo()), r5, r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Wp j6(abcd.Wp r10) {
        int r2 = 0;
        int[] r3 = null;
        int r0 = 0;
        int r1 = 0;
        int[] r4 = null;
        int r5 = 0;
        int[] r6 = null;
        int r7 = 0;
        int[] r8 = null;
        int r9 = 0;
        int[] r11 = null;
        int r12 = 0;
        int[] r13 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r2 = FH(r10.j6());
                    r3 = (int[]) r10.FH().clone();
                    r0 = 0;
                    r1 = 0;
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r1 >= r3.length) { $pc9 = 6; continue $sw9; }
                    r3[r1] = Zo(r3[r1]);
                    r1 = r1 + 1;
                    { $pc9 = 4; continue $sw9; }
                }
                case 6: {
                    r4 = (int[]) r10.DW().clone();
                    r5 = 0;
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    if (r5 >= r4.length) { $pc9 = 10; continue $sw9; }
                    r4[r5] = FH(r4[r5]);
                    r5 = r5 + 1;
                    { $pc9 = 8; continue $sw9; }
                }
                case 10: {
                    r6 = (int[]) r10.v5().clone();
                    r7 = 0;
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    if (r7 >= r6.length) { $pc9 = 14; continue $sw9; }
                    r6[r7] = VH(r6[r7]);
                    r7 = r7 + 1;
                    { $pc9 = 12; continue $sw9; }
                }
                case 14: {
                    r8 = (int[]) r10.Hw().clone();
                    r9 = 0;
                    $pc9 = 16; continue $sw9;
                }
                case 16: {
                    if (r9 >= r8.length) { $pc9 = 18; continue $sw9; }
                    r8[r9] = FH(r8[r9]);
                    r9 = r9 + 1;
                    { $pc9 = 16; continue $sw9; }
                }
                case 18: {
                    r11 = (int[]) r10.VH().clone();
                    r12 = 0;
                    $pc9 = 20; continue $sw9;
                }
                case 20: {
                    if (r12 >= r11.length) { $pc9 = 22; continue $sw9; }
                    r11[r12] = VH(r11[r12]);
                    r12 = r12 + 1;
                    { $pc9 = 20; continue $sw9; }
                }
                case 22: {
                    r13 = (int[]) r10.Zo().clone();
                    $pc9 = 24; continue $sw9;
                }
                case 24: {
                    if (r0 >= r13.length) { $pc9 = 27; continue $sw9; }
                    r13[r0] = Hw(r13[r0]);
                    r0 = r0 + 1;
                    { $pc9 = 24; continue $sw9; }
                }
                case 27: {
                    return new abcd.Wp(r2, r3, r4, r6, r8, r11, r13);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Xp j6(abcd.Xp r3) {
        int[] r4 = null;
        int r0 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r4 = (int[]) r3.j6().clone();
                    r0 = 0;
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    if (r0 >= r4.length) { $pc10 = 7; continue $sw10; }
                    r4[r0] = j6(r4[r0]);
                    r0 = r0 + 1;
                    { $pc10 = 4; continue $sw10; }
                }
                case 7: {
                    return new abcd.Xp(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Yp j6(abcd.Yp r3) {
        int[] r4 = null;
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r4 = r3.j6();
                    r0 = 0;
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r0 >= r4.length) { $pc11 = 7; continue $sw11; }
                    r4[r0] = FH(r4[r0]);
                    r0 = r0 + 1;
                    { $pc11 = 4; continue $sw11; }
                }
                case 7: {
                    return new abcd.Yp(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd._p j6(abcd._p r5) {
        return new abcd._p(j6(r5.Hw()), j6(r5.FH()), j6(r5.DW()), j6(r5.v5()));
    }

    public abcd.aq j6(abcd.aq r13) {
        return new abcd.aq(null, r13.v5(), tp(r13.u7()), r13.j6(), tp(r13.gn()), EQ(r13.Hw()), u7(r13.Zo()), DW(r13.DW()), r13.FH(), v5(r13.VH()));
    }

    public abcd.fr j6(abcd.fr r3) {
        short[] r4 = null;
        int r0 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (r3 != abcd.fr.j6) { $pc12 = 5; continue $sw12; }
                    return r3;
                }
                case 5: {
                    r4 = (short[]) r3.Hw().clone();
                    r0 = 0;
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (r0 >= r4.length) { $pc12 = 10; continue $sw12; }
                    r4[r0] = (short) tp(r4[r0]);
                    r0 = r0 + 1;
                    { $pc12 = 7; continue $sw12; }
                }
                case 10: {
                    return new abcd.fr(null, r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.jq j6(abcd.jq r3) {
        abcd.Qt r0 = new abcd.Qt(32);
        new abcd.yr.a(this, r3, r0).DW();
        return new abcd.jq(r0.gn());
    }

    public abcd.lq j6(abcd.lq r5) {
        return new abcd.lq(null, tp(r5.Hw()), tp(r5.VH()), u7(r5.Zo()));
    }

    public abcd.nq j6(abcd.nq r5) {
        return new abcd.nq(null, tp(r5.Hw()), gn(r5.VH()), u7(r5.Zo()));
    }

    public abcd.qq j6(abcd.qq r5) {
        return new abcd.qq(null, u7(r5.VH()), tp(r5.Zo()), EQ(r5.Hw()));
    }

    public void j6(int r2, int r3) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r2 <= 0) { $pc13 = 7; continue $sw13; }
                    if (r3 <= 0) { $pc13 = 7; continue $sw13; }
                    this.tp.DW(r2, r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int tp(int r2) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (r2 != (-1)) { $pc14 = 6; continue $sw14; }
                    return -1;
                }
                case 6: {
                    return 65535 & this.DW[r2];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void tp(int r2, int r3) {
        this.DW[r2] = (short) r3;
    }

    public int u7(int r2) {
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (r2 != (-1)) { $pc15 = 6; continue $sw15; }
                    return -1;
                }
                case 6: {
                    return this.j6[r2];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void u7(int r2, int r3) {
        this.j6[r2] = r3;
    }

    public int v5(int r2) {
        return this.EQ.j6(r2);
    }

    public void v5(int r2, int r3) {
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (r2 <= 0) { $pc16 = 7; continue $sw16; }
                    if (r3 <= 0) { $pc16 = 7; continue $sw16; }
                    this.EQ.DW(r2, r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
