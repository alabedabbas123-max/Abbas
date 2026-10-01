package abcd;

final class Lx extends abcd.Ix {
    private final abcd.Jx DW;

    Lx() {
        this.DW = new abcd.Jx();
    }

    @Override
    public final void j6(java.lang.Throwable r3, java.lang.Throwable r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 == r3) { $pc0 = 9; continue $sw0; }
                    if (r4 == null) { $pc0 = 7; continue $sw0; }
                    this.DW.j6(r3, true).add(r4);
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("The suppressed exception cannot be null.");
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
