package abcd;

public class kF implements abcd.ME {
    private final abcd.ME DW;
    private final java.lang.String j6;

    public kF(java.lang.String r1, abcd.ME r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public abcd.yE DW() {
        return v5().DW();
    }

    @Override
    public abcd.yE FH() {
        return v5().FH();
    }

    @Override
    public boolean Hw() {
        return v5().Hw();
    }

    @Override
    public boolean Zo() {
        return true;
    }

    @Override
    public java.lang.String getName() {
        return this.j6;
    }

    @Override
    public abcd.ME getTarget() {
        return this.DW;
    }

    @Override
    public abcd.ME.a j6() {
        return abcd.ME.a.DW;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        abcd.ME r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("SymbolicRef[");
                    r1 = this;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1.Zo() == false) { $pc0 = 5; continue $sw0; }
                    r0.append(r1.getName());
                    r0.append(" -> ");
                    r1 = r1.getTarget();
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    r0.append(r1.getName());
                    r0.append('=');
                    r0.append(abcd.yE.j6(r1.DW()));
                    r0.append("]");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.ME v5() {
        abcd.ME r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = getTarget();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.Zo() == false) { $pc1 = 5; continue $sw1; }
                    r0 = r0.getTarget();
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
