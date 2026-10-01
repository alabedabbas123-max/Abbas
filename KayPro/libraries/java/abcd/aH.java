package abcd;

public class aH implements java.lang.Iterable<abcd.AbstractbH.b> {
    public static final java.util.Comparator<abcd.aH> j6 = null;
    private final java.io.File DW;
    private int EQ;
    private final java.io.File FH;
    private volatile java.lang.String Hw;
    private byte[] J0;
    private abcd.AbstractbH J8;
    private volatile abcd.DK QX;
    private final java.lang.Object VH;
    private abcd.lH Ws;
    private java.io.RandomAccessFile Zo;
    long gn;
    private int tp;
    private int u7;
    final int v5;
    private volatile boolean we;

    private static class a {
        final long DW;
        final int FH;
        final int Hw;
        final abcd.aH.a j6;
        final long v5;

        a(abcd.aH.a r1, long r2, int r4, int r5, long r6) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r4;
            this.Hw = r5;
            this.v5 = r6;
        }

        private abcd.FE DW(abcd.aH r10, abcd.wH r11) {
            return new abcd.OG(this.DW, this.v5, this.Hw, r10, r11.v5);
        }

        abcd.FE j6(abcd.aH r3, abcd.wH r4) {
            abcd.aH.a r0 = null;
            abcd.aH.a r1 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this;
                        $pc0 = 3; continue $sw0;
                    }
                    case 3: {
                        r1 = r0.j6;
                        if (r1 == null) { $pc0 = 6; continue $sw0; }
                        r0 = r1;
                        { $pc0 = 3; continue $sw0; }
                    }
                    case 6: {
                        return r0.DW(r3, r4);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new abcd._G();
    }

    public aH(java.io.File r2, java.io.File r3) {
        this.VH = new java.lang.Object();
        this.DW = r2;
        this.FH = r3;
        this.EQ = (int) (r3.lastModified() >> 10);
        this.v5 = java.lang.System.identityHashCode(this) * 31;
        this.gn = Long.MAX_VALUE;
    }

