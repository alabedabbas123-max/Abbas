package abcd;

public final enum EnumkA extends java.lang.Enum<abcd.EnumkA> {
    public static final abcd.EnumkA DW = null;
    public static final abcd.EnumkA FH = null;
    private static final abcd.EnumkA[] Hw = null;
    public static final abcd.EnumkA j6 = null;

    static {
        j6 = new abcd.EnumkA("USE_CACHE", 0);
        DW = new abcd.EnumkA("SKIP_CACHE_LOOKUP", 1);
        FH = new abcd.EnumkA("IGNORE_CACHE_EXPIRATION", 2);
        Hw = new abcd.EnumkA[]{j6, DW, FH};
    }

    private EnumkA(java.lang.String r1, int r2) {
        super(r1, r2);
    }

    public static abcd.EnumkA valueOf(java.lang.String r1) {
        return (abcd.EnumkA) java.lang.Enum.valueOf(abcd.EnumkA.class, r1);
    }

    public static abcd.EnumkA[] values() {
        return (abcd.EnumkA[]) Hw.clone();
    }
}
