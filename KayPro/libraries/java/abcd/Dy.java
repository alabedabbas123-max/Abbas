package abcd;

public final class Dy implements abcd.Fy {
    private long DW;
    private long j6;

    public Dy() {
        this.j6 = 1;
        this.DW = 0;
    }

    @Override
    public long getValue() {
        return (this.DW << 16) | this.j6;
    }

    @Override
    public void j6(long r5) {
        this.j6 = r5 & 65535;
        this.DW = (r5 >> 16) & 65535;
    }

    @Override
    public void reset() {
        this.j6 = 1;
        this.DW = 0;
    }

    @Override
    public void update(byte[] r11, int r12, int r13) {
        long r14 = 0L;
        long r3 = 0L;
        int r0 = 0;
        int r15 = 0;
        int r4 = 0;
        int r1 = 0;
        int r16 = 0;
        int r5 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r13 != 1) { $pc0 = 6; continue $sw0; }
                    this.j6 += (long) (r11[r12] & 255);
                    r14 = this.DW;
                    r3 = this.j6;
                    this.DW = r14 + r3;
                    this.j6 = r3 % 65521;
                    this.DW %= 65521;
                    return;
                }
                case 6: {
                    r0 = r13 / 5552;
                    r15 = r13 % 5552;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r4 = r0 - 1;
                    if (r0 <= 0) { $pc0 = 9; continue $sw0; }
                    r1 = r12;
                    r16 = 5552;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r5 = r16 - 1;
                    if (r16 <= 0) { $pc0 = 17; continue $sw0; }
                    this.j6 += (long) (r11[r1] & 255);
                    this.DW += this.j6;
                    r1 = r1 + 1;
                    r16 = r5;
                    { $pc0 = 15; continue $sw0; }
                }
                case 17: {
                    this.j6 %= 65521;
                    this.DW %= 65521;
                    r12 = r1;
                    r0 = r4;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r2 = r15 - 1;
                    if (r15 <= 0) { $pc0 = 11; continue $sw0; }
                    this.j6 += (long) (r11[r12] & 255);
                    this.DW += this.j6;
                    r12 = r12 + 1;
                    r15 = r2;
                    { $pc0 = 9; continue $sw0; }
                }
                case 11: {
                    this.j6 %= 65521;
                    this.DW %= 65521;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
