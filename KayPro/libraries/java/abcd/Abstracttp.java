package abcd;

public abstract class Abstracttp extends abcd.Abstractup {
    private final abcd.Ks DW;

    public Abstracttp(abcd.Ks r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.Ks aM() {
        return this.DW;
    }

    @Override
    public void j6(abcd.jp r2) {
        r2.Ws().DW(this.DW);
    }
}
