package abcd;

public abstract class UE {
    private static final abcd.HD j6 = null;
    private final java.util.concurrent.atomic.AtomicInteger DW;
    private final java.io.File FH;
    private final abcd.AbstractpK Hw;
    private final java.io.File VH;
    private final java.io.File Zo;
    private final abcd.HD v5;

    static {
        j6 = new abcd.HD();
    }

    protected UE(abcd.bE r3) {
        this.DW = new java.util.concurrent.atomic.AtomicInteger(1);
        this.v5 = new abcd.HD();
        this.FH = r3.v5();
        this.Hw = r3.Hw();
        this.Zo = r3.gn();
        this.VH = r3.Zo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [abcd.YD] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    private abcd.yE DW(abcd.qG r13, java.lang.String r14) {
        char[] r0 = null;
        abcd.AbstractiG r4 = null;
        int r3 = 0;
        char r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.lang.String r8 = null;
        abcd.ME r9 = null;
        abcd.AbstractiG r10 = null;
        int r11 = 0;
        char r12 = 0;
        abcd.AbstractiG r15 = null;
        abcd.dG r16 = null;
        abcd.dG r17 = null;
        int r18 = 0;
        int r19 = 0;
        abcd.dG r20 = null;
        int r21 = 0;
        int r22 = 0;
        java.lang.String r23 = null;
        abcd.AbstractiG r24 = null;
        abcd.dG r25 = null;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        abcd.dG r29 = null;
        abcd.mG r110 = null;
        abcd.YJ r111 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r14.toCharArray();
                    r4 = null;
                    r3 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r3 >= r0.length) { $pc0 = 5; continue $sw0; }
                    r5 = r0[r3];
                    if (r5 == ':') { $pc0 = 139; continue $sw0; }
                    if (r5 != '@') { $pc0 = 14; continue $sw0; }
                    r6 = r3 + 2;
                    r7 = r6;
                    $pc0 = 124; continue $sw0;
                }
                case 124: {
                    if (r7 >= r0.length) { $pc0 = 125; continue $sw0; }
                    if (r0[r7] == '}') { $pc0 = 128; continue $sw0; }
                    r7 = r7 + 1;
                    { $pc0 = 124; continue $sw0; }
                }
                case 128: {
                    r8 = new java.lang.String(r0, r6, (r7 - r3) - 2);
                    $pc0 = 129; continue $sw0;
                }
                case 129: {
                    if (r8 == null) { $pc0 = 136; continue $sw0; }
                    r9 = we().j6(new java.lang.String(r0, 0, r3));
                    if (r9 == null) { $pc0 = 132; continue $sw0; }
                    r10 = j6(r13, r9, r8);
                    $pc0 = 134; continue $sw0;
                }
                case 134: {
                    r4 = r10;
                    $pc0 = 135; continue $sw0;
                }
                case 135: {
                    r3 = r7;
                    $pc0 = 137; continue $sw0;
                }
                case 137: {
                    r3 = r3 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 132: {
                    return null;
                }
                case 136: {
                    r3 = r7 - 1;
                    { $pc0 = 137; continue $sw0; }
                }
                case 125: {
                    r8 = null;
                    { $pc0 = 129; continue $sw0; }
                }
                case 14: {
                    if (r5 != '^') { $pc0 = 16; continue $sw0; }
                    if (r4 != null) { $pc0 = 54; continue $sw0; }
                    r4 = j6(r13, new java.lang.String(r0, 0, r3));
                    if (r4 != null) { $pc0 = 54; continue $sw0; }
                    return null;
                }
                case 54: {
                    r11 = r3 + 1;
                    if (r11 >= r0.length) { $pc0 = 114; continue $sw0; }
                    r12 = r0[r11];
                    if (r12 == '{') { $pc0 = 85; continue $sw0; }
                    switch(r12) {
                        case 48: { $pc0 = 67; continue $sw0; }
                        case 49: { $pc0 = 67; continue $sw0; }
                        case 50: { $pc0 = 67; continue $sw0; }
                        case 51: { $pc0 = 67; continue $sw0; }
                        case 52: { $pc0 = 67; continue $sw0; }
                        case 53: { $pc0 = 67; continue $sw0; }
                        case 54: { $pc0 = 67; continue $sw0; }
                        case 55: { $pc0 = 67; continue $sw0; }
                        case 56: { $pc0 = 67; continue $sw0; }
                        case 57: { $pc0 = 67; continue $sw0; }
                        default: { $pc0 = 59; continue $sw0; }
                    };
                }
                case 59: {
                    r15 = r13.Zo(r4);
                    if ((r15 instanceof abcd.dG) == false) { $pc0 = 66; continue $sw0; }
                    r16 = (abcd.dG) r15;
                    if (r16.lg() == 0) { $pc0 = 118; continue $sw0; }
                    r4 = r16.DW(0);
                    $pc0 = 118; continue $sw0;
                }
                case 118: {
                    r4 = null;
                    { $pc0 = 137; continue $sw0; }
                }
                case 66: {
                    throw new abcd.ZC(r15, "commit");
                }
                case 67: {
                    r17 = r13.VH(r4);
                    r18 = r11;
                    $pc0 = 69; continue $sw0;
                }
                case 69: {
                    if (r18 >= r0.length) { $pc0 = 161; continue $sw0; }
                    if (java.lang.Character.isDigit(r0[r18]) == false) { $pc0 = 161; continue $sw0; }
                    r18 = r18 + 1;
                    $pc0 = 161; continue $sw0;
                }
                case 161: {
                    try {
                        r19 = java.lang.Integer.parseInt(new java.lang.String(r0, r11, (r18 - r3) - 1));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc0 = 82; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r19 != 0) { $pc0 = 77; continue $sw0; }
                    r20 = r17;
                    $pc0 = 81; continue $sw0;
                }
                case 81: {
                    r21 = r18 - 1;
                    r4 = r20;
                    r3 = r21;
                    { $pc0 = 137; continue $sw0; }
                }
                case 77: {
                    if (r19 <= r17.lg()) { $pc0 = 79; continue $sw0; }
                    r20 = null;
                    { $pc0 = 81; continue $sw0; }
                }
                case 79: {
                    r20 = r17.DW(r19 - 1);
                    $pc0 = 83; continue $sw0;
                }
                case 83: {
                    throw new abcd.rD(org.eclipse.jgit.JGitText.j6().invalidCommitParentNumber, r14);
                }
                case 85: {
                    r22 = r3 + 2;
                    r7 = r22;
                    $pc0 = 87; continue $sw0;
                }
                case 87: {
                    if (r7 >= r0.length) { $pc0 = 88; continue $sw0; }
                    if (r0[r7] == '}') { $pc0 = 91; continue $sw0; }
                    r7 = r7 + 1;
                    { $pc0 = 87; continue $sw0; }
                }
                case 91: {
                    r23 = new java.lang.String(r0, r22, (r7 - r3) - 2);
                    $pc0 = 92; continue $sw0;
                }
                case 92: {
                    if (r23 == null) { $pc0 = 112; continue $sw0; }
                    if (r23.equals("tree") == false) { $pc0 = 97; continue $sw0; }
                    r10 = r13.gn(r4);
                    { $pc0 = 134; continue $sw0; }
                }
                case 97: {
                    if (r23.equals("commit") == false) { $pc0 = 100; continue $sw0; }
                    r10 = r13.VH(r4);
                    { $pc0 = 134; continue $sw0; }
                }
                case 100: {
                    if (r23.equals("blob") == false) { $pc0 = 107; continue $sw0; }
                    r4 = r13.FH(r4);
                    if ((r4 instanceof abcd.cG) == true) { $pc0 = 135; continue $sw0; }
                    throw new abcd.ZC(r4, "blob");
                }
                case 107: {
                    if (r23.equals("") == false) { $pc0 = 110; continue $sw0; }
                    r10 = r13.FH(r4);
                    { $pc0 = 134; continue $sw0; }
                }
                case 110: {
                    throw new abcd.rD(r14);
                }
                case 112: {
                    throw new abcd.rD(r14);
                }
                case 88: {
                    r23 = null;
                    { $pc0 = 92; continue $sw0; }
                }
                case 114: {
                    r24 = r13.FH(r4);
                    if ((r24 instanceof abcd.dG) == false) { $pc0 = 121; continue $sw0; }
                    r25 = (abcd.dG) r24;
                    if (r25.lg() == 0) { $pc0 = 118; continue $sw0; }
                    r4 = r25.DW(0);
                    { $pc0 = 137; continue $sw0; }
                }
                case 121: {
                    throw new abcd.ZC(r24, "commit");
                }
                case 16: {
                    if (r5 == '~') { $pc0 = 21; continue $sw0; }
                    if (r4 == null) { $pc0 = 137; continue $sw0; }
                    throw new abcd.rD(r14);
                }
                case 21: {
                    if (r4 != null) { $pc0 = 25; continue $sw0; }
                    r4 = j6(r13, new java.lang.String(r0, 0, r3));
                    if (r4 != null) { $pc0 = 25; continue $sw0; }
                    return null;
                }
                case 25: {
                    r4 = r13.FH(r4);
                    if ((r4 instanceof abcd.dG) == false) { $pc0 = 49; continue $sw0; }
                    r26 = r3 + 1;
                    r7 = r26;
                    $pc0 = 29; continue $sw0;
                }
                case 29: {
                    if (r7 >= r0.length) { $pc0 = 33; continue $sw0; }
                    if (java.lang.Character.isDigit(r0[r7]) == false) { $pc0 = 33; continue $sw0; }
                    r7 = r7 + 1;
                    $pc0 = 33; continue $sw0;
                }
                case 33: {
                    r27 = r7 - r3;
                    if (r27 > 1) { $pc0 = 157; continue $sw0; }
                    r28 = 1;
                    $pc0 = 41; continue $sw0;
                }
                case 41: {
                    if (r28 <= 0) { $pc0 = 136; continue $sw0; }
                    r29 = (abcd.dG) r4;
                    if (r29.lg() == 0) { $pc0 = 45; continue $sw0; }
                    r4 = r29.DW(0);
                    r13.DW(r4);
                    r28 = r28 - 1;
                    { $pc0 = 41; continue $sw0; }
                }
                case 45: {
                    r4 = null;
                    { $pc0 = 136; continue $sw0; }
                }
                case 157: {
                    try {
                        r28 = java.lang.Integer.parseInt(new java.lang.String(r0, r26, r27 - 1));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc0 = 38; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 39; continue $sw0;
                }
                case 39: {
                    throw new abcd.rD(org.eclipse.jgit.JGitText.j6().invalidAncestryLength, r14);
                }
                case 49: {
                    throw new abcd.ZC(r4, "commit");
                }
                case 139: {
                    if (r4 == null) { $pc0 = 159; continue $sw0; }
                    r110 = r13.gn(r4);
                    $pc0 = 150; continue $sw0;
                }
                case 150: {
                    if (r3 == (r0.length - 1)) { $pc0 = 152; continue $sw0; }
                    r111 = abcd.YJ.j6(r13.Zo(), new java.lang.String(r0, r3 + 1, (r0.length - r3) - 1), new abcd.YD[]{r110});
                    if (r111 != null) { $pc0 = 156; continue $sw0; }
                    return null;
                }
                case 156: {
                    return r111.DW(0);
                }
                case 152: {
                    return r110.Hw();
                }
                case 159: {
                    if (r3 != 0) { $pc0 = 142; continue $sw0; }
                    try {
                        r14 = DW(r13, "HEAD");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.rD) { $pc0 = 146; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 143; continue $sw0;
                }
                case 143: {
                    if (r14 != 0) { $pc0 = 145; continue $sw0; }
                    return null;
                }
                case 145: {
                    r110 = r13.gn(r14);
                    { $pc0 = 150; continue $sw0; }
                }
                case 142: {
                    try {
                        r14 = DW(r13, new java.lang.String(r0, 0, r3));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.rD) { $pc0 = 146; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 147; continue $sw0;
                }
                case 147: {
                    throw new abcd.rD(r14);
                }
                case 5: {
                    if (r4 == null) { $pc0 = 8; continue $sw0; }
                    return r4.Hw();
                }
                case 8: {
                    return u7(r14);
                }
                case 38: {
                    $pc0 = 82; continue $sw0;
                }
                case 82: {
                    $pc0 = 146; continue $sw0;
                }
                case 146: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(java.lang.String r9) {
        int r0 = 0;
        int r3 = 0;
        int r4 = 0;
        char r5 = 0;
        char r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r9.length();
                    if (r0 != 0) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    if (r9.endsWith(".lock") == false) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    r3 = 0;
                    r4 = 1;
                    r5 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r3 >= r0) { $pc1 = 10; continue $sw1; }
                    r6 = r9.charAt(r3);
                    if (r6 <= ' ') { $pc1 = 15; continue $sw1; }
                    if (r6 == '*') { $pc1 = 52; continue $sw1; }
                    if (r6 == ':') { $pc1 = 52; continue $sw1; }
                    if (r6 == '?') { $pc1 = 52; continue $sw1; }
                    if (r6 == '^') { $pc1 = 52; continue $sw1; }
                    if (r6 == '{') { $pc1 = 49; continue $sw1; }
                    if (r6 == '~') { $pc1 = 52; continue $sw1; }
                    if (r6 == '.') { $pc1 = 42; continue $sw1; }
                    if (r6 != '/') { $pc1 = 32; continue $sw1; }
                    if (r3 == 0) { $pc1 = 41; continue $sw1; }
                    if (r3 == (r0 - 1)) { $pc1 = 41; continue $sw1; }
                    r4 = r4 + 1;
                    $pc1 = 51; continue $sw1;
                }
                case 51: {
                    r3 = r3 + 1;
                    r5 = r6;
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    return false;
                }
                case 32: {
                    if (r6 == '[') { $pc1 = 52; continue $sw1; }
                    if (r6 == '\\') { $pc1 = 52; continue $sw1; }
                    $pc1 = 42; continue $sw1;
                }
                case 42: {
                    if (r5 == 0) { $pc1 = 47; continue $sw1; }
                    if (r5 == '.') { $pc1 = 47; continue $sw1; }
                    if (r5 == '/') { $pc1 = 47; continue $sw1; }
                    if (r3 != (r0 - 1)) { $pc1 = 51; continue $sw1; }
                    $pc1 = 47; continue $sw1;
                }
                case 47: {
                    return false;
                }
                case 49: {
                    if (r5 != '@') { $pc1 = 51; continue $sw1; }
                    return false;
                }
                case 52: {
                    return false;
                }
                case 15: {
                    return false;
                }
                case 10: {
                    if (r4 <= 1) { $pc1 = 12; continue $sw1; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String Hw(java.lang.String r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1.startsWith("refs/heads/") == false) { $pc2 = 7; continue $sw2; }
                    return r1.substring(11);
                }
                case 7: {
                    if (r1.startsWith("refs/tags/") == false) { $pc2 = 11; continue $sw2; }
                    return r1.substring(10);
                }
                case 11: {
                    if (r1.startsWith("refs/remotes/") == true) { $pc2 = 13; continue $sw2; }
                    return r1;
                }
                case 13: {
                    return r1.substring(13);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] VH(java.lang.String r3) {
        byte[] r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        r0 = abcd.BK.j6(new java.io.File(VH(), r3));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc3 = 7; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0.length > 0) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    return r0;
                }
                case 11: {
                    return null;
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.yE gn(java.lang.String r5) {
        abcd.WD r6 = null;
        abcd.IE r0 = null;
        java.util.Collection<abcd.yE> r1 = null;
        abcd.yE r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r6 = abcd.WD.j6(r5);
                    r0 = j3();
                    try {
                        r1 = r0.j6(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 14; continue $sw4;
                    }
                    if (r1.size() != 0) { $pc4 = 8; continue $sw4; }
                    r0.FH();
                    return null;
                }
                case 8: {
                    if (r1.size() != 1) { $pc4 = 13; continue $sw4; }
                    try {
                        r7 = r1.iterator().next();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 14; continue $sw4;
                    }
                    r0.FH();
                    return r7;
                }
                case 13: {
                    try {
                        throw new abcd.UC(r6, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 14; continue $sw4;
                    }
                }
                case 14: {
                    th = $ex4;
                    r0.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.dG j6(abcd.qG r5, abcd.ME r6, java.lang.String r7) {
        int r2 = 0;
        abcd.pH r8 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        r2 = java.lang.Integer.parseInt(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc5 = 13; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 < 0) { $pc5 = 12; continue $sw5; }
                    r8 = new abcd.qH(this, r6.getName()).j6(r2);
                    if (r8 == null) { $pc5 = 10; continue $sw5; }
                    return r5.VH(r8.DW());
                }
                case 10: {
                    throw new abcd.rD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().reflogEntryNotFound, new java.lang.Object[]{java.lang.Integer.valueOf(r2), r6.getName()}));
                }
                case 12: {
                    throw new abcd.rD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidReflogRevision, new java.lang.Object[]{r7}));
                }
                case 14: {
                    throw new abcd.rD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidReflogRevision, new java.lang.Object[]{r7}));
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.AbstractiG j6(abcd.qG r1, java.lang.String r2) {
        abcd.yE r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r3 = u7(r2);
                    if (r3 != null) { $pc6 = 7; continue $sw6; }
                    return null;
                }
                case 7: {
                    return r1.Zo(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.List<abcd.yE> r3, java.lang.String r4) {
        java.io.File r0 = null;
        abcd.XK r5 = null;
        java.util.Iterator<abcd.yE> r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new java.io.File(VH(), r4);
                    if (r3 == null) { $pc7 = 14; continue $sw7; }
                    r5 = new abcd.XK(new java.io.FileOutputStream(r0));
                    try {
                        r6 = r3.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r6.hasNext() == false) { $pc7 = 8; continue $sw7; }
                    try {
                        r6.next().DW(r5);
                        r5.write(10);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    { $pc7 = 7; continue $sw7; }
                }
                case 8: {
                    r5.close();
                    return;
                }
                case 11: {
                    th = $ex7;
                    r5.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 14: {
                    abcd.zK.j6(r0, 4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(char r1) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if ('0' > r1) { $pc8 = 7; continue $sw8; }
                    if (r1 > '9') { $pc8 = 7; continue $sw8; }
                    return true;
                }
                case 7: {
                    if ('a' > r1) { $pc8 = 11; continue $sw8; }
                    if (r1 > 'f') { $pc8 = 11; continue $sw8; }
                    return true;
                }
                case 11: {
                    if ('A' <= r1) { $pc8 = 13; continue $sw8; }
                    return false;
                }
                case 13: {
                    if (r1 > 'F') { $pc8 = 21; continue $sw8; }
                    return true;
                }
                case 21: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(java.lang.String r1, int r2) {
        int r0 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 3: {
                    if (r2 >= r1.length()) { $pc9 = 4; continue $sw9; }
                    r0 = r2 + 1;
                    if (j6(r1.charAt(r2)) == false) { $pc9 = 8; continue $sw9; }
                    r2 = r0;
                    { $pc9 = 3; continue $sw9; }
                }
                case 8: {
                    return false;
                }
                case 4: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.yE u7(java.lang.String r4) {
        abcd.ME r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.String r5 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (abcd.yE.DW(r4) == true) { $pc10 = 5; continue $sw10; }
                    r0 = we().j6(r4);
                    if (r0 == null) { $pc10 = 11; continue $sw10; }
                    return r0.DW();
                }
                case 11: {
                    if (abcd.WD.DW(r4) == true) { $pc10 = 13; continue $sw10; }
                    r1 = r4.indexOf("-g");
                    if ((r1 + 5) >= r4.length()) { $pc10 = 27; continue $sw10; }
                    if (r1 < 0) { $pc10 = 29; continue $sw10; }
                    r2 = r1 + 2;
                    if (j6(r4.charAt(r2)) == true) { $pc10 = 20; continue $sw10; }
                    return null;
                }
                case 20: {
                    if (j6(r4.charAt(r1 + 3)) == true) { $pc10 = 22; continue $sw10; }
                    return null;
                }
                case 22: {
                    if (j6(r4, r1 + 4) == false) { $pc10 = 32; continue $sw10; }
                    r5 = r4.substring(r2);
                    if (abcd.WD.DW(r5) == true) { $pc10 = 26; continue $sw10; }
                    return null;
                }
                case 26: {
                    return gn(r5);
                }
                case 32: {
                    return null;
                }
                case 29: {
                    return null;
                }
                case 27: {
                    return null;
                }
                case 13: {
                    return gn(r4);
                }
                case 5: {
                    return abcd.yE.j6(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        j6(false);
    }

    public abstract abcd.AbstractxE EQ();

    public abcd.yE FH(java.lang.String r2) {
        abcd.qG r0 = null;
        abcd.yE r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new abcd.qG(this);
                    try {
                        r3 = DW(r0, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 6; continue $sw11;
                    }
                    r0.EQ();
                    return r3;
                }
                case 6: {
                    th = $ex11;
                    r0.EQ();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void FH() {
        EQ().j6();
        we().j6();
    }

    public java.util.Set<abcd.yE> Hw() {
        return java.util.Collections.emptySet();
    }

    public abcd.EnumiF J0() {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (QX() == true) { $pc12 = 58; continue $sw12; }
                    if (VH() == null) { $pc12 = 58; continue $sw12; }
                    if (new java.io.File(J8(), ".dotest").exists() == false) { $pc12 = 12; continue $sw12; }
                    return abcd.EnumiF.VH;
                }
                case 12: {
                    if (new java.io.File(VH(), ".dotest-merge").exists() == false) { $pc12 = 16; continue $sw12; }
                    return abcd.EnumiF.EQ;
                }
                case 16: {
                    if (new java.io.File(VH(), "rebase-apply/rebasing").exists() == false) { $pc12 = 20; continue $sw12; }
                    return abcd.EnumiF.gn;
                }
                case 20: {
                    if (new java.io.File(VH(), "rebase-apply/applying").exists() == false) { $pc12 = 24; continue $sw12; }
                    return abcd.EnumiF.u7;
                }
                case 24: {
                    if (new java.io.File(VH(), "rebase-apply").exists() == false) { $pc12 = 28; continue $sw12; }
                    return abcd.EnumiF.VH;
                }
                case 28: {
                    if (new java.io.File(VH(), "rebase-merge/interactive").exists() == false) { $pc12 = 32; continue $sw12; }
                    return abcd.EnumiF.EQ;
                }
                case 32: {
                    if (new java.io.File(VH(), "rebase-merge").exists() == false) { $pc12 = 36; continue $sw12; }
                    return abcd.EnumiF.tp;
                }
                case 36: {
                    if (new java.io.File(VH(), "MERGE_HEAD").exists() == false) { $pc12 = 44; continue $sw12; }
                    if (U2().Zo() == true) { $pc12 = 42; continue $sw12; }
                    return abcd.EnumiF.Hw;
                }
                case 42: {
                    return abcd.EnumiF.FH;
                }
                case 44: {
                    if (new java.io.File(VH(), "BISECT_LOG").exists() == false) { $pc12 = 48; continue $sw12; }
                    return abcd.EnumiF.we;
                }
                case 48: {
                    if (new java.io.File(VH(), "CHERRY_PICK_HEAD").exists() == false) { $pc12 = 56; continue $sw12; }
                    if (U2().Zo() == true) { $pc12 = 54; continue $sw12; }
                    return abcd.EnumiF.Zo;
                }
                case 54: {
                    return abcd.EnumiF.v5;
                }
                case 56: {
                    return abcd.EnumiF.DW;
                }
                case 58: {
                    return abcd.EnumiF.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File J8() {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (QX() == true) { $pc13 = 7; continue $sw13; }
                    return this.Zo;
                }
                case 7: {
                    throw new abcd.iD();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract void Mr();

    public boolean QX() {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this.Zo != null) { $pc14 = 6; continue $sw14; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.KC U2() {
        return abcd.KC.DW(tp(), gn());
    }

    public java.io.File VH() {
        return this.FH;
    }

    public void Ws() {
        this.DW.incrementAndGet();
    }

    public abcd.KC XL() {
        abcd.TE r0 = new abcd.TE(this);
        return abcd.KC.j6(tp(), gn(), r0);
    }

    public abstract abcd.AbstractjF Zo();

    public void Zo(java.lang.String r4) {
        java.io.File r0 = null;
        java.io.FileOutputStream r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = new java.io.File(this.FH, "MERGE_MSG");
                    if (r4 == null) { $pc15 = 10; continue $sw15; }
                    r1 = new java.io.FileOutputStream(r0);
                    try {
                        r1.write(r4.getBytes("UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    r1.close();
                    return;
                }
                case 7: {
                    th = $ex15;
                    r1.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 10: {
                    abcd.zK.j6(r0, 4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String a8() {
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (QX() == true) { $pc16 = 12; continue $sw16; }
                    if (VH() == null) { $pc16 = 12; continue $sw16; }
                    return abcd.IK.j6(abcd.BK.j6(new java.io.File(VH(), "MERGE_MSG")));
                }
                case 9: {
                    return null;
                }
                case 12: {
                    throw new abcd.iD();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.EE aM() {
        return EQ().Hw();
    }

    public abcd.AbstractpK gn() {
        return this.Hw;
    }

    public abcd.IE j3() {
        return EQ().v5();
    }

    public abcd.FE j6(abcd.YD r2, int r3) {
        return EQ().j6(r2, r3);
    }

    public abcd.ME j6(abcd.ME r2) {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    return we().j6(r2);
                }
                case 7: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.ME j6(java.lang.String r2) {
        return we().j6(r2);
    }

    public abcd.RE j6(java.lang.String r2, boolean r3) {
        return we().j6(r2, r3);
    }

    public void j6() {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.DW.decrementAndGet() != 0) { $pc18 = 6; continue $sw18; }
                    FH();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(KD<?> r2) {
        r2.j6(this);
        this.v5.j6(r2);
        j6.j6(r2);
    }

    public void j6(abcd.yE r2) {
        java.util.List<abcd.yE> r3 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (r2 == null) { $pc19 = 4; continue $sw19; }
                    r3 = java.util.Collections.singletonList(r2);
                    $pc19 = 5; continue $sw19;
                }
                case 5: {
                    j6(r3, "CHERRY_PICK_HEAD");
                    return;
                }
                case 4: {
                    r3 = null;
                    { $pc19 = 5; continue $sw19; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.List<abcd.yE> r2) {
        j6(r2, "MERGE_HEAD");
    }

    public abstract void j6(boolean r1);

    public boolean j6(abcd.YD r2) {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    return EQ().j6(r2);
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<abcd.yE> lg() {
        byte[] r0 = null;
        java.util.LinkedList r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (QX() == true) { $pc21 = 16; continue $sw21; }
                    if (VH() == null) { $pc21 = 16; continue $sw21; }
                    r0 = VH("MERGE_HEAD");
                    if (r0 != null) { $pc21 = 10; continue $sw21; }
                    return null;
                }
                case 10: {
                    r1 = new java.util.LinkedList();
                    r2 = 0;
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    if (r2 >= r0.length) { $pc21 = 13; continue $sw21; }
                    r1.add(abcd.yE.v5(r0, r2));
                    r2 = abcd.IK.Zo(r0, r2 + 40);
                    { $pc21 = 12; continue $sw21; }
                }
                case 13: {
                    return r1;
                }
                case 16: {
                    throw new abcd.iD();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    if (VH() == null) { $pc22 = 5; continue $sw22; }
                    r0 = VH().getPath();
                    $pc22 = 7; continue $sw22;
                }
                case 7: {
                    return "Repository[" + r0 + "]";
                }
                case 5: {
                    r0 = java.lang.String.valueOf(getClass().getSimpleName()) + "-" + java.lang.System.identityHashCode(this);
                    { $pc22 = 7; continue $sw22; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.File tp() {
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    if (QX() == true) { $pc23 = 7; continue $sw23; }
                    return this.VH;
                }
                case 7: {
                    throw new abcd.iD();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String u7() {
        abcd.ME r0 = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    r0 = j6("HEAD");
                    if (r0 != null) { $pc24 = 6; continue $sw24; }
                    return null;
                }
                case 6: {
                    if (r0.Zo() == false) { $pc24 = 10; continue $sw24; }
                    return r0.getTarget().getName();
                }
                case 10: {
                    if (r0.DW() != null) { $pc24 = 12; continue $sw24; }
                    return null;
                }
                case 12: {
                    return r0.DW().we();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.RE v5(java.lang.String r2) {
        return j6(r2, false);
    }

    public java.util.Map<java.lang.String, abcd.ME> v5() {
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    return we().DW("");
                }
                case 5: {
                    return new java.util.HashMap();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.OE we();
}
