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
        java.util.Hashtable r0 = gW;
        monitor-enter(r0);
        byte[] r1 = (byte[]) gW.get(r8);     // Catch: java.lang.Throwable -> L21
        if (r1 != null) goto L19;
        com.jcraft.jsch.Random r2 = com.jcraft.jsch.Session.j6;     // Catch: java.lang.Throwable -> L21
        byte[] r3 = new byte[16];     // Catch: java.lang.Throwable -> L21
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L21
        int r4 = 0;
        r2.j6(r3, 0, 16);     // Catch: java.lang.Throwable -> L16
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L16
        yS.put(r8, r3);     // Catch: java.lang.Throwable -> L21
        r1 = new byte[32];     // Catch: java.lang.Throwable -> L21
    L12:
        if (r4 >= 16) goto L13;
        int r5 = r4 * 2;     // Catch: java.lang.Throwable -> L21
        r1[r5] = BT[(r3[r4] >>> 4) & 15];     // Catch: java.lang.Throwable -> L21
        r1[r5 + 1] = BT[r3[r4] & 15];     // Catch: java.lang.Throwable -> L21
        r4 = r4 + 1;
        goto L12
    L13:
        gW.put(r8, r1);     // Catch: java.lang.Throwable -> L21
        goto L19
    L16:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L21
    L19:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L21
        return r1;
    L21:
        th = move-exception;
        throw th;
    }

    private byte[] FH(byte[] r3, int r4, int r5) {
        byte[] r0 = this.ei;
        byte[] r1 = new byte[r0.length + r5];
        java.lang.System.arraycopy(r3, r4, r1, r0.length, r5);
        byte[] r6 = this.ei;
        if (r6.length <= 0) goto L5;
        java.lang.System.arraycopy(r6, 0, r1, 0, r6.length);
    L5:
        this.ei = r1;
        return this.ei;
    }

    static void Hw(com.jcraft.jsch.Session r2) {
        java.util.Hashtable r0 = gW;
        monitor-enter(r0);
        gW.remove(r2);     // Catch: java.lang.Throwable -> L7
        yS.remove(r2);     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private static boolean j6(byte[] r4, byte[] r5) {
        if (r4.length == r5.length) goto L5;
        return false;
    L5:
        int r0 = 0;
    L7:
        if (r0 >= r4.length) goto L8;
        if (r4[r0] != r5[r0]) goto L12;
        r0 = r0 + 1;
        goto L7
    L12:
        return false;
    L8:
        return true;
    }

    @Override
    void j6(byte[] r7, int r8, int r9) {
        if (this.vy == true) goto L38;
        this.EQ.DW(r7, r8, r9);
        return;
    L38:
        com.jcraft.jsch.Session r0 = EQ();     // Catch: com.jcraft.jsch.JSchException -> L31
        byte[] r10 = FH(r7, r8, r9);
        int r11 = r10.length;
        if (r11 >= 9) goto L8;
        return;
    L8:
        int r1 = ((r10[6] & 255) * 256) + (r10[7] & 255);
        int r2 = ((r10[8] & 255) * 256) + (r10[9] & 255);
        if ((r10[0] & 255) != 66) goto L11;
    L13:
        int r4 = (-r1) & 3;
        if (r11 >= (((r1 + 12) + r4) + r2)) goto L16;
        return;
    L16:
        byte[] r3 = new byte[r2];
        int r5 = (12 + r1) + r4;
        java.lang.System.arraycopy(r10, r5, r3, 0, r2);
        java.util.Hashtable r6 = yS;
        monitor-enter(r6);
        byte[] r12 = (byte[]) yS.get(r0);     // Catch: java.lang.Throwable -> L28
        monitor-exit(r6);     // Catch: java.lang.Throwable -> L28
        if (j6(r3, r12) == false) goto L25;
        byte[] r13 = er;
        if (r13 == null) goto L26;
        java.lang.System.arraycopy(r13, 0, r10, r5, r2);
    L26:
        this.vy = false;
        this.EQ.DW(r10, 0, r11);
        this.ei = null;
        return;
    L25:
        this.we = null;
        FH();
        this.EQ.j6();
        DW();
    L28:
        th = move-exception;
        throw th;
    L11:
        if ((r10[0] & 255) != 108) goto L13;
        int r14 = (r1 >>> 8) & 255;
        r1 = ((r1 << 8) & 65280) | r14;
        int r15 = (r2 >>> 8) & 255;
        r2 = ((r2 << 8) & 65280) | r15;
    L31:
        e = move-exception;
        throw new java.io.IOException(e.toString());
    }

    @Override
    public void run() {
        this.P8 = com.jcraft.jsch.Util.j6(lg, rN, 10000);     // Catch: java.lang.Exception -> L22
        this.P8.setTcpNoDelay(true);     // Catch: java.lang.Exception -> L22
        this.EQ = new com.jcraft.jsch.IO();     // Catch: java.lang.Exception -> L22
        this.EQ.j6(this.P8.getInputStream());     // Catch: java.lang.Exception -> L22
        this.EQ.DW(this.P8.getOutputStream());     // Catch: java.lang.Exception -> L22
        Ws();     // Catch: java.lang.Exception -> L22
        this.we = java.lang.Thread.currentThread();
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(this.tp);
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
    L27:
        if (this.we == null) goto L20;
        if (this.EQ == null) goto L20;
        if (this.EQ.j6 == null) goto L20;
        int r2 = this.EQ.j6.read(r0.DW, 14, (r0.DW.length - 14) - 84);     // Catch: java.lang.Exception -> L24
        if (r2 <= 0) goto L14;
        if (this.Ws == true) goto L20;
        r1.DW();     // Catch: java.lang.Exception -> L24
        r0.j6((byte) 94);     // Catch: java.lang.Exception -> L24
        r0.FH(this.Hw);     // Catch: java.lang.Exception -> L24
        r0.FH(r2);     // Catch: java.lang.Exception -> L24
        r0.v5(r2);     // Catch: java.lang.Exception -> L24
        EQ().j6(r1, this, r2);     // Catch: java.lang.Exception -> L24
        goto L27
    L14:
        FH();     // Catch: java.lang.Exception -> L24
    L20:
        DW();
        return;
    L22:
        DW(1);
        this.Ws = true;
        DW();
    }
}
