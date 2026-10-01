package abcd;

public final class GC<S extends abcd.CC> extends abcd.CC {
    final int DW;
    private final int FH;
    final S j6;

    public GC(S r1, int r2, int r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3 - r2;
    }

    public static <S extends abcd.CC> GC<S> DW(S r2, abcd.jC r3) {
        return new abcd.GC(r2, r3.FH, r3.Hw);
    }

    public static <S extends abcd.CC> GC<S> j6(S r2, abcd.jC r3) {
        return new abcd.GC(r2, r3.j6, r3.DW);
    }

    public static <S extends abcd.CC> abcd.kC j6(abcd.kC r2, GC<S> r3, GC<S> r4) {
        java.util.Iterator<abcd.jC> r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r2.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 5; continue $sw0; }
                    j6(r0.next(), r3, r4);
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <S extends abcd.CC> void j6(abcd.jC r1, GC<S> r2, GC<S> r3) {
        int r0 = r1.j6;
        int r4 = r2.DW;
        r1.j6 = r0 + r4;
        r1.DW += r4;
        int r5 = r1.FH;
        int r6 = r3.DW;
        r1.FH = r5 + r6;
        r1.Hw += r6;
    }

    @Override
    public int j6() {
        return this.FH;
    }
}
