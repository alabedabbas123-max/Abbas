package abcd;

public abstract class AbstractFm implements abcd.InterfaceTm {
    private abcd.Rs[] DW;
    private boolean EQ;
    private int FH;
    private abcd.Qs Hw;
    private abcd.Rs[] J0;
    private int J8;
    private int VH;
    private abcd.Abstractms Zo;
    private abcd.cn gn;
    private final abcd.Os j6;
    private int tp;
    private java.util.ArrayList<abcd.Abstractms> u7;
    private int v5;
    private abcd.bs we;

    public AbstractFm(abcd.Os r2) {
        if (r2 == null) goto L7;
        this.j6 = r2;
        this.DW = new abcd.Rs[10];
        this.J0 = new abcd.Rs[6];
        j6();
        return;
    L7:
        throw new java.lang.NullPointerException("prototype == null");
    }

    public static void j6(abcd.Rs r3, abcd.Rs r4) {
        throw new abcd.an("local variable type mismatch: attempt to set or access a value of type " + r3.aM() + " using a local variable of type " + r4.aM() + ". This is symptomatic of .class transformation tools that ignore local variable information.");
    }

    @Override
    public abcd.Os DW() {
        return this.j6;
    }

    protected final abcd.bs DW(boolean r5) {
        if (this.we != null) goto L6;
        return null;
    L6:
        if (this.J8 == 1) goto L13;
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("local target with ");
        if (this.J8 != 0) goto L10;
        java.lang.String r1 = "no";
    L11:
        r0.append(r1);
        r0.append(" results");
        throw new abcd.an(r0.toString());
    L10:
        r1 = "multiple";
        goto L11
    L13:
        abcd.Rs r2 = this.J0[0];
        abcd.Qs r3 = r2.getType();
        abcd.Qs r4 = this.we.getType();
        if (r3 != r4) goto L21;
        if (r5 == false) goto L19;
        return this.we.j6(r2);
    L19:
        return this.we;
    L21:
        if (abcd.Um.j6(r4, r3) == true) goto L23;
        j6(r3, r4);
        throw null;
    L23:
        if (r4 != abcd.Qs.QX) goto L26;
        this.we = this.we.j6(r2);
    L26:
        return this.we;
    }

    @Override
    public final void DW(int r1) {
        this.v5 = r1;
    }

    @Override
    public final void DW(abcd.Om r3, int r4) {
        j6();
        this.DW[0] = r3.DW().get(r4);
        this.FH = 1;
        this.tp = r4;
    }

    protected final void DW(abcd.Rs r3) {
        if (r3 == null) goto L6;
        this.J0[0] = r3;
        this.J8 = 1;
        return;
    L6:
        throw new java.lang.NullPointerException("result == null");
    }

    protected final int EQ() {
        return this.tp;
    }

    protected final int FH() {
        return this.FH;
    }

    protected final abcd.Rs FH(int r2) {
        if (r2 >= this.FH) goto L9;
        return this.DW[r2];
    L7:
        throw new java.lang.IllegalArgumentException("n < 0");
    L9:
        throw new java.lang.IllegalArgumentException("n >= argCount");
    }

    protected final abcd.Rs Hw(int r2) {
        if (r2 >= this.J8) goto L9;
        return this.J0[r2];
    L7:
        throw new java.lang.IllegalArgumentException("n < 0");
    L9:
        throw new java.lang.IllegalArgumentException("n >= resultCount");
    }

    protected final void Hw() {
        this.J8 = 0;
    }

    protected final int VH() {
        return this.v5;
    }

    protected final abcd.Abstractms Zo() {
        return this.Zo;
    }

    protected final int gn() {
        return this.VH;
    }

    @Override
    public final void j6() {
        this.FH = 0;
        this.Hw = null;
        this.v5 = 0;
        this.Zo = null;
        this.VH = 0;
        this.gn = null;
        this.u7 = null;
        this.tp = -1;
        this.EQ = false;
        this.we = null;
        this.J8 = -1;
    }

    @Override
    public final void j6(int r1) {
        this.VH = r1;
    }

    @Override
    public final void j6(int r1, abcd.Qs r2, abcd.Vr r3) {
        this.we = abcd.bs.FH(r1, r2, r3);
    }

