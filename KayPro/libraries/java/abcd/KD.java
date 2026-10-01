package abcd;

public abstract class KD<T extends abcd.LD> {
    private abcd.UE j6;

    public KD() {
    }

    public abstract java.lang.Class<T> j6();

    public abstract void j6(T r1);

    public void j6(abcd.UE r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 != null) { $pc0 = 6; continue $sw0; }
                    this.j6 = r2;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = getClass().getSimpleName();
                    if (this.j6 != null) { $pc1 = 6; continue $sw1; }
                    return r0;
                }
                case 6: {
                    return java.lang.String.valueOf(r0) + "[" + this.j6 + "]";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
