package abcd;

public class Wp {
    private final int[] DW;
    private final int[] FH;
    private final int[] Hw;
    private final int[] VH;
    private final int[] Zo;
    private final int j6;
    private final int[] v5;

    public Wp(int r1, int[] r2, int[] r3, int[] r4, int[] r5, int[] r6, int[] r7) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.VH = r7;
    }

    public int[] DW() {
        return this.FH;
    }

    public int[] FH() {
        return this.DW;
    }

    public int[] Hw() {
        return this.v5;
    }

    public int[] VH() {
        return this.Zo;
    }

    public int[] Zo() {
        return this.VH;
    }

    public int j6() {
        return this.j6;
    }

    public void j6(abcd.hr.a r5) {
        int r0 = 0;
        int r1 = 0;
        int[] r2 = null;
        int r3 = 0;
        int[] r4 = null;
        int[] r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r5.writeInt(this.j6);
                    r5.writeInt(this.DW.length);
                    r5.writeInt(this.Hw.length);
                    r5.writeInt(this.Zo.length);
                    r0 = 0;
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r2 = this.DW;
                    if (r1 >= r2.length) { $pc0 = 6; continue $sw0; }
                    r5.writeInt(r2[r1]);
                    r5.writeInt(this.FH[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 6: {
                    r3 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r4 = this.Hw;
                    if (r3 >= r4.length) { $pc0 = 10; continue $sw0; }
                    r5.writeInt(r4[r3]);
                    r5.writeInt(this.v5[r3]);
                    r3 = r3 + 1;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r6 = this.Zo;
                    if (r0 >= r6.length) { $pc0 = 13; continue $sw0; }
                    r5.writeInt(r6[r0]);
                    r5.writeInt(this.VH[r0]);
                    r0 = r0 + 1;
                    { $pc0 = 10; continue $sw0; }
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int[] v5() {
        return this.Hw;
    }
}
