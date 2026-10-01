package com.jcraft.jsch.jce;

public class PBKDF implements com.jcraft.jsch.PBKDF {
    public PBKDF() {
    }

    @Override
    public byte[] j6(byte[] r4, byte[] r5, int r6, int r7) {
        char[] r0 = null;
        int r1 = 0;
        javax.crypto.spec.PBEKeySpec r8 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new char[r4.length];
                    r1 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1 >= r4.length) { $pc0 = 10; continue $sw0; }
                    r0[r1] = (char) (r4[r1] & 255);
                    r1 = r1 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 10: {
                    try {
                        r8 = new javax.crypto.spec.PBEKeySpec(r0, r5, r6, r7 * 8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return javax.crypto.SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(r8).getEncoded();
                }
                case 7: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
