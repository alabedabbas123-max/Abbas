package abcd;

public abstract class YD implements java.lang.Comparable {
    private static final char[] DW = null;
    private static final byte[] j6 = null;
    int FH;
    int Hw;
    int VH;
    int Zo;
    int v5;

    static {
        j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        DW = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public YD() {
    }

    private byte[] Ws() {
        byte[] r0 = new byte[40];
        j6(r0, 0, this.FH);
        j6(r0, 8, this.Hw);
        j6(r0, 16, this.v5);
        j6(r0, 24, this.Zo);
        j6(r0, 32, this.VH);
        return r0;
    }

    private char[] aM() {
        char[] r0 = new char[40];
        j6(r0);
        return r0;
    }

    private static void j6(java.io.OutputStream r1, int r2) {
        r1.write(r2 >>> 24);
        r1.write(r2 >>> 16);
        r1.write(r2 >>> 8);
        r1.write(r2);
    }

    private static void j6(byte[] r4, int r5, int r6) {
        int r0 = r5 + 7;
    L3:
        if (r0 < r5) goto L7;
        if (r6 == 0) goto L7;
        r4[r0] = j6[r6 & 15];
        r6 = r6 >>> 4;
        r0 = r0 - 1;
    L7:
        if (r0 < r5) goto L8;
        r4[r0] = 48;
        r0 = r0 - 1;
        goto L7
    }

    private void j6(char[] r3) {
        j6(r3, 0, this.FH);
        j6(r3, 8, this.Hw);
        j6(r3, 16, this.v5);
        j6(r3, 24, this.Zo);
        j6(r3, 32, this.VH);
    }

    static void j6(char[] r4, int r5, int r6) {
        int r0 = r5 + 7;
    L3:
        if (r0 < r5) goto L7;
        if (r6 == 0) goto L7;
        r4[r0] = DW[r6 & 15];
        r6 = r6 >>> 4;
        r0 = r0 - 1;
    L7:
        if (r0 < r5) goto L8;
        r4[r0] = '0';
        r0 = r0 - 1;
        goto L7
    }

    public static boolean j6(abcd.YD r3, abcd.YD r4) {
        if (r3 != r4) goto L6;
        return true;
    L6:
        if (r3.Hw == r4.Hw) goto L8;
        return false;
    L8:
        if (r3.v5 == r4.v5) goto L10;
        return false;
    L10:
        if (r3.Zo == r4.Zo) goto L12;
        return false;
    L12:
        if (r3.VH == r4.VH) goto L14;
        return false;
    L14:
        if (r3.FH != r4.FH) goto L21;
        return true;
    L21:
        return false;
    }

    public void DW(java.io.OutputStream r2) {
        r2.write(Ws());
    }

    public void DW(byte[] r3, int r4) {
        abcd.FK.DW(r3, r4, this.FH);
        abcd.FK.DW(r3, r4 + 4, this.Hw);
        abcd.FK.DW(r3, r4 + 8, this.v5);
        abcd.FK.DW(r3, r4 + 12, this.Zo);
        abcd.FK.DW(r3, r4 + 16, this.VH);
    }

    public final boolean DW(abcd.YD r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return j6(this, r1);
    }

    public void FH(byte[] r3, int r4) {
        j6(r3, r4 + 0, this.FH);
        j6(r3, r4 + 8, this.Hw);
        j6(r3, r4 + 16, this.v5);
        j6(r3, r4 + 24, this.Zo);
        j6(r3, r4 + 32, this.VH);
    }

    public final abcd.yE Hw() {
        if (getClass() != abcd.yE.class) goto L7;
        return (abcd.yE) this;
    L7:
        return new abcd.yE(this);
    }

    public abstract abcd.yE J8();

    public final java.lang.String VH() {
        return we();
    }

    public final int Zo() {
        return this.FH >>> 24;
    }

    @Override
    public final int compareTo(java.lang.Object r1) {
        return j6((abcd.YD) r1);
    }

    public final boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.YD) == true) goto L5;
        return false;
    L5:
        return DW((abcd.YD) r2);
    }

    public final int hashCode() {
        return this.Hw;
    }

    public final int j6(abcd.YD r3) {
        if (this != r3) goto L5;
        return 0;
    L5:
        int r0 = abcd.FK.j6(this.FH, r3.FH);
        if (r0 == 0) goto L8;
        return r0;
    L8:
        int r1 = abcd.FK.j6(this.Hw, r3.Hw);
        if (r1 == 0) goto L11;
        return r1;
    L11:
        int r2 = abcd.FK.j6(this.v5, r3.v5);
        if (r2 == 0) goto L14;
        return r2;
    L14:
        int r4 = abcd.FK.j6(this.Zo, r3.Zo);
        if (r4 == 0) goto L18;
        return r4;
    L18:
        return abcd.FK.j6(this.VH, r3.VH);
    }

    public final int j6(byte[] r3, int r4) {
        int r0 = abcd.FK.j6(this.FH, abcd.FK.j6(r3, r4));
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r1 = abcd.FK.j6(this.Hw, abcd.FK.j6(r3, r4 + 4));
        if (r1 == 0) goto L8;
        return r1;
    L8:
        int r2 = abcd.FK.j6(this.v5, abcd.FK.j6(r3, r4 + 8));
        if (r2 == 0) goto L11;
        return r2;
    L11:
        int r5 = abcd.FK.j6(this.Zo, abcd.FK.j6(r3, r4 + 12));
        if (r5 == 0) goto L15;
        return r5;
    L15:
        return abcd.FK.j6(this.VH, abcd.FK.j6(r3, r4 + 16));
    }

    public final int j6(int[] r3, int r4) {
        int r0 = abcd.FK.j6(this.FH, r3[r4]);
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r1 = abcd.FK.j6(this.Hw, r3[r4 + 1]);
        if (r1 == 0) goto L8;
        return r1;
    L8:
        int r2 = abcd.FK.j6(this.v5, r3[r4 + 2]);
        if (r2 == 0) goto L11;
        return r2;
    L11:
        int r5 = abcd.FK.j6(this.Zo, r3[r4 + 3]);
        if (r5 == 0) goto L15;
        return r5;
    L15:
        return abcd.FK.j6(this.VH, r3[r4 + 4]);
    }

    public abcd.WD j6(int r10) {
        return new abcd.WD(r10, abcd.WD.j6(r10, 1, this.FH), abcd.WD.j6(r10, 2, this.Hw), abcd.WD.j6(r10, 3, this.v5), abcd.WD.j6(r10, 4, this.Zo), abcd.WD.j6(r10, 5, this.VH));
    }

    public void j6(java.io.OutputStream r2) {
        j6(r2, this.FH);
        j6(r2, this.Hw);
        j6(r2, this.v5);
        j6(r2, this.Zo);
        j6(r2, this.VH);
    }

    public void j6(char[] r3, java.io.Writer r4) {
        j6(r3);
        r4.write(r3, 0, 40);
    }

    public void j6(char[] r3, java.lang.StringBuilder r4) {
        j6(r3);
        r4.append(r3, 0, 40);
    }

    public java.lang.String toString() {
        return "AnyObjectId[" + we() + "]";
    }

    public final java.lang.String we() {
        return new java.lang.String(aM());
    }
}
