package com.jcraft.jsch;

abstract class Request {
    private com.jcraft.jsch.Session DW;
    private com.jcraft.jsch.Channel FH;
    private boolean j6;

    Request() {
        this.j6 = false;
        this.DW = null;
        this.FH = null;
    }

    void j6(com.jcraft.jsch.Packet r9) {
        if (this.j6 == false) goto L5;
        this.FH.j3 = -1;
    L5:
        this.DW.DW(r9);
        if (this.j6 == false) goto L27;
        long r2 = java.lang.System.currentTimeMillis();
        long r4 = this.FH.Mr;
    L9:
        if (this.FH.J0() == false) goto L23;
        if (this.FH.j3 != (-1)) goto L23;
        java.lang.Thread.sleep(10);     // Catch: java.lang.Exception -> L28
    L16:
        if (r4 <= 0) goto L9;
        if ((java.lang.System.currentTimeMillis() - r2) <= r4) goto L9;
        this.FH.j3 = 0;
        throw new com.jcraft.jsch.JSchException("channel request: timeout");
    L23:
        if (this.FH.j3 == 0) goto L26;
        return;
    L26:
        throw new com.jcraft.jsch.JSchException("failed to send channel request");
    }

    void j6(com.jcraft.jsch.Session r1, com.jcraft.jsch.Channel r2) {
        this.DW = r1;
        this.FH = r2;
        if (r2.Mr <= 0) goto L6;
        j6(true);
        return;
    }

    void j6(boolean r1) {
        this.j6 = r1;
    }

    boolean j6() {
        return this.j6;
    }
}
