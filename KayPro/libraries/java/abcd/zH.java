package abcd;

class zH {
    private static final int DW = 0;
    private static final int j6 = 0;
    private final abcd.uE EQ;
    private final abcd.LE FH;
    private final abcd.IE Hw;
    private final java.util.List<abcd.MH> VH;
    private final AE<abcd.MH> Zo;
    private final abcd.KH gn;
    private final abcd.UJ tp;
    private final AE<abcd.zH.a> u7;
    private final abcd.yE[] v5;

    private static class a extends abcd.AE.a {
        final byte[] EQ;

        a(abcd.YD r1, byte[] r2) {
            super(r1);
            this.EQ = r2;
        }
    }

    static {
        j6 = abcd.AbstractrE.FH.DW();
        DW = abcd.AbstractrE.j6.DW();
    }

    zH(abcd.LE r1, java.util.Set<abcd.mG> r2, AE<abcd.MH> r3, java.util.List<abcd.MH> r4, abcd.IE r5) {
        this.FH = r1;
        this.Hw = r5;
        this.v5 = (abcd.yE[]) r2.toArray(new abcd.yE[r2.size()]);
        this.Zo = r3;
        this.VH = r4;
        this.gn = new abcd.KH();
        this.u7 = new abcd.AE();
        this.tp = new abcd.UJ();
        this.EQ = new abcd.uE();
    }

    private static int j6(int r1) {
        if (r1 == 2) goto L11;
        if (r1 == 3) goto L9;
        return 0;
    L9:
        return j6;
    L11:
        return DW;
    }

    private static int j6(byte[] r2, int r3, int r4) {
    L2:
        if (r3 >= r4) goto L7;
        if (r2[r3] == 47) goto L7;
        r3 = r3 + 1;
    L7:
        return r3;
    }

    private void j6(abcd.YD r2, int r3, int r4) {
        abcd.MH r0 = new abcd.MH(r2, r3);
        r0.ro();
        r0.v5(r4);
        if (this.Zo.DW(r0) != r0) goto L6;
        this.VH.add(r0);
        this.FH.update(1);
        return;
    }

    private byte[] j6(abcd.YD r4) {
        abcd.zH.a r0 = (abcd.zH.a) this.u7.DW(r4);
        if (r0 != null) goto L5;
        byte[] r1 = this.Hw.Hw(r4, 2).DW(Integer.MAX_VALUE);
        this.u7.j6(new abcd.zH.a(r4, r1));
        return r1;
    L5:
        return r0.EQ;
    }

    void j6(int r17, byte[] r18, int r19, int r20) {
        int r5 = j6(r17);
        if (r5 != 0) goto L6;
        return;
    L6:
        if (this.gn.j6(r20) == true) goto L8;
        return;
    L8:
        int r6 = 0;
        if (r19 != 0) goto L14;
        abcd.yE[] r7 = this.v5;
        int r8 = r7.length;
    L11:
        if (r6 >= r8) goto L12;
        j6(r7[r6], 2, r20);
        r6 = r6 + 1;
        goto L11
    L12:
        return;
    L14:
        int r9 = j6(r18, 0, r19);
        abcd.yE[] r10 = this.v5;
        int r11 = r10.length;
        int r12 = 0;
    L15:
        if (r12 >= r11) goto L16;
        abcd.yE r13 = r10[r12];
        if (r9 == r19) goto L20;
        int r14 = DW;
    L21:
        this.tp.j6(j6(r13));
        int r15 = r14;
        int r16 = 0;
        int r110 = r9;
    L23:
        if (this.tp.DW() == true) goto L36;
        int r111 = this.tp.j6(r18, r16, r110, r15);
        if (r111 < 0) goto L27;
        if (r111 > 0) goto L36;
        if (r110 == r19) goto L32;
        if (abcd.AbstractrE.j6.j6(this.tp.VH()) == false) goto L36;
        r16 = r110 + 1;
        r110 = j6(r18, r16, r19);
        if (r110 == r19) goto L40;
        r15 = DW;
    L41:
        this.EQ.Hw(this.tp.u7(), this.tp.tp());
        this.tp.j6(j6(this.EQ));
        goto L23
    L40:
        r15 = r5;
        goto L41
    L32:
        if (this.tp.Hw().FH() != r17) goto L36;
        this.EQ.Hw(this.tp.u7(), this.tp.tp());
        j6(this.EQ, r17, r20);
        goto L36
    L27:
        this.tp.J8();
    L36:
        r12 = r12 + 1;
        goto L15
    L20:
        r14 = r5;
        goto L21
    }
}
