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
            L2:
                abcd.sC.a r0 = this.EQ;
                if (r7 <= r0.FH) goto L11;
                int r1 = r6 + r7;
                if (r1 <= r0.v5) goto L11;
                if (abcd.sC.a.j6(r0).FH.j6(abcd.sC.a.j6(this.EQ).Hw, r7 - 1, abcd.sC.a.j6(this.EQ).v5, r1 - 1) == false) goto L11;
                r7 = r7 - 1;
            L11:
                return r7;
            }

            final void j6(int r3, int r4) {
                abcd.sC.a r0 = this.EQ;
                if (r4 <= r0.FH) goto L7;
                if ((r4 + r3) <= r0.v5) goto L7;
                return;
            L7:
                if (r3 <= this.EQ.j6.v5) goto L9;
                this.u7 = r3;
                return;
            L9:
                this.gn = r3;
            }

            final boolean j6(int r5, int r6, int r7, long r8) {
                sC<S>.a.b r0 = this.EQ.j6;
                if (r6 >= r0.FH) goto L5;
            L15:
                return false;
            L5:
                if (r6 > r0.Hw) goto L15;
                if ((((r5 + r6) - r0.v5) % 2) == 0) goto L11;
                return false;
            L11:
                if (r7 <= r0.Hw(r5, r6)) goto L13;
                return false;
            L13:
                j6(this.EQ.j6.FH(r5, r6), r8);
                return true;
            }

            final boolean v5(int r1, int r2) {
                if (r1 >= r2) goto L5;
                return true;
            L5:
                return false;
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
                int r0 = this.gn;
                if (r2 < r0) goto L5;
                int r1 = this.u7;
                if (r2 > r1) goto L9;
                return r2;
            L9:
                return r1 - ((r2 ^ r1) & 1);
            L5:
                return r0 + ((r2 ^ r0) & 1);
            }

            abstract int DW(int r1);

            final int DW(int r6, int r7) {
                int r0 = r6 + r7;
                int r1 = this.v5;
                if (((r0 - r1) % 2) != 0) goto L7;
                return (r0 - r1) / 2;
            L7:
                throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unexpectedOddResult, new java.lang.Object[]{java.lang.Integer.valueOf(r6), java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(this.v5)}));
            }

            final int DW(long r1) {
                return (int) r1;
            }

            abstract int FH(int r1);

            final long FH(int r4, int r5) {
                if (r5 < this.FH) goto L9;
                if (r5 > this.Hw) goto L9;
                return this.DW.j6(DW(r4, r5));
            L9:
                throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().kNotInRange, new java.lang.Object[]{java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(this.FH), java.lang.Integer.valueOf(this.Hw)}));
            }

            final int Hw(int r4, int r5) {
                if (r5 < this.FH) goto L9;
                if (r5 > this.Hw) goto L9;
                return this.j6.DW(DW(r4, r5));
            L9:
                throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().kNotInRange, new java.lang.Object[]{java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(this.FH), java.lang.Integer.valueOf(this.Hw)}));
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
                this.Zo = this.FH;
                this.VH = this.Hw;
                this.FH = Hw(this.v5 - r17);
                this.Hw = Hw(this.v5 + r17);
                int r8 = this.Hw;
            L4:
                if (r8 < this.FH) goto L5;
                long r9 = -1;
                if (r8 <= this.Zo) goto L17;
                int r2 = r8 - 1;
                int r0 = DW(r17 - 1, r2);
                int r1 = this.j6.DW(r0);
                int r13 = VH(r2, r1);
                if (r1 == r13) goto L12;
                long r3 = Zo(r2, r13);
            L13:
                long r14 = r3;
                if (j6(r17, r2, r13, r14) == true) goto L15;
                int r15 = DW(r13);
            L19:
                if (r8 >= this.VH) goto L28;
                int r4 = r8 + 1;
                int r5 = DW(r17 - 1, r4);
                int r6 = this.j6.DW(r5);
                int r10 = VH(r4, r6);
                if (r6 == r10) goto L23;
                long r7 = Zo(r4, r10);
            L24:
                long r11 = r7;
                if (j6(r17, r4, r10, r11) == true) goto L26;
                int r12 = FH(r10);
                r9 = r11;
            L30:
                if (r8 >= this.VH) goto L38;
                if (r8 > this.Zo) goto L34;
            L36:
                r15 = r12;
                r14 = r9;
                goto L38
            L34:
                if (v5(r15, r12) == false) goto L36;
            L38:
                if (j6(r17, r8, r15, r14) == true) goto L39;
                j6(r8, r15);
                int r16 = DW(r17, r8);
                this.j6.DW(r16, r15);
                this.DW.j6(r16, r14);
                r8 = r8 - 2;
                goto L4
            L39:
                return true;
            L26:
                return true;
            L23:
                r7 = this.DW.j6(r5);
                goto L24
            L28:
                r12 = -1;
                goto L30
            L15:
                return true;
            L12:
                r3 = this.DW.j6(r0);
                goto L13
            L17:
                r14 = -1;
                r15 = -1;
                goto L19
            L5:
                return false;
            }

            abstract boolean j6(int r1, int r2, int r3, long r4);

            final boolean j6(long r3, long r5) {
                int r0 = j6(r3);
                int r1 = j6(r5);
                int r4 = DW(r3);
                int r6 = DW(r5);
                if (r0 > r1) goto L5;
                if (r4 > r6) goto L5;
            L6:
                abcd.sC.a r7 = this.tp;
                r7.VH = new abcd.jC(r0, r1, r4, r6);
                return true;
            L5:
                r4 = r6;
                r0 = r1;
                goto L6
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
            L2:
                abcd.sC.a r0 = this.EQ;
                if (r6 >= r0.Hw) goto L11;
                int r1 = r5 + r6;
                if (r1 >= r0.Zo) goto L11;
                if (abcd.sC.a.j6(r0).FH.j6(abcd.sC.a.j6(this.EQ).Hw, r6, abcd.sC.a.j6(this.EQ).v5, r1) == false) goto L11;
                r6 = r6 + 1;
            L11:
                return r6;
            }

            final void j6(int r3, int r4) {
                abcd.sC.a r0 = this.EQ;
                if (r4 >= r0.Hw) goto L7;
                if ((r4 + r3) >= r0.Zo) goto L7;
                return;
            L7:
                if (r3 <= this.EQ.DW.v5) goto L9;
                this.u7 = r3;
                return;
            L9:
                this.gn = r3;
            }

            final boolean j6(int r6, int r7, int r8, long r9) {
                sC<S>.a.b r0 = this.EQ.DW;
                if (r7 >= r0.FH) goto L5;
            L15:
                return false;
            L5:
                if (r7 > r0.Hw) goto L15;
                int r10 = r6 - 1;
                if ((((r10 + r7) - r0.v5) % 2) == 0) goto L11;
                return false;
            L11:
                if (r8 >= r0.Hw(r10, r7)) goto L13;
                return false;
            L13:
                j6(r9, this.EQ.DW.FH(r10, r7));
                return true;
            }

            final boolean v5(int r1, int r2) {
                if (r1 <= r2) goto L5;
                return true;
            L5:
                return false;
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
            if (r4 == r5) goto L15;
            if (r6 == r7) goto L15;
            this.FH = r4;
            this.Hw = r5;
            this.v5 = r6;
            this.Zo = r7;
            int r0 = r6 - r5;
            int r1 = r7 - r4;
            this.j6.j6(r6 - r4, r4, r0, r1);
            this.DW.j6(r7 - r5, r5, r0, r1);
            int r8 = 1;
        L7:
            if (this.j6.j6(r8) == true) goto L13;
            if (this.DW.j6(r8) == true) goto L13;
            r8 = r8 + 1;
        L13:
            return this.VH;
        L15:
            return new abcd.jC(r4, r5, r6, r7);
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
        this.Zo.DW(r5.j6, r5.DW, r5.FH, r5.Hw);
        sC<S>.a r6 = this.Zo;
        if (r6.FH >= r6.Hw) goto L5;
    L7:
        sC<S>.a r7 = this.Zo;
        j6(r7.FH, r7.Hw, r7.v5, r7.Zo);
        return;
    L5:
        if (r6.v5 < r6.Zo) goto L7;
    }

    protected void j6(int r5, int r6, int r7, int r8) {
        abcd.jC r0 = this.Zo.j6(r5, r6, r7, r8);
        if (r5 >= r0.j6) goto L5;
    L6:
        int r1 = r0.FH;
        int r2 = r0.j6;
        int r3 = r1 - r2;
        int r4 = this.Zo.DW.VH(r3, r2);
        j6(r5, r4, r7, r3 + r4);
    L8:
        if (r0.gn() == abcd.jC.a.Hw) goto L11;
        abcd.kC r9 = this.DW;
        r9.add(r9.size(), r0);
    L11:
        if (r6 <= r0.DW) goto L13;
    L14:
        int r10 = r0.Hw;
        int r11 = r0.DW;
        int r12 = r10 - r11;
        int r13 = this.Zo.j6.VH(r12, r11);
        j6(r13, r6, r12 + r13, r8);
        return;
    L13:
        if (r8 > r0.Hw) goto L14;
        return;
    L5:
        if (r7 >= r0.FH) goto L8;
        goto L6
    }
}
