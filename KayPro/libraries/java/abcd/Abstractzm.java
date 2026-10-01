package abcd;

public abstract class Abstractzm extends abcd.AbstractAm {
    private final abcd.Jr DW;
    private final int FH;

    public Abstractzm(java.lang.String r1, abcd.Jr r2, int r3) {
        super(r1);
        if (r2.Zo() == true) goto L8;
        this.DW = r2;
        this.FH = r3;
        return;
    L8:
        throw new abcd.iu("annotations.isMutable()");     // Catch: java.lang.NullPointerException -> L9
    L10:
        throw new java.lang.NullPointerException("annotations == null");
    }

    @Override
    public final int Hw() {
        return this.FH + 6;
    }

    public final abcd.Jr j6() {
        return this.DW;
    }
}
