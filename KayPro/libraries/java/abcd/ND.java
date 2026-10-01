package abcd;

final class ND extends abcd.MD {
    private final char FH;

    protected ND(char r2) {
        super(false);
        this.FH = r2;
    }

    @Override
    protected final boolean DW(char r2) {
        if (r2 != this.FH) goto L6;
        return true;
    L6:
        return false;
    }
}
