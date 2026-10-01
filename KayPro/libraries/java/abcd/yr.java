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
            if (abcd.nu.j6(r5, 255) > 0) goto L6;
            int r0 = 1;
        L12:
            this.DW.writeByte(r4 | ((r0 - 1) << 5));
            int r6 = 0;
        L13:
            if (r6 >= r0) goto L15;
            this.DW.writeByte(r5 & 255);
            r5 = r5 >>> 8;
            r6 = r6 + 1;
            goto L13
        L15:
            return;
        L6:
            if (abcd.nu.j6(r5, 65535) > 0) goto L9;
            r0 = 2;
            goto L12
        L9:
            if (abcd.nu.j6(r5, 16777215) > 0) goto L11;
            r0 = 3;
            goto L12
        L11:
            r0 = 4;
            goto L12
        }

        private void j6(abcd.St r3, abcd.Tt r4, int r5) {
            int r0 = 0;
        L3:
            if (r0 >= r5) goto L5;
            r4.writeByte(r3.readByte());
            r0 = r0 + 1;
            goto L3
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
        abcd._p.a[] r0 = new abcd._p.a[r4.length];
        int r1 = 0;
    L4:
        if (r1 >= r4.length) goto L6;
        r0[r1] = j6(r4[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    private abcd._p.b[] j6(abcd._p.b[] r4) {
        abcd._p.b[] r0 = new abcd._p.b[r4.length];
        int r1 = 0;
    L4:
        if (r1 >= r4.length) goto L6;
        r0[r1] = j6(r4[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
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
        if (r2 <= 0) goto L7;
        if (r3 <= 0) goto L7;
        this.VH.DW(r2, r3);
        return;
    L7:
        throw new java.lang.IllegalArgumentException();
    }

    public int EQ(int r2) {
        return this.Zo.j6(r2);
    }

    public void EQ(int r2, int r3) {
        if (r2 <= 0) goto L7;
        if (r3 <= 0) goto L7;
        this.Zo.DW(r2, r3);
        return;
    L7:
        throw new java.lang.IllegalArgumentException();
    }

    public int FH(int r2) {
        return this.gn.j6(r2);
    }

    public void FH(int r2, int r3) {
        if (r2 <= 0) goto L7;
        if (r3 <= 0) goto L7;
        this.gn.DW(r2, r3);
        return;
    L7:
        throw new java.lang.IllegalArgumentException();
    }

    public int Hw(int r2) {
        return this.u7.j6(r2);
    }

    public void Hw(int r2, int r3) {
        if (r2 <= 0) goto L7;
        if (r3 <= 0) goto L7;
        this.u7.DW(r2, r3);
        return;
    L7:
        throw new java.lang.IllegalArgumentException();
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
        int[] r5 = (int[]) r8.Hw().clone();
        abcd.jq[] r6 = (abcd.jq[]) r8.VH().clone();
        int r0 = 0;
    L4:
        if (r0 >= r5.length) goto L7;
        r5[r0] = u7(r5[r0]);
        r6[r0] = DW(r6[r0]);
        r0 = r0 + 1;
        goto L4
    L7:
        return new abcd.Vp(null, r8.we(), tp(r8.Zo()), r5, r6);
    }

    public abcd.Wp j6(abcd.Wp r10) {
        int r2 = FH(r10.j6());
        int[] r3 = (int[]) r10.FH().clone();
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r3.length) goto L6;
        r3[r1] = Zo(r3[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        int[] r4 = (int[]) r10.DW().clone();
        int r5 = 0;
    L8:
        if (r5 >= r4.length) goto L10;
        r4[r5] = FH(r4[r5]);
        r5 = r5 + 1;
        goto L8
    L10:
        int[] r6 = (int[]) r10.v5().clone();
        int r7 = 0;
    L12:
        if (r7 >= r6.length) goto L14;
        r6[r7] = VH(r6[r7]);
        r7 = r7 + 1;
        goto L12
    L14:
        int[] r8 = (int[]) r10.Hw().clone();
        int r9 = 0;
    L16:
        if (r9 >= r8.length) goto L18;
        r8[r9] = FH(r8[r9]);
        r9 = r9 + 1;
        goto L16
    L18:
        int[] r11 = (int[]) r10.VH().clone();
        int r12 = 0;
    L20:
        if (r12 >= r11.length) goto L22;
        r11[r12] = VH(r11[r12]);
        r12 = r12 + 1;
        goto L20
    L22:
        int[] r13 = (int[]) r10.Zo().clone();
    L24:
        if (r0 >= r13.length) goto L27;
        r13[r0] = Hw(r13[r0]);
        r0 = r0 + 1;
        goto L24
    L27:
        return new abcd.Wp(r2, r3, r4, r6, r8, r11, r13);
    }

    public abcd.Xp j6(abcd.Xp r3) {
        int[] r4 = (int[]) r3.j6().clone();
        int r0 = 0;
    L4:
        if (r0 >= r4.length) goto L7;
        r4[r0] = j6(r4[r0]);
        r0 = r0 + 1;
        goto L4
    L7:
        return new abcd.Xp(r4);
    }

    public abcd.Yp j6(abcd.Yp r3) {
        int[] r4 = r3.j6();
        int r0 = 0;
    L4:
        if (r0 >= r4.length) goto L7;
        r4[r0] = FH(r4[r0]);
        r0 = r0 + 1;
        goto L4
    L7:
        return new abcd.Yp(r4);
    }

    public abcd._p j6(abcd._p r5) {
        return new abcd._p(j6(r5.Hw()), j6(r5.FH()), j6(r5.DW()), j6(r5.v5()));
    }

    public abcd.aq j6(abcd.aq r13) {
        return new abcd.aq(null, r13.v5(), tp(r13.u7()), r13.j6(), tp(r13.gn()), EQ(r13.Hw()), u7(r13.Zo()), DW(r13.DW()), r13.FH(), v5(r13.VH()));
    }

    public abcd.fr j6(abcd.fr r3) {
        if (r3 != abcd.fr.j6) goto L5;
        return r3;
    L5:
        short[] r4 = (short[]) r3.Hw().clone();
        int r0 = 0;
    L7:
        if (r0 >= r4.length) goto L10;
        r4[r0] = (short) tp(r4[r0]);
        r0 = r0 + 1;
        goto L7
    L10:
        return new abcd.fr(null, r4);
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
        if (r2 <= 0) goto L7;
        if (r3 <= 0) goto L7;
        this.tp.DW(r2, r3);
        return;
    L7:
        throw new java.lang.IllegalArgumentException();
    }

    public int tp(int r2) {
        if (r2 != (-1)) goto L6;
        return -1;
    L6:
        return 65535 & this.DW[r2];
    }

    public void tp(int r2, int r3) {
        this.DW[r2] = (short) r3;
    }

    public int u7(int r2) {
        if (r2 != (-1)) goto L6;
        return -1;
    L6:
        return this.j6[r2];
    }

    public void u7(int r2, int r3) {
        this.j6[r2] = r3;
    }

    public int v5(int r2) {
        return this.EQ.j6(r2);
    }

    public void v5(int r2, int r3) {
        if (r2 <= 0) goto L7;
        if (r3 <= 0) goto L7;
        this.EQ.DW(r2, r3);
        return;
    L7:
        throw new java.lang.IllegalArgumentException();
    }
}
