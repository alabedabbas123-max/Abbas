package abcd;

public abstract class Abstractqs extends abcd.Fs {
    private final abcd.Os FH;
    private abcd.Os Hw;

    Abstractqs(abcd.Ks r1, abcd.Hs r2) {
        super(r1, r2);
        this.FH = abcd.Os.j6(we().VH().we());
        this.Hw = null;
    }

    @Override
    protected final int DW(abcd.Abstractms r2) {
        int r0 = super.DW(r2);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return this.FH.j6(((abcd.Abstractqs) r2).FH);
    }

    public final abcd.Os DW(boolean r2) {
        if (r2 == false) goto L6;
        return this.FH;
    L6:
        if (this.Hw != null) goto L9;
        abcd.Qs r3 = VH().VH();
        this.Hw = this.FH.j6(r3);
    L9:
        return this.Hw;
    }

    public final abcd.Os J8() {
        return this.FH;
    }

    public final boolean Ws() {
        return we().Ws();
    }

    @Override
    public final abcd.Qs getType() {
        return this.FH.we();
    }

    public final int j6(boolean r1) {
        return DW(r1).VH().rN();
    }

    public final boolean lg() {
        return we().lg();
    }
}
