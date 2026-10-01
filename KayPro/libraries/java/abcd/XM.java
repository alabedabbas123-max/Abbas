package abcd;

public class XM extends abcd.AbstractyL implements abcd.InterfacepL {
    private abcd.InterfaceqL j6;

    public XM(abcd.AL r3) {
        this.j6 = new abcd.yM(false, 0, r3);
    }

    public XM(abcd.EL r1) {
        this.j6 = r1;
    }

    public XM(abcd.VM r1) {
        this.j6 = r1;
    }

    public static abcd.XM j6(java.lang.Object r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == null) { $pc0 = 21; continue $sw0; }
                    if ((r3 instanceof abcd.XM) == true) { $pc0 = 21; continue $sw0; }
                    if ((r3 instanceof abcd.VM) == false) { $pc0 = 11; continue $sw0; }
                    return new abcd.XM((abcd.VM) r3);
                }
                case 11: {
                    if ((r3 instanceof abcd.AL) == false) { $pc0 = 15; continue $sw0; }
                    return new abcd.XM((abcd.AL) r3);
                }
                case 15: {
                    if ((r3 instanceof abcd.EL) == false) { $pc0 = 19; continue $sw0; }
                    return new abcd.XM((abcd.EL) r3);
                }
                case 19: {
                    throw new java.lang.IllegalArgumentException("Illegal object in SignerIdentifier: " + r3.getClass().getName());
                }
                case 21: {
                    return (abcd.XM) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        return this.j6.DW();
    }

    public boolean v5() {
        return this.j6 instanceof abcd.LL;
    }
}
