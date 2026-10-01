package abcd;

@abcd.Interfacexu
public final enum Enummd extends java.lang.Enum<abcd.Enummd> implements abcd.Interfaceha {
    private static final abcd.Enummd[] DW = null;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;
    public static final abcd.Enummd j6 = null;

    @abcd.Interfaceru(field = -219306639548567552L)
    private final java.lang.String VH;

    @abcd.Interfaceru(field = 2303472271396261208L)
    private final java.lang.String Zo;

    @abcd.Interfaceru(field = -219314201023379787L)
    private final java.lang.String gn;

    @abcd.Interfaceru(field = 4048473804902749731L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(abcd.Enummd.class, -6081133926037915885L, -6081133926037915885L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(2919319309333831680L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new abcd.Enummd("AUTO_INSERT_JAVADOC_ASTERISK_ONTYPE", 0, "General", "Automatically insert * in JavaDoc comments", "", "");     // Catch: java.lang.Throwable -> L8
        DW = new abcd.Enummd[]{j6};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 2919319309333831680L, null);
    L12:
        throw th;
    }

    @abcd.Interfacesu(method = -779296623636021889L)
    private Enummd(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        if (FH == false) goto L5;
        abcd.wu.j6(-20493337841829252L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, r10, r11, r12});
    L5:
        super(r7, r8);
        this.v5 = r9;
        this.Zo = r10;
        this.VH = r11;
        this.gn = r12;
    }

    public static java.util.Set<abcd.Enummd> Hw() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 3419582166594996139L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(3419582166594996139L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashSet r3 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        r3.add(j6);     // Catch: java.lang.Throwable -> L8
        return r3;
    }

    public static abcd.Enummd valueOf(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 617988367365327152L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(617988367365327152L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.Enummd) java.lang.Enum.valueOf(abcd.Enummd.class, r5);
    }

    public static abcd.Enummd[] values() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1721164429379979552L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1721164429379979552L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return (abcd.Enummd[]) DW.clone();
    }

    @Override
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1965302150498068013L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1965302150498068013L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Zo;
    }
}
