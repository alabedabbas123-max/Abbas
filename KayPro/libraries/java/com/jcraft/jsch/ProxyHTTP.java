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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH == null) { $pc0 = 6; continue $sw0; }
                    try {
                        this.FH.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (this.Hw == null) { $pc0 = 9; continue $sw0; }
                    try {
                        this.Hw.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (this.v5 == null) { $pc0 = 11; continue $sw0; }
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    this.FH = null;
                    this.Hw = null;
                    this.v5 = null;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.StringBuffer r11 = null;
        int r12 = 0;
        java.lang.String r13 = null;
        java.lang.String r2 = null;
        int r3 = 0;
        int r5 = 0;
        int r4 = 0;
        int r14 = 0;
        byte[] r15 = null;
        byte[] r16 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r7 != null) { $pc1 = 5; continue $sw1; }
                    try {
                        this.v5 = com.jcraft.jsch.Util.j6(this.j6, this.DW, r10);
                        this.FH = this.v5.getInputStream();
                        this.Hw = this.v5.getOutputStream();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r10 <= 0) { $pc1 = 8; continue $sw1; }
                    try {
                        this.v5.setSoTimeout(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    try {
                        this.v5.setTcpNoDelay(true);
                        this.Hw.write(com.jcraft.jsch.Util.FH("CONNECT " + r8 + ":" + r9 + " HTTP/1.0\r\n"));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.Zo != null) { $pc1 = 12; continue $sw1; }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    try {
                        this.Hw.write(com.jcraft.jsch.Util.FH("\r\n"));
                        this.Hw.flush();
                        r11 = new java.lang.StringBuffer();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r12 = 0;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r12 < 0) { $pc1 = 24; continue $sw1; }
                    try {
                        r12 = this.FH.read();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12 != 13) { $pc1 = 20; continue $sw1; }
                    try {
                        r12 = this.FH.read();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12 == 10) { $pc1 = 24; continue $sw1; }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    try {
                        r11.append((char) r12);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    if (r12 < 0) { $pc1 = 47; continue $sw1; }
                    try {
                        r13 = r11.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = "Unknow reason";
                    r3 = -1;
                    try {
                        r12 = r13.indexOf(32);
                        r5 = r12 + 1;
                        r4 = r13.indexOf(32, r5);
                        r3 = java.lang.Integer.parseInt(r13.substring(r5, r4));
                        r2 = r13.substring(r4 + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 58; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    if (r3 != 200) { $pc1 = 45; continue $sw1; }
                    $pc1 = 30; continue $sw1;
                }
                case 30: {
                    r14 = 0;
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    if (r12 < 0) { $pc1 = 39; continue $sw1; }
                    try {
                        r12 = this.FH.read();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12 != 13) { $pc1 = 35; continue $sw1; }
                    try {
                        r12 = this.FH.read();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12 == 10) { $pc1 = 39; continue $sw1; }
                    $pc1 = 35; continue $sw1;
                }
                case 35: {
                    try {
                        r14 = r14 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 39; continue $sw1;
                }
                case 39: {
                    if (r12 < 0) { $pc1 = 43; continue $sw1; }
                    if (r14 != 0) { $pc1 = 30; continue $sw1; }
                    return;
                }
                case 43: {
                    try {
                        throw new java.io.IOException();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 45: {
                    try {
                        throw new java.io.IOException("proxy error: " + r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 47: {
                    try {
                        throw new java.io.IOException();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 12: {
                    if (this.VH == null) { $pc1 = 14; continue $sw1; }
                    try {
                        r15 = com.jcraft.jsch.Util.FH(java.lang.String.valueOf(this.Zo) + ":" + this.VH);
                        r16 = com.jcraft.jsch.Util.FH(r15, 0, r15.length);
                        this.Hw.write(com.jcraft.jsch.Util.FH("Proxy-Authorization: Basic "));
                        this.Hw.write(r16);
                        this.Hw.write(com.jcraft.jsch.Util.FH("\r\n"));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 14; continue $sw1; }
                }
                case 5: {
                    try {
                        this.v5 = r7.j6(this.j6, this.DW);
                        this.FH = r7.j6(this.v5);
                        this.Hw = r7.DW(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 54; continue $sw1;
                }
                case 54: {
                    e = $ex1;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 48: {
                    e = $ex1;
                    if (this.v5 == null) { $pc1 = 53; continue $sw1; }
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 59; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 53; continue $sw1;
                }
                case 53: {
                    throw new com.jcraft.jsch.JSchException("ProxyHTTP: " + e.toString(), e);
                }
                case 58: {
                    $pc1 = 59; continue $sw1;
                }
                case 59: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
