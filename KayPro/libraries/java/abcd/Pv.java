package abcd;

class Pv implements java.lang.Runnable {
    final abcd.Qv.a DW;
    final com.appfour.backbone.api.objects.UserActionWindow j6;

    Pv(abcd.Qv.a r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void run() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.Qv.a.j6(this.DW) == false) { $pc0 = 9; continue $sw0; }
                    abcd.Qv.a.j6(this.DW, false);
                    if (abcd.Qv.a.j6(this.j6.getWindowView()) == false) { $pc0 = 7; continue $sw0; }
                    abcd.Qv.e.DW(this.j6, abcd.Qv.a.DW(this.DW), abcd.Qv.a.FH(this.DW));
                    return;
                }
                case 7: {
                    abcd.Qv.e.j6(this.j6, abcd.Qv.a.DW(this.DW), abcd.Qv.a.FH(this.DW));
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
