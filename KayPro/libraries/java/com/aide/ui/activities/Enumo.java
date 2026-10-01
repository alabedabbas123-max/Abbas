package com.aide.ui.activities;

@abcd.Interfacexu
public final enum Enumo extends java.lang.Enum<com.aide.ui.activities.Enumo> {
    public static final com.aide.ui.activities.Enumo DW = null;
    public static final com.aide.ui.activities.Enumo FH = null;
    public static final com.aide.ui.activities.Enumo Hw = null;

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    public static final com.aide.ui.activities.Enumo j6 = null;
    private static final com.aide.ui.activities.Enumo[] v5 = null;

    @abcd.Interfaceru(field = 1185622761244556440L)
    private java.lang.String EQ;

    @abcd.Interfaceru(field = -594411990396910140L)
    private boolean J0;

    @abcd.Interfaceru(field = 3469237289413573315L)
    private boolean J8;

    @abcd.Interfaceru(field = 2066811868670856432L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -1504894421784963952L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = 2368709602149612240L)
    private java.lang.String u7;

    @abcd.Interfaceru(field = 2650462359652727940L)
    private java.lang.String we;

    static {
        abcd.wu.j6(com.aide.ui.activities.Enumo.class, 4957755133070502035L, 4957755133070502035L);     // Catch: java.lang.Throwable -> L8
        if (Zo == false) goto L6;
        abcd.wu.j6(1025066644760247175L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new com.aide.ui.activities.Enumo("ANDROID_API", 0, "Android API", true, "https://developer.android.google.cn/reference/", "packages.html", "https://dl-ssl.google.com/android/repository/docs-24_r01.zip", "docs/reference/", true);     // Catch: java.lang.Throwable -> L8
        DW = new com.aide.ui.activities.Enumo("JAVA_API", 1, "Java API", false, "https://docs.oracle.com/javase/7/docs/api/", "overview-summary.html", null, null, true);     // Catch: java.lang.Throwable -> L8
        FH = new com.aide.ui.activities.Enumo("PHONEGAP_API", 2, "PhoneGap API", true, "http://docs.phonegap.com/en/3.0.0/index.html", "", "https://github.com/phonegap/phonegap/archive/2.9.0.zip", "phonegap-2.9.0/doc/index.html", true);     // Catch: java.lang.Throwable -> L8
        Hw = new com.aide.ui.activities.Enumo("JQUERY_API", 3, "jQuery API", true, "http://jqapi.com/", "", "http://jqapi.com/jqapi.zip", "index.html", true);     // Catch: java.lang.Throwable -> L8
        v5 = new com.aide.ui.activities.Enumo[]{j6, DW, FH, Hw};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1025066644760247175L, null);
    L12:
        throw th;
    }

    @abcd.Interfacesu(method = -1315654832781168169L)
    private Enumo(java.lang.String r7, int r8, java.lang.String r9, boolean r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        if (Zo == false) goto L5;
        abcd.wu.j6(4602696922595929248L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, new java.lang.Boolean(r10), r11, r12, r13, r14, new java.lang.Boolean(r15)});
    L5:
        super(r7, r8);
        this.gn = r9;
        this.u7 = r11;
        this.J0 = r10;
        this.tp = r14;
        this.EQ = r12;
        this.we = r13;
        this.J8 = r15;
    }

    public static com.aide.ui.activities.Enumo J8() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2413233626286995895L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2413233626286995895L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6;
    }

    public static com.aide.ui.activities.Enumo[] Mr() {
    L16:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, -578010442454620851L, null);
    L20:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-578010442454620851L, null);     // Catch: java.lang.Throwable -> L16
    L7:
        if (com.aide.ui.U.ef() == false) goto L11;
        return values();
    L11:
        if (com.aide.ui.U.j6.equals("com.aide.ui") == false) goto L15;
        return new com.aide.ui.activities.Enumo[]{j6, DW};
    L15:
        return new com.aide.ui.activities.Enumo[]{FH, Hw, j6};
    }

    public static long aM() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1750892423285166777L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L15;
        abcd.wu.j6(1750892423285166777L, null);     // Catch: java.lang.Throwable -> L8
        return 800000000;
    L15:
        return 800000000;
    }

    public static com.aide.ui.activities.Enumo valueOf(java.lang.String r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 84989465784567519L, null, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(84989465784567519L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.activities.Enumo) java.lang.Enum.valueOf(com.aide.ui.activities.Enumo.class, r5);
    }

    public static com.aide.ui.activities.Enumo[] values() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 828025346451330365L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(828025346451330365L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.activities.Enumo[]) v5.clone();
    }

    public static com.aide.ui.activities.Enumo we() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -2549603512689972375L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2549603512689972375L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6;
    }

    public boolean Hw() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -5418394848116073981L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-5418394848116073981L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J8;
    }

    public int U2() {
    L15:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, -3192045185440473173L, this);
    L20:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-3192045185440473173L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        com.aide.ui.activities.Enumo[] r2 = Mr();     // Catch: java.lang.Throwable -> L15
        int r3 = 0;
    L7:
        if (r3 >= r2.length) goto L13;
        if (r2[r3].equals(this) == true) goto L11;
        r3 = r3 + 1;
        goto L7
    L11:
        return r3;
    L13:
        return -1;
    }

    public java.lang.String VH() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 290075973713301600L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(290075973713301600L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.we;
    }

    public java.lang.String Ws() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 777703478926687812L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(777703478926687812L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.gn;
    }

    public java.lang.String Zo() {
    L12:
        th = move-exception;
        if (VH == false) goto L16;
        abcd.wu.j6(th, 2374621545547319708L, this);
    L16:
        throw th;
    L4:
        if (Zo == false) goto L18;
        abcd.wu.j6(2374621545547319708L, this);     // Catch: java.lang.Throwable -> L12
    L18:
        if (this.we == null) goto L10;
        return new java.io.File(new java.net.URL(this.we).getFile()).getName();
        goto L21
    L10:
        return null;
    L21:
        return null;
    }

    public boolean a8() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 3082812490214623296L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(3082812490214623296L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.J0;
    }

    public java.lang.String j3() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 403201429711111408L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(403201429711111408L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(this.EQ);
    }

    public java.lang.String j6(java.lang.String r7) {
    L18:
        th = move-exception;
        if (VH == false) goto L22;
        abcd.wu.j6(th, -32504461788032256L, this, r7);
    L22:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-32504461788032256L, this, r7);     // Catch: java.lang.Throwable -> L18
    L6:
        if (r7 != null) goto L9;
        r7 = "";
    L9:
        if (Zo() == null) goto L17;
        if (com.aide.ui.aa.vy() == null) goto L17;
        java.lang.String r3 = com.aide.ui.aa.vy() + "/" + Zo();     // Catch: java.lang.Throwable -> L18
        if (abcd.Vl.Hw(r3) == false) goto L17;
        return "file://" + r3 + "/" + this.tp + r7;
    L17:
        return this.u7 + r7;
    }
}
