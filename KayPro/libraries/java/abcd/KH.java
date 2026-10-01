package abcd;

class KH {
    private int DW;
    private int[] j6;

    KH() {
        this.j6 = new int[64];
    }

    boolean j6(int r8) {
        int r0 = this.DW;
        if (r0 != 0) goto L6;
        this.j6[0] = r8;
        this.DW = 1;
        return true;
    L6:
        int r3 = r0;
        int r1 = 0;
    L7:
        int r4 = (r1 + r3) >>> 1;
        int[] r5 = this.j6;
        if (r8 >= r5[r4]) goto L11;
        r3 = r4;
    L14:
        if (r1 < r3) goto L7;
        int r6 = this.DW;
        int[] r7 = this.j6;
        if (r6 != r7.length) goto L18;
        int[] r9 = new int[r7.length * 2];
        java.lang.System.arraycopy(r7, 0, r9, 0, r6);
        this.j6 = r9;
    L18:
        int r2 = this.DW;
        if (r1 >= r2) goto L21;
        int[] r10 = this.j6;
        java.lang.System.arraycopy(r10, r1, r10, r1 + 1, r2 - r1);
    L21:
        this.j6[r1] = r8;
        this.DW++;
        return true;
    L11:
        if (r8 == r5[r4]) goto L12;
        r1 = r4 + 1;
        goto L14
    L12:
        return false;
    }
}
