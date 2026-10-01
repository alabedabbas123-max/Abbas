package abcd;

public final class Es extends abcd.Cs {
    public static final abcd.Es DW = null;
    public static final abcd.Es FH = null;

    static {
        DW = j6(0);
        FH = j6(1);
    }

    private Es(long r1) {
        super(r1);
    }

    public static abcd.Es j6(long r1) {
        return new abcd.Es(r1);
    }

    @Override
    public java.lang.String Zo() {
        return "long";
    }

    @Override
    public java.lang.String aM() {
        return java.lang.Long.toString(lg());
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.gn;
    }

    public long rN() {
        return lg();
    }

    public java.lang.String toString() {
        long r0 = lg();
        return "long{0x" + abcd.Yt.DW(r0) + " / " + r0 + '}';
    }
}
