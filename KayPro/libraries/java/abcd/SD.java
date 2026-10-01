package abcd;

final class SD extends abcd.MD {
    private final char FH;

    SD(char r1, boolean r2) {
        super(r2);
        this.FH = r1;
    }

    @Override
    protected final boolean DW(char r2) {
        if (r2 == this.FH) goto L6;
        return true;
    L6:
        return false;
    }
}
