package abcd;

public abstract class Abstractyp extends abcd.Abstracttp {
    private final abcd.Fs FH;

    public Abstractyp(abcd.Fs r2) {
        super(r2.VH());
        this.FH = r2;
    }

    protected abstract int DW(abcd.jp r1);

    protected abstract java.lang.String Mr();

    @Override
    public int VH() {
        return 8;
    }

    public final abcd.Fs j3() {
        return this.FH;
    }

    @Override
    public void j6(abcd.jp r2) {
        super.j6(r2);
        r2.J8().DW(j3().we().J8());
    }

    @Override
    public final void j6(abcd.jp r8, abcd.Lt r9) {
        abcd.Qp r0 = null;
        abcd.Op r1 = null;
        abcd.Hs r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r10 = 0;
        java.lang.StringBuilder r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r8.Ws();
                    r1 = r8.J8();
                    r2 = this.FH.we();
                    r3 = r0.j6(aM());
                    r4 = r1.j6(r2.J8());
                    r10 = DW(r8);
                    if (r9.Hw() == false) { $pc0 = 5; continue $sw0; }
                    r9.j6(0, Ws() + ' ' + this.FH.aM());
                    r5 = new java.lang.StringBuilder();
                    r5.append("  class_idx: ");
                    r5.append(abcd.Yt.v5(r3));
                    r9.j6(2, r5.toString());
                    r9.j6(2, java.lang.String.format("  %-10s %s", new java.lang.Object[]{Mr() + ':', abcd.Yt.v5(r10)}));
                    r9.j6(4, "  name_idx:  " + abcd.Yt.gn(r4));
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r9.writeShort(r3);
                    r9.writeShort(r10);
                    r9.writeInt(r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
