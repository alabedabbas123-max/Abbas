package abcd;

public final class us extends abcd.Cs {
    public static final abcd.us DW = null;
    public static final abcd.us FH = null;

    static {
        DW = new abcd.us(java.lang.Double.doubleToLongBits(0.0d));
        FH = new abcd.us(java.lang.Double.doubleToLongBits(1.0d));
    }

    private us(long r1) {
        super(r1);
    }

    public static abcd.us j6(long r1) {
        return new abcd.us(r1);
    }

    @Override
    public java.lang.String Zo() {
        return "double";
    }

    @Override
    public java.lang.String aM() {
        return java.lang.Double.toString(java.lang.Double.longBitsToDouble(lg()));
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.v5;
    }

    public java.lang.String toString() {
        long r0 = lg();
        return "double{0x" + abcd.Yt.DW(r0) + " / " + java.lang.Double.longBitsToDouble(r0) + '}';
    }
}
