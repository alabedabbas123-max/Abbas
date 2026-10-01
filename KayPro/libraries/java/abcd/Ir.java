package abcd;

public final class Ir extends com.almlkaide.kaypro.internal.EnumBase implements abcd.Interfacelu {
    public static final abcd.Ir DW = null;
    public static final abcd.Ir FH = null;
    public static final abcd.Ir Hw = null;
    public static final abcd.Ir j6 = null;
    private static final abcd.Ir[] v5 = null;
    private final java.lang.String Zo;

    static {
        j6 = new abcd.Ir("RUNTIME", 0, "runtime");
        DW = new abcd.Ir("BUILD", 1, "build");
        FH = new abcd.Ir("SYSTEM", 2, "system");
        Hw = new abcd.Ir("EMBEDDED", 3, "embedded");
        v5 = new abcd.Ir[]{j6, DW, FH, Hw};
    }

    private Ir(java.lang.String r1, int r2, java.lang.String r3) {
        super(r1, r2);
        this.Zo = r3;
    }

    public static abcd.Ir valueOf(java.lang.String r1) {
        return (abcd.Ir) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Ir.values(), r1);
    }

    public static abcd.Ir[] values() {
        return (abcd.Ir[]) v5.clone();
    }

    @Override
    public java.lang.String aM() {
        return this.Zo;
    }
}
