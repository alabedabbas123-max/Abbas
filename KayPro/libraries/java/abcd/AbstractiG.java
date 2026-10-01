package abcd;

public abstract class AbstractiG extends abcd.AE.a {
    int EQ;

    AbstractiG(abcd.YD r1) {
        super(r1);
    }

    public final boolean DW(abcd.fG r2) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.EQ;
                    if ((r2.Hw & r0) == 0) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract int aM();

    public final abcd.yE getId() {
        return this;
    }

    public final void j6(abcd.fG r2) {
        int r0 = this.EQ;
        this.EQ = r2.Hw | r0;
    }

    abstract void j6(abcd.qG r1);

    protected void j6(java.lang.StringBuilder r3) {
        char r1 = 0;
        char r0 = 0;
        char r2 = 0;
        char r4 = 0;
        char r5 = 0;
        char r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = '-';
                    if ((this.EQ & 32) == 0) { $pc1 = 5; continue $sw1; }
                    r0 = 'o';
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r3.append(r0);
                    if ((this.EQ & 16) == 0) { $pc1 = 9; continue $sw1; }
                    r2 = 't';
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    r3.append(r2);
                    if ((this.EQ & 8) == 0) { $pc1 = 13; continue $sw1; }
                    r4 = 'r';
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r3.append(r4);
                    if ((this.EQ & 4) == 0) { $pc1 = 17; continue $sw1; }
                    r5 = 'u';
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r3.append(r5);
                    if ((this.EQ & 2) == 0) { $pc1 = 21; continue $sw1; }
                    r6 = 's';
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    r3.append(r6);
                    if ((this.EQ & 1) == 0) { $pc1 = 25; continue $sw1; }
                    r1 = 'p';
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    r3.append(r1);
                    return;
                }
                case 21: {
                    r6 = '-';
                    { $pc1 = 22; continue $sw1; }
                }
                case 17: {
                    r5 = '-';
                    { $pc1 = 18; continue $sw1; }
                }
                case 13: {
                    r4 = '-';
                    { $pc1 = 14; continue $sw1; }
                }
                case 9: {
                    r2 = '-';
                    { $pc1 = 10; continue $sw1; }
                }
                case 5: {
                    r0 = '-';
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(abcd.hE.DW(aM()));
        r0.append(' ');
        r0.append(we());
        r0.append(' ');
        j6(r0);
        return r0.toString();
    }
}
