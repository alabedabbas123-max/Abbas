package com.jcraft.jsch.jcraft;

class HMAC {
    private byte[] DW;
    private java.security.MessageDigest FH;
    private int Hw;
    private byte[] j6;
    private final byte[] v5;

    HMAC() {
        this.j6 = null;
        this.DW = null;
        this.FH = null;
        this.Hw = 0;
        this.v5 = new byte[4];
    }

    public int j6() {
        return this.Hw;
    }

    protected void j6(java.security.MessageDigest r1) {
        this.FH = r1;
        this.Hw = r1.getDigestLength();
    }

    public void j6(byte[] r5) {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        int r6 = 0;
        byte[] r3 = null;
        byte[] r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH.reset();
                    r0 = r5.length;
                    r1 = this.Hw;
                    if (r0 <= r1) { $pc0 = 6; continue $sw0; }
                    r2 = new byte[r1];
                    java.lang.System.arraycopy(r5, 0, r2, 0, r1);
                    r5 = r2;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r5.length <= 64) { $pc0 = 8; continue $sw0; }
                    this.FH.update(r5, 0, r5.length);
                    r5 = this.FH.digest();
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.j6 = new byte[64];
                    java.lang.System.arraycopy(r5, 0, this.j6, 0, r5.length);
                    this.DW = new byte[64];
                    java.lang.System.arraycopy(r5, 0, this.DW, 0, r5.length);
                    r6 = 0;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r6 >= 64) { $pc0 = 10; continue $sw0; }
                    r3 = this.j6;
                    r3[r6] = (byte) (r3[r6] ^ 54);
                    r4 = this.DW;
                    r4[r6] = (byte) (r4[r6] ^ 92);
                    r6 = r6 + 1;
                    { $pc0 = 9; continue $sw0; }
                }
                case 10: {
                    this.FH.update(this.j6, 0, 64);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r6, int r7) {
        byte[] r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH.digest();
                    this.FH.update(this.DW, 0, 64);
                    this.FH.update(r0, 0, this.Hw);
                    try {
                        this.FH.digest(r6, r7, this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 6; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    this.FH.update(this.j6, 0, 64);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void update(int r5) {
        byte[] r0 = this.v5;
        r0[0] = (byte) (r5 >>> 24);
        r0[1] = (byte) (r5 >>> 16);
        r0[2] = (byte) (r5 >>> 8);
        r0[3] = (byte) r5;
        update(r0, 0, 4);
    }

    public void update(byte[] r2, int r3, int r4) {
        this.FH.update(r2, r3, r4);
    }
}
