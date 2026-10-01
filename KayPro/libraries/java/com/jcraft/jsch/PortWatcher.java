package com.jcraft.jsch;

class PortWatcher implements java.lang.Runnable {
    private static java.net.InetAddress DW;
    private static java.util.Vector j6;
    com.jcraft.jsch.Session FH;
    int Hw;
    java.net.InetAddress VH;
    java.lang.String Zo;
    java.lang.Runnable gn;
    int tp;
    java.net.ServerSocket u7;
    int v5;

    static {
        j6 = new java.util.Vector();
        DW = null;
        DW = java.net.InetAddress.getByName("0.0.0.0");     // Catch: java.net.UnknownHostException -> L5
        return;
    }

    PortWatcher(com.jcraft.jsch.Session r2, java.lang.String r3, int r4, java.lang.String r5, int r6, com.jcraft.jsch.ServerSocketFactory r7) {
        this.tp = 0;
        this.FH = r2;
        this.Hw = r4;
        this.Zo = r5;
        this.v5 = r6;
        this.VH = java.net.InetAddress.getByName(r3);     // Catch: java.lang.Exception -> L13
        if (r7 != null) goto L6;
        java.net.ServerSocket r8 = new java.net.ServerSocket(r4, 0, this.VH);     // Catch: java.lang.Exception -> L13
    L7:
        this.u7 = r8;     // Catch: java.lang.Exception -> L13
        if (r4 != 0) goto L18;
        int r9 = this.u7.getLocalPort();
        if (r9 == (-1)) goto L19;
        this.Hw = r9;
        return;
    L19:
        return;
    L18:
        return;
    L6:
        r8 = r7.j6(r4, 0, this.VH);     // Catch: java.lang.Exception -> L13
    L13:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException("PortForwardingL: local port " + r3 + ":" + r4 + " cannot be bound.", e);
    }

    static com.jcraft.jsch.PortWatcher j6(com.jcraft.jsch.Session r5, java.lang.String r6, int r7) {
        java.net.InetAddress r8 = java.net.InetAddress.getByName(r6);     // Catch: java.net.UnknownHostException -> L27
        java.util.Vector r0 = j6;
        monitor-enter(r0);
        int r1 = 0;
    L33:
    L24:
        th = move-exception;
        throw th;
    L7:
        if (r1 >= j6.size()) goto L8;
        com.jcraft.jsch.PortWatcher r2 = (com.jcraft.jsch.PortWatcher) j6.elementAt(r1);     // Catch: java.lang.Throwable -> L24
        if (r2.FH != r5) goto L23;
        if (r2.Hw != r7) goto L23;
        if (DW == null) goto L20;
        if (r2.VH.equals(DW) == false) goto L20;
    L21:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L24
        return r2;
    L20:
        if (r2.VH.equals(r8) == true) goto L21;
    L23:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L24
        goto L33
    L8:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L24
        return null;
    L27:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException("PortForwardingL: invalid address " + r6 + " specified.", e);
    }

    static com.jcraft.jsch.PortWatcher j6(com.jcraft.jsch.Session r7, java.lang.String r8, int r9, java.lang.String r10, int r11, com.jcraft.jsch.ServerSocketFactory r12) {
        java.lang.String r2 = j6(r8);
        if (j6(r7, r2, r9) != null) goto L7;
        com.jcraft.jsch.PortWatcher r13 = new com.jcraft.jsch.PortWatcher(r7, r2, r9, r10, r11, r12);
        j6.addElement(r13);
        return r13;
    L7:
        throw new com.jcraft.jsch.JSchException("PortForwardingL: local port " + r2 + ":" + r9 + " is already registered.");
    }

    private static java.lang.String j6(java.lang.String r1) {
        if (r1 != null) goto L4;
        return r1;
    L4:
        if (r1.length() != 0) goto L6;
    L11:
        return "0.0.0.0";
    L6:
        if (r1.equals("*") == true) goto L11;
        if (r1.equals("localhost") == false) goto L14;
        return "127.0.0.1";
    L14:
        return r1;
    }

    static void j6(com.jcraft.jsch.Session r7) {
        java.util.Vector r0 = j6;
        monitor-enter(r0);
        com.jcraft.jsch.PortWatcher[] r1 = new com.jcraft.jsch.PortWatcher[j6.size()];     // Catch: java.lang.Throwable -> L15
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r3 >= j6.size()) goto L7;
        com.jcraft.jsch.PortWatcher r5 = (com.jcraft.jsch.PortWatcher) j6.elementAt(r3);     // Catch: java.lang.Throwable -> L15
        if (r5.FH != r7) goto L14;
        r5.j6();     // Catch: java.lang.Throwable -> L15
        r1[r4] = r5;     // Catch: java.lang.Throwable -> L15
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L15
    L14:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L15
    L7:
        if (r2 >= r4) goto L8;
        com.jcraft.jsch.PortWatcher r8 = r1[r2];     // Catch: java.lang.Throwable -> L15
        j6.removeElement(r8);     // Catch: java.lang.Throwable -> L15
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L15
        goto L7
    L8:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L15
        return;
    L15:
        th = move-exception;
        throw th;
    }

    void j6() {
        this.gn = null;
        if (this.u7 == null) goto L6;
        this.u7.close();     // Catch: java.lang.Exception -> L8
    L6:
        this.u7 = null;     // Catch: java.lang.Exception -> L8
        return;
    }

    void j6(int r1) {
        this.tp = r1;
    }

    @Override
    public void run() {
        this.gn = this;
    L11:
        if (this.gn == null) goto L8;
        java.net.Socket r0 = this.u7.accept();     // Catch: java.lang.Exception -> L10
        r0.setTcpNoDelay(true);     // Catch: java.lang.Exception -> L10
        java.io.InputStream r1 = r0.getInputStream();     // Catch: java.lang.Exception -> L10
        java.io.OutputStream r2 = r0.getOutputStream();     // Catch: java.lang.Exception -> L10
        com.jcraft.jsch.ChannelDirectTCPIP r3 = new com.jcraft.jsch.ChannelDirectTCPIP();     // Catch: java.lang.Exception -> L10
        r3.we();     // Catch: java.lang.Exception -> L10
        r3.j6(r1);     // Catch: java.lang.Exception -> L10
        r3.j6(r2);     // Catch: java.lang.Exception -> L10
        this.FH.j6(r3);     // Catch: java.lang.Exception -> L10
        r3.DW(this.Zo);     // Catch: java.lang.Exception -> L10
        r3.tp(this.v5);     // Catch: java.lang.Exception -> L10
        r3.FH(r0.getInetAddress().getHostAddress());     // Catch: java.lang.Exception -> L10
        r3.u7(r0.getPort());     // Catch: java.lang.Exception -> L10
        r3.j6(this.tp);     // Catch: java.lang.Exception -> L10
        int r4 = r3.aM;     // Catch: java.lang.Exception -> L10
    L8:
        j6();
    }
}
