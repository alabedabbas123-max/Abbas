package abcd;

public abstract class AbstractSp extends abcd.AbstractKp {
    public AbstractSp(java.lang.String r1, abcd.jp r2, int r3) {
        super(r1, r2, r3);
    }

    @Override
    protected final void FH(abcd.Lt r5) {
        abcd.jp r0 = null;
        int r1 = 0;
        java.util.Iterator<? extends abcd.Abstractvp> r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = DW();
                    r1 = j6();
                    r2 = Hw().iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r2.next().j6(r0, r5);
                    r5.Hw(r1);
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected final void Zo() {
        abcd.jp r0 = null;
        java.util.Iterator<? extends abcd.Abstractvp> r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = DW();
                    tp();
                    r1 = Hw().iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc1 = 6; continue $sw1; }
                    r1.next().j6(r0);
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final int j6(abcd.Abstractvp r2) {
        abcd.Abstractup r3 = (abcd.Abstractup) r2;
        return j6(r3.we() * r3.VH());
    }

    protected abstract void tp();

    @Override
    public final int u7() {
        java.util.Collection<? extends abcd.Abstractvp> r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = Hw();
                    r1 = r0.size();
                    if (r1 != 0) { $pc2 = 7; continue $sw2; }
                    return 0;
                }
                case 7: {
                    return r1 * r0.iterator().next().VH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
