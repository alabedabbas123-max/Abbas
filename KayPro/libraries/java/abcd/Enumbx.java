package abcd;

public final class Enumbx extends com.almlkaide.kaypro.internal.EnumBase {
    public static final abcd.Enumbx DW = null;
    public static final abcd.Enumbx FH = null;
    private static final abcd.Enumbx[] Hw = null;
    public static final abcd.Enumbx j6 = null;

    static {
        j6 = new abcd.Enumbx("UNKNOWN", 0);
        DW = new abcd.Enumbx("MALE", 1);
        FH = new abcd.Enumbx("FEMALE", 2);
        Hw = new abcd.Enumbx[]{j6, DW, FH};
    }

    private Enumbx(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    public static abcd.Enumbx valueOf(java.lang.String r1) {
        return (abcd.Enumbx) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Enumbx.values(), r1);
    }

    public static abcd.Enumbx[] values() {
        return (abcd.Enumbx[]) Hw.clone();
    }
}
