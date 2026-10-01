package abcd;

public final class pF {
    private static final abcd.jC j6 = null;
    private final abcd.AbstracteC DW;

    static {
        j6 = new abcd.jC(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public pF(abcd.AbstracteC r1) {
        this.DW = r1;
    }

    private static abcd.jC j6(java.util.Iterator<abcd.jC> r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    return r1.next();
                }
                case 6: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public <S extends abcd.CC> uF<S> j6(DC<S> r24, S r25, S r26, S r27) {
        DC<S> r1 = null;
        java.util.ArrayList r5 = null;
        abcd.uF r6 = null;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        java.util.Iterator<abcd.jC> r10 = null;
        java.util.Iterator<abcd.jC> r11 = null;
        abcd.jC r12 = null;
        abcd.jC r13 = null;
        int r14 = 0;
        abcd.jC r15 = null;
        int r16 = 0;
        int r17 = 0;
        abcd.jC r18 = null;
        abcd.jC r19 = null;
        abcd.jC r110 = null;
        int r20 = 0;
        int r21 = 0;
        int r0 = 0;
        int r2 = 0;
        java.util.Iterator<abcd.jC> r111 = null;
        int r22 = 0;
        java.util.Iterator<abcd.jC> r112 = null;
        abcd.jC r113 = null;
        int r3 = 0;
        int r114 = 0;
        abcd.jC r23 = null;
        int r4 = 0;
        int r28 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = r24;
                    r5 = new java.util.ArrayList(3);
                    r5.add(r25);
                    r5.add(r26);
                    r5.add(r27);
                    r6 = new abcd.uF(r5);
                    r7 = 2;
                    r8 = 1;
                    r9 = 0;
                    if (r26.j6() != 0) { $pc1 = 13; continue $sw1; }
                    if (r27.j6() != 0) { $pc1 = 7; continue $sw1; }
                    r6.j6(1, 0, 0, abcd.qF.a.j6);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    return r6;
                }
                case 7: {
                    if (this.DW.j6(r1, r25, r27).isEmpty() == true) { $pc1 = 9; continue $sw1; }
                    r6.j6(1, 0, 0, abcd.qF.a.DW);
                    r6.j6(2, 0, r27.j6(), abcd.qF.a.FH);
                    { $pc1 = 11; continue $sw1; }
                }
                case 9: {
                    r6.j6(1, 0, 0, abcd.qF.a.j6);
                    { $pc1 = 11; continue $sw1; }
                }
                case 13: {
                    if (r27.j6() == 0) { $pc1 = 15; continue $sw1; }
                    r10 = this.DW.j6(r1, r25, r26).iterator();
                    r11 = this.DW.j6(r1, r25, r27).iterator();
                    r12 = j6(r10);
                    r13 = j6(r11);
                    r14 = 0;
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    r15 = j6;
                    if (r13 != r15) { $pc1 = 28; continue $sw1; }
                    if (r12 != r15) { $pc1 = 28; continue $sw1; }
                    if (r14 >= r25.j6()) { $pc1 = 26; continue $sw1; }
                    r6.j6(r9, r14, r25.j6(), abcd.qF.a.j6);
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    return r6;
                }
                case 28: {
                    if (r12.v5() < r13.FH()) { $pc1 = 30; continue $sw1; }
                    if (r13.v5() < r12.FH()) { $pc1 = 36; continue $sw1; }
                    if (r12.FH() != r14) { $pc1 = 42; continue $sw1; }
                    $pc1 = 44; continue $sw1;
                }
                case 44: {
                    r16 = r12.Hw();
                    r17 = r13.Hw();
                    if (r12.FH() >= r13.FH()) { $pc1 = 47; continue $sw1; }
                    r17 = r17 - (r13.FH() - r12.FH());
                    $pc1 = 48; continue $sw1;
                }
                case 48: {
                    r18 = j6(r10);
                    r19 = r13;
                    r110 = j6(r11);
                    $pc1 = 50; continue $sw1;
                }
                case 50: {
                    if (r12.v5() >= r110.FH()) { $pc1 = 51; continue $sw1; }
                    if (r19.v5() < r18.FH()) { $pc1 = 55; continue $sw1; }
                    r12 = r18;
                    r18 = j6(r10);
                    { $pc1 = 50; continue $sw1; }
                }
                case 55: {
                    r20 = r12.Zo();
                    r21 = r19.Zo();
                    if (r12.v5() >= r19.v5()) { $pc1 = 58; continue $sw1; }
                    r20 = r20 + (r19.v5() - r12.v5());
                    $pc1 = 59; continue $sw1;
                }
                case 59: {
                    r0 = r20 - r16;
                    r2 = r0 - (r21 - r17);
                    if (r2 <= 0) { $pc1 = 62; continue $sw1; }
                    r0 = r0 - r2;
                    $pc1 = 62; continue $sw1;
                }
                case 62: {
                    r111 = r10;
                    r22 = 0;
                    $pc1 = 63; continue $sw1;
                }
                case 63: {
                    if (r22 >= r0) { $pc1 = 68; continue $sw1; }
                    r112 = r11;
                    r113 = r110;
                    if (r1.j6(r26, r16 + r22, r27, r17 + r22) == false) { $pc1 = 69; continue $sw1; }
                    r22 = r22 + 1;
                    r11 = r112;
                    r110 = r113;
                    $pc1 = 69; continue $sw1;
                }
                case 69: {
                    r3 = r0 - r22;
                    r114 = 0;
                    $pc1 = 70; continue $sw1;
                }
                case 70: {
                    if (r114 >= r3) { $pc1 = 75; continue $sw1; }
                    r23 = r18;
                    if (r1.j6(r26, (r20 - r114) - 1, r27, (r21 - r114) - 1) == false) { $pc1 = 76; continue $sw1; }
                    r114 = r114 + 1;
                    r18 = r23;
                    $pc1 = 76; continue $sw1;
                }
                case 76: {
                    r4 = r3 - r114;
                    if (r22 <= 0) { $pc1 = 79; continue $sw1; }
                    r28 = 1;
                    r6.j6(1, r16, r16 + r22, abcd.qF.a.j6);
                    $pc1 = 80; continue $sw1;
                }
                case 80: {
                    if (r4 > 0) { $pc1 = 84; continue $sw1; }
                    if (r2 != 0) { $pc1 = 84; continue $sw1; }
                    $pc1 = 85; continue $sw1;
                }
                case 85: {
                    if (r114 <= 0) { $pc1 = 87; continue $sw1; }
                    r6.j6(r28, r20 - r114, r20, abcd.qF.a.j6);
                    $pc1 = 87; continue $sw1;
                }
                case 87: {
                    r14 = java.lang.Math.max(r12.v5(), r19.v5());
                    r1 = r24;
                    r10 = r111;
                    r11 = r112;
                    r13 = r113;
                    r12 = r23;
                    r7 = 2;
                    r8 = 1;
                    r9 = 0;
                    $pc1 = 84; continue $sw1;
                }
                case 84: {
                    r6.j6(r28, r16 + r22, r20 - r114, abcd.qF.a.DW);
                    r6.j6(2, r17 + r22, r21 - r114, abcd.qF.a.FH);
                    { $pc1 = 85; continue $sw1; }
                }
                case 79: {
                    r28 = 1;
                    { $pc1 = 80; continue $sw1; }
                }
                case 75: {
                    r23 = r18;
                    { $pc1 = 76; continue $sw1; }
                }
                case 68: {
                    r112 = r11;
                    r113 = r110;
                    { $pc1 = 69; continue $sw1; }
                }
                case 58: {
                    r21 = r21 + (r12.v5() - r19.v5());
                    { $pc1 = 59; continue $sw1; }
                }
                case 51: {
                    r19 = r110;
                    r110 = j6(r11);
                    { $pc1 = 50; continue $sw1; }
                }
                case 47: {
                    r16 = r16 - (r12.FH() - r13.FH());
                    { $pc1 = 48; continue $sw1; }
                }
                case 42: {
                    if (r13.FH() == r14) { $pc1 = 44; continue $sw1; }
                    r6.j6(r9, r14, java.lang.Math.min(r12.FH(), r13.FH()), abcd.qF.a.j6);
                    { $pc1 = 44; continue $sw1; }
                }
                case 36: {
                    if (r14 == r13.FH()) { $pc1 = 38; continue $sw1; }
                    r6.j6(r9, r14, r13.FH(), abcd.qF.a.j6);
                    $pc1 = 38; continue $sw1;
                }
                case 38: {
                    r6.j6(r7, r13.Hw(), r13.Zo(), abcd.qF.a.j6);
                    r14 = r13.v5();
                    r13 = j6(r11);
                    { $pc1 = 20; continue $sw1; }
                }
                case 30: {
                    if (r14 == r12.FH()) { $pc1 = 32; continue $sw1; }
                    r6.j6(r9, r14, r12.FH(), abcd.qF.a.j6);
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    r6.j6(r8, r12.Hw(), r12.Zo(), abcd.qF.a.j6);
                    r14 = r12.v5();
                    r12 = j6(r10);
                    { $pc1 = 20; continue $sw1; }
                }
                case 15: {
                    if (this.DW.j6(r1, r25, r26).isEmpty() == true) { $pc1 = 17; continue $sw1; }
                    r6.j6(1, 0, r26.j6(), abcd.qF.a.DW);
                    r6.j6(2, 0, 0, abcd.qF.a.FH);
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    return r6;
                }
                case 17: {
                    r6.j6(2, 0, 0, abcd.qF.a.j6);
                    { $pc1 = 18; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
