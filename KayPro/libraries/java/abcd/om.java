package abcd;

public final class om extends abcd.AbstractAm {
    private final abcd.Dm DW;

    public om(abcd.Dm r2) {
        super("InnerClasses");
        if (r2.Zo() == true) goto L8;
        this.DW = r2;
        return;
    L8:
        throw new abcd.iu("innerClasses.isMutable()");     // Catch: java.lang.NullPointerException -> L9
    L10:
        throw new java.lang.NullPointerException("innerClasses == null");
    }

    @Override
    public int Hw() {
        return (this.DW.size() * 8) + 8;
    }

    public abcd.Dm j6() {
        return this.DW;
    }
}
