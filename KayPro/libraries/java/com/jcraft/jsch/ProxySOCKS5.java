package com.jcraft.jsch;

public class ProxySOCKS5 implements com.jcraft.jsch.Proxy {
    private int DW;
    private java.io.InputStream FH;
    private java.io.OutputStream Hw;
    private java.lang.String VH;
    private java.lang.String Zo;
    private java.lang.String j6;
    private java.net.Socket v5;

    private void j6(java.io.InputStream r3, byte[] r4, int r5) {
        int r0 = 0;
    L3:
        if (r0 >= r5) goto L4;
        int r1 = r3.read(r4, r0, r5 - r0);
        if (r1 <= 0) goto L9;
        r0 = r0 + r1;
        goto L3
    L9:
        throw new com.jcraft.jsch.JSchException("ProxySOCKS5: stream is closed");
    }

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
    public void j6(com.jcraft.jsch.SocketFactory r9, java.lang.String r10, int r11, int r12) {
        if (r9 != null) goto L4;
        this.v5 = com.jcraft.jsch.Util.j6(this.j6, this.DW, r12);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        this.FH = this.v5.getInputStream();     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        this.Hw = this.v5.getOutputStream();     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
    L5:
        if (r12 <= 0) goto L7;
        this.v5.setSoTimeout(r12);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
    L7:
        this.v5.setTcpNoDelay(true);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        byte[] r13 = new byte[1024];     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[0] = 5;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[1] = 2;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[2] = 0;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[3] = 2;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        this.Hw.write(r13, 0, 4);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        j6(this.FH, r13, 2);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        int r4 = r13[1] & 255;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        if (r4 == 0) goto L20;
        if (r4 == 2) goto L12;
    L19:
        boolean r5 = false;
    L21:
        if (r5 == false) goto L54;
        r13[0] = 5;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[1] = 1;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[2] = 0;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        byte[] r14 = com.jcraft.jsch.Util.FH(r10);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        int r6 = r14.length;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[3] = 3;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[4] = (byte) r6;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        java.lang.System.arraycopy(r14, 0, r13, 5, r6);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        int r0 = 5 + r6;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        int r15 = r0 + 1;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[r0] = (byte) (r11 >>> 8);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[r15] = (byte) (r11 & 255);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        this.Hw.write(r13, 0, r15 + 1);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        j6(this.FH, r13, 4);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        if (r13[1] != 0) goto L50;
        int r16 = r13[3] & 255;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        if (r16 == 1) goto L31;
        if (r16 == 3) goto L30;
        if (r16 != 4) goto L57;
        j6(this.FH, r13, 18);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        return;
    L57:
        return;
    L30:
        j6(this.FH, r13, 1);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        j6(this.FH, r13, (r13[0] & 255) + 2);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        return;
    L31:
        j6(this.FH, r13, 6);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        return;
    L50:
        this.v5.close();     // Catch: java.lang.Exception -> L47
    L35:
        throw new com.jcraft.jsch.JSchException("ProxySOCKS5: server returns " + r13[1]);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
    L54:
        this.v5.close();     // Catch: java.lang.Exception -> L48
    L38:
        throw new com.jcraft.jsch.JSchException("fail in SOCKS5 proxy");     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
    L12:
        if (this.Zo == null) goto L19;
        if (this.VH == null) goto L19;
        r13[0] = 1;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[1] = (byte) this.Zo.length();     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        java.lang.System.arraycopy(com.jcraft.jsch.Util.FH(this.Zo), 0, r13, 2, this.Zo.length());     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        int r7 = this.Zo.length() + 2;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        int r8 = r7 + 1;     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        r13[r7] = (byte) this.VH.length();     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        java.lang.System.arraycopy(com.jcraft.jsch.Util.FH(this.VH), 0, r13, r8, this.VH.length());     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        this.Hw.write(r13, 0, r8 + this.VH.length());     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        j6(this.FH, r13, 2);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        if (r13[1] != 0) goto L19;
    L20:
        r5 = true;
        goto L21
    L4:
        this.v5 = r9.j6(this.j6, this.DW);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        this.FH = r9.j6(this.v5);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
        this.Hw = r9.DW(this.v5);     // Catch: java.lang.Exception -> L39 java.lang.RuntimeException -> L45
    L45:
        e = move-exception;
        throw e;
    L39:
        e = move-exception;
        if (this.v5 == null) goto L44;
        this.v5.close();     // Catch: java.lang.Exception -> L49
    L44:
        throw new com.jcraft.jsch.JSchException("ProxySOCKS5: " + e.toString(), e);
    }
}
