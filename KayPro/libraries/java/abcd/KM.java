package abcd;

class KM implements java.util.Enumeration {
    private java.lang.Object DW;
    private abcd.C1419vL j6;

    public KM(byte[] r3) {
        this.j6 = new abcd.C1419vL(r3, true);
        this.DW = j6();
    }

    private java.lang.Object j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return this.j6.Hw();
                }
                case 4: {
                    e = $ex0;
                    throw new abcd.DL("malformed DER construction: " + e, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean hasMoreElements() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW == null) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object nextElement() {
        java.lang.Object r0 = this.DW;
        this.DW = j6();
        return r0;
    }
}
