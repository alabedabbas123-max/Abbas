package com.jcraft.jsch.jce;

public class SHA256 implements com.jcraft.jsch.HASH {
    java.security.MessageDigest j6;

    public SHA256() {
    }

    @Override
    public void DW() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        this.j6 = java.security.MessageDigest.getInstance("SHA-256");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 4; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex0;
                    java.lang.System.err.println(e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] FH() {
        return this.j6.digest();
    }

    @Override
    public int j6() {
        return 32;
    }

    @Override
    public void update(byte[] r2, int r3, int r4) {
        this.j6.update(r2, r3, r4);
    }
}
