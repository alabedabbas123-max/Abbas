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
        short r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (short) r3;
                    if (r0 != r3) { $pc0 = 7; continue $sw0; }
                    return j6(r0);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("bogus short value: " + r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
