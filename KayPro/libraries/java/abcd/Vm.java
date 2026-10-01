package abcd;

public class Vm extends abcd.AbstractRm {
    private final abcd.Rs[] DW;

    public Vm(int r2) {
        if (r2 == 0) goto L4;
        boolean r0 = true;
    L5:
        super(r0);
        this.DW = new abcd.Rs[r2];
        return;
    L4:
        r0 = false;
        goto L5
    }

    private static abcd.Rs j6(int r3, java.lang.String r4) {
        throw new abcd.an("local " + abcd.Yt.v5(r3) + ": " + r4);
    }

    public abcd.Rs DW(int r2) {
        return this.DW[r2];
    }

    @Override
    public void DW(abcd.Qs r6) {
        int r0 = this.DW.length;
        if (r0 != 0) goto L5;
        return;
    L5:
        J8();
        abcd.Qs r1 = r6.Ws();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L11;
        abcd.Rs[] r3 = this.DW;
        if (r3[r2] != r6) goto L10;
        r3[r2] = r1;
    L10:
        r2 = r2 + 1;
        goto L6
    }

    public void FH(int r3) {
        J8();
        this.DW[r3] = null;
    }

    @Override
    public java.lang.String aM() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        int r1 = 0;
    L3:
        abcd.Rs[] r2 = this.DW;
        if (r1 >= r2.length) goto L11;
        abcd.Rs r3 = r2[r1];
        if (r3 != null) goto L8;
        java.lang.String r4 = "<invalid>";
    L9:
        r0.append("locals[" + abcd.Yt.v5(r1) + "]: " + r4 + "\n");
        r1 = r1 + 1;
        goto L3
    L8:
        r4 = r3.toString();
        goto L9
    L11:
        return r0.toString();
    }

    public int er() {
        return this.DW.length;
    }

    @Override
    public abcd.Rs get(int r2) {
        abcd.Rs r0 = this.DW[r2];
        if (r0 == null) goto L5;
        return r0;
    L5:
        j6(r2, "invalid");
        throw null;
    }

    @Override
    public abcd.AbstractRm j6(abcd.AbstractRm r2) {
        if ((r2 instanceof abcd.Vm) == false) goto L7;
        return j6((abcd.Vm) r2);
    L7:
        return r2.j6(this);
    }

    @Override
    public abcd.Sm j6(abcd.AbstractRm r3, int r4) {
        return new abcd.Sm(er()).j6(r3, r4);
    }

    public abcd.Vm j6(abcd.Vm r3) {
        return abcd.Um.j6(this, r3);
    L4:
        e = move-exception;
        e.j6("underlay locals:");
        j6(e);
        e.j6("overlay locals:");
        r3.j6(e);
        throw e;
    }

    @Override
    public void j6(int r4, abcd.Rs r5) {
        J8();
        abcd.Rs r6 = r5.U2();     // Catch: java.lang.NullPointerException -> L18
        if (r4 < 0) goto L17;
        if (r6.getType().yS() == false) goto L8;
        this.DW[r4 + 1] = null;
    L8:
        abcd.Rs[] r0 = this.DW;
        r0[r4] = r6;
        if (r4 == 0) goto L22;
        int r7 = r4 - 1;
        abcd.Rs r8 = r0[r7];
        if (r8 != null) goto L13;
        return;
    L13:
        if (r8.getType().yS() == false) goto L24;
        this.DW[r7] = null;
        return;
    L24:
        return;
    L22:
        return;
    L17:
        throw new java.lang.IndexOutOfBoundsException("idx < 0");
    L19:
        throw new java.lang.NullPointerException("type == null");
    }

    @Override
    public void j6(abcd.Vt r5) {
        int r0 = 0;
    L3:
        abcd.Rs[] r1 = this.DW;
        if (r0 >= r1.length) goto L10;
        abcd.Rs r2 = r1[r0];
        if (r2 != null) goto L8;
        java.lang.String r3 = "<invalid>";
    L9:
        r5.j6("locals[" + abcd.Yt.v5(r0) + "]: " + r3);
        r0 = r0 + 1;
        goto L3
    L8:
        r3 = r2.toString();
        goto L9
    }

    @Override
    public void j6(abcd.bs r2) {
        j6(r2.we(), r2);
    }

    @Override
    public abcd.AbstractRm lg() {
        return lg();
    }

    @Override
    public abcd.Vm lg() {
        abcd.Vm r0 = new abcd.Vm(this.DW.length);
        abcd.Rs[] r1 = this.DW;
        java.lang.System.arraycopy(r1, 0, r0.DW, 0, r1.length);
        return r0;
    }

    @Override
    protected abcd.Vm rN() {
        return this;
    }
}
