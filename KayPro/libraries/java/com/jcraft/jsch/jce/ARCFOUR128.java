package com.jcraft.jsch.jce;

public class ARCFOUR128 implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public ARCFOUR128() {
    }

    @Override
    public boolean DW() {
        return false;
    }

    @Override
    public int FH() {
        return 8;
    }

    @Override
    public int j6() {
        return 16;
    }

    @Override
    public void j6(int r10, byte[] r11, byte[] r12) {
        int r1 = 0;
        byte[] r13 = null;
        javax.crypto.spec.SecretKeySpec r14 = null;
        javax.crypto.Cipher r0 = null;
        int r15 = 0;
        byte[] r16 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = 0;
                    if (r11.length <= 16) { $pc0 = 26; continue $sw0; }
                    r13 = new byte[16];
                    java.lang.System.arraycopy(r11, 0, r13, 0, r13.length);
                    r11 = r13;
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    try {
                        this.j6 = javax.crypto.Cipher.getInstance("RC4");
                        r14 = new javax.crypto.spec.SecretKeySpec(r11, "RC4");
                        monitor-enter(javax.crypto.Cipher.class);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 22; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r0 = this.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (r10 != 0) { $pc0 = 10; continue $sw0; }
                    r15 = 1;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        r0.init(r15, r14);
                        monitor-exit(javax.crypto.Cipher.class);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    try {
                        r16 = new byte[1];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 22; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    if (r1 >= 1536) { $pc0 = 16; continue $sw0; }
                    try {
                        this.j6.update(r16, 0, 1, r16, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 22; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = r1 + 1;
                    { $pc0 = 15; continue $sw0; }
                }
                case 16: {
                    return;
                }
                case 10: {
                    r15 = 2;
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 22; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 22: {
                    e = $ex0;
                    this.j6 = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(byte[] r7, int r8, int r9, byte[] r10, int r11) {
        this.j6.update(r7, r8, r9, r10, r11);
    }
}
