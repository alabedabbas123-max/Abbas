package abcd;

public class MH extends abcd.CI {
    private abcd.yE J0;
    private int J8;
    private abcd.CH.a QX;
    private int Ws;

    public MH(abcd.YD r1, int r2) {
        super(r1);
        this.J8 = r2 << 5;
    }

    public MH(abcd.AbstractiG r2) {
        this(r2, r2.aM());
    }

    public boolean BT() {
        if (this.J0 == null) goto L6;
        return true;
    L6:
        return false;
    }

    void DW(abcd.yE r1) {
        this.J0 = r1;
    }

    void FH(int r1) {
        this.Ws = r1;
    }

    void Hw(int r2) {
        this.J8 = (r2 << 12) | (this.J8 & 4095);
    }

    abcd.CH.a KD() {
        abcd.CH.a r0 = this.QX;
        if (r0 == null) goto L5;
        this.QX = null;
    L5:
        return r0;
    }

    protected void Mr() {
        this.J8 &= -3;
    }

    boolean P8() {
        if ((this.J8 & 8) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    void SI() {
        this.J8 |= 1;
    }

    int U2() {
        return this.Ws;
    }

    void Zo(int r1) {
        DW(r1);
    }

    public abcd.MH a8() {
        abcd.yE r0 = this.J0;
        if ((r0 instanceof abcd.MH) == true) goto L5;
        return null;
    L5:
        return (abcd.MH) r0;
    }

    void cn() {
        this.J8 |= 2;
    }

    public boolean ei() {
        if ((this.J8 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    int er() {
        return this.Ws;
    }

    int gW() {
        return aM();
    }

    void j3() {
        this.J0 = null;
        abcd.CH.a r1 = this.QX;
        if (r1 == null) goto L6;
        r1.clear();
        this.QX.enqueue();
        this.QX = null;
        return;
    }

    void j6(abcd.CH.a r1) {
        this.QX = r1;
    }

    public void j6(abcd.UH r1) {
    }

    void j6(boolean r1) {
        if (r1 == false) goto L4;
        this.J8 |= 4;
        return;
    L4:
        this.J8 &= -5;
    }

    public abcd.yE lg() {
        return this.J0;
    }

    public boolean nw() {
        if (getOffset() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    int rN() {
        return this.J8 >>> 12;
    }

    void ro() {
        this.J8 |= 8;
    }

    boolean sh() {
        if ((this.J8 & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("ObjectToPack[");
        r0.append(abcd.hE.DW(yS()));
        r0.append(" ");
        r0.append(we());
        if (sh() == false) goto L6;
        r0.append(" wantWrite");
    L6:
        if (ei() == false) goto L9;
        r0.append(" reuseAsIs");
    L9:
        if (vy() == false) goto L12;
        r0.append(" doNotDelta");
    L12:
        if (P8() == false) goto L15;
        r0.append(" edge");
    L15:
        if (rN() <= 0) goto L18;
        r0.append(" depth=" + rN());
    L18:
        if (BT() == false) goto L24;
        if (a8() == null) goto L22;
        r0.append(" base=inpack:" + a8().we());
        goto L24
    L22:
        r0.append(" base=edge:" + lg().we());
    L24:
        if (nw() == false) goto L26;
        r0.append(" offset=" + getOffset());
    L26:
        r0.append("]");
        return r0.toString();
    }

    void v5(int r1) {
        this.Ws = r1;
    }

    boolean vy() {
        if ((this.J8 & 4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public int yS() {
        return (this.J8 >> 5) & 7;
    }
}
