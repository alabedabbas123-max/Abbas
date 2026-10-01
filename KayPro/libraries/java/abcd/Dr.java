package abcd;

public class Dr {
    private static final int[] j6 = null;
    public final abcd.Dr.a DW;
    private int[] FH;
    private int[] Hw;
    private int VH;
    private int[] Zo;
    private int gn;
    private int u7;
    private int[] v5;

    public class a {
        private int DW;
        private int FH;
        private int Hw;
        final abcd.Dr Zo;
        private int j6;
        private int v5;

        private a(abcd.Dr r1) {
            this.Zo = r1;
            this.j6 = 0;
            this.DW = 0;
        }

        a(abcd.Dr r1, abcd.Cr r2) {
            this(r1);
        }

        public void DW() {
            this.j6 = 0;
            this.DW = 0;
        }

        public int FH() {
            return this.FH;
        }

        public int Hw() {
            return this.Hw;
        }

        public void j6(int r2) {
            if (r2 != 0) goto L5;
            r2 = Integer.MAX_VALUE;
        L5:
            this.v5 = r2;
            int r3 = r2 & Integer.MAX_VALUE;
            this.DW = (r3 % (abcd.Dr.j6(this.Zo).length - 2)) + 1;
            this.j6 = r3 % abcd.Dr.j6(this.Zo).length;
        }

        public boolean j6() {
            if (this.DW == 0) goto L5;
        L16:
            int[] r0 = abcd.Dr.j6(this.Zo);
            int r4 = this.j6;
            this.FH = r0[r4];
            int r1 = this.FH;
            if (r1 == 0) goto L18;
            if (r1 == this.v5) goto L21;
            this.j6 = (r4 + this.DW) % abcd.Dr.j6(this.Zo).length;
            goto L16
        L21:
            if (r1 != Integer.MAX_VALUE) goto L23;
            this.FH = 0;
        L23:
            int[] r2 = abcd.Dr.DW(this.Zo);
            int r3 = this.j6;
            this.Hw = r2[r3];
            this.j6 = (r3 + this.DW) % abcd.Dr.j6(this.Zo).length;
            return true;
        L18:
            return false;
        L5:
            if (this.j6 >= abcd.Dr.j6(this.Zo).length) goto L6;
            this.FH = abcd.Dr.j6(this.Zo)[this.j6];
            int r5 = this.FH;
            if (r5 == 0) goto L15;
            if (r5 == Integer.MIN_VALUE) goto L15;
            if (r5 != Integer.MAX_VALUE) goto L13;
            this.FH = 0;
        L13:
            int[] r6 = abcd.Dr.DW(this.Zo);
            int r7 = this.j6;
            this.Hw = r6[r7];
            this.j6 = r7 + 1;
            return true;
        L15:
            this.j6++;
            goto L5
        L6:
            return false;
        }
    }

    static {
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
    }

    public Dr() {
        this.DW = new abcd.Dr.a(this, null);
        this.u7 = 0;
        int[] r1 = j6;
        int r2 = this.u7;
        this.FH = new int[r1[r2]];
        this.v5 = new int[r1[r2]];
        this.VH = 0;
        this.gn = 0;
    }

    public Dr(int r6) {
        this.DW = new abcd.Dr.a(this, null);
        this.u7 = 0;
    L3:
        int[] r1 = j6;
        int r2 = this.u7;
        if (r1[r2] >= (r6 * 2)) goto L6;
        this.u7 = r2 + 1;
        goto L3
    L6:
        this.FH = new int[r1[r2]];
        this.v5 = new int[r1[r2]];
        this.VH = 0;
        this.gn = 0;
    }

    static int[] DW(abcd.Dr r0) {
        return r0.v5;
    }

    private void Hw() {
        int r0 = this.gn * 2;
        int[] r1 = this.FH;
        int r3 = 0;
        if (r0 <= r1.length) goto L5;
        this.u7++;
        this.Hw = null;
        this.Zo = null;
        int[] r2 = j6;
        int r4 = this.u7;
        int[] r5 = new int[r2[r4]];
        int[] r6 = new int[r2[r4]];
    L15:
        int r7 = 0;
    L16:
        int[] r8 = this.FH;
        if (r3 >= r8.length) goto L28;
        int r9 = r8[r3];
        if (r9 == 0) goto L27;
        if (r9 == Integer.MIN_VALUE) goto L27;
        int r10 = Integer.MAX_VALUE & r9;
        int r11 = (r10 % (r5.length - 2)) + 1;
        int r12 = r5.length;
    L23:
        int r13 = r10 % r12;
        if (r5[r13] == 0) goto L26;
        r10 = r13 + r11;
        r12 = r5.length;
        goto L23
    L26:
        r5[r13] = r9;
        r6[r13] = this.v5[r3];
        r7 = r7 + 1;
    L27:
        r3 = r3 + 1;
        goto L16
    L28:
        this.FH = r5;
        this.v5 = r6;
        this.VH = r7;
        return;
    L5:
        r5 = this.Hw;
        if (r5 != null) goto L8;
    L14:
        this.Hw = this.FH;
        this.Zo = this.v5;
        int[] r14 = j6;
        int r15 = this.u7;
        r5 = new int[r14[r15]];
        r6 = new int[r14[r15]];
        goto L15
    L8:
        if (r5.length != r1.length) goto L14;
        int r16 = 0;
    L11:
        if (r16 >= r5.length) goto L13;
        r5[r16] = 0;
        r16 = r16 + 1;
        goto L11
    L13:
        r6 = this.Zo;
        this.Hw = this.FH;
        this.Zo = this.v5;
        goto L15
    }

