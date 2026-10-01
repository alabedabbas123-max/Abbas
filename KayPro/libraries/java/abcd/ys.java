package abcd;

public final class ys extends abcd.Bs {
    private static final abcd.ys[] DW = null;
    public static final abcd.ys FH = null;
    public static final abcd.ys Hw = null;
    public static final abcd.ys VH = null;
    public static final abcd.ys Zo = null;
    public static final abcd.ys gn = null;
    public static final abcd.ys u7 = null;
    public static final abcd.ys v5 = null;

    static {
        DW = new abcd.ys[511];
        FH = j6(-1);
        Hw = j6(0);
        v5 = j6(1);
        Zo = j6(2);
        VH = j6(3);
        gn = j6(4);
        u7 = j6(5);
    }

    private ys(int r1) {
        super(r1);
    }

    public static abcd.ys j6(int r3) {
        abcd.ys[] r1 = null;
        int r0 = 0;
        abcd.ys r2 = null;
        abcd.ys r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = DW;
                    r0 = (Integer.MAX_VALUE & r3) % r1.length;
                    r2 = r1[r0];
                    if (r2 != null) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r4 = new abcd.ys(r3);
                    DW[r0] = r4;
                    return r4;
                }
                case 5: {
                    if (r2.rN() != r3) { $pc0 = 7; continue $sw0; }
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo() {
        return "int";
    }

    @Override
    public java.lang.String aM() {
        return java.lang.Integer.toString(Ws());
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.VH;
    }

    public int rN() {
        return Ws();
    }

    public java.lang.String toString() {
        int r0 = Ws();
        return "int{0x" + abcd.Yt.gn(r0) + " / " + r0 + '}';
    }
}
