package abcd;

public final class bq {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final abcd.bq.a[] VH;
    private final abcd.bq.b[] Zo;
    private final int j6;
    private final short[] v5;

    public static class a {
        final int[] DW;
        final int[] FH;
        final int Hw;
        final int j6;

        public a(int r1, int[] r2, int[] r3, int r4) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
        }

        public int DW() {
            return this.Hw;
        }

        public int FH() {
            return this.j6;
        }

        public int[] Hw() {
            return this.DW;
        }

        public int[] j6() {
            return this.FH;
        }
    }

    public static class b {
        final int DW;
        final int FH;
        final int j6;

        public b(int r1, int r2, int r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }

        public int DW() {
            return this.DW;
        }

        public int FH() {
            return this.j6;
        }

        public int j6() {
            return this.FH;
        }
    }

    public bq(int r1, int r2, int r3, int r4, short[] r5, abcd.bq.b[] r6, abcd.bq.a[] r7) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.VH = r7;
    }

    public int DW() {
        return this.Hw;
    }

    public int FH() {
        return this.DW;
    }

    public short[] Hw() {
        return this.v5;
    }

    public abcd.bq.b[] VH() {
        return this.Zo;
    }

    public int Zo() {
        return this.j6;
    }

    public abcd.bq.a[] j6() {
        return this.VH;
    }

    public int v5() {
        return this.FH;
    }
}