    protected final void j6(abcd.Om r3) {
        int r0 = this.J8;
        if (r0 < 0) goto L18;
        if (r0 != 0) goto L6;
        return;
    L6:
        int r1 = 0;
        if (this.we == null) goto L9;
        r3.DW().j6(DW(false));
        return;
    L9:
        abcd.Nm r4 = r3.FH();
    L11:
        if (r1 >= this.J8) goto L23;
        if (this.EQ == false) goto L15;
        r4.yS();
    L15:
        r4.j6(this.J0[r1]);
        r1 = r1 + 1;
        goto L11
    L23:
        return;
    L18:
        throw new abcd.an("results never set");
    }

    @Override
    public final void j6(abcd.Om r4, int r5) {
        abcd.Nm r6 = r4.FH();
        j6();
        if (r5 <= this.DW.length) goto L5;
        this.DW = new abcd.Rs[r5 + 10];
    L5:
        int r0 = r5 - 1;
    L6:
        if (r0 < 0) goto L8;
        this.DW[r0] = r6.er();
        r0 = r0 - 1;
        goto L6
    L8:
        this.FH = r5;
    }

    @Override
    public void j6(abcd.Om r5, abcd.Os r6) {
        abcd.Ps r7 = r6.VH();
        int r0 = r7.size();
        j6(r5, r0);
        int r8 = 0;
    L3:
        if (r8 >= r0) goto L9;
        if (abcd.Um.j6(r7.getType(r8), this.DW[r8]) == false) goto L8;
        r8 = r8 + 1;
        goto L3
    L8:
        throw new abcd.an("at stack depth " + ((r0 - 1) - r8) + ", expected type " + r7.getType(r8).aM() + " but found " + this.DW[r8].getType().aM());
    }

    @Override
    public final void j6(abcd.Om r4, abcd.Qs r5) {
        j6(r4, 1);
        if (abcd.Um.j6(r5, this.DW[0]) == false) goto L6;
        return;
    L6:
        throw new abcd.an("expected type " + r5.aM() + " but found " + this.DW[0].getType().aM());
    }

    @Override
    public final void j6(abcd.Om r4, abcd.Qs r5, abcd.Qs r6) {
        j6(r4, 2);
        if (abcd.Um.j6(r5, this.DW[0]) == false) goto L10;
        if (abcd.Um.j6(r6, this.DW[1]) == false) goto L8;
        return;
    L8:
        throw new abcd.an("expected type " + r6.aM() + " but found " + this.DW[1].getType().aM());
    L10:
        throw new abcd.an("expected type " + r5.aM() + " but found " + this.DW[0].getType().aM());
    }

    @Override
    public final void j6(abcd.Om r4, abcd.Qs r5, abcd.Qs r6, abcd.Qs r7) {
        j6(r4, 3);
        if (abcd.Um.j6(r5, this.DW[0]) == false) goto L14;
        if (abcd.Um.j6(r6, this.DW[1]) == false) goto L12;
        if (abcd.Um.j6(r7, this.DW[2]) == false) goto L10;
        return;
    L10:
        throw new abcd.an("expected type " + r7.aM() + " but found " + this.DW[2].getType().aM());
    L12:
        throw new abcd.an("expected type " + r6.aM() + " but found " + this.DW[1].getType().aM());
    L14:
        throw new abcd.an("expected type " + r5.aM() + " but found " + this.DW[0].getType().aM());
    }

    @Override
    public final void j6(abcd.Qs r1) {
        this.Hw = r1;
    }

    protected final void j6(abcd.Rs r3) {
        if (r3 == null) goto L6;
        abcd.Rs[] r0 = this.J0;
        int r1 = this.J8;
        r0[r1] = r3;
        this.J8 = r1 + 1;
        return;
    L6:
        throw new java.lang.NullPointerException("result == null");
    }

    @Override
    public final void j6(abcd.cn r2) {
        if (r2 == null) goto L6;
        this.gn = r2;
        return;
    L6:
        throw new java.lang.NullPointerException("cases == null");
    }

    @Override
    public final void j6(abcd.Abstractms r2) {
        if (r2 == null) goto L6;
        this.Zo = r2;
        return;
    L6:
        throw new java.lang.NullPointerException("cst == null");
    }

    @Override
    public final void j6(java.util.ArrayList<abcd.Abstractms> r1) {
        this.u7 = r1;
    }

    @Override
    public final void j6(boolean r1) {
        this.EQ = r1;
    }

    protected final java.util.ArrayList<abcd.Abstractms> tp() {
        return this.u7;
    }

    protected final abcd.Qs u7() {
        return this.Hw;
    }

    protected final abcd.cn v5() {
        return this.gn;
    }

    protected final int we() {
        int r0 = this.J8;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new abcd.an("results never set");
    }
}
