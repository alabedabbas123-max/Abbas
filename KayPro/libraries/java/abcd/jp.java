package abcd;

public final class jp {
    private final abcd.Fp DW;
    private final abcd.C0621cp EQ;
    private final abcd.Fp FH;
    private final abcd.Fp Hw;
    private final abcd.Fp J0;
    private final abcd.sp J8;
    private int QX;
    private final abcd.Qp VH;
    private final abcd.AbstractKp[] Ws;
    private int XL;
    private final abcd.Op Zo;
    private final abcd.Jp gn;
    private abcd.Fn j6;
    private final abcd.Cp tp;
    private final abcd.qp u7;
    private final abcd.Fp v5;
    private final abcd.Fp we;

    public jp(abcd.Fn r6) {
        this.j6 = r6;
        this.J8 = new abcd.sp(this);
        this.FH = new abcd.Fp(null, this, 4, abcd.Fp.a.j6);
        this.DW = new abcd.Fp("word_data", this, 4, abcd.Fp.a.DW);
        this.v5 = new abcd.Fp("string_data", this, 1, abcd.Fp.a.FH);
        this.we = new abcd.Fp(null, this, 1, abcd.Fp.a.j6);
        this.J0 = new abcd.Fp("byte_data", this, 1, abcd.Fp.a.DW);
        this.Zo = new abcd.Op(this);
        this.VH = new abcd.Qp(this);
        this.gn = new abcd.Jp(this);
        this.u7 = new abcd.qp(this);
        this.tp = new abcd.Cp(this);
        this.EQ = new abcd.C0621cp(this);
        this.Hw = new abcd.Fp("map", this, 4, abcd.Fp.a.j6);
        this.Ws = new abcd.AbstractKp[]{this.J8, this.Zo, this.VH, this.gn, this.u7, this.tp, this.EQ, this.DW, this.FH, this.v5, this.J0, this.we, this.Hw};
        this.QX = -1;
        this.XL = 79;
    }

    private static void DW(byte[] r3) {
        java.security.MessageDigest r0 = java.security.MessageDigest.getInstance("SHA-1");     // Catch: java.security.NoSuchAlgorithmException -> L12
        r0.update(r3, 32, r3.length - 32);
        int r4 = r0.digest(r3, 12, 20);     // Catch: java.security.DigestException -> L9
        if (r4 != 20) goto L8;
        return;
    L8:
        throw new java.lang.RuntimeException("unexpected digest write: " + r4 + " bytes");     // Catch: java.security.DigestException -> L9
    L9:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    L12:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    private abcd.Qt j6(boolean r9, boolean r10) {
        this.EQ.v5();
        this.we.v5();
        this.DW.v5();
        this.J0.v5();
        this.tp.v5();
        this.u7.v5();
        this.gn.v5();
        this.FH.v5();
        this.VH.v5();
        this.Zo.v5();
        this.v5.v5();
        this.J8.v5();
        int r0 = this.Ws.length;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r2 >= r0) goto L20;
        abcd.AbstractKp r5 = this.Ws[r2];
        int r6 = r5.DW(r3);
        if (r6 < r3) goto L19;
        if (r5 != this.Hw) goto L11;
        abcd.xp.j6(this.Ws, this.Hw);     // Catch: java.lang.RuntimeException -> L15
        this.Hw.v5();     // Catch: java.lang.RuntimeException -> L15
    L11:
        if ((r5 instanceof abcd.Fp) == false) goto L14;
        ((abcd.Fp) r5).tp();     // Catch: java.lang.RuntimeException -> L15
    L14:
        r3 = r5.u7() + r6;
        r2 = r2 + 1;
    L15:
        e = move-exception;
        throw abcd.Vt.j6(e, "...while writing section " + r2);
    L19:
        throw new java.lang.RuntimeException("bogus placement for section " + r2);
    L20:
        this.QX = r3;
        byte[] r4 = new byte[this.QX];
        abcd.Qt r7 = new abcd.Qt(r4);
        if (r9 == false) goto L23;
        r7.j6(this.XL, r10);
    L23:
        if (r1 >= r0) goto L37;
        abcd.AbstractKp r11 = this.Ws[r1];     // Catch: java.lang.RuntimeException -> L29
        int r8 = r11.FH() - r7.v5();     // Catch: java.lang.RuntimeException -> L29
        if (r8 < 0) goto L28;
        r7.j6(r11.FH() - r7.v5());     // Catch: java.lang.RuntimeException -> L29
        r11.DW(r7);     // Catch: java.lang.RuntimeException -> L29
        r1 = r1 + 1;     // Catch: java.lang.RuntimeException -> L29
        goto L23
    L28:
        throw new abcd.Vt("excess write of " + (-r8));     // Catch: java.lang.RuntimeException -> L29
    L29:
        e = move-exception;
        if ((e instanceof abcd.Vt) == false) goto L33;
        abcd.Vt r12 = (abcd.Vt) e;
    L34:
        r12.j6("...while writing section " + r1);
        throw r12;
    L33:
        r12 = new abcd.Vt(e);
        goto L34
    L37:
        if (r7.v5() != this.QX) goto L43;
        DW(r4);
        j6(r4);
        if (r9 == false) goto L41;
        this.DW.j6(r7, abcd.Enumwp.J0, "\nmethod code index:\n\n");
        we().j6(r7);
        r7.Zo();
    L41:
        return r7;
    L43:
        throw new java.lang.RuntimeException("foreshortened write");
    }

