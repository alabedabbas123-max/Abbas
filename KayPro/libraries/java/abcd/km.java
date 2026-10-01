package abcd;

public final class km extends abcd.AbstractAm {
    private final abcd.Ms DW;

    public km(abcd.Ms r2) {
        super("ConstantValue");
        if ((r2 instanceof abcd.Js) == false) goto L5;
    L17:
        this.DW = r2;
        return;
    L5:
        if ((r2 instanceof abcd.ys) == true) goto L17;
        if ((r2 instanceof abcd.Es) == true) goto L17;
        if ((r2 instanceof abcd.xs) == true) goto L17;
        if ((r2 instanceof abcd.us) == true) goto L17;
        if (r2 != null) goto L16;
        throw new java.lang.NullPointerException("constantValue == null");
    L16:
        throw new java.lang.IllegalArgumentException("bad type for constantValue");
    }

    @Override
    public int Hw() {
        return 8;
    }

    public abcd.Ms j6() {
        return this.DW;
    }
}
