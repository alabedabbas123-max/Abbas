package a.b.b;

public class s extends a.b.b.b {

    private byte[] f101a;
    private java.lang.String b;

    public s() {
    }

    public s(java.lang.String r2) {
        this.f101a = null;
        this.b = r2;
    }

    private java.lang.String b(byte[] r10) {
        char[] r7 = null;
        int r0 = 0;
        int r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r3 = 0;
        int r6 = 0;
        int r8 = 0;
        int r9 = 0;
        int r1 = 0;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7 = new char[r10.length];
                    r0 = 0;
                    r2 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= r10.length) { $pc0 = 19; continue $sw0; }
                    r4 = r0 + 1;
                    r5 = r10[r0] & 255;
                    r3 = r2 + 1;
                    if (r5 >= 192) { $pc0 = 11; continue $sw0; }
                    r0 = r4;
                    r6 = r5;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        r7[r2] = (char) r6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 15; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = r3;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw new java.io.UnsupportedEncodingException("Missing UTF-8 bytes after initial byte [0x" + java.lang.Integer.toHexString(r5) + "] in string [" + new java.lang.String(r7, 0, r3) + "]");
                }
                case 11: {
                    if (r5 >= 224) { $pc0 = 13; continue $sw0; }
                    try {
                        r8 = r4 + 1;
                        r6 = ((r5 & 31) << 6) | (r10[r4] & 63);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 15; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = r8;
                    { $pc0 = 20; continue $sw0; }
                }
                case 13: {
                    try {
                        r9 = r4 + 1;
                        r1 = ((r5 & 15) << 12) | ((r10[r4] & 63) << 6);
                        r11 = r9 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc0 = 15; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r12 = r1 | (r10[r9] & 63);
                    r0 = r11;
                    r6 = r12;
                    { $pc0 = 20; continue $sw0; }
                }
                case 19: {
                    return new java.lang.String(r7, 0, r2);
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] b(java.lang.String r10) {
        int r2 = 0;
        int r5 = 0;
        int r3 = 0;
        int r4 = 0;
        char r0 = 0;
        int r1 = 0;
        byte[] r6 = null;
        int r7 = 0;
        char r8 = 0;
        int r9 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = 0;
                    r5 = r10.length();
                    r3 = 0;
                    r4 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r3 >= r5) { $pc1 = 13; continue $sw1; }
                    r0 = r10.charAt(r3);
                    if (r0 != 0) { $pc1 = 8; continue $sw1; }
                    r1 = 2;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r4 = r4 + r1;
                    r3 = r3 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 8: {
                    if (r0 >= 128) { $pc1 = 10; continue $sw1; }
                    r1 = 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 10: {
                    if (r0 >= 2048) { $pc1 = 12; continue $sw1; }
                    r1 = 2;
                    { $pc1 = 7; continue $sw1; }
                }
                case 12: {
                    r1 = 3;
                    { $pc1 = 7; continue $sw1; }
                }
                case 13: {
                    r6 = new byte[r4];
                    r7 = 0;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    if (r7 >= r5) { $pc1 = 24; continue $sw1; }
                    r8 = r10.charAt(r7);
                    if (r8 != 0) { $pc1 = 19; continue $sw1; }
                    r9 = r2 + 1;
                    r6[r2] = -64;
                    r11 = r9 + 1;
                    r6[r9] = -128;
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r7 = r7 + 1;
                    r2 = r11;
                    { $pc1 = 14; continue $sw1; }
                }
                case 19: {
                    if (r8 >= 128) { $pc1 = 21; continue $sw1; }
                    r11 = r2 + 1;
                    r6[r2] = (byte) r8;
                    { $pc1 = 18; continue $sw1; }
                }
                case 21: {
                    if (r8 >= 2048) { $pc1 = 23; continue $sw1; }
                    r12 = r2 + 1;
                    r6[r2] = (byte) (((r8 >>> 6) & 31) | 192);
                    r11 = r12 + 1;
                    r6[r12] = (byte) ((r8 & '?') | 128);
                    { $pc1 = 18; continue $sw1; }
                }
                case 23: {
                    r13 = r2 + 1;
                    r6[r2] = (byte) (((r8 >>> '\f') & 15) | 224);
                    r14 = r13 + 1;
                    r6[r13] = (byte) (((r8 >>> 6) & 63) | 128);
                    r11 = r14 + 1;
                    r6[r14] = (byte) ((r8 & '?') | 128);
                    { $pc1 = 18; continue $sw1; }
                }
                case 24: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void d() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.f101a != null) { $pc2 = 6; continue $sw2; }
                    this.f101a = b(this.b);
                    this.b = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void e() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.b != null) { $pc3 = 6; continue $sw3; }
                    this.b = b(this.f101a);
                    this.f101a = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(a.b.c r1, a.b.b.a.f r2) {
        r2.a(r1, this);
    }

    public void a(java.lang.String r2) {
        this.f101a = null;
        this.b = r2;
    }

    public void a(byte[] r2) {
        this.f101a = r2;
        this.b = null;
    }

    public byte[] b() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        d();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc4 = 5; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return this.f101a;
                }
                case 5: {
                    e = $ex4;
                    throw new java.lang.RuntimeException(e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String c() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        e();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc5 = 5; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return this.b;
                }
                case 5: {
                    e = $ex5;
                    throw new java.lang.RuntimeException(e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
