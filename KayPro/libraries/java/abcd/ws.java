package abcd;

public final class ws extends abcd.Fs {
    public ws(abcd.Ks r1, abcd.Hs r2) {
        super(r1, r2);
    }

    public static abcd.ws j6(abcd.Qs r2) {
        return new abcd.ws(abcd.Ks.j6(r2), abcd.Hs.j6);
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        int r0 = super.DW(r2);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return we().VH().j6(((abcd.ws) r2).we().VH());
    }

    @Override
    public java.lang.String Zo() {
        return "field";
    }

    @Override
    public abcd.Qs getType() {
        return we().we();
    }
}
