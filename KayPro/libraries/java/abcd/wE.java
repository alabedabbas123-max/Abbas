package abcd;

public class wE {
    public static final byte[] DW = null;
    public static final byte[] FH = null;
    public static final byte[] Hw = null;
    public static final byte[] VH = null;
    public static final byte[] Zo = null;
    public static final byte[] gn = null;
    public static final byte[] j6 = null;
    public static final byte[] u7 = null;
    public static final byte[] v5 = null;
    private final abcd.EK EQ;
    private final abcd.uE tp;

    static {
        j6 = abcd.hE.DW("tree ");
        DW = abcd.hE.DW("parent ");
        FH = abcd.hE.DW("author ");
        Hw = abcd.hE.DW("committer ");
        v5 = abcd.hE.DW("encoding ");
        Zo = abcd.hE.DW("object ");
        VH = abcd.hE.DW("type ");
        gn = abcd.hE.DW("tag ");
        u7 = abcd.hE.DW("tagger ");
    }

    public wE() {
        this.tp = new abcd.uE();
        this.EQ = new abcd.EK();
    }

    private int DW(byte[] r5, int r6) {
        int r1 = 0;
        int r0 = 0;
        int r2 = 0;
        abcd.EK r7 = null;
        int r3 = 0;
        int r4 = 0;
        int r8 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = abcd.IK.DW(r5, r6, '<');
                    if (r1 != r6) { $pc0 = 5; continue $sw0; }
                    $pc0 = 29; continue $sw0;
                }
                case 29: {
                    return -1;
                }
                case 5: {
                    if (r5[r1 - 1] != 60) { $pc0 = 29; continue $sw0; }
                    r0 = abcd.IK.DW(r5, r1, '>');
                    if (r0 == r1) { $pc0 = 29; continue $sw0; }
                    if (r5[r0 - 1] != 62) { $pc0 = 29; continue $sw0; }
                    if (r0 == r5.length) { $pc0 = 29; continue $sw0; }
                    if (r5[r0] != 32) { $pc0 = 29; continue $sw0; }
                    r2 = r0 + 1;
                    abcd.IK.j6(r5, r2, this.EQ);
                    r7 = this.EQ;
                    r3 = r7.j6;
                    if (r2 != r3) { $pc0 = 21; continue $sw0; }
                    return -1;
                }
                case 21: {
                    if (r3 == r5.length) { $pc0 = 29; continue $sw0; }
                    if (r5[r3] != 32) { $pc0 = 29; continue $sw0; }
                    r4 = r3 + 1;
                    abcd.IK.j6(r5, r4, r7);
                    r8 = this.EQ.j6;
                    if (r4 != r8) { $pc0 = 28; continue $sw0; }
                    return -1;
                }
                case 28: {
                    return r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(int r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (abcd.AbstractrE.j6.j6(r1) == false) { $pc1 = 5; continue $sw1; }
                    return 47;
                }
                case 5: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(byte[] r2, int r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        this.tp.v5(r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc2 = 5; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r3 + 40;
                }
                case 5: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(byte[] r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        int r0 = 0;
        int r1 = 0;
        int r9 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 2;
        $sw3: while (true) {
            switch ($pc3) {
                case 2: {
                    if (r3 >= r4) { $pc3 = 9; continue $sw3; }
                    if (r6 >= r7) { $pc3 = 9; continue $sw3; }
                    r0 = r3 + 1;
                    r1 = r6 + 1;
                    r9 = (r2[r3] & 255) - (r2[r6] & 255);
                    if (r9 != 0) { $pc3 = 7; continue $sw3; }
                    r3 = r0;
                    r6 = r1;
                    { $pc3 = 2; continue $sw3; }
                }
                case 7: {
                    return r9;
                }
                case 9: {
                    if (r3 < r4) { $pc3 = 11; continue $sw3; }
                    if (r6 < r7) { $pc3 = 14; continue $sw3; }
                    return 0;
                }
                case 14: {
                    return j6(r5) - (r2[r6] & 255);
                }
                case 11: {
                    return (r2[r3] & 255) - j6(r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(byte[] r11, int r12, int r13) {
        int r0 = 0;
        int r1 = 0;
        int r9 = 0;
        int r7 = 0;
        byte r2 = 0;
        int r3 = 0;
        int r10 = 0;
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r11.length;
                    r1 = (r13 + 1) + 20;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    r9 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1 >= r0) { $pc4 = 5; continue $sw4; }
                    r7 = r1 + 1;
                    r2 = r11[r1];
                    if (32 == r2) { $pc4 = 8; continue $sw4; }
                    r9 = (r9 << 3) + (r2 - 48);
                    r1 = r7;
                    { $pc4 = 4; continue $sw4; }
                }
                case 8: {
                    r3 = r7;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    if (r3 == r0) { $pc4 = 10; continue $sw4; }
                    r10 = r3 + 1;
                    if (r11[r3] == 0) { $pc4 = 14; continue $sw4; }
                    r3 = r10;
                    { $pc4 = 9; continue $sw4; }
                }
                case 14: {
                    if ((r7 + 1) == r10) { $pc4 = 15; continue $sw4; }
                    r4 = j6(r11, r12, r13, abcd.AbstractrE.j6.DW(), r7, r10 - 1, r9);
                    if (r4 < 0) { $pc4 = 18; continue $sw4; }
                    if (r4 == 0) { $pc4 = 20; continue $sw4; }
                    r1 = r10 + 20;
                    { $pc4 = 3; continue $sw4; }
                }
                case 20: {
                    return true;
                }
                case 18: {
                    return false;
                }
                case 15: {
                    return false;
                }
                case 10: {
                    return false;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(byte[] r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = abcd.IK.j6(r4, 0, j6);
                    if (r0 < 0) { $pc5 = 41; continue $sw5; }
                    r1 = j6(r4, r0);
                    if (r1 < 0) { $pc5 = 39; continue $sw5; }
                    r2 = r1 + 1;
                    if (r4[r1] != 10) { $pc5 = 39; continue $sw5; }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    if (abcd.IK.j6(r4, r2, DW) < 0) { $pc5 = 10; continue $sw5; }
                    r3 = j6(r4, r2 + DW.length);
                    if (r3 < 0) { $pc5 = 37; continue $sw5; }
                    r2 = r3 + 1;
                    if (r4[r3] == 10) { $pc5 = 9; continue $sw5; }
                    $pc5 = 37; continue $sw5;
                }
                case 37: {
                    throw new abcd.YC("invalid parent");
                }
                case 10: {
                    r5 = abcd.IK.j6(r4, r2, FH);
                    if (r5 < 0) { $pc5 = 30; continue $sw5; }
                    r6 = DW(r4, r5);
                    if (r6 < 0) { $pc5 = 28; continue $sw5; }
                    r7 = r6 + 1;
                    if (r4[r6] != 10) { $pc5 = 28; continue $sw5; }
                    r8 = abcd.IK.j6(r4, r7, Hw);
                    if (r8 < 0) { $pc5 = 26; continue $sw5; }
                    r9 = DW(r4, r8);
                    if (r9 < 0) { $pc5 = 24; continue $sw5; }
                    if (r4[r9] != 10) { $pc5 = 24; continue $sw5; }
                    return;
                }
                case 24: {
                    throw new abcd.YC("invalid committer");
                }
                case 26: {
                    throw new abcd.YC("no committer");
                }
                case 28: {
                    throw new abcd.YC("invalid author");
                }
                case 30: {
                    throw new abcd.YC("no author");
                }
                case 39: {
                    throw new abcd.YC("invalid tree");
                }
                case 41: {
                    throw new abcd.YC("no tree header");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(byte[] r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = abcd.IK.j6(r4, 0, Zo);
                    if (r0 < 0) { $pc6 = 29; continue $sw6; }
                    r1 = j6(r4, r0);
                    if (r1 < 0) { $pc6 = 27; continue $sw6; }
                    r2 = r1 + 1;
                    if (r4[r1] != 10) { $pc6 = 27; continue $sw6; }
                    r3 = abcd.IK.j6(r4, r2, VH);
                    if (r3 < 0) { $pc6 = 25; continue $sw6; }
                    r5 = abcd.IK.j6(r4, abcd.IK.Zo(r4, r3), gn);
                    if (r5 < 0) { $pc6 = 23; continue $sw6; }
                    r6 = abcd.IK.j6(r4, abcd.IK.Zo(r4, r5), u7);
                    if (r6 <= 0) { $pc6 = 21; continue $sw6; }
                    r7 = DW(r4, r6);
                    if (r7 < 0) { $pc6 = 20; continue $sw6; }
                    if (r4[r7] != 10) { $pc6 = 20; continue $sw6; }
                    return;
                }
                case 20: {
                    throw new abcd.YC("invalid tagger");
                }
                case 21: {
                    return;
                }
                case 23: {
                    throw new abcd.YC("no tag header");
                }
                case 25: {
                    throw new abcd.YC("no type header");
                }
                case 27: {
                    throw new abcd.YC("invalid object");
                }
                case 29: {
                    throw new abcd.YC("no object header");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(byte[] r14) {
        int r0 = 0;
        int r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r10 = 0;
        int r11 = 0;
        byte r3 = 0;
        int r7 = 0;
        int r12 = 0;
        byte r8 = 0;
        int r9 = 0;
        int r13 = 0;
        int r15 = 0;
        int r16 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = r14.length;
                    r2 = 0;
                    r4 = 0;
                    r5 = 0;
                    r6 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r2 >= r0) { $pc7 = 4; continue $sw7; }
                    r10 = 0;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r2 == r0) { $pc7 = 69; continue $sw7; }
                    r11 = r2 + 1;
                    r3 = r14[r2];
                    if (32 == r3) { $pc7 = 10; continue $sw7; }
                    if (r3 < 48) { $pc7 = 67; continue $sw7; }
                    if (r3 > 55) { $pc7 = 67; continue $sw7; }
                    if (r10 != 0) { $pc7 = 65; continue $sw7; }
                    if (r3 != 48) { $pc7 = 65; continue $sw7; }
                    throw new abcd.YC("mode starts with '0'");
                }
                case 65: {
                    r10 = (r10 << 3) + (r3 - 48);
                    r2 = r11;
                    $pc7 = 67; continue $sw7;
                }
                case 67: {
                    throw new abcd.YC("invalid mode character");
                }
                case 10: {
                    if (abcd.AbstractrE.DW(r10).FH() == (-1)) { $pc7 = 55; continue $sw7; }
                    r7 = r11;
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    if (r7 == r0) { $pc7 = 53; continue $sw7; }
                    r12 = r7 + 1;
                    r8 = r14[r7];
                    if (r8 == 0) { $pc7 = 15; continue $sw7; }
                    if (r8 == 47) { $pc7 = 51; continue $sw7; }
                    r7 = r12;
                    { $pc7 = 12; continue $sw7; }
                }
                case 51: {
                    throw new abcd.YC("name contains '/'");
                }
                case 15: {
                    r9 = r11 + 1;
                    if (r9 == r12) { $pc7 = 46; continue $sw7; }
                    if (r14[r11] != 46) { $pc7 = 30; continue $sw7; }
                    r13 = (r12 - 1) - r11;
                    if (r13 == 1) { $pc7 = 29; continue $sw7; }
                    if (r13 != 2) { $pc7 = 30; continue $sw7; }
                    if (r14[r9] != 46) { $pc7 = 30; continue $sw7; }
                    throw new abcd.YC("invalid name '..'");
                }
                case 29: {
                    throw new abcd.YC("invalid name '.'");
                }
                case 30: {
                    r15 = r12 - 1;
                    if (j6(r14, r11, r15) == true) { $pc7 = 44; continue $sw7; }
                    if (r4 != 0) { $pc7 = 34; continue $sw7; }
                    $pc7 = 38; continue $sw7;
                }
                case 38: {
                    r16 = r12 + 20;
                    if (r16 > r0) { $pc7 = 42; continue $sw7; }
                    r5 = r15;
                    r2 = r16;
                    r6 = r10;
                    r4 = r11;
                    { $pc7 = 3; continue $sw7; }
                }
                case 42: {
                    throw new abcd.YC("truncated in object id");
                }
                case 34: {
                    if (j6(r14, r4, r5, r6, r11, r15, r10) <= 0) { $pc7 = 38; continue $sw7; }
                    throw new abcd.YC("incorrectly sorted");
                }
                case 44: {
                    throw new abcd.YC("duplicate entry names");
                }
                case 46: {
                    throw new abcd.YC("zero length name");
                }
                case 53: {
                    throw new abcd.YC("truncated in name");
                }
                case 55: {
                    throw new abcd.YC("invalid mode " + r10);
                }
                case 69: {
                    throw new abcd.YC("truncated in mode");
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r4, byte[] r5) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r4 != 1) { $pc8 = 5; continue $sw8; }
                    DW(r5);
                    return;
                }
                case 5: {
                    if (r4 != 2) { $pc8 = 7; continue $sw8; }
                    Hw(r5);
                    return;
                }
                case 7: {
                    if (r4 != 3) { $pc8 = 9; continue $sw8; }
                    j6(r5);
                    return;
                }
                case 9: {
                    if (r4 != 4) { $pc8 = 12; continue $sw8; }
                    FH(r5);
                    return;
                }
                case 12: {
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType2, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r1) {
    }
}
