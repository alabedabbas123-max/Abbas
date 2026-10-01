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
        abcd.Qp r11 = r9.Ws();
        int r0 = this.v5.size();
        int r2 = 0;
        if (r10.Hw() == false) goto L7;
        r10.j6(0, Ws() + " type_list");
        r10.j6(4, "  size: " + abcd.Yt.gn(r0));
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L7;
        abcd.Qs r3 = this.v5.getType(r1);
        r10.j6(2, "  " + abcd.Yt.v5(r11.j6(r3)) + " // " + r3.aM());
        r1 = r1 + 1;
    L7:
        r10.writeInt(r0);
    L8:
        if (r2 >= r0) goto L10;
        r10.writeShort(r11.j6(this.v5.getType(r2)));
        r2 = r2 + 1;
        goto L8
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
        abcd.Qp r5 = r4.Ws();
        int r0 = this.v5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r5.DW(this.v5.getType(r1));
        r1 = r1 + 1;
        goto L3
    }
}
