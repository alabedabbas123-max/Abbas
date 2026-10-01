package abcd;

public abstract class Abstractzp extends abcd.AbstractSp {
    public Abstractzp(java.lang.String r2, abcd.jp r3) {
        super(r2, r3, 4);
    }

    @Override
    protected void tp() {
        java.util.Iterator<? extends abcd.Abstractvp> r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = Hw().iterator();
                    r1 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    ((abcd.Abstractyp) r0.next()).j6(r1);
                    r1 = r1 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
