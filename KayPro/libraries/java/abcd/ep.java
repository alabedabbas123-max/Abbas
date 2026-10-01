package abcd;

public final class ep extends abcd.AbstractGp {
    private abcd._o VH;
    private final abcd.Un Zo;
    private final boolean gn;
    private abcd.C0883ip tp;
    private final abcd.Ss u7;
    private final abcd.Gs v5;

    public ep(abcd.Gs r3, abcd.Un r4, boolean r5, abcd.Ss r6) {
        super(4, -1);
        if (r3 == null) goto L13;
        if (r4 == null) goto L11;
        if (r6 == null) goto L9;
        this.v5 = r3;
        this.Zo = r4;
        this.gn = r5;
        this.u7 = r6;
        this.VH = null;
        this.tp = null;
        return;
    L9:
        throw new java.lang.NullPointerException("throwsList == null");
    L11:
        throw new java.lang.NullPointerException("code == null");
    L13:
        throw new java.lang.NullPointerException("ref == null");
    }

    private void FH(abcd.jp r2, abcd.Lt r3) {
        this.Zo.Hw().j6(r3);     // Catch: java.lang.RuntimeException -> L5
        return;
    L5:
        e = move-exception;
        throw abcd.Vt.j6(e, "...while writing instructions for " + this.v5.aM());
    }

    private int Mr() {
        return this.Zo.Hw().er();
    }

    private int U2() {
        return this.Zo.Hw().yS();
    }

    private int j3() {
        return this.v5.j6(this.gn);
    }

    @Override
    protected void DW(abcd.AbstractKp r2, int r3) {
        abcd.jp r4 = r2.DW();
        this.Zo.j6(new abcd.dp(this, r4));
        abcd._o r5 = this.VH;
        if (r5 == null) goto L5;
        r5.j6(r4);
        int r6 = this.VH.DW();
    L6:
        int r7 = this.Zo.Hw().rN();
        if ((r7 & 1) == 0) goto L9;
        r7 = r7 + 1;
    L9:
        j6(((r7 * 2) + 16) + r6);
        return;
    L5:
        r6 = 0;
        goto L6
    }

    @Override
    protected void DW(abcd.jp r14, abcd.Lt r15) {
        boolean r0 = r15.Hw();
        int r1 = U2();
        int r2 = Mr();
        int r3 = j3();
        int r4 = this.Zo.Hw().rN();
        if ((r4 & 1) == 0) goto L5;
        boolean r5 = true;
    L6:
        abcd._o r7 = this.VH;
        if (r7 != null) goto L9;
        int r8 = 0;
    L10:
        abcd.C0883ip r9 = this.tp;
        if (r9 != null) goto L13;
        int r10 = 0;
    L15:
        if (r0 == false) goto L19;
        r15.j6(0, Ws() + ' ' + this.v5.aM());
        java.lang.StringBuilder r11 = new java.lang.StringBuilder();
        r11.append("  registers_size: ");
        r11.append(abcd.Yt.v5(r1));
        r15.j6(2, r11.toString());
        r15.j6(2, "  ins_size:       " + abcd.Yt.v5(r3));
        r15.j6(2, "  outs_size:      " + abcd.Yt.v5(r2));
        r15.j6(2, "  tries_size:     " + abcd.Yt.v5(r8));
        r15.j6(4, "  debug_off:      " + abcd.Yt.gn(r10));
        r15.j6(4, "  insns_size:     " + abcd.Yt.gn(r4));
        if (this.u7.size() == 0) goto L19;
        r15.j6(0, "  throws " + abcd.Ps.DW(this.u7));
    L19:
        r15.writeShort(r1);
        r15.writeShort(r3);
        r15.writeShort(r2);
        r15.writeShort(r8);
        r15.writeInt(r10);
        r15.writeInt(r4);
        FH(r14, r15);
        if (this.VH == null) goto L26;
        if (r5 == false) goto L25;
        if (r0 == false) goto L24;
        r15.j6(2, "  padding: 0");
    L24:
        r15.writeShort(0);
    L25:
        this.VH.j6(r14, r15);
    L26:
        if (r0 == true) goto L28;
        return;
    L28:
        if (this.tp == null) goto L32;
        r15.j6(0, "  debug info");
        this.tp.j6(r14, r15, "    ");
        return;
    L32:
        return;
    L13:
        r10 = r9.we();
        goto L15
    L9:
        r8 = r7.j6();
        goto L10
    L5:
        r5 = false;
        goto L6
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.J0;
    }

    @Override
    public java.lang.String aM() {
        return this.v5.aM();
    }

    @Override
    public void j6(abcd.jp r7) {
        abcd.Fp r0 = r7.j6();
        abcd.Qp r1 = r7.Ws();
        if (this.Zo.u7() == false) goto L5;
    L6:
        this.tp = new abcd.C0883ip(this.Zo, this.gn, this.v5);
        r0.j6(this.tp);
    L8:
        if (this.Zo.VH() == false) goto L14;
        java.util.Iterator<abcd.Qs> r2 = this.Zo.j6().iterator();
    L11:
        if (r2.hasNext() == false) goto L13;
        r1.DW(r2.next());
        goto L11
    L13:
        this.VH = new abcd._o(this.Zo);
    L14:
        java.util.Iterator<abcd.Abstractms> r3 = this.Zo.FH().iterator();
    L16:
        if (r3.hasNext() == false) goto L18;
        r7.DW(r3.next());
        goto L16
    L18:
        return;
    L5:
        if (this.Zo.gn() == false) goto L8;
        goto L6
    }

    public java.lang.String toString() {
        return "CodeItem{" + aM() + "}";
    }
}
