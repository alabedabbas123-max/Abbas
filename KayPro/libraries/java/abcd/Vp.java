package abcd;

public final class Vp implements java.lang.Comparable<abcd.Vp> {
    private final byte DW;
    private final int FH;
    private final int[] Hw;
    private final abcd.iq j6;
    private final abcd.jq[] v5;

    public Vp(abcd.iq r1, byte r2, int r3, int[] r4, abcd.jq[] r5) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
    }

    public int[] Hw() {
        return this.Hw;
    }

    public abcd.jq[] VH() {
        return this.v5;
    }

    public int Zo() {
        return this.FH;
    }

    @Override
    public int compareTo(abcd.Vp r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (abcd.Vp.class == r5.getClass()) goto L11;
        return false;
    L11:
        abcd.Vp r6 = (abcd.Vp) r5;
        if (java.util.Arrays.equals(this.Hw, r6.Hw) == true) goto L15;
        return false;
    L15:
        if (this.FH == r6.FH) goto L18;
        return false;
    L18:
        if (java.util.Arrays.equals(this.v5, r6.v5) == true) goto L21;
        return false;
    L21:
        if (this.DW == r6.DW) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return ((((((java.util.Arrays.hashCode(this.Hw) + 31) * 31) + this.FH) * 31) + java.util.Arrays.hashCode(this.v5)) * 31) + this.DW;
    }

    public int j6(abcd.Vp r7) {
        int r0 = this.FH;
        int r1 = r7.FH;
        if (r0 != r1) goto L5;
        int r2 = java.lang.Math.min(this.Hw.length, r7.Hw.length);
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L17;
        int[] r4 = this.Hw;
        int r5 = r4[r3];
        int[] r6 = r7.Hw;
        if (r5 != r6[r3]) goto L11;
        int r8 = this.v5[r3].j6(r7.v5[r3]);
        if (r8 != 0) goto L14;
        r3 = r3 + 1;
        goto L7
    L14:
        return r8;
    L11:
        return abcd.nu.j6(r4[r3], r6[r3]);
    L17:
        return this.Hw.length - r7.Hw.length;
    L5:
        return abcd.nu.j6(r0, r1);
    }

    public void j6(abcd.hr.a r4) {
        r4.writeByte(this.DW);
        r4.DW(this.FH);
        r4.DW(this.Hw.length);
        int r0 = 0;
    L3:
        int[] r1 = this.Hw;
        if (r0 >= r1.length) goto L6;
        r4.DW(r1[r0]);
        this.v5[r0].j6(r4);
        r0 = r0 + 1;
        goto L3
    }

    public java.lang.String toString() {
        if (this.j6 == null) goto L5;
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(this.DW);
        r0.append(" ");
        r0.append(this.j6.Hw().get(this.FH));
        r0.append("[");
        int r1 = 0;
    L8:
        if (r1 >= this.Hw.length) goto L12;
        if (r1 <= 0) goto L11;
        r0.append(", ");
    L11:
        r0.append(this.j6.FH().get(this.Hw[r1]));
        r0.append("=");
        r0.append(this.v5[r1]);
        r1 = r1 + 1;
        goto L8
    L12:
        r0.append("]");
        return r0.toString();
    L5:
        return this.DW + " " + this.FH;
    }

    public byte we() {
        return this.DW;
    }
}
