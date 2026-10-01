package abcd;

public class in implements abcd.Lm.c {
    private final abcd.Interfacexn DW;
    private final abcd.Pt j6;

    public in(abcd.Pt r1, abcd.Interfacexn r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.j6 = r1;
        this.DW = r2;
        return;
    L8:
        throw new java.lang.NullPointerException("observer == null");
    L10:
        throw new java.lang.NullPointerException("bytes == null");
    }

    private java.lang.String DW(int r4) {
        int r0 = this.j6.v5(r4);
        java.lang.String r1 = abcd.Km.DW(r0);
        if (r0 != 196) goto L6;
        r1 = r1 + " " + abcd.Km.DW(this.j6.v5(r4 + 1));
    L6:
        return abcd.Yt.v5(r4) + ": " + r1;
    }

    private void DW(int r5, int r6, int r7, int r8) {
        if (r7 == 1) goto L5;
        java.lang.String r9 = " #" + abcd.Yt.gn(r8);
    L6:
        this.DW.j6(this.j6, r6, r7, DW(r6) + r9 + " // " + java.lang.Float.intBitsToFloat(r8));
        return;
    L5:
        r9 = "";
        goto L6
    }

    private void DW(int r4, int r5, int r6, long r7) {
        if (r6 != 1) goto L5;
        java.lang.String r0 = " // ";
    L6:
        if (r6 != 1) goto L8;
        java.lang.String r8 = abcd.Yt.j6((int) r7);
    L9:
        this.DW.j6(this.j6, r5, r6, DW(r5) + r0 + r8);
        return;
    L8:
        r8 = abcd.Yt.j6(r7);
        goto L9
    L5:
        r0 = " #";
        goto L6
    }

    private void FH(int r5, int r6, int r7, int r8) {
        if (r7 != 1) goto L5;
        java.lang.String r0 = " // ";
    L6:
        int r1 = this.j6.v5(r6);
        if (r7 != 1) goto L9;
    L15:
        java.lang.String r9 = "#" + abcd.Yt.j6(r8);
    L16:
        this.DW.j6(this.j6, r6, r7, DW(r6) + r0 + r9);
        return;
    L9:
        if (r1 == 16) goto L15;
        if (r1 != 17) goto L14;
        r9 = "#" + abcd.Yt.DW(r8);
        goto L16
    L14:
        r9 = "#" + abcd.Yt.FH(r8);
        goto L16
    L5:
        r0 = " ";
        goto L6
    }

    private void j6(int r5, int r6, int r7, long r8) {
        if (r7 == 1) goto L5;
        java.lang.String r9 = " #" + abcd.Yt.DW(r8);
    L6:
        this.DW.j6(this.j6, r6, r7, DW(r6) + r9 + " // " + java.lang.Double.longBitsToDouble(r8));
        return;
    L5:
        r9 = "";
        goto L6
    }

    @Override
    public int j6() {
        return -1;
    }

    @Override
    public void j6(int r1) {
    }

    @Override
    public void j6(int r3, int r4, int r5) {
        this.DW.j6(this.j6, r4, r5, DW(r4));
    }

    @Override
    public void j6(int r4, int r5, int r6, int r7) {
        if (r6 > 3) goto L5;
        java.lang.String r8 = abcd.Yt.v5(r7);
    L6:
        this.DW.j6(this.j6, r5, r6, DW(r5) + " " + r8);
        return;
    L5:
        r8 = abcd.Yt.gn(r7);
        goto L6
    }

