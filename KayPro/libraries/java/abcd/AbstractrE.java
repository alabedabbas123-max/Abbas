package abcd;

public abstract class AbstractrE {
    public static final abcd.AbstractrE DW = null;
    public static final abcd.AbstractrE FH = null;
    public static final abcd.AbstractrE Hw = null;
    public static final abcd.AbstractrE Zo = null;
    public static final abcd.AbstractrE j6 = null;
    public static final abcd.AbstractrE v5 = null;
    private final byte[] VH;
    private final int gn;
    private final int u7;

    static {
        j6 = new abcd.kE(16384, 2);
        DW = new abcd.lE(40960, 3);
        FH = new abcd.mE(33188, 3);
        Hw = new abcd.nE(33261, 3);
        v5 = new abcd.oE(57344, 1);
        Zo = new abcd.pE(0, -1);
    }

    private AbstractrE(int r5, int r6) {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        byte[] r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.gn = r5;
                    this.u7 = r6;
                    r0 = 0;
                    if (r5 == 0) { $pc0 = 12; continue $sw0; }
                    r1 = new byte[10];
                    r2 = r1.length;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r5 == 0) { $pc0 = 6; continue $sw0; }
                    r2 = r2 - 1;
                    r1[r2] = (byte) ((r5 & 7) + 48);
                    r5 = r5 >> 3;
                    { $pc0 = 5; continue $sw0; }
                }
                case 6: {
                    this.VH = new byte[r1.length - r2];
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r7 = this.VH;
                    if (r0 >= r7.length) { $pc0 = 16; continue $sw0; }
                    r7[r0] = r1[r2 + r0];
                    r0 = r0 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 16: {
                    return;
                }
                case 12: {
                    this.VH = new byte[]{48};
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    AbstractrE(int r1, int r2, abcd.AbstractrE r3) {
        this(r1, r2);
    }

    public static final abcd.AbstractrE DW(int r2) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 61440 & r2;
                    if (r0 != 0) { $pc1 = 5; continue $sw1; }
                    if (r2 == 0) { $pc1 = 27; continue $sw1; }
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    return new abcd.qE(r2, -1, r2);
                }
                case 27: {
                    return Zo;
                }
                case 5: {
                    if (r0 == 16384) { $pc1 = 24; continue $sw1; }
                    if (r0 == 32768) { $pc1 = 18; continue $sw1; }
                    if (r0 == 40960) { $pc1 = 16; continue $sw1; }
                    if (r0 != 57344) { $pc1 = 29; continue $sw1; }
                    return v5;
                }
                case 16: {
                    return DW;
                }
                case 18: {
                    if ((r2 & 73) == 0) { $pc1 = 22; continue $sw1; }
                    return Hw;
                }
                case 22: {
                    return FH;
                }
                case 24: {
                    return j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.gn;
    }

    public int FH() {
        return this.u7;
    }

    public int j6() {
        return this.VH.length;
    }

    public void j6(java.io.OutputStream r2) {
        r2.write(this.VH);
    }

    public void j6(byte[] r4, int r5) {
        byte[] r0 = this.VH;
        java.lang.System.arraycopy(r0, 0, r4, r5, r0.length);
    }

    public abstract boolean j6(int r1);

    public java.lang.String toString() {
        return java.lang.Integer.toOctalString(this.gn);
    }
}
