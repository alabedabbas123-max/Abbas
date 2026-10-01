package com.jcraft.jsch.jce;

abstract class HMAC implements com.jcraft.jsch.MAC {
    protected int DW;
    protected java.lang.String FH;
    private javax.crypto.Mac Hw;
    protected java.lang.String j6;
    private final byte[] v5;

    HMAC() {
        this.v5 = new byte[4];
    }

    @Override
    public int j6() {
        return this.DW;
    }

    @Override
    public void j6(byte[] r4) {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        javax.crypto.spec.SecretKeySpec r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4.length;
                    r1 = this.DW;
                    if (r0 <= r1) { $pc0 = 5; continue $sw0; }
                    r2 = new byte[r1];
                    java.lang.System.arraycopy(r4, 0, r2, 0, r1);
                    r4 = r2;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r3 = new javax.crypto.spec.SecretKeySpec(r4, this.FH);
                    this.Hw = javax.crypto.Mac.getInstance(this.FH);
                    this.Hw.init(r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(byte[] r2, int r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.Hw.doFinal(r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof javax.crypto.ShortBufferException) { $pc1 = 4; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    e = $ex1;
                    java.lang.System.err.println(e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void update(int r5) {
        byte[] r0 = this.v5;
        r0[0] = (byte) (r5 >>> 24);
        r0[1] = (byte) (r5 >>> 16);
        r0[2] = (byte) (r5 >>> 8);
        r0[3] = (byte) r5;
        update(r0, 0, 4);
    }

    @Override
    public void update(byte[] r2, int r3, int r4) {
        this.Hw.update(r2, r3, r4);
    }
}
