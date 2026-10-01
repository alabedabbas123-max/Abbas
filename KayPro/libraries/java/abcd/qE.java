package abcd;

class qE extends abcd.AbstractrE {
    private final int tp;

    qE(int r1, int r2, int r3) {
        this.tp = r3;
        super(r1, r2, null);
    }

    @Override
    public boolean j6(int r2) {
        if (this.tp != r2) goto L6;
        return true;
    L6:
        return false;
    }
}
