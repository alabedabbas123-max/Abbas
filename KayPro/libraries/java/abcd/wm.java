package abcd;

public final class wm extends abcd.AbstractAm {
    private final abcd.Js DW;

    public wm(abcd.Js r2) {
        super("Signature");
        if (r2 == null) goto L7;
        this.DW = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("signature == null");
    }

    @Override
    public int Hw() {
        return 8;
    }

    public abcd.Js j6() {
        return this.DW;
    }
}
