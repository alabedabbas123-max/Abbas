package abcd;

public final enum Enumcz extends java.lang.Enum<abcd.Enumcz> {
    public static final abcd.Enumcz DW = null;
    public static final abcd.Enumcz FH = null;
    public static final abcd.Enumcz Hw = null;
    public static final abcd.Enumcz j6 = null;
    private static final abcd.Enumcz[] v5 = null;

    static {
        j6 = new abcd.Enumcz("LOW", 0);
        DW = new abcd.Enumcz("NORMAL", 1);
        FH = new abcd.Enumcz("HIGH", 2);
        Hw = new abcd.Enumcz("IMMEDIATE", 3);
        v5 = new abcd.Enumcz[]{j6, DW, FH, Hw};
    }

    private Enumcz(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    static <Y> int j6(abcd.Interfacehz r1, Y r2) {
        if ((r2 instanceof abcd.Interfacehz) == false) goto L5;
        abcd.Enumcz r3 = ((abcd.Interfacehz) r2).v5();
    L7:
        return r3.ordinal() - r1.v5().ordinal();
    L5:
        r3 = DW;
        goto L7
    }

    public static abcd.Enumcz valueOf(java.lang.String r1) {
        return (abcd.Enumcz) java.lang.Enum.valueOf(abcd.Enumcz.class, r1);
    }

    public static abcd.Enumcz[] values() {
        return (abcd.Enumcz[]) v5.clone();
    }
}
