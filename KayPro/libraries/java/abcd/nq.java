package abcd;

public final class nq implements java.lang.Comparable<abcd.nq> {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final abcd.iq j6;

    public nq(abcd.iq r1, int r2, int r3, int r4) {
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
    public int compareTo(abcd.nq r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (abcd.nq.class == r5.getClass()) goto L11;
        return false;
    L11:
        abcd.nq r6 = (abcd.nq) r5;
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

    public int j6(abcd.nq r3) {
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
        if (this.j6 == null) goto L5;
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(this.j6.Hw().get(this.DW));
        r0.append(".");
        r0.append(this.j6.FH().get(this.Hw));
        abcd.iq r1 = this.j6;
        r0.append(r1.FH(r1.DW().get(this.FH).Hw()));
        return r0.toString();
    L5:
        return this.DW + " " + this.FH + " " + this.Hw;
    }
}
