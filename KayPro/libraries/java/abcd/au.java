package abcd;

public final class au extends abcd.hu {
    public static final abcd.au DW = null;
    private int[] FH;
    private int Hw;
    private boolean v5;

    static {
        DW = new abcd.au(0);
        DW.we();
    }

    public au() {
        this(4);
    }

    public au(int r2) {
        super(true);
        this.FH = new int[r2];     // Catch: java.lang.NegativeArraySizeException -> L6
        this.Hw = 0;
        this.v5 = true;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("size < 0");
    }

    public static abcd.au DW(int r2, int r3) {
        abcd.au r0 = new abcd.au(2);
        r0.DW(r2);
        r0.DW(r3);
        r0.we();
        return r0;
    }

    public static abcd.au Zo(int r2) {
        abcd.au r0 = new abcd.au(1);
        r0.DW(r2);
        r0.we();
        return r0;
    }

    private void gW() {
        int r0 = this.Hw;
        int[] r1 = this.FH;
        if (r0 != r1.length) goto L6;
        int[] r2 = new int[((r0 * 3) / 2) + 10];
        java.lang.System.arraycopy(r1, 0, r2, 0, r0);
        this.FH = r2;
        return;
    }

    public void DW(int r4) {
        J8();
        gW();
        int[] r0 = this.FH;
        int r1 = this.Hw;
        this.Hw = r1 + 1;
        r0[r1] = r4;
        if (this.v5 == false) goto L12;
        int r2 = this.Hw;
        boolean r3 = true;
        if (r2 > 1) goto L7;
        return;
    L7:
        if (r4 >= r0[r2 - 2]) goto L10;
        r3 = false;
    L10:
        this.v5 = r3;
        return;
    }

    public int FH(int r6) {
        int r0 = this.Hw;
        if (this.v5 == true) goto L12;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L11;
        if (this.FH[r1] == r6) goto L8;
        r1 = r1 + 1;
        goto L5
    L8:
        return r1;
    L11:
        return -r0;
    L12:
        int r2 = r0;
        int r3 = -1;
    L14:
        if (r2 <= (r3 + 1)) goto L19;
        int r4 = ((r2 - r3) >> 1) + r3;
        if (r6 <= this.FH[r4]) goto L17;
        r3 = r4;
        goto L14
    L17:
        r2 = r4;
        goto L14
    L19:
        if (r2 == r0) goto L26;
        if (r6 != this.FH[r2]) goto L24;
        return r2;
    L24:
        return (-r2) - 1;
    L26:
        return (-r0) - 1;
    }

    public void FH(int r2, int r3) {
        J8();
        if (r2 >= this.Hw) goto L12;
        this.FH[r2] = r3;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
        this.v5 = false;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
        return;
    L7:
        if (r2 < 0) goto L10;
        return;
    L10:
        throw new java.lang.IllegalArgumentException("n < 0");
    L12:
        throw new java.lang.IndexOutOfBoundsException("n >= size()");
    }

    public boolean Hw(int r1) {
        if (v5(r1) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public void VH(int r4) {
        int r0 = this.Hw;
        if (r4 >= r0) goto L7;
        int[] r1 = this.FH;
        java.lang.System.arraycopy(r1, r4 + 1, r1, r4, (r0 - r4) - 1);
        this.Hw--;
        return;
    L7:
        throw new java.lang.IndexOutOfBoundsException("n >= size()");
    }

    public boolean equals(java.lang.Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof abcd.au) == true) goto L8;
        return false;
    L8:
        abcd.au r7 = (abcd.au) r6;
        if (this.v5 == r7.v5) goto L12;
        return false;
    L12:
        if (this.Hw == r7.Hw) goto L14;
        return false;
    L14:
        int r1 = 0;
    L16:
        if (r1 >= this.Hw) goto L21;
        if (this.FH[r1] != r7.FH[r1]) goto L19;
        r1 = r1 + 1;
        goto L16
    L19:
        return false;
    L21:
        return true;
    }

    public void er() {
        J8();
        if (this.v5 == true) goto L6;
        java.util.Arrays.sort(this.FH, 0, this.Hw);
        this.v5 = true;
        return;
    }

    public int get(int r2) {
        if (r2 >= this.Hw) goto L9;
        return this.FH[r2];
    L7:
        throw new java.lang.IndexOutOfBoundsException("n < 0");
    L9:
        throw new java.lang.IndexOutOfBoundsException("n >= size()");
    }

    public void gn(int r2) {
        if (r2 < 0) goto L10;
        if (r2 > this.Hw) goto L8;
        J8();
        this.Hw = r2;
        return;
    L8:
        throw new java.lang.IllegalArgumentException("newSize > size");
    L10:
        throw new java.lang.IllegalArgumentException("newSize < 0");
    }

    public int hashCode() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= this.Hw) goto L6;
        r1 = (r1 * 31) + this.FH[r0];
        r0 = r0 + 1;
        goto L4
    L6:
        return r1;
    }

    public void j6(int r5, int r6) {
        if (r5 > this.Hw) goto L18;
        gW();
        int[] r0 = this.FH;
        int r1 = r5 + 1;
        java.lang.System.arraycopy(r0, r5, r0, r1, this.Hw - r5);
        int[] r2 = this.FH;
        r2[r5] = r6;
        boolean r3 = true;
        this.Hw++;
        if (this.v5 == false) goto L14;
        if (r5 == 0) goto L10;
        if (r6 <= r2[r5 - 1]) goto L14;
    L10:
        if (r5 != (this.Hw - 1)) goto L12;
    L15:
        this.v5 = r3;
        return;
    L12:
        if (r6 < this.FH[r1]) goto L15;
    L14:
        r3 = false;
        goto L15
    L18:
        throw new java.lang.IndexOutOfBoundsException("n > size()");
    }

    public abcd.au lg() {
        int r0 = this.Hw;
        abcd.au r1 = new abcd.au(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.DW(this.FH[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public int rN() {
        J8();
        int r0 = get(this.Hw - 1);
        this.Hw--;
        return r0;
    }

    public int size() {
        return this.Hw;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer((this.Hw * 5) + 10);
        r0.append('{');
        int r1 = 0;
    L4:
        if (r1 >= this.Hw) goto L8;
        if (r1 == 0) goto L7;
        r0.append(", ");
    L7:
        r0.append(this.FH[r1]);
        r1 = r1 + 1;
        goto L4
    L8:
        r0.append('}');
        return r0.toString();
    }

    public int v5(int r1) {
        int r2 = FH(r1);
        if (r2 >= 0) goto L7;
        return -1;
    L7:
        return r2;
    }

    public int yS() {
        return get(this.Hw - 1);
    }
}
