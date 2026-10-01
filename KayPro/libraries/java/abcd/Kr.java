package abcd;

public final class Kr extends abcd.Xt {
    public static final abcd.Kr FH = null;

    static {
        FH = new abcd.Kr(0);
    }

    public Kr(int r1) {
        super(r1);
    }

    public static abcd.Kr j6(abcd.Kr r5, abcd.Kr r6) {
        int r0 = 0;
        abcd.Kr r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.size();
                    if (r0 != r6.size()) { $pc0 = 10; continue $sw0; }
                    r1 = new abcd.Kr(r0);
                    r2 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r2 >= r0) { $pc0 = 7; continue $sw0; }
                    r1.j6(r2, abcd.Jr.j6(r5.get(r2), r6.get(r2)));
                    r2 = r2 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 7: {
                    r1.we();
                    return r1;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("list1.size() != list2.size()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Jr get(int r1) {
        return (abcd.Jr) DW(r1);
    }

    public void j6(int r1, abcd.Jr r2) {
        r2.Ws();
        j6(r1, r2);
    }
}
