package abcd;

public final class io extends abcd.Xt {
    public static final abcd.io FH = null;

    public static class a {
        private final abcd.hs DW;
        private final int j6;

        public a(int r1, abcd.hs r2) {
            if (r1 < 0) goto L10;
            if (r2 == null) goto L8;
            this.j6 = r1;
            this.DW = r2;
            return;
        L8:
            throw new java.lang.NullPointerException("position == null");
        L10:
            throw new java.lang.IllegalArgumentException("address < 0");
        }

        public abcd.hs DW() {
            return this.DW;
        }

        public int j6() {
            return this.j6;
        }
    }

    static {
        FH = new abcd.io(0);
    }

    public io(int r1) {
        super(r1);
    }

    public static abcd.io j6(abcd.Wn r13, int r14) {
        if (r14 == 1) goto L31;
        if (r14 == 2) goto L10;
        if (r14 == 3) goto L10;
        throw new java.lang.IllegalArgumentException("bogus howMuch");
    L10:
        abcd.hs r1 = abcd.hs.j6;
        int r3 = r13.size();
        abcd.io.a[] r4 = new abcd.io.a[r3];
        int r5 = 0;
        abcd.hs r8 = r1;
        int r6 = 0;
        int r7 = 0;
        boolean r9 = false;
    L11:
        if (r6 >= r3) goto L25;
        abcd.AbstractVn r10 = r13.get(r6);
        if ((r10 instanceof abcd.Sn) == false) goto L15;
        r9 = true;
    L24:
        r6 = r6 + 1;
        goto L11
    L15:
        abcd.hs r11 = r10.VH();
        if (r11.equals(r1) == true) goto L24;
        if (r11.j6(r8) == true) goto L24;
        if (r14 != 3) goto L23;
        if (r9 == false) goto L24;
    L23:
        r4[r7] = new abcd.io.a(r10.FH(), r11);
        r7 = r7 + 1;
        r8 = r11;
        r9 = false;
        goto L24
    L25:
        abcd.io r15 = new abcd.io(r7);
    L26:
        if (r5 >= r7) goto L28;
        r15.j6(r5, r4[r5]);
        r5 = r5 + 1;
        goto L26
    L28:
        r15.we();
        return r15;
    L31:
        return FH;
    }

    public abcd.io.a get(int r1) {
        return (abcd.io.a) DW(r1);
    }

    public void j6(int r1, abcd.io.a r2) {
        j6(r1, r2);
    }
}
