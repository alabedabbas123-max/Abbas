package abcd;

public abstract class AbstractBm extends abcd.AbstractAm {
    private final abcd.Qm DW;

    public AbstractBm(java.lang.String r1, abcd.Qm r2) {
        super(r1);
        if (r2.Zo() == true) goto L8;
        this.DW = r2;
        return;
    L8:
        throw new abcd.iu("localVariables.isMutable()");     // Catch: java.lang.NullPointerException -> L9
    L10:
        throw new java.lang.NullPointerException("localVariables == null");
    }

    @Override
    public final int Hw() {
        return (this.DW.size() * 10) + 8;
    }

    public final abcd.Qm j6() {
        return this.DW;
    }
}
