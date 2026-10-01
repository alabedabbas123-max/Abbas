package com.jcraft.jsch;

public class ChannelForwardedTCPIP extends com.jcraft.jsch.Channel {
    private static java.util.Vector lg;
    private com.jcraft.jsch.ForwardedTCPIPDaemon er;
    private java.net.Socket rN;
    private com.jcraft.jsch.ChannelForwardedTCPIP.Config yS;

    static abstract class Config {
        int DW;
        int FH;
        java.lang.String Hw;
        com.jcraft.jsch.Session j6;
        java.lang.String v5;

        Config() {
        }
    }

    static class ConfigDaemon extends com.jcraft.jsch.ChannelForwardedTCPIP.Config {
        java.lang.Object[] Zo;

        ConfigDaemon() {
        }
    }

    static class ConfigLHost extends com.jcraft.jsch.ChannelForwardedTCPIP.Config {
        com.jcraft.jsch.SocketFactory VH;
        int Zo;

        ConfigLHost() {
        }
    }

    static {
        lg = new java.util.Vector();
    }

    ChannelForwardedTCPIP() {
        this.rN = null;
        this.er = null;
        this.yS = null;
        Zo(131072);
        v5(131072);
        Hw(16384);
        this.EQ = new com.jcraft.jsch.IO();
        this.QX = true;
    }

