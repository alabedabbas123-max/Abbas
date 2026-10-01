package abcd;

public final class Zm {
    private final abcd.Im DW;
    private boolean EQ;
    private final int FH;
    private final int Hw;
    private boolean J0;
    private final abcd.Om[] VH;
    private final abcd.C0575bn Zo;
    private final java.util.ArrayList<abcd.Nr> gn;
    private final abcd.C0272Mm j6;
    private final abcd.Qs[] tp;
    private final java.util.ArrayList<abcd.au> u7;
    private final abcd.C0496_m v5;
    private final abcd.Zm.b[] we;

    private static class a {
        int j6;

        a(int r1) {
            this.j6 = r1;
        }

        int j6() {
            int r0 = this.j6;
            this.j6 = r0 + 1;
            return r0;
        }
    }

    private class b {
        private java.util.BitSet DW;
        private int FH;
        final abcd.Zm Hw;
        private java.util.BitSet j6;

        b(abcd.Zm r2, int r3) {
            this.Hw = r2;
            this.FH = r3;
            this.DW = new java.util.BitSet(abcd.Zm.j6(r2));
            this.j6 = new java.util.BitSet(abcd.Zm.j6(r2));
            abcd.Zm.j6(r2, true);
        }

        b(abcd.Zm r1, int r2, int r3) {
            this(r1, r2);
            DW(r3);
        }

        static int DW(abcd.Zm.b r0) {
            return r0.FH;
        }

        static java.util.BitSet j6(abcd.Zm.b r0) {
            return r0.DW;
        }

        abcd.au DW() {
            abcd.au r0 = new abcd.au(this.j6.size());
            int r1 = this.j6.nextSetBit(0);
        L3:
            if (r1 < 0) goto L5;
            r0.DW(abcd.Zm.j6(this.Hw, r1).gn().get(0));
            r1 = this.j6.nextSetBit(r1 + 1);
            goto L3
        L5:
            r0.we();
            return r0;
        }

        void DW(int r2) {
            this.DW.set(r2);
        }

        int j6() {
            return this.FH;
        }

        void j6(int r2) {
            this.j6.set(r2);
        }

        void j6(abcd.Om r10, int[] r11) {
            int r0 = this.j6.nextSetBit(0);
        L3:
            if (r0 < 0) goto L9;
            int r4 = abcd.Zm.j6(this.Hw, r0).gn().get(0);
            abcd.Om r7 = r10.DW(this.FH, r0);
            if (r7 == null) goto L7;
            abcd.Zm.j6(this.Hw, r4, -1, null, r7, r11);
        L8:
            r0 = this.j6.nextSetBit(r0 + 1);
            goto L3
        L7:
            abcd.Ot.Hw(r11, r0);
            goto L8
        }
    }

    private class c {
        private final java.util.BitSet DW;
        private int FH;
        private int Hw;
        final abcd.Zm VH;
        private final java.util.ArrayList<abcd.au> Zo;
        private final java.util.HashMap<java.lang.Integer, java.lang.Integer> j6;
        private final abcd.Zm.a v5;

        c(abcd.Zm r2, abcd.Zm.a r3, java.util.ArrayList<abcd.au> r4) {
            this.VH = r2;
            this.j6 = new java.util.HashMap();
            this.DW = new java.util.BitSet(abcd.Zm.j6(r2));
            this.v5 = r3;
            this.Zo = r4;
        }

        private boolean DW(int r2, int r3) {
            abcd.au r4 = this.Zo.get(r2);
            if (r4 != null) goto L5;
        L9:
            return false;
        L5:
            if (r4.size() <= 0) goto L9;
            if (r4.yS() != r3) goto L9;
            return true;
        }

        private int j6(int r5) {
            java.lang.Integer r0 = this.j6.get(java.lang.Integer.valueOf(r5));
            if (r0 == null) goto L6;
            return r0.intValue();
        L6:
            if (DW(r5, this.FH) == false) goto L16;
            int r1 = this.v5.j6();
            this.DW.set(r5);
            this.j6.put(java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r1));
        L10:
            if (this.Zo.size() > r1) goto L12;
            this.Zo.add(null);
            goto L10
        L12:
            java.util.ArrayList<abcd.au> r2 = this.Zo;
            r2.set(r1, r2.get(r5));
            return r1;
        L16:
            return r5;
        }

