package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassA {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final com.aide.uidesigner.N.a FH;
    public final java.lang.String Hw;
    public final org.w3c.dom.Attr v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassA.class, 7296360088338597184L, 7296360088338597184L);
    }

    public ClassA(com.aide.uidesigner.N.a r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -540219804234580872L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-540219804234580872L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
        this.Hw = null;     // Catch: java.lang.Throwable -> L8
        this.v5 = null;     // Catch: java.lang.Throwable -> L8
    }

    public ClassA(com.aide.uidesigner.N.a r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1631066828046610500L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1631066828046610500L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9;     // Catch: java.lang.Throwable -> L7
        this.v5 = null;     // Catch: java.lang.Throwable -> L7
    }

    public ClassA(com.aide.uidesigner.N.a r8, org.w3c.dom.Attr r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3859582566492410328L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3859582566492410328L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9.getValue();     // Catch: java.lang.Throwable -> L7
        this.v5 = r9;     // Catch: java.lang.Throwable -> L7
    }

    public static java.lang.String j6(java.lang.String r11) {
    L41:
        th = move-exception;
        if (DW == false) goto L46;
        abcd.wu.j6(th, 1412860264224354480L, null, r11);
    L46:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1412860264224354480L, null, r11);     // Catch: java.lang.Throwable -> L41
    L6:
        if (r11 != null) goto L9;
        return r11;
    L9:
        if (r11.length() != 0) goto L12;
        return r11;
    L12:
        if (r11.startsWith("@id/") == false) goto L16;
        return r11.substring(4);
    L16:
        if (r11.startsWith("?android:attr/") == false) goto L19;
        r11 = "Android_" + r11.substring(14);     // Catch: java.lang.Throwable -> L41
    L19:
        if (java.lang.Character.isLetter(r11.charAt(0)) == true) goto L21;
        return r11;
    L21:
        java.lang.StringBuffer r4 = new java.lang.StringBuffer();     // Catch: java.lang.Throwable -> L41
        r4.append(java.lang.Character.toUpperCase(r11.charAt(0)));     // Catch: java.lang.Throwable -> L41
        int r6 = 1;
        boolean r7 = false;
    L23:
        if (r6 >= r11.length()) goto L40;
        char r8 = r11.charAt(r6);     // Catch: java.lang.Throwable -> L41
        if (r7 == false) goto L28;
        r4.append(java.lang.Character.toUpperCase(r8));     // Catch: java.lang.Throwable -> L41
        r7 = false;
    L38:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L41
        goto L23
    L28:
        if (r8 != '|') goto L32;
        r4.append(" | ");     // Catch: java.lang.Throwable -> L41
    L30:
        r7 = true;
        goto L38
    L32:
        if (r8 != '_') goto L35;
        r4.append(" ");     // Catch: java.lang.Throwable -> L41
        goto L30
    L35:
        if (java.lang.Character.isUpperCase(r8) == false) goto L37;
        r4.append(" ");     // Catch: java.lang.Throwable -> L41
    L37:
        r4.append(r8);     // Catch: java.lang.Throwable -> L41
        goto L38
    L40:
        return r4.toString();
    }

    public boolean DW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1699758629083535104L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1699758629083535104L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.Hw == null) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean FH() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1985406047841978912L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1985406047841978912L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (DW() == false) goto L11;
        if (this.v5 != null) goto L11;
        return true;
    L11:
        return false;
    }

    public java.lang.String j6() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -3502074034501532564L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3502074034501532564L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.FH.VH != com.aide.uidesigner.N.b.VH) goto L11;
        return "&quot;" + this.Hw + "&quot;";
    L11:
        return j6(this.Hw);
    }
}
