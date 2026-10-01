package abcd;

public final class ts extends abcd.Bs {
    public static final abcd.ts DW = null;

    static {
        DW = j6(0);
    }

    private ts(char r1) {
        super(r1);
    }

    public static abcd.ts j6(char r1) {
        return new abcd.ts(r1);
    }

    public static abcd.ts j6(int r3) {
        char r0 = (char) r3;
        if (r0 != r3) goto L7;
        return j6(r0);
    L7:
        throw new java.lang.IllegalArgumentException("bogus char value: " + r3);
    }

    @Override
    public java.lang.String Zo() {
        return "char";
    }

    @Override
    public java.lang.String aM() {
        return java.lang.Integer.toString(Ws());
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.Hw;
    }

    public java.lang.String toString() {
        int r0 = Ws();
        return "char{0x" + abcd.Yt.v5(r0) + " / " + r0 + '}';
    }
}
