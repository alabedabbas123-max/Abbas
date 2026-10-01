package abcd;

public final class Enummq extends com.almlkaide.kaypro.internal.EnumBase {
    public static final abcd.Enummq DW = null;
    private static final abcd.Enummq[] EQ = null;
    public static final abcd.Enummq FH = null;
    public static final abcd.Enummq Hw = null;
    public static final abcd.Enummq VH = null;
    public static final abcd.Enummq Zo = null;
    public static final abcd.Enummq gn = null;
    public static final abcd.Enummq j6 = null;
    public static final abcd.Enummq tp = null;
    public static final abcd.Enummq u7 = null;
    public static final abcd.Enummq v5 = null;

    static {
        j6 = new abcd.Enummq("UNKNOWN", 0);
        DW = new abcd.Enummq("NONE", 1);
        FH = new abcd.Enummq("VARIES", 2);
        Hw = new abcd.Enummq("TYPE_REF", 3);
        v5 = new abcd.Enummq("STRING_REF", 4);
        Zo = new abcd.Enummq("METHOD_REF", 5);
        VH = new abcd.Enummq("FIELD_REF", 6);
        gn = new abcd.Enummq("INLINE_METHOD", 7);
        u7 = new abcd.Enummq("VTABLE_OFFSET", 8);
        tp = new abcd.Enummq("FIELD_OFFSET", 9);
        EQ = new abcd.Enummq[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp};
    }

    private Enummq(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    public static abcd.Enummq valueOf(java.lang.String r1) {
        return (abcd.Enummq) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Enummq.values(), r1);
    }

    public static abcd.Enummq[] values() {
        return (abcd.Enummq[]) EQ.clone();
    }
}
