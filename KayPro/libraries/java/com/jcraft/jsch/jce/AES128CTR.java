package com.jcraft.jsch.jce;

public class AES128CTR implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public AES128CTR() {
    }

    @Override
    public boolean DW() {
        return false;
    }

    @Override
    public int FH() {
        return 16;
    }

    @Override
    public int j6() {
        return 16;
    }

    @Override
    public void j6(int r6, byte[] r7, byte[] r8) {
        byte[] r1 = null;
        byte[] r2 = null;
        javax.crypto.spec.SecretKeySpec r3 = null;
        javax.crypto.Cipher r0 = null;
        int r9 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r8.length <= 16) { $pc0 = 6; continue $sw0; }
                    r1 = new byte[16];
                    java.lang.System.arraycopy(r8, 0, r1, 0, r1.length);
                    r8 = r1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r7.length <= 16) { $pc0 = 23; continue $sw0; }
                    r2 = new byte[16];
                    java.lang.System.arraycopy(r7, 0, r2, 0, r2.length);
                    r7 = r2;
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    try {
                        r3 = new javax.crypto.spec.SecretKeySpec(r7, "AES");
                        this.j6 = javax.crypto.Cipher.getInstance("AES/CTR/NoPadding");
                        monitor-enter(javax.crypto.Cipher.class);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 20; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r0 = this.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    if (r6 != 0) { $pc0 = 13; continue $sw0; }
                    r9 = 1;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    try {
                        r0.init(r9, r3, new javax.crypto.spec.IvParameterSpec(r8));
                        monitor-exit(javax.crypto.Cipher.class);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return;
                }
                case 13: {
                    r9 = 2;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    th = $ex0;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 20; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 20: {
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
