package abcd;

public class DK {
    private int DW;
    private long[] j6;

    public DK() {
        this(10);
    }

    public DK(int r1) {
        this.j6 = new long[r1];
    }

    private void DW() {
        long[] r0 = this.j6;
        long[] r1 = new long[((r0.length + 16) * 3) / 2];
        java.lang.System.arraycopy(r0, 0, r1, 0, this.DW);
        this.j6 = r1;
    }

    public boolean DW(long r6) {
        int r1 = 0;
    L4:
        if (r1 >= this.DW) goto L5;
        if (this.j6[r1] == r6) goto L8;
        r1 = r1 + 1;
        goto L4
    L8:
        return true;
    L5:
        return false;
    }

    public long j6(int r4) {
        if (this.DW <= r4) goto L7;
        return this.j6[r4];
    L7:
        throw new java.lang.ArrayIndexOutOfBoundsException(r4);
    }

    public void j6() {
        this.DW = 0;
    }

    public void j6(int r2, long r3) {
        int r0 = this.DW;
        if (r0 < r2) goto L9;
        if (r0 != r2) goto L6;
        j6(r3);
        return;
    L6:
        this.j6[r2] = r3;
        return;
    L9:
        throw new java.lang.ArrayIndexOutOfBoundsException(r2);
    }

    public void j6(long r4) {
        if (this.DW != this.j6.length) goto L5;
        DW();
    L5:
        long[] r0 = this.j6;
        int r1 = this.DW;
        this.DW = r1 + 1;
        r0[r1] = r4;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append('[');
        int r1 = 0;
    L4:
        if (r1 >= this.DW) goto L5;
        if (r1 <= 0) goto L9;
        r0.append(", ");
    L9:
        r0.append(this.j6[r1]);
        r1 = r1 + 1;
        goto L4
    L5:
        r0.append(']');
        return r0.toString();
    }
}
