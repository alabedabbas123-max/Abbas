package abcd;

public final class Jp extends abcd.AbstractSp {
    private final java.util.TreeMap<abcd.Os, abcd.Ip> Zo;

    public Jp(abcd.jp r3) {
        super("proto_ids", r3, 4);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.Ip DW(abcd.Os r3) {
        abcd.Ip r0 = null;
        abcd.Ip r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == null) { $pc0 = 8; continue $sw0; }
                    gn();
                    r0 = this.Zo.get(r3);
                    if (r0 != null) { $pc0 = 9; continue $sw0; }
                    r1 = new abcd.Ip(r3);
                    this.Zo.put(r3, r1);
                    return r1;
                }
                case 9: {
                    return r0;
                }
                case 8: {
                    throw new java.lang.NullPointerException("prototype == null");
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
                    if (r0 > 65536) { $pc1 = 14; continue $sw1; }
                    if (r6.Hw() == false) { $pc1 = 11; continue $sw1; }
                    r6.j6(4, "proto_ids_size:  " + abcd.Yt.gn(r0));
                    r6.j6(4, "proto_ids_off:   " + abcd.Yt.gn(r1));
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r6.writeInt(r0);
                    r6.writeInt(r1);
                    return;
                }
                case 14: {
                    throw new java.lang.UnsupportedOperationException("too many proto ids");
                }
                case 5: {
                    r1 = FH();
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Os r2) {
        abcd.Ip r3 = null;
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
                    throw new java.lang.NullPointerException("prototype == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void tp() {
        java.util.Iterator<? extends abcd.Abstractvp> r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = Hw().iterator();
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 6; continue $sw3; }
                    ((abcd.Ip) r0.next()).j6(r1);
                    r1 = r1 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
