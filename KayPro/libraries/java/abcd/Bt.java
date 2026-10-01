package abcd;

public class Bt implements java.lang.Runnable {
    private int DW;
    private final int FH;
    private int Hw;
    private final java.util.ArrayList<abcd.Vr> Zo;
    private final abcd.yt j6;
    private final abcd.bs[][] v5;

    private class a implements abcd.Abstractvt.a {
        private final abcd.bs[] DW;
        private final java.util.HashSet<abcd.Abstractvt> FH;
        private final java.util.HashMap<abcd.Abstractvt, abcd.Abstractvt> Hw;
        final abcd.Bt Zo;
        private final abcd.tt j6;
        private final abcd.Bt.a.C0000a v5;

        private class C0000a extends abcd.Abstractqt {
            final abcd.Bt.a j6;

            public C0000a(abcd.Bt.a r1) {
                this.j6 = r1;
            }

            @Override
            public int j6() {
                return abcd.Bt.DW(this.j6.Zo);
            }

            @Override
            public abcd.bs j6(abcd.bs r3) {
                if (r3 != null) goto L5;
                return null;
            L5:
                int r0 = r3.we();
                return r3.FH(abcd.Bt.a.DW(this.j6)[r0].we());
            }
        }

        a(abcd.Bt r3, abcd.tt r4) {
            this.Zo = r3;
            this.j6 = r4;
            this.DW = abcd.Bt.j6(r3)[r4.DW()];
            this.FH = new java.util.HashSet();
            this.Hw = new java.util.HashMap();
            this.v5 = new abcd.Bt.a.C0000a(this);
            abcd.Bt.j6(r3)[r4.DW()] = null;
        }

        private void DW() {
            abcd.At r0 = new abcd.At(this);
            java.util.BitSet r1 = this.j6.Ws();
            int r2 = r1.nextSetBit(0);
        L3:
            if (r2 < 0) goto L5;
            abcd.Bt.Hw(this.Zo).DW().get(r2).j6(r0);
            r2 = r1.nextSetBit(r2 + 1);
            goto L3
        }

        static abcd.bs[] DW(abcd.Bt.a r0) {
            return r0.DW;
        }

        static abcd.tt j6(abcd.Bt.a r0) {
            return r0.j6;
        }

        private void j6(int r5, abcd.bs r6) {
            int r0 = r6.we();
            abcd.Vr r1 = r6.Zo();
            abcd.bs[] r2 = this.DW;
            r2[r5] = r6;
            int r7 = r2.length - 1;
        L3:
            if (r7 < 0) goto L8;
            if (r0 != this.DW[r7].we()) goto L7;
            this.DW[r7] = r6;
        L7:
            r7 = r7 - 1;
            goto L3
        L8:
            if (r1 != null) goto L10;
            return;
        L10:
            abcd.Bt.j6(this.Zo, r6);
            int r8 = this.DW.length - 1;
        L11:
            if (r8 < 0) goto L18;
            abcd.bs r9 = this.DW[r8];
            if (r0 == r9.we()) goto L17;
            if (r1.equals(r9.Zo()) == false) goto L17;
            this.DW[r8] = r9.j6(null);
        L17:
            r8 = r8 - 1;
            goto L11
        }

        @Override
        public void DW(abcd.mt r2) {
            r2.DW(this.v5);
            j6(r2);
        }

        public void j6() {
            this.j6.j6(this);
            DW();
            java.util.ArrayList<abcd.Abstractvt> r0 = this.j6.FH();
            boolean r2 = true;
            int r1 = r0.size() - 1;
        L3:
            if (r1 < 0) goto L13;
            abcd.Abstractvt r3 = r0.get(r1);
            abcd.Abstractvt r4 = this.Hw.get(r3);
            if (r4 == null) goto L8;
            r0.set(r1, r4);
        L12:
            r1 = r1 - 1;
            goto L3
        L8:
            if (r3.QX() == false) goto L12;
            if (this.FH.contains(r3) == true) goto L12;
            r0.remove(r1);
            goto L12
        L13:
            java.util.Iterator<abcd.tt> r5 = this.j6.j6().iterator();
        L15:
            if (r5.hasNext() == false) goto L22;
            abcd.tt r6 = r5.next();
            if (r6 == this.j6) goto L15;
            if (r2 == false) goto L20;
            abcd.bs[] r7 = this.DW;
        L21:
            abcd.Bt.j6(this.Zo)[r6.DW()] = r7;
            r2 = false;
            goto L15
        L20:
            r7 = abcd.Bt.j6(this.DW);
            goto L21
        }

