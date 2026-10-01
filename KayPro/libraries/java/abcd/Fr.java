package abcd;

public class Fr {
    public static final abcd.Fr DW = null;
    private static final int[] j6 = null;
    public final abcd.Fr.a FH;
    private int[] Hw;
    private int VH;
    private int Zo;
    private int gn;
    private int[] v5;

    public class a {
        private int DW;
        final abcd.Fr FH;
        private int j6;

        private a(abcd.Fr r1) {
            this.FH = r1;
            this.j6 = 0;
        }

        a(abcd.Fr r1, abcd.Er r2) {
            this(r1);
        }

        public void DW() {
            this.j6 = 0;
        }

        public int FH() {
            return this.DW;
        }

        public boolean j6() {
        L3:
            if (this.j6 >= abcd.Fr.j6(this.FH).length) goto L4;
            int[] r0 = abcd.Fr.j6(this.FH);
            int r1 = this.j6;
            this.DW = r0[r1];
            this.j6 = r1 + 1;
            int r2 = this.DW;
            if (r2 == 0) goto L3;
            if (r2 == Integer.MIN_VALUE) goto L3;
            if (r2 != Integer.MAX_VALUE) goto L12;
            this.DW = 0;
        L12:
            return true;
        L4:
            return false;
        }
    }

    static {
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        DW = new abcd.Fr();
    }

    public Fr() {
        this.FH = new abcd.Fr.a(this, null);
        this.gn = 1;
        this.Hw = new int[j6[this.gn]];
        this.Zo = 0;
        this.VH = 0;
    }

    private void DW() {
        int r0 = this.VH * 2;
        int[] r1 = this.Hw;
        int r3 = 0;
        if (r0 <= r1.length) goto L5;
        this.gn++;
        this.v5 = null;
        int[] r2 = new int[j6[this.gn]];
    L15:
        int r4 = 0;
    L16:
        int[] r5 = this.Hw;
        if (r3 >= r5.length) goto L28;
        int r6 = r5[r3];
        if (r6 == 0) goto L27;
        if (r6 == Integer.MIN_VALUE) goto L27;
        int r7 = Integer.MAX_VALUE & r6;
        int r8 = (r7 % (r2.length - 2)) + 1;
        int r9 = r2.length;
    L23:
        int r10 = r7 % r9;
        if (r2[r10] == 0) goto L26;
        r7 = r10 + r8;
        r9 = r2.length;
        goto L23
    L26:
        r2[r10] = r6;
        r4 = r4 + 1;
    L27:
        r3 = r3 + 1;
        goto L16
    L28:
        this.Hw = r2;
        this.Zo = r4;
        return;
    L5:
        r2 = this.v5;
        if (r2 != null) goto L8;
    L14:
        this.v5 = this.Hw;
        r2 = new int[j6[this.gn]];
        goto L15
    L8:
        if (r2.length != r1.length) goto L14;
        int r11 = 0;
    L11:
        if (r11 >= r2.length) goto L13;
        r2[r11] = 0;
        r11 = r11 + 1;
        goto L11
    L13:
        this.v5 = this.Hw;
        goto L15
    }

    static int[] j6(abcd.Fr r0) {
        return r0.Hw;
    }

    public void DW(int r7) {
        if (r7 != 0) goto L5;
        r7 = Integer.MAX_VALUE;
    L5:
        int r0 = Integer.MAX_VALUE & r7;
        int[] r1 = this.Hw;
        int r2 = r0 % r1.length;
        int r3 = (r0 % (r1.length - 2)) + 1;
        int r4 = r1[r2];
        int r5 = r2;
        int r6 = -1;
    L6:
        if (r4 == 0) goto L13;
        if (r4 == r7) goto L8;
        if (r4 != Integer.MIN_VALUE) goto L12;
        r6 = r5;
    L12:
        int[] r8 = this.Hw;
        r5 = (r5 + r3) % r8.length;
        r4 = r8[r5];
        goto L6
    L8:
        return;
    L13:
        if (r6 == (-1)) goto L15;
        r5 = r6;
    L15:
        this.Hw[r5] = r7;
        if (r6 != (-1)) goto L18;
        this.Zo++;
    L18:
        this.VH++;
        if ((this.Zo * 2) <= this.Hw.length) goto L26;
        DW();
        return;
    }

    public boolean equals(java.lang.Object r5) {
        if ((r5 instanceof abcd.Fr) == true) goto L5;
        return false;
    L5:
        abcd.Fr r6 = (abcd.Fr) r5;
        if (r6.j6() == j6()) goto L8;
        return false;
    L8:
        int r0 = 0;
    L9:
        int[] r2 = this.Hw;
        if (r0 >= r2.length) goto L22;
        int r3 = r2[r0];
        if (r3 == 0) goto L21;
        if (r3 == Integer.MIN_VALUE) goto L21;
        if (r3 != Integer.MAX_VALUE) goto L19;
        r3 = 0;
    L19:
        if (r6.j6(r3) == true) goto L21;
        return false;
    L21:
        r0 = r0 + 1;
        goto L9
    L22:
        return true;
    }

    public int j6() {
        return this.VH;
    }

    public boolean j6(int r6) {
        if (r6 != 0) goto L5;
        r6 = Integer.MAX_VALUE;
    L5:
        int r0 = Integer.MAX_VALUE & r6;
        int[] r1 = this.Hw;
        int r2 = (r0 % (r1.length - 2)) + 1;
        int r3 = r0 % r1.length;
        int r4 = r1[r3];
    L6:
        if (r4 == r6) goto L11;
        if (r4 == 0) goto L8;
        int[] r5 = this.Hw;
        r3 = (r3 + r2) % r5.length;
        r4 = r5[r3];
        goto L6
    L8:
        return false;
    L11:
        return true;
    }

    public java.lang.String toString() {
        java.lang.String r0 = "{";
        int r1 = 0;
    L3:
        int[] r2 = this.Hw;
        if (r1 >= r2.length) goto L15;
        int r3 = r2[r1];
        if (r3 == 0) goto L13;
        if (r3 == Integer.MIN_VALUE) goto L13;
        if (r3 != Integer.MAX_VALUE) goto L12;
        r0 = r0 + "0, ";
        goto L13
    L12:
        r0 = r0 + r3 + ", ";
    L13:
        r1 = r1 + 1;
        goto L3
    L15:
        return r0 + "}";
    }
}
