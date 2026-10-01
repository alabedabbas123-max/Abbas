package abcd;

public final class iq {
    private static final byte[] j6 = null;
    private byte[] DW;
    private final abcd.Gn FH;
    private int Hw;
    private final java.util.List<java.lang.String> VH;
    private final java.util.List<java.lang.Integer> Zo;
    private final java.util.List<abcd.qq> gn;
    private final java.util.List<abcd.nq> tp;
    private final java.util.List<abcd.lq> u7;
    private final java.util.List<java.lang.String> v5;

    public final class a implements abcd.St, abcd.Tt {
        private int DW;
        private final int FH;
        private final int Hw;
        private final java.lang.String j6;
        final abcd.iq v5;

        private a(abcd.iq r3, int r4) {
            this(r3, "section", r4, abcd.iq.Hw(r3).length);
        }

        a(abcd.iq r1, int r2, abcd.cq r3) {
            this(r1, r2);
        }

        private a(abcd.iq r1, java.lang.String r2, int r3, int r4) {
            this.v5 = r1;
            this.j6 = r2;
            this.Hw = r3;
            this.DW = r3;
            this.FH = r4;
        }

        private abcd.bq BT() {
            int r1 = 0;
            int r2 = 0;
            int r3 = 0;
            int r0 = 0;
            int r4 = 0;
            short[] r5 = null;
            abcd.bq.b[] r6 = null;
            int r7 = 0;
            abcd.bq.a[] r8 = null;
            abcd.bq.a[] r9 = null;
            int r10 = 0;
            int r11 = 0;
            int r12 = 0;
            abcd.bq.a[] r13 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r1 = yS();
                        r2 = yS();
                        r3 = yS();
                        r0 = yS();
                        r4 = XL();
                        r5 = Zo(XL());
                        r6 = new abcd.bq.b[r0];
                        r7 = 0;
                        r8 = new abcd.bq.a[0];
                        if (r0 > 0) { $pc0 = 5; continue $sw0; }
                        r9 = r8;
                        $pc0 = 16; continue $sw0;
                    }
                    case 16: {
                        return new abcd.bq(r1, r2, r3, r4, r5, r6, r9);
                    }
                    case 5: {
                        if ((r5.length % 2) != 1) { $pc0 = 7; continue $sw0; }
                        Mr();
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        r10 = 0;
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        if (r10 >= r0) { $pc0 = 10; continue $sw0; }
                        r6[r10] = new abcd.bq.b(XL(), yS(), yS());
                        r10 = r10 + 1;
                        { $pc0 = 8; continue $sw0; }
                    }
                    case 10: {
                        r11 = gn();
                        r12 = rN();
                        r13 = new abcd.bq.a[r12];
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        if (r7 >= r12) { $pc0 = 13; continue $sw0; }
                        r13[r7] = gn(r11);
                        r7 = r7 + 1;
                        { $pc0 = 11; continue $sw0; }
                    }
                    case 13: {
                        r9 = r13;
                        { $pc0 = 16; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static abcd.bq DW(abcd.iq.a r0) {
            return r0.BT();
        }

        private void VH(int r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ((this.DW + r3) > this.FH) { $pc1 = 6; continue $sw1; }
                        return;
                    }
                    case 6: {
                        throw new abcd.Ut("Section limit " + this.FH + " exceeded by " + this.j6);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private abcd._p gW() {
            int r0 = rN();
            int r1 = rN();
            int r2 = rN();
            int r3 = rN();
            return new abcd._p(u7(r0), u7(r1), tp(r2), tp(r3));
        }

        private abcd.bq.a gn(int r7) {
            int r0 = 0;
            int r8 = 0;
            int r1 = 0;
            int[] r2 = null;
            int[] r3 = null;
            int r4 = 0;
            int r9 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = gn() - r7;
                        r8 = U2();
                        r1 = java.lang.Math.abs(r8);
                        r2 = new int[r1];
                        r3 = new int[r1];
                        r4 = 0;
                        $pc2 = 3; continue $sw2;
                    }
                    case 3: {
                        if (r4 >= r1) { $pc2 = 5; continue $sw2; }
                        r2[r4] = rN();
                        r3[r4] = rN();
                        r4 = r4 + 1;
                        { $pc2 = 3; continue $sw2; }
                    }
                    case 5: {
                        if (r8 > 0) { $pc2 = 7; continue $sw2; }
                        r9 = rN();
                        $pc2 = 9; continue $sw2;
                    }
                    case 9: {
                        return new abcd.bq.a(r0, r2, r3, r9);
                    }
                    case 7: {
                        r9 = -1;
                        { $pc2 = 9; continue $sw2; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static abcd._p j6(abcd.iq.a r0) {
            return r0.gW();
        }

        private abcd._p.b[] tp(int r7) {
            abcd._p.b[] r0 = null;
            int r1 = 0;
            int r2 = 0;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = new abcd._p.b[r7];
                        r1 = 0;
                        r2 = 0;
                        $pc3 = 3; continue $sw3;
                    }
                    case 3: {
                        if (r1 >= r7) { $pc3 = 5; continue $sw3; }
                        r2 = r2 + rN();
                        r0[r1] = new abcd._p.b(r2, rN(), rN());
                        r1 = r1 + 1;
                        { $pc3 = 3; continue $sw3; }
                    }
                    case 5: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private abcd._p.a[] u7(int r6) {
            abcd._p.a[] r0 = null;
            int r1 = 0;
            int r2 = 0;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = new abcd._p.a[r6];
                        r1 = 0;
                        r2 = 0;
                        $pc4 = 3; continue $sw4;
                    }
                    case 3: {
                        if (r1 >= r6) { $pc4 = 5; continue $sw4; }
                        r2 = r2 + rN();
                        r0[r1] = new abcd._p.a(r2, rN());
                        r1 = r1 + 1;
                        { $pc4 = 3; continue $sw4; }
                    }
                    case 5: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.Xp EQ() {
            int r0 = 0;
            int[] r1 = null;
            int r2 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = XL();
                        r1 = new int[r0];
                        r2 = 0;
                        $pc5 = 3; continue $sw5;
                    }
                    case 3: {
                        if (r2 >= r0) { $pc5 = 6; continue $sw5; }
                        r1[r2] = XL();
                        r2 = r2 + 1;
                        { $pc5 = 3; continue $sw5; }
                    }
                    case 6: {
                        return new abcd.Xp(r1);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.aq J0() {
            int r2 = gn();
            int r3 = XL();
            int r4 = XL();
            int r5 = XL();
            int r6 = XL();
            int r7 = XL();
            int r8 = XL();
            int r9 = XL();
            int r10 = XL();
            return new abcd.aq(this.v5, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        }

        public abcd.jq J8() {
            int r0 = this.DW;
            new abcd.kq(this).DW();
            int r1 = this.DW;
            return new abcd.jq(abcd.iq.j6(abcd.iq.Hw(this.v5), r0, r1));
        }

        public short Mr() {
            int r0 = abcd.iq.Hw(this.v5)[this.DW] & 255;
            byte[] r1 = abcd.iq.Hw(this.v5);
            int r2 = this.DW;
            int r3 = r0 | ((r1[r2 + 1] & 255) << 8);
            this.DW = r2 + 2;
            return (short) r3;
        }

        public abcd.lq QX() {
            int r0 = yS();
            int r1 = yS();
            int r2 = XL();
            return new abcd.lq(this.v5, r0, r1, r2);
        }

        public int U2() {
            return abcd.eu.j6(this);
        }

        public byte[] VH() {
            return abcd.iq.Hw(this.v5);
        }

        public abcd.jq Ws() {
            int r0 = this.DW;
            new abcd.kq(this).FH();
            int r1 = this.DW;
            return new abcd.jq(abcd.iq.j6(abcd.iq.Hw(this.v5), r0, r1));
        }

        public int XL() {
            int r0 = ((abcd.iq.Hw(this.v5)[this.DW] & 255) | ((abcd.iq.Hw(this.v5)[this.DW + 1] & 255) << 8)) | ((abcd.iq.Hw(this.v5)[this.DW + 2] & 255) << 16);
            byte[] r1 = abcd.iq.Hw(this.v5);
            int r2 = this.DW;
            int r3 = r0 | ((r1[r2 + 3] & 255) << 24);
            this.DW = r2 + 4;
            return r3;
        }

        public void Zo() {
            int r0 = 0;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        r0 = this.DW;
                        this.DW = abcd.iq.j6(r0);
                        $pc6 = 4; continue $sw6;
                    }
                    case 4: {
                        if (r0 >= this.DW) { $pc6 = 6; continue $sw6; }
                        abcd.iq.Hw(this.v5)[r0] = 0;
                        r0 = r0 + 1;
                        { $pc6 = 4; continue $sw6; }
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public short[] Zo(int r4) {
            short[] r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        r0 = new short[r4];
                        r1 = 0;
                        $pc7 = 3; continue $sw7;
                    }
                    case 3: {
                        if (r1 >= r4) { $pc7 = 5; continue $sw7; }
                        r0[r1] = Mr();
                        r1 = r1 + 1;
                        { $pc7 = 3; continue $sw7; }
                    }
                    case 5: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String a8() {
            int r0 = 0;
            int r1 = 0;
            int r2 = 0;
            java.lang.String r3 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        r0 = XL();
                        r1 = this.DW;
                        this.DW = r0;
                        try {
                            r2 = rN();
                            r3 = abcd.ju.j6(this, new char[r2]);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            if ($t instanceof java.io.UTFDataFormatException) { $pc8 = 11; continue $sw8; }
                            $pc8 = 9; continue $sw8;
                        }
                        if (r3.length() != r2) { $pc8 = 8; continue $sw8; }
                        this.DW = r1;
                        return r3;
                    }
                    case 8: {
                        try {
                            throw new abcd.Ut("Declared length " + r2 + " doesn't match decoded length of " + r3.length());
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            if ($t instanceof java.io.UTFDataFormatException) { $pc8 = 11; continue $sw8; }
                            $pc8 = 9; continue $sw8;
                        }
                    }
                    case 11: {
                        e = $ex8;
                        try {
                            throw new abcd.Ut(e);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 9; continue $sw8;
                        }
                    }
                    case 9: {
                        th = $ex8;
                        this.DW = r1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.nq aM() {
            int r0 = yS();
            int r1 = yS();
            int r2 = XL();
            return new abcd.nq(this.v5, r0, r1, r2);
        }

        public int er() {
            return abcd.eu.DW(this) - 1;
        }

        public int gn() {
            return this.DW;
        }

        public abcd.qq j3() {
            int r0 = XL();
            int r1 = XL();
            int r2 = XL();
            return new abcd.qq(this.v5, r0, r1, r2);
        }

        public abcd.fr lg() {
            int r0 = 0;
            short[] r1 = null;
            int r2 = 0;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        r0 = XL();
                        r1 = new short[r0];
                        r2 = 0;
                        $pc9 = 3; continue $sw9;
                    }
                    case 3: {
                        if (r2 >= r0) { $pc9 = 5; continue $sw9; }
                        r1[r2] = Mr();
                        r2 = r2 + 1;
                        { $pc9 = 3; continue $sw9; }
                    }
                    case 5: {
                        Zo();
                        return new abcd.fr(this.v5, r1);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int rN() {
            return abcd.eu.DW(this);
        }

        @Override
        public byte readByte() {
            byte[] r0 = abcd.iq.Hw(this.v5);
            int r1 = this.DW;
            this.DW = r1 + 1;
            return (byte) (r0[r1] & 255);
        }

        public abcd.Wp tp() {
            int r1 = 0;
            int r0 = 0;
            int r2 = 0;
            int r3 = 0;
            int[] r4 = null;
            int[] r5 = null;
            int r6 = 0;
            int r7 = 0;
            int[] r8 = null;
            int[] r9 = null;
            int[] r10 = null;
            int[] r11 = null;
            int r12 = 0;
            int[] r13 = null;
            int[] r14 = null;
            int[] r15 = null;
            int[] r16 = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        r1 = XL();
                        r0 = XL();
                        r2 = XL();
                        r3 = XL();
                        if (r0 != 0) { $pc10 = 5; continue $sw10; }
                        r4 = abcd.Zp.j6;
                        $pc10 = 6; continue $sw10;
                    }
                    case 6: {
                        if (r0 != 0) { $pc10 = 8; continue $sw10; }
                        r5 = abcd.Zp.j6;
                        $pc10 = 9; continue $sw10;
                    }
                    case 9: {
                        r6 = 0;
                        r7 = 0;
                        $pc10 = 10; continue $sw10;
                    }
                    case 10: {
                        if (r7 >= r0) { $pc10 = 12; continue $sw10; }
                        r4[r7] = XL();
                        r5[r7] = XL();
                        r7 = r7 + 1;
                        { $pc10 = 10; continue $sw10; }
                    }
                    case 12: {
                        if (r2 != 0) { $pc10 = 14; continue $sw10; }
                        r8 = abcd.Zp.j6;
                        $pc10 = 15; continue $sw10;
                    }
                    case 15: {
                        r9 = r8;
                        if (r2 != 0) { $pc10 = 18; continue $sw10; }
                        r10 = abcd.Zp.j6;
                        $pc10 = 19; continue $sw10;
                    }
                    case 19: {
                        r11 = r10;
                        r12 = 0;
                        $pc10 = 20; continue $sw10;
                    }
                    case 20: {
                        if (r12 >= r2) { $pc10 = 22; continue $sw10; }
                        r9[r12] = XL();
                        r11[r12] = XL();
                        r12 = r12 + 1;
                        { $pc10 = 20; continue $sw10; }
                    }
                    case 22: {
                        if (r3 != 0) { $pc10 = 24; continue $sw10; }
                        r13 = abcd.Zp.j6;
                        $pc10 = 25; continue $sw10;
                    }
                    case 25: {
                        r14 = r13;
                        if (r3 != 0) { $pc10 = 28; continue $sw10; }
                        r15 = abcd.Zp.j6;
                        $pc10 = 29; continue $sw10;
                    }
                    case 29: {
                        r16 = r15;
                        $pc10 = 30; continue $sw10;
                    }
                    case 30: {
                        if (r6 >= r3) { $pc10 = 33; continue $sw10; }
                        r14[r6] = XL();
                        r16[r6] = XL();
                        r6 = r6 + 1;
                        { $pc10 = 30; continue $sw10; }
                    }
                    case 33: {
                        return new abcd.Wp(r1, r4, r5, r9, r11, r14, r16);
                    }
                    case 28: {
                        r15 = new int[r3];
                        { $pc10 = 29; continue $sw10; }
                    }
                    case 24: {
                        r13 = new int[r3];
                        { $pc10 = 25; continue $sw10; }
                    }
                    case 18: {
                        r10 = new int[r2];
                        { $pc10 = 19; continue $sw10; }
                    }
                    case 14: {
                        r8 = new int[r2];
                        { $pc10 = 15; continue $sw10; }
                    }
                    case 8: {
                        r5 = new int[r0];
                        { $pc10 = 9; continue $sw10; }
                    }
                    case 5: {
                        r4 = new int[r0];
                        { $pc10 = 6; continue $sw10; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.Vp u7() {
            byte r2 = 0;
            int r3 = 0;
            int r0 = 0;
            int[] r4 = null;
            abcd.jq[] r5 = null;
            int r1 = 0;
            java.lang.Throwable $ex11 = null;
            int $pc11 = -1;
            $sw11: while (true) {
                switch ($pc11) {
                    case -1: {
                        r2 = readByte();
                        r3 = rN();
                        r0 = rN();
                        r4 = new int[r0];
                        r5 = new abcd.jq[r0];
                        r1 = 0;
                        $pc11 = 3; continue $sw11;
                    }
                    case 3: {
                        if (r1 >= r0) { $pc11 = 6; continue $sw11; }
                        r4[r1] = rN();
                        r5[r1] = Ws();
                        r1 = r1 + 1;
                        { $pc11 = 3; continue $sw11; }
                    }
                    case 6: {
                        return new abcd.Vp(this.v5, r2, r3, r4, r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public byte[] v5(int r4) {
            byte[] r0 = abcd.iq.Hw(this.v5);
            int r1 = this.DW;
            byte[] r2 = abcd.iq.j6(r0, r1, r1 + r4);
            this.DW += r4;
            return r2;
        }

        public abcd.Yp we() {
            int r0 = 0;
            int[] r1 = null;
            int r2 = 0;
            java.lang.Throwable $ex12 = null;
            int $pc12 = -1;
            $sw12: while (true) {
                switch ($pc12) {
                    case -1: {
                        r0 = XL();
                        r1 = new int[r0];
                        r2 = 0;
                        $pc12 = 3; continue $sw12;
                    }
                    case 3: {
                        if (r2 >= r0) { $pc12 = 6; continue $sw12; }
                        r1[r2] = XL();
                        r2 = r2 + 1;
                        { $pc12 = 3; continue $sw12; }
                    }
                    case 6: {
                        return new abcd.Yp(r1);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void writeByte(int r4) {
            VH(1);
            byte[] r0 = abcd.iq.Hw(this.v5);
            int r1 = this.DW;
            this.DW = r1 + 1;
            r0[r1] = (byte) r4;
        }

        public int yS() {
            return Mr() & 65535;
        }
    }

    static {
        j6 = new byte[8192];
    }

    public iq(java.io.File r4) {
        java.util.zip.ZipFile r0 = null;
        java.util.zip.ZipEntry r1 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    this.FH = new abcd.Gn();
                    this.Hw = 0;
                    this.v5 = new abcd.cq(this);
                    this.Zo = new abcd.dq(this);
                    this.VH = new abcd.eq(this);
                    this.gn = new abcd.fq(this);
                    this.u7 = new abcd.gq(this);
                    this.tp = new abcd.hq(this);
                    if (abcd.Wt.j6(r4.getName()) == false) { $pc13 = 10; continue $sw13; }
                    r0 = new java.util.zip.ZipFile(r4);
                    r1 = r0.getEntry("classes.dex");
                    if (r1 == null) { $pc13 = 8; continue $sw13; }
                    j6(r0.getInputStream(r1), (int) r1.getSize());
                    r0.close();
                    return;
                }
                case 8: {
                    throw new abcd.Ut("Expected classes.dex in " + r4);
                }
                case 10: {
                    if (r4.getName().endsWith(".dex") == false) { $pc13 = 14; continue $sw13; }
                    j6(new java.io.FileInputStream(r4), (int) r4.length());
                    return;
                }
                case 14: {
                    throw new abcd.Ut("unknown output extension: " + r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public iq(java.io.InputStream r2, int r3) {
        this.FH = new abcd.Gn();
        this.Hw = 0;
        this.v5 = new abcd.cq(this);
        this.Zo = new abcd.dq(this);
        this.VH = new abcd.eq(this);
        this.gn = new abcd.fq(this);
        this.u7 = new abcd.gq(this);
        this.tp = new abcd.hq(this);
        j6(r2, r3);
    }

    static java.util.List DW(abcd.iq r0) {
        return r0.Zo;
    }

    private static void DW(int r3, int r4) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (r3 < 0) { $pc14 = 6; continue $sw14; }
                    if (r3 >= r4) { $pc14 = 6; continue $sw14; }
                    return;
                }
                case 6: {
                    throw new java.lang.IndexOutOfBoundsException("index:" + r3 + ", length=" + r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte[] DW(byte[] r2, int r3, int r4) {
        int r0 = 0;
        int r5 = 0;
        int r1 = 0;
        byte[] r6 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (r3 > r4) { $pc15 = 11; continue $sw15; }
                    r0 = r2.length;
                    if (r3 < 0) { $pc15 = 9; continue $sw15; }
                    if (r3 > r0) { $pc15 = 9; continue $sw15; }
                    r5 = r4 - r3;
                    r1 = java.lang.Math.min(r5, r0 - r3);
                    r6 = new byte[r5];
                    java.lang.System.arraycopy(r2, r3, r6, 0, r1);
                    return r6;
                }
                case 9: {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.List FH(abcd.iq r0) {
        return r0.v5;
    }

    private static int Hw(int r0) {
        return (r0 + 3) & (-4);
    }

    static byte[] Hw(abcd.iq r0) {
        return r0.DW;
    }

    static int j6(int r0) {
        return Hw(r0);
    }

    static abcd.Gn j6(abcd.iq r0) {
        return r0.FH;
    }

    static void j6(int r0, int r1) {
        DW(r0, r1);
    }

    private void j6(java.io.InputStream r5, int r6) {
        java.io.ByteArrayOutputStream r7 = null;
        int r1 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (r6 != (-1)) { $pc16 = 9; continue $sw16; }
                    r7 = new java.io.ByteArrayOutputStream();
                    $pc16 = 5; continue $sw16;
                }
                case 5: {
                    r1 = r5.read(j6);
                    if (r1 == (-1)) { $pc16 = 8; continue $sw16; }
                    r7.write(j6, 0, r1);
                    { $pc16 = 5; continue $sw16; }
                }
                case 8: {
                    this.DW = r7.toByteArray();
                    $pc16 = 10; continue $sw16;
                }
                case 10: {
                    this.Hw = this.DW.length;
                    this.FH.j6(this);
                    return;
                }
                case 9: {
                    this.DW = new byte[r6];
                    new java.io.DataInputStream(r5).readFully(this.DW);
                    { $pc16 = 10; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] j6(byte[] r0, int r1, int r2) {
        return DW(r0, r1, r2);
    }

    public abcd.iq.a DW(int r4) {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (r4 < 0) { $pc17 = 8; continue $sw17; }
                    if (r4 > this.Hw) { $pc17 = 8; continue $sw17; }
                    return new abcd.iq.a(this, r4, null);
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("position=" + r4 + " length=" + this.Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<abcd.qq> DW() {
        return this.gn;
    }

    public abcd.fr FH(int r1) {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (r1 != 0) { $pc18 = 6; continue $sw18; }
                    return abcd.fr.j6;
                }
                case 6: {
                    return DW(r1).lg();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<java.lang.String> FH() {
        return this.v5;
    }

    public java.util.List<java.lang.String> Hw() {
        return this.VH;
    }

    public abcd.Gn j6() {
        return this.FH;
    }

    public abcd._p j6(abcd.aq r2) {
        int r3 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r3 = r2.FH();
                    if (r3 == 0) { $pc19 = 7; continue $sw19; }
                    return abcd.iq.a.j6(DW(r3));
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("offset == 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bq j6(abcd._p.b r2) {
        int r3 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r3 = r2.DW();
                    if (r3 == 0) { $pc20 = 7; continue $sw20; }
                    return abcd.iq.a.DW(DW(r3));
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("offset == 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
