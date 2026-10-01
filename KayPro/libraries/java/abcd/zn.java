package abcd;

public final class zn extends abcd.AbstractBn implements abcd.Interfacern {
    public zn(abcd.Ks r1, int r2, abcd.Hs r3, abcd.Interfacepn r4) {
        super(r1, r2, r3, r4);
    }

    @Override
    public abcd.Ms Zo() {
        abcd.km r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (abcd.km) getAttributes().j6("ConstantValue");
                    if (r0 != null) { $pc0 = 7; continue $sw0; }
                    return null;
                }
                case 7: {
                    return r0.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
