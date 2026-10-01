package abcd;

public class dG extends abcd.AbstractiG {
    static final abcd.dG[] we = null;
    private abcd.mG J0;
    abcd.dG[] J8;
    int QX;
    int Ws;
    private byte[] XL;

    static {
        we = new abcd.dG[0];
    }

    protected dG(abcd.YD r1) {
        super(r1);
    }

    static void j6(abcd.dG r5, int r6) {
    L2:
        abcd.dG[] r7 = r5.J8;
        if (r7 == null) goto L4;
        int r0 = r7.length;
        if (r0 == 0) goto L7;
        int r1 = 1;
    L9:
        if (r1 >= r0) goto L10;
        abcd.dG r2 = r7[r1];
        int r3 = r2.EQ;
        if ((r3 & r6) == r6) goto L18;
        r2.EQ = r3 | r6;
        j6(r2, r6);
    L18:
        r1 = r1 + 1;
        goto L9
    L10:
        r5 = r7[0];
        int r4 = r5.EQ;
        if ((r4 & r6) == r6) goto L12;
        r5.EQ = r4 | r6;
        goto L2
    L12:
        return;
    L7:
        return;
    }

    static boolean j6(byte[] r2, int r3, int r4) {
    L2:
        if (r3 >= r4) goto L3;
        int r0 = r3 + 1;
        if (r2[r3] == 10) goto L7;
        r3 = r0;
        goto L2
    L7:
        return true;
    L3:
        return false;
    }

    public final abcd.dG DW(int r2) {
        return this.J8[r2];
    }

    void DW(abcd.qG r2) {
        if (this.XL != null) goto L8;
        this.XL = r2.j6(this);
        if ((this.EQ & 1) != 0) goto L9;
        j6(r2, this.XL);
        return;
    L9:
        return;
    }

    public void FH(abcd.fG r2) {
        int r0 = this.EQ;
        int r3 = r2.Hw & r0;
        if (r3 == 0) goto L6;
        j6(this, r3);
        return;
    }

    public final abcd.KE Mr() {
        byte[] r0 = this.XL;
        int r1 = abcd.IK.j6(r0, 0);
        if (r1 >= 0) goto L7;
        return null;
    L7:
        return abcd.IK.u7(r0, r1);
    }

    public final int U2() {
        return this.Ws;
    }

    public final java.lang.String a8() {
        byte[] r0 = this.XL;
        int r1 = abcd.IK.DW(r0, 0);
        if (r1 >= 0) goto L7;
        return "";
    L7:
        return abcd.IK.j6(abcd.IK.DW(r0), r0, r1, r0.length);
    }

    @Override
    public final int aM() {
        return 1;
    }

    public final java.lang.String er() {
        byte[] r0 = this.XL;
        int r1 = abcd.IK.DW(r0, 0);
        if (r1 >= 0) goto L6;
        return "";
    L6:
        java.nio.charset.Charset r2 = abcd.IK.DW(r0);
        int r3 = abcd.IK.v5(r0, r1);
        java.lang.String r4 = abcd.IK.j6(r2, r0, r1, r3);
        if (j6(r0, r1, r3) == true) goto L9;
        return r4;
    L9:
        return r4.replace('\n', ' ');
    }

    public void gW() {
        this.QX = 0;
    }

    final void j3() {
        this.XL = null;
    }

    @Override
    void j6(abcd.qG r2) {
        j6(r2, r2.j6(this));
    }

    void j6(abcd.qG r9, byte[] r10) {
        abcd.uE r0 = r9.FH;
        r0.v5(r10, 5);
        this.J0 = r9.v5(r0);
        int r3 = 46;
        if (this.J8 != null) goto L23;
        abcd.dG[] r5 = new abcd.dG[1];
        int r1 = 0;
    L6:
        if (r10[r3] != 112) goto L8;
        r0.v5(r10, r3 + 7);
        abcd.dG r6 = r9.FH(r0);
        if (r1 != 0) goto L16;
        int r7 = r1 + 1;
        r5[r1] = r6;
    L15:
        r1 = r7;
    L22:
        r3 = r3 + 48;
        goto L6
    L16:
        if (r1 != 1) goto L19;
        r5 = new abcd.dG[]{r5[0], r6};
        r1 = 2;
        goto L22
    L19:
        if (r5.length > r1) goto L21;
        abcd.dG[] r8 = new abcd.dG[r5.length + 32];
        java.lang.System.arraycopy(r5, 0, r8, 0, r1);
        r5 = r8;
    L21:
        r7 = r1 + 1;
        r5[r1] = r6;
        goto L15
    L8:
        if (r1 == r5.length) goto L10;
        abcd.dG[] r2 = new abcd.dG[r1];
        java.lang.System.arraycopy(r5, 0, r2, 0, r1);
    L11:
        this.J8 = r2;
        goto L23
    L10:
        r2 = r5;
    L23:
        int r4 = abcd.IK.FH(r10, r3);
        if (r4 <= 0) goto L27;
        this.Ws = abcd.IK.j6(r10, abcd.IK.DW(r10, r4, '>'), null);
    L27:
        if (r9.u7() == false) goto L29;
        this.XL = r10;
    L29:
        this.EQ |= 1;
    }

    public final int lg() {
        return this.J8.length;
    }

    public final abcd.dG[] rN() {
        return this.J8;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(abcd.hE.DW(aM()));
        r0.append(' ');
        r0.append(we());
        r0.append(' ');
        r0.append(this.Ws);
        r0.append(' ');
        j6(r0);
        return r0.toString();
    }

    public final abcd.mG yS() {
        return this.J0;
    }
}
