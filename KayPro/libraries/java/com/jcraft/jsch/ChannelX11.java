package com.jcraft.jsch;

class ChannelX11 extends com.jcraft.jsch.Channel {
    private static byte[] BT = null;
    static byte[] er = null;
    private static java.util.Hashtable gW = null;
    private static java.lang.String lg = "127.0.0.1";
    private static int rN = 6000;
    private static java.util.Hashtable yS;
    private java.net.Socket P8;
    private byte[] ei;
    private boolean vy;

    static {
        yS = new java.util.Hashtable();
        gW = new java.util.Hashtable();
        BT = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    ChannelX11() {
        this.vy = true;
        this.P8 = null;
        this.ei = new byte[0];
        Zo(131072);
        v5(131072);
        Hw(16384);
        this.v5 = com.jcraft.jsch.Util.FH("x11");
        this.QX = true;
    }

    static byte[] FH(com.jcraft.jsch.Session r8) {
        java.util.Hashtable r0 = null;
        byte[] r1 = null;
        com.jcraft.jsch.Random r2 = null;
        byte[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = gW;
                    monitor-enter(r0);
                    try {
                        r1 = (byte[]) gW.get(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    if (r1 != null) { $pc0 = 19; continue $sw0; }
                    try {
                        r2 = com.jcraft.jsch.Session.j6;
                        r3 = new byte[16];
                        monitor-enter(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    r4 = 0;
                    try {
                        r2.j6(r3, 0, 16);
                        monitor-exit(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    try {
                        yS.put(r8, r3);
                        r1 = new byte[32];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r4 >= 16) { $pc0 = 13; continue $sw0; }
                    try {
                        r5 = r4 * 2;
                        r1[r5] = BT[(r3[r4] >>> 4) & 15];
                        r1[r5 + 1] = BT[r3[r4] & 15];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    r4 = r4 + 1;
                    { $pc0 = 12; continue $sw0; }
                }
                case 13: {
                    try {
                        gW.put(r8, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    { $pc0 = 19; continue $sw0; }
                }
                case 16: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                }
                case 19: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 21; continue $sw0;
                    }
                    return r1;
                }
                case 21: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] FH(byte[] r3, int r4, int r5) {
        byte[] r0 = null;
        byte[] r1 = null;
        byte[] r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.ei;
                    r1 = new byte[r0.length + r5];
                    java.lang.System.arraycopy(r3, r4, r1, r0.length, r5);
                    r6 = this.ei;
                    if (r6.length <= 0) { $pc1 = 5; continue $sw1; }
                    java.lang.System.arraycopy(r6, 0, r1, 0, r6.length);
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    this.ei = r1;
                    return this.ei;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void Hw(com.jcraft.jsch.Session r2) {
        java.util.Hashtable r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = gW;
                    monitor-enter(r0);
                    try {
                        gW.remove(r2);
                        yS.remove(r2);
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                case 7: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(byte[] r4, byte[] r5) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4.length == r5.length) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    r0 = 0;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r0 >= r4.length) { $pc3 = 8; continue $sw3; }
                    if (r4[r0] != r5[r0]) { $pc3 = 12; continue $sw3; }
                    r0 = r0 + 1;
                    { $pc3 = 7; continue $sw3; }
                }
                case 12: {
                    return false;
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(byte[] r7, int r8, int r9) {
        com.jcraft.jsch.Session r0 = null;
        byte[] r10 = null;
        int r11 = 0;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        byte[] r3 = null;
        int r5 = 0;
        java.util.Hashtable r6 = null;
        byte[] r12 = null;
        byte[] r13 = null;
        int r14 = 0;
        int r15 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.vy == true) { $pc4 = 38; continue $sw4; }
                    this.EQ.DW(r7, r8, r9);
                    return;
                }
                case 38: {
                    try {
                        r0 = EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc4 = 31; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r10 = FH(r7, r8, r9);
                    r11 = r10.length;
                    if (r11 >= 9) { $pc4 = 8; continue $sw4; }
                    return;
                }
                case 8: {
                    r1 = ((r10[6] & 255) * 256) + (r10[7] & 255);
                    r2 = ((r10[8] & 255) * 256) + (r10[9] & 255);
                    if ((r10[0] & 255) != 66) { $pc4 = 11; continue $sw4; }
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    r4 = (-r1) & 3;
                    if (r11 >= (((r1 + 12) + r4) + r2)) { $pc4 = 16; continue $sw4; }
                    return;
                }
                case 16: {
                    r3 = new byte[r2];
                    r5 = (12 + r1) + r4;
                    java.lang.System.arraycopy(r10, r5, r3, 0, r2);
                    r6 = yS;
                    monitor-enter(r6);
                    try {
                        r12 = (byte[]) yS.get(r0);
                        monitor-exit(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 28; continue $sw4;
                    }
                    if (j6(r3, r12) == false) { $pc4 = 25; continue $sw4; }
                    r13 = er;
                    if (r13 == null) { $pc4 = 26; continue $sw4; }
                    java.lang.System.arraycopy(r13, 0, r10, r5, r2);
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    this.vy = false;
                    this.EQ.DW(r10, 0, r11);
                    this.ei = null;
                    return;
                }
                case 25: {
                    this.we = null;
                    FH();
                    this.EQ.j6();
                    DW();
                    $pc4 = 28; continue $sw4;
                }
                case 28: {
                    th = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 11: {
                    if ((r10[0] & 255) != 108) { $pc4 = 13; continue $sw4; }
                    r14 = (r1 >>> 8) & 255;
                    r1 = ((r1 << 8) & 65280) | r14;
                    r15 = (r2 >>> 8) & 255;
                    r2 = ((r2 << 8) & 65280) | r15;
                    $pc4 = 31; continue $sw4;
                }
                case 31: {
                    e = $ex4;
                    throw new java.io.IOException(e.toString());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void run() {
        com.jcraft.jsch.Buffer r0 = null;
        com.jcraft.jsch.Packet r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        this.P8 = com.jcraft.jsch.Util.j6(lg, rN, 10000);
                        this.P8.setTcpNoDelay(true);
                        this.EQ = new com.jcraft.jsch.IO();
                        this.EQ.j6(this.P8.getInputStream());
                        this.EQ.DW(this.P8.getOutputStream());
                        Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 22; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.we = java.lang.Thread.currentThread();
                    r0 = new com.jcraft.jsch.Buffer(this.tp);
                    r1 = new com.jcraft.jsch.Packet(r0);
                    $pc5 = 27; continue $sw5;
                }
                case 27: {
                    if (this.we == null) { $pc5 = 20; continue $sw5; }
                    if (this.EQ == null) { $pc5 = 20; continue $sw5; }
                    if (this.EQ.j6 == null) { $pc5 = 20; continue $sw5; }
                    try {
                        r2 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 24; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 <= 0) { $pc5 = 14; continue $sw5; }
                    if (this.Ws == true) { $pc5 = 20; continue $sw5; }
                    try {
                        r1.DW();
                        r0.j6((byte) 94);
                        r0.FH(this.Hw);
                        r0.FH(r2);
                        r0.v5(r2);
                        EQ().j6(r1, this, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 24; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc5 = 27; continue $sw5; }
                }
                case 14: {
                    try {
                        FH();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 24; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 20; continue $sw5;
                }
                case 20: {
                    DW();
                    return;
                }
                case 22: {
                    DW(1);
                    this.Ws = true;
                    DW();
                    $pc5 = 24; continue $sw5;
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