        @Override
        public void j6(abcd.mt r8) {
            abcd.bs r0 = r8.u7();
            int r1 = r0.we();
            boolean r3 = false;
            int r2 = r8.tp().get(0).we();
            r8.DW(this.v5);
            int r4 = r8.tp().get(0).we();
            abcd.Vr r5 = this.DW[r2].Zo();
            abcd.Vr r6 = r0.Zo();
            if (r6 != null) goto L5;
            r6 = r5;
        L5:
            abcd.Vr r7 = abcd.Bt.j6(this.Zo, r4);
            if (r7 == null) goto L10;
            if (r6 == null) goto L10;
            if (r6.equals(r7) == true) goto L10;
        L11:
            abcd.bs r9 = abcd.bs.FH(r4, r0.getType(), r6);
            if (abcd.C1102nt.DW() == false) goto L25;
            if (r3 == true) goto L15;
        L19:
            if (r3 == false) goto L24;
            if (r5 != null) goto L24;
            if (abcd.Bt.v5(this.Zo) != 0) goto L24;
            abcd.cs r10 = abcd.cs.j6(abcd.bs.DW(r9.we(), r9.getType(), r6));
            abcd.Abstractvt r11 = abcd.Abstractvt.j6(new abcd.Zr(abcd.gs.gn(r9), abcd.hs.j6, null, r10), this.j6);
            this.Hw.put(r8, r11);
            j6(r1, r9);
            return;
        L24:
            j6(r8);
            this.FH.add(r8);
            return;
        L15:
            if (abcd.Bt.j6(r6, r5) == false) goto L19;
            if (abcd.Bt.v5(this.Zo) != 0) goto L19;
        L25:
            j6(r1, r9);
            return;
        L10:
            r3 = true;
            goto L11
        }

        @Override
        public void j6(abcd.ot r1) {
            j6(r1);
        }

        void j6(abcd.Abstractvt r3) {
            abcd.bs r0 = r3.u7();
            if (r0 != null) goto L5;
            return;
        L5:
            int r1 = r0.we();
            if (abcd.Bt.DW(this.Zo, r1) == false) goto L8;
            return;
        L8:
            r3.j6(abcd.Bt.DW(this.Zo));
            j6(r1, r3.u7());
            abcd.Bt.FH(this.Zo);
        }
    }

    public Bt(abcd.yt r4) {
        this.FH = r4.u7();
        this.j6 = r4;
        this.DW = this.FH;
        int r0 = 0;
        this.Hw = 0;
        this.v5 = new abcd.bs[r4.DW().size()][];
        this.Zo = new java.util.ArrayList();
        abcd.bs[] r1 = new abcd.bs[this.FH];
    L4:
        if (r0 >= this.FH) goto L6;
        r1[r0] = abcd.bs.j6(r0, abcd.Qs.tp);
        r0 = r0 + 1;
        goto L4
    L6:
        this.v5[r4.v5()] = r1;
    }

    public Bt(abcd.yt r1, int r2) {
        this(r1);
        this.Hw = r2;
    }

    static int DW(abcd.Bt r0) {
        return r0.DW;
    }

    private boolean DW(int r2) {
        if (r2 >= this.Hw) goto L5;
        return true;
    L5:
        return false;
    }

    static boolean DW(abcd.Bt r0, int r1) {
        return r0.DW(r1);
    }

    private static boolean DW(java.lang.Object r0, java.lang.Object r1) {
        if (r0 == r1) goto L8;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.equals(r1) == false) goto L7;
    L8:
        return true;
    }

    private static abcd.bs[] DW(abcd.bs[] r3) {
        abcd.bs[] r0 = new abcd.bs[r3.length];
        java.lang.System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }

    static int FH(abcd.Bt r2) {
        int r0 = r2.DW;
        r2.DW = r0 + 1;
        return r0;
    }

    private boolean FH(int r2) {
        if (r2 >= this.FH) goto L5;
        return true;
    L5:
        return false;
    }

    static boolean FH(abcd.Bt r0, int r1) {
        return r0.FH(r1);
    }

    static abcd.yt Hw(abcd.Bt r0) {
        return r0.j6;
    }

    private abcd.Vr j6(int r2) {
        if (r2 < this.Zo.size()) goto L5;
        return null;
    L5:
        return this.Zo.get(r2);
    }

    static abcd.Vr j6(abcd.Bt r0, int r1) {
        return r0.j6(r1);
    }

    static void j6(abcd.Bt r0, abcd.bs r1) {
        r0.j6(r1);
    }

    private void j6(abcd.bs r4) {
        int r0 = r4.we();
        abcd.Vr r5 = r4.Zo();
        this.Zo.ensureCapacity(r0 + 1);
    L4:
        if (this.Zo.size() > r0) goto L6;
        this.Zo.add(null);
        goto L4
    L6:
        this.Zo.set(r0, r5);
    }

    static boolean j6(java.lang.Object r0, java.lang.Object r1) {
        return DW(r0, r1);
    }

    static abcd.bs[] j6(abcd.bs[] r0) {
        return DW(r0);
    }

    static abcd.bs[][] j6(abcd.Bt r0) {
        return r0.v5;
    }

    static int v5(abcd.Bt r0) {
        return r0.Hw;
    }

    @Override
    public void run() {
        this.j6.j6(new abcd.zt(this));
        this.j6.v5(this.DW);
        this.j6.J8();
    }
}
