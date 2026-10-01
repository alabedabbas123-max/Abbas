package abcd;

public final class Enumcz extends com.almlkaide.kaypro.internal.EnumBase {
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
        abcd.Enumcz r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof abcd.Interfacehz) == false) { $pc0 = 5; continue $sw0; }
                    r3 = ((abcd.Interfacehz) r2).v5();
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return r3.ordinal() - r1.v5().ordinal();
                }
                case 5: {
                    r3 = DW;
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Enumcz valueOf(java.lang.String r1) {
        return (abcd.Enumcz) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Enumcz.values(), r1);
    }

    public static abcd.Enumcz[] values() {
        return (abcd.Enumcz[]) v5.clone();
    }
}
