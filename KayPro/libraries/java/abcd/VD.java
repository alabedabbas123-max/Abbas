package abcd;

public class VD {
    private boolean DW;
    private boolean FH;
    private boolean Hw;
    private java.lang.String j6;
    private abcd.OD v5;

    public VD(java.lang.String r1) {
        this.j6 = r1;
        this.DW = false;
        this.FH = false;
        this.Hw = false;
        this.v5 = null;
        DW();
    }

    private void DW() {
        int r0 = this.j6.length();
        if (this.j6.startsWith("!") == false) goto L5;
        this.DW = true;
        int r1 = 1;
    L7:
        if (this.j6.endsWith("/") == false) goto L9;
        r0 = r0 - 1;
        this.Hw = true;
    L9:
        this.j6 = this.j6.substring(r1, r0);
        if (this.j6.contains("/") == true) goto L13;
        this.FH = true;
    L16:
        if (this.j6.contains("*") == false) goto L18;
    L24:
        this.v5 = new abcd.OD(this.j6, '/');     // Catch: abcd.bD -> L23
        return;
    L27:
        return;
    L18:
        if (this.j6.contains("?") == true) goto L24;
        if (this.j6.contains("[") == true) goto L24;
        return;
    L13:
        if (this.j6.startsWith("/") == true) goto L16;
        this.j6 = "/" + this.j6;
        goto L16
    L5:
        r1 = 0;
        goto L7
    }

    private boolean j6(boolean r2, int r3, int r4) {
        if (r3 >= (r4 - 1)) goto L6;
        return true;
    L6:
        if (this.Hw == false) goto L10;
        if (r2 == true) goto L10;
        return false;
    L10:
        return true;
    }

    public boolean j6() {
        return !this.DW;
    }

    public boolean j6(java.lang.String r8, boolean r9) {
        if (r8.startsWith("/") == true) goto L5;
        r8 = "/" + r8;
    L5:
        abcd.OD r1 = this.v5;
        if (r1 == null) goto L8;
        r1.j6(r8);
        if (this.v5.j6() == false) goto L32;
        return true;
    L32:
        java.lang.String[] r10 = r8.split("/");
        if (this.FH == false) goto L44;
        int r0 = 0;
    L36:
        if (r0 >= r10.length) goto L47;
        java.lang.String r2 = r10[r0];
        this.v5.DW();
        this.v5.j6(r2);
        if (this.v5.j6() == false) goto L43;
        if (j6(r9, r0, r10.length) == false) goto L43;
        return true;
    L43:
        r0 = r0 + 1;
    L47:
        return false;
    L44:
        this.v5.DW();
        int r3 = 0;
    L46:
        if (r3 >= r10.length) goto L47;
        java.lang.String r4 = r10[r3];
        if (r4.length() <= 0) goto L52;
        this.v5.j6("/" + r4);
    L52:
        if (this.v5.j6() == false) goto L56;
        if (j6(r9, r3, r10.length) == false) goto L56;
        return true;
    L56:
        r3 = r3 + 1;
        goto L46
    L8:
        if (r8.equals(this.j6) == false) goto L15;
        if (this.Hw == false) goto L13;
        if (r9 == true) goto L13;
        return false;
    L13:
        return true;
    L15:
        if (r8.startsWith(java.lang.String.valueOf(this.j6) + "/") == false) goto L18;
        return true;
    L18:
        if (this.FH == false) goto L47;
        java.lang.String[] r11 = r8.split("/");
        int r5 = 0;
    L21:
        if (r5 >= r11.length) goto L47;
        if (r11[r5].equals(this.j6) == false) goto L28;
        if (j6(r9, r5, r11.length) == false) goto L28;
        return true;
    L28:
        r5 = r5 + 1;
        goto L21
    }
}
