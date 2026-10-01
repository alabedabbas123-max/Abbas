package com.jcraft.jsch;

public class ProxyHTTP implements com.jcraft.jsch.Proxy {
    private int DW;
    private java.io.InputStream FH;
    private java.io.OutputStream Hw;
    private java.lang.String VH;
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
        this.v5 = com.jcraft.jsch.Util.j6(this.j6, this.DW, r10);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.FH = this.v5.getInputStream();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.Hw = this.v5.getOutputStream();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L6:
        if (r10 <= 0) goto L8;
        this.v5.setSoTimeout(r10);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L8:
        this.v5.setTcpNoDelay(true);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.Hw.write(com.jcraft.jsch.Util.FH("CONNECT " + r8 + ":" + r9 + " HTTP/1.0\r\n"));     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        if (this.Zo != null) goto L12;
    L14:
        this.Hw.write(com.jcraft.jsch.Util.FH("\r\n"));     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.Hw.flush();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        java.lang.StringBuffer r11 = new java.lang.StringBuffer();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        int r12 = 0;
    L16:
        if (r12 < 0) goto L24;
        r12 = this.FH.read();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        if (r12 != 13) goto L20;
        r12 = this.FH.read();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        if (r12 == 10) goto L24;
    L20:
        r11.append((char) r12);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L24:
        if (r12 < 0) goto L47;
        java.lang.String r13 = r11.toString();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        java.lang.String r2 = "Unknow reason";
        int r3 = -1;
        r12 = r13.indexOf(32);     // Catch: java.lang.Exception -> L58
        int r5 = r12 + 1;     // Catch: java.lang.Exception -> L58
        int r4 = r13.indexOf(32, r5);     // Catch: java.lang.Exception -> L58
        r3 = java.lang.Integer.parseInt(r13.substring(r5, r4));     // Catch: java.lang.Exception -> L58
        r2 = r13.substring(r4 + 1);     // Catch: java.lang.Exception -> L58
    L29:
        if (r3 != 200) goto L45;
    L30:
        int r14 = 0;
    L31:
        if (r12 < 0) goto L39;
        r12 = this.FH.read();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        if (r12 != 13) goto L35;
        r12 = this.FH.read();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        if (r12 == 10) goto L39;
    L35:
        r14 = r14 + 1;     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L39:
        if (r12 < 0) goto L43;
        if (r14 != 0) goto L30;
        return;
    L43:
        throw new java.io.IOException();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L45:
        throw new java.io.IOException("proxy error: " + r2);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L47:
        throw new java.io.IOException();     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L12:
        if (this.VH == null) goto L14;
        byte[] r15 = com.jcraft.jsch.Util.FH(java.lang.String.valueOf(this.Zo) + ":" + this.VH);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        byte[] r16 = com.jcraft.jsch.Util.FH(r15, 0, r15.length);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.Hw.write(com.jcraft.jsch.Util.FH("Proxy-Authorization: Basic "));     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.Hw.write(r16);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.Hw.write(com.jcraft.jsch.Util.FH("\r\n"));     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        goto L14
    L5:
        this.v5 = r7.j6(this.j6, this.DW);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.FH = r7.j6(this.v5);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
        this.Hw = r7.DW(this.v5);     // Catch: java.lang.Exception -> L48 java.lang.RuntimeException -> L54
    L54:
        e = move-exception;
        throw e;
    L48:
        e = move-exception;
        if (this.v5 == null) goto L53;
        this.v5.close();     // Catch: java.lang.Exception -> L59
    L53:
        throw new com.jcraft.jsch.JSchException("ProxyHTTP: " + e.toString(), e);
    }
}
