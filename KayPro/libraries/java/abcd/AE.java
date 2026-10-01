package abcd;

public class AE<V extends abcd.AE.a> implements java.lang.Iterable<V> {
    private int DW;
    private int FH;
    private int Hw;
    private V[][] j6;
    private int v5;

    public static abstract class a extends abcd.yE {
        abcd.AE.a tp;

        public a(abcd.YD r1) {
            super(r1);
        }
    }

    public AE() {
        this.Hw = 0;
        this.v5 = 0;
        this.FH = v5(this.Hw);
        this.j6 = (V[][]) new abcd.AE.a[1024][];
        ((V[][]) this.j6)[0] = DW();
    }

    private final V[] DW() {
        return (V[]) new abcd.AE.a[2048];
    }

    static abcd.AE.a[][] DW(abcd.AE r0) {
        return r0.j6;
    }

    static int FH(abcd.AE r0) {
        return r0.Hw;
    }

    static int j6(abcd.AE r0) {
        return r0.DW;
    }

    private void j6() {
        int r0 = this.Hw;
        int r2 = 1 << r0;
        int r3 = 1 << r0;
        this.Hw = r0 + 1;
        int r1 = this.Hw;
        this.v5 = (1 << r1) - 1;
        this.FH = v5(r1);
        int r4 = 1 << this.Hw;
        V[][] r5 = this.j6;
        if (r5.length >= r4) goto L5;
        V[][] r6 = (V[][]) new abcd.AE.a[r4 << 1][];
        java.lang.System.arraycopy(r5, 0, r6, 0, r2);
        this.j6 = r6;
    L5:
        int r7 = 0;
    L6:
        if (r7 >= r2) goto L7;
        abcd.AE.a[] r8 = this.j6[r7];
        abcd.AE.a[] r9 = DW();
        int r10 = 0;
    L10:
        if (r10 >= r8.length) goto L11;
        abcd.AE.a r11 = r8[r10];
        abcd.AE.a r12 = null;
        abcd.AE.a r13 = null;
    L13:
        if (r11 == null) goto L14;
        abcd.AE.a r14 = r11.tp;
        if ((r11.FH & r3) != 0) goto L18;
        r11.tp = r12;
        r12 = r11;
    L19:
        r11 = r14;
        goto L13
    L18:
        r11.tp = r13;
        r13 = r11;
        goto L19
    L14:
        r8[r10] = r12;
        r9[r10] = r13;
        r10 = r10 + 1;
        goto L10
    L11:
        ((V[][]) this.j6)[r2 + r7] = r9;
        r7 = r7 + 1;
        goto L6
    }

    private static final boolean j6(abcd.YD r2, abcd.YD r3) {
        if (r2.Hw == r3.Hw) goto L5;
        return false;
    L5:
        if (r2.v5 == r3.v5) goto L7;
        return false;
    L7:
        if (r2.Zo == r3.Zo) goto L9;
        return false;
    L9:
        if (r2.VH == r3.VH) goto L11;
        return false;
    L11:
        if (r2.FH != r3.FH) goto L19;
        return true;
    L19:
        return false;
    }

    private static final int v5(int r1) {
        return 1 << (r1 + 11);
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)TV; */
    public abcd.AE.a DW(abcd.AE.a r5) {
        int r0 = r5.FH;
        abcd.AE.a[] r1 = this.j6[this.v5 & r0];
        int r2 = r0 >>> 21;
        abcd.AE.a r3 = r1[r2];
    L3:
        if (r3 == null) goto L4;
        if (j6(r3, r5) == true) goto L10;
        r3 = r3.tp;
        goto L3
    L10:
        return r3;
    L4:
        r5.tp = r1[r2];
        r1[r2] = r5;
        int r4 = this.DW + 1;
        this.DW = r4;
        if (r4 != this.FH) goto L7;
        j6();
    L7:
        return r5;
    }

    public V DW(abcd.YD r4) {
        int r0 = r4.FH;
        V r1 = this.j6[this.v5 & r0][r0 >>> 21];
    L3:
        if (r1 == null) goto L4;
        if (j6(r1, r4) == true) goto L8;
        r1 = (V) r1.tp;
        goto L3
    L8:
        return r1;
    L4:
        return null;
    }

    public void clear() {
        int r0 = 0;
        this.DW = 0;
        V[][] r1 = this.j6;
        int r2 = r1.length;
    L3:
        if (r0 >= r2) goto L7;
        V[] r3 = r1[r0];
        if (r3 == null) goto L11;
        java.util.Arrays.fill(r3, null);
        r0 = r0 + 1;
        goto L3
    L11:
        return;
    }

    @Override
    public java.util.Iterator<V> iterator() {
        return new abcd.zE(this);
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)V */
    public void j6(abcd.AE.a r4) {
        int r0 = this.DW + 1;
        this.DW = r0;
        if (r0 != this.FH) goto L5;
        j6();
    L5:
        int r1 = r4.FH;
        abcd.AE.a[] r2 = this.j6[this.v5 & r1];
        int r3 = r1 >>> 21;
        r4.tp = r2[r3];
        r2[r3] = r4;
    }

    public boolean j6(abcd.YD r1) {
        if (DW(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public int size() {
        return this.DW;
    }
}
