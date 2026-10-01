package abcd;

public abstract class AbstractzC extends DC<abcd.tC> {
    public static final abcd.AbstractzC DW = null;
    public static final abcd.AbstractzC FH = null;
    public static final abcd.AbstractzC Hw = null;
    public static final abcd.AbstractzC j6 = null;
    public static final abcd.AbstractzC v5 = null;

    static {
        j6 = new abcd.uC();
        DW = new abcd.vC();
        FH = new abcd.wC();
        Hw = new abcd.xC();
        v5 = new abcd.yC();
    }

    public AbstractzC() {
    }

    private static int DW(abcd.CK r1, int r2, int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    if (r2 <= 0) { $pc0 = 7; continue $sw0; }
                    if (r3 > r1.DW(r2)) { $pc0 = 7; continue $sw0; }
                    r2 = r2 - 1;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(abcd.CK r2, int r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r2.DW() - 2;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r3 >= r0) { $pc1 = 8; continue $sw1; }
                    if (r2.DW(r3 + 2) >= r4) { $pc1 = 8; continue $sw1; }
                    r3 = r3 + 1;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.CC r1, int r2) {
        return j6((abcd.tC) r1, r2);
    }

    public int j6(abcd.tC r3, int r4) {
        int r0 = r3.FH.DW(r4 + 1);
        int r5 = r3.FH.DW(r4 + 2);
        return j6(r3.DW, r0, r5);
    }

    protected abstract int j6(byte[] r1, int r2, int r3);

    public abcd.jC j6(abcd.CC r1, abcd.CC r2, abcd.jC r3) {
        j6((abcd.tC) r1, (abcd.tC) r2, r3);
        return r3;
    }

    public abcd.jC j6(abcd.tC r10, abcd.tC r11, abcd.jC r12) {
        int r0 = 0;
        byte[] r1 = null;
        byte[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        boolean r7 = false;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r12.j6;
                    if (r0 != r12.DW) { $pc2 = 5; continue $sw2; }
                    $pc2 = 41; continue $sw2;
                }
                case 41: {
                    return r12;
                }
                case 5: {
                    if (r12.FH == r12.Hw) { $pc2 = 41; continue $sw2; }
                    r1 = r10.DW;
                    r2 = r11.DW;
                    r3 = r10.FH.DW(r0 + 1);
                    r4 = r10.FH.DW(r12.FH + 1);
                    r5 = r10.FH.DW(r12.DW + 1);
                    r6 = r11.FH.DW(r12.Hw + 1);
                    if (r3 < 0) { $pc2 = 40; continue $sw2; }
                    if (r4 < 0) { $pc2 = 40; continue $sw2; }
                    if (r5 > r1.length) { $pc2 = 40; continue $sw2; }
                    if (r6 > r2.length) { $pc2 = 40; continue $sw2; }
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    if (r3 >= r5) { $pc2 = 20; continue $sw2; }
                    if (r4 >= r6) { $pc2 = 20; continue $sw2; }
                    if (r1[r3] != r2[r4]) { $pc2 = 20; continue $sw2; }
                    r3 = r3 + 1;
                    r4 = r4 + 1;
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    if (r3 >= r5) { $pc2 = 26; continue $sw2; }
                    if (r4 >= r6) { $pc2 = 26; continue $sw2; }
                    if (r1[r5 - 1] != r2[r6 - 1]) { $pc2 = 26; continue $sw2; }
                    r5 = r5 - 1;
                    r6 = r6 - 1;
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    r12.j6 = j6(r10.FH, r12.j6, r3);
                    r12.FH = j6(r11.FH, r12.FH, r4);
                    r12.DW = DW(r10.FH, r12.DW, r5);
                    if (r5 >= r10.FH.DW(r12.DW + 1)) { $pc2 = 29; continue $sw2; }
                    r7 = true;
                    $pc2 = 30; continue $sw2;
                }
                case 30: {
                    if (r7 == false) { $pc2 = 32; continue $sw2; }
                    r6 = r6 + (r10.FH.DW(r12.DW + 1) - r5);
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    r12.Hw = DW(r11.FH, r12.Hw, r6);
                    if (r7 == false) { $pc2 = 35; continue $sw2; }
                    $pc2 = 37; continue $sw2;
                }
                case 37: {
                    super.j6(r10, r11, r12);
                    return r12;
                }
                case 35: {
                    if (r6 >= r11.FH.DW(r12.Hw + 1)) { $pc2 = 37; continue $sw2; }
                    r12.DW++;
                    { $pc2 = 37; continue $sw2; }
                }
                case 29: {
                    r7 = false;
                    $pc2 = 40; continue $sw2;
                }
                case 40: {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
