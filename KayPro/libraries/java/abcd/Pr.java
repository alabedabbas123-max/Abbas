package abcd;

public abstract class Pr extends abcd.Tr {
    private final abcd.Abstractms v5;

    public Pr(abcd.es r1, abcd.hs r2, abcd.bs r3, abcd.cs r4, abcd.Abstractms r5) {
        super(r1, r2, r3, r4);
        if (r5 == null) goto L7;
        this.v5 = r5;
        return;
    L7:
        throw new java.lang.NullPointerException("cst == null");
    }

    @Override
    public java.lang.String FH() {
        return this.v5.aM();
    }

    @Override
    public boolean j6(abcd.Tr r2) {
        if (super.j6(r2) == true) goto L5;
    L7:
        return false;
    L5:
        if (this.v5.equals(((abcd.Pr) r2).tp()) == false) goto L7;
        return true;
    }

    public abcd.Abstractms tp() {
        return this.v5;
    }
}
