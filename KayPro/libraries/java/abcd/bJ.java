package abcd;

class bJ extends abcd.AbstracteE {
    private boolean VH;
    private final java.io.OutputStream Zo;

    bJ(java.io.OutputStream r1) {
        this.Zo = r1;
        this.VH = true;
    }

    private void j6(java.lang.StringBuilder r2) {
        if (this.VH == false) goto L10;
        this.Zo.write(abcd.hE.j6(r2.toString()));     // Catch: java.io.IOException -> L6
        this.Zo.flush();     // Catch: java.io.IOException -> L6
        return;
    L6:
        this.VH = false;
        return;
    }

    private void j6(java.lang.StringBuilder r1, java.lang.String r2, int r3) {
        r1.append(r2);
        r1.append(": ");
        r1.append(r3);
    }

    private void j6(java.lang.StringBuilder r2, java.lang.String r3, int r4, int r5, int r6) {
        r2.append(r3);
        r2.append(": ");
        if (r6 >= 100) goto L6;
        r2.append(' ');
    L6:
        if (r6 >= 10) goto L8;
        r2.append(' ');
    L8:
        r2.append(r6);
        r2.append("% (");
        r2.append(r4);
        r2.append("/");
        r2.append(r5);
        r2.append(")");
    }

    @Override
    protected void DW(java.lang.String r2, int r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        j6(r0, r2, r3);
        r0.append(", done\n");
        j6(r0);
    }

    @Override
    protected void DW(java.lang.String r8, int r9, int r10, int r11) {
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();
        j6(r6, r8, r9, r10, r11);
        r6.append("   \r");
        j6(r6);
    }

    @Override
    protected void FH(java.lang.String r2, int r3) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        j6(r0, r2, r3);
        r0.append("   \r");
        j6(r0);
    }

    @Override
    protected void j6(java.lang.String r8, int r9, int r10, int r11) {
        java.lang.StringBuilder r6 = new java.lang.StringBuilder();
        j6(r6, r8, r9, r10, r11);
        r6.append("\n");
        j6(r6);
    }
}
