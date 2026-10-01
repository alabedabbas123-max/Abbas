package com.aide.common;

@abcd.Interfacexu
public class KeyStrokeDetector {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -4570948708669963000L)
    private boolean EQ;

    @abcd.Interfaceru(field = 2102757878571566775L)
    private boolean FH;

    @abcd.Interfaceru(field = 864812605871956368L)
    private boolean Hw;

    @abcd.Interfaceru(field = -5567953115656525644L)
    private boolean J0;

    @abcd.Interfaceru(field = 4468261064361072583L)
    private android.view.KeyCharacterMap J8;

    @abcd.Interfaceru(field = -1914409971811083351L)
    private boolean VH;

    @abcd.Interfaceru(field = -2007436848140662380L)
    private android.content.Context Ws;

    @abcd.Interfaceru(field = 489062553661005805L)
    private boolean Zo;

    @abcd.Interfaceru(field = -5287266847798850560L)
    private boolean gn;

    @abcd.Interfaceru(field = 3570024579988647771L)
    private boolean tp;

    @abcd.Interfaceru(field = -3720460559953668063L)
    private boolean u7;

    @abcd.Interfaceru(field = 1339590429424913444L)
    private boolean v5;

    @abcd.Interfaceru(field = -604333159712324053L)
    private int we;

    public interface a {
        boolean j6(com.aide.common.ClassU r1);
    }

    static {
        abcd.wu.j6(com.aide.common.KeyStrokeDetector.class, -2626290547296404472L, -2626290547296404472L);
    }

    public KeyStrokeDetector(android.content.Context r6) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 211847340499652800L, null, r6);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(211847340499652800L, null, r6);     // Catch: java.lang.Throwable -> L12
    L6:
        this.Ws = r6;     // Catch: java.lang.Throwable -> L12
        boolean r4 = true;
        if (r6.getResources().getConfiguration().keyboard == 1) goto L10;
        r4 = false;
    L10:
        this.J0 = r4;     // Catch: java.lang.Throwable -> L12
        j6("new KeyStrokeDetector() - isSoftKeyboard: " + this.J0);     // Catch: java.lang.Throwable -> L12
    }

    @abcd.Interfacesu(method = 14005335356034208L)
    private void DW(int r8, boolean r9) {
    L47:
        th = move-exception;
        if (DW == false) goto L51;
        abcd.wu.j6(th, 2685077797094764336L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
    L51:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2685077797094764336L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L47
    L5:
        j6("onMetaKeysUp " + r8);     // Catch: java.lang.Throwable -> L47
        boolean r0 = this.FH;     // Catch: java.lang.Throwable -> L47
        boolean r2 = true;
        if (r8 == 57) goto L8;
        boolean r1 = true;
    L9:
        this.FH = r0 & r1;     // Catch: java.lang.Throwable -> L47
        boolean r3 = this.Hw;     // Catch: java.lang.Throwable -> L47
        if (r8 == 58) goto L12;
        boolean r4 = true;
    L13:
        this.Hw = r3 & r4;     // Catch: java.lang.Throwable -> L47
        boolean r5 = this.v5;     // Catch: java.lang.Throwable -> L47
        if (r8 == 59) goto L16;
        boolean r6 = true;
    L17:
        this.v5 = r5 & r6;     // Catch: java.lang.Throwable -> L47
        boolean r7 = this.Zo;     // Catch: java.lang.Throwable -> L47
        if (r8 == 60) goto L20;
        boolean r10 = true;
    L21:
        this.Zo = r7 & r10;     // Catch: java.lang.Throwable -> L47
        boolean r11 = this.EQ;     // Catch: java.lang.Throwable -> L47
        if (r8 != 59) goto L26;
        if (r9 == true) goto L26;
        boolean r12 = false;
    L27:
        this.EQ = r11 & r12;     // Catch: java.lang.Throwable -> L47
        boolean r13 = this.tp;     // Catch: java.lang.Throwable -> L47
        if (r8 != 60) goto L32;
        if (r9 == true) goto L32;
        boolean r14 = false;
    L33:
        this.tp = r13 & r14;     // Catch: java.lang.Throwable -> L47
        boolean r15 = this.u7;     // Catch: java.lang.Throwable -> L47
        if (r8 == 0) goto L36;
        boolean r16 = true;
    L37:
        this.u7 = r15 & r16;     // Catch: java.lang.Throwable -> L47
        boolean r17 = this.VH;     // Catch: java.lang.Throwable -> L47
        if (r8 == 113) goto L40;
        boolean r18 = true;
    L41:
        this.VH = r17 & r18;     // Catch: java.lang.Throwable -> L47
        boolean r19 = this.gn;     // Catch: java.lang.Throwable -> L47
        if (r8 != 114) goto L45;
        r2 = false;
    L45:
        this.gn = r19 & r2;     // Catch: java.lang.Throwable -> L47
        return;
    L40:
        r18 = false;
        goto L41
    L36:
        r16 = false;
    L32:
        r14 = true;
    L26:
        r12 = true;
        goto L27
    L20:
        r10 = false;
        goto L21
    L16:
        r6 = false;
        goto L17
    L12:
        r4 = false;
        goto L13
    L8:
        r1 = false;
        goto L9
    }

    static boolean DW(com.aide.common.KeyStrokeDetector r0) {
        return r0.J0;
    }

    @abcd.Interfacesu(method = -342692098111630079L)
    private com.aide.common.ClassU FH(int r9, android.view.KeyEvent r10) {
    L25:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, 3470998291504142863L, this, new java.lang.Integer(r9), r10);
    L29:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3470998291504142863L, this, new java.lang.Integer(r9), r10);     // Catch: java.lang.Throwable -> L25
    L5:
        if (r9 != 0) goto L7;
        return null;
    L7:
        if (r9 != 3) goto L9;
        return null;
    L9:
        if (r9 != 4) goto L11;
        return null;
    L11:
        if (r9 != 113) goto L13;
        return null;
    L13:
        if (r9 == 114) goto L35;
        switch(r9) {
            case 57: goto L36;
            case 58: goto L36;
            case 59: goto L36;
            case 60: goto L36;
            default: goto L15;
        };     // Catch: java.lang.Throwable -> L25
    L15:
        boolean r5 = (this.v5 | this.Zo) | r10.isShiftPressed();     // Catch: java.lang.Throwable -> L25
        boolean r6 = (this.VH | this.gn) | j6(r10.getMetaState());     // Catch: java.lang.Throwable -> L25
        boolean r7 = (this.FH | this.Hw) | r10.isAltPressed();     // Catch: java.lang.Throwable -> L25
        int r1 = r10.getUnicodeChar();     // Catch: java.lang.Throwable -> L25
        if (r1 != 0) goto L18;
    L20:
        char r4 = 65535;
    L21:
        return new com.aide.common.ClassU(r9, r4, r5, r6, r7);
    L18:
        if (java.lang.Character.isISOControl(r1) == true) goto L20;
        r4 = (char) r1;     // Catch: java.lang.Throwable -> L25
        goto L21
    L36:
        return null;
    L35:
        return null;
    }

    static boolean FH(com.aide.common.KeyStrokeDetector r0) {
        return r0.EQ;
    }

    static boolean Hw(com.aide.common.KeyStrokeDetector r0) {
        return r0.tp;
    }

    static android.content.Context Zo(com.aide.common.KeyStrokeDetector r0) {
        return r0.Ws;
    }

    private void cl() {
        this.FH = false;
        this.Hw = false;
        this.VH = false;
        this.gn = false;
        this.v5 = false;
        this.Zo = false;
    }

    static void cl(com.aide.common.KeyStrokeDetector r1) {
        r1.cl();
    }

    static int j6(com.aide.common.KeyStrokeDetector r0) {
        return r0.we;
    }

    static int j6(com.aide.common.KeyStrokeDetector r0, int r1) {
        r0.we = r1;
        return r1;
    }

    static android.view.KeyCharacterMap j6(com.aide.common.KeyStrokeDetector r0, android.view.KeyCharacterMap r1) {
        r0.J8 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -3306886932270292448L)
    private com.aide.common.ClassU j6(char r10) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -749892910932203508L, this, new java.lang.Character(r10));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-749892910932203508L, this, new java.lang.Character(r10));     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.common.ClassU(-1, r10, (this.EQ | this.tp) | java.lang.Character.isUpperCase(r10), false, false);
    }

    static com.aide.common.ClassU j6(com.aide.common.KeyStrokeDetector r0, char r1) {
        return r0.j6(r1);
    }

    @abcd.Interfacesu(method = -998189621382317425L)
    private void j6(int r8, boolean r9) {
    L45:
        th = move-exception;
        if (DW == false) goto L49;
        abcd.wu.j6(th, 801650849126027901L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
    L49:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(801650849126027901L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L45
    L5:
        j6("onMetaKeysDown " + r8);     // Catch: java.lang.Throwable -> L45
        boolean r0 = this.FH;     // Catch: java.lang.Throwable -> L45
        boolean r2 = true;
        if (r8 != 57) goto L8;
        boolean r1 = true;
    L9:
        this.FH = r0 | r1;     // Catch: java.lang.Throwable -> L45
        boolean r3 = this.Hw;     // Catch: java.lang.Throwable -> L45
        if (r8 != 58) goto L12;
        boolean r4 = true;
    L13:
        this.Hw = r3 | r4;     // Catch: java.lang.Throwable -> L45
        boolean r5 = this.v5;     // Catch: java.lang.Throwable -> L45
        if (r8 != 59) goto L16;
        boolean r6 = true;
    L17:
        this.v5 = r5 | r6;     // Catch: java.lang.Throwable -> L45
        boolean r7 = this.Zo;     // Catch: java.lang.Throwable -> L45
        if (r8 != 60) goto L20;
        boolean r10 = true;
    L21:
        this.Zo = r7 | r10;     // Catch: java.lang.Throwable -> L45
        boolean r11 = this.EQ;     // Catch: java.lang.Throwable -> L45
        if (r8 != 59) goto L25;
        if (r9 == true) goto L25;
        boolean r12 = true;
    L26:
        this.EQ = r11 | r12;     // Catch: java.lang.Throwable -> L45
        boolean r13 = this.tp;     // Catch: java.lang.Throwable -> L45
        if (r8 != 60) goto L30;
        if (r9 == true) goto L30;
        boolean r14 = true;
    L31:
        this.tp = r13 | r14;     // Catch: java.lang.Throwable -> L45
        boolean r15 = this.u7;     // Catch: java.lang.Throwable -> L45
        if (r8 != 0) goto L34;
        boolean r16 = true;
    L35:
        this.u7 = r15 | r16;     // Catch: java.lang.Throwable -> L45
        boolean r17 = this.VH;     // Catch: java.lang.Throwable -> L45
        if (r8 != 113) goto L38;
        boolean r18 = true;
    L39:
        this.VH = r17 | r18;     // Catch: java.lang.Throwable -> L45
        boolean r19 = this.gn;     // Catch: java.lang.Throwable -> L45
        if (r8 == 114) goto L43;
        r2 = false;
    L43:
        this.gn = r19 | r2;     // Catch: java.lang.Throwable -> L45
        return;
    L38:
        r18 = false;
        goto L39
    L34:
        r16 = false;
    L30:
        r14 = false;
    L25:
        r12 = false;
        goto L26
    L20:
        r10 = false;
        goto L21
    L16:
        r6 = false;
        goto L17
    L12:
        r4 = false;
        goto L13
    L8:
        r1 = false;
        goto L9
    }

    static void j6(com.aide.common.KeyStrokeDetector r0, java.lang.String r1) {
        r0.j6(r1);
    }

    @abcd.Interfacesu(method = 1084114156735046367L)
    private void j6(com.aide.common.ClassU r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3856832108462147115L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3856832108462147115L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6("onKeyStroke " + r5.toString());     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 6510326703949956160L)
    private void j6(java.lang.String r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3044798538389927472L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(3044798538389927472L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @abcd.Interfacesu(method = 2693316646629372071L)
    private void j6(java.lang.String r9, int r10, android.view.KeyEvent r11) {
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -3564819180313796227L, this, r9, new java.lang.Integer(r10), r11);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3564819180313796227L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L20
    L6:
        java.lang.StringBuilder r1 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L20
        r1.append(r9);     // Catch: java.lang.Throwable -> L20
        r1.append(" ");     // Catch: java.lang.Throwable -> L20
        r1.append(r10);     // Catch: java.lang.Throwable -> L20
        r1.append("  ");     // Catch: java.lang.Throwable -> L20
        r1.append(r11.getFlags());     // Catch: java.lang.Throwable -> L20
        java.lang.String r3 = "";
        if (r11.isAltPressed() == false) goto L10;
        java.lang.String r2 = " alt";
    L11:
        r1.append(r2);     // Catch: java.lang.Throwable -> L20
        if (r11.isShiftPressed() == false) goto L14;
        java.lang.String r4 = " shift";
    L15:
        r1.append(r4);     // Catch: java.lang.Throwable -> L20
        r1.append(" ");     // Catch: java.lang.Throwable -> L20
        if (j6(r11.getMetaState()) == false) goto L18;
        r3 = " ctrl";
    L18:
        r1.append(r3);     // Catch: java.lang.Throwable -> L20
        j6(r1.toString());     // Catch: java.lang.Throwable -> L20
        return;
    L14:
        r4 = "";
        goto L15
    L10:
        r2 = "";
        goto L11
    }

    @abcd.Interfacesu(method = 347389564348050092L)
    private boolean j6(int r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 49014999568739136L, this, new java.lang.Integer(r5));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(49014999568739136L, this, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if ((r5 & 12288) == 0) goto L9;
        return true;
    L9:
        return false;
    }

    static android.view.KeyCharacterMap v5(com.aide.common.KeyStrokeDetector r0) {
        return r0.J8;
    }

    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2011926733778531907L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2011926733778531907L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.we = 0;     // Catch: java.lang.Throwable -> L8
    }

    public void DW(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1071927887052637632L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1071927887052637632L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if ((r9.getFlags() & 2) == 0) goto L8;
        boolean r0 = true;
    L9:
        DW(r8, r0);     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r0 = false;
        goto L9
    }

    public boolean DW(int r9, android.view.KeyEvent r10, com.aide.common.KeyStrokeDetector.a r11) {
    L20:
        th = th;
    L22:
        if (DW == false) goto L24;
        java.lang.Throwable r1 = th;
        abcd.wu.j6(r1, -62291960055867243L, this, new java.lang.Integer(r9), r10, r11);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-62291960055867243L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L20
    L5:
        j6("onKeyUp", r9, r10);     // Catch: java.lang.Throwable -> L20
        if (r9 != 84) goto L9;
        int r2 = 57;
    L25:
    L18:
        th = th;
        r9 = r2;
        goto L22
    L11:
        if ((r10.getFlags() & 2) == 0) goto L13;
        boolean r3 = true;
    L14:
        DW(r2, r3);     // Catch: java.lang.Throwable -> L18
        if (r9 != 84) goto L17;
        return true;
    L17:
        return false;
    L13:
        r3 = false;
        goto L14
    L9:
        r2 = r9;
        goto L25
    }

    public android.view.inputmethod.InputConnection j6(android.view.View r8, com.aide.common.KeyStrokeDetector.a r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 960257137080474675L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(960257137080474675L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return new com.aide.common.ClassV(this, r8, true, r9, r8);
    }

    public void j6(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1251475993808772111L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1251475993808772111L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if ((r9.getFlags() & 2) == 0) goto L8;
        boolean r0 = true;
    L9:
        j6(r8, r0);     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r0 = false;
        goto L9
    }

    public void j6(android.content.Context r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 1416516942134704880L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1416516942134704880L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        boolean r3 = true;
        if (r5.getResources().getConfiguration().keyboard == 1) goto L10;
        r3 = false;
    L10:
        this.J0 = r3;     // Catch: java.lang.Throwable -> L12
        j6("KeyStrokeDetector.onConfigChange() - isSoftKeyboard: " + this.J0);     // Catch: java.lang.Throwable -> L12
        this.J8 = null;     // Catch: java.lang.Throwable -> L12
    }

    public boolean j6() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -3763531224502629384L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3763531224502629384L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.VH == true) goto L12;
        if (this.gn == true) goto L12;
        return false;
    L12:
        return true;
    }

    public boolean j6(int r9, android.view.KeyEvent r10, com.aide.common.KeyStrokeDetector.a r11) {
    L25:
        th = th;
    L27:
        if (DW == false) goto L29;
        java.lang.Throwable r1 = th;
        abcd.wu.j6(r1, 3835102424242503428L, this, new java.lang.Integer(r9), r10, r11);
    L29:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3835102424242503428L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L25
    L5:
        j6("onKeyDown", r9, r10);     // Catch: java.lang.Throwable -> L25
        if (r9 != 84) goto L9;
        int r2 = 57;
    L30:
    L23:
        th = th;
        r9 = r2;
        goto L27
    L11:
        if ((r10.getFlags() & 2) == 0) goto L13;
        boolean r3 = true;
    L14:
        j6(r2, r3);     // Catch: java.lang.Throwable -> L23
        com.aide.common.ClassU r4 = FH(r2, r10);     // Catch: java.lang.Throwable -> L23
        if (r4 != null) goto L17;
    L20:
        if (r9 != 84) goto L22;
        return true;
    L22:
        return false;
    L17:
        if (r11.j6(r4) == false) goto L20;
        j6(r4);     // Catch: java.lang.Throwable -> L23
        return true;
    L13:
        r3 = false;
        goto L14
    L9:
        r2 = r9;
        goto L30
    }
}
