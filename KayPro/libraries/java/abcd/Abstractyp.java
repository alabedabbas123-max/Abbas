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
        abcd.Qp r0 = r8.Ws();
        abcd.Op r1 = r8.J8();
        abcd.Hs r2 = this.FH.we();
        int r3 = r0.j6(aM());
        int r4 = r1.j6(r2.J8());
        int r10 = DW(r8);
        if (r9.Hw() == false) goto L5;
        r9.j6(0, Ws() + ' ' + this.FH.aM());
        java.lang.StringBuilder r5 = new java.lang.StringBuilder();
        r5.append("  class_idx: ");
        r5.append(abcd.Yt.v5(r3));
        r9.j6(2, r5.toString());
        r9.j6(2, java.lang.String.format("  %-10s %s", new java.lang.Object[]{Mr() + ':', abcd.Yt.v5(r10)}));
        r9.j6(4, "  name_idx:  " + abcd.Yt.gn(r4));
    L5:
        r9.writeShort(r3);
        r9.writeShort(r10);
        r9.writeInt(r4);
    }
}
