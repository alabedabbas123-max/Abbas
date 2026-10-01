package com.jcraft.jsch;

class ChannelSession extends com.jcraft.jsch.Channel {
    private static byte[] lg;
    protected java.lang.String BT;
    protected int P8;
    protected byte[] SI;
    protected int ei;
    protected boolean er;
    protected boolean gW;
    protected int nw;
    protected boolean rN;
    protected int vy;
    protected java.util.Hashtable yS;

    static {
        lg = com.jcraft.jsch.Util.FH("session");
    }

    ChannelSession() {
        this.rN = false;
        this.er = false;
        this.yS = null;
        this.gW = false;
        this.BT = "vt100";
        this.vy = 80;
        this.P8 = 24;
        this.ei = 640;
        this.nw = 480;
        this.SI = null;
        this.v5 = lg;
        this.EQ = new com.jcraft.jsch.IO();
    }

    private byte[] j6(java.lang.Object r2) {
        if ((r2 instanceof java.lang.String) == false) goto L7;
        return com.jcraft.jsch.Util.FH((java.lang.String) r2);
    L7:
        return (byte[]) r2;
    }

    public void DW(boolean r1) {
        this.gW = r1;
    }

    protected void XL() {
        com.jcraft.jsch.Session r0 = EQ();
        if (this.rN == false) goto L6;
        new com.jcraft.jsch.RequestAgentForwarding().j6(r0, this);
    L6:
        if (this.er == false) goto L9;
        new com.jcraft.jsch.RequestX11().j6(r0, this);
    L9:
        if (this.gW == false) goto L14;
        com.jcraft.jsch.RequestPtyReq r1 = new com.jcraft.jsch.RequestPtyReq();
        r1.j6(this.BT);
        r1.j6(this.vy, this.P8, this.ei, this.nw);
        byte[] r2 = this.SI;
        if (r2 == null) goto L13;
        r1.j6(r2);
    L13:
        r1.j6(r0, this);
    L14:
        java.util.Hashtable r3 = this.yS;
        if (r3 == null) goto L21;
        java.util.Enumeration r4 = r3.keys();
    L18:
        if (r4.hasMoreElements() == false) goto L23;
        java.lang.Object r5 = r4.nextElement();
        java.lang.Object r6 = this.yS.get(r5);
        com.jcraft.jsch.RequestEnv r7 = new com.jcraft.jsch.RequestEnv();
        r7.j6(j6(r5), j6(r6));
        r7.j6(r0, this);
        goto L18
    L23:
        return;
    }

    public void j6(boolean r1) {
        this.rN = r1;
    }

    @Override
    public void run() {
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(this.tp);
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
    L35:
        if (J0() == false) goto L24;
        if (this.we == null) goto L24;
        if (this.EQ == null) goto L24;
        if (this.EQ.j6 == null) goto L24;
        int r2 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);     // Catch: java.lang.Exception -> L23
        if (r2 == 0) goto L35;
        if (r2 == (-1)) goto L17;
        if (this.Ws == true) goto L24;
        r1.DW();     // Catch: java.lang.Exception -> L23
        r0.j6((byte) 94);     // Catch: java.lang.Exception -> L23
        r0.FH(this.Hw);     // Catch: java.lang.Exception -> L23
        r0.FH(r2);     // Catch: java.lang.Exception -> L23
        r0.v5(r2);     // Catch: java.lang.Exception -> L23
        EQ().j6(r1, this, r2);     // Catch: java.lang.Exception -> L23
        goto L35
    L17:
        FH();     // Catch: java.lang.Exception -> L23
    L24:
        java.lang.Thread r3 = this.we;
        if (r3 == null) goto L33;
        monitor-enter(r3);
        r3.notifyAll();     // Catch: java.lang.Throwable -> L30
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L30
    L30:
        th = move-exception;
        throw th;
    L33:
        this.we = null;
    }
}