    private static void j6(byte[] r3) {
        java.util.zip.Adler32 r0 = new java.util.zip.Adler32();
        r0.update(r3, 12, r3.length - 12);
        int r1 = (int) r0.getValue();
        r3[8] = (byte) r1;
        r3[9] = (byte) (r1 >> 8);
        r3[10] = (byte) (r1 >> 16);
        r3[11] = (byte) (r1 >> 24);
    }

    abcd.Fp DW() {
        return this.we;
    }

    void DW(abcd.Abstractms r2) {
        if ((r2 instanceof abcd.Js) == false) goto L6;
        this.Zo.DW((abcd.Js) r2);
        return;
    L6:
        if ((r2 instanceof abcd.Ks) == false) goto L9;
        this.VH.DW((abcd.Ks) r2);
        return;
    L9:
        if ((r2 instanceof abcd.Abstractqs) == false) goto L12;
        this.tp.DW((abcd.Abstractqs) r2);
        return;
    L12:
        if ((r2 instanceof abcd.ws) == false) goto L15;
        this.u7.DW((abcd.ws) r2);
        return;
    L15:
        if ((r2 instanceof abcd.vs) == false) goto L17;
        this.u7.DW(((abcd.vs) r2).J8());
        return;
    L17:
        if (r2 == null) goto L20;
        return;
    L20:
        throw new java.lang.NullPointerException("cst == null");
    }

    abcd.Jp EQ() {
        return this.gn;
    }

    abcd.C0621cp FH() {
        return this.EQ;
    }

    public abcd.Fn Hw() {
        return this.j6;
    }

    abcd.Fp J0() {
        return this.v5;
    }

    abcd.Op J8() {
        return this.Zo;
    }

    abcd.Fp QX() {
        return this.FH;
    }

    abcd.AbstractKp VH() {
        return this.DW;
    }

    abcd.Qp Ws() {
        return this.VH;
    }

    abcd.Fp XL() {
        return this.DW;
    }

    int Zo() {
        int r0 = this.QX;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new java.lang.RuntimeException("file size not yet known");
    }

    abcd.AbstractKp gn() {
        return this.Hw;
    }

    abcd.Fp j6() {
        return this.J0;
    }

    abcd.Abstractup j6(abcd.Abstractms r2) {
        if ((r2 instanceof abcd.Js) == false) goto L7;
        return this.Zo.j6(r2);
    L7:
        if ((r2 instanceof abcd.Ks) == false) goto L11;
        return this.VH.j6(r2);
    L11:
        if ((r2 instanceof abcd.Abstractqs) == false) goto L15;
        return this.tp.j6(r2);
    L15:
        if ((r2 instanceof abcd.ws) == true) goto L17;
        return null;
    L17:
        return this.u7.j6(r2);
    }

    public void j6(abcd.C0577bp r2) {
        this.EQ.j6(r2);
    }

    public byte[] j6(java.io.Writer r2, boolean r3) {
        if (r2 == null) goto L4;
        boolean r0 = true;
    L5:
        abcd.Qt r4 = j6(r0, r3);
        if (r0 == false) goto L9;
        r4.j6(r2);
    L9:
        return r4.VH();
    L4:
        r0 = false;
        goto L5
    }

    abcd.Cp tp() {
        return this.tp;
    }

    abcd.Fp u7() {
        return this.Hw;
    }

    abcd.qp v5() {
        return this.u7;
    }

    public abcd.Lp we() {
        abcd.Lp r0 = new abcd.Lp();
        abcd.AbstractKp[] r1 = this.Ws;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        r0.j6(r1[r3]);
        r3 = r3 + 1;
        goto L3
    L5:
        return r0;
    }
}
