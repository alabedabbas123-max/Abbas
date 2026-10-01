package abcd;

public abstract class GB<C extends abcd.AbstractCallabledB, T> extends dB<T> {
    protected abcd.AbstractkI FH;
    protected int Hw;
    protected abcd.HB v5;

    protected GB(abcd.UE r1) {
        super(r1);
    }

    protected final C FH() {
        return this;
    }

    public C j6(int r1) {
        this.Hw = r1;
        FH();
        return this;
    }

    protected C j6(abcd.GB r2) {
        r2.j6(this.FH);
        r2.j6(this.Hw);
        r2.j6(this.v5);
        FH();
        return this;
    }

    public C j6(abcd.HB r1) {
        this.v5 = r1;
        FH();
        return this;
    }

    protected C j6(abcd.AbstractjJ r2) {
        abcd.AbstractkI r0 = this.FH;
        if (r0 == null) goto L5;
        r2.j6(r0);
    L5:
        r2.j6(this.Hw);
        abcd.HB r1 = this.v5;
        if (r1 == null) goto L8;
        r1.j6(r2);
    L8:
        FH();
        return this;
    }

    public C j6(abcd.AbstractkI r1) {
        this.FH = r1;
        FH();
        return this;
    }
}
