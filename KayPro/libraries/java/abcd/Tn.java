package abcd;

public final class Tn extends abcd.AbstractZn {
    private int VH;
    private int Zo;
    private final abcd.Abstractms v5;

    public Tn(abcd.Xn r1, abcd.hs r2, abcd.cs r3, abcd.Abstractms r4) {
        super(r1, r2, r3);
        if (r4 == null) goto L7;
        this.v5 = r4;
        this.Zo = -1;
        this.VH = -1;
        return;
    L7:
        throw new java.lang.NullPointerException("constant == null");
    }

    public void FH(int r2) {
        if (r2 < 0) goto L10;
        if (this.VH >= 0) goto L8;
        this.VH = r2;
        return;
    L8:
        throw new java.lang.RuntimeException("class index already set");
    L10:
        throw new java.lang.IllegalArgumentException("index < 0");
    }

    public void Hw(int r2) {
        if (r2 < 0) goto L10;
        if (this.Zo >= 0) goto L8;
        this.Zo = r2;
        return;
    L8:
        throw new java.lang.RuntimeException("index already set");
    L10:
        throw new java.lang.IllegalArgumentException("index < 0");
    }

    public int J0() {
        int r0 = this.Zo;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new java.lang.RuntimeException("index not yet set for " + this.v5);
    }

    public boolean J8() {
        if (this.Zo < 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public abcd.AbstractVn j6(abcd.Xn r5) {
        abcd.Tn r0 = new abcd.Tn(r5, VH(), gn(), this.v5);
        int r6 = this.Zo;
        if (r6 < 0) goto L5;
        r0.Hw(r6);
    L5:
        int r7 = this.VH;
        if (r7 < 0) goto L8;
        r0.FH(r7);
    L8:
        return r0;
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r5) {
        abcd.Tn r0 = new abcd.Tn(Zo(), VH(), r5, this.v5);
        int r6 = this.Zo;
        if (r6 < 0) goto L5;
        r0.Hw(r6);
    L5:
        int r7 = this.VH;
        if (r7 < 0) goto L8;
        r0.FH(r7);
    L8:
        return r0;
    }

    @Override
    protected java.lang.String j6() {
        return this.v5.aM();
    }

    public abcd.Abstractms we() {
        return this.v5;
    }
}
