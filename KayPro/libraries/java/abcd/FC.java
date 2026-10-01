package abcd;

class FC {
    private java.util.List<abcd.hC> DW;
    private java.util.List<abcd.hC> FH;
    private long[] Hw;
    private java.util.List<abcd.hC> VH;
    private boolean Zo;
    private abcd.AbstractcC.c j6;
    private int v5;

    FC(abcd.AbstractcC.c r2, java.util.List<abcd.hC> r3, java.util.List<abcd.hC> r4) {
        this.v5 = 60;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
    }

    private static int DW(int r1) {
        return 268435455 - r1;
    }

    static int DW(long r1) {
        return DW(268435455 & ((int) (r1 >>> 28)));
    }

    private int DW(abcd.LE r23) {
        this.Hw = new long[this.DW.size() * this.FH.size()];
        long[] r2 = new long[this.DW.size()];
        long[] r3 = new long[this.FH.size()];
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.util.BitSet r8 = null;
    L4:
        if (r6 >= this.DW.size()) goto L5;
        abcd.hC r9 = this.DW.get(r6);
        if (j6(r9.v5) == true) goto L10;
        r23.update(this.FH.size());
    L39:
        r6 = r6 + 1;
        r5 = 0;
        goto L4
    L10:
        int r11 = r7;
        int r10 = 0;
        abcd.EC r12 = null;
    L12:
        if (r10 >= this.FH.size()) goto L38;
        abcd.hC r13 = this.FH.get(r10);
        if (j6(r13.Zo) == true) goto L18;
        r23.update(1);
    L48:
        r10 = r10 + 1;
        goto L12
    L18:
        if (abcd.BC.j6(r9.v5, r13.Zo) == true) goto L20;
        r23.update(1);
        goto L48
    L20:
        if (r8 != null) goto L22;
    L24:
        long r15 = r2[r6];
        if (r15 != 0) goto L27;
        r15 = DW(abcd.hC.b.j6, r9) + 1;
        r2[r6] = r15;
    L27:
        long r4 = r15;
        long r16 = r3[r10];
        if (r16 != 0) goto L30;
        r16 = DW(abcd.hC.b.DW, r13) + 1;
        r3[r10] = r16;
    L30:
        long r14 = r16;
        if (((java.lang.Math.min(r4, r14) * 100) / java.lang.Math.max(r4, r14)) >= this.v5) goto L34;
        r23.update(1);
        goto L48
    L34:
        if (r12 != null) goto L51;
        r12 = j6(abcd.hC.b.j6, r9);     // Catch: abcd.EC.a -> L37
    L37:
        this.Zo = true;
    L51:
        int r17 = ((r12.j6(j6(abcd.hC.b.DW, r13), 10000) * 99) + ((j6(r9.FH, r13.Hw) * 100) * 1)) / 10000;
        if (r17 >= this.v5) goto L44;
        r23.update(1);
        goto L48
    L44:
        this.Hw[r11] = j6(r17, r6, r10);
        r23.update(1);
        r11 = r11 + 1;
    L45:
        if (r8 != null) goto L47;
        r8 = new java.util.BitSet(this.FH.size());
    L47:
        r8.set(r10);
        this.Zo = true;
        r23.update(1);
        goto L48
    L22:
        if (r8.get(r10) == false) goto L24;
        r23.update(1);
    L38:
        r7 = r11;
        goto L39
    L5:
        java.util.Arrays.sort(this.Hw, r5, r7);
        return r7;
    }

    private long DW(abcd.hC.b r2, abcd.hC r3) {
        return this.j6.DW(r2, r3);
    }

    private static java.util.List<abcd.hC> DW(java.util.List<abcd.hC> r4) {
        java.util.ArrayList r0 = new java.util.ArrayList(r4.size());
        java.util.Iterator<abcd.hC> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L5;
        abcd.hC r1 = r5.next();
        if (r1.VH != abcd.hC.a.FH) goto L4;
        r0.add(r1);
        goto L4
    L5:
        return r0;
    }

    private static int FH(long r1) {
        return (int) (r1 >>> 56);
    }

    private static long FH(int r2) {
        return 268435455 - r2;
    }

    static int j6(long r0) {
        return DW(268435455 & ((int) r0));
    }

