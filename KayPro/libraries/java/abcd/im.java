package abcd;

public final class im extends abcd.AbstractAm {
    private final abcd.Abstractms DW;
    private final int FH;

    public im(abcd.Abstractms r2, int r3) {
        super("AnnotationDefault");
        if (r2 == null) goto L7;
        this.DW = r2;
        this.FH = r3;
        return;
    L7:
        throw new java.lang.NullPointerException("value == null");
    }

    @Override
    public int Hw() {
        return this.FH + 6;
    }

    public abcd.Abstractms j6() {
        return this.DW;
    }
}
