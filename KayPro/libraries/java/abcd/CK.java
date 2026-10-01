package abcd;

public class CK {
    private int DW;
    private int[] j6;

    public CK() {
        this(10);
    }

    public CK(int r1) {
        this.j6 = new int[r1];
    }

    private void FH() {
        int[] r0 = this.j6;
        int[] r1 = new int[((r0.length + 16) * 3) / 2];
        java.lang.System.arraycopy(r0, 0, r1, 0, this.DW);
        this.j6 = r1;
    }

    public int DW() {
        return this.DW;
    }

    public int DW(int r2) {
        if (this.DW <= r2) goto L7;
        return this.j6[r2];
    L7:
        throw new java.lang.ArrayIndexOutOfBoundsException(r2);
    }

    public void DW(int r2, int r3) {
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

    public void j6() {
        this.DW = 0;
    }

    public void j6(int r4) {
        if (this.DW != this.j6.length) goto L5;
        FH();
    L5:
        int[] r0 = this.j6;
        int r1 = this.DW;
        this.DW = r1 + 1;
        r0[r1] = r4;
    }

    public void j6(int r2, int r3) {
    L3:
        if (this.DW >= r2) goto L4;
        j6(r3);
        goto L3
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
