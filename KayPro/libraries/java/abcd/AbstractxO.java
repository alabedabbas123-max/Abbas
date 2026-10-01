package abcd;

public abstract class AbstractxO implements abcd.InterfacetO {
    private int DW;
    private long FH;
    private byte[] j6;

    protected AbstractxO() {
        this.j6 = new byte[4];
        this.DW = 0;
    }

    protected AbstractxO(abcd.AbstractxO r5) {
        this.j6 = new byte[r5.j6.length];
        byte[] r0 = r5.j6;
        java.lang.System.arraycopy(r0, 0, this.j6, 0, r0.length);
        this.DW = r5.DW;
        this.FH = r5.FH;
    }

    protected abstract void DW(byte[] r1, int r2);

    public void FH() {
        long r0 = 0L;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH << 3;
                    j6((byte) -128);
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (this.DW == 0) { $pc0 = 5; continue $sw0; }
                    j6((byte) 0);
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    j6(r0);
                    Hw();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void Hw();

    @Override
    public void j6(byte r5) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6;
                    r1 = this.DW;
                    this.DW = r1 + 1;
                    r0[r1] = r5;
                    if (this.DW != r0.length) { $pc1 = 5; continue $sw1; }
                    DW(r0, 0);
                    this.DW = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    this.FH++;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6(long r1);

    @Override
    public void reset() {
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.FH = 0;
                    this.DW = 0;
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r2 = this.j6;
                    if (r1 >= r2.length) { $pc2 = 5; continue $sw2; }
                    r2[r1] = 0;
                    r1 = r1 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void update(byte[] r6, int r7, int r8) {
        byte[] r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 3: {
                    if (this.DW == 0) { $pc3 = 8; continue $sw3; }
                    if (r8 <= 0) { $pc3 = 8; continue $sw3; }
                    j6(r6[r7]);
                    r7 = r7 + 1;
                    r8 = r8 - 1;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r8 <= this.j6.length) { $pc3 = 9; continue $sw3; }
                    DW(r6, r7);
                    r0 = this.j6;
                    r7 = r7 + r0.length;
                    r8 = r8 - r0.length;
                    this.FH += (long) r0.length;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (r8 <= 0) { $pc3 = 10; continue $sw3; }
                    j6(r6[r7]);
                    r7 = r7 + 1;
                    r8 = r8 - 1;
                    { $pc3 = 9; continue $sw3; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
