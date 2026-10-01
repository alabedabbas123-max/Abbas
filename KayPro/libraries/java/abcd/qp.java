package abcd;

public final class qp extends abcd.Abstractzp {
    private final java.util.TreeMap<abcd.ws, abcd.pp> Zo;

    public qp(abcd.jp r2) {
        super("field_ids", r2);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.pp DW(abcd.ws r3) {
        abcd.pp r0 = null;
        abcd.pp r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == null) { $pc0 = 8; continue $sw0; }
                    gn();
                    r0 = this.Zo.get(r3);
                    if (r0 != null) { $pc0 = 9; continue $sw0; }
                    r1 = new abcd.pp(r3);
                    this.Zo.put(r3, r1);
                    return r1;
                }
                case 9: {
                    return r0;
                }
                case 8: {
                    throw new java.lang.NullPointerException("field == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Collection<? extends abcd.Abstractvp> Hw() {
        return this.Zo.values();
    }

    public void Hw(abcd.Lt r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    VH();
                    r0 = this.Zo.size();
                    if (r0 != 0) { $pc1 = 5; continue $sw1; }
                    r1 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r6.Hw() == false) { $pc1 = 9; continue $sw1; }
                    r6.j6(4, "field_ids_size:  " + abcd.Yt.gn(r0));
                    r6.j6(4, "field_ids_off:   " + abcd.Yt.gn(r1));
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    r6.writeInt(r0);
                    r6.writeInt(r1);
                    return;
                }
                case 5: {
                    r1 = FH();
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.ws r2) {
        abcd.pp r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 10; continue $sw2; }
                    VH();
                    r3 = this.Zo.get(r2);
                    if (r3 == null) { $pc2 = 8; continue $sw2; }
                    return r3.we();
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("not found");
                }
                case 10: {
                    throw new java.lang.NullPointerException("ref == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Abstractup j6(abcd.Abstractms r2) {
        abcd.pp r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 == null) { $pc3 = 9; continue $sw3; }
                    VH();
                    r3 = this.Zo.get((abcd.ws) r2);
                    if (r3 == null) { $pc3 = 7; continue $sw3; }
                    return r3;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("not found");
                }
                case 9: {
                    throw new java.lang.NullPointerException("cst == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
