package abcd;

public final class Is extends abcd.Bs {
    public static final abcd.Is DW = null;

    static {
        DW = j6(0);
    }

    private Is(short r1) {
        super(r1);
    }

    public static abcd.Is j6(int r3) {
        short r0 = (short) r3;
        if (r0 != r3) goto L7;
        return j6(r0);
    L7:
        throw new java.lang.IllegalArgumentException("bogus short value: " + r3);
    }

    public static abcd.Is j6(short r1) {
        return new abcd.Is(r1);
    }

    @Override
    public java.lang.String Zo() {
        return "short";
    }

    @Override
    public java.lang.String aM() {
        return java.lang.Integer.toString(Ws());
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.u7;
    }

    public java.lang.String toString() {
        int r0 = Ws();
        return "short{0x" + abcd.Yt.v5(r0) + " / " + r0 + '}';
    }
}