        private void j6(int r9, int r10) {
            abcd.Nr r0 = abcd.Zm.j6(this.VH, r9);
            abcd.au r1 = r0.gn();
            int r3 = 0;
            int r4 = -1;
            if (abcd.Zm.j6(this.VH, r0) == false) goto L5;
            abcd.au r11 = abcd.au.DW(j6(r1.get(0)), r1.get(1));
        L19:
            abcd.Zm r2 = this.VH;
            abcd.Zm.DW(r2, new abcd.Nr(r10, abcd.Zm.j6(r2, r0.Hw()), r11, r4), this.Zo.get(r10));
            return;
        L5:
            abcd.Zm.b r12 = abcd.Zm.DW(this.VH, r9);
            if (r12 != null) goto L8;
            int r13 = r0.Zo();
            int r5 = r1.size();
            abcd.au r6 = new abcd.au(r5);
        L13:
            if (r3 >= r5) goto L18;
            int r7 = r1.get(r3);
            int r8 = j6(r7);
            r6.DW(r8);
            if (r13 != r7) goto L17;
            r4 = r8;
        L17:
            r3 = r3 + 1;
            goto L13
        L18:
            r6.we();
            r11 = r6;
            goto L19
        L8:
            if (abcd.Zm.b.DW(r12) != this.FH) goto L11;
            r11 = abcd.au.Zo(this.Hw);
            r4 = this.Hw;
            goto L19
        L11:
            throw new java.lang.RuntimeException("ret instruction returns to label " + abcd.Yt.v5(abcd.Zm.b.DW(r12)) + " expected: " + abcd.Yt.v5(this.FH));
        }

