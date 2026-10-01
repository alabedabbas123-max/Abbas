package abcd;

class qP implements abcd.InterfacehP {
    private static java.security.Permission DW;
    private static java.security.Permission FH;
    private static java.security.Permission Hw;
    private static java.security.Permission j6;
    private volatile javax.crypto.spec.DHParameterSpec VH;
    private java.lang.ThreadLocal Zo;
    private java.lang.ThreadLocal v5;

    static {
        j6 = new abcd.iP(abcd.pP.DW, "threadLocalEcImplicitlyCa");
        DW = new abcd.iP(abcd.pP.DW, "ecImplicitlyCa");
        FH = new abcd.iP(abcd.pP.DW, "threadLocalDhDefaultParams");
        Hw = new abcd.iP(abcd.pP.DW, "DhDefaultParams");
    }

    qP() {
        this.v5 = new java.lang.ThreadLocal();
        this.Zo = new java.lang.ThreadLocal();
    }

    @Override
    public javax.crypto.spec.DHParameterSpec j6() {
        javax.crypto.spec.DHParameterSpec r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (javax.crypto.spec.DHParameterSpec) this.Zo.get();
                    if (r0 == null) { $pc0 = 6; continue $sw0; }
                    return r0;
                }
                case 6: {
                    return this.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
