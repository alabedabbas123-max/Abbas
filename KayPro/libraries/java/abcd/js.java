package abcd;

public final class js extends abcd.Pr {
    private final abcd.Ss Zo;

    public js(abcd.es r7, abcd.hs r8, abcd.cs r9, abcd.Ss r10, abcd.Abstractms r11) {
        super(r7, r8, null, r9, r11);
        if (r7.DW() != 6) goto L10;
        if (r10 == null) goto L8;
        this.Zo = r10;
        return;
    L8:
        throw new java.lang.NullPointerException("catches == null");
    L10:
        throw new java.lang.IllegalArgumentException("bogus branchingness");
    }

    @Override
    public abcd.Ss DW() {
        return this.Zo;
    }

    @Override
    public java.lang.String FH() {
        abcd.Abstractms r0 = tp();
        java.lang.String r1 = r0.aM();
        if ((r0 instanceof abcd.Js) == false) goto L6;
        r1 = ((abcd.Js) r0).lg();
    L6:
        return r1 + " " + abcd.ks.j6(this.Zo);
    }

    @Override
    public abcd.Tr j6(abcd.Qs r8) {
        return new abcd.js(v5(), Zo(), gn(), this.Zo.j6(r8), tp());
    }

    @Override
    public abcd.Tr j6(abcd.bs r7, abcd.cs r8) {
        return new abcd.js(v5(), Zo(), r8, this.Zo, tp());
    }

    @Override
    public void j6(abcd.Tr.b r1) {
        r1.j6(this);
    }
}
