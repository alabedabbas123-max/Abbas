package com.jcraft.jsch;

public class ProxySOCKS4 implements com.jcraft.jsch.Proxy {
    private int DW;
    private java.io.InputStream FH;
    private java.io.OutputStream Hw;
    private java.lang.String Zo;
    private java.lang.String j6;
    private java.net.Socket v5;

    @Override
    public java.io.InputStream DW() {
        return this.FH;
    }

    @Override
    public void close() {
        if (this.FH == null) goto L6;
        this.FH.close();     // Catch: java.lang.Exception -> L13
    L6:
        if (this.Hw == null) goto L9;
        this.Hw.close();     // Catch: java.lang.Exception -> L13
    L9:
        if (this.v5 == null) goto L11;
        this.v5.close();     // Catch: java.lang.Exception -> L13
    L11:
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
    }

    @Override
    public java.net.Socket getSocket() {
        return this.v5;
    }

    @Override
    public java.io.OutputStream j6() {
        return this.Hw;
    }

    @Override
    public void j6(com.jcraft.jsch.SocketFactory r7, java.lang.String r8, int r9, int r10) {
        if (r7 != null) goto L5;
        this.v5 = com.jcraft.jsch.Util.j6(this.j6, this.DW, r10);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        this.FH = this.v5.getInputStream();     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        this.Hw = this.v5.getOutputStream();     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L6:
        if (r10 <= 0) goto L8;
        this.v5.setSoTimeout(r10);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L8:
        this.v5.setTcpNoDelay(true);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        byte[] r11 = new byte[1024];     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        int r1 = 4;
        r11[0] = 4;     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        r11[1] = 1;     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        r11[2] = (byte) (r9 >>> 8);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        r11[3] = (byte) (r9 & 255);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        byte[] r12 = java.net.InetAddress.getByName(r8).getAddress();     // Catch: java.net.UnknownHostException -> L37 java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        int r13 = 0;
    L11:
        if (r13 >= r12.length) goto L13;
        int r3 = r1 + 1;
        r11[r1] = r12[r13];     // Catch: java.net.UnknownHostException -> L37 java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        r13 = r13 + 1;
        r1 = r3;
        goto L11
    L13:
        if (this.Zo == null) goto L15;
        java.lang.System.arraycopy(com.jcraft.jsch.Util.FH(this.Zo), 0, r11, r1, this.Zo.length());     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        r1 = r1 + this.Zo.length();     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L15:
        r11[r1] = 0;     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        this.Hw.write(r11, 0, r1 + 1);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        int r14 = 0;
    L17:
        if (r14 >= 8) goto L19;
        int r15 = this.FH.read(r11, r14, 8 - r14);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        if (r15 <= 0) goto L33;
        r14 = r14 + r15;     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        goto L17
    L33:
        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: stream is closed");     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L19:
        if (r11[0] != 0) goto L28;
        if (r11[1] != 90) goto L52;
        return;
    L52:
        this.v5.close();     // Catch: java.lang.Exception -> L50
    L26:
        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: server returns CD " + r11[1]);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L28:
        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: server returns VN " + r11[0]);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L37:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: " + e.toString(), e);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L5:
        this.v5 = r7.j6(this.j6, this.DW);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        this.FH = r7.j6(this.v5);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
        this.Hw = r7.DW(this.v5);     // Catch: java.lang.Exception -> L40 java.lang.RuntimeException -> L46
    L46:
        e = move-exception;
        throw e;
    L40:
        e = move-exception;
        if (this.v5 == null) goto L45;
        this.v5.close();     // Catch: java.lang.Exception -> L51
    L45:
        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: " + e.toString());
    }
}
