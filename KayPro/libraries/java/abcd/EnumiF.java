package abcd;

public abstract enum EnumiF extends java.lang.Enum<abcd.EnumiF> {
    public static final abcd.EnumiF DW = null;
    public static final abcd.EnumiF EQ = null;
    public static final abcd.EnumiF FH = null;
    public static final abcd.EnumiF Hw = null;
    private static final abcd.EnumiF[] J0 = null;
    public static final abcd.EnumiF VH = null;
    public static final abcd.EnumiF Zo = null;
    public static final abcd.EnumiF gn = null;
    public static final abcd.EnumiF j6 = null;
    public static final abcd.EnumiF tp = null;
    public static final abcd.EnumiF u7 = null;
    public static final abcd.EnumiF v5 = null;
    public static final abcd.EnumiF we = null;

    static {
        final int r1 = 0;
        final java.lang.String r2 = "BARE";
        j6 = new abcd._E(r2, r1);
        final int r3 = 1;
        final java.lang.String r4 = "SAFE";
        DW = new abcd.C0506aF(r4, r3);
        final int r5 = 2;
        final java.lang.String r6 = "MERGING";
        FH = new abcd.C0550bF(r6, r5);
        final int r7 = 3;
        final java.lang.String r8 = "MERGING_RESOLVED";
        Hw = new abcd.C0594cF(r8, r7);
        final int r9 = 4;
        final java.lang.String r10 = "CHERRY_PICKING";
        v5 = new abcd.C0638dF(r10, r9);
        final int r11 = 5;
        final java.lang.String r12 = "CHERRY_PICKING_RESOLVED";
        Zo = new abcd.C0681eF(r12, r11);
        final int r13 = 6;
        final java.lang.String r14 = "REBASING";
        VH = new abcd.C0725fF(r14, r13);
        final int r15 = 7;
        final java.lang.String r16 = "REBASING_REBASING";
        gn = new abcd.C0769gF(r16, r15);
        final int r17 = 8;
        final java.lang.String r18 = "APPLY";
        u7 = new abcd.C0813hF(r18, r17);
        final int r19 = 9;
        final java.lang.String r110 = "REBASING_MERGE";
        tp = new abcd.XE(r110, r19);
        final int r111 = 10;
        final java.lang.String r112 = "REBASING_INTERACTIVE";
        EQ = new abcd.YE(r112, r111);
        final int r113 = 11;
        final java.lang.String r114 = "BISECTING";
        we = new abcd.ZE(r114, r113);
        J0 = new abcd.EnumiF[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp, EQ, we};
    }

    private EnumiF(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    EnumiF(java.lang.String r1, int r2, abcd.EnumiF r3) {
        this(r1, r2);
    }

    public static abcd.EnumiF valueOf(java.lang.String r1) {
        return (abcd.EnumiF) java.lang.Enum.valueOf(abcd.EnumiF.class, r1);
    }

    public static abcd.EnumiF[] values() {
        abcd.EnumiF[] r0 = J0;
        int r1 = r0.length;
        abcd.EnumiF[] r2 = new abcd.EnumiF[r1];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        return r2;
    }

    public abstract boolean Hw();
}
