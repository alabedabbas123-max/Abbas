package abcd;

public class sH {

    private static final class a extends abcd.FE {
        private final long DW;
        private final java.io.File FH;
        private final abcd.yE Hw;
        private final int j6;
        private final abcd.GG v5;

        private a(int r1, long r2, java.io.File r4, abcd.YD r5, abcd.GG r6) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r4;
            this.Hw = r5.Hw();
            this.v5 = r6;
        }

        a(int r1, long r2, java.io.File r4, abcd.YD r5, abcd.GG r6, abcd.sH.a r7) {
            this(r1, r2, r4, r5, r6);
        }

        @Override
        public long DW() {
            return this.DW;
        }

        @Override
        public int FH() {
            return this.j6;
        }

        @Override
        public boolean Hw() {
            return true;
        }

        @Override
        public byte[] j6() {
            throw new abcd.cD(this.Hw);
        }

        @Override
        public abcd.JE v5() {
            java.io.BufferedInputStream r0 = null;
            boolean r3 = false;
            byte[] r1 = null;
            int r4 = 0;
            int r5 = 0;
            int r6 = 0;
            int r7 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            r0 = abcd.sH.j6(new java.io.FileInputStream(this.FH));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.FileNotFoundException) { $pc0 = 25; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        r3 = false;
                        try {
                            r1 = new byte[64];
                            r0.mark(20);
                            abcd.BK.j6(r0, r1, 0, 2);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 21; continue $sw0;
                        }
                        if (abcd.sH.j6(r1) == false) { $pc0 = 10; continue $sw0; }
                        try {
                            r0.reset();
                            r0 = abcd.sH.j6(abcd.sH.j6(r0, this.DW, this.Hw));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 21; continue $sw0;
                        }
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        if (r0.read() > 0) { $pc0 = 8; continue $sw0; }
                        $pc0 = 27; continue $sw0;
                    }
                    case 27: {
                        return new abcd.JE.a(this.j6, this.DW, r0);
                    }
                    case 16: {
                        th = th;
                        r3 = true;
                        $pc0 = 22; continue $sw0;
                    }
                    case 22: {
                        if (r3 == true) { $pc0 = 24; continue $sw0; }
                        r0.close();
                        $pc0 = 24; continue $sw0;
                    }
                    case 24: {
                        throw th;
                    }
                    case 10: {
                        try {
                            abcd.sH.j6(r0, r1, 2, 18);
                            r4 = r1[0] & 255;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 21; continue $sw0;
                        }
                        r5 = 1;
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        if ((r4 & 128) == 0) { $pc0 = 13; continue $sw0; }
                        r6 = r5 + 1;
                        r7 = r1[r5] & 255;
                        r5 = r6;
                        r4 = r7;
                        { $pc0 = 12; continue $sw0; }
                    }
                    case 13: {
                        try {
                            r0.reset();
                            abcd.BK.j6(r0, r5);
                            r0 = abcd.sH.j6(abcd.sH.j6(r0, this.DW, this.Hw));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 21; continue $sw0;
                        }
                        $pc0 = 21; continue $sw0;
                    }
                    case 21: {
                        th = th;
                        $pc0 = 26; continue $sw0;
                    }
                    case 26: {
                        return this.v5.j6(this.Hw, this.j6).v5();
                    }
                    case 25: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static int DW(java.io.InputStream r2, byte[] r3, int r4, int r5) {
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
                    if (r5 <= 0) { $pc1 = 7; continue $sw1; }
                    r1 = r2.read(r3, r4, r5);
                    if (r1 < 0) { $pc1 = 7; continue $sw1; }
                    r0 = r0 + r1;
                    r4 = r4 + r1;
                    r5 = r5 - r1;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.io.BufferedInputStream DW(java.io.InputStream r2) {
        return new java.io.BufferedInputStream(r2, 8192);
    }

    private static java.io.InputStream DW(java.io.InputStream r7, long r8, abcd.yE r10) {
        return new abcd.rH(r7, abcd.tE.j6(), r8, r10);
    }

    private static void DW(java.io.InputStream r2, java.util.zip.Inflater r3, abcd.YD r4, byte[] r5) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 25;
        $sw2: while (true) {
            switch ($pc2) {
                case 27: {
                    if (r3.inflate(r5) != 0) { $pc2 = 23; continue $sw2; }
                    if (r3.finished() == true) { $pc2 = 7; continue $sw2; }
                    if (r3.needsInput() == false) { $pc2 = 21; continue $sw2; }
                    r0 = r2.read(r5);
                    if (r0 <= 0) { $pc2 = 19; continue $sw2; }
                    r3.setInput(r5, 0, r0);
                    { $pc2 = 27; continue $sw2; }
                }
                case 19: {
                    throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
                }
                case 21: {
                    throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
                }
                case 7: {
                    if (r3.getRemaining() != 0) { $pc2 = 12; continue $sw2; }
                    if (r2.read() != (-1)) { $pc2 = 12; continue $sw2; }
                    return;
                }
                case 12: {
                    throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
                }
                case 23: {
                    throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectIncorrectLength);
                }
                case 25: {
                    throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean DW(byte[] r4) {
        int r1 = 0;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = r4[0] & 255;
                    if ((r1 & 143) != 8) { $pc3 = 7; continue $sw3; }
                    r5 = r4[1] & 255;
                    if (((r5 | (r1 << 8)) % 31) != 0) { $pc3 = 7; continue $sw3; }
                    return true;
                }
                case 7: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(java.io.InputStream r0, byte[] r1, int r2, int r3) {
        return DW(r0, r1, r2, r3);
    }

    static long j6(java.io.InputStream r7, abcd.YD r8, abcd.wH r9) {
        java.io.BufferedInputStream r10 = null;
        byte[] r1 = null;
        abcd.EK r11 = null;
        long r0 = 0L;
        int r12 = 0;
        long r2 = 0L;
        int r13 = 0;
        int r3 = 0;
        int r14 = 0;
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        r10 = DW(r7);
                        r10.mark(20);
                        r1 = new byte[64];
                        abcd.BK.j6(r10, r1, 0, 2);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (DW(r1) == false) { $pc4 = 13; continue $sw4; }
                    try {
                        r10.reset();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (DW(j6(r10, r9.VH()), r1, 0, 64) < 5) { $pc4 = 12; continue $sw4; }
                    try {
                        r11 = new abcd.EK();
                        abcd.hE.j6(r8, r1, (byte) 32, r11);
                        r0 = abcd.IK.DW(r1, r11.j6, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 < 0) { $pc4 = 10; continue $sw4; }
                    return r0;
                }
                case 10: {
                    try {
                        throw new abcd.YC(r8, org.eclipse.jgit.JGitText.j6().corruptObjectNegativeSize);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 12: {
                    try {
                        throw new abcd.YC(r8, org.eclipse.jgit.JGitText.j6().corruptObjectNoHeader);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 13: {
                    try {
                        DW(r10, r1, 2, 18);
                        r12 = r1[0] & 255;
                        r2 = r12 & 15;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r13 = 4;
                    r3 = 1;
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if ((r12 & 128) == 0) { $pc4 = 16; continue $sw4; }
                    try {
                        r14 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = r1[r3] & 255;
                    r2 = r2 + ((long) ((r4 & 127) << r13));
                    r13 = r13 + 7;
                    r3 = r14;
                    r12 = r4;
                    { $pc4 = 15; continue $sw4; }
                }
                case 16: {
                    return r2;
                }
                case 20: {
                    throw new abcd.YC(r8, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
                }
                case 19: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.FE j6(java.io.InputStream r18, java.io.File r19, abcd.YD r20, abcd.wH r21) {
        java.io.BufferedInputStream r1 = null;
        byte[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        java.util.zip.Inflater r6 = null;
        java.util.zip.InflaterInputStream r7 = null;
        int r2 = 0;
        abcd.EK r8 = null;
        int r11 = 0;
        long r12 = 0L;
        int r14 = 0;
        abcd.cD.a r0 = null;
        byte[] r9 = null;
        int r10 = 0;
        int r13 = 0;
        int r15 = 0;
        long r16 = 0L;
        int r17 = 0;
        int r110 = 0;
        int r22 = 0;
        int r111 = 0;
        abcd.cD.a r23 = null;
        java.util.zip.Inflater r24 = null;
        byte[] r25 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        r1 = DW(r18);
                        r1.mark(20);
                        r3 = new byte[64];
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = 2;
                    r5 = 0;
                    try {
                        abcd.BK.j6(r1, r3, 0, 2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (DW(r3) == false) { $pc5 = 34; continue $sw5; }
                    try {
                        r1.reset();
                        r6 = r21.VH();
                        r7 = j6(r1, r6);
                        r2 = DW(r7, r3, 0, 64);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 < 5) { $pc5 = 33; continue $sw5; }
                    try {
                        r8 = new abcd.EK();
                        r11 = abcd.hE.j6(r20, r3, (byte) 32, r8);
                        r12 = abcd.IK.DW(r3, r8.j6, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12 < 0) { $pc5 = 31; continue $sw5; }
                    try {
                        r14 = r8.j6;
                        r8.j6 = r14 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3[r14] != 0) { $pc5 = 29; continue $sw5; }
                    if (r19 != null) { $pc5 = 18; continue $sw5; }
                    if (2147483647L >= r12) { $pc5 = 18; continue $sw5; }
                    try {
                        r0 = new abcd.cD.a();
                        r0.j6(r20);
                        throw r0;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 18: {
                    if (r12 < r21.Zo()) { $pc5 = 23; continue $sw5; }
                    if (r19 == null) { $pc5 = 23; continue $sw5; }
                    return new abcd.sH.a(r11, r12, r19, r20, r21.v5, null);
                }
                case 23: {
                    try {
                        r9 = new byte[(int) r12];
                        r10 = r2 - r8.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r10 <= 0) { $pc5 = 26; continue $sw5; }
                    try {
                        java.lang.System.arraycopy(r3, r8.j6, r9, 0, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 26; continue $sw5;
                }
                case 26: {
                    try {
                        abcd.BK.j6(r7, r9, r10, r9.length - r10);
                        DW(r1, r6, r20, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new abcd.FE.a(r11, r9);
                }
                case 29: {
                    try {
                        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectGarbageAfterSize);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 31: {
                    try {
                        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectNegativeSize);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 33: {
                    try {
                        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectNoHeader);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 34: {
                    try {
                        DW(r1, r3, 2, 18);
                        r13 = r3[0] & 255;
                        r15 = (r13 >> 4) & 7;
                        r16 = r13 & 15;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r17 = 1;
                    r110 = 4;
                    $pc5 = 36; continue $sw5;
                }
                case 36: {
                    if ((r13 & 128) == 0) { $pc5 = 37; continue $sw5; }
                    try {
                        r22 = r17 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r111 = r3[r17] & 255;
                    r16 = r16 + ((long) ((r111 & 127) << r110));
                    r110 = r110 + 7;
                    r15 = r15;
                    r4 = 2;
                    r5 = 0;
                    r17 = r22;
                    r13 = r111;
                    { $pc5 = 36; continue $sw5; }
                }
                case 37: {
                    if (r15 == 1) { $pc5 = 45; continue $sw5; }
                    if (r15 == r4) { $pc5 = 45; continue $sw5; }
                    if (r15 == 3) { $pc5 = 45; continue $sw5; }
                    if (r15 == 4) { $pc5 = 45; continue $sw5; }
                    try {
                        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 45: {
                    if (r19 != null) { $pc5 = 52; continue $sw5; }
                    if (2147483647L >= r16) { $pc5 = 52; continue $sw5; }
                    try {
                        r23 = new abcd.cD.a();
                        r23.j6(r20);
                        throw r23;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 52: {
                    if (r16 < r21.Zo()) { $pc5 = 57; continue $sw5; }
                    if (r19 == null) { $pc5 = 57; continue $sw5; }
                    return new abcd.sH.a(r15, r16, r19, r20, r21.v5, null);
                }
                case 57: {
                    try {
                        r1.reset();
                        abcd.BK.j6(r1, r17);
                        r24 = r21.VH();
                        r25 = new byte[(int) r16];
                        abcd.BK.j6(j6(r1, r24), r25, r5, r25.length);
                        DW(r1, r24, r20, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.util.zip.ZipException) { $pc5 = 61; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new abcd.FE.a(r15, r25);
                }
                case 62: {
                    throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
                }
                case 61: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.FE j6(byte[] r3, abcd.YD r4) {
        abcd.wH r0 = null;
        abcd.FE r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new abcd.wH(null);
                    try {
                        r5 = j6(new java.io.ByteArrayInputStream(r3), null, r4, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 6; continue $sw6;
                    }
                    r0.FH();
                    return r5;
                }
                case 6: {
                    th = $ex6;
                    r0.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.io.BufferedInputStream j6(java.io.InputStream r0) {
        return DW(r0);
    }

    static java.io.InputStream j6(java.io.InputStream r0, long r1, abcd.yE r3) {
        return DW(r0, r1, r3);
    }

    private static java.util.zip.InflaterInputStream j6(java.io.InputStream r2, java.util.zip.Inflater r3) {
        return new java.util.zip.InflaterInputStream(r2, r3, 8192);
    }

    static void j6(java.io.InputStream r0, java.util.zip.Inflater r1, abcd.YD r2, byte[] r3) {
        DW(r0, r1, r2, r3);
    }

    static boolean j6(byte[] r0) {
        return DW(r0);
    }
}
