package abcd;

public final class Qp extends abcd.AbstractSp {
    private final java.util.TreeMap<abcd.Qs, abcd.Pp> Zo;

    public Qp(abcd.jp r3) {
        super("type_ids", r3, 4);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.Pp DW(abcd.Ks r3) {
        abcd.Qs r0 = null;
        abcd.Pp r1 = null;
        abcd.Pp r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == null) { $pc0 = 8; continue $sw0; }
                    gn();
                    r0 = r3.VH();
                    r1 = this.Zo.get(r0);
                    if (r1 != null) { $pc0 = 9; continue $sw0; }
                    r2 = new abcd.Pp(r3);
                    this.Zo.put(r0, r2);
                    return r2;
                }
                case 9: {
                    return r1;
                }
                case 8: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Pp DW(abcd.Qs r3) {
        abcd.Pp r0 = null;
        abcd.Pp r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 == null) { $pc1 = 8; continue $sw1; }
                    gn();
                    r0 = this.Zo.get(r3);
                    if (r0 != null) { $pc1 = 9; continue $sw1; }
                    r1 = new abcd.Pp(new abcd.Ks(r3));
                    this.Zo.put(r3, r1);
                    return r1;
                }
                case 9: {
                    return r0;
                }
                case 8: {
                    throw new java.lang.NullPointerException("type == null");
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    VH();
                    r0 = this.Zo.size();
                    if (r0 != 0) { $pc2 = 5; continue $sw2; }
                    r1 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r0 > 65536) { $pc2 = 14; continue $sw2; }
                    if (r6.Hw() == false) { $pc2 = 11; continue $sw2; }
                    r6.j6(4, "type_ids_size:   " + abcd.Yt.gn(r0));
                    r6.j6(4, "type_ids_off:    " + abcd.Yt.gn(r1));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r6.writeInt(r0);
                    r6.writeInt(r1);
                    return;
                }
                case 14: {
                    throw new java.lang.UnsupportedOperationException("too many type ids");
                }
                case 5: {
                    r1 = FH();
                    { $pc2 = 7; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Ks r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 == null) { $pc3 = 6; continue $sw3; }
                    return j6(r2.VH());
                }
                case 6: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Qs r4) {
        abcd.Pp r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r4 == null) { $pc4 = 10; continue $sw4; }
                    VH();
                    r0 = this.Zo.get(r4);
                    if (r0 == null) { $pc4 = 8; continue $sw4; }
                    return r0.we();
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("not found: " + r4);
                }
                case 10: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Abstractup j6(abcd.Abstractms r4) {
        abcd.Pp r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r4 == null) { $pc5 = 9; continue $sw5; }
                    VH();
                    r0 = this.Zo.get(((abcd.Ks) r4).VH());
                    if (r0 == null) { $pc5 = 7; continue $sw5; }
                    return r0;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("not found: " + r4);
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
        java.util.Iterator<? extends abcd.Abstractvp> r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = Hw().iterator();
                    r1 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc6 = 6; continue $sw6; }
                    ((abcd.Pp) r0.next()).j6(r1);
                    r1 = r1 + 1;
                    { $pc6 = 4; continue $sw6; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
