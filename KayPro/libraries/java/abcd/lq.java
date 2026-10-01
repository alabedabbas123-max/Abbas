package abcd;

public final class lq implements java.lang.Comparable<abcd.lq> {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final abcd.iq j6;

    public lq(abcd.iq r1, int r2, int r3, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public int Hw() {
        return this.DW;
    }

    public int VH() {
        return this.FH;
    }

    public int Zo() {
        return this.Hw;
    }

    @Override
    public int compareTo(abcd.lq r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (abcd.lq.class == r5.getClass()) goto L11;
        return false;
    L11:
        abcd.lq r6 = (abcd.lq) r5;
        if (this.DW == r6.DW) goto L15;
        return false;
    L15:
        if (this.Hw == r6.Hw) goto L18;
        return false;
    L18:
        if (this.FH == r6.FH) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return ((((this.DW + 31) * 31) + this.Hw) * 31) + this.FH;
    }

    public int j6(abcd.lq r3) {
        int r0 = this.DW;
        int r1 = r3.DW;
        if (r0 != r1) goto L5;
        int r2 = this.Hw;
        int r4 = r3.Hw;
        if (r2 == r4) goto L11;
        return abcd.nu.j6(r2, r4);
    L11:
        return abcd.nu.j6(this.FH, r3.FH);
    L5:
        return abcd.nu.j6(r0, r1);
    }

    public void j6(abcd.hr.a r2) {
        r2.u7(this.DW);
        r2.u7(this.FH);
        r2.writeInt(this.Hw);
    }

    public java.lang.String toString() {
        if (this.j6 != null) goto L7;
        return this.DW + " " + this.FH + " " + this.Hw;
    L7:
        return this.j6.Hw().get(this.FH) + "." + this.j6.FH().get(this.Hw);
    }
}
