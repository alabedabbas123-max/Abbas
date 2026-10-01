package abcd;

public abstract class Bs extends abcd.Ds {
    private final int j6;

    Bs(int r1) {
        this.j6 = r1;
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        int r3 = ((abcd.Bs) r2).j6;
        int r0 = this.j6;
        if (r0 >= r3) goto L6;
        return -1;
    L6:
        if (r0 <= r3) goto L9;
        return 1;
    L9:
        return 0;
    }

    @Override
    public final boolean Hw() {
        return false;
    }

    @Override
    public final boolean J8() {
        return true;
    }

    @Override
    public final int Ws() {
        return this.j6;
    }

    public final boolean equals(java.lang.Object r3) {
        if (r3 != null) goto L4;
    L8:
        return false;
    L4:
        if (getClass() != r3.getClass()) goto L8;
        if (this.j6 != ((abcd.Bs) r3).j6) goto L8;
        return true;
    }

    public final int hashCode() {
        return this.j6;
    }

    @Override
    public final long lg() {
        return this.j6;
    }
}
