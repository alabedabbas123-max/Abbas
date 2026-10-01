package abcd;

public class sC<S extends abcd.CC> {
    public static final abcd.AbstracteC j6 = null;
    protected abcd.kC DW;
    protected mC<S> FH;
    protected lC<S> Hw;
    sC<S>.a Zo;
    protected lC<S> v5;

    class a {
        sC<S>.a.b DW;
        protected int FH;
        protected int Hw;
        protected abcd.jC VH;
        protected int Zo;
        final abcd.sC gn;
        sC<S>.a.b j6;
        protected int v5;

        class C0010a extends sC<S>.a.b {
            final abcd.sC.a EQ;

            C0010a(abcd.sC.a r1) {
                this.EQ = r1;
                super(r1);
            }

            final int DW(int r1) {
                return r1 - 1;
            }

            final int FH(int r1) {
                return r1;
            }

            final int VH(int r6, int r7) {
                abcd.sC.a r0 = null;
                int r1 = 0;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 2;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 2: {
                            r0 = this.EQ;
                            if (r7 <= r0.FH) { $pc0 = 11; continue $sw0; }
                            r1 = r6 + r7;
                            if (r1 <= r0.v5) { $pc0 = 11; continue $sw0; }
                            if (abcd.sC.a.j6(r0).FH.j6(abcd.sC.a.j6(this.EQ).Hw, r7 - 1, abcd.sC.a.j6(this.EQ).v5, r1 - 1) == false) { $pc0 = 11; continue $sw0; }
                            r7 = r7 - 1;
                            $pc0 = 11; continue $sw0;
                        }
                        case 11: {
                            return r7;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final void j6(int r3, int r4) {
                abcd.sC.a r0 = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = -1;
                $sw1: while (true) {
                    switch ($pc1) {
                        case -1: {
                            r0 = this.EQ;
                            if (r4 <= r0.FH) { $pc1 = 7; continue $sw1; }
                            if ((r4 + r3) <= r0.v5) { $pc1 = 7; continue $sw1; }
                            return;
                        }
                        case 7: {
                            if (r3 <= this.EQ.j6.v5) { $pc1 = 9; continue $sw1; }
                            this.u7 = r3;
                            return;
                        }
                        case 9: {
                            this.gn = r3;
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final boolean j6(int r5, int r6, int r7, long r8) {
                java.lang.Throwable $ex2 = null;
                int $pc2 = -1;
                $sw2: while (true) {
                    switch ($pc2) {
                        case -1: {
                            sC<S>.a.b r0 = this.EQ.j6;
                            if (r6 >= r0.FH) { $pc2 = 5; continue $sw2; }
                            $pc2 = 15; continue $sw2;
                        }
                        case 15: {
                            return false;
                        }
                        case 5: {
                            if (r6 > r0.Hw) { $pc2 = 15; continue $sw2; }
                            if ((((r5 + r6) - r0.v5) % 2) == 0) { $pc2 = 11; continue $sw2; }
                            return false;
                        }
                        case 11: {
                            if (r7 <= r0.Hw(r5, r6)) { $pc2 = 13; continue $sw2; }
                            return false;
                        }
                        case 13: {
                            j6(this.EQ.j6.FH(r5, r6), r8);
                            return true;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final boolean v5(int r1, int r2) {
                java.lang.Throwable $ex3 = null;
                int $pc3 = -1;
                $sw3: while (true) {
                    switch ($pc3) {
                        case -1: {
                            if (r1 >= r2) { $pc3 = 5; continue $sw3; }
                            return true;
                        }
                        case 5: {
                            return false;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }

        abstract class b {
            private abcd.DK DW;
            int FH;
            int Hw;
            int VH;
            int Zo;
            int gn;
            private abcd.CK j6;
            final abcd.sC.a tp;
            int u7;
            int v5;

            b(abcd.sC.a r1) {
                this.tp = r1;
                this.j6 = new abcd.CK();
                this.DW = new abcd.DK();
            }

            private int Hw(int r2) {
                int r0 = 0;
                int r1 = 0;
                java.lang.Throwable $ex4 = null;
                int $pc4 = -1;
                $sw4: while (true) {
                    switch ($pc4) {
                        case -1: {
                            r0 = this.gn;
                            if (r2 < r0) { $pc4 = 5; continue $sw4; }
                            r1 = this.u7;
                            if (r2 > r1) { $pc4 = 9; continue $sw4; }
                            return r2;
                        }
                        case 9: {
                            return r1 - ((r2 ^ r1) & 1);
                        }
                        case 5: {
                            return r0 + ((r2 ^ r0) & 1);
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            abstract int DW(int r1);

            final int DW(int r6, int r7) {
                int r0 = 0;
                int r1 = 0;
                java.lang.Throwable $ex5 = null;
                int $pc5 = -1;
                $sw5: while (true) {
                    switch ($pc5) {
                        case -1: {
                            r0 = r6 + r7;
                            r1 = this.v5;
                            if (((r0 - r1) % 2) != 0) { $pc5 = 7; continue $sw5; }
                            return (r0 - r1) / 2;
                        }
                        case 7: {
                            throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unexpectedOddResult, new java.lang.Object[]{java.lang.Integer.valueOf(r6), java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(this.v5)}));
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final int DW(long r1) {
                return (int) r1;
            }

            abstract int FH(int r1);

            final long FH(int r4, int r5) {
                java.lang.Throwable $ex6 = null;
                int $pc6 = -1;
                $sw6: while (true) {
                    switch ($pc6) {
                        case -1: {
                            if (r5 < this.FH) { $pc6 = 9; continue $sw6; }
                            if (r5 > this.Hw) { $pc6 = 9; continue $sw6; }
                            return this.DW.j6(DW(r4, r5));
                        }
                        case 9: {
                            throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().kNotInRange, new java.lang.Object[]{java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(this.FH), java.lang.Integer.valueOf(this.Hw)}));
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final int Hw(int r4, int r5) {
                java.lang.Throwable $ex7 = null;
                int $pc7 = -1;
                $sw7: while (true) {
                    switch ($pc7) {
                        case -1: {
                            if (r5 < this.FH) { $pc7 = 9; continue $sw7; }
                            if (r5 > this.Hw) { $pc7 = 9; continue $sw7; }
                            return this.j6.DW(DW(r4, r5));
                        }
                        case 9: {
                            throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().kNotInRange, new java.lang.Object[]{java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(this.FH), java.lang.Integer.valueOf(this.Hw)}));
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            abstract int VH(int r1, int r2);

            final long Zo(int r4, int r5) {
                return (((long) r5) << 32) | (r4 + r5);
            }

            final int j6(long r2) {
                return (int) (r2 >>> 32);
            }

            abstract void j6(int r1, int r2);

            void j6(int r1, int r2, int r3, int r4) {
                this.gn = r3;
                this.u7 = r4;
                this.v5 = r1;
                this.Hw = r1;
                this.FH = r1;
                this.j6.j6();
                this.j6.j6(r2);
                this.DW.j6();
                this.DW.j6(Zo(r1, r2));
            }

            boolean j6(int r17) {
                int r8 = 0;
                long r9 = 0L;
                int r2 = 0;
                int r0 = 0;
                int r1 = 0;
                int r13 = 0;
                long r3 = 0L;
                long r14 = 0L;
                int r15 = 0;
                int r4 = 0;
                int r5 = 0;
                int r6 = 0;
                int r10 = 0;
                long r7 = 0L;
                long r11 = 0L;
                int r12 = 0;
                int r16 = 0;
                java.lang.Throwable $ex8 = null;
                int $pc8 = -1;
                $sw8: while (true) {
                    switch ($pc8) {
                        case -1: {
                            this.Zo = this.FH;
                            this.VH = this.Hw;
                            this.FH = Hw(this.v5 - r17);
                            this.Hw = Hw(this.v5 + r17);
                            r8 = this.Hw;
                            $pc8 = 4; continue $sw8;
                        }
                        case 4: {
                            if (r8 < this.FH) { $pc8 = 5; continue $sw8; }
                            r9 = -1;
                            if (r8 <= this.Zo) { $pc8 = 17; continue $sw8; }
                            r2 = r8 - 1;
                            r0 = DW(r17 - 1, r2);
                            r1 = this.j6.DW(r0);
                            r13 = VH(r2, r1);
                            if (r1 == r13) { $pc8 = 12; continue $sw8; }
                            r3 = Zo(r2, r13);
                            $pc8 = 13; continue $sw8;
                        }
                        case 13: {
                            r14 = r3;
                            if (j6(r17, r2, r13, r14) == true) { $pc8 = 15; continue $sw8; }
                            r15 = DW(r13);
                            $pc8 = 19; continue $sw8;
                        }
                        case 19: {
                            if (r8 >= this.VH) { $pc8 = 28; continue $sw8; }
                            r4 = r8 + 1;
                            r5 = DW(r17 - 1, r4);
                            r6 = this.j6.DW(r5);
                            r10 = VH(r4, r6);
                            if (r6 == r10) { $pc8 = 23; continue $sw8; }
                            r7 = Zo(r4, r10);
                            $pc8 = 24; continue $sw8;
                        }
                        case 24: {
                            r11 = r7;
                            if (j6(r17, r4, r10, r11) == true) { $pc8 = 26; continue $sw8; }
                            r12 = FH(r10);
                            r9 = r11;
                            $pc8 = 30; continue $sw8;
                        }
                        case 30: {
                            if (r8 >= this.VH) { $pc8 = 38; continue $sw8; }
                            if (r8 > this.Zo) { $pc8 = 34; continue $sw8; }
                            $pc8 = 36; continue $sw8;
                        }
                        case 36: {
                            r15 = r12;
                            r14 = r9;
                            { $pc8 = 38; continue $sw8; }
                        }
                        case 34: {
                            if (v5(r15, r12) == false) { $pc8 = 36; continue $sw8; }
                            $pc8 = 38; continue $sw8;
                        }
                        case 38: {
                            if (j6(r17, r8, r15, r14) == true) { $pc8 = 39; continue $sw8; }
                            j6(r8, r15);
                            r16 = DW(r17, r8);
                            this.j6.DW(r16, r15);
                            this.DW.j6(r16, r14);
                            r8 = r8 - 2;
                            { $pc8 = 4; continue $sw8; }
                        }
                        case 39: {
                            return true;
                        }
                        case 26: {
                            return true;
                        }
                        case 23: {
                            r7 = this.DW.j6(r5);
                            { $pc8 = 24; continue $sw8; }
                        }
                        case 28: {
                            r12 = -1;
                            { $pc8 = 30; continue $sw8; }
                        }
                        case 15: {
                            return true;
                        }
                        case 12: {
                            r3 = this.DW.j6(r0);
                            { $pc8 = 13; continue $sw8; }
                        }
                        case 17: {
                            r14 = -1;
                            r15 = -1;
                            { $pc8 = 19; continue $sw8; }
                        }
                        case 5: {
                            return false;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            abstract boolean j6(int r1, int r2, int r3, long r4);

            final boolean j6(long r3, long r5) {
                int r0 = 0;
                int r1 = 0;
                int r4 = 0;
                int r6 = 0;
                abcd.sC.a r7 = null;
                java.lang.Throwable $ex9 = null;
                int $pc9 = -1;
                $sw9: while (true) {
                    switch ($pc9) {
                        case -1: {
                            r0 = j6(r3);
                            r1 = j6(r5);
                            r4 = DW(r3);
                            r6 = DW(r5);
                            if (r0 > r1) { $pc9 = 5; continue $sw9; }
                            if (r4 > r6) { $pc9 = 5; continue $sw9; }
                            $pc9 = 6; continue $sw9;
                        }
                        case 6: {
                            r7 = this.tp;
                            r7.VH = new abcd.jC(r0, r1, r4, r6);
                            return true;
                        }
                        case 5: {
                            r4 = r6;
                            r0 = r1;
                            { $pc9 = 6; continue $sw9; }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            abstract boolean v5(int r1, int r2);
        }

        class c extends sC<S>.a.b {
            final abcd.sC.a EQ;

            c(abcd.sC.a r1) {
                this.EQ = r1;
                super(r1);
            }

            final int DW(int r1) {
                return r1;
            }

            final int FH(int r1) {
                return r1 + 1;
            }

            final int VH(int r5, int r6) {
                abcd.sC.a r0 = null;
                int r1 = 0;
                java.lang.Throwable $ex10 = null;
                int $pc10 = 2;
                $sw10: while (true) {
                    switch ($pc10) {
                        case 2: {
                            r0 = this.EQ;
                            if (r6 >= r0.Hw) { $pc10 = 11; continue $sw10; }
                            r1 = r5 + r6;
                            if (r1 >= r0.Zo) { $pc10 = 11; continue $sw10; }
                            if (abcd.sC.a.j6(r0).FH.j6(abcd.sC.a.j6(this.EQ).Hw, r6, abcd.sC.a.j6(this.EQ).v5, r1) == false) { $pc10 = 11; continue $sw10; }
                            r6 = r6 + 1;
                            $pc10 = 11; continue $sw10;
                        }
                        case 11: {
                            return r6;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final void j6(int r3, int r4) {
                abcd.sC.a r0 = null;
                java.lang.Throwable $ex11 = null;
                int $pc11 = -1;
                $sw11: while (true) {
                    switch ($pc11) {
                        case -1: {
                            r0 = this.EQ;
                            if (r4 >= r0.Hw) { $pc11 = 7; continue $sw11; }
                            if ((r4 + r3) >= r0.Zo) { $pc11 = 7; continue $sw11; }
                            return;
                        }
                        case 7: {
                            if (r3 <= this.EQ.DW.v5) { $pc11 = 9; continue $sw11; }
                            this.u7 = r3;
                            return;
                        }
                        case 9: {
                            this.gn = r3;
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final boolean j6(int r6, int r7, int r8, long r9) {
                int r10 = 0;
                java.lang.Throwable $ex12 = null;
                int $pc12 = -1;
                $sw12: while (true) {
                    switch ($pc12) {
                        case -1: {
                            sC<S>.a.b r0 = this.EQ.DW;
                            if (r7 >= r0.FH) { $pc12 = 5; continue $sw12; }
                            $pc12 = 15; continue $sw12;
                        }
                        case 15: {
                            return false;
                        }
                        case 5: {
                            if (r7 > r0.Hw) { $pc12 = 15; continue $sw12; }
                            r10 = r6 - 1;
                            if ((((r10 + r7) - r0.v5) % 2) == 0) { $pc12 = 11; continue $sw12; }
                            return false;
                        }
                        case 11: {
                            if (r8 >= r0.Hw(r10, r7)) { $pc12 = 13; continue $sw12; }
                            return false;
                        }
                        case 13: {
                            j6(r9, this.EQ.DW.FH(r10, r7));
                            return true;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            final boolean v5(int r1, int r2) {
                java.lang.Throwable $ex13 = null;
                int $pc13 = -1;
                $sw13: while (true) {
                    switch ($pc13) {
                        case -1: {
                            if (r1 <= r2) { $pc13 = 5; continue $sw13; }
                            return true;
                        }
                        case 5: {
                            return false;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }

        a(abcd.sC r1) {
            this.gn = r1;
            this.j6 = new abcd.sC.a.c(this);
            this.DW = new abcd.sC.a.C0010a(this);
        }

        static abcd.sC j6(abcd.sC.a r0) {
            return r0.gn;
        }

        void DW(int r2, int r3, int r4, int r5) {
            this.FH = r2;
            this.Hw = r3;
            this.v5 = r4;
            this.Zo = r5;
            int r6 = r4 - r2;
            this.FH = this.j6.VH(r6, r2);
            this.v5 = r6 + this.FH;
            int r7 = r5 - r3;
            this.Hw = this.DW.VH(r7, r3);
            this.Zo = r7 + this.Hw;
        }

        abcd.jC j6(int r4, int r5, int r6, int r7) {
            int r0 = 0;
            int r1 = 0;
            int r8 = 0;
            java.lang.Throwable $ex14 = null;
            int $pc14 = -1;
            $sw14: while (true) {
                switch ($pc14) {
                    case -1: {
                        if (r4 == r5) { $pc14 = 15; continue $sw14; }
                        if (r6 == r7) { $pc14 = 15; continue $sw14; }
                        this.FH = r4;
                        this.Hw = r5;
                        this.v5 = r6;
                        this.Zo = r7;
                        r0 = r6 - r5;
                        r1 = r7 - r4;
                        this.j6.j6(r6 - r4, r4, r0, r1);
                        this.DW.j6(r7 - r5, r5, r0, r1);
                        r8 = 1;
                        $pc14 = 7; continue $sw14;
                    }
                    case 7: {
                        if (this.j6.j6(r8) == true) { $pc14 = 13; continue $sw14; }
                        if (this.DW.j6(r8) == true) { $pc14 = 13; continue $sw14; }
                        r8 = r8 + 1;
                        $pc14 = 13; continue $sw14;
                    }
                    case 13: {
                        return this.VH;
                    }
                    case 15: {
                        return new abcd.jC(r4, r5, r6, r7);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new abcd.rC();
    }

    private sC(abcd.kC r2, mC<S> r3, lC<S> r4, lC<S> r5, abcd.jC r6) {
        this.Zo = new abcd.sC.a(this);
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        j6(r6);
    }

    sC(abcd.kC r1, abcd.mC r2, abcd.lC r3, abcd.lC r4, abcd.jC r5, abcd.sC r6) {
        this(r1, r2, r3, r4, r5);
    }

    private void j6(abcd.jC r5) {
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    this.Zo.DW(r5.j6, r5.DW, r5.FH, r5.Hw);
                    sC<S>.a r6 = this.Zo;
                    if (r6.FH >= r6.Hw) { $pc15 = 5; continue $sw15; }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    sC<S>.a r7 = this.Zo;
                    j6(r7.FH, r7.Hw, r7.v5, r7.Zo);
                    return;
                }
                case 5: {
                    if (r6.v5 < r6.Zo) { $pc15 = 7; continue $sw15; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(int r5, int r6, int r7, int r8) {
        abcd.jC r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        abcd.kC r9 = null;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.Zo.j6(r5, r6, r7, r8);
                    if (r5 >= r0.j6) { $pc16 = 5; continue $sw16; }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    r1 = r0.FH;
                    r2 = r0.j6;
                    r3 = r1 - r2;
                    r4 = this.Zo.DW.VH(r3, r2);
                    j6(r5, r4, r7, r3 + r4);
                    $pc16 = 8; continue $sw16;
                }
                case 8: {
                    if (r0.gn() == abcd.jC.a.Hw) { $pc16 = 11; continue $sw16; }
                    r9 = this.DW;
                    r9.add(r9.size(), r0);
                    $pc16 = 11; continue $sw16;
                }
                case 11: {
                    if (r6 <= r0.DW) { $pc16 = 13; continue $sw16; }
                    $pc16 = 14; continue $sw16;
                }
                case 14: {
                    r10 = r0.Hw;
                    r11 = r0.DW;
                    r12 = r10 - r11;
                    r13 = this.Zo.j6.VH(r12, r11);
                    j6(r13, r6, r12 + r13, r8);
                    return;
                }
                case 13: {
                    if (r8 > r0.Hw) { $pc16 = 14; continue $sw16; }
                    return;
                }
                case 5: {
                    if (r7 >= r0.FH) { $pc16 = 8; continue $sw16; }
                    { $pc16 = 6; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
