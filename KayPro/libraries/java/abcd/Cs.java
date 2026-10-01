package abcd;

public abstract class Cs extends abcd.Ds {
    private final long j6;

    Cs(long r1) {
        this.j6 = r1;
    }

    @Override
    protected int DW(abcd.Abstractms r5) {
        long r0 = ((abcd.Cs) r5).j6;
        long r2 = this.j6;
        if (r2 >= r0) goto L7;
        return -1;
    L7:
        if (r2 <= r0) goto L10;
        return 1;
    L10:
        return 0;
    }

    @Override
    public final boolean Hw() {
        return true;
    }

    @Override
    public final boolean J8() {
        long r0 = this.j6;
        if (((int) r0) != r0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public final int Ws() {
        return (int) this.j6;
    }

    public final boolean equals(java.lang.Object r5) {
        if (r5 != null) goto L4;
    L8:
        return false;
    L4:
        if (getClass() != r5.getClass()) goto L8;
        if (this.j6 != ((abcd.Cs) r5).j6) goto L8;
        return true;
    }

    public final int hashCode() {
        long r0 = this.j6;
        return ((int) r0) ^ ((int) (r0 >> 32));
    }

    @Override
    public final long lg() {
        return this.j6;
    }
}
