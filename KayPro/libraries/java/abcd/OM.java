package abcd;

class OM {
    private static final long j6 = 0;

    static {
        j6 = java.lang.Runtime.getRuntime().maxMemory();
    }

    static int DW(int r5) {
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 >= 31) { $pc0 = 5; continue $sw0; }
                    return 1;
                }
                case 5: {
                    if (r5 >= 128) { $pc0 = 7; continue $sw0; }
                    return 2;
                }
                case 7: {
                    r2 = new byte[5];
                    r3 = r2.length - 1;
                    r2[r3] = (byte) (r5 & 127);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r5 = r5 >> 7;
                    r3 = r3 - 1;
                    r2[r3] = (byte) ((r5 & 127) | 128);
                    if (r5 > 127) { $pc0 = 8; continue $sw0; }
                    return 1 + (r2.length - r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(int r2) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 1;
                    if (r2 <= 127) { $pc1 = 12; continue $sw1; }
                    r1 = 1;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r2 = r2 >>> 8;
                    if (r2 == 0) { $pc1 = 7; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 5; continue $sw1; }
                }
                case 7: {
                    r3 = (r1 - 1) * 8;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r3 < 0) { $pc1 = 12; continue $sw1; }
                    r0 = r0 + 1;
                    r3 = r3 - 8;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(java.io.InputStream r5) {
        long r3 = 0L;
        long r4 = 0L;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r5 instanceof abcd.MM) == false) { $pc2 = 7; continue $sw2; }
                    return ((abcd.MM) r5).j6();
                }
                case 7: {
                    if ((r5 instanceof abcd.C1419vL) == false) { $pc2 = 11; continue $sw2; }
                    return ((abcd.C1419vL) r5).DW();
                }
                case 11: {
                    if ((r5 instanceof java.io.ByteArrayInputStream) == false) { $pc2 = 15; continue $sw2; }
                    return ((java.io.ByteArrayInputStream) r5).available();
                }
                case 15: {
                    if ((r5 instanceof java.io.FileInputStream) == true) { $pc2 = 28; continue $sw2; }
                    $pc2 = 22; continue $sw2;
                }
                case 22: {
                    r3 = j6;
                    if (r3 <= 2147483647L) { $pc2 = 27; continue $sw2; }
                    return Integer.MAX_VALUE;
                }
                case 27: {
                    return (int) r3;
                }
                case 28: {
                    try {
                        r4 = ((java.io.FileInputStream) r5).getChannel().size();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 21; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 >= 2147483647L) { $pc2 = 22; continue $sw2; }
                    return (int) r4;
                }
                case 21: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