    static int j6(java.lang.String r12, java.lang.String r13) {
        int r1 = r12.lastIndexOf("/") + 1;
        int r0 = r13.lastIndexOf("/") + 1;
        int r2 = java.lang.Math.min(r1, r0);
        int r3 = java.lang.Math.max(r1, r0);
        int r4 = 0;
        if (r3 != 0) goto L6;
        int r8 = 100;
    L5:
        int r9 = 100;
    L20:
        int r10 = java.lang.Math.min(r12.length() - r1, r13.length() - r0);
        int r11 = java.lang.Math.max(r12.length() - r1, r13.length() - r0);
    L21:
        if (r4 >= r10) goto L26;
        if (r12.charAt((r12.length() - 1) - r4) != r13.charAt((r13.length() - 1) - r4)) goto L26;
        r4 = r4 + 1;
    L26:
        return (((r8 + r9) * 25) + (((r4 * 100) / r11) * 50)) / 100;
    L6:
        int r6 = 0;
    L7:
        if (r6 >= r2) goto L11;
        if (r12.charAt(r6) != r13.charAt(r6)) goto L11;
        r6 = r6 + 1;
    L11:
        int r7 = (r6 * 100) / r3;
        if (r7 != 100) goto L14;
        r8 = r7;
        goto L5
    L14:
        int r14 = 0;
    L15:
        if (r14 >= r2) goto L19;
        if (r12.charAt((r1 - 1) - r14) != r13.charAt((r0 - 1) - r14)) goto L19;
        r14 = r14 + 1;
    L19:
        r9 = (r14 * 100) / r3;
        r8 = r7;
        goto L20
    }

    static long j6(int r3, int r4, int r5) {
        long r0 = ((long) r3) << 56;
        return ((FH(r4) << 28) | r0) | FH(r5);
    }

    private abcd.EC j6(abcd.hC.b r3, abcd.hC r4) {
        abcd.EC r0 = new abcd.EC();
        r0.j6(this.j6.j6(r3, r4));
        r0.j6();
        return r0;
    }

    private static java.util.List<abcd.hC> j6(java.util.List<abcd.hC> r2) {
        java.util.ArrayList r0 = new java.util.ArrayList(r2.size());
        java.util.Iterator<abcd.hC> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L5;
        abcd.hC r1 = r3.next();
        if (r1 == null) goto L4;
        r0.add(r1);
        goto L4
    L5:
        return r0;
    }

    private static boolean j6(abcd.AbstractrE r1) {
        if ((r1.DW() & 61440) != 32768) goto L6;
        return true;
    L6:
        return false;
    }

    java.util.List<abcd.hC> DW() {
        return this.DW;
    }

    java.util.List<abcd.hC> FH() {
        return this.VH;
    }

    boolean Hw() {
        return this.Zo;
    }

    java.util.List<abcd.hC> j6() {
        return this.FH;
    }

    void j6(int r1) {
        this.v5 = r1;
    }

    void j6(abcd.LE r10) {
        if (r10 != null) goto L4;
        r10 = abcd.vE.j6;
    L4:
        r10.j6(org.eclipse.jgit.JGitText.j6().renamesFindingByContent, (this.DW.size() * 2) * this.FH.size());
        int r0 = DW(r10);
        this.VH = new java.util.ArrayList(java.lang.Math.min(r0, this.FH.size()));
    L5:
        r0 = r0 - 1;
        if (r0 < 0) goto L7;
        long r2 = this.Hw[r0];
        int r1 = DW(r2);
        int r4 = j6(r2);
        abcd.hC r3 = this.DW.get(r1);
        abcd.hC r5 = this.FH.get(r4);
        if (r5 == null) goto L11;
        if (r3.VH != abcd.hC.a.FH) goto L15;
        abcd.hC.a r7 = abcd.hC.a.Hw;
        r3.VH = r7;
    L16:
        this.VH.add(abcd.hC.j6(r7, r3, r5, FH(r2)));
        this.FH.set(r4, null);
        r10.update(1);
        goto L5
    L15:
        r7 = abcd.hC.a.v5;
        goto L16
    L11:
        r10.update(1);
        goto L5
    L7:
        this.DW = DW(this.DW);
        this.FH = j6(this.FH);
        r10.j6();
    }
}
