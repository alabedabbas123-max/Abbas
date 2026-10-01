package com.jcraft.jsch;

public class IO {
    java.io.OutputStream DW;
    java.io.OutputStream FH;
    private boolean Hw;
    private boolean Zo;
    java.io.InputStream j6;
    private boolean v5;

    public IO() {
        this.Hw = false;
        this.v5 = false;
        this.Zo = false;
    }

    int DW() {
        return this.j6.read();
    }

    void DW(java.io.OutputStream r1) {
        this.DW = r1;
    }

    void DW(java.io.OutputStream r1, boolean r2) {
        this.v5 = r2;
        DW(r1);
    }

    void DW(byte[] r2, int r3, int r4) {
        this.DW.write(r2, r3, r4);
        this.DW.flush();
    }

    void FH() {
        if (this.DW != null) goto L5;
    L7:
        this.DW = null;     // Catch: java.lang.Exception -> L9
        return;
    L5:
        if (this.v5 == true) goto L7;
        this.DW.close();     // Catch: java.lang.Exception -> L9
    }

    void FH(byte[] r2, int r3, int r4) {
        this.FH.write(r2, r3, r4);
        this.FH.flush();
    }

    public void j6() {
        if (this.j6 != null) goto L6;
    L8:
        this.j6 = null;     // Catch: java.lang.Exception -> L17
        goto L9
    L6:
        if (this.Hw == true) goto L8;
        this.j6.close();     // Catch: java.lang.Exception -> L17
    L9:
        FH();
        if (this.FH != null) goto L13;
    L15:
        this.FH = null;     // Catch: java.lang.Exception -> L18
        return;
    L13:
        if (this.Zo == true) goto L15;
        this.FH.close();     // Catch: java.lang.Exception -> L18
    }

    public void j6(com.jcraft.jsch.Packet r4) {
        java.io.OutputStream r0 = this.DW;
        com.jcraft.jsch.Buffer r5 = r4.DW;
        r0.write(r5.DW, 0, r5.FH);
        this.DW.flush();
    }

    void j6(java.io.InputStream r1) {
        this.j6 = r1;
    }

    void j6(java.io.InputStream r1, boolean r2) {
        this.Hw = r2;
        j6(r1);
    }

    void j6(java.io.OutputStream r1) {
        this.FH = r1;
    }

    void j6(java.io.OutputStream r1, boolean r2) {
        this.Zo = r2;
        j6(r1);
    }

    void j6(byte[] r2, int r3, int r4) {
    L2:
        int r0 = this.j6.read(r2, r3, r4);
        if (r0 < 0) goto L8;
        r3 = r3 + r0;
        r4 = r4 - r0;
        if (r4 > 0) goto L2;
        return;
    L8:
        throw new java.io.IOException("End of IO Stream Read");
    }
}
