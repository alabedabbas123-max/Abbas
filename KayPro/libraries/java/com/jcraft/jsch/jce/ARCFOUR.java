package com.jcraft.jsch.jce;

public class ARCFOUR implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public ARCFOUR() {
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
    public void j6(int r3, byte[] r4, byte[] r5) {
        synchronized (javax.crypto.Cipher.class) {
            byte[] r6 = null;
            javax.crypto.spec.SecretKeySpec r7 = null;
            javax.crypto.Cipher r0 = null;
            int r8 = 0;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r4.length <= 16) { $pc0 = 20; continue $sw0; }
                        r6 = new byte[16];
                        java.lang.System.arraycopy(r4, 0, r6, 0, r6.length);
                        r4 = r6;
                        $pc0 = 20; continue $sw0;
                    }
                    case 20: {
                        try {
                            this.j6 = javax.crypto.Cipher.getInstance("RC4");
                            r7 = new javax.crypto.spec.SecretKeySpec(r4, "RC4");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Exception) { $pc0 = 17; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            r0 = this.j6;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        if (r3 != 0) { $pc0 = 10; continue $sw0; }
                        r8 = 1;
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        try {
                            r0.init(r8, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        return;
                    }
                    case 10: {
                        r8 = 2;
                        return;
                    }
                    case 14: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Exception) { $pc0 = 17; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 17: {
                        e = $ex0;
                        this.j6 = null;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    @Override
    public void j6(byte[] r7, int r8, int r9, byte[] r10, int r11) {
        this.j6.update(r7, r8, r9, r10, r11);
    }
}
