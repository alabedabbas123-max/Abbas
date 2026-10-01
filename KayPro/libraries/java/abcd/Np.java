package abcd;

public final class Np extends abcd.Abstractup implements java.lang.Comparable {
    private final abcd.Js DW;
    private abcd.Mp FH;

    public Np(abcd.Js r2) {
        if (r2 == null) goto L7;
        this.DW = r2;
        this.FH = null;
        return;
    L7:
        throw new java.lang.NullPointerException("value == null");
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.DW;
    }

    @Override
    public int VH() {
        return 4;
    }

    public abcd.Js aM() {
        return this.DW;
    }

    @Override
    public int compareTo(java.lang.Object r2) {
        return this.DW.j6(((abcd.Np) r2).DW);
    }

    public boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.Np) == true) goto L7;
        return false;
    L7:
        return this.DW.equals(((abcd.Np) r2).DW);
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    @Override
    public void j6(abcd.jp r3) {
        if (this.FH != null) goto L6;
        abcd.Fp r4 = r3.J0();
        this.FH = new abcd.Mp(this.DW);
        r4.j6(this.FH);
        return;
    }

    @Override
    public void j6(abcd.jp r5, abcd.Lt r6) {
        int r7 = this.FH.we();
        if (r6.Hw() == false) goto L5;
        r6.j6(0, Ws() + ' ' + this.DW.j6(100));
        java.lang.StringBuilder r1 = new java.lang.StringBuilder();
        r1.append("  string_data_off: ");
        r1.append(abcd.Yt.gn(r7));
        r6.j6(4, r1.toString());
    L5:
        r6.writeInt(r7);
    }
}
