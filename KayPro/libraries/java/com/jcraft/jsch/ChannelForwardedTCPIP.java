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
        java.util.Vector r0 = lg;
        monitor-enter(r0);
        int r1 = 0;
    L31:
    L26:
        th = move-exception;
        throw th;
    L6:
        if (r1 >= lg.size()) goto L7;
        com.jcraft.jsch.ChannelForwardedTCPIP.Config r2 = (com.jcraft.jsch.ChannelForwardedTCPIP.Config) lg.elementAt(r1);     // Catch: java.lang.Throwable -> L26
        if (r2.j6 == r4) goto L14;
    L23:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L26
        goto L31
    L14:
        if (r2.DW != r6) goto L16;
    L20:
        if (r5 == null) goto L24;
        if (r2.Hw.equals(r5) == false) goto L23;
    L24:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L26
        return r2;
    L16:
        if (r2.DW != 0) goto L23;
        if (r2.FH == r6) goto L20;
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L26
        return null;
    }

    static java.lang.String DW(java.lang.String r1) {
        if (r1 != null) goto L6;
        return "localhost";
    L6:
        if (r1.length() != 0) goto L8;
        return "";
    L8:
        if (r1.equals("*") == true) goto L13;
        return r1;
    L13:
        return "";
    }

    static void FH(com.jcraft.jsch.Session r7) {
        java.util.Vector r0 = lg;
        monitor-enter(r0);
        int[] r1 = new int[lg.size()];     // Catch: java.lang.Throwable -> L15
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r3 >= lg.size()) goto L7;
        com.jcraft.jsch.ChannelForwardedTCPIP.Config r5 = (com.jcraft.jsch.ChannelForwardedTCPIP.Config) lg.elementAt(r3);     // Catch: java.lang.Throwable -> L15
        if (r5.j6 != r7) goto L14;
        r1[r4] = r5.DW;     // Catch: java.lang.Throwable -> L15
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L15
    L14:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L15
        goto L6
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L15
    L8:
        if (r2 >= r4) goto L9;
        j6(r7, r1[r2]);
        r2 = r2 + 1;
        goto L8
    L9:
        return;
    L15:
        th = move-exception;
        throw th;
    }

    static void j6(com.jcraft.jsch.Session r1, int r2) {
        j6(r1, null, r2);
    }

    static void j6(com.jcraft.jsch.Session r3, java.lang.String r4, int r5) {
        java.util.Vector r0 = lg;
        monitor-enter(r0);
        com.jcraft.jsch.ChannelForwardedTCPIP.Config r1 = DW(r3, DW(r4), r5);     // Catch: java.lang.Throwable -> L19
        if (r1 != null) goto L7;
        r1 = DW(r3, null, r5);     // Catch: java.lang.Throwable -> L19
    L7:
        if (r1 != null) goto L10;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        return;
    L10:
        lg.removeElement(r1);     // Catch: java.lang.Throwable -> L19
        if (r4 != null) goto L13;
        r4 = r1.Hw;     // Catch: java.lang.Throwable -> L19
    L13:
        if (r4 != null) goto L15;
        r4 = "0.0.0.0";
    L15:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        com.jcraft.jsch.Buffer r2 = new com.jcraft.jsch.Buffer(100);
        com.jcraft.jsch.Packet r6 = new com.jcraft.jsch.Packet(r2);
        r6.DW();     // Catch: java.lang.Exception -> L22
        r2.j6((byte) 80);     // Catch: java.lang.Exception -> L22
        r2.Hw(com.jcraft.jsch.Util.FH("cancel-tcpip-forward"));     // Catch: java.lang.Exception -> L22
        r2.j6((byte) 0);     // Catch: java.lang.Exception -> L22
        r2.Hw(com.jcraft.jsch.Util.FH(r4));     // Catch: java.lang.Exception -> L22
        r2.FH(r5);     // Catch: java.lang.Exception -> L22
        r3.DW(r6);     // Catch: java.lang.Exception -> L22
        return;
    L26:
        return;
    L19:
        th = move-exception;
        throw th;
    }

    static void j6(com.jcraft.jsch.Session r2, java.lang.String r3, int r4, int r5, java.lang.String r6, int r7, com.jcraft.jsch.SocketFactory r8) {
        java.lang.String r9 = DW(r3);
        java.util.Vector r0 = lg;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (DW(r2, r9, r4) != null) goto L10;
        com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost r1 = new com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost();     // Catch: java.lang.Throwable -> L11
        r1.j6 = r2;     // Catch: java.lang.Throwable -> L11
        r1.DW = r4;     // Catch: java.lang.Throwable -> L11
        r1.FH = r5;     // Catch: java.lang.Throwable -> L11
        r1.v5 = r6;     // Catch: java.lang.Throwable -> L11
        r1.Zo = r7;     // Catch: java.lang.Throwable -> L11
        r1.Hw = r9;     // Catch: java.lang.Throwable -> L11
        r1.VH = r8;     // Catch: java.lang.Throwable -> L11
        lg.addElement(r1);     // Catch: java.lang.Throwable -> L11
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return;
    L10:
        throw new com.jcraft.jsch.JSchException("PortForwardingR: remote port " + r4 + " is already registered.");     // Catch: java.lang.Throwable -> L11
    }

    @Override
    void j6(com.jcraft.jsch.Buffer r6) {
        VH(r6.FH());
        DW(r6.EQ());
        gn(r6.FH());
        byte[] r0 = r6.tp();
        int r1 = r6.FH();
        r6.tp();
        r6.FH();
        com.jcraft.jsch.Session r2 = EQ();     // Catch: com.jcraft.jsch.JSchException -> L5
    L6:
        this.yS = DW(r2, com.jcraft.jsch.Util.j6(r0), r1);
        if (this.yS != null) goto L10;
        this.yS = DW(r2, null, r1);
    L10:
        if (this.yS == null) goto L12;
        return;
    L12:
        if (com.jcraft.jsch.JSch.v5().isEnabled(3) == false) goto L18;
        com.jcraft.jsch.JSch.v5().j6(3, "ChannelForwardedTCPIP: " + com.jcraft.jsch.Util.j6(r0) + ":" + r1 + " is not registered.");
        return;
    L18:
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override
    public void run() {
    L38:
        DW(1);
        this.Ws = true;
        DW();
        return;
    L4:
        if ((this.yS instanceof com.jcraft.jsch.ChannelForwardedTCPIP.ConfigDaemon) == false) goto L6;
        com.jcraft.jsch.ChannelForwardedTCPIP.ConfigDaemon r1 = (com.jcraft.jsch.ChannelForwardedTCPIP.ConfigDaemon) this.yS;     // Catch: java.lang.Exception -> L38
        this.er = (com.jcraft.jsch.ForwardedTCPIPDaemon) java.lang.Class.forName(r1.v5).newInstance();     // Catch: java.lang.Exception -> L38
        java.io.PipedOutputStream r2 = new java.io.PipedOutputStream();     // Catch: java.lang.Exception -> L38
        this.EQ.j6(new com.jcraft.jsch.Channel.PassiveInputStream(this, r2, 32768), false);     // Catch: java.lang.Exception -> L38
        this.er.j6(this, gn(), r2);     // Catch: java.lang.Exception -> L38
        this.er.j6(r1.Zo);     // Catch: java.lang.Exception -> L38
        new java.lang.Thread(this.er).start();     // Catch: java.lang.Exception -> L38
    L11:
        Ws();     // Catch: java.lang.Exception -> L38
        this.we = java.lang.Thread.currentThread();
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(this.tp);
        com.jcraft.jsch.Packet r3 = new com.jcraft.jsch.Packet(r0);
        com.jcraft.jsch.Session r4 = EQ();     // Catch: java.lang.Exception -> L40
    L15:
        if (this.we == null) goto L36;
        if (this.EQ == null) goto L36;
        if (this.EQ.j6 == null) goto L36;
        int r5 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);     // Catch: java.lang.Exception -> L40
        if (r5 <= 0) goto L23;
        r3.DW();     // Catch: java.lang.Exception -> L40
        r0.j6((byte) 94);     // Catch: java.lang.Exception -> L40
        r0.FH(this.Hw);     // Catch: java.lang.Exception -> L40
        r0.FH(r5);     // Catch: java.lang.Exception -> L40
        r0.v5(r5);     // Catch: java.lang.Exception -> L40
        monitor-enter(this);     // Catch: java.lang.Exception -> L40
    L33:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L40
    L27:
        if (this.Ws == true) goto L28;
        r4.j6(r3, this, r5);     // Catch: java.lang.Throwable -> L33
        monitor-exit(this);     // Catch: java.lang.Throwable -> L33
        goto L15
    L28:
        monitor-exit(this);     // Catch: java.lang.Throwable -> L33
        goto L36
    L23:
        FH();     // Catch: java.lang.Exception -> L40
    L36:
        DW();
        return;
    L6:
        com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost r6 = (com.jcraft.jsch.ChannelForwardedTCPIP.ConfigLHost) this.yS;     // Catch: java.lang.Exception -> L38
        if (r6.VH != null) goto L9;
        java.net.Socket r7 = com.jcraft.jsch.Util.j6(r6.v5, r6.Zo, 10000);     // Catch: java.lang.Exception -> L38
    L10:
        this.rN = r7;     // Catch: java.lang.Exception -> L38
        this.rN.setTcpNoDelay(true);     // Catch: java.lang.Exception -> L38
        this.EQ.j6(this.rN.getInputStream());     // Catch: java.lang.Exception -> L38
        this.EQ.DW(this.rN.getOutputStream());     // Catch: java.lang.Exception -> L38
        goto L11
    L9:
        r7 = r6.VH.j6(r6.v5, r6.Zo);     // Catch: java.lang.Exception -> L38
        goto L10
    }
}