    static int[] j6(abcd.Dr r0) {
        return r0.FH;
    }

    public abcd.Dr.a DW() {
        return new abcd.Dr.a(this, null);
    }

    public void DW(int r9, int r10) {
        if (r9 != 0) goto L5;
        r9 = Integer.MAX_VALUE;
    L5:
        int r0 = Integer.MAX_VALUE & r9;
        int[] r1 = this.FH;
        int r2 = r0 % r1.length;
        int r3 = (r0 % (r1.length - 2)) + 1;
        boolean r4 = false;
        int r5 = r1[r2];
        int r6 = r2;
        int r7 = -1;
    L6:
        if (r5 == 0) goto L16;
        if (r5 == r9) goto L10;
        if (r5 != Integer.MIN_VALUE) goto L15;
        r7 = r6;
    L15:
        int[] r8 = this.FH;
        r6 = (r6 + r3) % r8.length;
        r5 = r8[r6];
        goto L6
    L10:
        if (this.v5[r6] != r10) goto L12;
        r4 = true;
        goto L15
    L12:
        this.FH[r6] = Integer.MIN_VALUE;
        this.gn--;
        goto L15
    L16:
        if (r4 == true) goto L31;
        if (r7 == (-1)) goto L19;
        r6 = r7;
    L19:
        this.FH[r6] = r9;
        this.v5[r6] = r10;
        this.gn++;
        if (r7 != (-1)) goto L23;
        this.VH++;
    L23:
        if ((this.VH * 2) <= this.FH.length) goto L32;
        Hw();
        return;
    L32:
        return;
    }

    public int FH() {
        return this.gn;
    }

    public int j6(int r5) {
        if (r5 != 0) goto L5;
        r5 = Integer.MAX_VALUE;
    L5:
        int r0 = Integer.MAX_VALUE & r5;
        int[] r1 = this.FH;
        int r2 = (r0 % (r1.length - 2)) + 1;
        int r3 = r0 % r1.length;
        int r4 = r1[r3];
    L6:
        if (r4 == r5) goto L12;
        if (r4 == 0) goto L8;
        int[] r6 = this.FH;
        r3 = (r3 + r2) % r6.length;
        r4 = r6[r3];
        goto L6
    L8:
        return -1;
    L12:
        return this.v5[r3];
    }

    public void j6() {
        if (this.VH <= 0) goto L11;
        int r1 = 0;
    L5:
        int[] r2 = this.FH;
        if (r1 >= r2.length) goto L8;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L5
    L8:
        this.VH = 0;
        this.gn = 0;
        return;
    }

    public void j6(int r7, int r8) {
        if (r7 != 0) goto L5;
        r7 = Integer.MAX_VALUE;
    L5:
        int r0 = Integer.MAX_VALUE & r7;
        int[] r1 = this.FH;
        int r2 = r0 % r1.length;
        int r3 = (r0 % (r1.length - 2)) + 1;
        int r4 = r1[r2];
        int r5 = r2;
        int r6 = -1;
    L6:
        if (r4 == 0) goto L15;
        if (r4 != r7) goto L12;
        if (this.v5[r5] != r8) goto L14;
        return;
    L14:
        int[] r9 = this.FH;
        r5 = (r5 + r3) % r9.length;
        r4 = r9[r5];
        goto L6
    L12:
        if (r4 != Integer.MIN_VALUE) goto L14;
        r6 = r5;
        goto L14
    L15:
        if (r6 == (-1)) goto L17;
        r5 = r6;
    L17:
        this.FH[r5] = r7;
        this.v5[r5] = r8;
        this.gn++;
        if (r6 != (-1)) goto L21;
        this.VH++;
    L21:
        if ((this.VH * 2) <= this.FH.length) goto L29;
        Hw();
        return;
    }

    public java.lang.String toString() {
        java.lang.String r0 = "{";
        int r1 = 0;
    L3:
        int[] r2 = this.FH;
        if (r1 >= r2.length) goto L15;
        int r3 = r2[r1];
        if (r3 == 0) goto L13;
        if (r3 == Integer.MIN_VALUE) goto L13;
        int r4 = this.v5[r1];
        if (r3 != Integer.MAX_VALUE) goto L12;
        r0 = r0 + "0->" + r4 + ", ";
        goto L13
    L12:
        r0 = r0 + r3 + "->" + r4 + ", ";
    L13:
        r1 = r1 + 1;
        goto L3
    L15:
        return r0 + "}";
    }
}
