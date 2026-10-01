package abcd;

class nE extends abcd.AbstractrE {
    nE(int r2, int r3) {
        super(r2, r3, null);
    }

    @Override
    public boolean j6(int r3) {
        if ((61440 & r3) == 32768) goto L5;
        return false;
    L5:
        if ((r3 & 73) == 0) goto L10;
        return true;
    L10:
        return false;
    }
}
