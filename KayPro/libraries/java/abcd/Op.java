package abcd;

public final class Op extends abcd.AbstractSp {
    private final java.util.TreeMap<abcd.Js, abcd.Np> Zo;

    public Op(abcd.jp r3) {
        super("string_ids", r3, 4);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.Np DW(abcd.Js r2) {
        return j6(new abcd.Np(r2));
    }

    @Override
    public java.util.Collection<? extends abcd.Abstractvp> Hw() {
        return this.Zo.values();
    }

    public void Hw(abcd.Lt r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    VH();
                    r0 = this.Zo.size();
                    if (r0 != 0) { $pc0 = 5; continue $sw0; }
                    r1 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r6.Hw() == false) { $pc0 = 9; continue $sw0; }
                    r6.j6(4, "string_ids_size: " + abcd.Yt.gn(r0));
                    r6.j6(4, "string_ids_off:  " + abcd.Yt.gn(r1));
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r6.writeInt(r0);
                    r6.writeInt(r1);
                    return;
                }
                case 5: {
                    r1 = FH();
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Js r2) {
        abcd.Np r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 == null) { $pc1 = 10; continue $sw1; }
                    VH();
                    r3 = this.Zo.get(r2);
                    if (r3 == null) { $pc1 = 8; continue $sw1; }
                    return r3.we();
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("not found");
                }
                case 10: {
                    throw new java.lang.NullPointerException("string == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Np j6(abcd.Np r3) {
        abcd.Js r0 = null;
        abcd.Np r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == null) { $pc2 = 9; continue $sw2; }
                    gn();
                    r0 = r3.aM();
                    r1 = this.Zo.get(r0);
                    if (r1 == null) { $pc2 = 6; continue $sw2; }
                    return r1;
                }
                case 6: {
                    this.Zo.put(r0, r3);
                    return r3;
                }
                case 9: {
                    throw new java.lang.NullPointerException("string == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Abstractup j6(abcd.Abstractms r2) {
        abcd.Np r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 == null) { $pc3 = 9; continue $sw3; }
                    VH();
                    r3 = this.Zo.get((abcd.Js) r2);
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

    @Override
    protected void tp() {
        java.util.Iterator<abcd.Np> r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.Zo.values().iterator();
                    r1 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc4 = 6; continue $sw4; }
                    r0.next().j6(r1);
                    r1 = r1 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
