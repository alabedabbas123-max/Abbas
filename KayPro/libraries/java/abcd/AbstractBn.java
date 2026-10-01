package abcd;

public abstract class AbstractBn implements abcd.Interfacetn {
    private final int DW;
    private final abcd.Hs FH;
    private final abcd.Interfacepn Hw;
    private final abcd.Ks j6;

    public AbstractBn(abcd.Ks r1, int r2, abcd.Hs r3, abcd.Interfacepn r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 13; continue $sw0; }
                    if (r3 == null) { $pc0 = 11; continue $sw0; }
                    if (r4 == null) { $pc0 = 9; continue $sw0; }
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = r4;
                    return;
                }
                case 9: {
                    throw new java.lang.NullPointerException("attributes == null");
                }
                case 11: {
                    throw new java.lang.NullPointerException("nat == null");
                }
                case 13: {
                    throw new java.lang.NullPointerException("definingClass == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final abcd.Ks DW() {
        return this.j6;
    }

    @Override
    public final abcd.Hs FH() {
        return this.FH;
    }

    @Override
    public final abcd.Js Hw() {
        return this.FH.VH();
    }

    @Override
    public final abcd.Interfacepn getAttributes() {
        return this.Hw;
    }

    @Override
    public final abcd.Js getName() {
        return this.FH.J8();
    }

    @Override
    public final int j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(getClass().getName());
        r0.append('{');
        r0.append(this.FH.aM());
        r0.append('}');
        return r0.toString();
    }
}
