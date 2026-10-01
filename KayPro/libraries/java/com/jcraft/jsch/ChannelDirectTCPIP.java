package com.jcraft.jsch;

public class ChannelDirectTCPIP extends com.jcraft.jsch.Channel {
    private static final byte[] lg = null;
    int er;
    int gW;
    java.lang.String rN;
    java.lang.String yS;

    static {
        lg = com.jcraft.jsch.Util.FH("direct-tcpip");
    }

    ChannelDirectTCPIP() {
        this.yS = "127.0.0.1";
        this.gW = 0;
        this.v5 = lg;
        Zo(131072);
        v5(131072);
        Hw(16384);
    }

    public void DW(java.lang.String r1) {
        this.rN = r1;
    }

    public void FH(java.lang.String r1) {
        this.yS = r1;
    }

    @Override
    public void j6(int r4) {
        this.Mr = r4;
        com.jcraft.jsch.Session r5 = EQ();     // Catch: java.lang.Exception -> L14
        if (r5.tp() == false) goto L13;
        if (this.EQ.j6 == null) goto L11;
        this.we = new java.lang.Thread(this);     // Catch: java.lang.Exception -> L14
        this.we.setName("DirectTCPIP thread " + r5.DW());     // Catch: java.lang.Exception -> L14
        if (r5.x9 == false) goto L10;
        this.we.setDaemon(r5.x9);     // Catch: java.lang.Exception -> L14
    L10:
        this.we.start();     // Catch: java.lang.Exception -> L14
        return;
    L11:
        J8();     // Catch: java.lang.Exception -> L14
        return;
    L13:
        throw new com.jcraft.jsch.JSchException("session is down");     // Catch: java.lang.Exception -> L14
    L14:
        e = move-exception;
        this.EQ.j6();
        this.EQ = null;
        com.jcraft.jsch.Channel.j6(this);
        if ((e instanceof com.jcraft.jsch.JSchException) == true) goto L19;
        return;
    L19:
        throw ((com.jcraft.jsch.JSchException) e);
    }

    public void j6(java.io.InputStream r2) {
        this.EQ.j6(r2);
    }

    public void j6(java.io.OutputStream r2) {
        this.EQ.DW(r2);
    }

    @Override
    public void run() {
        J8();     // Catch: java.lang.Exception -> L29
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(this.tp);     // Catch: java.lang.Exception -> L29
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);     // Catch: java.lang.Exception -> L29
        com.jcraft.jsch.Session r2 = EQ();     // Catch: java.lang.Exception -> L29
    L4:
        if (J0() == false) goto L27;
        if (this.we == null) goto L27;
        if (this.EQ == null) goto L27;
        if (this.EQ.j6 == null) goto L27;
        int r3 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);     // Catch: java.lang.Exception -> L29
        if (r3 <= 0) goto L14;
        r1.DW();     // Catch: java.lang.Exception -> L29
        r0.j6((byte) 94);     // Catch: java.lang.Exception -> L29
        r0.FH(this.Hw);     // Catch: java.lang.Exception -> L29
        r0.FH(r3);     // Catch: java.lang.Exception -> L29
        r0.v5(r3);     // Catch: java.lang.Exception -> L29
        monitor-enter(this);     // Catch: java.lang.Exception -> L29
    L24:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L29
    L18:
        if (this.Ws == true) goto L19;
        r2.j6(r1, this, r3);     // Catch: java.lang.Throwable -> L24
        monitor-exit(this);     // Catch: java.lang.Throwable -> L24
        goto L4
    L19:
        monitor-exit(this);     // Catch: java.lang.Throwable -> L24
        goto L30
    L14:
        FH();     // Catch: java.lang.Exception -> L29
    L27:
        FH();
        DW();
        return;
    L30:
        if (this.QX == true) goto L32;
        this.QX = true;
    L32:
        DW();
    }

    public void tp(int r1) {
        this.er = r1;
    }

    public void u7(int r1) {
        this.gW = r1;
    }

    @Override
    protected com.jcraft.jsch.Packet v5() {
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(((this.rN.length() + 50) + this.yS.length()) + 84);
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
        r1.DW();
        r0.j6((byte) 90);
        r0.Hw(this.v5);
        r0.FH(this.FH);
        r0.FH(this.VH);
        r0.FH(this.gn);
        r0.Hw(com.jcraft.jsch.Util.FH(this.rN));
        r0.FH(this.er);
        r0.Hw(com.jcraft.jsch.Util.FH(this.yS));
        r0.FH(this.gW);
        return r1;
    }

    @Override
    void we() {
        this.EQ = new com.jcraft.jsch.IO();
    }
}
