package abcd;

public abstract class AbstractwF {
    protected final abcd.IE DW;
    protected final abcd.qG FH;
    private abcd.EE Hw;
    protected abcd.mG[] VH;
    protected abcd.dG[] Zo;
    protected final abcd.UE j6;
    protected abcd.AbstractiG[] v5;

    protected AbstractwF(abcd.UE r2) {
        this.j6 = r2;
        this.DW = this.j6.j3();
        this.FH = new abcd.qG(this.DW);
    }

    protected abcd.TJ DW(int r1, int r2) {
        abcd.dG r3 = j6(r1, r2);
        if (r3 != null) goto L6;
        return new abcd.VJ();
    L6:
        return j6(r3.yS());
    }

    public abcd.UE DW() {
        return this.j6;
    }

    public abstract abcd.yE FH();

    protected abstract boolean Hw();

    public abcd.EE j6() {
        if (this.Hw != null) goto L6;
        this.Hw = DW().aM();
    L6:
        return this.Hw;
    }

    protected abcd.TJ j6(abcd.YD r4) {
        return new abcd.UJ(null, this.DW, r4);
    }

    public abcd.dG j6(int r8, int r9) {
        abcd.dG[] r0 = this.Zo;
        if (r0[r8] == null) goto L18;
        if (r0[r9] == null) goto L16;
        this.FH.we();
        this.FH.j6(abcd.AbstractyG.Hw);
        this.FH.DW(this.Zo[r8]);
        this.FH.DW(this.Zo[r9]);
        abcd.dG r1 = this.FH.tp();
        if (r1 != null) goto L10;
        return null;
    L10:
        abcd.dG r2 = this.FH.tp();
        if (r2 != null) goto L14;
        return r1;
    L14:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().multipleMergeBasesFor, new java.lang.Object[]{this.Zo[r8].we(), this.Zo[r9].we(), r1.we(), r2.we()}));
    L16:
        throw new abcd.ZC(this.v5[r9], "commit");
    L18:
        throw new abcd.ZC(this.v5[r8], "commit");
    }

    public boolean j6(abcd.YD... r6) {
        this.v5 = new abcd.AbstractiG[r6.length];
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r6.length) goto L5;
        this.v5[r1] = this.FH.Zo(r6[r1]);
        r1 = r1 + 1;
        goto L4
    L5:
        this.Zo = new abcd.dG[this.v5.length];
        int r7 = 0;
    L6:
        abcd.AbstractiG[] r2 = this.v5;
        if (r7 >= r2.length) goto L8;
        this.Zo[r7] = this.FH.VH(r2[r7]);     // Catch: abcd.ZC -> L30
    L31:
        r7 = r7 + 1;
    L30:
        this.Zo[r7] = null;
        goto L31
    L8:
        this.VH = new abcd.mG[r2.length];
    L9:
        abcd.AbstractiG[] r8 = this.v5;
        if (r0 >= r8.length) goto L33;
        this.VH[r0] = this.FH.gn(r8[r0]);
        r0 = r0 + 1;
        goto L9
    L33:
        boolean r9 = Hw();     // Catch: java.lang.Throwable -> L21
        if (r9 == true) goto L14;
    L16:
        abcd.EE r3 = this.Hw;
        if (r3 == null) goto L19;
        r3.Hw();
    L19:
        this.DW.FH();
        return r9;
    L14:
        if (this.Hw == null) goto L16;
        this.Hw.FH();     // Catch: java.lang.Throwable -> L21
    L21:
        th = move-exception;
        abcd.EE r4 = this.Hw;
        if (r4 == null) goto L25;
        r4.Hw();
    L25:
        this.DW.FH();
        throw th;
    }
}
