package abcd;

public class DM extends abcd.CL {
    public DM(java.io.OutputStream r1) {
        super(r1);
    }

    @Override
    public void j6(abcd.InterfaceqL r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 6; continue $sw0; }
                    r2.DW().gn().j6(this);
                    return;
                }
                case 6: {
                    throw new java.io.IOException("null object detected");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
