package abcd;

public final class Em extends abcd.AbstractAm {
    private final abcd.Pt DW;
    private final abcd.Interfacens FH;

    public Em(java.lang.String r1, abcd.Pt r2, int r3, int r4, abcd.Interfacens r5) {
        this(r1, r2.j6(r3, r4 + r3), r5);
    }

    public Em(java.lang.String r1, abcd.Pt r2, abcd.Interfacens r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1);
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r2;
                    this.FH = r3;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("data == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int Hw() {
        return this.DW.FH() + 6;
    }
}
