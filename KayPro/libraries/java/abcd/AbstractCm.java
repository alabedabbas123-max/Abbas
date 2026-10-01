package abcd;

public abstract class AbstractCm extends abcd.AbstractAm {
    private final abcd.Kr DW;
    private final int FH;

    public AbstractCm(java.lang.String r1, abcd.Kr r2, int r3) {
        super(r1);
        if (r2.Zo() == true) goto L8;
        this.DW = r2;
        this.FH = r3;
        return;
    L8:
        throw new abcd.iu("parameterAnnotations.isMutable()");     // Catch: java.lang.NullPointerException -> L9
    L10:
        throw new java.lang.NullPointerException("parameterAnnotations == null");
    }

    @Override
    public final int Hw() {
        return this.FH + 6;
    }

    public final abcd.Kr j6() {
        return this.DW;
    }
}
