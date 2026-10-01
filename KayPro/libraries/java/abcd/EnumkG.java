package abcd;

public final class EnumkG extends com.almlkaide.kaypro.internal.EnumBase {
    public static final abcd.EnumkG DW = null;
    public static final abcd.EnumkG FH = null;
    public static final abcd.EnumkG Hw = null;
    private static final abcd.EnumkG[] Zo = null;
    public static final abcd.EnumkG j6 = null;
    public static final abcd.EnumkG v5 = null;

    static {
        j6 = new abcd.EnumkG("NONE", 0);
        DW = new abcd.EnumkG("COMMIT_TIME_DESC", 1);
        FH = new abcd.EnumkG("TOPO", 2);
        Hw = new abcd.EnumkG("REVERSE", 3);
        v5 = new abcd.EnumkG("BOUNDARY", 4);
        Zo = new abcd.EnumkG[]{j6, DW, FH, Hw, v5};
    }

    private EnumkG(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    public static abcd.EnumkG valueOf(java.lang.String r1) {
        return (abcd.EnumkG) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.EnumkG.values(), r1);
    }

    public static abcd.EnumkG[] values() {
        abcd.EnumkG[] r0 = Zo;
        int r1 = r0.length;
        abcd.EnumkG[] r2 = new abcd.EnumkG[r1];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        return r2;
    }
}
