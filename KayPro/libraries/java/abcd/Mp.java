package abcd;

public final class Mp extends abcd.AbstractGp {
    private final abcd.Js v5;

    public Mp(abcd.Js r3) {
        super(1, j6(r3));
        this.v5 = r3;
    }

    private static int j6(abcd.Js r1) {
        return (abcd.eu.j6(r1.J8()) + r1.Ws()) + 1;
    }

    @Override
    protected int DW(abcd.AbstractGp r2) {
        return this.v5.j6(((abcd.Mp) r2).v5);
    }

    @Override
    public void DW(abcd.jp r5, abcd.Lt r6) {
        abcd.Pt r7 = null;
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7 = this.v5.VH();
                    r0 = this.v5.J8();
                    if (r6.Hw() == false) { $pc0 = 5; continue $sw0; }
                    r6.j6(abcd.eu.j6(r0), "utf16_size: " + abcd.Yt.gn(r0));
                    r6.j6(r7.FH() + 1, this.v5.lg());
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r6.DW(r0);
                    r6.j6(r7);
                    r6.writeByte(0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.J8;
    }

    @Override
    public java.lang.String aM() {
        return this.v5.lg();
    }

    @Override
    public void j6(abcd.jp r1) {
    }
}
