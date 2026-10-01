package abcd;

public final class Fz extends com.almlkaide.kaypro.internal.EnumBase {
    public static final abcd.Fz DW = null;
    public static final abcd.Fz FH = null;
    public static final abcd.Fz Hw = null;
    public static final abcd.Fz j6 = null;
    private static final abcd.Fz[] v5 = null;

    static {
        j6 = new abcd.Fz("GET", 0);
        DW = new abcd.Fz("POST", 1);
        FH = new abcd.Fz("PUT", 2);
        Hw = new abcd.Fz("DELETE", 3);
        v5 = new abcd.Fz[]{j6, DW, FH, Hw};
    }

    private Fz(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    public static abcd.Fz valueOf(java.lang.String r1) {
        return (abcd.Fz) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Fz.values(), r1);
    }

    public static abcd.Fz[] values() {
        return (abcd.Fz[]) v5.clone();
    }
}
