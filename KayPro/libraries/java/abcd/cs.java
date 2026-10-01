package abcd;

public final class cs extends abcd.Xt implements abcd.Ss {
    public static final abcd.cs FH = null;

    static {
        FH = new abcd.cs(0);
    }

    public cs(int r1) {
        super(r1);
    }

    public static abcd.cs j6(abcd.bs r2) {
        abcd.cs r0 = new abcd.cs(1);
        r0.j6(0, r2);
        return r0;
    }

    public static abcd.cs j6(abcd.bs r2, abcd.bs r3) {
        abcd.cs r0 = new abcd.cs(2);
        r0.j6(0, r2);
        r0.j6(1, r3);
        return r0;
    }

    public abcd.cs DW(abcd.bs r6) {
        int r0 = size();
        abcd.cs r1 = new abcd.cs(r0 + 1);
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        int r4 = r3 + 1;
        r1.j6(r4, DW(r3));
        r3 = r4;
        goto L3
    L5:
        r1.j6(0, r6);
        if (VH() == false) goto L8;
        r1.we();
    L8:
        return r1;
    }

    public int Hw(int r4) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (get(r1).we() == r4) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    public abcd.cs er() {
        int r0 = size() - 1;
        if (r0 == 0) goto L5;
        abcd.cs r1 = new abcd.cs(r0);
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L10;
        int r3 = r2 + 1;
        r1.j6(r2, DW(r3));
        r2 = r3;
        goto L7
    L10:
        if (VH() == false) goto L12;
        r1.we();
    L12:
        return r1;
    L5:
        return FH;
    }

    public abcd.bs get(int r1) {
        return (abcd.bs) DW(r1);
    }

    @Override
    public abcd.Qs getType(int r1) {
        abcd.Qs r2 = get(r1).getType();
        r2.getType();
        return r2;
    }

    @Override
    public abcd.Ss j6(abcd.Qs r2) {
        throw new java.lang.UnsupportedOperationException("unsupported");
    }

    public abcd.cs j6(int r8, boolean r9, java.util.BitSet r10) {
        int r0 = size();
        if (r0 != 0) goto L5;
        return this;
    L5:
        abcd.cs r1 = new abcd.cs(r0);
        boolean r3 = r9;
        int r11 = r8;
        int r12 = 0;
    L6:
        if (r12 >= r0) goto L23;
        abcd.bs r4 = (abcd.bs) DW(r12);
        boolean r5 = true;
        if (r10 != null) goto L11;
    L14:
        if (r5 == false) goto L18;
        r1.j6(r12, r4.FH(r11));
        if (r3 == true) goto L19;
        r11 = r11 + r4.Hw();
    L19:
        if (r3 == false) goto L21;
        r3 = false;
    L21:
        r12 = r12 + 1;
        goto L6
    L18:
        r1.j6(r12, r4);
        goto L19
    L11:
        if (r10.get(r12) == false) goto L14;
        r5 = false;
        goto L14
    L23:
        if (VH() == false) goto L25;
        r1.we();
    L25:
        return r1;
    }

    public abcd.cs j6(java.util.BitSet r5) {
        int r0 = size() - r5.cardinality();
        if (r0 == 0) goto L5;
        abcd.cs r1 = new abcd.cs(r0);
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r2 >= size()) goto L14;
        if (r5.get(r2) == true) goto L12;
        r1.j6(r3, DW(r2));
        r3 = r3 + 1;
    L12:
        r2 = r2 + 1;
        goto L8
    L14:
        if (VH() == false) goto L16;
        r1.we();
    L16:
        return r1;
    L5:
        return FH;
    }

    public void j6(int r1, abcd.bs r2) {
        j6(r1, r2);
    }

    public int rN() {
        int r0 = size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r2 = r2 + getType(r1).Zo();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public abcd.cs v5(int r5) {
        int r0 = size();
        if (r0 != 0) goto L5;
        return this;
    L5:
        abcd.cs r1 = new abcd.cs(r0);
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L12;
        abcd.bs r3 = (abcd.bs) DW(r2);
        if (r3 == null) goto L10;
        r1.j6(r2, r3.DW(r5));
    L10:
        r2 = r2 + 1;
        goto L6
    L12:
        if (VH() == false) goto L14;
        r1.we();
    L14:
        return r1;
    }

    public abcd.cs yS() {
        int r0 = size() - 1;
        if (r0 == 0) goto L5;
        abcd.cs r1 = new abcd.cs(r0);
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L10;
        r1.j6(r2, DW(r2));
        r2 = r2 + 1;
        goto L7
    L10:
        if (VH() == false) goto L12;
        r1.we();
    L12:
        return r1;
    L5:
        return FH;
    }
}
