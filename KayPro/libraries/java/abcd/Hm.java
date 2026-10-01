package abcd;

public final class Hm implements abcd.Interfacecu {
    private final int DW;
    private final int FH;
    private final abcd.au Hw;
    private final int j6;
    private final abcd.Jm v5;

    public Hm(int r4, int r5, int r6, abcd.au r7, abcd.Jm r8) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 < 0) { $pc0 = 26; continue $sw0; }
                    if (r5 < 0) { $pc0 = 24; continue $sw0; }
                    if (r6 <= r5) { $pc0 = 22; continue $sw0; }
                    if (r7 == null) { $pc0 = 20; continue $sw0; }
                    r0 = r7.size();
                    r1 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r1 >= r0) { $pc0 = 14; continue $sw0; }
                    if (r7.get(r1) < 0) { $pc0 = 13; continue $sw0; }
                    r1 = r1 + 1;
                    { $pc0 = 8; continue $sw0; }
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException("successors[" + r1 + "] == " + r7.get(r1));
                }
                case 14: {
                    if (r8 == null) { $pc0 = 18; continue $sw0; }
                    this.j6 = r4;
                    this.DW = r5;
                    this.FH = r6;
                    this.Hw = r7;
                    this.v5 = r8;
                    return;
                }
                case 18: {
                    throw new java.lang.NullPointerException("catches == null");
                }
                case 20: {
                    throw new java.lang.NullPointerException("targets == null");
                }
                case 22: {
                    throw new java.lang.IllegalArgumentException("end <= start");
                }
                case 24: {
                    throw new java.lang.IllegalArgumentException("start < 0");
                }
                case 26: {
                    throw new java.lang.IllegalArgumentException("label < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int DW() {
        return this.j6;
    }

    public int FH() {
        return this.FH;
    }

    public int Hw() {
        return this.DW;
    }

    public abcd.Jm j6() {
        return this.v5;
    }

    public java.lang.String toString() {
        return '{' + abcd.Yt.v5(this.j6) + ": " + abcd.Yt.v5(this.DW) + ".." + abcd.Yt.v5(this.FH) + '}';
    }

    public abcd.au v5() {
        return this.Hw;
    }
}
