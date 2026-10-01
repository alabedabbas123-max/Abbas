package abcd;

public final class jm extends abcd.AbstractAm {
    private final int DW;
    private final int FH;
    private final abcd.Lm Hw;
    private final abcd.Interfacepn Zo;
    private final abcd.Jm v5;

    public jm(int r2, int r3, abcd.Lm r4, abcd.Jm r5, abcd.Interfacepn r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super("Code");
                    if (r2 < 0) { $pc0 = 25; continue $sw0; }
                    if (r3 < 0) { $pc0 = 23; continue $sw0; }
                    if (r4 == null) { $pc0 = 21; continue $sw0; }
                    if (r5.Zo() == true) { $pc0 = 17; continue $sw0; }
                    if (r6.Zo() == true) { $pc0 = 13; continue $sw0; }
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = r4;
                    this.v5 = r5;
                    this.Zo = r6;
                    return;
                }
                case 13: {
                    try {
                        throw new abcd.iu("attributes.isMutable()");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 15: {
                    throw new java.lang.NullPointerException("attributes == null");
                }
                case 17: {
                    try {
                        throw new abcd.iu("catches.isMutable()");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 19: {
                    throw new java.lang.NullPointerException("catches == null");
                }
                case 21: {
                    throw new java.lang.NullPointerException("code == null");
                }
                case 23: {
                    throw new java.lang.IllegalArgumentException("maxLocals < 0");
                }
                case 25: {
                    throw new java.lang.IllegalArgumentException("maxStack < 0");
                }
                case 14: {
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Jm DW() {
        return this.v5;
    }

    public abcd.Lm FH() {
        return this.Hw;
    }

    @Override
    public int Hw() {
        return ((this.Hw.j6() + 10) + this.v5.Hw()) + this.Zo.Hw();
    }

    public int Zo() {
        return this.DW;
    }

    public abcd.Interfacepn j6() {
        return this.Zo;
    }

    public int v5() {
        return this.FH;
    }
}
