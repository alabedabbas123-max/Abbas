package abcd;

public final class Br {
    private static final byte[] j6 = null;

    static {
        int r2 = 0;
        abcd.oq.a r3 = null;
        abcd.Enummq r4 = null;
        abcd.Enumer r5 = null;
        byte r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6 = new byte[255];
                    r2 = 1;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= 255) { $pc0 = 23; continue $sw0; }
                    try {
                        r3 = abcd.oq.j6(r2);
                        r4 = r3.DW();
                        r5 = r3.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 != abcd.Enummq.DW) { $pc0 = 7; continue $sw0; }
                    try {
                        j6[r2] = j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 22; continue $sw0; }
                }
                case 7: {
                    try {
                        r6 = j6(r5);
                        r7 = abcd.Ar.j6[r4.ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 != 1) { $pc0 = 10; continue $sw0; }
                    try {
                        r8 = r6 | 16;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    try {
                        j6[r2] = (byte) r8;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 22; continue $sw0; }
                }
                case 10: {
                    if (r7 != 2) { $pc0 = 12; continue $sw0; }
                    try {
                        r8 = r6 | 32;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 21; continue $sw0; }
                }
                case 12: {
                    if (r7 != 3) { $pc0 = 14; continue $sw0; }
                    try {
                        r8 = r6 | 48;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 21; continue $sw0; }
                }
                case 14: {
                    if (r7 != 4) { $pc0 = 17; continue $sw0; }
                    try {
                        r8 = r6 | 64;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 21; continue $sw0; }
                }
                case 17: {
                    try {
                        throw new java.lang.RuntimeException("Unknown index type: " + r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 22: {
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 23: {
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static byte j6(abcd.Enumer r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    switch(abcd.Ar.DW[r2.ordinal()]) {
                        case 1: { $pc1 = 25; continue $sw1; }
                        case 2: { $pc1 = 22; continue $sw1; }
                        case 3: { $pc1 = 22; continue $sw1; }
                        case 4: { $pc1 = 22; continue $sw1; }
                        case 5: { $pc1 = 22; continue $sw1; }
                        case 6: { $pc1 = 22; continue $sw1; }
                        case 7: { $pc1 = 20; continue $sw1; }
                        case 8: { $pc1 = 20; continue $sw1; }
                        case 9: { $pc1 = 20; continue $sw1; }
                        case 10: { $pc1 = 20; continue $sw1; }
                        case 11: { $pc1 = 20; continue $sw1; }
                        case 12: { $pc1 = 20; continue $sw1; }
                        case 13: { $pc1 = 20; continue $sw1; }
                        case 14: { $pc1 = 20; continue $sw1; }
                        case 15: { $pc1 = 20; continue $sw1; }
                        case 16: { $pc1 = 20; continue $sw1; }
                        case 17: { $pc1 = 20; continue $sw1; }
                        case 18: { $pc1 = 19; continue $sw1; }
                        case 19: { $pc1 = 19; continue $sw1; }
                        case 20: { $pc1 = 16; continue $sw1; }
                        case 21: { $pc1 = 16; continue $sw1; }
                        case 22: { $pc1 = 16; continue $sw1; }
                        case 23: { $pc1 = 16; continue $sw1; }
                        case 24: { $pc1 = 16; continue $sw1; }
                        case 25: { $pc1 = 16; continue $sw1; }
                        case 26: { $pc1 = 16; continue $sw1; }
                        case 27: { $pc1 = 16; continue $sw1; }
                        case 28: { $pc1 = 16; continue $sw1; }
                        case 29: { $pc1 = 15; continue $sw1; }
                        case 30: { $pc1 = 15; continue $sw1; }
                        case 31: { $pc1 = 15; continue $sw1; }
                        case 32: { $pc1 = 15; continue $sw1; }
                        case 33: { $pc1 = 13; continue $sw1; }
                        case 34: { $pc1 = 11; continue $sw1; }
                        case 35: { $pc1 = 8; continue $sw1; }
                        case 36: { $pc1 = 7; continue $sw1; }
                        case 37: { $pc1 = 7; continue $sw1; }
                        default: { $pc1 = 5; continue $sw1; }
                    };
                }
                case 8: {
                    return 5;
                }
                case 16: {
                    return 3;
                }
                case 20: {
                    return 2;
                }
                case 22: {
                    return 1;
                }
                case 5: {
                    throw new java.lang.RuntimeException("Unknown opcode format");
                }
                case 7: {
                    throw new java.lang.RuntimeException("Jumbo opcodes not supported");
                }
                case 11: {
                    throw new java.lang.RuntimeException("Jumbo opcodes not supported");
                }
                case 13: {
                    throw new java.lang.RuntimeException("Unexpected format");
                }
                case 15: {
                    throw new java.lang.RuntimeException("Unexpected format");
                }
                case 19: {
                    throw new java.lang.RuntimeException("Unexpected format");
                }
                case 25: {
                    throw new java.lang.RuntimeException("Unexpected format");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(short[] r7, abcd.yr r8) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        byte r6 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6;
                    r1 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1 >= r7.length) { $pc2 = 49; continue $sw2; }
                    r2 = r7[r1] & 255;
                    if (r2 != 0) { $pc2 = 8; continue $sw2; }
                    r3 = r7[r1] & 65535;
                    if (r3 != 256) { $pc2 = 40; continue $sw2; }
                    r4 = (r7[r1 + 1] & 65535) * 2;
                    $pc2 = 47; continue $sw2;
                }
                case 47: {
                    r5 = r4 + 3;
                    $pc2 = 30; continue $sw2;
                }
                case 30: {
                    r1 = r1 + r5;
                    $pc2 = 48; continue $sw2;
                }
                case 48: {
                    r1 = r1 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 40: {
                    if (r3 != 512) { $pc2 = 42; continue $sw2; }
                    r5 = ((r7[r1 + 1] & 65535) * 4) + 1;
                    { $pc2 = 30; continue $sw2; }
                }
                case 42: {
                    if (r3 != 768) { $pc2 = 48; continue $sw2; }
                    r4 = (((r7[r1 + 1] & 65535) * (r7[r1 + 2] & 65535)) + 1) / 2;
                    { $pc2 = 47; continue $sw2; }
                }
                case 8: {
                    if (r2 == 27) { $pc2 = 36; continue $sw2; }
                    if (r2 == 255) { $pc2 = 34; continue $sw2; }
                    r6 = r0[r2];
                    if (r6 == 0) { $pc2 = 32; continue $sw2; }
                    if (r6 >= 15) { $pc2 = 15; continue $sw2; }
                    r1 = r1 + (r6 - 1);
                    { $pc2 = 48; continue $sw2; }
                }
                case 15: {
                    r9 = r6 & 240;
                    if (r9 != 16) { $pc2 = 18; continue $sw2; }
                    r10 = r1 + 1;
                    r7[r10] = (short) r8.tp(65535 & r7[r10]);
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    r5 = (r6 & 15) - 1;
                    { $pc2 = 30; continue $sw2; }
                }
                case 18: {
                    if (r9 != 32) { $pc2 = 20; continue $sw2; }
                    r11 = r1 + 1;
                    r7[r11] = (short) r8.u7(65535 & r7[r11]);
                    { $pc2 = 29; continue $sw2; }
                }
                case 20: {
                    if (r9 != 48) { $pc2 = 22; continue $sw2; }
                    r12 = r1 + 1;
                    r7[r12] = (short) r8.Zo(65535 & r7[r12]);
                    { $pc2 = 29; continue $sw2; }
                }
                case 22: {
                    if (r9 != 64) { $pc2 = 25; continue $sw2; }
                    r13 = r1 + 1;
                    r7[r13] = (short) r8.VH(65535 & r7[r13]);
                    { $pc2 = 29; continue $sw2; }
                }
                case 25: {
                    throw new java.lang.RuntimeException("Unexpected mask");
                }
                case 32: {
                    throw new java.lang.RuntimeException("Opcode size not found for opcode " + java.lang.Integer.toHexString(r2));
                }
                case 34: {
                    throw new java.lang.RuntimeException("Extended opcodes not supported");
                }
                case 36: {
                    throw new java.lang.RuntimeException("Extended opcodes not supported");
                }
                case 49: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
