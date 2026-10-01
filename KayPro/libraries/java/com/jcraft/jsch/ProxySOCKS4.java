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
                    return;
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
        byte[] r11 = null;
        int r1 = 0;
        byte[] r12 = null;
        int r13 = 0;
        int r3 = 0;
        int r14 = 0;
        int r15 = 0;
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
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
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
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    try {
                        this.v5.setTcpNoDelay(true);
                        r11 = new byte[1024];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = 4;
                    try {
                        r11[0] = 4;
                        r11[1] = 1;
                        r11[2] = (byte) (r9 >>> 8);
                        r11[3] = (byte) (r9 & 255);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r12 = java.net.InetAddress.getByName(r8).getAddress();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.net.UnknownHostException) { $pc1 = 37; continue $sw1; }
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r13 = 0;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r13 >= r12.length) { $pc1 = 13; continue $sw1; }
                    r3 = r1 + 1;
                    try {
                        r11[r1] = r12[r13];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.net.UnknownHostException) { $pc1 = 37; continue $sw1; }
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r13 = r13 + 1;
                    r1 = r3;
                    { $pc1 = 11; continue $sw1; }
                }
                case 13: {
                    if (this.Zo == null) { $pc1 = 15; continue $sw1; }
                    try {
                        java.lang.System.arraycopy(com.jcraft.jsch.Util.FH(this.Zo), 0, r11, r1, this.Zo.length());
                        r1 = r1 + this.Zo.length();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    try {
                        r11[r1] = 0;
                        this.Hw.write(r11, 0, r1 + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r14 = 0;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    if (r14 >= 8) { $pc1 = 19; continue $sw1; }
                    try {
                        r15 = this.FH.read(r11, r14, 8 - r14);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r15 <= 0) { $pc1 = 33; continue $sw1; }
                    try {
                        r14 = r14 + r15;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 17; continue $sw1; }
                }
                case 33: {
                    try {
                        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: stream is closed");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 19: {
                    if (r11[0] != 0) { $pc1 = 28; continue $sw1; }
                    if (r11[1] != 90) { $pc1 = 52; continue $sw1; }
                    return;
                }
                case 52: {
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 50; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    try {
                        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: server returns CD " + r11[1]);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 28: {
                    try {
                        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: server returns VN " + r11[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 37: {
                    e = $ex1;
                    try {
                        throw new com.jcraft.jsch.JSchException("ProxySOCKS4: " + e.toString(), e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 5: {
                    try {
                        this.v5 = r7.j6(this.j6, this.DW);
                        this.FH = r7.j6(this.v5);
                        this.Hw = r7.DW(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 40; continue $sw1; }
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 46; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 45; continue $sw1;
                }
                case 46: {
                    e = $ex1;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 40: {
                    e = $ex1;
                    if (this.v5 == null) { $pc1 = 45; continue $sw1; }
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 51; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 45; continue $sw1;
                }
                case 45: {
                    throw new com.jcraft.jsch.JSchException("ProxySOCKS4: " + e.toString());
                }
                case 50: {
                    return;
                }
                case 51: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
