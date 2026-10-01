package abcd;

public final class Jm extends abcd.Xt {
    public static final abcd.Jm FH = null;

    public static class a {
        private final int DW;
        private final int FH;
        private final abcd.Ks Hw;
        private final int j6;

        public a(int r1, int r2, int r3, abcd.Ks r4) {
            if (r1 < 0) goto L13;
            if (r2 < r1) goto L11;
            if (r3 < 0) goto L9;
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
            return;
        L9:
            throw new java.lang.IllegalArgumentException("handlerPc < 0");
        L11:
            throw new java.lang.IllegalArgumentException("endPc < startPc");
        L13:
            throw new java.lang.IllegalArgumentException("startPc < 0");
        }

        public abcd.Ks DW() {
            abcd.Ks r0 = this.Hw;
            if (r0 == null) goto L6;
            return r0;
        L6:
            return abcd.Ks.DW;
        }

        public int FH() {
            return this.FH;
        }

        public int Hw() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }

        public boolean j6(int r2) {
            if (r2 >= this.j6) goto L5;
        L7:
            return false;
        L5:
            if (r2 >= this.DW) goto L7;
            return true;
        }
    }

    static {
        FH = new abcd.Jm(0);
    }

    public Jm(int r1) {
        super(r1);
    }

    private static boolean j6(abcd.Jm.a r4, abcd.Jm.a[] r5, int r6) {
        abcd.Ks r7 = r4.DW();
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L11;
        abcd.Ks r2 = r5[r1].DW();
        if (r2 == r7) goto L10;
        if (r2 == abcd.Ks.DW) goto L10;
        r1 = r1 + 1;
    L10:
        return false;
    L11:
        return true;
    }

    public int Hw() {
        return (size() * 8) + 2;
    }

    public abcd.Jm Hw(int r8) {
        int r0 = size();
        abcd.Jm.a[] r1 = new abcd.Jm.a[r0];
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r0) goto L10;
        abcd.Jm.a r5 = get(r3);
        if (r5.j6(r8) == false) goto L9;
        if (j6(r5, r1, r4) == false) goto L9;
        r1[r4] = r5;
        r4 = r4 + 1;
    L9:
        r3 = r3 + 1;
        goto L3
    L10:
        if (r4 == 0) goto L12;
        abcd.Jm r9 = new abcd.Jm(r4);
    L14:
        if (r2 >= r4) goto L16;
        r9.j6(r2, r1[r2]);
        r2 = r2 + 1;
        goto L14
    L16:
        r9.we();
        return r9;
    L12:
        return FH;
    }

    public abcd.Jm.a get(int r1) {
        return (abcd.Jm.a) DW(r1);
    }

    public void j6(int r2, int r3, int r4, int r5, abcd.Ks r6) {
        j6(r2, new abcd.Jm.a(r3, r4, r5, r6));
    }

    public void j6(int r1, abcd.Jm.a r2) {
        if (r2 == null) goto L6;
        j6(r1, r2);
        return;
    L6:
        throw new java.lang.NullPointerException("item == null");
    }

    public abcd.Ss rN() {
        int r0 = size();
        if (r0 == 0) goto L5;
        abcd.Ps r1 = new abcd.Ps(r0);
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L9;
        r1.j6(r2, get(r2).DW().VH());
        r2 = r2 + 1;
        goto L7
    L9:
        r1.we();
        return r1;
    L5:
        return abcd.Ps.FH;
    }

    public abcd.au v5(int r6) {
        if (r6 < (-1)) goto L23;
        int r0 = 0;
        if (r6 < 0) goto L7;
        int r1 = 1;
    L8:
        int r2 = size();
        if (r2 != 0) goto L15;
        if (r1 == 0) goto L14;
        return abcd.au.Zo(r6);
    L14:
        return abcd.au.DW;
    L15:
        abcd.au r3 = new abcd.au(r2 + r1);
    L16:
        if (r0 >= r2) goto L18;
        r3.DW(get(r0).FH());
        r0 = r0 + 1;
        goto L16
    L18:
        if (r1 == 0) goto L20;
        r3.DW(r6);
    L20:
        r3.we();
        return r3;
    L7:
        r1 = 0;
        goto L8
    L23:
        throw new java.lang.IllegalArgumentException("noException < -1");
    }
}
