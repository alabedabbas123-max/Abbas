package com.jcraft.jsch.jcraft;

public class HMACSHA1 extends com.jcraft.jsch.jcraft.HMAC implements com.jcraft.jsch.MAC {
    public HMACSHA1() {
        java.security.MessageDigest r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r0 = java.security.MessageDigest.getInstance("SHA-1");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 5; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    j6(r0);
                    return;
                }
                case 5: {
                    e = $ex0;
                    java.lang.System.err.println(e);
                    r0 = null;
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6() {
        return super.j6();
    }

    @Override
    public void j6(byte[] r1) {
        super.j6(r1);
    }

    @Override
    public void j6(byte[] r1, int r2) {
        super.j6(r1, r2);
    }

    @Override
    public void update(int r1) {
        super.update(r1);
    }

    @Override
    public void update(byte[] r1, int r2, int r3) {
        super.update(r1, r2, r3);
    }
}
