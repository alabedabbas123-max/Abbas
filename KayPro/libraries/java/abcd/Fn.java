package abcd;

public class Fn {
    public int j6;

    public Fn() {
        this.j6 = 14;
    }

    public java.lang.String DW() {
        return abcd.En.j6(this.j6);
    }

    public boolean j6() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 < 14) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
