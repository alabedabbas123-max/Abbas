package abcd;

@abcd.Interfacexu
public final enum Enumle extends java.lang.Enum<abcd.Enumle> implements abcd.Interfaceha {
    public static final abcd.Enumle DW = null;
    public static final abcd.Enumle FH = null;
    public static final abcd.Enumle Hw = null;

    @abcd.Interfacetu
    private static boolean VH;
    private static final abcd.Enumle[] Zo = null;

    @abcd.Interfaceuu
    private static boolean gn;
    public static final abcd.Enumle j6 = null;
    public static final abcd.Enumle v5 = null;

    @abcd.Interfaceru(field = -3483621873875142167L)
    private final java.lang.String EQ;

    @abcd.Interfaceru(field = -1555401688879314255L)
    private final java.lang.String tp;

    @abcd.Interfaceru(field = -3028758154474971432L)
    private final java.lang.String u7;

    @abcd.Interfaceru(field = -3483755172161955240L)
    private final java.lang.String we;

    static {
        abcd.wu.j6(abcd.Enumle.class, -952426915378518400L, -952426915378518400L);     // Catch: java.lang.Throwable -> L8
        if (VH == false) goto L6;
        abcd.wu.j6(2116191561145592000L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new abcd.Enumle("ADJUST_NEWLINES", 0, "General", "Adjust lines on autoformat", "", "");     // Catch: java.lang.Throwable -> L8
        DW = new abcd.Enumle("ADJUST_SPACES", 1, "General", "Adjust spaces on autoformat", "", "");     // Catch: java.lang.Throwable -> L8
        FH = new abcd.Enumle("FORMAT_ONPASTE", 2, "General", "Autoformat pasted code", "", "");     // Catch: java.lang.Throwable -> L8
        Hw = new abcd.Enumle("INDENT_ONTYPE", 3, "General", "Adjust indentation while typing", "", "");     // Catch: java.lang.Throwable -> L8
        v5 = new abcd.Enumle("AUTO_INSERT_CLOSING_BRACE_ONTYPE", 4, "General", "Automatically insert closing tag", "", "");     // Catch: java.lang.Throwable -> L8
        Zo = new abcd.Enumle[]{j6, DW, FH, Hw, v5};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (gn == false) goto L12;
        abcd.wu.j6(th, 2116191561145592000L, null);
    L12:
        throw th;
    }

    @abcd.Interfacesu(method = 164077573377214160L)
    private Enumle(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        if (VH == false) goto L5;
        abcd.wu.j6(51127235224603272L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, r10, r11, r12});
    L5:
        super(r7, r8);
        this.u7 = r9;
        this.tp = r10;
        this.EQ = r11;
        this.we = r12;
    }

    public static java.util.Set<abcd.Enumle> j6(boolean r5) {
    L8:
        th = move-exception;
        if (gn == false) goto L12;
        abcd.wu.j6(th, 5759115931838832364L, null, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (VH == false) goto L6;
        abcd.wu.j6(5759115931838832364L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashSet r3 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        r3.add(DW);     // Catch: java.lang.Throwable -> L8
        r3.add(FH);     // Catch: java.lang.Throwable -> L8
        r3.add(Hw);     // Catch: java.lang.Throwable -> L8
        r3.add(v5);     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    public static abcd.Enumle valueOf(java.lang.String r5) {
    L8:
        th = move-exception;
        if (gn == false) goto L12;
        abcd.wu.j6(th, 474250725726121968L, null, r5);
    L12:
        throw th;
    L4:
        if (VH == false) goto L6;
        abcd.wu.j6(474250725726121968L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.Enumle) java.lang.Enum.valueOf(abcd.Enumle.class, r5);
    }

    public static abcd.Enumle[] values() {
    L8:
        th = move-exception;
        if (gn == false) goto L12;
        abcd.wu.j6(th, -2275621586940712980L, null);
    L12:
        throw th;
    L4:
        if (VH == false) goto L6;
        abcd.wu.j6(-2275621586940712980L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.Enumle[]) Zo.clone();
    }

    @Override
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (gn == false) goto L12;
        abcd.wu.j6(th, -1039440780138745413L, this);
    L12:
        throw th;
    L4:
        if (VH == false) goto L6;
        abcd.wu.j6(-1039440780138745413L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp;
    }
}
