package abcd;

class EG {
    private static volatile int DW;
    private static final java.lang.ref.SoftReference<abcd.EG.a> j6 = null;
    private final int FH;
    private final abcd.EG.b[] Hw;
    private int VH;
    private abcd.EG.b Zo;
    private abcd.EG.b v5;

    static class a {
        final int DW;
        final byte[] j6;

        a(byte[] r1, int r2) {
            this.j6 = r1;
            this.DW = r2;
        }
    }

    private static class b {
        abcd.EG.b DW;
        abcd.aH FH;
        long Hw;
        java.lang.ref.SoftReference<abcd.EG.a> Zo;
        abcd.EG.b j6;
        int v5;

        private b() {
            this.Zo = abcd.EG.j6();
        }

        b(abcd.EG.b r1) {
            this();
        }
    }

    static {
        j6 = new java.lang.ref.SoftReference(null);
        j6(new abcd.vH());
    }

    EG() {
        this.FH = DW;
        this.Hw = new abcd.EG.b[1024];
    }

    private void DW() {
    L3:
        if (this.VH <= this.FH) goto L12;
        abcd.EG.b r0 = this.Zo;
        if (r0 == null) goto L17;
        abcd.EG.b r1 = r0.j6;
        j6(r0);
        r0.j6 = null;
        r0.DW = null;
        if (r1 != null) goto L10;
        this.v5 = null;
    L11:
        this.Zo = r1;
        goto L3
    L10:
        r1.DW = null;
        goto L11
    L17:
        return;
    }

    private void DW(abcd.EG.b r2) {
        FH(r2);
        r2.j6 = null;
        abcd.EG.b r0 = this.v5;
        r2.DW = r0;
        if (r0 == null) goto L5;
        r0.j6 = r2;
    L6:
        this.v5 = r2;
        return;
    L5:
        this.Zo = r2;
        goto L6
    }

    private void FH(abcd.EG.b r2) {
        abcd.EG.b r0 = r2.j6;
        abcd.EG.b r3 = r2.DW;
        if (r0 == null) goto L5;
        r0.DW = r3;
    L5:
        if (r3 == null) goto L8;
        r3.j6 = r0;
        return;
    }

    private static int j6(long r0) {
        return (((int) r0) << 22) >>> 22;
    }

    static java.lang.ref.SoftReference j6() {
        return j6;
    }

    private void j6(abcd.EG.b r3) {
        this.VH -= r3.v5;
        r3.FH = null;
        r3.Zo = j6;
        r3.v5 = 0;
    }

    static void j6(abcd.vH r0) {
        DW = r0.j6();
    }

    abcd.EG.a j6(abcd.aH r5, long r6) {
        abcd.EG.b r0 = this.Hw[j6(r6)];
        if (r0 != null) goto L6;
        return null;
    L6:
        if (r0.FH == r5) goto L8;
    L13:
        return null;
    L8:
        if (r0.Hw != r6) goto L13;
        abcd.EG.a r7 = r0.Zo.get();
        if (r7 == null) goto L13;
        DW(r0);
        return r7;
    }

    void j6(abcd.aH r4, long r5, byte[] r7, int r8) {
        if (r7.length <= this.FH) goto L5;
        return;
    L5:
        abcd.EG.b r0 = this.Hw[j6(r5)];
        if (r0 != null) goto L8;
        r0 = new abcd.EG.b(null);
        this.Hw[j6(r5)] = r0;
    L9:
        this.VH += r7.length;
        DW();
        r0.FH = r4;
        r0.Hw = r5;
        r0.v5 = r7.length;
        r0.Zo = new java.lang.ref.SoftReference(new abcd.EG.a(r7, r8));
        DW(r0);
        return;
    L8:
        j6(r0);
        goto L9
    }
}
