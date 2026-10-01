package abcd;

public final class Ip extends abcd.Abstractup {
    private final abcd.Os DW;
    private final abcd.Js FH;
    private abcd.Rp Hw;

    public Ip(abcd.Os r2) {
        if (r2 == null) goto L11;
        this.DW = r2;
        this.FH = j6(r2);
        abcd.Ps r3 = r2.VH();
        if (r3.size() != 0) goto L7;
        abcd.Rp r4 = null;
    L8:
        this.Hw = r4;
        return;
    L7:
        r4 = new abcd.Rp(r3);
        goto L8
    L11:
        throw new java.lang.NullPointerException("prototype == null");
    }

    private static char j6(abcd.Qs r1) {
        char r2 = r1.J8().charAt(0);
        if (r2 != '[') goto L6;
        return 'L';
    L6:
        return r2;
    }

    private static abcd.Js j6(abcd.Os r4) {
        abcd.Ps r0 = r4.VH();
        int r1 = r0.size();
        java.lang.StringBuilder r2 = new java.lang.StringBuilder(r1 + 1);
        r2.append(j6(r4.we()));
        int r5 = 0;
    L3:
        if (r5 >= r1) goto L6;
        r2.append(j6(r0.getType(r5)));
        r5 = r5 + 1;
        goto L3
    L6:
        return new abcd.Js(r2.toString());
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.Hw;
    }

    @Override
    public int VH() {
        return 12;
    }

    @Override
    public void j6(abcd.jp r4) {
        abcd.Op r0 = r4.J8();
        abcd.Qp r1 = r4.Ws();
        abcd.Fp r5 = r4.QX();
        r1.DW(this.DW.we());
        r0.DW(this.FH);
        abcd.Rp r2 = this.Hw;
        if (r2 == null) goto L6;
        this.Hw = (abcd.Rp) r5.DW(r2);
        return;
    }

    @Override
    public void j6(abcd.jp r9, abcd.Lt r10) {
        int r0 = r9.J8().j6(this.FH);
        int r11 = r9.Ws().j6(this.DW.we());
        int r1 = abcd.AbstractGp.FH(this.Hw);
        if (r10.Hw() == false) goto L10;
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();
        r2.append(this.DW.we().aM());
        r2.append(" proto(");
        abcd.Ps r3 = this.DW.VH();
        int r4 = r3.size();
        int r6 = 0;
    L5:
        if (r6 >= r4) goto L9;
        if (r6 == 0) goto L8;
        r2.append(", ");
    L8:
        r2.append(r3.getType(r6).aM());
        r6 = r6 + 1;
        goto L5
    L9:
        r2.append(")");
        r10.j6(0, Ws() + ' ' + r2.toString());
        r10.j6(4, "  shorty_idx:      " + abcd.Yt.gn(r0) + " // " + this.FH.lg());
        r10.j6(4, "  return_type_idx: " + abcd.Yt.gn(r11) + " // " + this.DW.we().aM());
        java.lang.StringBuilder r5 = new java.lang.StringBuilder();
        r5.append("  parameters_off:  ");
        r5.append(abcd.Yt.gn(r1));
        r10.j6(4, r5.toString());
    L10:
        r10.writeInt(r0);
        r10.writeInt(r11);
        r10.writeInt(r1);
    }
}
