package abcd;

final class Kx extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int j6;

    public Kx(java.lang.Throwable r1, java.lang.ref.ReferenceQueue<java.lang.Throwable> r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2);
                    if (r1 == null) { $pc0 = 7; continue $sw0; }
                    this.j6 = java.lang.System.identityHashCode(r1);
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("The referent cannot be null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final boolean equals(java.lang.Object r5) {
        abcd.Kx r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5 != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    return false;
                }
                case 5: {
                    if (r5.getClass() != abcd.Kx.class) { $pc1 = 15; continue $sw1; }
                    if (this != r5) { $pc1 = 10; continue $sw1; }
                    return true;
                }
                case 10: {
                    r6 = (abcd.Kx) r5;
                    if (this.j6 != r6.j6) { $pc1 = 15; continue $sw1; }
                    if (get() != r6.get()) { $pc1 = 15; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int hashCode() {
        return this.j6;
    }
}
