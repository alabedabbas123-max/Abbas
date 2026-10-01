package abcd;

public final class hE {
    private static final byte[] DW = null;
    private static final byte[] FH = null;
    private static final byte[] Hw = null;
    public static final abcd.yE VH = null;
    public static final java.nio.charset.Charset Zo = null;
    private static final byte[] j6 = null;
    public static final byte[] v5 = null;

    static {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6 = DW("commit");
                    DW = DW("blob");
                    FH = DW("tree");
                    Hw = DW("tag");
                    v5 = new byte[]{80, 65, 67, 75};
                    if (20 != j6().getDigestLength()) { $pc0 = 7; continue $sw0; }
                    Zo = java.nio.charset.Charset.forName("UTF-8");
                    VH = abcd.yE.j6("e69de29bb2d1d6434b8b29ae775ad8c2e48c5391");
                    return;
                }
                case 7: {
                    throw new java.lang.LinkageError(org.eclipse.jgit.JGitText.j6().incorrectOBJECT_ID_LENGTH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String DW(int r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4 != 1) { $pc1 = 5; continue $sw1; }
                    return "commit";
                }
                case 5: {
                    if (r4 != 2) { $pc1 = 7; continue $sw1; }
                    return "tree";
                }
                case 7: {
                    if (r4 != 3) { $pc1 = 9; continue $sw1; }
                    return "blob";
                }
                case 9: {
                    if (r4 != 4) { $pc1 = 13; continue $sw1; }
                    return "tag";
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] DW(java.lang.String r5) {
        byte[] r0 = null;
        int r1 = 0;
        char r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new byte[r5.length()];
                    r1 = r0.length - 1;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r1 < 0) { $pc2 = 4; continue $sw2; }
                    r3 = r5.charAt(r1);
                    if (r3 > 127) { $pc2 = 9; continue $sw2; }
                    r0[r1] = (byte) r3;
                    r1 = r1 - 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notASCIIString, new java.lang.Object[]{r5}));
                }
                case 4: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(abcd.YD r5, byte[] r6, byte r7, abcd.EK r8) {
        int r0 = 0;
        byte r1 = 0;
        byte r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        r0 = r8.j6;
                        r1 = r6[r0];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 == 98) { $pc3 = 50; continue $sw3; }
                    if (r1 == 99) { $pc3 = 34; continue $sw3; }
                    if (r1 != 116) { $pc3 = 32; continue $sw3; }
                    try {
                        r2 = r6[r0 + 1];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == 97) { $pc3 = 24; continue $sw3; }
                    if (r2 != 114) { $pc3 = 22; continue $sw3; }
                    if (r6[r0 + 2] != 101) { $pc3 = 20; continue $sw3; }
                    if (r6[r0 + 3] != 101) { $pc3 = 20; continue $sw3; }
                    if (r6[r0 + 4] != r7) { $pc3 = 20; continue $sw3; }
                    try {
                        r8.j6 = r0 + 5;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return 2;
                }
                case 20: {
                    try {
                        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 22: {
                    try {
                        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 24: {
                    if (r6[r0 + 2] != 103) { $pc3 = 30; continue $sw3; }
                    if (r6[r0 + 3] != r7) { $pc3 = 30; continue $sw3; }
                    try {
                        r8.j6 = r0 + 4;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return 4;
                }
                case 30: {
                    try {
                        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 32: {
                    try {
                        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 34: {
                    if (r6[r0 + 1] != 111) { $pc3 = 48; continue $sw3; }
                    if (r6[r0 + 2] != 109) { $pc3 = 48; continue $sw3; }
                    if (r6[r0 + 3] != 109) { $pc3 = 48; continue $sw3; }
                    if (r6[r0 + 4] != 105) { $pc3 = 48; continue $sw3; }
                    if (r6[r0 + 5] != 116) { $pc3 = 48; continue $sw3; }
                    if (r6[r0 + 6] != r7) { $pc3 = 48; continue $sw3; }
                    try {
                        r8.j6 = r0 + 7;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return 1;
                }
                case 48: {
                    try {
                        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 50: {
                    if (r6[r0 + 1] != 108) { $pc3 = 60; continue $sw3; }
                    if (r6[r0 + 2] != 111) { $pc3 = 60; continue $sw3; }
                    if (r6[r0 + 3] != 98) { $pc3 = 60; continue $sw3; }
                    if (r6[r0 + 4] != r7) { $pc3 = 60; continue $sw3; }
                    try {
                        r8.j6 = r0 + 5;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return 3;
                }
                case 60: {
                    try {
                        throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 61; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 62: {
                    throw new abcd.YC(r5, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                }
                case 61: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.security.MessageDigest j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    return java.security.MessageDigest.getInstance("SHA-1");
                }
                case 5: {
                    e = $ex4;
                    throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().requiredHashFunctionNotAvailable, new java.lang.Object[]{"SHA-1"}), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(int r4) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r4 == 1) { $pc5 = 19; continue $sw5; }
                    if (r4 == 2) { $pc5 = 17; continue $sw5; }
                    if (r4 == 3) { $pc5 = 15; continue $sw5; }
                    if (r4 != 4) { $pc5 = 13; continue $sw5; }
                    return Hw;
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
                }
                case 15: {
                    return DW;
                }
                case 17: {
                    return FH;
                }
                case 19: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(long r0) {
        return DW(java.lang.Long.toString(r0));
    }

    public static byte[] j6(java.lang.String r3) {
        java.nio.ByteBuffer r4 = null;
        int r0 = 0;
        byte[] r1 = null;
        byte[] r2 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r4 = Zo.encode(r3);
                    r0 = r4.limit();
                    if (r4.hasArray() == true) { $pc6 = 5; continue $sw6; }
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    r1 = new byte[r0];
                    r4.get(r1);
                    return r1;
                }
                case 5: {
                    if (r4.arrayOffset() != 0) { $pc6 = 9; continue $sw6; }
                    r2 = r4.array();
                    if (r2.length != r0) { $pc6 = 9; continue $sw6; }
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
