package abcd;

public final class _s {
    private final abcd.yt DW;
    private final java.util.ArrayList<abcd.tt> FH;
    private final abcd._s.a[] Hw;
    private final abcd.Ys.a[] Zo;
    private final boolean j6;
    private final java.util.ArrayList<abcd.tt> v5;

    private static final class a {
        public abcd.tt DW;
        public abcd.tt FH;
        public abcd.tt Hw;
        public int j6;
        public java.util.ArrayList<abcd.tt> v5;

        public a() {
            this.v5 = new java.util.ArrayList();
        }
    }

    private class b implements abcd.tt.b {
        final abcd._s DW;
        private int j6;

        private b(abcd._s r1) {
            this.DW = r1;
            this.j6 = 0;
        }

        b(abcd._s r1, abcd.Zs r2) {
            this(r1);
        }

        @Override
        public void j6(abcd.tt r3, abcd.tt r4) {
            abcd._s.a r0 = new abcd._s.a();
            int r1 = this.j6 + 1;
            this.j6 = r1;
            r0.j6 = r1;
            r0.FH = r3;
            r0.DW = r4;
            abcd._s.j6(this.DW).add(r3);
            abcd._s.DW(this.DW)[r3.DW()] = r0;
        }
    }

    private _s(abcd.yt r1, abcd.Ys.a[] r2, boolean r3) {
        this.DW = r1;
        this.Zo = r2;
        this.j6 = r3;
        this.FH = r1.DW();
        this.Hw = new abcd._s.a[this.FH.size() + 2];
        this.v5 = new java.util.ArrayList();
    }

    private abcd.tt DW(abcd.tt r3) {
        abcd._s.a r0 = this.Hw[r3.DW()];
        if (r0.Hw != null) goto L5;
        return r3;
    L5:
        j6(r3);
        return r0.FH;
    }

    static abcd._s.a[] DW(abcd._s r0) {
        return r0.Hw;
    }

    private java.util.BitSet FH(abcd.tt r2) {
        if (this.j6 == false) goto L7;
        return r2.Ws();
    L7:
        return r2.VH();
    }

    public static abcd._s j6(abcd.yt r1, abcd.Ys.a[] r2, boolean r3) {
        abcd._s r0 = new abcd._s(r1, r2, r3);
        r0.j6();
        return r0;
    }

    static java.util.ArrayList j6(abcd._s r0) {
        return r0.v5;
    }

    private void j6() {
        if (this.j6 == false) goto L5;
        abcd.tt r0 = this.DW.Zo();
    L6:
        if (r0 == null) goto L8;
        this.v5.add(r0);
        this.Zo[r0.DW()].DW = r0.DW();
    L8:
        this.DW.j6(this.j6, new abcd._s.b(this, null));
        int r1 = this.v5.size() - 1;
        int r2 = r1;
    L9:
        int r3 = 2;
        if (r2 < 2) goto L27;
        abcd.tt r4 = this.v5.get(r2);
        abcd._s.a r5 = this.Hw[r4.DW()];
        java.util.BitSet r6 = FH(r4);
        int r7 = r6.nextSetBit(0);
    L12:
        if (r7 < 0) goto L19;
        abcd.tt r8 = this.FH.get(r7);
        if (this.Hw[r8.DW()] == null) goto L18;
        int r9 = this.Hw[DW(r8).DW()].j6;
        if (r9 >= r5.j6) goto L18;
        r5.j6 = r9;
    L18:
        r7 = r6.nextSetBit(r7 + 1);
        goto L12
    L19:
        this.Hw[this.v5.get(r5.j6).DW()].v5.add(r4);
        abcd.tt r10 = r5.DW;
        r5.Hw = r10;
        java.util.ArrayList<abcd.tt> r11 = this.Hw[r10.DW()].v5;
    L21:
        if (r11.isEmpty() == true) goto L26;
        abcd.tt r12 = r11.remove(r11.size() - 1);
        abcd.tt r13 = DW(r12);
        if (this.Hw[r13.DW()].j6 < this.Hw[r12.DW()].j6) goto L24;
        this.Zo[r12.DW()].DW = r5.DW.DW();
        goto L21
    L24:
        this.Zo[r12.DW()].DW = r13.DW();
        goto L21
    L26:
        r2 = r2 - 1;
    L27:
        if (r3 > r1) goto L32;
        abcd.tt r14 = this.v5.get(r3);
        if (this.Zo[r14.DW()].DW == this.v5.get(this.Hw[r14.DW()].j6).DW()) goto L31;
        abcd.Ys.a r15 = this.Zo[r14.DW()];
        abcd.Ys.a[] r16 = this.Zo;
        r15.DW = r16[r16[r14.DW()].DW].DW;
    L31:
        r3 = r3 + 1;
        goto L27
    L32:
        return;
    L5:
        r0 = this.DW.Hw();
        goto L6
    }

    private void j6(abcd.tt r8) {
        if (this.Hw[this.Hw[r8.DW()].Hw.DW()].Hw == null) goto L19;
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.util.HashSet r1 = new java.util.HashSet();
        r0.add(r8);
    L6:
        if (r0.isEmpty() == true) goto L29;
        int r9 = r0.size() - 1;
        abcd._s.a r2 = this.Hw[((abcd.tt) r0.get(r9)).DW()];
        abcd.tt r3 = r2.Hw;
        abcd._s.a r4 = this.Hw[r3.DW()];
        if (r1.add(r3) == false) goto L12;
        if (r4.Hw == null) goto L12;
        r0.add(r3);
    L12:
        r0.remove(r9);
        if (r4.Hw == null) goto L6;
        abcd.tt r10 = r4.FH;
        if (this.Hw[r10.DW()].j6 >= this.Hw[r2.FH.DW()].j6) goto L18;
        r2.FH = r10;
    L18:
        r2.Hw = r4.Hw;
        goto L6
    L29:
        return;
    }
}
