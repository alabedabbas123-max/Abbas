package abcd;

public final class Rp extends abcd.AbstractGp {
    private final abcd.Ss v5;

    public Rp(abcd.Ss r3) {
        super(4, (r3.size() * 2) + 4);
        this.v5 = r3;
    }

    @Override
    protected int DW(abcd.AbstractGp r2) {
        return abcd.Ps.j6(this.v5, ((abcd.Rp) r2).v5);
    }

    @Override
    protected void DW(abcd.jp r9, abcd.Lt r10) {
        abcd.Qp r11 = null;
        int r0 = 0;
        int r2 = 0;
        int r1 = 0;
        abcd.Qs r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r11 = r9.Ws();
                    r0 = this.v5.size();
                    r2 = 0;
                    if (r10.Hw() == false) { $pc0 = 7; continue $sw0; }
                    r10.j6(0, Ws() + " type_list");
                    r10.j6(4, "  size: " + abcd.Yt.gn(r0));
                    r1 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r1 >= r0) { $pc0 = 7; continue $sw0; }
                    r3 = this.v5.getType(r1);
                    r10.j6(2, "  " + abcd.Yt.v5(r11.j6(r3)) + " // " + r3.aM());
                    r1 = r1 + 1;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r10.writeInt(r0);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r2 >= r0) { $pc0 = 10; continue $sw0; }
                    r10.writeShort(r11.j6(this.v5.getType(r2)));
                    r2 = r2 + 1;
                    { $pc0 = 8; continue $sw0; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.u7;
    }

    @Override
    public java.lang.String aM() {
        throw new java.lang.RuntimeException("unsupported");
    }

    public int hashCode() {
        return abcd.Ps.j6(this.v5);
    }

    public abcd.Ss j3() {
        return this.v5;
    }

    @Override
    public void j6(abcd.jp r4) {
        abcd.Qp r5 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r5 = r4.Ws();
                    r0 = this.v5.size();
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r0) { $pc1 = 5; continue $sw1; }
                    r5.DW(this.v5.getType(r1));
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
