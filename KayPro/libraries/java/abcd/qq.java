package abcd;

public final class qq implements java.lang.Comparable<abcd.qq> {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final abcd.iq j6;

    public qq(abcd.iq r1, int r2, int r3, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public int Hw() {
        return this.Hw;
    }

    public int VH() {
        return this.DW;
    }

    public int Zo() {
        return this.FH;
    }

    @Override
    public int compareTo(abcd.qq r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (abcd.qq.class == r5.getClass()) goto L11;
        return false;
    L11:
        abcd.qq r6 = (abcd.qq) r5;
        if (this.Hw == r6.Hw) goto L15;
        return false;
    L15:
        if (this.FH == r6.FH) goto L18;
        return false;
    L18:
        if (this.DW == r6.DW) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return ((((this.Hw + 31) * 31) + this.FH) * 31) + this.DW;
    }

    public int j6(abcd.qq r3) {
        int r0 = this.FH;
        int r1 = r3.FH;
        if (r0 == r1) goto L7;
        return abcd.nu.j6(r0, r1);
    L7:
        return abcd.nu.j6(this.Hw, r3.Hw);
    }

    public void j6(abcd.hr.a r2) {
        r2.writeInt(this.DW);
        r2.writeInt(this.FH);
        r2.writeInt(this.Hw);
    }

    public java.lang.String toString() {
        if (this.j6 != null) goto L7;
        return this.DW + " " + this.FH + " " + this.Hw;
    L7:
        return this.j6.FH().get(this.DW) + ": " + this.j6.Hw().get(this.FH) + " " + this.j6.FH(this.Hw);
    }
}