        void j6(abcd.Nr r8) {
            this.Hw = r8.gn().get(0);
            this.FH = r8.gn().get(1);
            int r0 = j6(this.FH);
            int r2 = this.DW.nextSetBit(0);
        L3:
            if (r2 < 0) goto L8;
            this.DW.clear(r2);
            int r3 = this.j6.get(java.lang.Integer.valueOf(r2)).intValue();
            j6(r2, r3);
            abcd.Zm r4 = this.VH;
            if (abcd.Zm.j6(r4, abcd.Zm.j6(r4, r2)) == false) goto L7;
            new abcd.Zm.c(this.VH, this.v5, this.Zo).j6(abcd.Zm.j6(this.VH, r3));
        L7:
            r2 = this.DW.nextSetBit(0);
            goto L3
        L8:
            abcd.Zm.j6(this.VH, new abcd.Nr(r8.DW(), r8.Hw(), abcd.au.Zo(r0), r0), this.Zo.get(r8.DW()));
        }
    }

    private Zm(abcd.C0272Mm r4, abcd.Interfacels r5) {
        if (r4 == null) goto L10;
        if (r5 == null) goto L8;
        this.j6 = r4;
        this.DW = abcd.C0177Gm.j6(r4);
        this.Hw = this.DW.rN();
        this.FH = r4.tp();
        this.v5 = new abcd.C0496_m(this, r4, r5);
        this.Zo = new abcd.C0575bn(this.v5, r4);
        int r6 = this.Hw;
        this.VH = new abcd.Om[r6];
        this.we = new abcd.Zm.b[r6];
        this.gn = new java.util.ArrayList((this.DW.size() * 2) + 10);
        this.u7 = new java.util.ArrayList((this.DW.size() * 2) + 10);
        this.tp = new abcd.Qs[this.Hw];
        this.EQ = false;
        this.VH[0] = new abcd.Om(this.FH, r4.EQ());
        return;
    L8:
        throw new java.lang.NullPointerException("advice == null");
    L10:
        throw new java.lang.NullPointerException("method == null");
    }

    private int DW(int r2) {
        return (this.Hw * 2) + (r2 ^ (-1));
    }

    static abcd.Zm.b DW(abcd.Zm r0, int r1) {
        return r0.Zo(r1);
    }

    private void DW() {
        int r0 = this.tp.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        abcd.Qs r3 = this.tp[r2];
        if (r3 == null) goto L7;
        abcd.hs r4 = FH(r2).FH().Zo();
        abcd.Ur r5 = new abcd.Ur(2);
        r5.j6(0, new abcd.Zr(abcd.gs.tp(r3), r4, abcd.bs.j6(this.FH, r3), abcd.cs.FH));
        r5.j6(1, new abcd.Zr(abcd.gs.j3, r4, null, abcd.cs.FH));
        r5.we();
        j6(new abcd.Nr(j6(r2), r5, abcd.au.Zo(r2), r2), this.VH[r2].Hw());
    L7:
        r2 = r2 + 1;
        goto L3
    }

    static void DW(abcd.Zm r0, abcd.Nr r1, abcd.au r2) {
        r0.j6(r1, r2);
    }

    private boolean DW(abcd.Nr r3, abcd.au r4) {
        if (r3 == null) goto L10;
        int r0 = Hw(r3.DW());
        if (r0 >= 0) goto L6;
        boolean r1 = false;
    L7:
        this.gn.add(r3);
        r4.Ws();
        this.u7.add(r4);
        return r1;
    L6:
        v5(r0);
        r1 = true;
        goto L7
    L10:
        throw new java.lang.NullPointerException("block == null");
    }

    private abcd.fs EQ() {
        int r0 = this.gn.size();
        abcd.Or r1 = new abcd.Or(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.j6(r2, this.gn.get(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        r1.we();
        return new abcd.fs(r1, DW(-1));
    }

    private abcd.Nr FH(int r4) {
        int r0 = Hw(r4);
        if (r0 < 0) goto L7;
        return this.gn.get(r0);
    L7:
        throw new java.lang.IllegalArgumentException("no such label " + abcd.Yt.v5(r4));
    }

    private void FH() {
        abcd.es r0 = this.v5.aM();
        if (r0 != null) goto L5;
        return;
    L5:
        abcd.hs r1 = this.v5.j3();
        int r2 = DW(-2);
        if (Ws() == false) goto L8;
        abcd.Ur r3 = new abcd.Ur(1);
        r3.j6(0, new abcd.ks(abcd.gs.Yi, r1, abcd.cs.j6(we()), abcd.Ps.FH));
        r3.we();
        int r6 = DW(-3);
        j6(new abcd.Nr(r2, r3, abcd.au.Zo(r6), r6), abcd.au.DW);
        r2 = r6;
    L8:
        abcd.Ur r4 = new abcd.Ur(1);
        abcd.Ss r5 = r0.Zo();
        if (r5.size() != 0) goto L11;
        abcd.cs r7 = abcd.cs.FH;
    L12:
        r4.j6(0, new abcd.Zr(r0, r1, null, r7));
        r4.we();
        j6(new abcd.Nr(r2, r4, abcd.au.DW, -1), abcd.au.DW);
        return;
    L11:
        r7 = abcd.cs.j6(abcd.bs.j6(0, r5.getType(0)));
        goto L12
    }

    private boolean FH(abcd.Nr r3, abcd.au r4) {
        if (r3 == null) goto L10;
        int r0 = Hw(r3.DW());
        if (r0 >= 0) goto L6;
        boolean r1 = false;
    L7:
        this.gn.add(r3);
        r4.Ws();
        this.u7.add(r4);
        return r1;
    L6:
        this.gn.remove(r0);
        this.u7.remove(r0);
        r1 = true;
        goto L7
    L10:
        throw new java.lang.NullPointerException("block == null");
    }

    private int Hw(int r4) {
        int r0 = this.gn.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (this.gn.get(r1).DW() == r4) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    private void Hw() {
        abcd.Qm r1 = this.j6.u7();
        int r3 = 0;
        abcd.hs r2 = this.j6.j6(0);
        abcd.Ps r10 = this.j6.v5().VH();
        int r11 = r10.size();
        abcd.Ur r12 = new abcd.Ur(r11 + 1);
        int r13 = 0;
        int r14 = 0;
    L3:
        if (r13 >= r11) goto L9;
        abcd.Qs r15 = r10.get(r13);
        abcd.Qm.a r4 = r1.j6(r3, r14);
        if (r4 != null) goto L7;
        abcd.bs r5 = abcd.bs.j6(r14, r15);
    L8:
        abcd.es r6 = abcd.gs.EQ(r15);
        r12.j6(r13, new abcd.Yr(r6, r2, r5, abcd.cs.FH, abcd.ys.j6(r14)));
        r14 = r14 + r15.Zo();
        r13 = r13 + 1;
        r3 = 0;
        goto L3
    L7:
        r5 = abcd.bs.FH(r14, r15, r4.j6());
        goto L8
    L9:
        r12.j6(r11, new abcd.Zr(abcd.gs.j3, r2, null, abcd.cs.FH));
        r12.we();
        boolean r7 = Ws();
        if (r7 == false) goto L12;
        int r8 = DW(-4);
    L13:
        j6(new abcd.Nr(DW(-1), r12, abcd.au.Zo(r8), r8), abcd.au.DW);
        if (r7 == false) goto L31;
        abcd.bs r9 = we();
        int r16 = 2;
        if (J8() == false) goto L18;
        abcd.js r17 = new abcd.js(abcd.gs.XL, r2, abcd.cs.FH, abcd.Ps.FH, this.j6.DW());
        abcd.Ur r18 = new abcd.Ur(1);
        r18.j6(0, r17);
    L19:
        int r19 = DW(-5);
        r18.we();
        j6(new abcd.Nr(r8, r18, abcd.au.Zo(r19), r19), abcd.au.DW);
        if (J8() == true) goto L23;
        r16 = 1;
    L23:
        abcd.Ur r20 = new abcd.Ur(r16);
        if (J8() == false) goto L26;
        r20.j6(0, new abcd.Zr(abcd.gs.J0(r9), r2, r9, abcd.cs.FH));
    L26:
        abcd.ks r21 = new abcd.ks(abcd.gs.dW, r2, abcd.cs.j6(r9), abcd.Ps.FH);
        r20.j6(J8() ? 1 : 0, r21);
        r20.we();
        j6(new abcd.Nr(r19, r20, abcd.au.Zo(0), 0), abcd.au.DW);
        return;
    L18:
        abcd.Ur r110 = new abcd.Ur(2);
        r110.j6(0, new abcd.Yr(abcd.gs.we, r2, r9, abcd.cs.FH, abcd.ys.Hw));
        r110.j6(1, new abcd.Zr(abcd.gs.j3, r2, null, abcd.cs.FH));
        r18 = r110;
        goto L19
    L31:
        return;
    L12:
        r8 = 0;
        goto L13
    }

    private void J0() {
        abcd.au r0 = new abcd.au(4);
        int r2 = 0;
        j6(0, new abcd.Xm(this, r0));
        int r1 = gn();
        java.util.ArrayList r3 = new java.util.ArrayList(r1);
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L5;
        r3.add(null);
        r4 = r4 + 1;
        goto L3
    L5:
        int r5 = 0;
    L7:
        if (r5 >= this.gn.size()) goto L13;
        abcd.Nr r6 = this.gn.get(r5);
        if (r6 == null) goto L12;
        abcd.au r7 = this.u7.get(r5);
        r3.set(r6.DW(), r7);
    L12:
        r5 = r5 + 1;
        goto L7
    L13:
        int r8 = r0.size();
    L14:
        if (r2 >= r8) goto L16;
        int r9 = r0.get(r2);
        new abcd.Zm.c(this, new abcd.Zm.a(gn()), r3).j6(FH(r9));
        r2 = r2 + 1;
        goto L14
    L16:
        Zo();
    }

    private boolean J8() {
        if ((this.j6.j6() & 8) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private void QX() {
        abcd.Os r0 = this.j6.v5();
        this.VH[0].j6(r0.VH());
        this.VH[0].v5();
    }

    private void VH() {
        int[] r0 = abcd.Ot.j6(this.Hw);
        abcd.Ot.Hw(r0, 0);
        Hw();
        QX();
    L3:
        int r2 = abcd.Ot.DW(r0, 0);
        if (r2 < 0) goto L5;
        abcd.Ot.j6(r0, r2);
        j6(this.DW.v5(r2), this.VH[r2], r0);     // Catch: abcd.an -> L12
    L12:
        e = move-exception;
        e.j6("...while working on block " + abcd.Yt.v5(r2));
        throw e;
    L5:
        FH();
        v5();
        DW();
        if (this.J0 == false) goto L20;
        J0();
        return;
    }

    private boolean Ws() {
        if ((this.j6.j6() & 32) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private abcd.Zm.b Zo(int r4) {
        int r0 = this.we.length - 1;
    L3:
        if (r0 < 0) goto L10;
        abcd.Zm.b[] r1 = this.we;
        if (r1[r0] == null) goto L9;
        abcd.Zm.b r2 = r1[r0];
        if (abcd.Zm.b.j6(r2).get(r4) == false) goto L9;
        return r2;
    L9:
        r0 = r0 - 1;
        goto L3
    L10:
        return null;
    }

    private void Zo() {
        abcd.au r0 = new abcd.au(this.gn.size());
        this.u7.clear();
        j6(DW(-1), new abcd.Ym(this, r0));
        r0.er();
        int r1 = this.gn.size() - 1;
    L3:
        if (r1 < 0) goto L8;
        if (r0.v5(this.gn.get(r1).DW()) >= 0) goto L7;
        this.gn.remove(r1);
    L7:
        r1 = r1 - 1;
        goto L3
    }

    private int gn() {
        int r0 = u7();
        java.util.Iterator<abcd.Nr> r1 = this.gn.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        int r2 = r1.next().DW();
        if (r2 < r0) goto L4;
        r0 = r2 + 1;
        goto L4
    L8:
        return r0;
    }

    private int j6(int r2) {
        return this.Hw + r2;
    }

    static int j6(abcd.Zm r0) {
        return r0.Hw;
    }

    static abcd.Nr j6(abcd.Zm r0, int r1) {
        return r0.FH(r1);
    }

    private abcd.Ur j6(abcd.Ur r8) {
        int r0 = r8.size();
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L8;
        if (r8.get(r2).v5() == abcd.gs.VH) goto L7;
        r3 = r3 + 1;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        if (r3 != r0) goto L10;
        return r8;
    L10:
        abcd.Ur r4 = new abcd.Ur(r3);
        int r5 = 0;
    L11:
        if (r1 >= r0) goto L16;
        abcd.Tr r6 = r8.get(r1);
        if (r6.v5() == abcd.gs.VH) goto L15;
        r4.j6(r5, r6);
        r5 = r5 + 1;
    L15:
        r1 = r1 + 1;
        goto L11
    L16:
        r4.we();
        return r4;
    }

    static abcd.Ur j6(abcd.Zm r0, abcd.Ur r1) {
        return r0.j6(r1);
    }

    public static abcd.fs j6(abcd.C0272Mm r2, abcd.Interfacels r3) {
        abcd.Zm r0 = new abcd.Zm(r2, r3);     // Catch: abcd.an -> L4
        r0.VH();     // Catch: abcd.an -> L4
        return r0.EQ();
    L4:
        e = move-exception;
        e.j6("...while working on method " + r2.FH().aM());
        throw e;
    }

    private void j6(int r3, int r4, abcd.Zm.b r5, abcd.Om r6, int[] r7) {
        abcd.Om[] r0 = this.VH;
        abcd.Om r1 = r0[r3];
        if (r1 == null) goto L9;
        if (r5 == null) goto L6;
        abcd.Om r8 = r1.j6(r6, r5.j6(), r4);
    L7:
        if (r8 == r1) goto L14;
        this.VH[r3] = r8;
        abcd.Ot.Hw(r7, r3);
        return;
    L14:
        return;
    L6:
        r8 = r1.j6(r6);
        goto L7
    L9:
        if (r5 == null) goto L11;
        r0[r3] = r6.j6(r3, r4);
    L12:
        abcd.Ot.Hw(r7, r3);
        return;
    L11:
        r0[r3] = r6;
        goto L12
    }

    private void j6(int r3, abcd.Nr.a r4) {
        j6(FH(r3), r4, new java.util.BitSet(this.Hw));
    }

    private void j6(abcd.Hm r24, abcd.Om r25, int[] r26) {
        abcd.Jm r0 = r24.j6();
        this.v5.j6(r0.rN());
        abcd.Om r8 = r25.j6();
        this.Zo.j6(r24, r8);
        r8.v5();
        int r10 = this.v5.J8();
        java.util.ArrayList<abcd.Tr> r11 = this.v5.Ws();
        int r12 = r11.size();
        int r13 = r0.size();
        abcd.au r1 = r24.v5();
        if (this.v5.Mr() == false) goto L9;
        int r2 = r1.get(1);
        abcd.Zm.b[] r3 = this.we;
        if (r3[r2] != null) goto L7;
        r3[r2] = new abcd.Zm.b(this, r2);
    L7:
        this.we[r2].j6(r24.DW());
        abcd.au r4 = r1;
        abcd.Zm.b r16 = this.we[r2];
        int r5 = 1;
    L20:
        int r6 = r4.size();
        int r7 = r5;
    L21:
        if (r7 >= r6) goto L28;
        int r17 = r4.get(r7);
        int r19 = r7;
        int r20 = r6;
        abcd.au r18 = r4;
        j6(r17, r24.DW(), r16, r8, r26);     // Catch: abcd.an -> L25
        r7 = r19 + 1;
        r4 = r18;
        r6 = r20;
    L25:
        e = move-exception;
        e.j6("...while merging to block " + abcd.Yt.v5(r17));
        throw e;
    L28:
        int r21 = r6;
        abcd.au r110 = r4;
        if (r21 == 0) goto L31;
    L33:
        abcd.au r9 = r110;
        int r14 = r21;
    L34:
        if (r14 != 0) goto L36;
        int r15 = -1;
    L41:
        if (Ws() == true) goto L43;
    L45:
        boolean r111 = false;
    L46:
        if (r111 == true) goto L50;
        if (r13 != 0) goto L50;
        abcd.au r112 = r9;
        int r22 = r15;
    L84:
        int r23 = r112.v5(r22);
    L85:
        if (r10 <= 0) goto L99;
        r12 = r12 - 1;
        abcd.Tr r27 = r11.get(r12);
        if (r27.v5().DW() != 1) goto L89;
        boolean r28 = true;
    L91:
        if (r28 == false) goto L93;
        int r29 = 2;
    L94:
        abcd.Ur r30 = new abcd.Ur(r29);
        r30.j6(0, r27);
        if (r28 == false) goto L97;
        r30.j6(1, new abcd.Zr(abcd.gs.j3, r27.Zo(), null, abcd.cs.FH));
        abcd.au r31 = abcd.au.Zo(r22);
    L98:
        r30.we();
        int r32 = gn();
        j6(new abcd.Nr(r32, r30, r31, r22), r8.Hw());
        r112 = r112.lg();
        r112.FH(r23, r32);
        r112.we();
        r10 = r10 - 1;
        r22 = r32;
        goto L85
    L97:
        r31 = r112;
        goto L98
    L93:
        r29 = 1;
        goto L94
    L89:
        r28 = false;
        goto L91
    L99:
        int r33 = 0;
        if (r12 != 0) goto L102;
        abcd.Tr r34 = null;
    L103:
        if (r34 != null) goto L105;
    L106:
        if (r34 != null) goto L108;
        abcd.hs r35 = abcd.hs.j6;
    L109:
        r11.add(new abcd.Zr(abcd.gs.j3, r35, null, abcd.cs.FH));
        r12 = r12 + 1;
    L110:
        abcd.Ur r36 = new abcd.Ur(r12);
    L111:
        if (r33 >= r12) goto L113;
        r36.j6(r33, r11.get(r33));
        r33 = r33 + 1;
        goto L111
    L113:
        r36.we();
        DW(new abcd.Nr(r24.DW(), r36, r112, r22), r8.Hw());
        return;
    L108:
        r35 = r34.Zo();
        goto L109
    L105:
        if (r34.v5().DW() != 1) goto L110;
    L102:
        r34 = r11.get(r12 - 1);
    L50:
        abcd.au r37 = new abcd.au(r14);
        boolean r38 = false;
        int r39 = 0;
    L51:
        if (r39 >= r13) goto L72;
        abcd.Jm.a r40 = r0.get(r39);
        abcd.Ks r41 = r40.DW();
        int r42 = r40.FH();
        if (r41 != abcd.Ks.DW) goto L55;
        boolean r113 = true;
    L56:
        boolean r114 = r113 | r38;
        int r115 = r39;
        abcd.au r116 = r37;
        abcd.Jm r117 = r0;
        int r43 = r15;
        j6(r42, r24.DW(), null, r8.j6(r41), r26);     // Catch: abcd.an -> L67
        abcd.Qs[] r44 = this.tp;
        abcd.Qs r45 = r44[r42];
        if (r45 != null) goto L64;
        r44[r42] = r41.VH();
    L66:
        r116.DW(j6(r42));
        r39 = r115 + 1;
        r15 = r43;
        r37 = r116;
        r38 = r114;
        r0 = r117;
        goto L51
    L64:
        if (r45 == r41.VH()) goto L66;
        this.tp[r42] = abcd.Qs.QX;
    L67:
        e = e;
        r42 = r42;
    L70:
        e.j6("...while merging exception to block " + abcd.Yt.v5(r42));
        throw e;
    L69:
        e = e;
        goto L70
    L55:
        r113 = false;
        goto L56
    L72:
        r112 = r37;
        r22 = r15;
        if (r111 == false) goto L81;
        if (r38 == true) goto L81;
        r112.DW(DW(-6));
        this.EQ = true;
        int r46 = (r12 - r10) - 1;
    L76:
        if (r46 >= r12) goto L81;
        abcd.Tr r47 = r11.get(r46);
        if (r47.j6() == false) goto L80;
        r11.set(r46, r47.j6(abcd.Qs.QX));
    L80:
        r46 = r46 + 1;
    L81:
        if (r22 < 0) goto L83;
        r112.DW(r22);
    L83:
        r112.we();
        goto L84
    L43:
        if (this.v5.J0() == false) goto L45;
        r111 = true;
        goto L46
    L36:
        int r48 = this.v5.QX();
        if (r48 < 0) goto L39;
        r48 = r9.get(r48);
    L39:
        r15 = r48;
        goto L41
    L31:
        if (this.v5.a8() == false) goto L33;
        r9 = abcd.au.Zo(DW(-2));
        r14 = 1;
        goto L34
    L9:
        if (this.v5.U2() == false) goto L16;
        int r49 = this.v5.XL().j6();
        abcd.Zm.b[] r50 = this.we;
        if (r50[r49] != null) goto L13;
        r50[r49] = new abcd.Zm.b(this, r49, r24.DW());
    L14:
        abcd.au r51 = this.we[r49].DW();
        this.we[r49].j6(r8, r26);
        r5 = r51.size();
        r4 = r51;
    L19:
        r16 = null;
        goto L20
    L13:
        r50[r49].DW(r24.DW());
        goto L14
    L16:
        if (this.v5.lg() == false) goto L18;
        r4 = r1;
        r5 = r13;
        goto L19
    L18:
        r4 = r1;
        r5 = 0;
        goto L19
    }

    private void j6(abcd.Nr r6, abcd.Nr.a r7, java.util.BitSet r8) {
        r7.j6(r6);
        r8.set(r6.DW());
        abcd.au r0 = r6.gn();
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L15;
        int r3 = r0.get(r2);
        if (r8.get(r3) == true) goto L14;
        if (j6(r6) == false) goto L11;
        if (r2 > 0) goto L14;
    L11:
        int r4 = Hw(r3);
        if (r4 < 0) goto L14;
        j6(this.gn.get(r4), r7, r8);
    L14:
        r2 = r2 + 1;
        goto L3
    }

    private void j6(abcd.Nr r2, abcd.au r3) {
        if (r2 == null) goto L6;
        this.gn.add(r2);
        r3.Ws();
        this.u7.add(r3);
        return;
    L6:
        throw new java.lang.NullPointerException("block == null");
    }

    static void j6(abcd.Zm r0, int r1, int r2, abcd.Zm.b r3, abcd.Om r4, int[] r5) {
        r0.j6(r1, r2, r3, r4, r5);
    }

    private boolean j6(abcd.Nr r5) {
        abcd.au r6 = r5.gn();
        if (r6.size() >= 2) goto L5;
        return false;
    L5:
        int r7 = r6.get(1);
        abcd.Zm.b[] r2 = this.we;
        if (r7 < r2.length) goto L8;
    L10:
        return false;
    L8:
        if (r2[r7] == null) goto L10;
        return true;
    }

    static boolean j6(abcd.Zm r0, abcd.Nr r1) {
        return r0.j6(r1);
    }

    static boolean j6(abcd.Zm r0, abcd.Nr r1, abcd.au r2) {
        return r0.FH(r1, r2);
    }

    static boolean j6(abcd.Zm r0, boolean r1) {
        r0.J0 = r1;
        return r1;
    }

    private int tp() {
        return this.FH + this.j6.EQ();
    }

    private int u7() {
        return (this.Hw * 2) + 7;
    }

    private void v5() {
        if (this.EQ == true) goto L5;
        return;
    L5:
        abcd.hs r0 = this.j6.j6(0);
        abcd.bs r2 = abcd.bs.j6(0, abcd.Qs.j3);
        abcd.Ur r3 = new abcd.Ur(2);
        r3.j6(0, new abcd.Zr(abcd.gs.tp(abcd.Qs.j3), r0, r2, abcd.cs.FH));
        r3.j6(1, new abcd.ks(abcd.gs.Yi, r0, abcd.cs.j6(we()), abcd.Ps.FH));
        r3.we();
        int r4 = DW(-7);
        j6(new abcd.Nr(DW(-6), r3, abcd.au.Zo(r4), r4), abcd.au.DW);
        abcd.Ur r5 = new abcd.Ur(1);
        r5.j6(0, new abcd.ks(abcd.gs.GK, r0, abcd.cs.j6(r2), abcd.Ps.FH));
        r5.we();
        j6(new abcd.Nr(r4, r5, abcd.au.DW, -1), abcd.au.DW);
    }

    private void v5(int r6) {
        int r0 = u7();
        abcd.au r1 = this.gn.get(r6).gn();
        int r2 = r1.size();
        this.gn.remove(r6);
        this.u7.remove(r6);
        int r7 = 0;
    L3:
        if (r7 >= r2) goto L12;
        int r3 = r1.get(r7);
        if (r3 < r0) goto L11;
        int r4 = Hw(r3);
        if (r4 < 0) goto L10;
        v5(r4);
        goto L11
    L10:
        throw new java.lang.RuntimeException("Invalid label " + abcd.Yt.v5(r3));
    L11:
        r7 = r7 + 1;
        goto L3
    }

    private abcd.bs we() {
        int r0 = tp();
        if (r0 >= 1) goto L6;
        r0 = 1;
    L6:
        return abcd.bs.j6(r0, abcd.Qs.QX);
    }

    int j6() {
        int r0 = tp();
        if (Ws() == true) goto L5;
        return r0;
    L5:
        return r0 + 1;
    }
}
