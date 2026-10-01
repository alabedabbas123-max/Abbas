package abcd;

public final class ss extends abcd.Bs {
    public static final abcd.ss DW = null;

    static {
        DW = j6((byte) 0);
    }

    private ss(byte r1) {
        super(r1);
    }

    public static abcd.ss j6(byte r1) {
        return new abcd.ss(r1);
    }

    public static abcd.ss j6(int r3) {
        byte r0 = (byte) r3;
        if (r0 != r3) goto L7;
        return j6(r0);
    L7:
        throw new java.lang.IllegalArgumentException("bogus byte value: " + r3);
    }

    @Override
    public java.lang.String Zo() {
        return "byte";
    }

    @Override
    public java.lang.String aM() {
        return java.lang.Integer.toString(Ws());
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.FH;
    }

    public java.lang.String toString() {
        int r0 = Ws();
        return "byte{0x" + abcd.Yt.Hw(r0) + " / " + r0 + '}';
    }
}
