package abcd;

public final class _p {
    private final abcd._p.a[] DW;
    private final abcd._p.b[] FH;
    private final abcd._p.b[] Hw;
    private final abcd._p.a[] j6;

    public static class a {
        private final int DW;
        private final int j6;

        public a(int r1, int r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    public static class b {
        private final int DW;
        private int FH;
        private final int j6;

        public b(int r1, int r2, int r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }

        public int DW() {
            return this.FH;
        }

        public int FH() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }

        public void j6(int r1) {
            this.FH = r1;
        }
    }

    public _p(abcd._p.a[] r1, abcd._p.a[] r2, abcd._p.b[] r3, abcd._p.b[] r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    private void j6(abcd.hr.a r6, abcd._p.a[] r7) {
        int r0 = r7.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        abcd._p.a r3 = r7[r1];
        int r4 = r3.DW();
        r6.DW(r4 - r2);
        r6.DW(r3.j6());
        r1 = r1 + 1;
        r2 = r4;
        goto L3
    }

    private void j6(abcd.hr.a r6, abcd._p.b[] r7) {
        int r0 = r7.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        abcd._p.b r3 = r7[r1];
        int r4 = r3.FH();
        r6.DW(r4 - r2);
        r6.DW(r3.j6());
        r6.DW(r3.DW());
        r1 = r1 + 1;
        r2 = r4;
        goto L3
    }

    public abcd._p.b[] DW() {
        return this.FH;
    }

    public abcd._p.a[] FH() {
        return this.DW;
    }

    public abcd._p.a[] Hw() {
        return this.j6;
    }

    public void j6(abcd.hr.a r2) {
        r2.DW(this.j6.length);
        r2.DW(this.DW.length);
        r2.DW(this.FH.length);
        r2.DW(this.Hw.length);
        j6(r2, this.j6);
        j6(r2, this.DW);
        j6(r2, this.FH);
        j6(r2, this.Hw);
    }

    public abcd._p.b[] j6() {
        abcd._p.b[] r0 = this.FH;
        abcd._p.b[] r1 = new abcd._p.b[r0.length + this.Hw.length];
        java.lang.System.arraycopy(r0, 0, r1, 0, r0.length);
        abcd._p.b[] r2 = this.Hw;
        java.lang.System.arraycopy(r2, 0, r1, this.FH.length, r2.length);
        return r1;
    }

    public abcd._p.b[] v5() {
        return this.Hw;
    }
}
