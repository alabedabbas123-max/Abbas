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
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r5) { $pc0 = 4; continue $sw0; }
                    r1 = r3.read(r4, r0, r5 - r0);
                    if (r1 <= 0) { $pc0 = 9; continue $sw0; }
                    r0 = r0 + r1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 9: {
                    throw new com.jcraft.jsch.JSchException("ProxySOCKS5: stream is closed");
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.io.InputStream DW() {
        return this.FH;
    }

    @Override
    public void close() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.FH == null) { $pc1 = 6; continue $sw1; }
                    try {
                        this.FH.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (this.Hw == null) { $pc1 = 9; continue $sw1; }
                    try {
                        this.Hw.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (this.v5 == null) { $pc1 = 11; continue $sw1; }
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    this.FH = null;
                    this.Hw = null;
                    this.v5 = null;
                    $pc1 = 13; continue $sw1;
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
    public void j6(com.jcraft.jsch.SocketFactory r9, java.lang.String r10, int r11, int r12) {
        byte[] r13 = null;
        int r4 = 0;
        boolean r5 = false;
        byte[] r14 = null;
        int r6 = 0;
        int r0 = 0;
        int r15 = 0;
        int r16 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r9 != null) { $pc2 = 4; continue $sw2; }
                    try {
                        this.v5 = com.jcraft.jsch.Util.j6(this.j6, this.DW, r12);
                        this.FH = this.v5.getInputStream();
                        this.Hw = this.v5.getOutputStream();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r12 <= 0) { $pc2 = 7; continue $sw2; }
                    try {
                        this.v5.setSoTimeout(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    try {
                        this.v5.setTcpNoDelay(true);
                        r13 = new byte[1024];
                        r13[0] = 5;
                        r13[1] = 2;
                        r13[2] = 0;
                        r13[3] = 2;
                        this.Hw.write(r13, 0, 4);
                        j6(this.FH, r13, 2);
                        r4 = r13[1] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == 0) { $pc2 = 20; continue $sw2; }
                    if (r4 == 2) { $pc2 = 12; continue $sw2; }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r5 = false;
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (r5 == false) { $pc2 = 54; continue $sw2; }
                    try {
                        r13[0] = 5;
                        r13[1] = 1;
                        r13[2] = 0;
                        r14 = com.jcraft.jsch.Util.FH(r10);
                        r6 = r14.length;
                        r13[3] = 3;
                        r13[4] = (byte) r6;
                        java.lang.System.arraycopy(r14, 0, r13, 5, r6);
                        r0 = 5 + r6;
                        r15 = r0 + 1;
                        r13[r0] = (byte) (r11 >>> 8);
                        r13[r15] = (byte) (r11 & 255);
                        this.Hw.write(r13, 0, r15 + 1);
                        j6(this.FH, r13, 4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13[1] != 0) { $pc2 = 50; continue $sw2; }
                    try {
                        r16 = r13[3] & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r16 == 1) { $pc2 = 31; continue $sw2; }
                    if (r16 == 3) { $pc2 = 30; continue $sw2; }
                    if (r16 != 4) { $pc2 = 57; continue $sw2; }
                    try {
                        j6(this.FH, r13, 18);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 57: {
                    return;
                }
                case 30: {
                    try {
                        j6(this.FH, r13, 1);
                        j6(this.FH, r13, (r13[0] & 255) + 2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 31: {
                    try {
                        j6(this.FH, r13, 6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 50: {
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 47; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 35; continue $sw2;
                }
                case 35: {
                    try {
                        throw new com.jcraft.jsch.JSchException("ProxySOCKS5: server returns " + r13[1]);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 54: {
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 48; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 38; continue $sw2;
                }
                case 38: {
                    try {
                        throw new com.jcraft.jsch.JSchException("fail in SOCKS5 proxy");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 12: {
                    if (this.Zo == null) { $pc2 = 19; continue $sw2; }
                    if (this.VH == null) { $pc2 = 19; continue $sw2; }
                    try {
                        r13[0] = 1;
                        r13[1] = (byte) this.Zo.length();
                        java.lang.System.arraycopy(com.jcraft.jsch.Util.FH(this.Zo), 0, r13, 2, this.Zo.length());
                        r7 = this.Zo.length() + 2;
                        r8 = r7 + 1;
                        r13[r7] = (byte) this.VH.length();
                        java.lang.System.arraycopy(com.jcraft.jsch.Util.FH(this.VH), 0, r13, r8, this.VH.length());
                        this.Hw.write(r13, 0, r8 + this.VH.length());
                        j6(this.FH, r13, 2);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13[1] != 0) { $pc2 = 19; continue $sw2; }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r5 = true;
                    { $pc2 = 21; continue $sw2; }
                }
                case 4: {
                    try {
                        this.v5 = r9.j6(this.j6, this.DW);
                        this.FH = r9.j6(this.v5);
                        this.Hw = r9.DW(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 39; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 45; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 45; continue $sw2;
                }
                case 45: {
                    e = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 39: {
                    e = $ex2;
                    if (this.v5 == null) { $pc2 = 44; continue $sw2; }
                    try {
                        this.v5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 49; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 44; continue $sw2;
                }
                case 44: {
                    throw new com.jcraft.jsch.JSchException("ProxySOCKS5: " + e.toString(), e);
                }
                case 47: {
                    $pc2 = 48; continue $sw2;
                }
                case 48: {
                    $pc2 = 49; continue $sw2;
                }
                case 49: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
