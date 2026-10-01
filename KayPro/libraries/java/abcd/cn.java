package abcd;

public final class cn extends abcd.hu {
    private final abcd.au DW;
    private final abcd.au FH;
    private int Hw;

    public cn(int r3) {
        super(true);
        this.DW = new abcd.au(r3);
        this.FH = new abcd.au(r3 + 1);
        this.Hw = r3;
    }

    public int DW(int r2) {
        return this.FH.get(r2);
    }

    public int FH(int r2) {
        return this.DW.get(r2);
    }

    public void Hw(int r3) {
        J8();
        if (r3 < 0) goto L11;
        if (this.FH.size() != this.Hw) goto L9;
        this.FH.DW(r3);
        return;
    L9:
        throw new java.lang.RuntimeException("non-default elements not all set");
    L11:
        throw new java.lang.IllegalArgumentException("target < 0");
    }

    public abcd.au er() {
        return this.DW;
    }

    public void j6(int r2, int r3) {
        J8();
        if (r3 < 0) goto L7;
        this.DW.DW(r2);
        this.FH.DW(r3);
        return;
    L7:
        throw new java.lang.IllegalArgumentException("target < 0");
    }

    public int lg() {
        return this.FH.get(this.Hw);
    }

    public abcd.au rN() {
        return this.FH;
    }

    public int size() {
        return this.Hw;
    }

    @Override
    public void we() {
        this.DW.we();
        this.FH.we();
        super.we();
    }

    public void yS() {
        J8();
        int r0 = this.Hw;
        if (r0 != (this.FH.size() - 1)) goto L16;
        int r1 = this.FH.get(r0);
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r2 >= r0) goto L12;
        int r4 = this.FH.get(r2);
        if (r4 == r1) goto L11;
        if (r2 == r3) goto L10;
        this.FH.FH(r3, r4);
        abcd.au r5 = this.DW;
        r5.FH(r3, r5.get(r2));
    L10:
        r3 = r3 + 1;
    L11:
        r2 = r2 + 1;
        goto L5
    L12:
        if (r3 == r0) goto L21;
        this.DW.gn(r3);
        this.FH.FH(r3, r1);
        this.FH.gn(r3 + 1);
        this.Hw = r3;
        return;
    L21:
        return;
    L16:
        throw new java.lang.IllegalArgumentException("incomplete instance");
    }
}
