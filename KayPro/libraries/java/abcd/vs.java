package abcd;

public final class vs extends abcd.Fs {
    private abcd.ws FH;

    public vs(abcd.Hs r3) {
        super(new abcd.Ks(r3.we()), r3);
        this.FH = null;
    }

    public abcd.ws J8() {
        if (this.FH != null) goto L6;
        this.FH = new abcd.ws(VH(), we());
    L6:
        return this.FH;
    }

    @Override
    public java.lang.String Zo() {
        return "enum";
    }

    @Override
    public abcd.Qs getType() {
        return VH().VH();
    }
}
