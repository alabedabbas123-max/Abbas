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
        com.jcraft.jsch.Session r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Mr = r4;
                    try {
                        r5 = EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5.tp() == false) { $pc0 = 13; continue $sw0; }
                    if (this.EQ.j6 == null) { $pc0 = 11; continue $sw0; }
                    try {
                        this.we = new java.lang.Thread(this);
                        this.we.setName("DirectTCPIP thread " + r5.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5.x9 == false) { $pc0 = 10; continue $sw0; }
                    try {
                        this.we.setDaemon(r5.x9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        this.we.start();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    try {
                        J8();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 13: {
                    try {
                        throw new com.jcraft.jsch.JSchException("session is down");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 14: {
                    e = $ex0;
                    this.EQ.j6();
                    this.EQ = null;
                    com.jcraft.jsch.Channel.j6(this);
                    if ((e instanceof com.jcraft.jsch.JSchException) == true) { $pc0 = 19; continue $sw0; }
                    return;
                }
                case 19: {
                    throw ((com.jcraft.jsch.JSchException) e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.InputStream r2) {
        this.EQ.j6(r2);
    }

    public void j6(java.io.OutputStream r2) {
        this.EQ.DW(r2);
    }

    @Override
    public void run() {
        com.jcraft.jsch.Buffer r0 = null;
        com.jcraft.jsch.Packet r1 = null;
        com.jcraft.jsch.Session r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        J8();
                        r0 = new com.jcraft.jsch.Buffer(this.tp);
                        r1 = new com.jcraft.jsch.Packet(r0);
                        r2 = EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (J0() == false) { $pc1 = 27; continue $sw1; }
                    if (this.we == null) { $pc1 = 27; continue $sw1; }
                    if (this.EQ == null) { $pc1 = 27; continue $sw1; }
                    if (this.EQ.j6 == null) { $pc1 = 27; continue $sw1; }
                    try {
                        r3 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 <= 0) { $pc1 = 14; continue $sw1; }
                    try {
                        r1.DW();
                        r0.j6((byte) 94);
                        r0.FH(this.Hw);
                        r0.FH(r3);
                        r0.v5(r3);
                        monitor-enter(this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    th = $ex1;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 18: {
                    if (this.Ws == true) { $pc1 = 19; continue $sw1; }
                    try {
                        r2.j6(r1, this, r3);
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 4; continue $sw1; }
                }
                case 19: {
                    try {
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 30; continue $sw1; }
                }
                case 14: {
                    try {
                        FH();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    FH();
                    DW();
                    return;
                }
                case 30: {
                    if (this.QX == true) { $pc1 = 32; continue $sw1; }
                    this.QX = true;
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    DW();
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
