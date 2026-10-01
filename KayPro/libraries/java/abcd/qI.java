package abcd;

public class qI extends abcd.AbstractzI {
    private final java.util.List<abcd.oI> v5;

    qI() {
        this.v5 = new java.util.ArrayList();
    }

    void j6(abcd.oI r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.DW == true) { $pc0 = 6; continue $sw0; }
                    this.v5.add(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
