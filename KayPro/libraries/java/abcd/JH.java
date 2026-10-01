package abcd;

class JH {
    byte[] DW;
    abcd.EH FH;
    abcd.MH j6;

    JH() {
    }

    boolean DW() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 != null) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int FH() {
        return this.j6.gW();
    }

    int Hw() {
        return this.j6.yS();
    }

    int j6() {
        return this.j6.rN();
    }

    void j6(abcd.MH r1) {
        this.j6 = r1;
        this.FH = null;
        this.DW = null;
    }
}
