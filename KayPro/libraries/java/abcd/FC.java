package abcd;

class FC {
    private java.util.List<abcd.hC> DW;
    private java.util.List<abcd.hC> FH;
    private long[] Hw;
    private java.util.List<abcd.hC> VH;
    private boolean Zo;
    private abcd.AbstractcC.c j6;
    private int v5;

    FC(abcd.AbstractcC.c r2, java.util.List<abcd.hC> r3, java.util.List<abcd.hC> r4) {
        this.v5 = 60;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
    }

    private static int DW(int r1) {
        return 268435455 - r1;
    }

    static int DW(long r1) {
        return DW(268435455 & ((int) (r1 >>> 28)));
    }

    private int DW(abcd.LE r23) {
        long[] r2 = null;
        long[] r3 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.util.BitSet r8 = null;
        abcd.hC r9 = null;
        int r11 = 0;
        int r10 = 0;
        abcd.EC r12 = null;
        abcd.hC r13 = null;
        long r15 = 0L;
        long r4 = 0L;
        long r16 = 0L;
        long r14 = 0L;
        int r17 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Hw = new long[this.DW.size() * this.FH.size()];
                    r2 = new long[this.DW.size()];
                    r3 = new long[this.FH.size()];
                    r5 = 0;
                    r6 = 0;
                    r7 = 0;
                    r8 = null;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r6 >= this.DW.size()) { $pc0 = 5; continue $sw0; }
                    r9 = this.DW.get(r6);
                    if (j6(r9.v5) == true) { $pc0 = 10; continue $sw0; }
                    r23.update(this.FH.size());
                    $pc0 = 39; continue $sw0;
                }
                case 39: {
                    r6 = r6 + 1;
                    r5 = 0;
                    { $pc0 = 4; continue $sw0; }
                }
                case 10: {
                    r11 = r7;
                    r10 = 0;
                    r12 = null;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r10 >= this.FH.size()) { $pc0 = 38; continue $sw0; }
                    r13 = this.FH.get(r10);
                    if (j6(r13.Zo) == true) { $pc0 = 18; continue $sw0; }
                    r23.update(1);
                    $pc0 = 48; continue $sw0;
                }
                case 48: {
                    r10 = r10 + 1;
                    { $pc0 = 12; continue $sw0; }
                }
                case 18: {
                    if (abcd.BC.j6(r9.v5, r13.Zo) == true) { $pc0 = 20; continue $sw0; }
                    r23.update(1);
                    { $pc0 = 48; continue $sw0; }
                }
                case 20: {
                    if (r8 != null) { $pc0 = 22; continue $sw0; }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    r15 = r2[r6];
                    if (r15 != 0) { $pc0 = 27; continue $sw0; }
                    r15 = DW(abcd.hC.b.j6, r9) + 1;
                    r2[r6] = r15;
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    r4 = r15;
                    r16 = r3[r10];
                    if (r16 != 0) { $pc0 = 30; continue $sw0; }
                    r16 = DW(abcd.hC.b.DW, r13) + 1;
                    r3[r10] = r16;
                    $pc0 = 30; continue $sw0;
                }
                case 30: {
                    r14 = r16;
                    if (((java.lang.Math.min(r4, r14) * 100) / java.lang.Math.max(r4, r14)) >= this.v5) { $pc0 = 34; continue $sw0; }
                    r23.update(1);
                    { $pc0 = 48; continue $sw0; }
                }
                case 34: {
                    if (r12 != null) { $pc0 = 51; continue $sw0; }
                    try {
                        r12 = j6(abcd.hC.b.j6, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.EC.a) { $pc0 = 37; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 37; continue $sw0;
                }
                case 37: {
                    this.Zo = true;
                    $pc0 = 51; continue $sw0;
                }
                case 51: {
                    r17 = ((r12.j6(j6(abcd.hC.b.DW, r13), 10000) * 99) + ((j6(r9.FH, r13.Hw) * 100) * 1)) / 10000;
                    if (r17 >= this.v5) { $pc0 = 44; continue $sw0; }
                    r23.update(1);
                    { $pc0 = 48; continue $sw0; }
                }
                case 44: {
                    this.Hw[r11] = j6(r17, r6, r10);
                    r23.update(1);
                    r11 = r11 + 1;
                    $pc0 = 45; continue $sw0;
                }
                case 45: {
                    if (r8 != null) { $pc0 = 47; continue $sw0; }
                    r8 = new java.util.BitSet(this.FH.size());
                    $pc0 = 47; continue $sw0;
                }
                case 47: {
                    r8.set(r10);
                    this.Zo = true;
                    r23.update(1);
                    { $pc0 = 48; continue $sw0; }
                }
                case 22: {
                    if (r8.get(r10) == false) { $pc0 = 24; continue $sw0; }
                    r23.update(1);
                    $pc0 = 38; continue $sw0;
                }
                case 38: {
                    r7 = r11;
                    { $pc0 = 39; continue $sw0; }
                }
                case 5: {
                    java.util.Arrays.sort(this.Hw, r5, r7);
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private long DW(abcd.hC.b r2, abcd.hC r3) {
        return this.j6.DW(r2, r3);
    }

    private static java.util.List<abcd.hC> DW(java.util.List<abcd.hC> r4) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.hC> r5 = null;
        abcd.hC r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.ArrayList(r4.size());
                    r5 = r4.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc1 = 5; continue $sw1; }
                    r1 = r5.next();
                    if (r1.VH != abcd.hC.a.FH) { $pc1 = 4; continue $sw1; }
                    r0.add(r1);
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int FH(long r1) {
        return (int) (r1 >>> 56);
    }

    private static long FH(int r2) {
        return 268435455 - r2;
    }

    static int j6(long r0) {
        return DW(268435455 & ((int) r0));
    }

    static int j6(java.lang.String r12, java.lang.String r13) {
        int r1 = 0;
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r6 = 0;
        int r7 = 0;
        int r14 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = r12.lastIndexOf("/") + 1;
                    r0 = r13.lastIndexOf("/") + 1;
                    r2 = java.lang.Math.min(r1, r0);
                    r3 = java.lang.Math.max(r1, r0);
                    r4 = 0;
                    if (r3 != 0) { $pc2 = 6; continue $sw2; }
                    r8 = 100;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r9 = 100;
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r10 = java.lang.Math.min(r12.length() - r1, r13.length() - r0);
                    r11 = java.lang.Math.max(r12.length() - r1, r13.length() - r0);
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (r4 >= r10) { $pc2 = 26; continue $sw2; }
                    if (r12.charAt((r12.length() - 1) - r4) != r13.charAt((r13.length() - 1) - r4)) { $pc2 = 26; continue $sw2; }
                    r4 = r4 + 1;
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    return (((r8 + r9) * 25) + (((r4 * 100) / r11) * 50)) / 100;
                }
                case 6: {
                    r6 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r6 >= r2) { $pc2 = 11; continue $sw2; }
                    if (r12.charAt(r6) != r13.charAt(r6)) { $pc2 = 11; continue $sw2; }
                    r6 = r6 + 1;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r7 = (r6 * 100) / r3;
                    if (r7 != 100) { $pc2 = 14; continue $sw2; }
                    r8 = r7;
                    { $pc2 = 5; continue $sw2; }
                }
                case 14: {
                    r14 = 0;
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    if (r14 >= r2) { $pc2 = 19; continue $sw2; }
                    if (r12.charAt((r1 - 1) - r14) != r13.charAt((r0 - 1) - r14)) { $pc2 = 19; continue $sw2; }
                    r14 = r14 + 1;
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r9 = (r14 * 100) / r3;
                    r8 = r7;
                    { $pc2 = 20; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static long j6(int r3, int r4, int r5) {
        long r0 = ((long) r3) << 56;
        return ((FH(r4) << 28) | r0) | FH(r5);
    }

    private abcd.EC j6(abcd.hC.b r3, abcd.hC r4) {
        abcd.EC r0 = new abcd.EC();
        r0.j6(this.j6.j6(r3, r4));
        r0.j6();
        return r0;
    }

    private static java.util.List<abcd.hC> j6(java.util.List<abcd.hC> r2) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.hC> r3 = null;
        abcd.hC r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.ArrayList(r2.size());
                    r3 = r2.iterator();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc3 = 5; continue $sw3; }
                    r1 = r3.next();
                    if (r1 == null) { $pc3 = 4; continue $sw3; }
                    r0.add(r1);
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(abcd.AbstractrE r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r1.DW() & 61440) != 32768) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.util.List<abcd.hC> DW() {
        return this.DW;
    }

    java.util.List<abcd.hC> FH() {
        return this.VH;
    }

    boolean Hw() {
        return this.Zo;
    }

    java.util.List<abcd.hC> j6() {
        return this.FH;
    }

    void j6(int r1) {
        this.v5 = r1;
    }

    void j6(abcd.LE r10) {
        int r0 = 0;
        long r2 = 0L;
        int r1 = 0;
        int r4 = 0;
        abcd.hC r3 = null;
        abcd.hC r5 = null;
        abcd.hC.a r7 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r10 != null) { $pc5 = 4; continue $sw5; }
                    r10 = abcd.vE.j6;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    r10.j6(org.eclipse.jgit.JGitText.j6().renamesFindingByContent, (this.DW.size() * 2) * this.FH.size());
                    r0 = DW(r10);
                    this.VH = new java.util.ArrayList(java.lang.Math.min(r0, this.FH.size()));
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r0 = r0 - 1;
                    if (r0 < 0) { $pc5 = 7; continue $sw5; }
                    r2 = this.Hw[r0];
                    r1 = DW(r2);
                    r4 = j6(r2);
                    r3 = this.DW.get(r1);
                    r5 = this.FH.get(r4);
                    if (r5 == null) { $pc5 = 11; continue $sw5; }
                    if (r3.VH != abcd.hC.a.FH) { $pc5 = 15; continue $sw5; }
                    r7 = abcd.hC.a.Hw;
                    r3.VH = r7;
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    this.VH.add(abcd.hC.j6(r7, r3, r5, FH(r2)));
                    this.FH.set(r4, null);
                    r10.update(1);
                    { $pc5 = 5; continue $sw5; }
                }
                case 15: {
                    r7 = abcd.hC.a.v5;
                    { $pc5 = 16; continue $sw5; }
                }
                case 11: {
                    r10.update(1);
                    { $pc5 = 5; continue $sw5; }
                }
                case 7: {
                    this.DW = DW(this.DW);
                    this.FH = j6(this.FH);
                    r10.j6();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
