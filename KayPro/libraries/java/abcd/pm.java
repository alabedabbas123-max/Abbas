package abcd;

public final class pm extends abcd.AbstractAm {
    private final abcd.Pm DW;

    public pm(abcd.Pm r2) {
        super("LineNumberTable");
        if (r2.Zo() == true) goto L8;
        this.DW = r2;
        return;
    L8:
        throw new abcd.iu("lineNumbers.isMutable()");     // Catch: java.lang.NullPointerException -> L9
    L10:
        throw new java.lang.NullPointerException("lineNumbers == null");
    }

    @Override
    public int Hw() {
        return (this.DW.size() * 4) + 8;
    }

    public abcd.Pm j6() {
        return this.DW;
    }
}
