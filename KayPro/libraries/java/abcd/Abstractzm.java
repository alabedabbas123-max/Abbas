package abcd;

public abstract class Abstractzm extends abcd.AbstractAm {
    private final abcd.Jr DW;
    private final int FH;

    public Abstractzm(java.lang.String r1, abcd.Jr r2, int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1);
                    if (r2.Zo() == true) { $pc0 = 8; continue $sw0; }
                    this.DW = r2;
                    this.FH = r3;
                    return;
                }
                case 8: {
                    try {
                        throw new abcd.iu("annotations.isMutable()");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 10: {
                    throw new java.lang.NullPointerException("annotations == null");
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final int Hw() {
        return this.FH + 6;
    }

    public final abcd.Jr j6() {
        return this.DW;
    }
}