    private static com.jcraft.jsch.ChannelForwardedTCPIP.Config DW(com.jcraft.jsch.Session r4, java.lang.String r5, int r6) {
        java.util.Vector r0 = null;
        int r1 = 0;
        com.jcraft.jsch.ChannelForwardedTCPIP.Config r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = lg;
                    monitor-enter(r0);
                    r1 = 0;
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 6: {
                    if (r1 >= lg.size()) { $pc0 = 7; continue $sw0; }
                    try {
                        r2 = (com.jcraft.jsch.ChannelForwardedTCPIP.Config) lg.elementAt(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    if (r2.j6 == r4) { $pc0 = 14; continue $sw0; }
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    { $pc0 = 31; continue $sw0; }
                }
                case 14: {
                    if (r2.DW != r6) { $pc0 = 16; continue $sw0; }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    if (r5 == null) { $pc0 = 24; continue $sw0; }
                    if (r2.Hw.equals(r5) == false) { $pc0 = 23; continue $sw0; }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    return r2;
                }
                case 16: {
                    if (r2.DW != 0) { $pc0 = 23; continue $sw0; }
                    if (r2.FH == r6) { $pc0 = 20; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String DW(java.lang.String r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != null) { $pc1 = 6; continue $sw1; }
                    return "localhost";
                }
                case 6: {
                    if (r1.length() != 0) { $pc1 = 8; continue $sw1; }
                    return "";
                }
                case 8: {
                    if (r1.equals("*") == true) { $pc1 = 13; continue $sw1; }
                    return r1;
                }
                case 13: {
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void FH(com.jcraft.jsch.Session r7) {
        java.util.Vector r0 = null;
        int[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        com.jcraft.jsch.ChannelForwardedTCPIP.Config r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = lg;
                    monitor-enter(r0);
                    try {
                        r1 = new int[lg.size()];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    r2 = 0;
                    r3 = 0;
                    r4 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r3 >= lg.size()) { $pc2 = 7; continue $sw2; }
                    try {
                        r5 = (com.jcraft.jsch.ChannelForwardedTCPIP.Config) lg.elementAt(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    if (r5.j6 != r7) { $pc2 = 14; continue $sw2; }
                    try {
                        r1[r4] = r5.DW;
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    { $pc2 = 6; continue $sw2; }
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r2 >= r4) { $pc2 = 9; continue $sw2; }
                    j6(r7, r1[r2]);
                    r2 = r2 + 1;
                    { $pc2 = 8; continue $sw2; }
                }
                case 9: {
                    return;
                }
                case 15: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.jcraft.jsch.Session r1, int r2) {
        j6(r1, null, r2);
    }

    static void j6(com.jcraft.jsch.Session r3, java.lang.String r4, int r5) {
        java.util.Vector r0 = null;
        com.jcraft.jsch.ChannelForwardedTCPIP.Config r1 = null;
        com.jcraft.jsch.Buffer r2 = null;
        com.jcraft.jsch.Packet r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = lg;
                    monitor-enter(r0);
                    try {
                        r1 = DW(r3, DW(r4), r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 19; continue $sw3;
                    }
                    if (r1 != null) { $pc3 = 7; continue $sw3; }
                    try {
                        r1 = DW(r3, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 19; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r1 != null) { $pc3 = 10; continue $sw3; }
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 19; continue $sw3;
                    }
                    return;
                }
                case 10: {
                    try {
                        lg.removeElement(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 19; continue $sw3;
                    }
                    if (r4 != null) { $pc3 = 13; continue $sw3; }
                    try {
                        r4 = r1.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 19; continue $sw3;
                    }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (r4 != null) { $pc3 = 15; continue $sw3; }
                    r4 = "0.0.0.0";
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 19; continue $sw3;
                    }
                    r2 = new com.jcraft.jsch.Buffer(100);
                    r6 = new com.jcraft.jsch.Packet(r2);
                    try {
                        r6.DW();
                        r2.j6((byte) 80);
                        r2.Hw(com.jcraft.jsch.Util.FH("cancel-tcpip-forward"));
                        r2.j6((byte) 0);
                        r2.Hw(com.jcraft.jsch.Util.FH(r4));
                        r2.FH(r5);
                        r3.DW(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 22; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 26: {
                    return;
                }
                case 19: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.jcraft.jsch.Session r2, java.lang.String r3, int r4, int r5, java.lang.String r6, int r7, com.jcraft.jsch.SocketFactory r8) {
        java.lang.String r9 = null;
        java.util.Vector r0 = null;
        com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r9 = DW(r3);
                    r0 = lg;
                    monitor-enter(r0);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    th = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (DW(r2, r9, r4) != null) { $pc4 = 10; continue $sw4; }
                    try {
                        r1 = new com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost();
                        r1.j6 = r2;
                        r1.DW = r4;
                        r1.FH = r5;
                        r1.v5 = r6;
                        r1.Zo = r7;
                        r1.Hw = r9;
                        r1.VH = r8;
                        lg.addElement(r1);
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    return;
                }
                case 10: {
                    try {
                        throw new com.jcraft.jsch.JSchException("PortForwardingR: remote port " + r4 + " is already registered.");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(com.jcraft.jsch.Buffer r6) {
        byte[] r0 = null;
        int r1 = 0;
        com.jcraft.jsch.Session r2 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    VH(r6.FH());
                    DW(r6.EQ());
                    gn(r6.FH());
                    r0 = r6.tp();
                    r1 = r6.FH();
                    r6.tp();
                    r6.FH();
                    try {
                        r2 = EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc5 = 5; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    this.yS = DW(r2, com.jcraft.jsch.Util.j6(r0), r1);
                    if (this.yS != null) { $pc5 = 10; continue $sw5; }
                    this.yS = DW(r2, null, r1);
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (this.yS == null) { $pc5 = 12; continue $sw5; }
                    return;
                }
                case 12: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(3) == false) { $pc5 = 18; continue $sw5; }
                    com.jcraft.jsch.JSch.v5().j6(3, "ChannelForwardedTCPIP: " + com.jcraft.jsch.Util.j6(r0) + ":" + r1 + " is not registered.");
                    return;
                }
                case 18: {
                    return;
                }
                case 5: {
                    r2 = null;
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void run() {
        com.jcraft.jsch.ChannelForwardedTCPIP.ConfigDaemon r1 = null;
        java.io.PipedOutputStream r2 = null;
        com.jcraft.jsch.Buffer r0 = null;
        com.jcraft.jsch.Packet r3 = null;
        com.jcraft.jsch.Session r4 = null;
        int r5 = 0;
        com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost r6 = null;
        java.net.Socket r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 38;
        $sw6: while (true) {
            switch ($pc6) {
                case 38: {
                    DW(1);
                    this.Ws = true;
                    DW();
                    return;
                }
                case 4: {
                    if ((this.yS instanceof com.jcraft.jsch.ChannelForwardedTCPIP.ConfigDaemon) == false) { $pc6 = 6; continue $sw6; }
                    try {
                        r1 = (com.jcraft.jsch.ChannelForwardedTCPIP.ConfigDaemon) this.yS;
                        this.er = (com.jcraft.jsch.ForwardedTCPIPDaemon) java.lang.Class.forName(r1.v5).newInstance();
                        r2 = new java.io.PipedOutputStream();
                        this.EQ.j6(new com.jcraft.jsch.Channel.PassiveInputStream(this, r2, 32768), false);
                        this.er.j6(this, gn(), r2);
                        this.er.j6(r1.Zo);
                        new java.lang.Thread(this.er).start();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 38; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    try {
                        Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 38; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.we = java.lang.Thread.currentThread();
                    r0 = new com.jcraft.jsch.Buffer(this.tp);
                    r3 = new com.jcraft.jsch.Packet(r0);
                    try {
                        r4 = EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 40; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    if (this.we == null) { $pc6 = 36; continue $sw6; }
                    if (this.EQ == null) { $pc6 = 36; continue $sw6; }
                    if (this.EQ.j6 == null) { $pc6 = 36; continue $sw6; }
                    try {
                        r5 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 40; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 <= 0) { $pc6 = 23; continue $sw6; }
                    try {
                        r3.DW();
                        r0.j6((byte) 94);
                        r0.FH(this.Hw);
                        r0.FH(r5);
                        r0.v5(r5);
                        monitor-enter(this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 40; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 33; continue $sw6;
                }
                case 33: {
                    th = $ex6;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 40; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 27: {
                    if (this.Ws == true) { $pc6 = 28; continue $sw6; }
                    try {
                        r4.j6(r3, this, r5);
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 33; continue $sw6;
                    }
                    { $pc6 = 15; continue $sw6; }
                }
                case 28: {
                    try {
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 33; continue $sw6;
                    }
                    { $pc6 = 36; continue $sw6; }
                }
                case 23: {
                    try {
                        FH();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 40; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 36; continue $sw6;
                }
                case 36: {
                    DW();
                    return;
                }
                case 6: {
                    try {
                        r6 = (com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost) this.yS;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 38; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6.VH != null) { $pc6 = 9; continue $sw6; }
                    try {
                        r7 = com.jcraft.jsch.Util.j6(r6.v5, r6.Zo, 10000);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 38; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    try {
                        this.rN = r7;
                        this.rN.setTcpNoDelay(true);
                        this.EQ.j6(this.rN.getInputStream());
                        this.EQ.DW(this.rN.getOutputStream());
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 38; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc6 = 11; continue $sw6; }
                }
                case 9: {
                    try {
                        r7 = r6.VH.j6(r6.v5, r6.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 38; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc6 = 10; continue $sw6; }
                }
                case 40: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
