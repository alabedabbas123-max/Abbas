package abcd;

public class BK {
    public static final byte[] DW(java.io.File r3, int r4) {
        java.io.FileInputStream r0 = null;
        byte[] r5 = null;
        int r1 = 0;
        int r2 = 0;
        byte[] r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.io.FileInputStream(r3);
                    try {
                        r5 = new byte[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    r1 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    try {
                        r2 = r0.read(r5, r1, r5.length - r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (r2 <= 0) { $pc0 = 7; continue $sw0; }
                    r1 = r1 + r2;
                    { $pc0 = 4; continue $sw0; }
                }
                case 7: {
                    if (r1 == r5.length) { $pc0 = 24; continue $sw0; }
                    try {
                        r6 = new byte[r1];
                        java.lang.System.arraycopy(r5, 0, r6, 0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 19; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    return r6;
                }
                case 24: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 20; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return r5;
                }
                case 14: {
                    th = $ex0;
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 21; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 19: {
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(java.io.InputStream r3, byte[] r4, int r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = r3.read(r4, r5, r4.length - r5);
                    if (r1 < 0) { $pc1 = 9; continue $sw1; }
                    if (r0 >= r4.length) { $pc1 = 9; continue $sw1; }
                    r5 = r5 + r1;
                    r0 = r0 + r1;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.nio.ByteBuffer j6(java.io.InputStream r3, int r4) {
        byte[] r5 = null;
        int r1 = 0;
        int r2 = 0;
        int r6 = 0;
        abcd.RK.c r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r5 = new byte[r4];
                    r1 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1 >= r5.length) { $pc2 = 5; continue $sw2; }
                    r2 = r3.read(r5, r1, r5.length - r1);
                    if (r2 < 0) { $pc2 = 14; continue $sw2; }
                    r1 = r1 + r2;
                    { $pc2 = 4; continue $sw2; }
                }
                case 14: {
                    return java.nio.ByteBuffer.wrap(r5, 0, r1);
                }
                case 5: {
                    r6 = r3.read();
                    if (r6 < 0) { $pc2 = 8; continue $sw2; }
                    r0 = new abcd.RK.c(Integer.MAX_VALUE);
                    r0.write(r5);
                    r0.write(r6);
                    r0.j6(r3);
                    return java.nio.ByteBuffer.wrap(r0.Zo());
                }
                case 8: {
                    return java.nio.ByteBuffer.wrap(r5, 0, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.InputStream r5, long r6) {
        long r2 = 0L;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 3: {
                    if (r6 <= 0) { $pc3 = 4; continue $sw3; }
                    r2 = r5.skip(r6);
                    if (r2 <= 0) { $pc3 = 9; continue $sw3; }
                    r6 = r6 - r2;
                    { $pc3 = 3; continue $sw3; }
                }
                case 9: {
                    throw new java.io.EOFException(org.eclipse.jgit.JGitText.j6().shortSkipOfBlock);
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.InputStream r1, byte[] r2, int r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 2;
        $sw4: while (true) {
            switch ($pc4) {
                case 2: {
                    if (r4 <= 0) { $pc4 = 3; continue $sw4; }
                    r0 = r1.read(r2, r3, r4);
                    if (r0 <= 0) { $pc4 = 8; continue $sw4; }
                    r3 = r3 + r0;
                    r4 = r4 - r0;
                    { $pc4 = 2; continue $sw4; }
                }
                case 8: {
                    throw new java.io.EOFException(org.eclipse.jgit.JGitText.j6().shortReadOfBlock);
                }
                case 3: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static final byte[] j6(java.io.File r1) {
        return j6(r1, Integer.MAX_VALUE);
    }

    public static final byte[] j6(java.io.File r7, int r8) {
        java.io.FileInputStream r0 = null;
        long r1 = 0L;
        byte[] r9 = null;
        int r3 = 0;
        byte[] r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.io.FileInputStream(r7);
                    try {
                        r1 = r0.getChannel().size();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    if (r1 > r8) { $pc5 = 13; continue $sw5; }
                    try {
                        r9 = new byte[(int) r1];
                        r3 = j6(r0, r9, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    if (r3 != r1) { $pc5 = 25; continue $sw5; }
                    try {
                        r2 = new byte[r3];
                        java.lang.System.arraycopy(r9, 0, r2, 0, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 17; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    return r2;
                }
                case 25: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 18; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    return r9;
                }
                case 13: {
                    try {
                        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().fileIsTooLarge, new java.lang.Object[]{r7}));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                }
                case 14: {
                    th = $ex5;
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 19; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 17: {
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
