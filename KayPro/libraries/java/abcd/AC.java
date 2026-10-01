package abcd;

class AC implements java.util.Comparator<abcd.hC> {
    private static int[] j6;

    AC() {
    }

    private int j6(abcd.hC.a r3) {
        int r4 = j6()[r3.ordinal()];
        if (r4 != 1) goto L5;
        return 2;
    L5:
        if (r4 == 3) goto L8;
        return 10;
    L8:
        return 1;
    }

    private java.lang.String j6(abcd.hC r3) {
        if (r3.VH != abcd.hC.a.FH) goto L7;
        return r3.FH;
    L7:
        return r3.Hw;
    }

    static int[] j6() {
        int[] r0 = j6;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.hC.a.values().length];
        r1[abcd.hC.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L13
    L18:
        r1[abcd.hC.a.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L14
    L24:
        r1[abcd.hC.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L26:
        r1[abcd.hC.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L16
    L20:
        r1[abcd.hC.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L17
    L11:
        j6 = r1;
        return r1;
    }

    @Override
    public int compare(abcd.hC r1, abcd.hC r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.hC r3, abcd.hC r4) {
        int r0 = j6(r3).compareTo(j6(r4));
        if (r0 == 0) goto L5;
        return r0;
    L5:
        return j6(r3.DW()) - j6(r4.DW());
    }
}
