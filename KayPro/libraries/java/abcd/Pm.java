package abcd;

public final class Pm extends abcd.Xt {
    public static final abcd.Pm FH = null;

    public static class a {
        private final int DW;
        private final int j6;

        public a(int r1, int r2) {
            if (r1 < 0) goto L10;
            if (r2 < 0) goto L8;
            this.j6 = r1;
            this.DW = r2;
            return;
        L8:
            throw new java.lang.IllegalArgumentException("lineNumber < 0");
        L10:
            throw new java.lang.IllegalArgumentException("startPc < 0");
        }

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    static {
        FH = new abcd.Pm(0);
    }

    public Pm(int r1) {
        super(r1);
    }

    public static abcd.Pm j6(abcd.Pm r6, abcd.Pm r7) {
        if (r6 != FH) goto L5;
        return r7;
    L5:
        int r0 = r6.size();
        int r1 = r7.size();
        abcd.Pm r2 = new abcd.Pm(r0 + r1);
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r4 >= r0) goto L8;
        r2.j6(r4, r6.get(r4));
        r4 = r4 + 1;
    L8:
        if (r3 >= r1) goto L10;
        r2.j6(r0 + r3, r7.get(r3));
        r3 = r3 + 1;
        goto L8
    L10:
        return r2;
    }

    public int Hw(int r7) {
        int r0 = size();
        int r1 = -1;
        int r2 = 0;
        int r3 = -1;
    L3:
        if (r2 >= r0) goto L12;
        abcd.Pm.a r4 = get(r2);
        int r5 = r4.DW();
        if (r5 > r7) goto L11;
        if (r5 <= r1) goto L11;
        r3 = r4.j6();
        if (r5 == r7) goto L12;
        r1 = r5;
    L11:
        r2 = r2 + 1;
    L12:
        return r3;
    }

    public abcd.Pm.a get(int r1) {
        return (abcd.Pm.a) DW(r1);
    }

    public void j6(int r2, int r3, int r4) {
        j6(r2, new abcd.Pm.a(r3, r4));
    }

    public void j6(int r1, abcd.Pm.a r2) {
        if (r2 == null) goto L6;
        j6(r1, r2);
        return;
    L6:
        throw new java.lang.NullPointerException("item == null");
    }
}
