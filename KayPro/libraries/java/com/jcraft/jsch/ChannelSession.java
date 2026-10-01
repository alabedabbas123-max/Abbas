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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof java.lang.String) == false) { $pc0 = 7; continue $sw0; }
                    return com.jcraft.jsch.Util.FH((java.lang.String) r2);
                }
                case 7: {
                    return (byte[]) r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(boolean r1) {
        this.gW = r1;
    }

    protected void XL() {
        com.jcraft.jsch.Session r0 = null;
        com.jcraft.jsch.RequestPtyReq r1 = null;
        byte[] r2 = null;
        java.util.Hashtable r3 = null;
        java.util.Enumeration r4 = null;
        java.lang.Object r5 = null;
        java.lang.Object r6 = null;
        com.jcraft.jsch.RequestEnv r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = EQ();
                    if (this.rN == false) { $pc1 = 6; continue $sw1; }
                    new com.jcraft.jsch.RequestAgentForwarding().j6(r0, this);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (this.er == false) { $pc1 = 9; continue $sw1; }
                    new com.jcraft.jsch.RequestX11().j6(r0, this);
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (this.gW == false) { $pc1 = 14; continue $sw1; }
                    r1 = new com.jcraft.jsch.RequestPtyReq();
                    r1.j6(this.BT);
                    r1.j6(this.vy, this.P8, this.ei, this.nw);
                    r2 = this.SI;
                    if (r2 == null) { $pc1 = 13; continue $sw1; }
                    r1.j6(r2);
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r1.j6(r0, this);
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r3 = this.yS;
                    if (r3 == null) { $pc1 = 21; continue $sw1; }
                    r4 = r3.keys();
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    if (r4.hasMoreElements() == false) { $pc1 = 23; continue $sw1; }
                    r5 = r4.nextElement();
                    r6 = this.yS.get(r5);
                    r7 = new com.jcraft.jsch.RequestEnv();
                    r7.j6(j6(r5), j6(r6));
                    r7.j6(r0, this);
                    { $pc1 = 18; continue $sw1; }
                }
                case 23: {
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r1) {
        this.rN = r1;
    }

    @Override
    public void run() {
        com.jcraft.jsch.Buffer r0 = null;
        com.jcraft.jsch.Packet r1 = null;
        int r2 = 0;
        java.lang.Thread r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new com.jcraft.jsch.Buffer(this.tp);
                    r1 = new com.jcraft.jsch.Packet(r0);
                    $pc2 = 35; continue $sw2;
                }
                case 35: {
                    if (J0() == false) { $pc2 = 24; continue $sw2; }
                    if (this.we == null) { $pc2 = 24; continue $sw2; }
                    if (this.EQ == null) { $pc2 = 24; continue $sw2; }
                    if (this.EQ.j6 == null) { $pc2 = 24; continue $sw2; }
                    try {
                        r2 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 23; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == 0) { $pc2 = 35; continue $sw2; }
                    if (r2 == (-1)) { $pc2 = 17; continue $sw2; }
                    if (this.Ws == true) { $pc2 = 24; continue $sw2; }
                    try {
                        r1.DW();
                        r0.j6((byte) 94);
                        r0.FH(this.Hw);
                        r0.FH(r2);
                        r0.v5(r2);
                        EQ().j6(r1, this, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 23; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 35; continue $sw2; }
                }
                case 17: {
                    try {
                        FH();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 23; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    r3 = this.we;
                    if (r3 == null) { $pc2 = 33; continue $sw2; }
                    monitor-enter(r3);
                    try {
                        r3.notifyAll();
                        monitor-exit(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 30; continue $sw2;
                    }
                    $pc2 = 30; continue $sw2;
                }
                case 30: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 33: {
                    this.we = null;
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
