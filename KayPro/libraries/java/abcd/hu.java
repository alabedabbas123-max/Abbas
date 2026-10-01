package abcd;

public class hu {
    private boolean j6;

    public hu() {
        this.j6 = true;
    }

    public hu(boolean r1) {
        this.j6 = r1;
    }

    public final void J8() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == false) { $pc0 = 6; continue $sw0; }
                    return;
                }
                case 6: {
                    throw new abcd.iu("immutable instance");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final boolean VH() {
        return !this.j6;
    }

    public final void Ws() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 == true) { $pc1 = 6; continue $sw1; }
                    return;
                }
                case 6: {
                    throw new abcd.iu("mutable instance");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final boolean Zo() {
        return this.j6;
    }

    public void we() {
        this.j6 = false;
    }
}
