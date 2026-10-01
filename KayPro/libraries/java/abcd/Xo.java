package abcd;

public final class Xo extends abcd.AbstractGp {
    private abcd.Wo v5;

    public Xo(abcd.Wo r2) {
        super(4, 4);
        if (r2 == null) goto L7;
        this.v5 = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("annotations == null");
    }

    @Override
    protected void DW(abcd.jp r4, abcd.Lt r5) {
        int r6 = this.v5.we();
        if (r5.Hw() == false) goto L5;
        r5.j6(4, "  annotations_off: " + abcd.Yt.gn(r6));
    L5:
        r5.writeInt(r6);
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.a8;
    }

    @Override
    public java.lang.String aM() {
        return this.v5.aM();
    }

    @Override
    public void j6(abcd.jp r2) {
        this.v5 = (abcd.Wo) r2.XL().DW(this.v5);
    }
}
