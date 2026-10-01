package abcd;

public class Hy implements java.lang.Cloneable {
    private boolean DW;
    boolean EQ;
    long FH;
    int Hw;
    byte[] VH;
    byte[] Zo;
    byte[] gn;
    boolean j6;
    long tp;
    int u7;
    int v5;
    long we;

    public Hy() {
        this.j6 = false;
        this.DW = false;
        this.v5 = 255;
        this.EQ = false;
        this.we = 0;
    }

    public java.lang.Object clone() {
        abcd.Hy r0 = null;
        byte[] r1 = null;
        byte[] r3 = null;
        byte[] r2 = null;
        byte[] r4 = null;
        byte[] r5 = null;
        byte[] r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (abcd.Hy) super.clone();
                    r1 = r0.Zo;
                    if (r1 == null) { $pc0 = 5; continue $sw0; }
                    r3 = new byte[r1.length];
                    java.lang.System.arraycopy(r1, 0, r3, 0, r3.length);
                    r0.Zo = r3;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r2 = r0.VH;
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    r4 = new byte[r2.length];
                    java.lang.System.arraycopy(r2, 0, r4, 0, r4.length);
                    r0.VH = r4;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r5 = r0.gn;
                    if (r5 == null) { $pc0 = 11; continue $sw0; }
                    r6 = new byte[r5.length];
                    java.lang.System.arraycopy(r5, 0, r6, 0, r6.length);
                    r0.gn = r6;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(long r1) {
        this.tp = r1;
    }

    void j6(abcd.Gy r7) {
        int r0 = 0;
        int r3 = 0;
        int r1 = 0;
        byte[] r2 = null;
        byte[] r4 = null;
        byte[] r5 = null;
        byte[] r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 == false) { $pc1 = 5; continue $sw1; }
                    r0 = 1;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (this.DW == false) { $pc1 = 10; continue $sw1; }
                    r0 = r0 | 2;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (this.Zo == null) { $pc1 = 13; continue $sw1; }
                    r0 = r0 | 4;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (this.VH == null) { $pc1 = 16; continue $sw1; }
                    r0 = r0 | 8;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (this.gn == null) { $pc1 = 18; continue $sw1; }
                    r0 = r0 | 16;
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r3 = r7.ro;
                    if (r3 != 1) { $pc1 = 22; continue $sw1; }
                    r1 = 4;
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    r7.VH(-29921);
                    r7.j6((byte) 8);
                    r7.j6((byte) r0);
                    r7.j6((byte) this.we);
                    r7.j6((byte) (this.we >> 8));
                    r7.j6((byte) (this.we >> 16));
                    r7.j6((byte) (this.we >> 24));
                    r7.j6((byte) r1);
                    r7.j6((byte) this.v5);
                    r2 = this.Zo;
                    if (r2 == null) { $pc1 = 28; continue $sw1; }
                    r7.j6((byte) r2.length);
                    r7.j6((byte) (this.Zo.length >> 8));
                    r4 = this.Zo;
                    r7.j6(r4, 0, r4.length);
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    r5 = this.VH;
                    if (r5 == null) { $pc1 = 31; continue $sw1; }
                    r7.j6(r5, 0, r5.length);
                    r7.j6((byte) 0);
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    r6 = this.gn;
                    if (r6 == null) { $pc1 = 35; continue $sw1; }
                    r7.j6(r6, 0, r6.length);
                    r7.j6((byte) 0);
                    return;
                }
                case 35: {
                    return;
                }
                case 22: {
                    if (r3 != 9) { $pc1 = 24; continue $sw1; }
                    r1 = 2;
                    { $pc1 = 25; continue $sw1; }
                }
                case 24: {
                    r1 = 0;
                    { $pc1 = 25; continue $sw1; }
                }
                case 5: {
                    r0 = 0;
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
