package com.jcraft.jsch.jce;

public class TripleDESCTR implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public TripleDESCTR() {
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
        return 24;
    }

    @Override
    public void j6(int r5, byte[] r6, byte[] r7) {
        byte[] r1 = null;
        byte[] r2 = null;
        javax.crypto.SecretKey r8 = null;
        javax.crypto.Cipher r3 = null;
        int r9 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r7.length <= 8) { $pc0 = 6; continue $sw0; }
                    r1 = new byte[8];
                    java.lang.System.arraycopy(r7, 0, r1, 0, r1.length);
                    r7 = r1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r6.length <= 24) { $pc0 = 25; continue $sw0; }
                    r2 = new byte[24];
                    java.lang.System.arraycopy(r6, 0, r2, 0, r2.length);
                    r6 = r2;
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    try {
                        this.j6 = javax.crypto.Cipher.getInstance("DESede/CTR/NoPadding");
                        r8 = javax.crypto.SecretKeyFactory.getInstance("DESede").generateSecret(new javax.crypto.spec.DESedeKeySpec(r6));
                        monitor-enter(javax.crypto.Cipher.class);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 20; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r3 = this.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    if (r5 != 0) { $pc0 = 13; continue $sw0; }
                    r9 = 1;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    try {
                        r3.init(r9, r8, new javax.crypto.spec.IvParameterSpec(r7));
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
