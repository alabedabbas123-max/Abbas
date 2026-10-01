package abcd;

public final enum EnumeJ extends java.lang.Enum<abcd.EnumeJ> {
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
        if (r6 == null) goto L15;
        if (r6.length() == 0) goto L15;
        abcd.EnumeJ[] r0 = values();
        int r1 = r0.length;
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L13;
        abcd.EnumeJ r4 = r0[r3];
        if (r4.Hw().equals(r6) == true) goto L10;
        r3 = r3 + 1;
        goto L7
    L10:
        return r4;
    L13:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidTagOption, new java.lang.Object[]{r6}));
    L15:
        return j6;
    }

    public static abcd.EnumeJ valueOf(java.lang.String r1) {
        return (abcd.EnumeJ) java.lang.Enum.valueOf(abcd.EnumeJ.class, r1);
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
