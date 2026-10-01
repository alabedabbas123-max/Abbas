package abcd;

public final class EnumeJ extends com.almlkaide.kaypro.internal.EnumBase {
    public static final abcd.EnumeJ DW = null;
    public static final abcd.EnumeJ FH = null;
    private static final abcd.EnumeJ[] Hw = null;
    public static final abcd.EnumeJ j6 = null;
    private final java.lang.String v5;

    static {
        j6 = new abcd.EnumeJ("AUTO_FOLLOW", 0, "");
        DW = new abcd.EnumeJ("NO_TAGS", 1, "--no-tags");
        FH = new abcd.EnumeJ("FETCH_TAGS", 2, "--tags");
        Hw = new abcd.EnumeJ[]{j6, DW, FH};
    }

    private EnumeJ(java.lang.String r1, int r2, java.lang.String r3) {
        super(r1, r2);
        this.v5 = r3;
    }

    public static abcd.EnumeJ j6(java.lang.String r6) {
        abcd.EnumeJ[] r0 = null;
        int r1 = 0;
        int r3 = 0;
        abcd.EnumeJ r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6 == null) { $pc0 = 15; continue $sw0; }
                    if (r6.length() == 0) { $pc0 = 15; continue $sw0; }
                    r0 = values();
                    r1 = r0.length;
                    r3 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r3 >= r1) { $pc0 = 13; continue $sw0; }
                    r4 = r0[r3];
                    if (r4.Hw().equals(r6) == true) { $pc0 = 10; continue $sw0; }
                    r3 = r3 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 10: {
                    return r4;
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidTagOption, new java.lang.Object[]{r6}));
                }
                case 15: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.EnumeJ valueOf(java.lang.String r1) {
        return (abcd.EnumeJ) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.EnumeJ.values(), r1);
    }

    public static abcd.EnumeJ[] values() {
        abcd.EnumeJ[] r0 = Hw;
        int r1 = r0.length;
        abcd.EnumeJ[] r2 = new abcd.EnumeJ[r1];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        return r2;
    }

    public java.lang.String Hw() {
        return this.v5;
    }
}
