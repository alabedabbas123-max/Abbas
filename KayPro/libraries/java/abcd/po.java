package abcd;

public final class po extends abcd.AbstractZn {
    private abcd.Sn v5;

    public po(abcd.Xn r1, abcd.hs r2, abcd.cs r3, abcd.Sn r4) {
        super(r1, r2, r3);
        if (r4 == null) goto L7;
        this.v5 = r4;
        return;
    L7:
        throw new java.lang.NullPointerException("target == null");
    }

    public int J0() {
        return this.v5.FH();
    }

    public int J8() {
        return this.v5.FH() - FH();
    }

    public boolean Ws() {
        if (u7() == true) goto L5;
    L7:
        return false;
    L5:
        if (this.v5.u7() == false) goto L7;
        return true;
    }

    @Override
    public abcd.AbstractVn j6(abcd.Xn r5) {
        return new abcd.po(r5, VH(), gn(), this.v5);
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r5) {
        return new abcd.po(Zo(), VH(), r5, this.v5);
    }

    public abcd.po j6(abcd.Sn r5) {
        return new abcd.po(Zo().Zo(), VH(), gn(), r5);
    }

    @Override
    protected java.lang.String j6() {
        abcd.Sn r0 = this.v5;
        if (r0 != null) goto L7;
        return "????";
    L7:
        return r0.EQ();
    }

    public abcd.Sn we() {
        return this.v5;
    }
}
