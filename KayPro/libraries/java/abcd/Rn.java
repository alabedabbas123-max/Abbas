package abcd;

public final class Rn extends abcd.Xt implements java.lang.Comparable<abcd.Rn> {
    public static final abcd.Rn FH = null;

    public static class a implements java.lang.Comparable<abcd.Rn.a> {
        private final int DW;
        private final abcd.Qn FH;
        private final int j6;

        public a(int r2, int r3, abcd.Qn r4) {
            if (r2 < 0) goto L14;
            if (r3 <= r2) goto L12;
            if (r4.Zo() == true) goto L10;
            this.j6 = r2;
            this.DW = r3;
            this.FH = r4;
            return;
        L10:
            throw new java.lang.IllegalArgumentException("handlers.isMutable()");
        L12:
            throw new java.lang.IllegalArgumentException("end <= start");
        L14:
            throw new java.lang.IllegalArgumentException("start < 0");
        }

        public int Hw() {
            return this.DW;
        }

        public int VH() {
            return this.j6;
        }

        public abcd.Qn Zo() {
            return this.FH;
        }

        @Override
        public int compareTo(abcd.Rn.a r1) {
            return j6(r1);
        }

        public boolean equals(java.lang.Object r3) {
            if ((r3 instanceof abcd.Rn.a) == true) goto L5;
            return false;
        L5:
            if (j6((abcd.Rn.a) r3) != 0) goto L9;
            return true;
        L9:
            return false;
        }

        public int hashCode() {
            return (((this.j6 * 31) + this.DW) * 31) + this.FH.hashCode();
        }

        public int j6(abcd.Rn.a r5) {
            int r0 = this.j6;
            int r1 = r5.j6;
            if (r0 >= r1) goto L6;
            return -1;
        L6:
            if (r0 <= r1) goto L8;
            return 1;
        L8:
            int r2 = this.DW;
            int r3 = r5.DW;
            if (r2 >= r3) goto L11;
            return -1;
        L11:
            if (r2 <= r3) goto L14;
            return 1;
        L14:
            return this.FH.j6(r5.FH);
        }
    }

    static {
        FH = new abcd.Rn(0);
    }

    public Rn(int r1) {
        super(r1);
    }

    @Override
    public int compareTo(abcd.Rn r1) {
        return j6(r1);
    }

    public abcd.Rn.a get(int r1) {
        return (abcd.Rn.a) DW(r1);
    }

    public int j6(abcd.Rn r8) {
        if (this != r8) goto L5;
        return 0;
    L5:
        int r1 = size();
        int r2 = r8.size();
        int r3 = java.lang.Math.min(r1, r2);
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L11;
        int r5 = get(r4).j6(r8.get(r4));
        if (r5 != 0) goto L9;
        r4 = r4 + 1;
        goto L6
    L9:
        return r5;
    L11:
        if (r1 >= r2) goto L14;
        return -1;
    L14:
        if (r1 <= r2) goto L17;
        return 1;
    L17:
        return 0;
    }

    public void j6(int r1, abcd.Rn.a r2) {
        j6(r1, r2);
    }
}
