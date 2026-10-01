package abcd;

public final class xs extends abcd.Bs {
    public static final abcd.xs DW = null;
    public static final abcd.xs FH = null;
    public static final abcd.xs Hw = null;

    static {
        DW = j6(java.lang.Float.floatToIntBits(0.0f));
        FH = j6(java.lang.Float.floatToIntBits(1.0f));
        Hw = j6(java.lang.Float.floatToIntBits(2.0f));
    }

    private xs(int r1) {
        super(r1);
    }

    public static abcd.xs j6(int r1) {
        return new abcd.xs(r1);
    }

    @Override
    public java.lang.String Zo() {
        return "float";
    }

    @Override
    public java.lang.String aM() {
        return java.lang.Float.toString(java.lang.Float.intBitsToFloat(Ws()));
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.Zo;
    }

    public java.lang.String toString() {
        int r0 = Ws();
        return "float{0x" + abcd.Yt.gn(r0) + " / " + java.lang.Float.intBitsToFloat(r0) + '}';
    }
}
