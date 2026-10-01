package abcd;

public class TO implements abcd.InterfaceqO {
    private java.math.BigInteger DW;
    private java.math.BigInteger FH;
    private java.math.BigInteger Hw;
    private abcd.WO VH;
    private int Zo;
    private java.math.BigInteger j6;
    private int v5;

    public TO(java.math.BigInteger r9, java.math.BigInteger r10, java.math.BigInteger r11, int r12) {
        this(r9, r10, r11, j6(r12), r12, null, null);
    }

    public TO(java.math.BigInteger r5, java.math.BigInteger r6, java.math.BigInteger r7, int r8, int r9, java.math.BigInteger r10, abcd.WO r11) {
        if (r9 != 0) goto L5;
    L12:
        this.j6 = r6;
        this.DW = r5;
        this.FH = r7;
        this.v5 = r8;
        this.Zo = r9;
        this.Hw = r10;
        this.VH = r11;
        return;
    L5:
        if (java.math.BigInteger.valueOf(2 ^ ((long) (r9 - 1))).compareTo(r5) == 1) goto L11;
        if (r9 >= r8) goto L12;
        throw new java.lang.IllegalArgumentException("when l value specified, it may not be less than m value");
    L11:
        throw new java.lang.IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
    }

    public TO(java.math.BigInteger r9, java.math.BigInteger r10, java.math.BigInteger r11, java.math.BigInteger r12, abcd.WO r13) {
        this(r9, r10, r11, 160, 0, r12, r13);
    }

    private static int j6(int r1) {
        if (r1 != 0) goto L5;
        return 160;
    L5:
        if (r1 < 160) goto L9;
        return 160;
    L9:
        return r1;
    }

    public int DW() {
        return this.Zo;
    }

    public int FH() {
        return this.v5;
    }

    public java.math.BigInteger Hw() {
        return this.DW;
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.TO) == true) goto L5;
        return false;
    L5:
        abcd.TO r5 = (abcd.TO) r4;
        if (v5() == null) goto L11;
        if (v5().equals(r5.v5()) == true) goto L14;
        return false;
    L14:
        if (r5.Hw().equals(this.DW) == true) goto L16;
    L19:
        return false;
    L16:
        if (r5.j6().equals(this.j6) == false) goto L19;
        return true;
    L11:
        if (r5.v5() == null) goto L14;
        return false;
    }

    public int hashCode() {
        int r0 = Hw().hashCode() ^ j6().hashCode();
        if (v5() == null) goto L5;
        int r1 = v5().hashCode();
    L7:
        return r0 ^ r1;
    L5:
        r1 = 0;
        goto L7
    }

    public java.math.BigInteger j6() {
        return this.j6;
    }

    public java.math.BigInteger v5() {
        return this.FH;
    }
}
