package com.aide.common;

@abcd.Interfacexu
public class ClassU {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1569918895593984708L)
    private char FH;

    @abcd.Interfaceru(field = -248795108199589435L)
    private int Hw;

    @abcd.Interfaceru(field = 1685610015466982760L)
    private boolean VH;

    @abcd.Interfaceru(field = 945948109527955456L)
    private boolean Zo;

    @abcd.Interfaceru(field = 2052865788647426077L)
    private boolean v5;

    static {
        abcd.wu.j6(com.aide.common.ClassU.class, -664295398846055440L, -664295398846055440L);
    }

    public ClassU(int r11, char r12, boolean r13, boolean r14, boolean r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -155828606081124015L, null, new java.lang.Integer(r11), new java.lang.Character(r12), new java.lang.Boolean(r13), new java.lang.Boolean(r14), new java.lang.Boolean(r15));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-155828606081124015L, null, new java.lang.Integer(r11), new java.lang.Character(r12), new java.lang.Boolean(r13), new java.lang.Boolean(r14), new java.lang.Boolean(r15));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r12;     // Catch: java.lang.Throwable -> L7
        this.Hw = r11;     // Catch: java.lang.Throwable -> L7
        this.v5 = r13;     // Catch: java.lang.Throwable -> L7
        this.Zo = r14;     // Catch: java.lang.Throwable -> L7
        this.VH = r15;     // Catch: java.lang.Throwable -> L7
    }

    public ClassU(int r10, boolean r11, boolean r12, boolean r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 512710817818247784L, null, new java.lang.Integer(r10), new java.lang.Boolean(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(512710817818247784L, null, new java.lang.Integer(r10), new java.lang.Boolean(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = 65535;     // Catch: java.lang.Throwable -> L7
        this.Hw = r10;     // Catch: java.lang.Throwable -> L7
        this.v5 = r11;     // Catch: java.lang.Throwable -> L7
        this.Zo = r12;     // Catch: java.lang.Throwable -> L7
        this.VH = r13;     // Catch: java.lang.Throwable -> L7
    }

    public static com.aide.common.ClassU j6(java.lang.String r12) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -2537502731119537559L, null, r12);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2537502731119537559L, null, r12);     // Catch: java.lang.Throwable -> L11
    L6:
        java.lang.String[] r3 = r12.split(",");     // Catch: java.lang.Throwable -> L11
        if (r3.length == 5) goto L9;
        return null;
    L9:
        return new com.aide.common.ClassU(java.lang.Integer.parseInt(r3[0]), (char) java.lang.Integer.parseInt(r3[1]), java.lang.Boolean.parseBoolean(r3[2]), java.lang.Boolean.parseBoolean(r3[3]), java.lang.Boolean.parseBoolean(r3[4]));
    }

    @abcd.Interfacesu(method = -5169375836427724992L)
    private java.lang.String v5() {
    L72:
        th = move-exception;
        if (DW == false) goto L76;
        abcd.wu.j6(th, 2792074058462256339L, this);
    L76:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2792074058462256339L, this);     // Catch: java.lang.Throwable -> L72
    L6:
        int r2 = this.Hw;     // Catch: java.lang.Throwable -> L72
        if (r2 == (-1)) goto L71;
        if (r2 != 164) goto L12;
        return "VolMute";
    L12:
        if (r2 != 24) goto L14;
        return "VolUp";
    L14:
        if (r2 != 25) goto L16;
        return "VolDown";
    L16:
        if (r2 != 61) goto L18;
        return "Tab";
    L18:
        if (r2 != 62) goto L20;
        return "Space";
    L20:
        if (r2 != 66) goto L22;
        return "Enter";
    L22:
        if (r2 != 67) goto L24;
        return "Backspace";
    L24:
        if (r2 != 92) goto L26;
        return "PgUp";
    L26:
        if (r2 != 93) goto L28;
        return "PgDown";
    L28:
        if (r2 != 122) goto L30;
        return "Home";
    L30:
        if (r2 == 123) goto L48;
        switch(r2) {
            case 19: goto L46;
            case 20: goto L44;
            case 21: goto L42;
            case 22: goto L40;
            default: goto L32;
        };
    L32:
        java.lang.String r3 = (android.view.KeyCharacterMap.load(0).getDisplayLabel(this.Hw) + "").trim();     // Catch: java.lang.Throwable -> L72
        if (r3.length() <= 0) goto L35;
        return r3;
    L35:
        java.lang.String r4 = android.view.KeyEvent.keyCodeToString(this.Hw).toLowerCase();     // Catch: java.lang.Throwable -> L72
        if (r4.startsWith("keycode_") == false) goto L38;
        r4 = r4.substring(8);     // Catch: java.lang.Throwable -> L72
    L38:
        java.lang.String r5 = r4.replace("_", " ");     // Catch: java.lang.Throwable -> L72
        return r5.substring(0, 1).toUpperCase() + r5.substring(1);
    L40:
        return "Right";
    L42:
        return "Left";
    L44:
        return "Down";
    L46:
        return "Up";
    L48:
        return "End";
    L71:
        return java.lang.Character.toUpperCase(this.FH) + "";
    }

    public int DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2685244385518823983L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2685244385518823983L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    public boolean FH() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 1957728969498150387L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1957728969498150387L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if (this.FH == 65535) goto L10;
        return true;
    L10:
        return false;
    }

    public java.lang.String Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -808465392394113792L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-808465392394113792L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw + "," + this.FH + "," + this.v5 + "," + this.Zo + "," + this.VH;
    }

    public char j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -503879727728061657L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-503879727728061657L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }

    public boolean j6(com.aide.common.ClassU r7) {
    L26:
        th = move-exception;
        if (DW == false) goto L30;
        abcd.wu.j6(th, -437635320464540300L, this, r7);
    L30:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-437635320464540300L, this, r7);     // Catch: java.lang.Throwable -> L26
    L7:
        if (this.VH == r7.VH) goto L10;
        return false;
    L10:
        if (this.Zo == r7.Zo) goto L13;
        return false;
    L13:
        if (this.v5 == r7.v5) goto L16;
        return false;
    L16:
        if (this.Hw == (-1)) goto L21;
        if (this.Hw != r7.Hw) goto L21;
        return true;
    L21:
        if (this.FH == 65535) goto L25;
        if (this.FH != r7.FH) goto L25;
        return true;
    L25:
        return false;
    }

    public java.lang.String toString() {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -2418983212377143529L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2418983212377143529L, this);     // Catch: java.lang.Throwable -> L17
    L6:
        java.lang.String r2 = "";
        if (this.v5 == false) goto L10;
        r2 = "Shift+";     // Catch: java.lang.Throwable -> L17
    L10:
        if (this.Zo == false) goto L13;
        r2 = r2 + "Ctrl+";     // Catch: java.lang.Throwable -> L17
    L13:
        if (this.VH == false) goto L15;
        r2 = r2 + "Alt+";     // Catch: java.lang.Throwable -> L17
    L15:
        return r2 + v5();
    }
}
