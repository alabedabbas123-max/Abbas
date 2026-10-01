package abcd;

public final class mu {
    private final int DW;
    private final java.lang.StringBuffer FH;
    private final java.lang.StringBuffer Hw;
    private final abcd.Zt Zo;
    private final java.io.Writer j6;
    private final abcd.Zt v5;

    public mu(java.io.Writer r4, int r5, int r6, java.lang.String r7) {
        if (r4 == null) goto L17;
        if (r5 < 1) goto L15;
        if (r6 < 1) goto L13;
        if (r7 == null) goto L11;
        java.io.StringWriter r0 = new java.io.StringWriter(1000);
        java.io.StringWriter r2 = new java.io.StringWriter(1000);
        this.j6 = r4;
        this.DW = r5;
        this.FH = r0.getBuffer();
        this.Hw = r2.getBuffer();
        this.v5 = new abcd.Zt(r0, r5);
        this.Zo = new abcd.Zt(r2, r6, r7);
        return;
    L11:
        throw new java.lang.NullPointerException("spacer == null");
    L13:
        throw new java.lang.IllegalArgumentException("rightWidth < 1");
    L15:
        throw new java.lang.IllegalArgumentException("leftWidth < 1");
    L17:
        throw new java.lang.NullPointerException("out == null");
    }

    private void Hw() {
        j6(this.FH, this.v5);
    L4:
        if (this.FH.length() == 0) goto L6;
        this.Zo.write(10);
        Zo();
        goto L4
    }

    private void Zo() {
    L2:
        int r0 = this.FH.indexOf("\n");
        if (r0 < 0) goto L4;
        int r1 = this.Hw.indexOf("\n");
        if (r1 < 0) goto L7;
        if (r0 == 0) goto L11;
        this.j6.write(this.FH.substring(0, r0));
    L11:
        if (r1 == 0) goto L13;
        j6(this.j6, this.DW - r0);
        this.j6.write(this.Hw.substring(0, r1));
    L13:
        this.j6.write(10);
        this.FH.delete(0, r0 + 1);
        this.Hw.delete(0, r1 + 1);
        goto L2
    L7:
        return;
    }

    public static java.lang.String j6(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, int r7) {
        java.io.StringWriter r2 = new java.io.StringWriter((r3.length() + r6.length()) * 3);
        abcd.mu r0 = new abcd.mu(r2, r4, r7, r5);
        r0.DW().write(r3);     // Catch: java.io.IOException -> L6
        r0.FH().write(r6);     // Catch: java.io.IOException -> L6
        r0.j6();
        return r2.toString();
    L6:
        e = move-exception;
        throw new java.lang.RuntimeException("shouldn't happen", e);
    }

    private static void j6(java.io.Writer r1, int r2) {
    L2:
        if (r2 <= 0) goto L4;
        r1.write(32);
        r2 = r2 - 1;
        goto L2
    }

    private static void j6(java.lang.StringBuffer r1, java.io.Writer r2) {
        int r0 = r1.length();
        if (r0 != 0) goto L5;
        return;
    L5:
        if (r1.charAt(r0 - 1) == '\n') goto L9;
        r2.write(10);
        return;
    }

    private void v5() {
        j6(this.Hw, this.Zo);
    L4:
        if (this.Hw.length() == 0) goto L6;
        this.v5.write(10);
        Zo();
        goto L4
    }

    public java.io.Writer DW() {
        return this.v5;
    }

    public java.io.Writer FH() {
        return this.Zo;
    }

    public void j6() {
        j6(this.FH, this.v5);     // Catch: java.io.IOException -> L4
        j6(this.Hw, this.Zo);     // Catch: java.io.IOException -> L4
        Zo();     // Catch: java.io.IOException -> L4
        Hw();     // Catch: java.io.IOException -> L4
        v5();     // Catch: java.io.IOException -> L4
        return;
    L4:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }
}
