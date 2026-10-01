package abcd;

public final class xm extends abcd.AbstractAm {
    private final abcd.Js DW;

    public xm(abcd.Js r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super("SourceFile");
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("sourceFile == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int Hw() {
        return 8;
    }

    public abcd.Js j6() {
        return this.DW;
    }
}
