package abcd;

public final class om extends abcd.AbstractAm {
    private final abcd.Dm DW;

    public om(abcd.Dm r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super("InnerClasses");
                    if (r2.Zo() == true) { $pc0 = 8; continue $sw0; }
                    this.DW = r2;
                    return;
                }
                case 8: {
                    try {
                        throw new abcd.iu("innerClasses.isMutable()");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 10: {
                    throw new java.lang.NullPointerException("innerClasses == null");
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int Hw() {
        return (this.DW.size() * 8) + 8;
    }

    public abcd.Dm j6() {
        return this.DW;
    }
}
