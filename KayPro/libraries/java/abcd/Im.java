package abcd;

public final class Im extends abcd.du {
    public Im(int r1) {
        super(r1);
    }

    public abcd.Hm get(int r1) {
        return (abcd.Hm) DW(r1);
    }

    public void j6(int r1, abcd.Hm r2) {
        super.j6(r1, r2);
    }

    public abcd.Hm v5(int r4) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = Hw(r4);
                    if (r0 < 0) { $pc0 = 7; continue $sw0; }
                    return get(r0);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("no such label: " + abcd.Yt.v5(r4));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
