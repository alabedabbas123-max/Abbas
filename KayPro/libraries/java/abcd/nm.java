package abcd;

public final class nm extends abcd.AbstractAm {
    private final abcd.Ss DW;

    public nm(abcd.Ss r2) {
        super("Exceptions");
        if (r2.Zo() == true) goto L8;
        this.DW = r2;
        return;
    L8:
        throw new abcd.iu("exceptions.isMutable()");     // Catch: java.lang.NullPointerException -> L9
    L10:
        throw new java.lang.NullPointerException("exceptions == null");
    }

    @Override
    public int Hw() {
        return (this.DW.size() * 2) + 8;
    }

    public abcd.Ss j6() {
        return this.DW;
    }
}
