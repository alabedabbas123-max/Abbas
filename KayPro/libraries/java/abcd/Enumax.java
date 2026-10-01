package abcd;

public final class Enumax extends com.almlkaide.kaypro.internal.EnumBase {
    public static final abcd.Enumax DW = null;
    public static final abcd.Enumax FH = null;
    public static final abcd.Enumax Hw = null;
    public static final abcd.Enumax j6 = null;
    private static final abcd.Enumax[] v5 = null;
    private final java.lang.String Zo;

    static {
        j6 = new abcd.Enumax("INVALID_REQUEST", 0, "Invalid Ad request.");
        DW = new abcd.Enumax("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
        FH = new abcd.Enumax("NETWORK_ERROR", 2, "A network error occurred.");
        Hw = new abcd.Enumax("INTERNAL_ERROR", 3, "There was an internal error.");
        v5 = new abcd.Enumax[]{j6, DW, FH, Hw};
    }

    private Enumax(java.lang.String r1, int r2, java.lang.String r3) {
        super(r1, r2);
        this.Zo = r3;
    }

    public static abcd.Enumax valueOf(java.lang.String r1) {
        return (abcd.Enumax) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Enumax.values(), r1);
    }

    public static abcd.Enumax[] values() {
        return (abcd.Enumax[]) v5.clone();
    }

    @Override
    public final java.lang.String toString() {
        return this.Zo;
    }
}