    @Override
    public void j6(int r5, int r6, int r7, int r8, abcd.Qs r9, int r10) {
        if (r7 > 3) goto L5;
        java.lang.String r11 = abcd.Yt.Hw(r8);
    L6:
        boolean r1 = true;
        if (r7 == 1) goto L10;
        r1 = false;
    L10:
        java.lang.String r3 = "";
        if (r5 != 132) goto L17;
        java.lang.StringBuilder r12 = new java.lang.StringBuilder();
        r12.append(", #");
        if (r7 > 3) goto L15;
        java.lang.String r13 = abcd.Yt.j6(r10);
    L16:
        r12.append(r13);
        java.lang.String r14 = r12.toString();
    L19:
        if (r9.yS() == false) goto L25;
        java.lang.StringBuilder r15 = new java.lang.StringBuilder();
        if (r1 == false) goto L23;
        java.lang.String r16 = ",";
    L24:
        r15.append(r16);
        r15.append(" category-2");
        r3 = r15.toString();
        goto L25
    L23:
        r16 = " //";
    L25:
        abcd.Interfacexn r17 = this.DW;
        abcd.Pt r18 = this.j6;
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(DW(r6));
        if (r1 == false) goto L28;
        java.lang.String r2 = " // ";
    L29:
        r0.append(r2);
        r0.append(r11);
        r0.append(r14);
        r0.append(r3);
        r17.j6(r18, r6, r7, r0.toString());
        return;
    L28:
        r2 = " ";
        goto L29
    L15:
        r13 = abcd.Yt.DW(r10);
        goto L16
    L17:
        r14 = "";
        goto L19
    L5:
        r11 = abcd.Yt.v5(r8);
        goto L6
    }

    @Override
    public void j6(int r2, int r3, int r4, abcd.Qs r5) {
        this.DW.j6(this.j6, r3, r4, DW(r3));
    }

    @Override
    public void j6(int r4, int r5, int r6, abcd.cn r7, int r8) {
        int r9 = r7.size();
        java.lang.StringBuffer r0 = new java.lang.StringBuffer((r9 * 20) + 100);
        r0.append(DW(r5));
        if (r8 == 0) goto L5;
        r0.append(" // padding: " + abcd.Yt.gn(r8));
    L5:
        r0.append('\n');
        int r1 = 0;
    L6:
        if (r1 >= r9) goto L8;
        r0.append("  ");
        r0.append(abcd.Yt.FH(r7.FH(r1)));
        r0.append(": ");
        r0.append(abcd.Yt.v5(r7.DW(r1)));
        r0.append('\n');
        r1 = r1 + 1;
        goto L6
    L8:
        r0.append("  default: ");
        r0.append(abcd.Yt.v5(r7.lg()));
        this.DW.j6(this.j6, r5, r6, r0.toString());
    }

    @Override
    public void j6(int r7, int r8, int r9, abcd.Abstractms r10, int r11) {
        if ((r10 instanceof abcd.As) == false) goto L7;
        j6(r7, r8, r9, null);
        return;
    L7:
        if ((r10 instanceof abcd.ys) == false) goto L11;
        FH(r7, r8, r9, r11);
        return;
    L11:
        if ((r10 instanceof abcd.Es) == false) goto L15;
        DW(r7, r8, r9, ((abcd.Es) r10).rN());
        return;
    L15:
        if ((r10 instanceof abcd.xs) == false) goto L19;
        DW(r7, r8, r9, ((abcd.xs) r10).Ws());
        return;
    L19:
        if ((r10 instanceof abcd.us) == false) goto L22;
        j6(r7, r8, r9, ((abcd.us) r10).lg());
        return;
    L22:
        if (r11 != 0) goto L24;
        java.lang.String r12 = "";
    L28:
        this.DW.j6(this.j6, r8, r9, DW(r8) + " " + r10 + r12);
        return;
    L24:
        if (r7 != 197) goto L26;
        r12 = ", " + abcd.Yt.Hw(r11);
        goto L28
    L26:
        r12 = ", " + abcd.Yt.v5(r11);
        goto L28
    }

    @Override
    public void j6(int r5, int r6, abcd.Ks r7, java.util.ArrayList<abcd.Abstractms> r8) {
        if (r6 != 1) goto L5;
        java.lang.String r9 = " // ";
    L6:
        java.lang.String r10 = r7.VH().we().aM();
        this.DW.j6(this.j6, r5, r6, DW(r5) + r9 + r10);
        return;
    L5:
        r9 = " ";
        goto L6
    }
}
