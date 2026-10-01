package abcd;

public class ClassY<E> implements java.lang.Cloneable {
    private static final java.lang.Object j6 = null;
    private boolean DW;
    private int[] FH;
    private java.lang.Object[] Hw;
    private int v5;

    static {
        j6 = new java.lang.Object();
    }

    public ClassY() {
        this(10);
    }

    public ClassY(int r3) {
        this.DW = false;
        if (r3 != 0) goto L5;
        this.FH = abcd.ClassN.j6;
        this.Hw = abcd.ClassN.FH;
    L6:
        this.v5 = 0;
        return;
    L5:
        int r4 = abcd.ClassN.DW(r3);
        this.FH = new int[r4];
        this.Hw = new java.lang.Object[r4];
        goto L6
    }

    private void FH() {
        int r0 = this.v5;
        int[] r1 = this.FH;
        java.lang.Object[] r2 = this.Hw;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r0) goto L10;
        java.lang.Object r6 = r2[r4];
        if (r6 == j6) goto L9;
        if (r4 == r5) goto L8;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L8:
        r5 = r5 + 1;
    L9:
        r4 = r4 + 1;
        goto L3
    L10:
        this.DW = false;
        this.v5 = r5;
    }

    public int DW() {
        if (this.DW == false) goto L6;
        FH();
    L6:
        return this.v5;
    }

    public E DW(int r2) {
        return j6(r2, null);
    }

    public void DW(int r7, E r8) {
        int r0 = abcd.ClassN.j6(this.FH, this.v5, r7);
        if (r0 < 0) goto L5;
        this.Hw[r0] = r8;
        return;
    L5:
        int r1 = r0 ^ (-1);
        if (r1 >= this.v5) goto L12;
        java.lang.Object[] r2 = this.Hw;
        if (r2[r1] != j6) goto L12;
        this.FH[r1] = r7;
        r2[r1] = r8;
        return;
    L12:
        if (this.DW == true) goto L14;
    L16:
        int r3 = this.v5;
        if (r3 < this.FH.length) goto L19;
        int r4 = abcd.ClassN.DW(r3 + 1);
        int[] r5 = new int[r4];
        java.lang.Object[] r6 = new java.lang.Object[r4];
        int[] r9 = this.FH;
        java.lang.System.arraycopy(r9, 0, r5, 0, r9.length);
        java.lang.Object[] r10 = this.Hw;
        java.lang.System.arraycopy(r10, 0, r6, 0, r10.length);
        this.FH = r5;
        this.Hw = r6;
    L19:
        int r11 = this.v5;
        if ((r11 - r1) == 0) goto L22;
        int[] r12 = this.FH;
        int r13 = r1 + 1;
        java.lang.System.arraycopy(r12, r1, r12, r13, r11 - r1);
        java.lang.Object[] r14 = this.Hw;
        java.lang.System.arraycopy(r14, r1, r14, r13, this.v5 - r1);
    L22:
        this.FH[r1] = r7;
        this.Hw[r1] = r8;
        this.v5++;
        return;
    L14:
        if (this.v5 < this.FH.length) goto L16;
        FH();
        r1 = abcd.ClassN.j6(this.FH, this.v5, r7) ^ (-1);
        goto L16
    }

    public int FH(int r3) {
        if (this.DW == false) goto L6;
        FH();
    L6:
        return abcd.ClassN.j6(this.FH, this.v5, r3);
    }

    public int Hw(int r2) {
        if (this.DW == false) goto L6;
        FH();
    L6:
        return this.FH[r2];
    }

    public E Zo(int r2) {
        if (this.DW == false) goto L6;
        FH();
    L6:
        return (E) this.Hw[r2];
    }

    public y<E> clone() {
        abcd.ClassY r1 = (abcd.ClassY) super.clone();     // Catch: java.lang.CloneNotSupportedException -> L6
        r1.FH = (int[]) this.FH.clone();     // Catch: java.lang.CloneNotSupportedException -> L8
        r1.Hw = (java.lang.Object[]) this.Hw.clone();     // Catch: java.lang.CloneNotSupportedException -> L8
        return r1;
    L14:
        return r1;
    L7:
        return null;
    }

    public java.lang.Object m37clone() {
        return clone();
    }

    public E j6(int r4, E r5) {
        int r6 = abcd.ClassN.j6(this.FH, this.v5, r4);
        if (r6 < 0) goto L9;
        java.lang.Object[] r0 = this.Hw;
        if (r0[r6] == j6) goto L9;
        return (E) r0[r6];
    L9:
        return r5;
    }

    public void j6() {
        int r0 = this.v5;
        java.lang.Object[] r1 = this.Hw;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        r1[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.v5 = 0;
        this.DW = false;
    }

    public void j6(int r4) {
        int r5 = abcd.ClassN.j6(this.FH, this.v5, r4);
        if (r5 < 0) goto L8;
        java.lang.Object[] r0 = this.Hw;
        java.lang.Object r1 = r0[r5];
        java.lang.Object r2 = j6;
        if (r1 == r2) goto L9;
        r0[r5] = r2;
        this.DW = true;
        return;
    L9:
        return;
    }

    public java.lang.String toString() {
        if (DW() > 0) goto L6;
        return "{}";
    L6:
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(this.v5 * 28);
        r0.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.v5) goto L16;
        if (r1 <= 0) goto L11;
        r0.append(", ");
    L11:
        r0.append(Hw(r1));
        r0.append('=');
        E r2 = Zo(r1);
        if (r2 == this) goto L14;
        r0.append(r2);
    L15:
        r1 = r1 + 1;
        goto L8
    L14:
        r0.append("(this Map)");
        goto L15
    L16:
        r0.append('}');
        return r0.toString();
    }

    public void v5(int r1) {
        j6(r1);
    }
}