    private long DW(long r5) {
        long r0 = this.gn - 20;
        return we().j6(r5, r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [long] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r31v0, types: [long] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [long] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v8, types: [long] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [long] */
    /* JADX WARN: Type inference failed for: r8v22, types: [abcd.TG] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [abcd.MH, abcd.TG] */
    /* JADX WARN: Type inference failed for: r8v5, types: [abcd.MH] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [long] */
    private void DW(abcd.OH r34, abcd.TG r35, boolean r36, abcd.wH r37) {
        abcd.aH r8 = null;
        abcd.TG r9 = null;
        java.util.zip.CRC32 r1 = null;
        java.util.zip.CRC32 r10 = null;
        java.util.zip.CRC32 r11 = null;
        byte[] r12 = null;
        int r13 = 0;
        int r2 = 0;
        int r3 = 0;
        long r6 = 0L;
        int r4 = 0;
        int r15 = 0;
        abcd.aH r5 = null;
        abcd.TG r14 = null;
        int r16 = 0;
        int r7 = 0;
        long r17 = 0L;
        long r18 = 0L;
        long r19 = 0L;
        long r110 = 0L;
        abcd.AG r20 = null;
        long r21 = 0L;
        abcd.AG r26 = null;
        java.util.zip.Inflater r22 = null;
        byte[] r23 = null;
        java.lang.Object r24 = null;
        java.lang.Object r25 = null;
        abcd.tD r27 = null;
        abcd.YC r28 = null;
        abcd.tD r0 = null;
        long r111 = 0L;
        java.lang.Object r29 = null;
        abcd.TG r30 = null;
        long r31 = 0L;
        java.lang.Object r32 = null;
        long r112 = 0L;
        java.lang.Object r113 = null;
        int r114 = 0;
        long r33 = 0L;
        java.lang.Object r38 = null;
        int r115 = 0;
        int r39 = 0;
        long r40 = 0L;
        long r41 = 0L;
        long r116 = 0L;
        java.lang.Object r42 = null;
        int r43 = 0;
        long r210 = 0L;
        byte[] r117 = null;
        java.util.zip.Inflater r44 = null;
        int r45 = 0;
        long r46 = 0L;
        long r47 = 0L;
        long r48 = 0L;
        long r211 = 0L;
        int r49 = 0;
        long r50 = 0L;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r8 = this;
                    r9 = r35;
                    r1 = null;
                    if (r36 == false) { $pc1 = 5; continue $sw1; }
                    r10 = new java.util.zip.CRC32();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r36 == false) { $pc1 = 8; continue $sw1; }
                    r1 = new java.util.zip.CRC32();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r11 = r1;
                    r12 = r34.FH();
                    j6(r9.aM, r12, 0, 20, r37);
                    r13 = 0;
                    r2 = r12[0] & 255;
                    r3 = (r2 >> 4) & 7;
                    r6 = r2 & 15;
                    r4 = 4;
                    r15 = 1;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if ((r2 & 128) == 0) { $pc1 = 12; continue $sw1; }
                    r5 = r8;
                    r14 = r9;
                    r16 = r12[r15] & 255;
                    r6 = ((long) ((r16 & 127) << r4)) + r6;
                    r4 = r4 + 7;
                    r15 = r15 + 1;
                    r2 = r16;
                    r13 = 0;
                    r9 = r14;
                    r8 = r5;
                    { $pc1 = 10; continue $sw1; }
                }
                case 12: {
                    if (r3 != 6) { $pc1 = 19; continue $sw1; }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r7 = r15 + 1;
                    if (((r12[r15] & 255) & 128) == 0) { $pc1 = 15; continue $sw1; }
                    r15 = r7;
                    { $pc1 = 13; continue $sw1; }
                }
                case 15: {
                    if (r36 == false) { $pc1 = 17; continue $sw1; }
                    r10.update(r12, r13, r7);
                    r11.update(r12, r13, r7);
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    r15 = r7;
                    r17 = r6;
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    r18 = r9.aM + ((long) r15);
                    r19 = r9.j3;
                    r110 = r18;
                    try {
                        r20 = r37.j6(this, r18, r19);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 116; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 120; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r36 == true) { $pc1 = 129; continue $sw1; }
                    $pc1 = 52; continue $sw1;
                }
                case 52: {
                    r21 = r19;
                    r26 = r20;
                    if (r36 == false) { $pc1 = 89; continue $sw1; }
                    try {
                        r22 = r37.VH();
                        r23 = new byte[1024];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 50; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r26 == null) { $pc1 = 58; continue $sw1; }
                    try {
                        r26.j6(r22, r23, r110, (int) r21);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 50; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r24 = r21;
                    $pc1 = 125; continue $sw1;
                }
                case 125: {
                    if (r22.finished() == true) { $pc1 = 64; continue $sw1; }
                    $pc1 = 67; continue $sw1;
                }
                case 67: {
                    r25 = r35;
                    $pc1 = 70; continue $sw1;
                }
                case 70: {
                    try {
                        Hw(r25.aM);
                        throw new java.io.EOFException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().shortCompressedStreamAt, new java.lang.Object[]{java.lang.Long.valueOf(r25.aM)}));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 85; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 87; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 85: {
                    e = e;
                    $pc1 = 118; continue $sw1;
                }
                case 118: {
                    r27 = new abcd.tD(r25);
                    r27.initCause(e);
                    throw r27;
                }
                case 87: {
                    e = e;
                    $pc1 = 122; continue $sw1;
                }
                case 122: {
                    Hw(r25.aM);
                    r28 = new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r25.aM), v5()}));
                    r28.initCause(e);
                    r0 = new abcd.tD(r25);
                    r0.initCause(r28);
                    throw r0;
                }
                case 72: {
                    e = e;
                    $pc1 = 74; continue $sw1;
                }
                case 74: {
                    e = e;
                    { $pc1 = 122; continue $sw1; }
                }
                case 64: {
                    if (r22.getBytesRead() != r24) { $pc1 = 67; continue $sw1; }
                    try {
                        r111 = r10.getValue();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 50; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r29 = r24;
                    r30 = r35;
                    $pc1 = 90; continue $sw1;
                }
                case 90: {
                    if (r26 == null) { $pc1 = 92; continue $sw1; }
                    r34.j6(r30, r17);
                    r26.j6(r34, r110, (int) r29, null);
                    return;
                }
                case 92: {
                    r31 = r17;
                    r32 = r29;
                    if (r32 > r12.length) { $pc1 = 101; continue $sw1; }
                    if (r36 == true) { $pc1 = 100; continue $sw1; }
                    r112 = r110;
                    r113 = r32;
                    r32 = r32;
                    $pc1 = 97; continue $sw1;
                }
                case 97: {
                    if (r113 <= 0) { $pc1 = 100; continue $sw1; }
                    r114 = (int) java.lang.Math.min(r113, r12.length);
                    j6(r112, r12, 0, r114, r37);
                    r33 = r114;
                    r112 = r112 + r33;
                    r32 = r32;
                    r113 = r113 - r33;
                    $pc1 = 100; continue $sw1;
                }
                case 100: {
                    r34.j6(r30, r31);
                    r34.write(r12, 0, (int) r32);
                    return;
                }
                case 101: {
                    r34.j6(r30, r31);
                    r38 = r32;
                    $pc1 = 103; continue $sw1;
                }
                case 103: {
                    if (r38 <= 0) { $pc1 = 104; continue $sw1; }
                    r115 = (int) java.lang.Math.min(r38, r12.length);
                    j6(r110, r12, 0, r115, r37);
                    if (r36 == false) { $pc1 = 114; continue $sw1; }
                    r39 = 0;
                    r11.update(r12, 0, r115);
                    $pc1 = 115; continue $sw1;
                }
                case 115: {
                    r34.write(r12, r39, r115);
                    r40 = r115;
                    r110 = r110 + r40;
                    r38 = r38 - r40;
                    { $pc1 = 103; continue $sw1; }
                }
                case 114: {
                    r39 = 0;
                    { $pc1 = 115; continue $sw1; }
                }
                case 104: {
                    if (r36 == true) { $pc1 = 106; continue $sw1; }
                    return;
                }
                case 106: {
                    if (r11.getValue() != r111) { $pc1 = 109; continue $sw1; }
                    return;
                }
                case 109: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r30.aM), v5()}));
                }
                case 76: {
                    e = e;
                    $pc1 = 49; continue $sw1;
                }
                case 49: {
                    r25 = r35;
                    $pc1 = 78; continue $sw1;
                }
                case 78: {
                    e = e;
                    $pc1 = 51; continue $sw1;
                }
                case 51: {
                    r25 = r35;
                    { $pc1 = 122; continue $sw1; }
                }
                case 58: {
                    r41 = r21;
                    r116 = r110;
                    r25 = r21;
                    $pc1 = 59; continue $sw1;
                }
                case 59: {
                    r24 = r25;
                    if (r41 <= 0) { $pc1 = 125; continue $sw1; }
                    r42 = r25;
                    try {
                        r43 = (int) java.lang.Math.min(r41, r12.length);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 85; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 87; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r210 = r41;
                    r117 = r23;
                    r44 = r22;
                    try {
                        j6(r116, r12, 0, r43, r37);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 85; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 87; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r45 = 0;
                    try {
                        r10.update(r12, 0, r43);
                        r44.setInput(r12, 0, r43);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 85; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 87; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 82; continue $sw1;
                }
                case 82: {
                    if (r44.inflate(r117, r45, r117.length) <= 0) { $pc1 = 83; continue $sw1; }
                    r45 = 0;
                    { $pc1 = 82; continue $sw1; }
                }
                case 83: {
                    r46 = r43;
                    r116 = r116 + r46;
                    r22 = r44;
                    r23 = r117;
                    r25 = r42;
                    r41 = r210 - r46;
                    { $pc1 = 59; continue $sw1; }
                }
                case 89: {
                    r29 = r21;
                    r30 = r35;
                    r111 = -1;
                    { $pc1 = 90; continue $sw1; }
                }
                case 129: {
                    $pc1 = 34; continue $sw1;
                }
                case 48: {
                    e = e;
                    $pc1 = 34; continue $sw1;
                }
                case 50: {
                    e = e;
                    { $pc1 = 51; continue $sw1; }
                }
                case 34: {
                    if (J0().FH() == false) { $pc1 = 52; continue $sw1; }
                    try {
                        r111 = J0().j6(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 50; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r20 == null) { $pc1 = 39; continue $sw1; }
                    r47 = r19;
                    try {
                        r20.j6(r10, r110, (int) r47);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 116; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 120; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 43; continue $sw1;
                }
                case 43: {
                    if (r10.getValue() != r111) { $pc1 = 45; continue $sw1; }
                    r29 = r47;
                    r26 = r20;
                    r30 = r9;
                    { $pc1 = 90; continue $sw1; }
                }
                case 45: {
                    try {
                        r8.Hw(r9.aM);
                        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r9.aM), v5()}));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 116; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 120; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 39: {
                    r47 = r19;
                    r48 = r47;
                    r211 = r110;
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    if (r48 <= 0) { $pc1 = 43; continue $sw1; }
                    try {
                        r49 = (int) java.lang.Math.min(r48, r12.length);
                        j6(r211, r12, 0, r49, r37);
                        r10.update(r12, 0, r49);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 50; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r50 = r49;
                    try {
                        r211 = r211 + r50;
                        r48 = r48 - r50;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 48; continue $sw1; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc1 = 50; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r47 = r47;
                    r20 = r20;
                    r8 = this;
                    r9 = r35;
                    $pc1 = 19; continue $sw1;
                }
                case 116: {
                    e = e;
                    r25 = r9;
                    $pc1 = 19; continue $sw1;
                }
                case 120: {
                    e = e;
                    r25 = r9;
                    { $pc1 = 122; continue $sw1; }
                }
                case 19: {
                    if (r3 != 7) { $pc1 = 26; continue $sw1; }
                    if (r36 == false) { $pc1 = 22; continue $sw1; }
                    r10.update(r12, r13, r15);
                    r11.update(r12, r13, r15);
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    r17 = r6;
                    j6(((long) r15) + r9.aM, r12, 0, 20, r37);
                    if (r36 == false) { $pc1 = 25; continue $sw1; }
                    r10.update(r12, r13, 20);
                    r11.update(r12, r13, 20);
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    r15 = r15 + 20;
                    { $pc1 = 29; continue $sw1; }
                }
                case 26: {
                    r17 = r6;
                    if (r36 == false) { $pc1 = 29; continue $sw1; }
                    r10.update(r12, r13, r15);
                    r11.update(r12, r13, r15);
                    { $pc1 = 29; continue $sw1; }
                }
                case 5: {
                    r10 = null;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private synchronized void EQ() {
        synchronized (this) {
            int r0 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        try {
                            r0 = this.tp - 1;
                            this.tp = r0;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 10; continue $sw2;
                        }
                        if (r0 == 0) { $pc2 = 6; continue $sw2; }
                        $pc2 = 8; continue $sw2;
                    }
                    case 8: {
                        return;
                    }
                    case 6: {
                        if (this.u7 != 0) { $pc2 = 8; continue $sw2; }
                        try {
                            u7();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 10; continue $sw2;
                        }
                        return;
                    }
                    case 10: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private boolean FH(long r2) {
        synchronized (this.QX) {
            abcd.DK r0 = null;
            boolean r3 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.QX;
                        if (r0 != null) { $pc3 = 6; continue $sw3; }
                        return false;
                    }
                    case 6: {
                        try {
                            r3 = r0.DW(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 10; continue $sw3;
                        }
                        return r3;
                    }
                    case 10: {
                        th = $ex3;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private void Hw(long r3) {
        synchronized (this.VH) {
            abcd.DK r0 = null;
            java.lang.Object r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = this.QX;
                        if (r0 != null) { $pc4 = 14; continue $sw4; }
                        r1 = this.VH;
                        try {
                            r0 = this.QX;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 11; continue $sw4;
                        }
                        if (r0 != null) { $pc4 = 9; continue $sw4; }
                        try {
                            r0 = new abcd.DK();
                            this.QX = r0;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 11; continue $sw4;
                        }
                        $pc4 = 9; continue $sw4;
                    }
                    case 9: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 11; continue $sw4;
                        }
                        $pc4 = 14; continue $sw4;
                    }
                    case 11: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 14: {
                        try {
                            r0.j6(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 18; continue $sw4;
                        }
                        return;
                    }
                    case 18: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private synchronized abcd.AbstractbH J0() {
        synchronized (this) {
            abcd.AbstractbH r0 = null;
            abcd.AbstractbH r1 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        $pc5 = 4; continue $sw5;
                    }
                    case 24: {
                        th = $ex5;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.J8 == null) { $pc5 = 6; continue $sw5; }
                        $pc5 = 21; continue $sw5;
                    }
                    case 21: {
                        try {
                            r0 = this.J8;
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 24; continue $sw5;
                        }
                        return r0;
                    }
                    case 6: {
                        if (this.we == true) { $pc5 = 20; continue $sw5; }
                        try {
                            r1 = abcd.AbstractbH.j6(this.DW);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                            $pc5 = 24; continue $sw5;
                        }
                        if (this.J0 != null) { $pc5 = 11; continue $sw5; }
                        try {
                            this.J0 = r1.j6;
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                            $pc5 = 24; continue $sw5;
                        }
                        $pc5 = 12; continue $sw5;
                    }
                    case 12: {
                        try {
                            this.J8 = r1;
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                            $pc5 = 24; continue $sw5;
                        }
                        { $pc5 = 21; continue $sw5; }
                    }
                    case 11: {
                        if (java.util.Arrays.equals(this.J0, r1.j6) == true) { $pc5 = 12; continue $sw5; }
                        try {
                            throw new abcd.mD(org.eclipse.jgit.JGitText.j6().packChecksumMismatch);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            if ($t instanceof java.io.IOException) { $pc5 = 15; continue $sw5; }
                            $pc5 = 24; continue $sw5;
                        }
                    }
                    case 15: {
                        e = $ex5;
                        try {
                            this.we = true;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 24; continue $sw5;
                        }
                    }
                    case 20: {
                        try {
                            throw new abcd.lD(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 24; continue $sw5;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private void J8() {
        abcd.AbstractbH r0 = null;
        byte[] r2 = null;
        long r5 = 0L;
        long r7 = 0L;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = J0();
                    r2 = new byte[20];
                    this.Zo.seek(0);
                    this.Zo.readFully(r2, 0, 12);
                    if (abcd.IK.j6(r2, 0, abcd.hE.v5) != 4) { $pc6 = 21; continue $sw6; }
                    r5 = abcd.FK.FH(r2, 4);
                    r7 = abcd.FK.FH(r2, 8);
                    if (r5 == 2) { $pc6 = 12; continue $sw6; }
                    if (r5 == 3) { $pc6 = 12; continue $sw6; }
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedPackVersion, new java.lang.Object[]{java.lang.Long.valueOf(r5)}));
                }
                case 12: {
                    if (r7 != r0.j6()) { $pc6 = 19; continue $sw6; }
                    this.Zo.seek(this.gn - 20);
                    this.Zo.readFully(r2, 0, 20);
                    if (java.util.Arrays.equals(r2, this.J0) == false) { $pc6 = 17; continue $sw6; }
                    return;
                }
                case 17: {
                    throw new abcd.mD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packObjectCountMismatch, new java.lang.Object[]{abcd.yE.j6(r2).we(), abcd.yE.j6(r0.j6).we(), v5()}));
                }
                case 19: {
                    throw new abcd.mD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packObjectCountMismatch, new java.lang.Object[]{java.lang.Long.valueOf(r7), java.lang.Long.valueOf(r0.j6()), v5()}));
                }
                case 21: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().notAPACKFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Ws() {
        this.u7 = 0;
        this.tp = 0;
        this.we = true;
        u7();
    }

    static int j6(abcd.aH r0) {
        return r0.EQ;
    }

    private long j6(abcd.yE r6) {
        long r0 = 0L;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = J0().DW(r6);
                    if (r0 < 0) { $pc7 = 6; continue $sw7; }
                    return r0;
                }
                case 6: {
                    throw new abcd.fD(r6, org.eclipse.jgit.JGitText.j6().missingDeltaBase);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(long r8, byte[] r10, int r11, int r12, abcd.wH r13) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r13.j6(this, r8, r10, r11, r12) != r12) { $pc8 = 6; continue $sw8; }
                    return;
                }
                case 6: {
                    throw new java.io.EOFException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private synchronized void j6(abcd.MH r3) {
        synchronized (this) {
            int r0 = 0;
            abcd.tD r1 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        try {
                            r0 = this.tp + 1;
                            this.tp = r0;
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 14; continue $sw9;
                        }
                        if (r0 == 1) { $pc9 = 6; continue $sw9; }
                        $pc9 = 12; continue $sw9;
                    }
                    case 12: {
                        return;
                    }
                    case 6: {
                        if (this.u7 != 0) { $pc9 = 12; continue $sw9; }
                        try {
                            tp();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            if ($t instanceof java.io.IOException) { $pc9 = 9; continue $sw9; }
                            $pc9 = 14; continue $sw9;
                        }
                        return;
                    }
                    case 9: {
                        e = $ex9;
                        try {
                            r1 = new abcd.tD(r3);
                            r1.initCause(e);
                            throw r1;
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 14; continue $sw9;
                        }
                    }
                    case 14: {
                        th = $ex9;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private final byte[] j6(long r8, int r10, abcd.wH r11) {
        byte[] r6 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    try {
                        r6 = new byte[r10];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc10 = 8; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r11.j6(this, r8, r6, 0) != r10) { $pc10 = 7; continue $sw10; }
                    return r6;
                }
                case 7: {
                    throw new java.io.EOFException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().shortCompressedStreamAt, new java.lang.Object[]{java.lang.Long.valueOf(r8)}));
                }
                case 8: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void tp() {
        synchronized (this.VH) {
            java.lang.Object r0 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = 3;
            $sw11: while (true) {
                switch ($pc11) {
                    case 20: {
                        e = $ex11;
                        Ws();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 14: {
                        e = $ex11;
                        Ws();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 17: {
                        e = $ex11;
                        Ws();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    }
                    case 3: {
                        if (this.we == true) { $pc11 = 13; continue $sw11; }
                        try {
                            r0 = this.VH;
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            if ($t instanceof java.lang.Error) { $pc11 = 14; continue $sw11; }
                            if ($t instanceof java.lang.RuntimeException) { $pc11 = 17; continue $sw11; }
                            if ($t instanceof java.io.IOException) { $pc11 = 20; continue $sw11; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            this.Zo = new java.io.RandomAccessFile(this.FH, "r");
                            this.gn = this.Zo.length();
                            J8();
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 9; continue $sw11;
                        }
                        return;
                    }
                    case 9: {
                        th = $ex11;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            if ($t instanceof java.lang.Error) { $pc11 = 14; continue $sw11; }
                            if ($t instanceof java.lang.RuntimeException) { $pc11 = 17; continue $sw11; }
                            if ($t instanceof java.io.IOException) { $pc11 = 20; continue $sw11; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 13: {
                        try {
                            throw new abcd.lD(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            if ($t instanceof java.lang.Error) { $pc11 = 14; continue $sw11; }
                            if ($t instanceof java.lang.RuntimeException) { $pc11 = 17; continue $sw11; }
                            if ($t instanceof java.io.IOException) { $pc11 = 20; continue $sw11; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private void u7() {
        synchronized (this.VH) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = -1;
            $sw12: while (true) {
                switch ($pc12) {
                    case -1: {
                        r0 = this.VH;
                        $pc12 = 5; continue $sw12;
                    }
                    case 11: {
                        th = $ex12;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.Zo != null) { $pc12 = 17; continue $sw12; }
                        $pc12 = 9; continue $sw12;
                    }
                    case 9: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 11; continue $sw12;
                        }
                        return;
                    }
                    case 17: {
                        try {
                            this.Zo.close();
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            if ($t instanceof java.io.IOException) { $pc12 = 14; continue $sw12; }
                            $pc12 = 11; continue $sw12;
                        }
                        $pc12 = 8; continue $sw12;
                    }
                    case 8: {
                        try {
                            this.Zo = null;
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 11; continue $sw12;
                        }
                        { $pc12 = 9; continue $sw12; }
                    }
                    case 14: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private synchronized abcd.lH we() {
        synchronized (this) {
            abcd.lH r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex13 = null;
            int $pc13 = -1;
            $sw13: while (true) {
                switch ($pc13) {
                    case -1: {
                        $pc13 = 4; continue $sw13;
                    }
                    case 9: {
                        th = $ex13;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.Ws != null) { $pc13 = 6; continue $sw13; }
                        try {
                            this.Ws = new abcd.lH(J0());
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 9; continue $sw13;
                        }
                        $pc13 = 6; continue $sw13;
                    }
                    case 6: {
                        try {
                            r0 = this.Ws;
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 9; continue $sw13;
                        }
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    long DW(abcd.wH r17, long r18) {
        byte[] r8 = null;
        int r1 = 0;
        int r2 = 0;
        long r10 = 0L;
        int r4 = 0;
        int r5 = 0;
        int r3 = 0;
        int r6 = 0;
        long r7 = 0L;
        int r9 = 0;
        int r11 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r8 = r17.j6;
                    j6(r18, r8, 0, 20, r17);
                    r1 = r8[0] & 255;
                    r2 = (r1 >> 4) & 7;
                    r10 = r1 & 15;
                    r4 = 1;
                    r5 = 4;
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    if ((r1 & 128) == 0) { $pc14 = 5; continue $sw14; }
                    r3 = r4 + 1;
                    r6 = r8[r4] & 255;
                    r10 = r10 + ((long) ((r6 & 127) << r5));
                    r5 = r5 + 7;
                    r4 = r3;
                    r1 = r6;
                    { $pc14 = 4; continue $sw14; }
                }
                case 5: {
                    if (r2 == 1) { $pc14 = 28; continue $sw14; }
                    if (r2 == 2) { $pc14 = 28; continue $sw14; }
                    if (r2 == 3) { $pc14 = 28; continue $sw14; }
                    if (r2 == 4) { $pc14 = 28; continue $sw14; }
                    if (r2 == 6) { $pc14 = 18; continue $sw14; }
                    if (r2 != 7) { $pc14 = 17; continue $sw14; }
                    r7 = (r18 + ((long) r4)) + 20;
                    $pc14 = 30; continue $sw14;
                }
                case 30: {
                    return abcd.AH.j6(j6(r17, r7));
                }
                case 25: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r18), v5()}));
                }
                case 17: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));
                }
                case 18: {
                    r9 = r4 + 1;
                    r11 = r8[r4] & 255;
                    $pc14 = 20; continue $sw14;
                }
                case 20: {
                    if ((r11 & 128) == 0) { $pc14 = 21; continue $sw14; }
                    r11 = r8[r9] & 255;
                    r9 = r9 + 1;
                    { $pc14 = 20; continue $sw14; }
                }
                case 21: {
                    r7 = r18 + ((long) r9);
                    $pc14 = 28; continue $sw14;
                }
                case 28: {
                    return r10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    long DW(abcd.wH r5, abcd.YD r6) {
        long r0 = 0L;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = J0().DW(r6);
                    if (0 < r0) { $pc15 = 7; continue $sw15; }
                    return -1;
                }
                case 7: {
                    return DW(r5, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.AG DW(long r7, int r9) {
        synchronized (this.VH) {
            java.lang.Object r0 = null;
            byte[] r1 = null;
            abcd.AG r10 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex16 = null;
            int $pc16 = -1;
            $sw16: while (true) {
                switch ($pc16) {
                    case -1: {
                        r0 = this.VH;
                        $pc16 = 5; continue $sw16;
                    }
                    case 10: {
                        th = $ex16;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.gn >= (((long) r9) + r7)) { $pc16 = 7; continue $sw16; }
                        try {
                            r9 = (int) (this.gn - r7);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 10; continue $sw16;
                        }
                        $pc16 = 7; continue $sw16;
                    }
                    case 7: {
                        try {
                            r1 = new byte[r9];
                            this.Zo.seek(r7);
                            this.Zo.readFully(r1, 0, r9);
                            r10 = new abcd.AG(this, r7, r1);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 10; continue $sw16;
                        }
                        return r10;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public void DW() {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex17 = null;
            int $pc17 = -1;
            $sw17: while (true) {
                switch ($pc17) {
                    case -1: {
                        abcd.uH.j6(this);
                        try {
                            this.J8 = null;
                            this.Ws = null;
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 8; continue $sw17;
                        }
                        return;
                    }
                    case 8: {
                        th = $ex17;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    int FH(abcd.wH r12, long r13) {
        byte[] r7 = null;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        int r0 = 0;
        int r3 = 0;
        long r5 = 0L;
        int r6 = 0;
        int r8 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r7 = r12.j6;
                    $pc18 = 3; continue $sw18;
                }
                case 3: {
                    j6(r13, r7, 0, 20, r12);
                    r1 = r7[0] & 255;
                    r2 = (r1 >> 4) & 7;
                    r4 = 1;
                    if (r2 == 1) { $pc18 = 28; continue $sw18; }
                    if (r2 == 2) { $pc18 = 28; continue $sw18; }
                    if (r2 == 3) { $pc18 = 28; continue $sw18; }
                    if (r2 == 4) { $pc18 = 28; continue $sw18; }
                    if (r2 != 6) { $pc18 = 13; continue $sw18; }
                    $pc18 = 21; continue $sw18;
                }
                case 21: {
                    if ((r1 & 128) == 0) { $pc18 = 22; continue $sw18; }
                    r1 = r7[r4] & 255;
                    r4 = r4 + 1;
                    { $pc18 = 21; continue $sw18; }
                }
                case 22: {
                    r0 = r4 + 1;
                    r3 = r7[r4] & 255;
                    r5 = r3 & 127;
                    $pc18 = 24; continue $sw18;
                }
                case 24: {
                    if ((r3 & 128) == 0) { $pc18 = 25; continue $sw18; }
                    r6 = r0 + 1;
                    r8 = r7[r0] & 255;
                    r5 = ((r5 + 1) << 7) + ((long) (r8 & 127));
                    r3 = r8;
                    r0 = r6;
                    { $pc18 = 24; continue $sw18; }
                }
                case 25: {
                    r13 = r13 - r5;
                    { $pc18 = 3; continue $sw18; }
                }
                case 13: {
                    if (r2 != 7) { $pc18 = 19; continue $sw18; }
                    $pc18 = 15; continue $sw18;
                }
                case 15: {
                    if ((r1 & 128) == 0) { $pc18 = 16; continue $sw18; }
                    r1 = r7[r4] & 255;
                    r4 = r4 + 1;
                    { $pc18 = 15; continue $sw18; }
                }
                case 16: {
                    j6(r13 + ((long) r4), r7, 0, 20, r12);
                    r13 = j6(abcd.yE.j6(r7));
                    { $pc18 = 3; continue $sw18; }
                }
                case 19: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));
                }
                case 28: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.SG FH(abcd.wH r14, abcd.YD r15) {
        long r8 = 0L;
        byte[] r16 = null;
        int r1 = 0;
        int r2 = 0;
        int r5 = 0;
        int r3 = 0;
        int r6 = 0;
        long r7 = 0L;
        long r0 = 0L;
        int r17 = 0;
        int r4 = 0;
        long r9 = 0L;
        int r10 = 0;
        int r18 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r8 = J0().DW(r15);
                    if (r8 >= 0) { $pc19 = 6; continue $sw19; }
                    return null;
                }
                case 6: {
                    r16 = r14.j6;
                    j6(r8, r16, 0, 20, r14);
                    r1 = r16[0] & 255;
                    r2 = (r1 >> 4) & 7;
                    r5 = 1;
                    $pc19 = 8; continue $sw19;
                }
                case 8: {
                    if ((r1 & 128) == 0) { $pc19 = 9; continue $sw19; }
                    r3 = r5 + 1;
                    r6 = r16[r5] & 255;
                    r5 = r3;
                    r1 = r6;
                    { $pc19 = 8; continue $sw19; }
                }
                case 9: {
                    r7 = DW(r8) - r8;
                    if (r2 == 1) { $pc19 = 31; continue $sw19; }
                    if (r2 == 2) { $pc19 = 31; continue $sw19; }
                    if (r2 == 3) { $pc19 = 31; continue $sw19; }
                    if (r2 == 4) { $pc19 = 31; continue $sw19; }
                    if (r2 == 6) { $pc19 = 24; continue $sw19; }
                    if (r2 != 7) { $pc19 = 23; continue $sw19; }
                    r0 = r5;
                    j6(r8 + r0, r16, 0, 20, r14);
                    return abcd.SG.j6(this, r8, (r7 - r0) - 20, abcd.yE.j6(r16));
                }
                case 23: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));
                }
                case 24: {
                    r17 = r5 + 1;
                    r4 = r16[r5] & 255;
                    r9 = r4 & 127;
                    $pc19 = 26; continue $sw19;
                }
                case 26: {
                    if ((r4 & 128) == 0) { $pc19 = 28; continue $sw19; }
                    r10 = r17 + 1;
                    r18 = r16[r17] & 255;
                    r9 = ((r9 + 1) << 7) + ((long) (r18 & 127));
                    r4 = r18;
                    r17 = r10;
                    { $pc19 = 26; continue $sw19; }
                }
                case 28: {
                    return abcd.SG.j6(this, r8, r7 - ((long) r17), r8 - r9);
                }
                case 31: {
                    return abcd.SG.j6(this, r8, r7 - ((long) r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized boolean FH() {
        synchronized (this) {
            boolean r1 = false;
            int r0 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex20 = null;
            int $pc20 = -1;
            $sw20: while (true) {
                switch ($pc20) {
                    case -1: {
                        r1 = true;
                        try {
                            r0 = this.u7 - 1;
                            this.u7 = r0;
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 13; continue $sw20;
                        }
                        if (r0 == 0) { $pc20 = 7; continue $sw20; }
                        r1 = false;
                        $pc20 = 7; continue $sw20;
                    }
                    case 7: {
                        if (r1 == true) { $pc20 = 9; continue $sw20; }
                        $pc20 = 11; continue $sw20;
                    }
                    case 11: {
                        return r1;
                    }
                    case 9: {
                        if (this.tp != 0) { $pc20 = 11; continue $sw20; }
                        try {
                            u7();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 13; continue $sw20;
                        }
                        throw new java.lang.IllegalStateException();
                    }
                    case 13: {
                        th = $ex20;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    long Hw() {
        return J0().j6();
    }

    abcd.FE Hw(abcd.wH r26, long r27) {
        abcd.aH r10 = null;
        int r11 = 0;
        char r12 = 0;
        byte[] r8 = null;
        byte[] r14 = null;
        long r23 = 0L;
        abcd.aH.a r16 = null;
        int r1 = 0;
        int r2 = 0;
        long r4 = 0L;
        int r7 = 0;
        int r15 = 0;
        long r13 = 0L;
        int r3 = 0;
        int r5 = 0;
        long r9 = 0L;
        long r6 = 0L;
        long r17 = 0L;
        abcd.aH.a r18 = null;
        abcd.EG.a r19 = null;
        int r20 = 0;
        int r21 = 0;
        boolean r22 = false;
        boolean r110 = false;
        abcd.aH.a r24 = null;
        long r25 = 0L;
        byte[] r28 = null;
        long r29 = 0L;
        byte[] r30 = null;
        abcd.YC r31 = null;
        long r111 = 0L;
        int r32 = 0;
        int r33 = 0;
        long r34 = 0L;
        int r210 = 0;
        abcd.EG.a r35 = null;
        long r112 = 0L;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r10 = this;
                    r11 = 2;
                    r12 = 0;
                    try {
                        r8 = r26.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 80; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r14 = null;
                    r23 = r27;
                    r16 = null;
                    $pc21 = 86; continue $sw21;
                }
                case 86: {
                    try {
                        j6(r23, r8, 0, 20, r26);
                        r1 = r8[r12] & 255;
                        r2 = (r1 >> 4) & 7;
                        r4 = r1 & 15;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r7 = 4;
                    r15 = 1;
                    $pc21 = 8; continue $sw21;
                }
                case 8: {
                    if ((r1 & 128) == 0) { $pc21 = 9; continue $sw21; }
                    r13 = r4;
                    try {
                        r3 = r15 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r5 = r8[r15] & 255;
                    r9 = ((long) ((r5 & 127) << r7)) + r13;
                    r7 = r7 + 7;
                    r15 = r3;
                    r1 = r5;
                    r4 = r9;
                    r11 = 2;
                    r10 = this;
                    { $pc21 = 8; continue $sw21; }
                }
                case 9: {
                    if (r2 == 1) { $pc21 = 37; continue $sw21; }
                    if (r2 == r11) { $pc21 = 37; continue $sw21; }
                    if (r2 == 3) { $pc21 = 37; continue $sw21; }
                    if (r2 == 4) { $pc21 = 37; continue $sw21; }
                    if (r2 == 6) { $pc21 = 25; continue $sw21; }
                    if (r2 != 7) { $pc21 = 24; continue $sw21; }
                    r6 = r4;
                    try {
                        j6(r23 + ((long) r15), r8, 0, 20, r26);
                        r17 = r10.j6(abcd.yE.j6(r8));
                        r18 = new abcd.aH.a(r16, r23, (int) r6, r15 + 20, r17);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6 != r18.FH) { $pc21 = 30; continue $sw21; }
                    try {
                        r19 = r26.v5().j6(r10, r17);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r19 == null) { $pc21 = 35; continue $sw21; }
                    try {
                        r20 = r19.DW;
                        r14 = r19.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc21 = 34; continue $sw21;
                }
                case 34: {
                    r21 = r20;
                    r22 = true;
                    $pc21 = 42; continue $sw21;
                }
                case 42: {
                    if (r14 == null) { $pc21 = 44; continue $sw21; }
                    r110 = r22;
                    r24 = r18;
                    $pc21 = 46; continue $sw21;
                }
                case 46: {
                    if (r110 == false) { $pc21 = 49; continue $sw21; }
                    r110 = false;
                    $pc21 = 51; continue $sw21;
                }
                case 51: {
                    try {
                        r25 = r24.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r28 = r10.j6(((long) r24.Hw) + r25, r24.FH, r26);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 69; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r28 == null) { $pc21 = 55; continue $sw21; }
                    try {
                        r29 = abcd.AH.j6(r28);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 69; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (2147483647L <= r29) { $pc21 = 59; continue $sw21; }
                    try {
                        r30 = new byte[(int) r29];
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc21 = 67; continue $sw21; }
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 69; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        abcd.AH.j6(r14, r28, r30);
                        r24 = r24.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 69; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r24 == null) { $pc21 = 65; continue $sw21; }
                    r14 = r30;
                    { $pc21 = 46; continue $sw21; }
                }
                case 65: {
                    return new abcd.FE.a(r21, r30);
                }
                case 68: {
                    return r24.j6(r10, r26);
                }
                case 59: {
                    return r24.j6(r10, r26);
                }
                case 55: {
                    return r24.j6(r10, r26);
                }
                case 69: {
                    e = e;
                    r23 = r25;
                    $pc21 = 82; continue $sw21;
                }
                case 82: {
                    r31 = new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r23), v5()}));
                    r31.initCause(e);
                    throw r31;
                }
                case 49: {
                    if (r24.j6 != null) { $pc21 = 51; continue $sw21; }
                    try {
                        r26.v5().j6(this, r24.v5, r14, r21);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc21 = 51; continue $sw21; }
                }
                case 44: {
                    return r18.j6(r10, r26);
                }
                case 35: {
                    r23 = r17;
                    r16 = r18;
                    r11 = 2;
                    r12 = 0;
                    $pc21 = 30; continue $sw21;
                }
                case 30: {
                    r22 = false;
                    r21 = -1;
                    { $pc21 = 42; continue $sw21; }
                }
                case 24: {
                    try {
                        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 25: {
                    r111 = r4;
                    try {
                        r32 = r15 + 1;
                        r33 = r8[r15] & 255;
                        r34 = r33 & 127;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc21 = 26; continue $sw21;
                }
                case 26: {
                    r210 = r32;
                    if ((r33 & 128) == 0) { $pc21 = 28; continue $sw21; }
                    try {
                        r32 = r210 + 1;
                        r33 = r8[r210] & 255;
                        r34 = ((r34 + 1) << 7) + ((long) (r33 & 127));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc21 = 26; continue $sw21; }
                }
                case 28: {
                    try {
                        r17 = r23 - r34;
                        r18 = new abcd.aH.a(r16, r23, (int) r111, r210, r17);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r111 != r18.FH) { $pc21 = 30; continue $sw21; }
                    try {
                        r35 = r26.v5().j6(r10, r17);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r35 == null) { $pc21 = 35; continue $sw21; }
                    try {
                        r20 = r35.DW;
                        r14 = r35.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc21 = 37; continue $sw21;
                }
                case 37: {
                    r112 = r4;
                    if (r112 >= r26.Zo()) { $pc21 = 40; continue $sw21; }
                    try {
                        r14 = r10.j6(r23 + ((long) r15), (int) r112, r26);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.util.zip.DataFormatException) { $pc21 = 78; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc21 = 40; continue $sw21;
                }
                case 40: {
                    if (r16 == null) { $pc21 = 71; continue $sw21; }
                    r21 = r2;
                    r18 = r16;
                    r22 = false;
                    { $pc21 = 42; continue $sw21; }
                }
                case 71: {
                    if (r14 == null) { $pc21 = 75; continue $sw21; }
                    return new abcd.FE.a(r2, r14);
                }
                case 75: {
                    return new abcd.PG(r2, r112, r23, r15, this, r26.v5);
                }
                case 78: {
                    e = e;
                    throw new java.lang.IllegalStateException();
                }
                case 80: {
                    e = e;
                    r23 = r27;
                    { $pc21 = 82; continue $sw21; }
                }
                case 67: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean VH() {
        return this.we;
    }

    public java.lang.String Zo() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc22 = 11; continue $sw22; }
                    r0 = v5().getName();
                    if (r0.startsWith("pack-") == false) { $pc22 = 8; continue $sw22; }
                    r0 = r0.substring(5);
                    $pc22 = 8; continue $sw22;
                }
                case 8: {
                    if (r0.endsWith(".pack") == false) { $pc22 = 10; continue $sw22; }
                    r0 = r0.substring(0, r0.length() - 5);
                    $pc22 = 10; continue $sw22;
                }
                case 10: {
                    this.Hw = r0;
                    $pc22 = 11; continue $sw22;
                }
                case 11: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void gn() {
        this.we = true;
    }

    @Override
    public java.util.Iterator<abcd.AbstractbH.b> iterator() {
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    return J0().iterator();
                }
                case 5: {
                    return java.util.Collections.emptyList().iterator();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.CG j6(long r9, int r11) {
        synchronized (this.VH) {
            java.lang.Object r0 = null;
            java.nio.MappedByteBuffer r12 = null;
            abcd.AG r1 = null;
            abcd.BG r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex24 = null;
            int $pc24 = -1;
            $sw24: while (true) {
                switch ($pc24) {
                    case -1: {
                        r0 = this.VH;
                        $pc24 = 5; continue $sw24;
                    }
                    case 19: {
                        th = $ex24;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 5: {
                        if (this.gn < (((long) r11) + r9)) { $pc24 = 7; continue $sw24; }
                        $pc24 = 23; continue $sw24;
                    }
                    case 23: {
                        try {
                            r12 = this.Zo.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, r9, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex24 = $t;
                            if ($t instanceof java.io.IOException) { $pc24 = 10; continue $sw24; }
                            $pc24 = 19; continue $sw24;
                        }
                        $pc24 = 12; continue $sw24;
                    }
                    case 12: {
                        if (r12.hasArray() == false) { $pc24 = 16; continue $sw24; }
                        try {
                            r1 = new abcd.AG(this, r9, r12.array());
                        } catch (java.lang.Throwable $t) {
                            $ex24 = $t;
                            $pc24 = 19; continue $sw24;
                        }
                        return r1;
                    }
                    case 16: {
                        try {
                            r2 = new abcd.BG(this, r9, r12);
                        } catch (java.lang.Throwable $t) {
                            $ex24 = $t;
                            $pc24 = 19; continue $sw24;
                        }
                        return r2;
                    }
                    case 10: {
                        try {
                            java.lang.System.gc();
                            java.lang.System.runFinalization();
                            r12 = this.Zo.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, r9, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex24 = $t;
                            $pc24 = 19; continue $sw24;
                        }
                        { $pc24 = 12; continue $sw24; }
                    }
                    case 7: {
                        r11 = (int) (this.gn - r9);
                        { $pc24 = 23; continue $sw24; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    abcd.FE j6(abcd.wH r5, abcd.YD r6) {
        long r0 = 0L;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r0 = J0().DW(r6);
                    if (0 < r0) { $pc25 = 5; continue $sw25; }
                    $pc25 = 7; continue $sw25;
                }
                case 7: {
                    return null;
                }
                case 5: {
                    if (FH(r0) == true) { $pc25 = 7; continue $sw25; }
                    return Hw(r5, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.yE j6(long r2) {
        return we().j6(r2);
    }

    final void j6(abcd.OH r1, abcd.TG r2, boolean r3, abcd.wH r4) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    j6(r2);
                    try {
                        DW(r1, r2, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 6; continue $sw26;
                    }
                    EQ();
                    return;
                }
                case 6: {
                    th = $ex26;
                    EQ();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.OH r9, boolean r10, abcd.wH r11) {
        r11.j6(this, 0);
        r11.j6(this, this.gn, r10, r9);
    }

    void j6(java.util.Set<abcd.yE> r2, abcd.WD r3, int r4) {
        J0().j6(r2, r3, r4);
    }

    synchronized boolean j6() {
        synchronized (this) {
            int r0 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex27 = null;
            int $pc27 = -1;
            $sw27: while (true) {
                switch ($pc27) {
                    case -1: {
                        try {
                            r0 = this.u7 + 1;
                            this.u7 = r0;
                        } catch (java.lang.Throwable $t) {
                            $ex27 = $t;
                            $pc27 = 13; continue $sw27;
                        }
                        if (r0 != 1) { $pc27 = 11; continue $sw27; }
                        if (this.tp != 0) { $pc27 = 8; continue $sw27; }
                        try {
                            tp();
                        } catch (java.lang.Throwable $t) {
                            $ex27 = $t;
                            $pc27 = 13; continue $sw27;
                        }
                        $pc27 = 8; continue $sw27;
                    }
                    case 8: {
                        return true;
                    }
                    case 11: {
                        return false;
                    }
                    case 13: {
                        th = $ex27;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public boolean j6(abcd.YD r5) {
        long r0 = 0L;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    r0 = J0().DW(r5);
                    if (0 < r0) { $pc28 = 5; continue $sw28; }
                    return false;
                }
                case 5: {
                    if (FH(r0) == true) { $pc28 = 10; continue $sw28; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    byte[] j6(abcd.wH r8, long r9) {
        byte[] r0 = new byte[18];
        r8.j6(this, r9, r0, 0);
        return r0;
    }

    public java.io.File v5() {
        return this.FH;
    }
}
