package abcd;

public final class XH extends com.almlkaide.kaypro.internal.EnumBase {
    public static final abcd.XH DW = null;
    public static final abcd.XH FH = null;
    public static final abcd.XH Hw = null;
    public static final abcd.XH j6 = null;
    private static final abcd.XH[] v5 = null;

    static {
        j6 = new abcd.XH("MISSING", 0);
        DW = new abcd.XH("UNINITIALIZED", 1);
        FH = new abcd.XH("INITIALIZED", 2);
        Hw = new abcd.XH("REV_CHECKED_OUT", 3);
        v5 = new abcd.XH[]{j6, DW, FH, Hw};
    }

    private XH(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    public static abcd.XH valueOf(java.lang.String r1) {
        return (abcd.XH) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.XH.values(), r1);
    }

    public static abcd.XH[] values() {
        abcd.XH[] r0 = v5;
        int r1 = r0.length;
        abcd.XH[] r2 = new abcd.XH[r1];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        return r2;
    }
}
