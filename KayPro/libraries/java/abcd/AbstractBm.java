package abcd;

public abstract class AbstractBm extends abcd.AbstractAm {
    private final abcd.Qm DW;

    public AbstractBm(java.lang.String r1, abcd.Qm r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1);
                    if (r2.Zo() == true) { $pc0 = 8; continue $sw0; }
                    this.DW = r2;
                    return;
                }
                case 8: {
                    try {
                        throw new abcd.iu("localVariables.isMutable()");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 10: {
                    throw new java.lang.NullPointerException("localVariables == null");
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
        return (this.DW.size() * 10) + 8;
    }

    public final abcd.Qm j6() {
        return this.DW;
    }
}
