package abcd;

abstract class CG {
    protected final long DW;
    protected final long FH;
    protected final abcd.aH j6;

    protected CG(abcd.aH r1, long r2, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = this.DW + ((long) r4);
    }

    final int j6() {
        return (int) (this.FH - this.DW);
    }

    protected abstract int j6(int r1, java.util.zip.Inflater r2);

    protected abstract int j6(int r1, byte[] r2, int r3, int r4);

    final int j6(long r3, java.util.zip.Inflater r5) {
        return j6((int) (r3 - this.DW), r5);
    }

    final int j6(long r3, byte[] r5, int r6, int r7) {
        return j6((int) (r3 - this.DW), r5, r6, r7);
    }

    abstract void j6(abcd.OH r1, long r2, int r4, java.security.MessageDigest r5);

    final boolean j6(abcd.aH r3, long r4) {
        if (this.j6 == r3) goto L5;
        return false;
    L5:
        if (this.DW <= r4) goto L7;
        return false;
    L7:
        if (r4 >= this.FH) goto L13;
        return true;
    L13:
        return false;
    }
}
