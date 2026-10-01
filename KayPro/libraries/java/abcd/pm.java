package abcd;

public final class pm extends abcd.AbstractAm {
    private final abcd.Pm DW;

    public pm(abcd.Pm r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super("LineNumberTable");
                    if (r2.Zo() == true) { $pc0 = 8; continue $sw0; }
                    this.DW = r2;
                    return;
                }
                case 8: {
                    try {
                        throw new abcd.iu("lineNumbers.isMutable()");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 10: {
                    throw new java.lang.NullPointerException("lineNumbers == null");
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
        return (this.DW.size() * 4) + 8;
    }

    public abcd.Pm j6() {
        return this.DW;
    }
}
