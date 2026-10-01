package abcd;

public class FN extends abcd.AbstractyL implements abcd.InterfacepL {
    abcd.EL j6;

    public FN(abcd.EL r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof abcd.zM) == false) { $pc0 = 5; continue $sw0; }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    this.j6 = r2;
                    return;
                }
                case 5: {
                    if ((r2 instanceof abcd.jM) == true) { $pc0 = 9; continue $sw0; }
                    throw new java.lang.IllegalArgumentException("unknown object passed to Time");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public FN(java.util.Date r6) {
        java.util.SimpleTimeZone r0 = null;
        java.text.SimpleDateFormat r3 = null;
        java.lang.String r7 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.SimpleTimeZone(0, "Z");
                    r3 = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
                    r3.setTimeZone(r0);
                    r7 = java.lang.String.valueOf(r3.format(r6)) + "Z";
                    r1 = java.lang.Integer.parseInt(r7.substring(0, 4));
                    if (r1 >= 1950) { $pc1 = 5; continue $sw1; }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    this.j6 = new abcd.jM(r7);
                    return;
                }
                case 5: {
                    if (r1 > 2049) { $pc1 = 8; continue $sw1; }
                    this.j6 = new abcd.zM(r7.substring(2));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.FN j6(java.lang.Object r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == null) { $pc2 = 17; continue $sw2; }
                    if ((r3 instanceof abcd.FN) == true) { $pc2 = 17; continue $sw2; }
                    if ((r3 instanceof abcd.zM) == false) { $pc2 = 11; continue $sw2; }
                    return new abcd.FN((abcd.zM) r3);
                }
                case 11: {
                    if ((r3 instanceof abcd.jM) == false) { $pc2 = 15; continue $sw2; }
                    return new abcd.FN((abcd.jM) r3);
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("unknown object in factory: " + r3.getClass().getName());
                }
                case 17: {
                    return (abcd.FN) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        return this.j6;
    }

    public java.lang.String Zo() {
        abcd.EL r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6;
                    if ((r0 instanceof abcd.zM) == false) { $pc3 = 7; continue $sw3; }
                    return ((abcd.zM) r0).tp();
                }
                case 7: {
                    return ((abcd.jM) r0).tp();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return Zo();
    }

    public java.util.Date v5() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 8;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    e = $ex4;
                    throw new java.lang.IllegalStateException("invalid date string: " + e.getMessage());
                }
                case 3: {
                    if ((this.j6 instanceof abcd.zM) == false) { $pc4 = 7; continue $sw4; }
                    return ((abcd.zM) this.j6).u7();
                }
                case 7: {
                    return ((abcd.jM) this.j6).u7();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
