package abcd;

public final class WD implements java.io.Serializable {
    final int DW;
    final int FH;
    final int Hw;
    final int Zo;
    final int j6;
    final int v5;

    WD(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
    }

    private static final abcd.WD DW(byte[] r8, int r9, int r10) {
        int r1 = r10 - r9;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        return new abcd.WD(r1, FH(r8, r9, r10), FH(r8, r9 + 8, r10), FH(r8, r9 + 16, r10), FH(r8, r9 + 24, r10), FH(r8, r9 + 32, r10));
    L5:
        throw new abcd.aD(r8, r9, r10 - r9);
    }

    public static final boolean DW(java.lang.String r3) {
        if (r3.length() >= 2) goto L5;
    L14:
        return false;
    L5:
        if (40 < r3.length()) goto L14;
        int r0 = 0;
    L16:
        if (r0 >= r3.length()) goto L10;
        abcd.IK.j6((byte) r3.charAt(r0));     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15
        r0 = r0 + 1;
        goto L16
    L10:
        return true;
    }

    private static final int FH(byte[] r4, int r5, int r6) {
        if (8 <= (r6 - r5)) goto L5;
        int r0 = 0;
        int r2 = 0;
    L7:
        if (r0 >= 8) goto L12;
        if (r5 >= r6) goto L12;
        int r3 = r5 + 1;
        r2 = (r2 << 4) | abcd.IK.j6(r4[r5]);
        r0 = r0 + 1;
        r5 = r3;
    L12:
        return r2 << ((8 - r0) * 4);
    L5:
        return abcd.IK.gn(r4, r5);
    }

    private int j6(int r2, int r3) {
        return j6(this.j6, r2, r3);
    }

    static int j6(int r1, int r2, int r3) {
        int r4 = (r2 - 1) * 8;
        if ((r4 + 8) > r1) goto L5;
        return r3;
    L5:
        if (r1 > r4) goto L8;
        return 0;
    L8:
        int r5 = 32 - ((r1 - r4) * 4);
        return (r3 >>> r5) << r5;
    }

    public static final abcd.WD j6(abcd.YD r8) {
        return new abcd.WD(40, r8.FH, r8.Hw, r8.v5, r8.Zo, r8.VH);
    }

    public static final abcd.WD j6(java.lang.String r4) {
        if (r4.length() > 40) goto L7;
        byte[] r5 = abcd.hE.DW(r4);
        return DW(r5, 0, r5.length);
    L7:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidId, new java.lang.Object[]{r4}));
    }

    public static final abcd.WD j6(byte[] r3, int r4, int r5) {
        int r0 = r5 - r4;
        if (r0 > 40) goto L7;
        return DW(r3, r4, r5);
    L7:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidIdLength, new java.lang.Object[]{java.lang.Integer.valueOf(r0), 40}));
    }

    public final int DW(abcd.YD r4) {
        int r0 = abcd.FK.j6(this.DW, j6(1, r4.FH));
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r1 = abcd.FK.j6(this.FH, j6(2, r4.Hw));
        if (r1 == 0) goto L8;
        return r1;
    L8:
        int r2 = abcd.FK.j6(this.Hw, j6(3, r4.v5));
        if (r2 == 0) goto L11;
        return r2;
    L11:
        int r3 = abcd.FK.j6(this.v5, j6(4, r4.Zo));
        if (r3 == 0) goto L15;
        return r3;
    L15:
        return abcd.FK.j6(this.Zo, j6(5, r4.VH));
    }

    public boolean DW() {
        if (FH() != 40) goto L6;
        return true;
    L6:
        return false;
    }

    public int FH() {
        return this.j6;
    }

    public final java.lang.String Hw() {
        char[] r0 = new char[40];
        abcd.YD.j6(r0, 0, this.DW);
        int r1 = this.j6;
        if (r1 <= 8) goto L5;
        abcd.YD.j6(r0, 8, this.FH);
        int r2 = this.j6;
        if (r2 <= 16) goto L9;
        abcd.YD.j6(r0, 16, this.Hw);
        int r3 = this.j6;
        if (r3 <= 24) goto L13;
        abcd.YD.j6(r0, 24, this.v5);
        int r4 = this.j6;
        if (r4 <= 32) goto L17;
        abcd.YD.j6(r0, 32, this.Zo);
        return new java.lang.String(r0, 0, this.j6);
    L17:
        return new java.lang.String(r0, 0, r4);
    L13:
        return new java.lang.String(r0, 0, r3);
    L9:
        return new java.lang.String(r0, 0, r2);
    L5:
        return new java.lang.String(r0, 0, r1);
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.WD) == false) goto L18;
        abcd.WD r5 = (abcd.WD) r4;
        if (this.j6 != r5.j6) goto L18;
        if (this.DW != r5.DW) goto L18;
        if (this.FH != r5.FH) goto L18;
        if (this.Hw != r5.Hw) goto L18;
        if (this.v5 != r5.v5) goto L18;
        if (this.Zo != r5.Zo) goto L18;
        return true;
    L18:
        return false;
    }

    public int hashCode() {
        return this.FH;
    }

    public final int j6() {
        return this.DW >>> 24;
    }

    public final int j6(byte[] r4, int r5) {
        int r0 = abcd.FK.j6(this.DW, j6(1, abcd.FK.j6(r4, r5)));
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r1 = abcd.FK.j6(this.FH, j6(2, abcd.FK.j6(r4, r5 + 4)));
        if (r1 == 0) goto L8;
        return r1;
    L8:
        int r2 = abcd.FK.j6(this.Hw, j6(3, abcd.FK.j6(r4, r5 + 8)));
        if (r2 == 0) goto L11;
        return r2;
    L11:
        int r3 = abcd.FK.j6(this.v5, j6(4, abcd.FK.j6(r4, r5 + 12)));
        if (r3 == 0) goto L15;
        return r3;
    L15:
        return abcd.FK.j6(this.Zo, j6(5, abcd.FK.j6(r4, r5 + 16)));
    }

    public final int j6(int[] r4, int r5) {
        int r0 = abcd.FK.j6(this.DW, j6(1, r4[r5]));
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r1 = abcd.FK.j6(this.FH, j6(2, r4[r5 + 1]));
        if (r1 == 0) goto L8;
        return r1;
    L8:
        int r2 = abcd.FK.j6(this.Hw, j6(3, r4[r5 + 2]));
        if (r2 == 0) goto L11;
        return r2;
    L11:
        int r3 = abcd.FK.j6(this.v5, j6(4, r4[r5 + 3]));
        if (r3 == 0) goto L15;
        return r3;
    L15:
        return abcd.FK.j6(this.Zo, j6(5, r4[r5 + 4]));
    }

    public java.lang.String toString() {
        return "AbbreviatedObjectId[" + Hw() + "]";
    }

    public abcd.yE v5() {
        if (DW() == true) goto L7;
        return null;
    L7:
        return new abcd.yE(this.DW, this.FH, this.Hw, this.v5, this.Zo);
    }
}
